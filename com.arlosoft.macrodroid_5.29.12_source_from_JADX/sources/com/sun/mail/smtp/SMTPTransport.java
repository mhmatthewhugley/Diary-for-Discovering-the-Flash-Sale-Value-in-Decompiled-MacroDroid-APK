package com.sun.mail.smtp;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.p023dx.p026io.Opcodes;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.ParseException;
import javax.net.ssl.SSLSocket;
import org.apache.http.client.params.AuthPolicy;
import p421w7.C16777b;

public class SMTPTransport extends Transport {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] CRLF = {13, 10};
    private static final String UNKNOWN = "UNKNOWN";
    private static final String[] UNKNOWN_SA = new String[0];
    private static char[] hexchar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String[] ignoreList = {"Bcc", "Content-Length"};
    private Address[] addresses;
    private boolean allowutf8;
    private Map<String, Authenticator> authenticators;
    private String authorizationID;
    private int chunkSize;
    private SMTPOutputStream dataStream;
    private boolean debugpassword;
    private boolean debugusername;
    private String defaultAuthenticationMechanisms;
    private int defaultPort;
    private boolean enableSASL;
    private MessagingException exception;
    private Hashtable<String, String> extMap;
    private String host;
    private Address[] invalidAddr;
    private boolean isSSL;
    private int lastReturnCode;
    /* access modifiers changed from: private */
    public String lastServerResponse;
    private LineInputStream lineInputStream;
    private String localHostName;
    /* access modifiers changed from: private */
    public MailLogger logger;
    private MimeMessage message;
    /* access modifiers changed from: private */
    public String name;
    /* access modifiers changed from: private */
    public boolean noauthdebug;
    private boolean noopStrict;
    private boolean notificationDone;
    private String ntlmDomain;
    private boolean quitOnSessionReject;
    private boolean quitWait;
    private boolean reportSuccess;
    private boolean requireStartTLS;
    private SaslAuthenticator saslAuthenticator;
    private String[] saslMechanisms;
    private String saslRealm;
    private boolean sendPartiallyFailed;
    private BufferedInputStream serverInput;
    private OutputStream serverOutput;
    private Socket serverSocket;
    private TraceInputStream traceInput;
    private MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    private boolean useCanonicalHostName;
    private boolean useRset;
    private boolean useStartTLS;
    private Address[] validSentAddr;
    private Address[] validUnsentAddr;

    private abstract class Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean enabled;
        private final String mech;
        protected int resp;

        static {
            Class<SMTPTransport> cls = SMTPTransport.class;
        }

        Authenticator(SMTPTransport sMTPTransport, String str) {
            this(str, true);
        }

        /* access modifiers changed from: package-private */
        public boolean authenticate(String str, String str2, String str3, String str4) throws MessagingException {
            String str5 = "succeeded";
            try {
                String initialResponse = getInitialResponse(str, str2, str3, str4);
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger access$200 = SMTPTransport.this.logger;
                    access$200.fine("AUTH " + this.mech + " command trace suppressed");
                    SMTPTransport.this.suspendTracing();
                }
                if (initialResponse != null) {
                    SMTPTransport sMTPTransport = SMTPTransport.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("AUTH ");
                    sb.append(this.mech);
                    sb.append(" ");
                    sb.append(initialResponse.length() == 0 ? "=" : initialResponse);
                    this.resp = sMTPTransport.simpleCommand(sb.toString());
                } else {
                    SMTPTransport sMTPTransport2 = SMTPTransport.this;
                    this.resp = sMTPTransport2.simpleCommand("AUTH " + this.mech);
                }
                if (this.resp == 530) {
                    SMTPTransport.this.startTLS();
                    if (initialResponse != null) {
                        SMTPTransport sMTPTransport3 = SMTPTransport.this;
                        this.resp = sMTPTransport3.simpleCommand("AUTH " + this.mech + " " + initialResponse);
                    } else {
                        SMTPTransport sMTPTransport4 = SMTPTransport.this;
                        this.resp = sMTPTransport4.simpleCommand("AUTH " + this.mech);
                    }
                }
                if (this.resp == 334) {
                    doAuth(str, str2, str3, str4);
                }
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger access$2002 = SMTPTransport.this.logger;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AUTH ");
                    sb2.append(this.mech);
                    sb2.append(" ");
                    if (this.resp != 235) {
                        str5 = "failed";
                    }
                    sb2.append(str5);
                    access$2002.fine(sb2.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp == 235) {
                    return true;
                }
                SMTPTransport.this.closeConnection();
                throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
            } catch (IOException e) {
                MailLogger access$2003 = SMTPTransport.this.logger;
                Level level = Level.FINE;
                access$2003.log(level, "AUTH " + this.mech + " failed", (Throwable) e);
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger access$2004 = SMTPTransport.this.logger;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AUTH ");
                    sb3.append(this.mech);
                    sb3.append(" ");
                    if (this.resp != 235) {
                        str5 = "failed";
                    }
                    sb3.append(str5);
                    access$2004.fine(sb3.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp == 235) {
                    return true;
                }
                SMTPTransport.this.closeConnection();
                throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
            } catch (Throwable th) {
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger access$2005 = SMTPTransport.this.logger;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("AUTH ");
                    sb4.append(this.mech);
                    sb4.append(" ");
                    if (this.resp != 235) {
                        str5 = "failed";
                    }
                    sb4.append(str5);
                    access$2005.fine(sb4.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp != 235) {
                    SMTPTransport.this.closeConnection();
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                }
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException;

        /* access modifiers changed from: package-private */
        public boolean enabled() {
            return this.enabled;
        }

        /* access modifiers changed from: package-private */
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            return null;
        }

        /* access modifiers changed from: package-private */
        public String getMechanism() {
            return this.mech;
        }

        Authenticator(String str, boolean z) {
            this.mech = str.toUpperCase(Locale.ENGLISH);
            this.enabled = z;
        }
    }

    private class BDATOutputStream extends SMTPOutputStream {
        public BDATOutputStream(OutputStream outputStream, int i) {
            super(new ChunkedOutputStream(outputStream, i));
        }

        public void close() throws IOException {
            this.out.close();
        }
    }

    private class DigestMD5Authenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private DigestMD5 md5support;

        static {
            Class<SMTPTransport> cls = SMTPTransport.class;
        }

        DigestMD5Authenticator() {
            super(SMTPTransport.this, "DIGEST-MD5");
        }

        private synchronized DigestMD5 getMD5() {
            if (this.md5support == null) {
                this.md5support = new DigestMD5(SMTPTransport.this.logger);
            }
            return this.md5support;
        }

        /* access modifiers changed from: package-private */
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            DigestMD5 md5 = getMD5();
            int simpleCommand = SMTPTransport.this.simpleCommand(md5.authClient(str, str3, str4, SMTPTransport.this.getSASLRealm(), SMTPTransport.this.getLastServerResponse()));
            this.resp = simpleCommand;
            if (simpleCommand != 334) {
                return;
            }
            if (!md5.authServer(SMTPTransport.this.getLastServerResponse())) {
                this.resp = -1;
            } else {
                this.resp = SMTPTransport.this.simpleCommand(new byte[0]);
            }
        }
    }

    private class LoginAuthenticator extends Authenticator {
        LoginAuthenticator() {
            super(SMTPTransport.this, "LOGIN");
        }

        /* access modifiers changed from: package-private */
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            int simpleCommand = SMTPTransport.this.simpleCommand(BASE64EncoderStream.encode(str3.getBytes(StandardCharsets.UTF_8)));
            this.resp = simpleCommand;
            if (simpleCommand == 334) {
                this.resp = SMTPTransport.this.simpleCommand(BASE64EncoderStream.encode(str4.getBytes(StandardCharsets.UTF_8)));
            }
        }
    }

    private class NtlmAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private C16777b ntlm;

        static {
            Class<SMTPTransport> cls = SMTPTransport.class;
        }

        NtlmAuthenticator() {
            super(SMTPTransport.this, AuthPolicy.NTLM);
        }

        /* access modifiers changed from: package-private */
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            this.resp = SMTPTransport.this.simpleCommand(this.ntlm.mo79761g(SMTPTransport.this.getLastServerResponse().substring(4).trim()));
        }

        /* access modifiers changed from: package-private */
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            this.ntlm = new C16777b(SMTPTransport.this.getNTLMDomain(), SMTPTransport.this.getLocalHost(), str3, str4, SMTPTransport.this.logger);
            Properties properties = SMTPTransport.this.session.getProperties();
            int intProperty = PropUtil.getIntProperty(properties, "mail." + SMTPTransport.this.name + ".auth.ntlm.flags", 0);
            Properties properties2 = SMTPTransport.this.session.getProperties();
            return this.ntlm.mo79760f(intProperty, PropUtil.getBooleanProperty(properties2, "mail." + SMTPTransport.this.name + ".auth.ntlm.v2", true));
        }
    }

    private class OAuth2Authenticator extends Authenticator {
        OAuth2Authenticator() {
            super("XOAUTH2", false);
        }

        /* access modifiers changed from: package-private */
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            throw new AuthenticationFailedException("OAUTH2 asked for more");
        }

        /* access modifiers changed from: package-private */
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(("user=" + str3 + "\u0001auth=Bearer " + str4 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }
    }

    private class PlainAuthenticator extends Authenticator {
        PlainAuthenticator() {
            super(SMTPTransport.this, "PLAIN");
        }

        /* access modifiers changed from: package-private */
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            throw new AuthenticationFailedException("PLAIN asked for more");
        }

        /* access modifiers changed from: package-private */
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str2 != null) {
                bASE64EncoderStream.write(str2.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str3.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str4.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    static {
        Class<SMTPTransport> cls = SMTPTransport.class;
    }

    public SMTPTransport(Session session, URLName uRLName) {
        this(session, uRLName, "smtp", false);
    }

    private void addressesFailed() {
        Address[] addressArr = this.validSentAddr;
        if (addressArr != null) {
            Address[] addressArr2 = this.validUnsentAddr;
            if (addressArr2 != null) {
                Address[] addressArr3 = new Address[(addressArr.length + addressArr2.length)];
                System.arraycopy(addressArr, 0, addressArr3, 0, addressArr.length);
                Address[] addressArr4 = this.validUnsentAddr;
                System.arraycopy(addressArr4, 0, addressArr3, this.validSentAddr.length, addressArr4.length);
                this.validSentAddr = null;
                this.validUnsentAddr = addressArr3;
                return;
            }
            this.validUnsentAddr = addressArr;
            this.validSentAddr = null;
        }
    }

    private boolean authenticate(String str, String str2) throws MessagingException {
        String property = this.session.getProperty("mail." + this.name + ".auth.mechanisms");
        if (property == null) {
            property = this.defaultAuthenticationMechanisms;
        }
        String authorizationId = getAuthorizationId();
        if (authorizationId == null) {
            authorizationId = str;
        }
        if (this.enableSASL) {
            this.logger.fine("Authenticate with SASL");
            try {
                if (sasllogin(getSASLMechanisms(), getSASLRealm(), authorizationId, str, str2)) {
                    return true;
                }
                this.logger.fine("SASL authentication failed");
                return false;
            } catch (UnsupportedOperationException e) {
                this.logger.log(Level.FINE, "SASL support failed", (Throwable) e);
            }
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("Attempt to authenticate using mechanisms: " + property);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            Locale locale = Locale.ENGLISH;
            String upperCase = nextToken.toUpperCase(locale);
            Authenticator authenticator = this.authenticators.get(upperCase);
            if (authenticator == null) {
                this.logger.log(Level.FINE, "no authenticator for mechanism {0}", (Object) upperCase);
            } else if (!supportsAuthentication(upperCase)) {
                this.logger.log(Level.FINE, "mechanism {0} not supported by server", (Object) upperCase);
            } else {
                if (property == this.defaultAuthenticationMechanisms) {
                    String str3 = "mail." + this.name + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                    if (PropUtil.getBooleanProperty(this.session.getProperties(), str3, !authenticator.enabled())) {
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("mechanism " + upperCase + " disabled by property: " + str3);
                        }
                    }
                }
                this.logger.log(Level.FINE, "Using mechanism {0}", (Object) upperCase);
                return authenticator.authenticate(this.host, authorizationId, str, str2);
            }
        }
        throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
    }

    /* access modifiers changed from: private */
    public void closeConnection() throws MessagingException {
        try {
            Socket socket = this.serverSocket;
            if (socket != null) {
                socket.close();
            }
            this.serverSocket = null;
            this.serverOutput = null;
            this.serverInput = null;
            this.lineInputStream = null;
            if (super.isConnected()) {
                super.close();
            }
        } catch (IOException e) {
            throw new MessagingException("Server Close Failed", e);
        } catch (Throwable th) {
            this.serverSocket = null;
            this.serverOutput = null;
            this.serverInput = null;
            this.lineInputStream = null;
            if (super.isConnected()) {
                super.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [int] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|(2:21|22)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean convertTo8Bit(javax.mail.internet.MimePart r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "text/*"
            boolean r1 = r6.isMimeType(r1)     // Catch:{ IOException | MessagingException -> 0x0071 }
            r2 = 1
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = r6.getEncoding()     // Catch:{ IOException | MessagingException -> 0x0071 }
            if (r1 == 0) goto L_0x0071
            java.lang.String r3 = "quoted-printable"
            boolean r3 = r1.equalsIgnoreCase(r3)     // Catch:{ IOException | MessagingException -> 0x0071 }
            if (r3 != 0) goto L_0x0020
            java.lang.String r3 = "base64"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch:{ IOException | MessagingException -> 0x0071 }
            if (r1 == 0) goto L_0x0071
        L_0x0020:
            r1 = 0
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ all -> 0x0044 }
            boolean r3 = r5.is8Bit(r1)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r6.getContent()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r6.getContentType()     // Catch:{ all -> 0x0044 }
            r6.setContent(r3, r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Content-Transfer-Encoding"
            java.lang.String r4 = "8bit"
            r6.setHeader(r3, r4)     // Catch:{ all -> 0x0044 }
            r0 = 1
        L_0x003e:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException | MessagingException -> 0x0071 }
            goto L_0x0071
        L_0x0044:
            r6 = move-exception
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r6     // Catch:{ IOException | MessagingException -> 0x0071 }
        L_0x004b:
            java.lang.String r1 = "multipart/*"
            boolean r1 = r6.isMimeType(r1)     // Catch:{ IOException | MessagingException -> 0x0071 }
            if (r1 == 0) goto L_0x0071
            java.lang.Object r6 = r6.getContent()     // Catch:{ IOException | MessagingException -> 0x0071 }
            javax.mail.internet.MimeMultipart r6 = (javax.mail.internet.MimeMultipart) r6     // Catch:{ IOException | MessagingException -> 0x0071 }
            int r1 = r6.getCount()     // Catch:{ IOException | MessagingException -> 0x0071 }
            r3 = 0
        L_0x005e:
            if (r0 >= r1) goto L_0x0070
            javax.mail.BodyPart r4 = r6.getBodyPart((int) r0)     // Catch:{ IOException | MessagingException -> 0x0070 }
            javax.mail.internet.MimePart r4 = (javax.mail.internet.MimePart) r4     // Catch:{ IOException | MessagingException -> 0x0070 }
            boolean r4 = r5.convertTo8Bit(r4)     // Catch:{ IOException | MessagingException -> 0x0070 }
            if (r4 == 0) goto L_0x006d
            r3 = 1
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x005e
        L_0x0070:
            r0 = r3
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.convertTo8Bit(javax.mail.internet.MimePart):boolean");
    }

    private void expandGroups() {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            Address[] addressArr = this.addresses;
            if (i >= addressArr.length) {
                break;
            }
            InternetAddress internetAddress = (InternetAddress) addressArr[i];
            if (internetAddress.isGroup()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(this.addresses[i2]);
                    }
                }
                try {
                    InternetAddress[] group = internetAddress.getGroup(true);
                    if (group != null) {
                        for (InternetAddress add : group) {
                            arrayList.add(add);
                        }
                    } else {
                        arrayList.add(internetAddress);
                    }
                } catch (ParseException unused) {
                    arrayList.add(internetAddress);
                }
            } else if (arrayList != null) {
                arrayList.add(internetAddress);
            }
            i++;
        }
        if (arrayList != null) {
            InternetAddress[] internetAddressArr = new InternetAddress[arrayList.size()];
            arrayList.toArray(internetAddressArr);
            this.addresses = internetAddressArr;
        }
    }

    private void initStreams() throws IOException {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.session.getProperties(), "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.serverSocket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.serverSocket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.serverOutput = new BufferedOutputStream(this.traceOutput);
        this.serverInput = new BufferedInputStream(this.traceInput);
        this.lineInputStream = new LineInputStream(this.serverInput);
    }

    private boolean is8Bit(InputStream inputStream) {
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read();
                if (read >= 0) {
                    int i2 = read & 255;
                    if (i2 == 13 || i2 == 10) {
                        i = 0;
                    } else if (i2 == 0 || (i = i + 1) > 998) {
                        return false;
                    }
                    if (i2 > 127) {
                        z = true;
                    }
                } else {
                    if (z) {
                        this.logger.fine("found an 8bit part");
                    }
                    return z;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    private boolean isNotLastLine(String str) {
        return str != null && str.length() >= 4 && str.charAt(3) == '-';
    }

    /* access modifiers changed from: private */
    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    private void issueSendCommand(String str, int i) throws MessagingException {
        sendCommand(str);
        int readServerResponse = readServerResponse();
        if (readServerResponse != i) {
            Address[] addressArr = this.validSentAddr;
            int length = addressArr == null ? 0 : addressArr.length;
            Address[] addressArr2 = this.validUnsentAddr;
            int length2 = addressArr2 == null ? 0 : addressArr2.length;
            Address[] addressArr3 = new Address[(length + length2)];
            if (length > 0) {
                System.arraycopy(addressArr, 0, addressArr3, 0, length);
            }
            if (length2 > 0) {
                System.arraycopy(this.validUnsentAddr, 0, addressArr3, length, length2);
            }
            this.validSentAddr = null;
            this.validUnsentAddr = addressArr3;
            if (this.logger.isLoggable(Level.FINE)) {
                MailLogger mailLogger = this.logger;
                mailLogger.fine("got response code " + readServerResponse + ", with response: " + this.lastServerResponse);
            }
            String str2 = this.lastServerResponse;
            int i2 = this.lastReturnCode;
            if (this.serverSocket != null) {
                issueCommand("RSET", -1);
            }
            this.lastServerResponse = str2;
            this.lastReturnCode = i2;
            throw new SMTPSendFailedException(str, readServerResponse, this.lastServerResponse, this.exception, this.validSentAddr, this.validUnsentAddr, this.invalidAddr);
        }
    }

    private String normalizeAddress(String str) {
        if (str.startsWith("<") || str.endsWith(">")) {
            return str;
        }
        return "<" + str + ">";
    }

    private void openServer(String str, int i) throws MessagingException {
        int readServerResponse;
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            MailLogger mailLogger2 = this.logger;
            mailLogger2.fine("trying to connect to host \"" + str + "\", port " + i + ", isSSL " + this.isSSL);
        }
        try {
            Properties properties = this.session.getProperties();
            Socket socket = SocketFetcher.getSocket(str, i, properties, "mail." + this.name, this.isSSL);
            this.serverSocket = socket;
            i = socket.getPort();
            this.host = str;
            initStreams();
            if (readServerResponse() != 220) {
                String str2 = this.lastServerResponse;
                try {
                    if (this.quitOnSessionReject) {
                        sendCommand("QUIT");
                        if (this.quitWait && (readServerResponse = readServerResponse()) != 221 && readServerResponse != -1 && this.logger.isLoggable(level)) {
                            MailLogger mailLogger3 = this.logger;
                            mailLogger3.fine("QUIT failed with " + readServerResponse);
                        }
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                    this.serverInput = null;
                } catch (Exception e) {
                    MailLogger mailLogger4 = this.logger;
                    Level level2 = Level.FINE;
                    if (mailLogger4.isLoggable(level2)) {
                        this.logger.log(level2, "QUIT failed", (Throwable) e);
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                    this.serverInput = null;
                }
                this.lineInputStream = null;
                if (this.logger.isLoggable(Level.FINE)) {
                    MailLogger mailLogger5 = this.logger;
                    mailLogger5.fine("got bad greeting from host \"" + str + "\", port: " + i + ", response: " + str2);
                }
                throw new MessagingException("Got bad greeting from SMTP host: " + str + ", port: " + i + ", response: " + str2);
            } else if (this.logger.isLoggable(level)) {
                MailLogger mailLogger6 = this.logger;
                mailLogger6.fine("connected to host \"" + str + "\", port: " + i);
            }
        } catch (UnknownHostException e2) {
            throw new MessagingException("Unknown SMTP host: " + str, e2);
        } catch (SocketConnectException e3) {
            throw new MailConnectException(e3);
        } catch (IOException e4) {
            throw new MessagingException("Could not connect to SMTP host: " + str + ", port: " + i, e4);
        } catch (Throwable th) {
            this.serverSocket.close();
            this.serverSocket = null;
            this.serverOutput = null;
            this.serverInput = null;
            this.lineInputStream = null;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    private boolean sasllogin(String[] strArr, String str, String str2, String str3, String str4) throws MessagingException {
        String str5;
        ArrayList arrayList;
        String str6;
        Class<String> cls = String.class;
        if (this.useCanonicalHostName) {
            str5 = this.serverSocket.getInetAddress().getCanonicalHostName();
        } else {
            str5 = this.host;
        }
        if (this.saslAuthenticator == null) {
            try {
                this.saslAuthenticator = (SaslAuthenticator) Class.forName("com.sun.mail.smtp.SMTPSaslAuthenticator").getConstructor(new Class[]{SMTPTransport.class, cls, Properties.class, MailLogger.class, cls}).newInstance(new Object[]{this, this.name, this.session.getProperties(), this.logger, str5});
            } catch (Exception e) {
                this.logger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e);
                return false;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = new ArrayList();
            Hashtable<String, String> hashtable = this.extMap;
            if (!(hashtable == null || (str6 = hashtable.get("AUTH")) == null)) {
                StringTokenizer stringTokenizer = new StringTokenizer(str6);
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(stringTokenizer.nextToken());
                }
            }
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                if (supportsAuthentication(strArr[i])) {
                    arrayList.add(strArr[i]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("SASL AUTH command trace suppressed");
                suspendTracing();
            }
            return this.saslAuthenticator.authenticate(strArr2, str, str2, str3, str4);
        } finally {
            resumeTracing();
        }
    }

    private void sendMessageEnd() {
    }

    private void sendMessageStart(String str) {
    }

    /* access modifiers changed from: private */
    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    private byte[] toBytes(String str) {
        if (this.allowutf8) {
            return str.getBytes(StandardCharsets.UTF_8);
        }
        return ASCIIUtility.getBytes(str);
    }

    private String tracePassword(String str) {
        return this.debugpassword ? str : str == null ? "<null>" : "<non-null>";
    }

    private String traceUser(String str) {
        return this.debugusername ? str : "<user name suppressed>";
    }

    protected static String xtext(String str) {
        return xtext(str, false);
    }

    /* access modifiers changed from: protected */
    public OutputStream bdat() throws MessagingException {
        BDATOutputStream bDATOutputStream = new BDATOutputStream(this.serverOutput, this.chunkSize);
        this.dataStream = bDATOutputStream;
        return bDATOutputStream;
    }

    /* access modifiers changed from: protected */
    public void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    public synchronized void close() throws MessagingException {
        int readServerResponse;
        if (super.isConnected()) {
            try {
                if (this.serverSocket != null) {
                    sendCommand("QUIT");
                    if (this.quitWait && (readServerResponse = readServerResponse()) != 221 && readServerResponse != -1 && this.logger.isLoggable(Level.FINE)) {
                        MailLogger mailLogger = this.logger;
                        mailLogger.fine("QUIT failed with " + readServerResponse);
                    }
                }
            } finally {
                closeConnection();
            }
        }
    }

    public synchronized void connect(Socket socket) throws MessagingException {
        this.serverSocket = socket;
        super.connect();
    }

    /* access modifiers changed from: protected */
    public OutputStream data() throws MessagingException {
        issueSendCommand("DATA", 354);
        SMTPOutputStream sMTPOutputStream = new SMTPOutputStream(this.serverOutput);
        this.dataStream = sMTPOutputStream;
        return sMTPOutputStream;
    }

    /* access modifiers changed from: protected */
    public boolean ehlo(String str) throws MessagingException {
        String str2;
        if (str != null) {
            str2 = "EHLO " + str;
        } else {
            str2 = "EHLO";
        }
        sendCommand(str2);
        int readServerResponse = readServerResponse();
        if (readServerResponse == 250) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(this.lastServerResponse));
            this.extMap = new Hashtable<>();
            boolean z = true;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (z) {
                        z = false;
                    } else if (readLine.length() >= 5) {
                        String substring = readLine.substring(4);
                        int indexOf = substring.indexOf(32);
                        String str3 = "";
                        if (indexOf > 0) {
                            str3 = substring.substring(indexOf + 1);
                            substring = substring.substring(0, indexOf);
                        }
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("Found extension \"" + substring + "\", arg \"" + str3 + "\"");
                        }
                        this.extMap.put(substring.toUpperCase(Locale.ENGLISH), str3);
                    }
                } catch (IOException unused) {
                }
            }
        }
        if (readServerResponse == 250) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            closeConnection();
        } catch (MessagingException unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    public void finishBdat() throws IOException, MessagingException {
        this.dataStream.ensureAtBOL();
        this.dataStream.close();
    }

    /* access modifiers changed from: protected */
    public void finishData() throws IOException, MessagingException {
        this.dataStream.ensureAtBOL();
        issueSendCommand(".", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    public synchronized String getAuthorizationId() {
        if (this.authorizationID == UNKNOWN) {
            Session session = this.session;
            this.authorizationID = session.getProperty("mail." + this.name + ".sasl.authorizationid");
        }
        return this.authorizationID;
    }

    public String getExtensionParameter(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized int getLastReturnCode() {
        return this.lastReturnCode;
    }

    public synchronized String getLastServerResponse() {
        return this.lastServerResponse;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:1|2|(1:6)|7|(1:11)|12|13|(2:17|(1:19))|20|21|(2:29|(1:31))|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getLocalHost() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.localHostName     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x000b
            int r0 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r0 > 0) goto L_0x002b
        L_0x000b:
            javax.mail.Session r0 = r3.session     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "mail."
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = r3.name     // Catch:{ all -> 0x00c9 }
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = ".localhost"
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r0.getProperty(r1)     // Catch:{ all -> 0x00c9 }
            r3.localHostName = r0     // Catch:{ all -> 0x00c9 }
        L_0x002b:
            java.lang.String r0 = r3.localHostName     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0035
            int r0 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r0 > 0) goto L_0x0055
        L_0x0035:
            javax.mail.Session r0 = r3.session     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "mail."
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = r3.name     // Catch:{ all -> 0x00c9 }
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = ".localaddress"
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r0.getProperty(r1)     // Catch:{ all -> 0x00c9 }
            r3.localHostName = r0     // Catch:{ all -> 0x00c9 }
        L_0x0055:
            java.lang.String r0 = r3.localHostName     // Catch:{ UnknownHostException -> 0x0087 }
            if (r0 == 0) goto L_0x005f
            int r0 = r0.length()     // Catch:{ UnknownHostException -> 0x0087 }
            if (r0 > 0) goto L_0x0087
        L_0x005f:
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch:{ UnknownHostException -> 0x0087 }
            java.lang.String r1 = r0.getCanonicalHostName()     // Catch:{ UnknownHostException -> 0x0087 }
            r3.localHostName = r1     // Catch:{ UnknownHostException -> 0x0087 }
            if (r1 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0087 }
            r1.<init>()     // Catch:{ UnknownHostException -> 0x0087 }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x0087 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0087 }
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x0087 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnknownHostException -> 0x0087 }
            r3.localHostName = r0     // Catch:{ UnknownHostException -> 0x0087 }
        L_0x0087:
            java.lang.String r0 = r3.localHostName     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0091
            int r0 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r0 > 0) goto L_0x00c5
        L_0x0091:
            java.net.Socket r0 = r3.serverSocket     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r0.isBound()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00c5
            java.net.Socket r0 = r3.serverSocket     // Catch:{ all -> 0x00c9 }
            java.net.InetAddress r0 = r0.getLocalAddress()     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = r0.getCanonicalHostName()     // Catch:{ all -> 0x00c9 }
            r3.localHostName = r1     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x00c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x00c9 }
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            r3.localHostName = r0     // Catch:{ all -> 0x00c9 }
        L_0x00c5:
            java.lang.String r0 = r3.localHostName     // Catch:{ all -> 0x00c9 }
            monitor-exit(r3)
            return r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.getLocalHost():java.lang.String");
    }

    public synchronized String getNTLMDomain() {
        if (this.ntlmDomain == UNKNOWN) {
            Session session = this.session;
            this.ntlmDomain = session.getProperty("mail." + this.name + ".auth.ntlm.domain");
        }
        return this.ntlmDomain;
    }

    public synchronized boolean getNoopStrict() {
        return this.noopStrict;
    }

    public synchronized boolean getReportSuccess() {
        return this.reportSuccess;
    }

    public synchronized boolean getRequireStartTLS() {
        return this.requireStartTLS;
    }

    public synchronized boolean getSASLEnabled() {
        return this.enableSASL;
    }

    public synchronized String[] getSASLMechanisms() {
        if (this.saslMechanisms == UNKNOWN_SA) {
            ArrayList arrayList = new ArrayList(5);
            Session session = this.session;
            String property = session.getProperty("mail." + this.name + ".sasl.mechanisms");
            if (property != null && property.length() > 0) {
                if (this.logger.isLoggable(Level.FINE)) {
                    MailLogger mailLogger = this.logger;
                    mailLogger.fine("SASL mechanisms allowed: " + property);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(property, " ,");
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.length() > 0) {
                        arrayList.add(nextToken);
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            this.saslMechanisms = strArr;
            arrayList.toArray(strArr);
        }
        String[] strArr2 = this.saslMechanisms;
        if (strArr2 == null) {
            return null;
        }
        return (String[]) strArr2.clone();
    }

    public synchronized String getSASLRealm() {
        if (this.saslRealm == UNKNOWN) {
            Session session = this.session;
            String property = session.getProperty("mail." + this.name + ".sasl.realm");
            this.saslRealm = property;
            if (property == null) {
                Session session2 = this.session;
                this.saslRealm = session2.getProperty("mail." + this.name + ".saslrealm");
            }
        }
        return this.saslRealm;
    }

    public synchronized boolean getStartTLS() {
        return this.useStartTLS;
    }

    public synchronized boolean getUseCanonicalHostName() {
        return this.useCanonicalHostName;
    }

    public synchronized boolean getUseRset() {
        return this.useRset;
    }

    /* access modifiers changed from: protected */
    public void helo(String str) throws MessagingException {
        if (str != null) {
            issueCommand("HELO " + str, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            return;
        }
        issueCommand("HELO", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:28|29|30|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        closeConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isConnected() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = super.isConnected()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            boolean r0 = r3.useRset     // Catch:{ Exception -> 0x0034 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "RSET"
            r3.sendCommand((java.lang.String) r0)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0019
        L_0x0014:
            java.lang.String r0 = "NOOP"
            r3.sendCommand((java.lang.String) r0)     // Catch:{ Exception -> 0x0034 }
        L_0x0019:
            int r0 = r3.readServerResponse()     // Catch:{ Exception -> 0x0034 }
            if (r0 < 0) goto L_0x002f
            boolean r2 = r3.noopStrict     // Catch:{ Exception -> 0x0034 }
            if (r2 == 0) goto L_0x0028
            r2 = 250(0xfa, float:3.5E-43)
            if (r0 != r2) goto L_0x002f
            goto L_0x002c
        L_0x0028:
            r2 = 421(0x1a5, float:5.9E-43)
            if (r0 == r2) goto L_0x002f
        L_0x002c:
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x002f:
            r3.closeConnection()     // Catch:{ MessagingException -> 0x0032 }
        L_0x0032:
            monitor-exit(r3)
            return r1
        L_0x0034:
            r3.closeConnection()     // Catch:{ MessagingException -> 0x0037 }
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.isConnected():boolean");
    }

    public synchronized boolean isSSL() {
        return this.serverSocket instanceof SSLSocket;
    }

    public synchronized void issueCommand(String str, int i) throws MessagingException {
        sendCommand(str);
        int readServerResponse = readServerResponse();
        if (i != -1) {
            if (readServerResponse != i) {
                throw new MessagingException(this.lastServerResponse);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void mailFrom() throws MessagingException {
        Address address;
        Address[] from;
        MimeMessage mimeMessage = this.message;
        String str = null;
        String envelopeFrom = mimeMessage instanceof SMTPMessage ? ((SMTPMessage) mimeMessage).getEnvelopeFrom() : null;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            envelopeFrom = this.session.getProperty("mail." + this.name + ".from");
        }
        boolean z = false;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            MimeMessage mimeMessage2 = this.message;
            if (mimeMessage2 == null || (from = mimeMessage2.getFrom()) == null || from.length <= 0) {
                address = InternetAddress.getLocalAddress(this.session);
            } else {
                address = from[0];
            }
            if (address != null) {
                envelopeFrom = ((InternetAddress) address).getAddress();
            } else {
                throw new MessagingException("can't determine local email address");
            }
        }
        String str2 = "MAIL FROM:" + normalizeAddress(envelopeFrom);
        if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
            str2 = str2 + " SMTPUTF8";
        }
        if (supportsExtension("DSN")) {
            MimeMessage mimeMessage3 = this.message;
            String dSNRet = mimeMessage3 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage3).getDSNRet() : null;
            if (dSNRet == null) {
                dSNRet = this.session.getProperty("mail." + this.name + ".dsn.ret");
            }
            if (dSNRet != null) {
                str2 = str2 + " RET=" + dSNRet;
            }
        }
        if (supportsExtension("AUTH")) {
            MimeMessage mimeMessage4 = this.message;
            String submitter = mimeMessage4 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage4).getSubmitter() : null;
            if (submitter == null) {
                submitter = this.session.getProperty("mail." + this.name + ".submitter");
            }
            if (submitter != null) {
                try {
                    if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
                        z = true;
                    }
                    str2 = str2 + " AUTH=" + xtext(submitter, z);
                } catch (IllegalArgumentException e) {
                    MailLogger mailLogger = this.logger;
                    Level level = Level.FINE;
                    if (mailLogger.isLoggable(level)) {
                        this.logger.log(level, "ignoring invalid submitter: " + submitter, (Throwable) e);
                    }
                }
            }
        }
        MimeMessage mimeMessage5 = this.message;
        if (mimeMessage5 instanceof SMTPMessage) {
            str = ((SMTPMessage) mimeMessage5).getMailExtension();
        }
        if (str == null) {
            str = this.session.getProperty("mail." + this.name + ".mailextension");
        }
        if (str != null && str.length() > 0) {
            str2 = str2 + " " + str;
        }
        try {
            issueSendCommand(str2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        } catch (SMTPSendFailedException e2) {
            int returnCode = e2.getReturnCode();
            if (returnCode == 501 || returnCode == 503 || returnCode == 553 || returnCode == 550 || returnCode == 551) {
                try {
                    e2.setNextException(new SMTPSenderFailedException(new InternetAddress(envelopeFrom), str2, returnCode, e2.getMessage()));
                } catch (AddressException unused) {
                }
            }
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public void notifyTransportListeners(int i, Address[] addressArr, Address[] addressArr2, Address[] addressArr3, Message message2) {
        if (!this.notificationDone) {
            super.notifyTransportListeners(i, addressArr, addressArr2, addressArr3, message2);
            this.notificationDone = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x01aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean protocolConnect(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13) throws javax.mail.MessagingException {
        /*
            r9 = this;
            monitor-enter(r9)
            javax.mail.Session r0 = r9.session     // Catch:{ all -> 0x01ab }
            java.util.Properties r0 = r0.getProperties()     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r1.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = "mail."
            r1.append(r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r9.name     // Catch:{ all -> 0x01ab }
            r1.append(r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = ".auth"
            r1.append(r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01ab }
            r2 = 0
            boolean r1 = com.sun.mail.util.PropUtil.getBooleanProperty(r0, r1, r2)     // Catch:{ all -> 0x01ab }
            if (r1 == 0) goto L_0x006b
            if (r12 == 0) goto L_0x002a
            if (r13 != 0) goto L_0x006b
        L_0x002a:
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01ab }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x01ab }
            boolean r11 = r11.isLoggable(r0)     // Catch:{ all -> 0x01ab }
            if (r11 == 0) goto L_0x0069
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "need username and password for authentication"
            r11.fine(r0)     // Catch:{ all -> 0x01ab }
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r0.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = "protocolConnect returning false, host="
            r0.append(r1)     // Catch:{ all -> 0x01ab }
            r0.append(r10)     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = ", user="
            r0.append(r10)     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = r9.traceUser(r12)     // Catch:{ all -> 0x01ab }
            r0.append(r10)     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = ", password="
            r0.append(r10)     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = r9.tracePassword(r13)     // Catch:{ all -> 0x01ab }
            r0.append(r10)     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x01ab }
            r11.fine(r10)     // Catch:{ all -> 0x01ab }
        L_0x0069:
            monitor-exit(r9)
            return r2
        L_0x006b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r3.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "mail."
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = r9.name     // Catch:{ all -> 0x01ab }
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = ".ehlo"
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01ab }
            r4 = 1
            boolean r3 = com.sun.mail.util.PropUtil.getBooleanProperty(r0, r3, r4)     // Catch:{ all -> 0x01ab }
            com.sun.mail.util.MailLogger r5 = r9.logger     // Catch:{ all -> 0x01ab }
            java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ all -> 0x01ab }
            boolean r5 = r5.isLoggable(r6)     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x00b0
            com.sun.mail.util.MailLogger r5 = r9.logger     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r7.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r8 = "useEhlo "
            r7.append(r8)     // Catch:{ all -> 0x01ab }
            r7.append(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r8 = ", useAuth "
            r7.append(r8)     // Catch:{ all -> 0x01ab }
            r7.append(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01ab }
            r5.fine(r7)     // Catch:{ all -> 0x01ab }
        L_0x00b0:
            r5 = -1
            if (r11 != r5) goto L_0x00cf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r11.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = "mail."
            r11.append(r7)     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = r9.name     // Catch:{ all -> 0x01ab }
            r11.append(r7)     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = ".port"
            r11.append(r7)     // Catch:{ all -> 0x01ab }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01ab }
            int r11 = com.sun.mail.util.PropUtil.getIntProperty(r0, r11, r5)     // Catch:{ all -> 0x01ab }
        L_0x00cf:
            if (r11 != r5) goto L_0x00d3
            int r11 = r9.defaultPort     // Catch:{ all -> 0x01ab }
        L_0x00d3:
            if (r10 == 0) goto L_0x00db
            int r0 = r10.length()     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            java.lang.String r10 = "localhost"
        L_0x00dd:
            java.net.Socket r0 = r9.serverSocket     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x00e5
            r9.openServer()     // Catch:{ all -> 0x01a6 }
            goto L_0x00e8
        L_0x00e5:
            r9.openServer(r10, r11)     // Catch:{ all -> 0x01a6 }
        L_0x00e8:
            if (r3 == 0) goto L_0x00f2
            java.lang.String r11 = r9.getLocalHost()     // Catch:{ all -> 0x01a6 }
            boolean r2 = r9.ehlo(r11)     // Catch:{ all -> 0x01a6 }
        L_0x00f2:
            if (r2 != 0) goto L_0x00fb
            java.lang.String r11 = r9.getLocalHost()     // Catch:{ all -> 0x01a6 }
            r9.helo(r11)     // Catch:{ all -> 0x01a6 }
        L_0x00fb:
            boolean r11 = r9.useStartTLS     // Catch:{ all -> 0x01a6 }
            if (r11 != 0) goto L_0x0103
            boolean r11 = r9.requireStartTLS     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x0128
        L_0x0103:
            java.net.Socket r11 = r9.serverSocket     // Catch:{ all -> 0x01a6 }
            boolean r11 = r11 instanceof javax.net.ssl.SSLSocket     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x0111
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = "STARTTLS requested but already using SSL"
            r11.fine(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x0128
        L_0x0111:
            java.lang.String r11 = "STARTTLS"
            boolean r11 = r9.supportsExtension(r11)     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x0124
            r9.startTLS()     // Catch:{ all -> 0x01a6 }
            java.lang.String r11 = r9.getLocalHost()     // Catch:{ all -> 0x01a6 }
            r9.ehlo(r11)     // Catch:{ all -> 0x01a6 }
            goto L_0x0128
        L_0x0124:
            boolean r11 = r9.requireStartTLS     // Catch:{ all -> 0x01a6 }
            if (r11 != 0) goto L_0x0197
        L_0x0128:
            boolean r11 = r9.allowutf8     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x013d
            java.lang.String r11 = "SMTPUTF8"
            boolean r11 = r9.supportsExtension(r11)     // Catch:{ all -> 0x01a6 }
            if (r11 != 0) goto L_0x013d
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01a6 }
            java.util.logging.Level r0 = java.util.logging.Level.INFO     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "mail.mime.allowutf8 set but server doesn't advertise SMTPUTF8 support"
            r11.log(r0, r2)     // Catch:{ all -> 0x01a6 }
        L_0x013d:
            if (r1 != 0) goto L_0x0143
            if (r12 == 0) goto L_0x0154
            if (r13 == 0) goto L_0x0154
        L_0x0143:
            java.lang.String r11 = "AUTH"
            boolean r11 = r9.supportsExtension(r11)     // Catch:{ all -> 0x01a6 }
            if (r11 != 0) goto L_0x0156
            java.lang.String r11 = "AUTH=LOGIN"
            boolean r11 = r9.supportsExtension(r11)     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            monitor-exit(r9)
            return r4
        L_0x0156:
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01a6 }
            boolean r11 = r11.isLoggable(r6)     // Catch:{ all -> 0x01a6 }
            if (r11 == 0) goto L_0x018c
            com.sun.mail.util.MailLogger r11 = r9.logger     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "protocolConnect login, host="
            r0.append(r1)     // Catch:{ all -> 0x01a6 }
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = ", user="
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = r9.traceUser(r12)     // Catch:{ all -> 0x01a6 }
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = ", password="
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = r9.tracePassword(r13)     // Catch:{ all -> 0x01a6 }
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x01a6 }
            r11.fine(r10)     // Catch:{ all -> 0x01a6 }
        L_0x018c:
            boolean r10 = r9.authenticate(r12, r13)     // Catch:{ all -> 0x01a6 }
            if (r10 != 0) goto L_0x0195
            r9.closeConnection()     // Catch:{ MessagingException -> 0x0195 }
        L_0x0195:
            monitor-exit(r9)
            return r10
        L_0x0197:
            com.sun.mail.util.MailLogger r10 = r9.logger     // Catch:{ all -> 0x01a6 }
            java.lang.String r11 = "STARTTLS required but not supported"
            r10.fine(r11)     // Catch:{ all -> 0x01a6 }
            javax.mail.MessagingException r10 = new javax.mail.MessagingException     // Catch:{ all -> 0x01a6 }
            java.lang.String r11 = "STARTTLS is required but host does not support STARTTLS"
            r10.<init>(r11)     // Catch:{ all -> 0x01a6 }
            throw r10     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r10 = move-exception
            r9.closeConnection()     // Catch:{ MessagingException -> 0x01aa }
        L_0x01aa:
            throw r10     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.protocolConnect(java.lang.String, int, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r7.logger.log(java.util.logging.Level.FINE, "close failed", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0306, code lost:
        r7.lastServerResponse = r1;
        r7.lastReturnCode = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0152, code lost:
        if (r4 != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        r1.add(r11);
        r9 = new com.sun.mail.smtp.SMTPAddressFailedException(r11, r6, r13, r7.lastServerResponse);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r12 != null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0162, code lost:
        r12.setNextException(r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x02e7 */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0195 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void rcptTo() throws javax.mail.MessagingException {
        /*
            r16 = this;
            r7 = r16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r7.invalidAddr = r3
            r7.validUnsentAddr = r3
            r7.validSentAddr = r3
            javax.mail.internet.MimeMessage r4 = r7.message
            boolean r5 = r4 instanceof com.sun.mail.smtp.SMTPMessage
            r6 = 0
            if (r5 == 0) goto L_0x0026
            com.sun.mail.smtp.SMTPMessage r4 = (com.sun.mail.smtp.SMTPMessage) r4
            boolean r4 = r4.getSendPartial()
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            java.lang.String r5 = "mail."
            if (r4 != 0) goto L_0x004b
            javax.mail.Session r4 = r7.session
            java.util.Properties r4 = r4.getProperties()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r9 = r7.name
            r8.append(r9)
            java.lang.String r9 = ".sendpartial"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r4 = com.sun.mail.util.PropUtil.getBooleanProperty(r4, r8, r6)
        L_0x004b:
            if (r4 == 0) goto L_0x0054
            com.sun.mail.util.MailLogger r8 = r7.logger
            java.lang.String r9 = "sendPartial set"
            r8.fine(r9)
        L_0x0054:
            java.lang.String r8 = "DSN"
            boolean r8 = r7.supportsExtension(r8)
            if (r8 == 0) goto L_0x008c
            javax.mail.internet.MimeMessage r8 = r7.message
            boolean r10 = r8 instanceof com.sun.mail.smtp.SMTPMessage
            if (r10 == 0) goto L_0x0069
            com.sun.mail.smtp.SMTPMessage r8 = (com.sun.mail.smtp.SMTPMessage) r8
            java.lang.String r8 = r8.getDSNNotify()
            goto L_0x006a
        L_0x0069:
            r8 = r3
        L_0x006a:
            if (r8 != 0) goto L_0x0088
            javax.mail.Session r8 = r7.session
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = r7.name
            r10.append(r5)
            java.lang.String r5 = ".dsn.notify"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r8 = r8.getProperty(r5)
        L_0x0088:
            if (r8 == 0) goto L_0x008d
            r5 = 1
            goto L_0x008e
        L_0x008c:
            r8 = r3
        L_0x008d:
            r5 = 0
        L_0x008e:
            r12 = r3
            r3 = 0
            r10 = 0
        L_0x0091:
            javax.mail.Address[] r11 = r7.addresses
            int r13 = r11.length
            r14 = -1
            java.lang.String r15 = "RSET"
            if (r3 >= r13) goto L_0x0195
            r11 = r11[r3]
            javax.mail.internet.InternetAddress r11 = (javax.mail.internet.InternetAddress) r11
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r6 = "RCPT TO:"
            r13.append(r6)
            java.lang.String r6 = r11.getAddress()
            java.lang.String r6 = r7.normalizeAddress(r6)
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            if (r5 == 0) goto L_0x00cc
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            java.lang.String r6 = " NOTIFY="
            r13.append(r6)
            r13.append(r8)
            java.lang.String r6 = r13.toString()
        L_0x00cc:
            r7.sendCommand((java.lang.String) r6)
            int r13 = r16.readServerResponse()
            r9 = 250(0xfa, float:3.5E-43)
            if (r13 == r9) goto L_0x017a
            r9 = 251(0xfb, float:3.52E-43)
            if (r13 == r9) goto L_0x017a
            r9 = 501(0x1f5, float:7.02E-43)
            if (r13 == r9) goto L_0x0166
            r9 = 503(0x1f7, float:7.05E-43)
            if (r13 == r9) goto L_0x0166
            switch(r13) {
                case 450: goto L_0x0152;
                case 451: goto L_0x0152;
                case 452: goto L_0x0152;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            switch(r13) {
                case 550: goto L_0x0166;
                case 551: goto L_0x0166;
                case 552: goto L_0x0152;
                case 553: goto L_0x0166;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            r9 = 400(0x190, float:5.6E-43)
            if (r13 < r9) goto L_0x00f5
            r9 = 499(0x1f3, float:6.99E-43)
            if (r13 > r9) goto L_0x00f5
            r1.add(r11)
            goto L_0x0100
        L_0x00f5:
            r9 = 500(0x1f4, float:7.0E-43)
            if (r13 < r9) goto L_0x0113
            r9 = 599(0x257, float:8.4E-43)
            if (r13 > r9) goto L_0x0113
            r2.add(r11)
        L_0x0100:
            if (r4 != 0) goto L_0x0103
            r10 = 1
        L_0x0103:
            com.sun.mail.smtp.SMTPAddressFailedException r9 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r7.lastServerResponse
            r9.<init>(r11, r6, r13, r14)
            if (r12 != 0) goto L_0x010e
            goto L_0x018b
        L_0x010e:
            r12.setNextException(r9)
            goto L_0x0190
        L_0x0113:
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x013d
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "got response code "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ", with response: "
            r1.append(r2)
            java.lang.String r2 = r7.lastServerResponse
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
        L_0x013d:
            java.lang.String r0 = r7.lastServerResponse
            int r1 = r7.lastReturnCode
            java.net.Socket r2 = r7.serverSocket
            if (r2 == 0) goto L_0x0148
            r7.issueCommand(r15, r14)
        L_0x0148:
            r7.lastServerResponse = r0
            r7.lastReturnCode = r1
            com.sun.mail.smtp.SMTPAddressFailedException r1 = new com.sun.mail.smtp.SMTPAddressFailedException
            r1.<init>(r11, r6, r13, r0)
            throw r1
        L_0x0152:
            if (r4 != 0) goto L_0x0155
            r10 = 1
        L_0x0155:
            r1.add(r11)
            com.sun.mail.smtp.SMTPAddressFailedException r9 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r7.lastServerResponse
            r9.<init>(r11, r6, r13, r14)
            if (r12 != 0) goto L_0x0162
            goto L_0x018b
        L_0x0162:
            r12.setNextException(r9)
            goto L_0x0190
        L_0x0166:
            if (r4 != 0) goto L_0x0169
            r10 = 1
        L_0x0169:
            r2.add(r11)
            com.sun.mail.smtp.SMTPAddressFailedException r9 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r7.lastServerResponse
            r9.<init>(r11, r6, r13, r14)
            if (r12 != 0) goto L_0x0176
            goto L_0x018b
        L_0x0176:
            r12.setNextException(r9)
            goto L_0x0190
        L_0x017a:
            r0.add(r11)
            boolean r9 = r7.reportSuccess
            if (r9 != 0) goto L_0x0182
            goto L_0x0190
        L_0x0182:
            com.sun.mail.smtp.SMTPAddressSucceededException r9 = new com.sun.mail.smtp.SMTPAddressSucceededException
            java.lang.String r14 = r7.lastServerResponse
            r9.<init>(r11, r6, r13, r14)
            if (r12 != 0) goto L_0x018d
        L_0x018b:
            r12 = r9
            goto L_0x0190
        L_0x018d:
            r12.setNextException(r9)
        L_0x0190:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x0091
        L_0x0195:
            if (r4 == 0) goto L_0x019e
            int r3 = r0.size()
            if (r3 != 0) goto L_0x019e
            r10 = 1
        L_0x019e:
            if (r10 == 0) goto L_0x01e7
            int r3 = r2.size()
            javax.mail.Address[] r3 = new javax.mail.Address[r3]
            r7.invalidAddr = r3
            r2.toArray(r3)
            int r2 = r0.size()
            int r3 = r1.size()
            int r2 = r2 + r3
            javax.mail.Address[] r2 = new javax.mail.Address[r2]
            r7.validUnsentAddr = r2
            r2 = 0
            r3 = 0
        L_0x01ba:
            int r4 = r0.size()
            if (r2 >= r4) goto L_0x01d0
            javax.mail.Address[] r4 = r7.validUnsentAddr
            int r5 = r3 + 1
            java.lang.Object r6 = r0.get(r2)
            javax.mail.Address r6 = (javax.mail.Address) r6
            r4[r3] = r6
            int r2 = r2 + 1
            r3 = r5
            goto L_0x01ba
        L_0x01d0:
            r0 = 0
        L_0x01d1:
            int r2 = r1.size()
            if (r0 >= r2) goto L_0x0225
            javax.mail.Address[] r2 = r7.validUnsentAddr
            int r4 = r3 + 1
            java.lang.Object r5 = r1.get(r0)
            javax.mail.Address r5 = (javax.mail.Address) r5
            r2[r3] = r5
            int r0 = r0 + 1
            r3 = r4
            goto L_0x01d1
        L_0x01e7:
            boolean r3 = r7.reportSuccess
            if (r3 != 0) goto L_0x01ff
            if (r4 == 0) goto L_0x01fa
            int r3 = r2.size()
            if (r3 > 0) goto L_0x01ff
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x01fa
            goto L_0x01ff
        L_0x01fa:
            javax.mail.Address[] r0 = r7.addresses
            r7.validSentAddr = r0
            goto L_0x0225
        L_0x01ff:
            r3 = 1
            r7.sendPartiallyFailed = r3
            r7.exception = r12
            int r3 = r2.size()
            javax.mail.Address[] r3 = new javax.mail.Address[r3]
            r7.invalidAddr = r3
            r2.toArray(r3)
            int r2 = r1.size()
            javax.mail.Address[] r2 = new javax.mail.Address[r2]
            r7.validUnsentAddr = r2
            r1.toArray(r2)
            int r1 = r0.size()
            javax.mail.Address[] r1 = new javax.mail.Address[r1]
            r7.validSentAddr = r1
            r0.toArray(r1)
        L_0x0225:
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x02be
            javax.mail.Address[] r0 = r7.validSentAddr
            java.lang.String r1 = "  "
            if (r0 == 0) goto L_0x0260
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0260
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.String r2 = "Verified Addresses"
            r0.fine(r2)
            r0 = 0
        L_0x0240:
            javax.mail.Address[] r2 = r7.validSentAddr
            int r2 = r2.length
            if (r0 >= r2) goto L_0x0260
            com.sun.mail.util.MailLogger r2 = r7.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            javax.mail.Address[] r4 = r7.validSentAddr
            r4 = r4[r0]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            int r0 = r0 + 1
            goto L_0x0240
        L_0x0260:
            javax.mail.Address[] r0 = r7.validUnsentAddr
            if (r0 == 0) goto L_0x028f
            int r0 = r0.length
            if (r0 <= 0) goto L_0x028f
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.String r2 = "Valid Unsent Addresses"
            r0.fine(r2)
            r0 = 0
        L_0x026f:
            javax.mail.Address[] r2 = r7.validUnsentAddr
            int r2 = r2.length
            if (r0 >= r2) goto L_0x028f
            com.sun.mail.util.MailLogger r2 = r7.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            javax.mail.Address[] r4 = r7.validUnsentAddr
            r4 = r4[r0]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            int r0 = r0 + 1
            goto L_0x026f
        L_0x028f:
            javax.mail.Address[] r0 = r7.invalidAddr
            if (r0 == 0) goto L_0x02be
            int r0 = r0.length
            if (r0 <= 0) goto L_0x02be
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.String r2 = "Invalid Addresses"
            r0.fine(r2)
            r6 = 0
        L_0x029e:
            javax.mail.Address[] r0 = r7.invalidAddr
            int r0 = r0.length
            if (r6 >= r0) goto L_0x02be
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            javax.mail.Address[] r3 = r7.invalidAddr
            r3 = r3[r6]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.fine(r2)
            int r6 = r6 + 1
            goto L_0x029e
        L_0x02be:
            if (r10 == 0) goto L_0x030b
            com.sun.mail.util.MailLogger r0 = r7.logger
            java.lang.String r1 = "Sending failed because of invalid destination addresses"
            r0.fine(r1)
            r2 = 2
            javax.mail.Address[] r3 = r7.validSentAddr
            javax.mail.Address[] r4 = r7.validUnsentAddr
            javax.mail.Address[] r5 = r7.invalidAddr
            javax.mail.internet.MimeMessage r6 = r7.message
            r1 = r16
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)
            java.lang.String r1 = r7.lastServerResponse
            int r2 = r7.lastReturnCode
            java.net.Socket r0 = r7.serverSocket     // Catch:{ MessagingException -> 0x02e7 }
            if (r0 == 0) goto L_0x02e0
            r7.issueCommand(r15, r14)     // Catch:{ MessagingException -> 0x02e7 }
        L_0x02e0:
            r7.lastServerResponse = r1
            r7.lastReturnCode = r2
            goto L_0x02f7
        L_0x02e5:
            r0 = move-exception
            goto L_0x0306
        L_0x02e7:
            r16.close()     // Catch:{ MessagingException -> 0x02eb }
            goto L_0x02e0
        L_0x02eb:
            r0 = move-exception
            r3 = r0
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch:{ all -> 0x02e5 }
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch:{ all -> 0x02e5 }
            java.lang.String r5 = "close failed"
            r0.log((java.util.logging.Level) r4, (java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x02e5 }
            goto L_0x02e0
        L_0x02f7:
            javax.mail.SendFailedException r0 = new javax.mail.SendFailedException
            javax.mail.Address[] r13 = r7.validSentAddr
            javax.mail.Address[] r14 = r7.validUnsentAddr
            javax.mail.Address[] r15 = r7.invalidAddr
            java.lang.String r11 = "Invalid Addresses"
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            throw r0
        L_0x0306:
            r7.lastServerResponse = r1
            r7.lastReturnCode = r2
            throw r0
        L_0x030b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.rcptTo():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r6.logger.log(java.util.logging.Level.FINE, "close failed", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r6.logger.log(java.util.logging.Level.FINE, "close failed", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x004f, B:21:0x005c] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readServerResponse() throws javax.mail.MessagingException {
        /*
            r6 = this;
            java.lang.String r0 = "close failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
        L_0x0009:
            r2 = 0
            com.sun.mail.util.LineInputStream r3 = r6.lineInputStream     // Catch:{ IOException -> 0x0079 }
            java.lang.String r3 = r3.readLine()     // Catch:{ IOException -> 0x0079 }
            r4 = -1
            if (r3 != 0) goto L_0x002d
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0079 }
            int r1 = r0.length()     // Catch:{ IOException -> 0x0079 }
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "[EOF]"
        L_0x001f:
            r6.lastServerResponse = r0     // Catch:{ IOException -> 0x0079 }
            r6.lastReturnCode = r4     // Catch:{ IOException -> 0x0079 }
            com.sun.mail.util.MailLogger r1 = r6.logger     // Catch:{ IOException -> 0x0079 }
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0079 }
            java.lang.String r5 = "EOF: {0}"
            r1.log((java.util.logging.Level) r3, (java.lang.String) r5, (java.lang.Object) r0)     // Catch:{ IOException -> 0x0079 }
            return r4
        L_0x002d:
            r1.append(r3)     // Catch:{ IOException -> 0x0079 }
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch:{ IOException -> 0x0079 }
            boolean r3 = r6.isNotLastLine(r3)     // Catch:{ IOException -> 0x0079 }
            if (r3 != 0) goto L_0x0009
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0079 }
            int r3 = r1.length()
            r5 = 3
            if (r3 < r5) goto L_0x0068
            java.lang.String r2 = r1.substring(r2, r5)     // Catch:{ NumberFormatException -> 0x005c, StringIndexOutOfBoundsException -> 0x004f }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005c, StringIndexOutOfBoundsException -> 0x004f }
            goto L_0x0069
        L_0x004f:
            r6.close()     // Catch:{ MessagingException -> 0x0053 }
            goto L_0x0068
        L_0x0053:
            r2 = move-exception
            com.sun.mail.util.MailLogger r3 = r6.logger
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log((java.util.logging.Level) r5, (java.lang.String) r0, (java.lang.Throwable) r2)
            goto L_0x0068
        L_0x005c:
            r6.close()     // Catch:{ MessagingException -> 0x0060 }
            goto L_0x0068
        L_0x0060:
            r2 = move-exception
            com.sun.mail.util.MailLogger r3 = r6.logger
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log((java.util.logging.Level) r5, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x0068:
            r0 = -1
        L_0x0069:
            if (r0 != r4) goto L_0x0074
            com.sun.mail.util.MailLogger r2 = r6.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "bad server response: {0}"
            r2.log((java.util.logging.Level) r3, (java.lang.String) r4, (java.lang.Object) r1)
        L_0x0074:
            r6.lastServerResponse = r1
            r6.lastReturnCode = r0
            return r0
        L_0x0079:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r6.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "exception reading response"
            r1.log((java.util.logging.Level) r3, (java.lang.String) r4, (java.lang.Throwable) r0)
            java.lang.String r1 = ""
            r6.lastServerResponse = r1
            r6.lastReturnCode = r2
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "Exception reading response"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.readServerResponse():int");
    }

    /* access modifiers changed from: protected */
    public void sendCommand(String str) throws MessagingException {
        sendCommand(toBytes(str));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:63|64|(3:66|67|68)|69|70|71) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:55|56|57|58|59|60|61|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0189 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x0154=Splitter:B:60:0x0154, B:69:0x0189=Splitter:B:69:0x0189} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sendMessage(javax.mail.Message r19, javax.mail.Address[] r20) throws javax.mail.MessagingException, javax.mail.SendFailedException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            monitor-enter(r18)
            if (r0 == 0) goto L_0x000e
            java.lang.String r2 = r19.getSubject()     // Catch:{ all -> 0x01c3 }
            goto L_0x0010
        L_0x000e:
            java.lang.String r2 = ""
        L_0x0010:
            r7.sendMessageStart(r2)     // Catch:{ all -> 0x01c3 }
            r18.checkConnected()     // Catch:{ all -> 0x01c3 }
            boolean r2 = r0 instanceof javax.mail.internet.MimeMessage     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x01b4
            if (r1 == 0) goto L_0x01ac
            int r2 = r1.length     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x01ac
            r8 = 0
            r2 = 0
        L_0x0021:
            int r3 = r1.length     // Catch:{ all -> 0x01c3 }
            if (r2 >= r3) goto L_0x0046
            r3 = r1[r2]     // Catch:{ all -> 0x01c3 }
            boolean r3 = r3 instanceof javax.mail.internet.InternetAddress     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x002d
            int r2 = r2 + 1
            goto L_0x0021
        L_0x002d:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r1 = r1[r2]     // Catch:{ all -> 0x01c3 }
            r3.append(r1)     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = " is not an InternetAddress"
            r3.append(r1)     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01c3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x0046:
            r2 = r0
            javax.mail.internet.MimeMessage r2 = (javax.mail.internet.MimeMessage) r2     // Catch:{ all -> 0x01c3 }
            r7.message = r2     // Catch:{ all -> 0x01c3 }
            r7.addresses = r1     // Catch:{ all -> 0x01c3 }
            r7.validUnsentAddr = r1     // Catch:{ all -> 0x01c3 }
            r18.expandGroups()     // Catch:{ all -> 0x01c3 }
            boolean r1 = r0 instanceof com.sun.mail.smtp.SMTPMessage     // Catch:{ all -> 0x01c3 }
            if (r1 == 0) goto L_0x005d
            com.sun.mail.smtp.SMTPMessage r0 = (com.sun.mail.smtp.SMTPMessage) r0     // Catch:{ all -> 0x01c3 }
            boolean r0 = r0.getAllow8bitMIME()     // Catch:{ all -> 0x01c3 }
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 != 0) goto L_0x0082
            javax.mail.Session r0 = r7.session     // Catch:{ all -> 0x01c3 }
            java.util.Properties r0 = r0.getProperties()     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r1.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = "mail."
            r1.append(r2)     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = r7.name     // Catch:{ all -> 0x01c3 }
            r1.append(r2)     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = ".allow8bitmime"
            r1.append(r2)     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c3 }
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanProperty(r0, r1, r8)     // Catch:{ all -> 0x01c3 }
        L_0x0082:
            com.sun.mail.util.MailLogger r1 = r7.logger     // Catch:{ all -> 0x01c3 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x01c3 }
            boolean r1 = r1.isLoggable(r2)     // Catch:{ all -> 0x01c3 }
            if (r1 == 0) goto L_0x00a2
            com.sun.mail.util.MailLogger r1 = r7.logger     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r2.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "use8bit "
            r2.append(r3)     // Catch:{ all -> 0x01c3 }
            r2.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01c3 }
            r1.fine(r2)     // Catch:{ all -> 0x01c3 }
        L_0x00a2:
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "8BITMIME"
            boolean r0 = r7.supportsExtension(r0)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x00b9
            javax.mail.internet.MimeMessage r0 = r7.message     // Catch:{ all -> 0x01c3 }
            boolean r0 = r7.convertTo8Bit(r0)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x00b9
            javax.mail.internet.MimeMessage r0 = r7.message     // Catch:{ MessagingException -> 0x00b9 }
            r0.saveChanges()     // Catch:{ MessagingException -> 0x00b9 }
        L_0x00b9:
            r9 = 0
            r18.mailFrom()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r18.rcptTo()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            int r0 = r7.chunkSize     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            if (r0 <= 0) goto L_0x00db
            java.lang.String r0 = "CHUNKING"
            boolean r0 = r7.supportsExtension(r0)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            if (r0 == 0) goto L_0x00db
            javax.mail.internet.MimeMessage r0 = r7.message     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.io.OutputStream r1 = r18.bdat()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String[] r2 = ignoreList     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r0.writeTo(r1, r2)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r18.finishBdat()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            goto L_0x00e9
        L_0x00db:
            javax.mail.internet.MimeMessage r0 = r7.message     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.io.OutputStream r1 = r18.data()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String[] r2 = ignoreList     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r0.writeTo(r1, r2)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r18.finishData()     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
        L_0x00e9:
            boolean r0 = r7.sendPartiallyFailed     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            if (r0 != 0) goto L_0x0117
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String r1 = "message successfully delivered to mail server"
            r0.fine(r1)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r2 = 1
            javax.mail.Address[] r3 = r7.validSentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r4 = r7.validUnsentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r5 = r7.invalidAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.internet.MimeMessage r6 = r7.message     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r1 = r18
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r7.invalidAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.validUnsentAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.validSentAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.addresses = r9     // Catch:{ all -> 0x01c3 }
            r7.message = r9     // Catch:{ all -> 0x01c3 }
            r7.exception = r9     // Catch:{ all -> 0x01c3 }
            r7.sendPartiallyFailed = r8     // Catch:{ all -> 0x01c3 }
            r7.notificationDone = r8     // Catch:{ all -> 0x01c3 }
            r18.sendMessageEnd()     // Catch:{ all -> 0x01c3 }
            monitor-exit(r18)
            return
        L_0x0117:
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String r1 = "Sending partially failed because of invalid destination addresses"
            r0.fine(r1)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r2 = 3
            javax.mail.Address[] r3 = r7.validSentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r4 = r7.validUnsentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r5 = r7.invalidAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.internet.MimeMessage r6 = r7.message     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r1 = r18
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            com.sun.mail.smtp.SMTPSendFailedException r0 = new com.sun.mail.smtp.SMTPSendFailedException     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String r11 = "."
            int r12 = r7.lastReturnCode     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            java.lang.String r13 = r7.lastServerResponse     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.MessagingException r14 = r7.exception     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r15 = r7.validSentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r1 = r7.validUnsentAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            javax.mail.Address[] r2 = r7.invalidAddr     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            r10 = r0
            r16 = r1
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
            throw r0     // Catch:{ MessagingException -> 0x016d, IOException -> 0x0147 }
        L_0x0145:
            r0 = move-exception
            goto L_0x019b
        L_0x0147:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r7.logger     // Catch:{ all -> 0x0145 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "IOException while sending, closing"
            r1.log((java.util.logging.Level) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0145 }
            r18.closeConnection()     // Catch:{ MessagingException -> 0x0154 }
        L_0x0154:
            r18.addressesFailed()     // Catch:{ all -> 0x0145 }
            r2 = 2
            javax.mail.Address[] r3 = r7.validSentAddr     // Catch:{ all -> 0x0145 }
            javax.mail.Address[] r4 = r7.validUnsentAddr     // Catch:{ all -> 0x0145 }
            javax.mail.Address[] r5 = r7.invalidAddr     // Catch:{ all -> 0x0145 }
            javax.mail.internet.MimeMessage r6 = r7.message     // Catch:{ all -> 0x0145 }
            r1 = r18
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0145 }
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = "IOException while sending message"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0145 }
            throw r1     // Catch:{ all -> 0x0145 }
        L_0x016d:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r7.logger     // Catch:{ all -> 0x0145 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "MessagingException while sending"
            r1.log((java.util.logging.Level) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0145 }
            java.lang.Exception r1 = r0.getNextException()     // Catch:{ all -> 0x0145 }
            boolean r1 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x0189
            com.sun.mail.util.MailLogger r1 = r7.logger     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = "nested IOException, closing"
            r1.fine(r2)     // Catch:{ all -> 0x0145 }
            r18.closeConnection()     // Catch:{ MessagingException -> 0x0189 }
        L_0x0189:
            r18.addressesFailed()     // Catch:{ all -> 0x0145 }
            r2 = 2
            javax.mail.Address[] r3 = r7.validSentAddr     // Catch:{ all -> 0x0145 }
            javax.mail.Address[] r4 = r7.validUnsentAddr     // Catch:{ all -> 0x0145 }
            javax.mail.Address[] r5 = r7.invalidAddr     // Catch:{ all -> 0x0145 }
            javax.mail.internet.MimeMessage r6 = r7.message     // Catch:{ all -> 0x0145 }
            r1 = r18
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x019b:
            r7.invalidAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.validUnsentAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.validSentAddr = r9     // Catch:{ all -> 0x01c3 }
            r7.addresses = r9     // Catch:{ all -> 0x01c3 }
            r7.message = r9     // Catch:{ all -> 0x01c3 }
            r7.exception = r9     // Catch:{ all -> 0x01c3 }
            r7.sendPartiallyFailed = r8     // Catch:{ all -> 0x01c3 }
            r7.notificationDone = r8     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01ac:
            javax.mail.SendFailedException r0 = new javax.mail.SendFailedException     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "No recipient addresses"
            r0.<init>(r1)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01b4:
            com.sun.mail.util.MailLogger r0 = r7.logger     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "Can only send RFC822 msgs"
            r0.fine(r1)     // Catch:{ all -> 0x01c3 }
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "SMTP can only send RFC822 messages"
            r0.<init>(r1)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.sendMessage(javax.mail.Message, javax.mail.Address[]):void");
    }

    public synchronized void setAuthorizationID(String str) {
        this.authorizationID = str;
    }

    public synchronized void setLocalHost(String str) {
        this.localHostName = str;
    }

    public synchronized void setNTLMDomain(String str) {
        this.ntlmDomain = str;
    }

    public synchronized void setNoopStrict(boolean z) {
        this.noopStrict = z;
    }

    public synchronized void setReportSuccess(boolean z) {
        this.reportSuccess = z;
    }

    public synchronized void setRequireStartTLS(boolean z) {
        this.requireStartTLS = z;
    }

    public synchronized void setSASLEnabled(boolean z) {
        this.enableSASL = z;
    }

    public synchronized void setSASLMechanisms(String[] strArr) {
        if (strArr != null) {
            strArr = (String[]) strArr.clone();
        }
        this.saslMechanisms = strArr;
    }

    public synchronized void setSASLRealm(String str) {
        this.saslRealm = str;
    }

    public synchronized void setStartTLS(boolean z) {
        this.useStartTLS = z;
    }

    public synchronized void setUseCanonicalHostName(boolean z) {
        this.useCanonicalHostName = z;
    }

    public synchronized void setUseRset(boolean z) {
        this.useRset = z;
    }

    public synchronized int simpleCommand(String str) throws MessagingException {
        sendCommand(str);
        return readServerResponse();
    }

    /* access modifiers changed from: protected */
    public void startTLS() throws MessagingException {
        issueCommand("STARTTLS", Opcodes.REM_INT_LIT8);
        try {
            Socket socket = this.serverSocket;
            String str = this.host;
            Properties properties = this.session.getProperties();
            this.serverSocket = SocketFetcher.startTLS(socket, str, properties, "mail." + this.name);
            initStreams();
        } catch (IOException e) {
            closeConnection();
            throw new MessagingException("Could not convert socket to TLS", e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean supportsAuthentication(String str) {
        String str2;
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null || (str2 = hashtable.get("AUTH")) == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (!str.equalsIgnoreCase("LOGIN") || !supportsExtension("AUTH=LOGIN")) {
            return false;
        }
        this.logger.fine("use AUTH=LOGIN hack");
        return true;
    }

    public boolean supportsExtension(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        return (hashtable == null || hashtable.get(str.toUpperCase(Locale.ENGLISH)) == null) ? false : true;
    }

    protected SMTPTransport(Session session, URLName uRLName, String str, boolean z) {
        super(session, uRLName);
        this.name = "smtp";
        this.defaultPort = 25;
        this.isSSL = false;
        this.sendPartiallyFailed = false;
        this.authenticators = new HashMap();
        this.quitWait = false;
        this.quitOnSessionReject = false;
        this.saslRealm = UNKNOWN;
        this.authorizationID = UNKNOWN;
        this.enableSASL = false;
        this.useCanonicalHostName = false;
        this.saslMechanisms = UNKNOWN_SA;
        this.ntlmDomain = UNKNOWN;
        this.noopStrict = true;
        this.noauthdebug = true;
        Properties properties = session.getProperties();
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG SMTP", session.getDebug(), session.getDebugOut());
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", (String) null);
        this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        this.debugusername = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.debugpassword = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        str = uRLName != null ? uRLName.getProtocol() : str;
        this.name = str;
        if (!z) {
            z = PropUtil.getBooleanProperty(properties, "mail." + str + ".ssl.enable", false);
        }
        if (z) {
            this.defaultPort = 465;
        } else {
            this.defaultPort = 25;
        }
        this.isSSL = z;
        this.quitWait = PropUtil.getBooleanProperty(properties, "mail." + str + ".quitwait", true);
        this.quitOnSessionReject = PropUtil.getBooleanProperty(properties, "mail." + str + ".quitonsessionreject", false);
        this.reportSuccess = PropUtil.getBooleanProperty(properties, "mail." + str + ".reportsuccess", false);
        this.useStartTLS = PropUtil.getBooleanProperty(properties, "mail." + str + ".starttls.enable", false);
        this.requireStartTLS = PropUtil.getBooleanProperty(properties, "mail." + str + ".starttls.required", false);
        this.useRset = PropUtil.getBooleanProperty(properties, "mail." + str + ".userset", false);
        this.noopStrict = PropUtil.getBooleanProperty(properties, "mail." + str + ".noop.strict", true);
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail." + str + ".sasl.enable", false);
        this.enableSASL = booleanProperty;
        if (booleanProperty) {
            this.logger.config("enable SASL");
        }
        boolean booleanProperty2 = PropUtil.getBooleanProperty(properties, "mail." + str + ".sasl.usecanonicalhostname", false);
        this.useCanonicalHostName = booleanProperty2;
        if (booleanProperty2) {
            this.logger.config("use canonical host name");
        }
        boolean booleanProperty3 = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        this.allowutf8 = booleanProperty3;
        if (booleanProperty3) {
            this.logger.config("allow UTF-8");
        }
        int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".chunksize", -1);
        this.chunkSize = intProperty;
        if (intProperty > 0 && this.logger.isLoggable(Level.CONFIG)) {
            MailLogger mailLogger2 = this.logger;
            mailLogger2.config("chunk size " + this.chunkSize);
        }
        Authenticator[] authenticatorArr = {new LoginAuthenticator(), new PlainAuthenticator(), new DigestMD5Authenticator(), new NtlmAuthenticator(), new OAuth2Authenticator()};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            this.authenticators.put(authenticatorArr[i].getMechanism(), authenticatorArr[i]);
            sb.append(authenticatorArr[i].getMechanism());
            sb.append(' ');
        }
        this.defaultAuthenticationMechanisms = sb.toString();
    }

    private void sendCommand(byte[] bArr) throws MessagingException {
        try {
            this.serverOutput.write(bArr);
            this.serverOutput.write(CRLF);
            this.serverOutput.flush();
        } catch (IOException e) {
            throw new MessagingException("Can't send command to SMTP host", e);
        }
    }

    protected static String xtext(String str, boolean z) {
        byte[] bArr;
        if (z) {
            bArr = str.getBytes(StandardCharsets.UTF_8);
        } else {
            bArr = ASCIIUtility.getBytes(str);
        }
        StringBuilder sb = null;
        int i = 0;
        while (i < bArr.length) {
            char c = (char) (bArr[i] & 255);
            if (z || c < 128) {
                if (c < '!' || c > '~' || c == '+' || c == '=') {
                    if (sb == null) {
                        sb = new StringBuilder(str.length() + 4);
                        sb.append(str.substring(0, i));
                    }
                    sb.append('+');
                    sb.append(hexchar[(c & 240) >> 4]);
                    sb.append(hexchar[c & 15]);
                } else if (sb != null) {
                    sb.append(c);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Non-ASCII character in SMTP submitter: " + str);
            }
        }
        return sb != null ? sb.toString() : str;
    }

    private class ChunkedOutputStream extends OutputStream {
        private final byte[] buf;
        private int count = 0;
        private final OutputStream out;

        public ChunkedOutputStream(OutputStream outputStream, int i) {
            this.out = outputStream;
            this.buf = new byte[i];
        }

        private void bdat(byte[] bArr, int i, int i2, boolean z) throws IOException {
            if (i2 > 0 || z) {
                if (z) {
                    try {
                        SMTPTransport sMTPTransport = SMTPTransport.this;
                        sMTPTransport.sendCommand("BDAT " + i2 + " LAST");
                    } catch (MessagingException e) {
                        throw new IOException("BDAT write exception", e);
                    }
                } else {
                    SMTPTransport sMTPTransport2 = SMTPTransport.this;
                    sMTPTransport2.sendCommand("BDAT " + i2);
                }
                this.out.write(bArr, i, i2);
                this.out.flush();
                if (SMTPTransport.this.readServerResponse() != 250) {
                    throw new IOException(SMTPTransport.this.lastServerResponse);
                }
            }
        }

        public void close() throws IOException {
            bdat(this.buf, 0, this.count, true);
            this.count = 0;
        }

        public void flush() throws IOException {
            bdat(this.buf, 0, this.count, false);
            this.count = 0;
        }

        public void write(int i) throws IOException {
            byte[] bArr = this.buf;
            int i2 = this.count;
            int i3 = i2 + 1;
            this.count = i3;
            bArr[i2] = (byte) i;
            if (i3 >= bArr.length) {
                flush();
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            while (i2 > 0) {
                int min = Math.min(this.buf.length - this.count, i2);
                byte[] bArr2 = this.buf;
                if (min == bArr2.length) {
                    bdat(bArr, i, min, false);
                } else {
                    System.arraycopy(bArr, i, bArr2, this.count, min);
                    this.count += min;
                }
                i += min;
                i2 -= min;
                if (this.count >= this.buf.length) {
                    flush();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int simpleCommand(byte[] bArr) throws MessagingException {
        sendCommand(bArr);
        return readServerResponse();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0086=Splitter:B:22:0x0086, B:31:0x00a8=Splitter:B:31:0x00a8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openServer() throws javax.mail.MessagingException {
        /*
            r9 = this;
            java.lang.String r0 = ", port: "
            java.lang.String r1 = "UNKNOWN"
            r9.host = r1
            r1 = -1
            java.net.Socket r2 = r9.serverSocket     // Catch:{ IOException -> 0x0140 }
            int r2 = r2.getPort()     // Catch:{ IOException -> 0x0140 }
            java.net.Socket r3 = r9.serverSocket     // Catch:{ IOException -> 0x013e }
            java.net.InetAddress r3 = r3.getInetAddress()     // Catch:{ IOException -> 0x013e }
            java.lang.String r3 = r3.getHostName()     // Catch:{ IOException -> 0x013e }
            r9.host = r3     // Catch:{ IOException -> 0x013e }
            com.sun.mail.util.MailLogger r3 = r9.logger     // Catch:{ IOException -> 0x013e }
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x013e }
            boolean r3 = r3.isLoggable(r4)     // Catch:{ IOException -> 0x013e }
            if (r3 == 0) goto L_0x0043
            com.sun.mail.util.MailLogger r3 = r9.logger     // Catch:{ IOException -> 0x013e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013e }
            r5.<init>()     // Catch:{ IOException -> 0x013e }
            java.lang.String r6 = "starting protocol to host \""
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            java.lang.String r6 = r9.host     // Catch:{ IOException -> 0x013e }
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            java.lang.String r6 = "\", port "
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            r5.append(r2)     // Catch:{ IOException -> 0x013e }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x013e }
            r3.fine(r5)     // Catch:{ IOException -> 0x013e }
        L_0x0043:
            r9.initStreams()     // Catch:{ IOException -> 0x013e }
            int r3 = r9.readServerResponse()     // Catch:{ IOException -> 0x013e }
            r5 = 220(0xdc, float:3.08E-43)
            java.lang.String r6 = "\", port: "
            if (r3 == r5) goto L_0x0117
            r5 = 0
            boolean r7 = r9.quitOnSessionReject     // Catch:{ Exception -> 0x0096 }
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = "QUIT"
            r9.sendCommand((java.lang.String) r7)     // Catch:{ Exception -> 0x0096 }
            boolean r7 = r9.quitWait     // Catch:{ Exception -> 0x0096 }
            if (r7 == 0) goto L_0x0086
            int r7 = r9.readServerResponse()     // Catch:{ Exception -> 0x0096 }
            r8 = 221(0xdd, float:3.1E-43)
            if (r7 == r8) goto L_0x0086
            if (r7 == r1) goto L_0x0086
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ Exception -> 0x0096 }
            boolean r1 = r1.isLoggable(r4)     // Catch:{ Exception -> 0x0096 }
            if (r1 == 0) goto L_0x0086
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ Exception -> 0x0096 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
            r4.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = "QUIT failed with "
            r4.append(r8)     // Catch:{ Exception -> 0x0096 }
            r4.append(r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0096 }
            r1.fine(r4)     // Catch:{ Exception -> 0x0096 }
        L_0x0086:
            java.net.Socket r1 = r9.serverSocket     // Catch:{ IOException -> 0x013e }
            r1.close()     // Catch:{ IOException -> 0x013e }
            r9.serverSocket = r5     // Catch:{ IOException -> 0x013e }
            r9.serverOutput = r5     // Catch:{ IOException -> 0x013e }
            r9.serverInput = r5     // Catch:{ IOException -> 0x013e }
        L_0x0091:
            r9.lineInputStream = r5     // Catch:{ IOException -> 0x013e }
            goto L_0x00b4
        L_0x0094:
            r1 = move-exception
            goto L_0x0109
        L_0x0096:
            r1 = move-exception
            com.sun.mail.util.MailLogger r4 = r9.logger     // Catch:{ all -> 0x0094 }
            java.util.logging.Level r7 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0094 }
            boolean r4 = r4.isLoggable(r7)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x00a8
            com.sun.mail.util.MailLogger r4 = r9.logger     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = "QUIT failed"
            r4.log((java.util.logging.Level) r7, (java.lang.String) r8, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0094 }
        L_0x00a8:
            java.net.Socket r1 = r9.serverSocket     // Catch:{ IOException -> 0x013e }
            r1.close()     // Catch:{ IOException -> 0x013e }
            r9.serverSocket = r5     // Catch:{ IOException -> 0x013e }
            r9.serverOutput = r5     // Catch:{ IOException -> 0x013e }
            r9.serverInput = r5     // Catch:{ IOException -> 0x013e }
            goto L_0x0091
        L_0x00b4:
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ IOException -> 0x013e }
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x013e }
            boolean r1 = r1.isLoggable(r4)     // Catch:{ IOException -> 0x013e }
            java.lang.String r4 = ", response: "
            if (r1 == 0) goto L_0x00e4
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ IOException -> 0x013e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013e }
            r5.<init>()     // Catch:{ IOException -> 0x013e }
            java.lang.String r7 = "got bad greeting from host \""
            r5.append(r7)     // Catch:{ IOException -> 0x013e }
            java.lang.String r7 = r9.host     // Catch:{ IOException -> 0x013e }
            r5.append(r7)     // Catch:{ IOException -> 0x013e }
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            r5.append(r2)     // Catch:{ IOException -> 0x013e }
            r5.append(r4)     // Catch:{ IOException -> 0x013e }
            r5.append(r3)     // Catch:{ IOException -> 0x013e }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x013e }
            r1.fine(r5)     // Catch:{ IOException -> 0x013e }
        L_0x00e4:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ IOException -> 0x013e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013e }
            r5.<init>()     // Catch:{ IOException -> 0x013e }
            java.lang.String r6 = "Got bad greeting from SMTP host: "
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            java.lang.String r6 = r9.host     // Catch:{ IOException -> 0x013e }
            r5.append(r6)     // Catch:{ IOException -> 0x013e }
            r5.append(r0)     // Catch:{ IOException -> 0x013e }
            r5.append(r2)     // Catch:{ IOException -> 0x013e }
            r5.append(r4)     // Catch:{ IOException -> 0x013e }
            r5.append(r3)     // Catch:{ IOException -> 0x013e }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x013e }
            r1.<init>(r3)     // Catch:{ IOException -> 0x013e }
            throw r1     // Catch:{ IOException -> 0x013e }
        L_0x0109:
            java.net.Socket r3 = r9.serverSocket     // Catch:{ IOException -> 0x013e }
            r3.close()     // Catch:{ IOException -> 0x013e }
            r9.serverSocket = r5     // Catch:{ IOException -> 0x013e }
            r9.serverOutput = r5     // Catch:{ IOException -> 0x013e }
            r9.serverInput = r5     // Catch:{ IOException -> 0x013e }
            r9.lineInputStream = r5     // Catch:{ IOException -> 0x013e }
            throw r1     // Catch:{ IOException -> 0x013e }
        L_0x0117:
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ IOException -> 0x013e }
            boolean r1 = r1.isLoggable(r4)     // Catch:{ IOException -> 0x013e }
            if (r1 == 0) goto L_0x013d
            com.sun.mail.util.MailLogger r1 = r9.logger     // Catch:{ IOException -> 0x013e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013e }
            r3.<init>()     // Catch:{ IOException -> 0x013e }
            java.lang.String r4 = "protocol started to host \""
            r3.append(r4)     // Catch:{ IOException -> 0x013e }
            java.lang.String r4 = r9.host     // Catch:{ IOException -> 0x013e }
            r3.append(r4)     // Catch:{ IOException -> 0x013e }
            r3.append(r6)     // Catch:{ IOException -> 0x013e }
            r3.append(r2)     // Catch:{ IOException -> 0x013e }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x013e }
            r1.fine(r3)     // Catch:{ IOException -> 0x013e }
        L_0x013d:
            return
        L_0x013e:
            r1 = move-exception
            goto L_0x0143
        L_0x0140:
            r2 = move-exception
            r1 = r2
            r2 = -1
        L_0x0143:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not start protocol to SMTP host: "
            r4.append(r5)
            java.lang.String r5 = r9.host
            r4.append(r5)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.openServer():void");
    }
}
