package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcll extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f28863a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ zzclm f28864b;

    zzcll(zzclm zzclm) {
        this.f28864b = zzclm;
    }

    /* renamed from: a */
    private final Socket m45709a(Socket socket) throws SocketException {
        zzclm zzclm = this.f28864b;
        if (zzclm.f28881s > 0) {
            socket.setReceiveBufferSize(zzclm.f28881s);
        }
        this.f28864b.f28882t.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f28863a.createSocket(str, i);
        m45709a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f28863a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f28863a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f28863a.createSocket(str, i, inetAddress, i2);
        m45709a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f28863a.createSocket(inetAddress, i);
        m45709a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f28863a.createSocket(inetAddress, i, inetAddress2, i2);
        m45709a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f28863a.createSocket(socket, str, i, z);
        m45709a(createSocket);
        return createSocket;
    }
}
