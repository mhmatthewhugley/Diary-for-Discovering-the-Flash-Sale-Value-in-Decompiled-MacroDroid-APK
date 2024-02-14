package com.google.api.client.http.apache;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.SSLSocketFactory;

final class SSLSocketFactoryExtension extends SSLSocketFactory {

    /* renamed from: a */
    private final javax.net.ssl.SSLSocketFactory f52517a;

    public Socket createSocket() throws IOException {
        return this.f52517a.createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.f52517a.createSocket(socket, str, i, z);
        getHostnameVerifier().verify(str, sSLSocket);
        return sSLSocket;
    }
}
