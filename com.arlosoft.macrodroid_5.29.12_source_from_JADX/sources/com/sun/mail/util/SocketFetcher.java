package com.sun.mail.util;

import androidx.webkit.ProxyConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class SocketFetcher {
    private static MailLogger logger = new MailLogger(SocketFetcher.class, "socket", "DEBUG SocketFetcher", PropUtil.getBooleanSystemProperty("mail.socket.debug", false), System.out);

    private SocketFetcher() {
    }

    private static void checkServerIdentity(String str, SSLSocket sSLSocket) throws IOException {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            if (peerCertificates == null || peerCertificates.length <= 0 || !(peerCertificates[0] instanceof X509Certificate) || !matchCert(str, (X509Certificate) peerCertificates[0])) {
                sSLSocket.close();
                throw new IOException("Can't verify identity of server: " + str);
            }
        } catch (SSLPeerUnverifiedException e) {
            sSLSocket.close();
            IOException iOException = new IOException("Can't verify identity of server: " + str);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private static IOException cleanupAndThrow(Socket socket, IOException iOException) {
        try {
            socket.close();
        } catch (Throwable th) {
            if (isRecoverable(th)) {
                iOException.addSuppressed(th);
            } else {
                th.addSuppressed(iOException);
                if (th instanceof Error) {
                    throw ((Error) th);
                } else if (th instanceof RuntimeException) {
                    throw th;
                } else {
                    throw new RuntimeException("unexpected exception", th);
                }
            }
        }
        return iOException;
    }

    private static void configureSSLSocket(Socket socket, String str, Properties properties, String str2, SocketFactory socketFactory) throws IOException {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String property = properties.getProperty(str2 + ".ssl.protocols", (String) null);
            if (property != null) {
                sSLSocket.setEnabledProtocols(stringArray(property));
            } else {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                if (logger.isLoggable(Level.FINER)) {
                    MailLogger mailLogger = logger;
                    mailLogger.finer("SSL enabled protocols before " + Arrays.asList(enabledProtocols));
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < enabledProtocols.length; i++) {
                    if (enabledProtocols[i] != null && !enabledProtocols[i].startsWith(SSLSocketFactory.SSL)) {
                        arrayList.add(enabledProtocols[i]);
                    }
                }
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            String property2 = properties.getProperty(str2 + ".ssl.ciphersuites", (String) null);
            if (property2 != null) {
                sSLSocket.setEnabledCipherSuites(stringArray(property2));
            }
            if (logger.isLoggable(Level.FINER)) {
                MailLogger mailLogger2 = logger;
                mailLogger2.finer("SSL enabled protocols after " + Arrays.asList(sSLSocket.getEnabledProtocols()));
                MailLogger mailLogger3 = logger;
                mailLogger3.finer("SSL enabled ciphers after " + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            }
            sSLSocket.startHandshake();
            if (PropUtil.getBooleanProperty(properties, str2 + ".ssl.checkserveridentity", false)) {
                checkServerIdentity(str, sSLSocket);
            }
            if ((socketFactory instanceof MailSSLSocketFactory) && !((MailSSLSocketFactory) socketFactory).isServerTrusted(str, sSLSocket)) {
                throw cleanupAndThrow(sSLSocket, new IOException("Server is not trusted: " + str));
            }
        }
    }

    private static Socket createSocket(InetAddress inetAddress, int i, String str, int i2, int i3, int i4, Properties properties, String str2, SocketFactory socketFactory, boolean z) throws IOException {
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        Socket socket;
        String str6;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        int i7;
        int i8;
        String str7;
        int i9;
        int i10;
        InetAddress inetAddress2 = inetAddress;
        int i11 = i;
        String str8 = str;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        Properties properties2 = properties;
        String str9 = str2;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = socketFactory;
        boolean z2 = z;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("create socket: prefix " + str9 + ", localaddr " + inetAddress2 + ", localport " + i11 + ", host " + str8 + ", port " + i12 + ", connection timeout " + i13 + ", timeout " + i14 + ", socket factory " + sSLSocketFactory2 + ", useSSL " + z2);
        }
        String property = properties2.getProperty(str9 + ".proxy.host", (String) null);
        String property2 = properties2.getProperty(str9 + ".proxy.user", (String) null);
        String property3 = properties2.getProperty(str9 + ".proxy.password", (String) null);
        int i15 = 1080;
        if (property != null) {
            int indexOf = property.indexOf(58);
            if (indexOf >= 0) {
                try {
                    i9 = Integer.parseInt(property.substring(indexOf + 1));
                    i10 = 0;
                } catch (NumberFormatException unused) {
                    i10 = 0;
                    i9 = 80;
                }
                property = property.substring(i10, indexOf);
                i8 = i9;
            } else {
                i8 = 80;
            }
            int intProperty = PropUtil.getIntProperty(properties2, str9 + ".proxy.port", i8);
            String str10 = "Using web proxy host, port: " + property + ", " + intProperty;
            if (logger.isLoggable(Level.FINER)) {
                MailLogger mailLogger = logger;
                StringBuilder sb = new StringBuilder();
                str7 = str10;
                sb.append("web proxy host ");
                sb.append(property);
                sb.append(", port ");
                sb.append(intProperty);
                mailLogger.finer(sb.toString());
                if (property2 != null) {
                    MailLogger mailLogger2 = logger;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("web proxy user ");
                    sb2.append(property2);
                    sb2.append(", password ");
                    sb2.append(property3 == null ? "<null>" : "<non-null>");
                    mailLogger2.finer(sb2.toString());
                }
            } else {
                str7 = str10;
            }
            str3 = property;
            str4 = str7;
            i6 = 1080;
            str5 = null;
            i5 = intProperty;
        } else {
            str5 = properties2.getProperty(str9 + ".socks.host", (String) null);
            if (str5 != null) {
                int indexOf2 = str5.indexOf(58);
                if (indexOf2 >= 0) {
                    try {
                        i15 = Integer.parseInt(str5.substring(indexOf2 + 1));
                    } catch (NumberFormatException unused2) {
                    }
                    str5 = str5.substring(0, indexOf2);
                    i7 = i15;
                } else {
                    i7 = 1080;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str9);
                str3 = property;
                sb3.append(".socks.port");
                i6 = PropUtil.getIntProperty(properties2, sb3.toString(), i7);
                String str11 = "Using SOCKS host, port: " + str5 + ", " + i6;
                if (logger.isLoggable(Level.FINER)) {
                    MailLogger mailLogger3 = logger;
                    StringBuilder sb4 = new StringBuilder();
                    str4 = str11;
                    sb4.append("socks host ");
                    sb4.append(str5);
                    sb4.append(", port ");
                    sb4.append(i6);
                    mailLogger3.finer(sb4.toString());
                } else {
                    str4 = str11;
                }
            } else {
                str3 = property;
                i6 = 1080;
                str4 = null;
            }
            i5 = 80;
        }
        Socket createSocket = (sSLSocketFactory2 == null || (sSLSocketFactory2 instanceof javax.net.ssl.SSLSocketFactory)) ? null : socketFactory.createSocket();
        if (createSocket == null) {
            if (str5 != null) {
                createSocket = new Socket(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str5, i6)));
            } else {
                if (PropUtil.getBooleanProperty(properties2, str9 + ".usesocketchannels", false)) {
                    logger.finer("using SocketChannels");
                    createSocket = SocketChannel.open().socket();
                } else {
                    createSocket = new Socket();
                }
            }
        }
        if (i14 >= 0) {
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket read timeout " + i14);
            }
            createSocket.setSoTimeout(i14);
        }
        int intProperty2 = PropUtil.getIntProperty(properties2, str9 + ".writetimeout", -1);
        if (intProperty2 != -1) {
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket write timeout " + intProperty2);
            }
            socket = new WriteTimeoutSocket(createSocket, intProperty2);
        } else {
            socket = createSocket;
        }
        if (inetAddress2 != null) {
            socket.bind(new InetSocketAddress(inetAddress2, i11));
        }
        try {
            logger.finest("connecting...");
            if (str3 != null) {
                proxyConnect(socket, str3, i5, property2, property3, str, i2, i3);
                str6 = str;
            } else if (i13 >= 0) {
                str6 = str;
                try {
                    socket.connect(new InetSocketAddress(str6, i12), i13);
                } catch (IOException e) {
                    e = e;
                    IOException iOException = e;
                    logger.log(Level.FINEST, "connection failed", (Throwable) iOException);
                    throw new SocketConnectException(str4, iOException, str, i2, i3);
                }
            } else {
                str6 = str;
                socket.connect(new InetSocketAddress(str6, i12));
            }
            logger.finest("success!");
            if ((z || (sSLSocketFactory2 instanceof javax.net.ssl.SSLSocketFactory)) && !(socket instanceof SSLSocket)) {
                String property4 = properties2.getProperty(str9 + ".ssl.trust");
                if (property4 != null) {
                    try {
                        MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                        if (property4.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                            mailSSLSocketFactory.setTrustAllHosts(true);
                        } else {
                            mailSSLSocketFactory.setTrustedHosts(property4.split("\\s+"));
                        }
                        sSLSocketFactory = mailSSLSocketFactory;
                    } catch (GeneralSecurityException e2) {
                        IOException iOException2 = new IOException("Can't create MailSSLSocketFactory");
                        iOException2.initCause(e2);
                        throw iOException2;
                    }
                } else if (sSLSocketFactory2 instanceof javax.net.ssl.SSLSocketFactory) {
                    sSLSocketFactory = (javax.net.ssl.SSLSocketFactory) sSLSocketFactory2;
                } else {
                    sSLSocketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
                }
                socket = sSLSocketFactory.createSocket(socket, str6, i12, true);
                sSLSocketFactory2 = sSLSocketFactory;
            }
            configureSSLSocket(socket, str6, properties2, str9, sSLSocketFactory2);
            return socket;
        } catch (IOException e3) {
            e = e3;
            String str12 = str;
            IOException iOException3 = e;
            logger.log(Level.FINEST, "connection failed", (Throwable) iOException3);
            throw new SocketConnectException(str4, iOException3, str, i2, i3);
        }
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: javax.net.SocketFactory} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0130, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0131, code lost:
        r24 = r8;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0135, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01db, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01dc, code lost:
        r24 = r8;
        r20 = null;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e8, code lost:
        if ((r0 instanceof java.lang.reflect.InvocationTargetException) != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ea, code lost:
        r1 = ((java.lang.reflect.InvocationTargetException) r0).getTargetException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f3, code lost:
        if ((r1 instanceof java.lang.Exception) != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f5, code lost:
        r6 = (java.lang.Exception) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f9, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01fd, code lost:
        if ((r6 instanceof java.io.IOException) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0201, code lost:
        throw ((java.io.IOException) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021c, code lost:
        throw new com.sun.mail.util.SocketConnectException("Using " + r2, r6, r22, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021d, code lost:
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0220, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0138 A[Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }, ExcHandler: SocketTimeoutException (r0v38 'e' java.net.SocketTimeoutException A[CUSTOM_DECLARE, Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }]), Splitter:B:16:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.Socket getSocket(java.lang.String r22, int r23, java.util.Properties r24, java.lang.String r25, boolean r26) throws java.io.IOException {
        /*
            r0 = r25
            r10 = r26
            com.sun.mail.util.MailLogger r1 = logger
            java.util.logging.Level r2 = java.util.logging.Level.FINER
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L_0x0041
            com.sun.mail.util.MailLogger r1 = logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getSocket, host "
            r2.append(r3)
            r11 = r22
            r2.append(r11)
            java.lang.String r3 = ", port "
            r2.append(r3)
            r12 = r23
            r2.append(r12)
            java.lang.String r3 = ", prefix "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", useSSL "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.finer(r2)
            goto L_0x0045
        L_0x0041:
            r11 = r22
            r12 = r23
        L_0x0045:
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "socket"
        L_0x0049:
            r13 = r0
            if (r24 != 0) goto L_0x0053
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r14 = r0
            goto L_0x0055
        L_0x0053:
            r14 = r24
        L_0x0055:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r1 = ".connectiontimeout"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1
            int r15 = com.sun.mail.util.PropUtil.getIntProperty(r14, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r2 = ".localaddress"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9 = 0
            java.lang.String r0 = r14.getProperty(r0, r9)
            if (r0 == 0) goto L_0x008a
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)
            r16 = r0
            goto L_0x008c
        L_0x008a:
            r16 = r9
        L_0x008c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r2 = ".localport"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            int r17 = com.sun.mail.util.PropUtil.getIntProperty(r14, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r2 = ".socketFactory.fallback"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            boolean r18 = com.sun.mail.util.PropUtil.getBooleanProperty(r14, r0, r2)
            java.lang.String r2 = "unknown socket factory"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r3 = ".timeout"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r8 = com.sun.mail.util.PropUtil.getIntProperty(r14, r0, r1)
            if (r10 == 0) goto L_0x013b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r3 = ".ssl.socketFactory"
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            boolean r3 = r0 instanceof javax.net.SocketFactory     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            if (r3 == 0) goto L_0x00fe
            javax.net.SocketFactory r0 = (javax.net.SocketFactory) r0     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r4 = "SSL socket factory instance "
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.append(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r2 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            goto L_0x00ff
        L_0x00fe:
            r0 = r9
        L_0x00ff:
            if (r0 != 0) goto L_0x012d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r3 = ".ssl.socketFactory.class"
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r14.getProperty(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            javax.net.SocketFactory r3 = getSocketFactory(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r5 = "SSL socket factory class "
            r4.append(r5)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r4.append(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r2 = r0
            r0 = r3
        L_0x012d:
            java.lang.String r3 = ".ssl.socketFactory.port"
            goto L_0x013d
        L_0x0130:
            r0 = move-exception
            r24 = r8
            r20 = r9
        L_0x0135:
            r8 = -1
            goto L_0x01e4
        L_0x0138:
            r0 = move-exception
            goto L_0x0220
        L_0x013b:
            r0 = r9
            r3 = r0
        L_0x013d:
            if (r0 != 0) goto L_0x019c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.append(r13)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r4 = ".socketFactory"
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.Object r3 = r14.get(r3)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            boolean r4 = r3 instanceof javax.net.SocketFactory     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            if (r4 == 0) goto L_0x016c
            r0 = r3
            javax.net.SocketFactory r0 = (javax.net.SocketFactory) r0     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r4 = "socket factory instance "
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r3.append(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r2 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
        L_0x016c:
            if (r0 != 0) goto L_0x019a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r3 = ".socketFactory.class"
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r14.getProperty(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            javax.net.SocketFactory r3 = getSocketFactory(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r5 = "socket factory class "
            r4.append(r5)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r4.append(r0)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            java.lang.String r0 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x0130 }
            r2 = r0
            r0 = r3
        L_0x019a:
            java.lang.String r3 = ".socketFactory.port"
        L_0x019c:
            r20 = r0
            r19 = r2
            if (r20 == 0) goto L_0x0221
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            int r0 = com.sun.mail.util.PropUtil.getIntProperty(r14, r0, r1)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01db }
            if (r0 != r1) goto L_0x01ba
            r21 = r12
            goto L_0x01bc
        L_0x01ba:
            r21 = r0
        L_0x01bc:
            r0 = r16
            r1 = r17
            r2 = r22
            r3 = r21
            r4 = r15
            r5 = r8
            r6 = r14
            r7 = r13
            r24 = r8
            r8 = r20
            r20 = r9
            r9 = r26
            java.net.Socket r9 = createSocket(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SocketTimeoutException -> 0x0138, Exception -> 0x01d5 }
            goto L_0x0225
        L_0x01d5:
            r0 = move-exception
            r2 = r19
            r8 = r21
            goto L_0x01e4
        L_0x01db:
            r0 = move-exception
            r24 = r8
            r20 = r9
            r2 = r19
            goto L_0x0135
        L_0x01e4:
            if (r18 != 0) goto L_0x021d
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L_0x01f9
            r1 = r0
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1
            java.lang.Throwable r1 = r1.getTargetException()
            boolean r3 = r1 instanceof java.lang.Exception
            if (r3 == 0) goto L_0x01f9
            java.lang.Exception r1 = (java.lang.Exception) r1
            r6 = r1
            goto L_0x01fa
        L_0x01f9:
            r6 = r0
        L_0x01fa:
            boolean r0 = r6 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0202
            java.io.IOException r6 = (java.io.IOException) r6
            throw r6
        L_0x0202:
            com.sun.mail.util.SocketConnectException r0 = new com.sun.mail.util.SocketConnectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Using "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r4 = r0
            r7 = r22
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            throw r0
        L_0x021d:
            r9 = r20
            goto L_0x0225
        L_0x0220:
            throw r0
        L_0x0221:
            r24 = r8
            r20 = r9
        L_0x0225:
            if (r9 != 0) goto L_0x023c
            r8 = 0
            r0 = r16
            r1 = r17
            r2 = r22
            r3 = r23
            r4 = r15
            r5 = r24
            r6 = r14
            r7 = r13
            r9 = r26
            java.net.Socket r9 = createSocket(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0263
        L_0x023c:
            r1 = r24
            if (r1 < 0) goto L_0x0263
            com.sun.mail.util.MailLogger r0 = logger
            java.util.logging.Level r2 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r2)
            if (r0 == 0) goto L_0x0260
            com.sun.mail.util.MailLogger r0 = logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set socket read timeout "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.finest(r2)
        L_0x0260:
            r9.setSoTimeout(r1)
        L_0x0263:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.SocketFetcher.getSocket(java.lang.String, int, java.util.Properties, java.lang.String, boolean):java.net.Socket");
    }

    private static SocketFactory getSocketFactory(String str) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?> cls = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        ClassLoader contextClassLoader = getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                cls = Class.forName(str, false, contextClassLoader);
            } catch (ClassNotFoundException unused) {
            }
        }
        if (cls == null) {
            cls = Class.forName(str);
        }
        return (SocketFactory) cls.getMethod("getDefault", new Class[0]).invoke(new Object(), new Object[0]);
    }

    private static boolean isRecoverable(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    private static boolean matchCert(String str, X509Certificate x509Certificate) {
        MailLogger mailLogger = logger;
        Level level = Level.FINER;
        if (mailLogger.isLoggable(level)) {
            MailLogger mailLogger2 = logger;
            mailLogger2.finer("matchCert server " + str + ", cert " + x509Certificate);
        }
        try {
            Class<?> cls = Class.forName("sun.security.util.HostnameChecker");
            Object invoke = cls.getMethod("getInstance", new Class[]{Byte.TYPE}).invoke(new Object(), new Object[]{(byte) 2});
            if (logger.isLoggable(level)) {
                logger.finer("using sun.security.util.HostnameChecker");
            }
            try {
                cls.getMethod("match", new Class[]{String.class, X509Certificate.class}).invoke(invoke, new Object[]{str, x509Certificate});
                return true;
            } catch (InvocationTargetException e) {
                logger.log(Level.FINER, "HostnameChecker FAIL", (Throwable) e);
                return false;
            }
        } catch (Exception e2) {
            logger.log(Level.FINER, "NO sun.security.util.HostnameChecker", (Throwable) e2);
            try {
                Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                if (subjectAlternativeNames != null) {
                    boolean z = false;
                    for (List next : subjectAlternativeNames) {
                        if (((Integer) next.get(0)).intValue() == 2) {
                            String str2 = (String) next.get(1);
                            if (logger.isLoggable(Level.FINER)) {
                                MailLogger mailLogger3 = logger;
                                mailLogger3.finer("found name: " + str2);
                            }
                            if (matchServer(str, str2)) {
                                return true;
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        return false;
                    }
                }
            } catch (CertificateParsingException unused) {
            }
            Matcher matcher = Pattern.compile("CN=([^,]*)").matcher(x509Certificate.getSubjectX500Principal().getName());
            return matcher.find() && matchServer(str, matcher.group(1).trim());
        }
    }

    private static boolean matchServer(String str, String str2) {
        int length;
        if (logger.isLoggable(Level.FINER)) {
            MailLogger mailLogger = logger;
            mailLogger.finer("match server " + str + " with " + str2);
        }
        if (!str2.startsWith("*.")) {
            return str.equalsIgnoreCase(str2);
        }
        String substring = str2.substring(2);
        if (substring.length() == 0 || (length = str.length() - substring.length()) < 1 || str.charAt(length - 1) != '.') {
            return false;
        }
        if (str.regionMatches(true, length, substring, 0, substring.length())) {
            return true;
        }
        return false;
    }

    private static void proxyConnect(Socket socket, String str, int i, String str2, String str3, String str4, int i2, int i3) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            MailLogger mailLogger = logger;
            mailLogger.fine("connecting through proxy " + str + ":" + i + " to " + str4 + ":" + i2);
        }
        if (i3 >= 0) {
            socket.connect(new InetSocketAddress(str, i), i3);
        } else {
            socket.connect(new InetSocketAddress(str, i));
        }
        PrintStream printStream = new PrintStream(socket.getOutputStream(), false, StandardCharsets.UTF_8.name());
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(str4);
        sb.append(":");
        sb.append(i2);
        sb.append(" HTTP/1.1\r\n");
        sb.append("Host: ");
        sb.append(str4);
        sb.append(":");
        sb.append(i2);
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (!(str2 == null || str3 == null)) {
            String str5 = new String(BASE64EncoderStream.encode((str2 + ':' + str3).getBytes(StandardCharsets.UTF_8)), StandardCharsets.US_ASCII);
            sb.append("Proxy-Authorization: Basic ");
            sb.append(str5);
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        sb.append("Proxy-Connection: keep-alive\r\n\r\n");
        printStream.print(sb.toString());
        printStream.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        boolean z = true;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.length() != 0) {
                logger.finest(readLine);
                if (z) {
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                    stringTokenizer.nextToken();
                    if (stringTokenizer.nextToken().equals("200")) {
                        z = false;
                    } else {
                        try {
                            socket.close();
                        } catch (IOException unused) {
                        }
                        ConnectException connectException = new ConnectException("connection through proxy " + str + ":" + i + " to " + str4 + ":" + i2 + " failed: " + readLine);
                        logger.log(Level.FINE, "connect failed", (Throwable) connectException);
                        throw connectException;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Deprecated
    public static Socket startTLS(Socket socket) throws IOException {
        return startTLS(socket, new Properties(), "socket");
    }

    private static String[] stringArray(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Deprecated
    public static Socket startTLS(Socket socket, Properties properties, String str) throws IOException {
        return startTLS(socket, socket.getInetAddress().getHostName(), properties, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: javax.net.SocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.sun.mail.util.MailSSLSocketFactory} */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v5, types: [javax.net.SocketFactory] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.Socket startTLS(java.net.Socket r7, java.lang.String r8, java.util.Properties r9, java.lang.String r10) throws java.io.IOException {
        /*
            int r0 = r7.getPort()
            com.sun.mail.util.MailLogger r1 = logger
            java.util.logging.Level r2 = java.util.logging.Level.FINER
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L_0x002c
            com.sun.mail.util.MailLogger r1 = logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "startTLS host "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", port "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.finer(r2)
        L_0x002c:
            java.lang.String r1 = "unknown socket factory"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r2.<init>()     // Catch:{ Exception -> 0x014c }
            r2.append(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ".ssl.socketFactory"
            r2.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x014c }
            boolean r3 = r2 instanceof javax.net.SocketFactory     // Catch:{ Exception -> 0x014c }
            r4 = 0
            if (r3 == 0) goto L_0x005c
            javax.net.SocketFactory r2 = (javax.net.SocketFactory) r2     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "SSL socket factory instance "
            r3.append(r5)     // Catch:{ Exception -> 0x014c }
            r3.append(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x014c }
            goto L_0x005d
        L_0x005c:
            r2 = r4
        L_0x005d:
            if (r2 != 0) goto L_0x008a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r2.<init>()     // Catch:{ Exception -> 0x014c }
            r2.append(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ".ssl.socketFactory.class"
            r2.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r9.getProperty(r2)     // Catch:{ Exception -> 0x014c }
            javax.net.SocketFactory r3 = getSocketFactory(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r5.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = "SSL socket factory class "
            r5.append(r6)     // Catch:{ Exception -> 0x014c }
            r5.append(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x014c }
            r2 = r3
        L_0x008a:
            if (r2 == 0) goto L_0x0093
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocketFactory     // Catch:{ Exception -> 0x014c }
            if (r3 == 0) goto L_0x0093
            r4 = r2
            javax.net.ssl.SSLSocketFactory r4 = (javax.net.ssl.SSLSocketFactory) r4     // Catch:{ Exception -> 0x014c }
        L_0x0093:
            if (r4 != 0) goto L_0x00f8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            r3.append(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = ".socketFactory"
            r3.append(r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.Object r3 = r9.get(r3)     // Catch:{ Exception -> 0x014c }
            boolean r5 = r3 instanceof javax.net.SocketFactory     // Catch:{ Exception -> 0x014c }
            if (r5 == 0) goto L_0x00c2
            r2 = r3
            javax.net.SocketFactory r2 = (javax.net.SocketFactory) r2     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = "socket factory instance "
            r3.append(r5)     // Catch:{ Exception -> 0x014c }
            r3.append(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x014c }
        L_0x00c2:
            if (r2 != 0) goto L_0x00ef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r2.<init>()     // Catch:{ Exception -> 0x014c }
            r2.append(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ".socketFactory.class"
            r2.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = r9.getProperty(r2)     // Catch:{ Exception -> 0x014c }
            javax.net.SocketFactory r3 = getSocketFactory(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r5.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = "socket factory class "
            r5.append(r6)     // Catch:{ Exception -> 0x014c }
            r5.append(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x014c }
            r2 = r3
        L_0x00ef:
            if (r2 == 0) goto L_0x00f8
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocketFactory     // Catch:{ Exception -> 0x014c }
            if (r3 == 0) goto L_0x00f8
            r4 = r2
            javax.net.ssl.SSLSocketFactory r4 = (javax.net.ssl.SSLSocketFactory) r4     // Catch:{ Exception -> 0x014c }
        L_0x00f8:
            r2 = 1
            if (r4 != 0) goto L_0x0144
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            r3.append(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = ".ssl.trust"
            r3.append(r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r9.getProperty(r3)     // Catch:{ Exception -> 0x014c }
            if (r3 == 0) goto L_0x013b
            com.sun.mail.util.MailSSLSocketFactory r4 = new com.sun.mail.util.MailSSLSocketFactory     // Catch:{ GeneralSecurityException -> 0x012f }
            r4.<init>()     // Catch:{ GeneralSecurityException -> 0x012f }
            java.lang.String r5 = "*"
            boolean r5 = r3.equals(r5)     // Catch:{ GeneralSecurityException -> 0x012f }
            if (r5 == 0) goto L_0x0123
            r4.setTrustAllHosts(r2)     // Catch:{ GeneralSecurityException -> 0x012f }
            goto L_0x012c
        L_0x0123:
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ GeneralSecurityException -> 0x012f }
            r4.setTrustedHosts(r3)     // Catch:{ GeneralSecurityException -> 0x012f }
        L_0x012c:
            java.lang.String r1 = "mail SSL socket factory"
            goto L_0x0144
        L_0x012f:
            r7 = move-exception
            java.io.IOException r9 = new java.io.IOException     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = "Can't create MailSSLSocketFactory"
            r9.<init>(r10)     // Catch:{ Exception -> 0x014c }
            r9.initCause(r7)     // Catch:{ Exception -> 0x014c }
            throw r9     // Catch:{ Exception -> 0x014c }
        L_0x013b:
            javax.net.SocketFactory r3 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch:{ Exception -> 0x014c }
            r4 = r3
            javax.net.ssl.SSLSocketFactory r4 = (javax.net.ssl.SSLSocketFactory) r4     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = "default SSL socket factory"
        L_0x0144:
            java.net.Socket r7 = r4.createSocket(r7, r8, r0, r2)     // Catch:{ Exception -> 0x014c }
            configureSSLSocket(r7, r8, r9, r10, r4)     // Catch:{ Exception -> 0x014c }
            return r7
        L_0x014c:
            r7 = move-exception
            boolean r9 = r7 instanceof java.lang.reflect.InvocationTargetException
            if (r9 == 0) goto L_0x015f
            r9 = r7
            java.lang.reflect.InvocationTargetException r9 = (java.lang.reflect.InvocationTargetException) r9
            java.lang.Throwable r9 = r9.getTargetException()
            boolean r10 = r9 instanceof java.lang.Exception
            if (r10 == 0) goto L_0x015f
            r7 = r9
            java.lang.Exception r7 = (java.lang.Exception) r7
        L_0x015f:
            boolean r9 = r7 instanceof java.io.IOException
            if (r9 == 0) goto L_0x0166
            java.io.IOException r7 = (java.io.IOException) r7
            throw r7
        L_0x0166:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Exception in startTLS using "
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ": host, port: "
            r10.append(r1)
            r10.append(r8)
            java.lang.String r8 = ", "
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = "; Exception: "
            r10.append(r8)
            r10.append(r7)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            r9.initCause(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.SocketFetcher.startTLS(java.net.Socket, java.lang.String, java.util.Properties, java.lang.String):java.net.Socket");
    }

    public static Socket getSocket(String str, int i, Properties properties, String str2) throws IOException {
        return getSocket(str, i, properties, str2, false);
    }
}
