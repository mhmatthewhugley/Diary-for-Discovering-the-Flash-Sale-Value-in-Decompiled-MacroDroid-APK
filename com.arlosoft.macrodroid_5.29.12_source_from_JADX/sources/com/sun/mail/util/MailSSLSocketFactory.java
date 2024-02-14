package com.sun.mail.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class MailSSLSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory adapteeFactory;
    private KeyManager[] keyManagers;
    private SecureRandom secureRandom;
    private SSLContext sslcontext;
    private boolean trustAllHosts;
    private TrustManager[] trustManagers;
    private String[] trustedHosts;

    private class MailTrustManager implements X509TrustManager {
        private X509TrustManager adapteeTrustManager;

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (!MailSSLSocketFactory.this.isTrustAllHosts() && MailSSLSocketFactory.this.getTrustedHosts() == null) {
                this.adapteeTrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (!MailSSLSocketFactory.this.isTrustAllHosts() && MailSSLSocketFactory.this.getTrustedHosts() == null) {
                this.adapteeTrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.adapteeTrustManager.getAcceptedIssuers();
        }

        private MailTrustManager() throws GeneralSecurityException {
            this.adapteeTrustManager = null;
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init((KeyStore) null);
            this.adapteeTrustManager = (X509TrustManager) instance.getTrustManagers()[0];
        }
    }

    public MailSSLSocketFactory() throws GeneralSecurityException {
        this(org.apache.http.conn.ssl.SSLSocketFactory.TLS);
    }

    private synchronized void newAdapteeFactory() throws KeyManagementException {
        this.sslcontext.init(this.keyManagers, this.trustManagers, this.secureRandom);
        this.adapteeFactory = this.sslcontext.getSocketFactory();
    }

    public synchronized Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return this.adapteeFactory.createSocket(socket, str, i, z);
    }

    public synchronized String[] getDefaultCipherSuites() {
        return this.adapteeFactory.getDefaultCipherSuites();
    }

    public synchronized KeyManager[] getKeyManagers() {
        return (KeyManager[]) this.keyManagers.clone();
    }

    public synchronized SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    public synchronized String[] getSupportedCipherSuites() {
        return this.adapteeFactory.getSupportedCipherSuites();
    }

    public synchronized TrustManager[] getTrustManagers() {
        return this.trustManagers;
    }

    public synchronized String[] getTrustedHosts() {
        String[] strArr = this.trustedHosts;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public synchronized boolean isServerTrusted(String str, SSLSocket sSLSocket) {
        if (this.trustAllHosts) {
            return true;
        }
        String[] strArr = this.trustedHosts;
        if (strArr == null) {
            return true;
        }
        return Arrays.asList(strArr).contains(str);
    }

    public synchronized boolean isTrustAllHosts() {
        return this.trustAllHosts;
    }

    public synchronized void setKeyManagers(KeyManager... keyManagerArr) throws GeneralSecurityException {
        this.keyManagers = (KeyManager[]) keyManagerArr.clone();
        newAdapteeFactory();
    }

    public synchronized void setSecureRandom(SecureRandom secureRandom2) throws GeneralSecurityException {
        this.secureRandom = secureRandom2;
        newAdapteeFactory();
    }

    public synchronized void setTrustAllHosts(boolean z) {
        this.trustAllHosts = z;
    }

    public synchronized void setTrustManagers(TrustManager... trustManagerArr) throws GeneralSecurityException {
        this.trustManagers = trustManagerArr;
        newAdapteeFactory();
    }

    public synchronized void setTrustedHosts(String... strArr) {
        if (strArr == null) {
            this.trustedHosts = null;
        } else {
            this.trustedHosts = (String[]) strArr.clone();
        }
    }

    public MailSSLSocketFactory(String str) throws GeneralSecurityException {
        this.trustedHosts = null;
        this.adapteeFactory = null;
        this.trustAllHosts = false;
        this.sslcontext = SSLContext.getInstance(str);
        this.keyManagers = null;
        this.trustManagers = new TrustManager[]{new MailTrustManager()};
        this.secureRandom = null;
        newAdapteeFactory();
    }

    public synchronized Socket createSocket() throws IOException {
        return this.adapteeFactory.createSocket();
    }

    public synchronized Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return this.adapteeFactory.createSocket(inetAddress, i, inetAddress2, i2);
    }

    public synchronized Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return this.adapteeFactory.createSocket(inetAddress, i);
    }

    public synchronized Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return this.adapteeFactory.createSocket(str, i, inetAddress, i2);
    }

    public synchronized Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return this.adapteeFactory.createSocket(str, i);
    }
}
