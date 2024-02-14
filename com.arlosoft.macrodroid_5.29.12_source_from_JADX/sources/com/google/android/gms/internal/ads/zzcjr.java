package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcjr extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f28662a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ zzcjs f28663b;

    zzcjr(zzcjs zzcjs) {
        this.f28663b = zzcjs;
    }

    /* renamed from: a */
    private final Socket m45533a(Socket socket) throws SocketException {
        zzcjs zzcjs = this.f28663b;
        if (zzcjs.f28680o > 0) {
            socket.setReceiveBufferSize(zzcjs.f28680o);
        }
        this.f28663b.f28681p.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f28662a.createSocket(str, i);
        m45533a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f28662a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f28662a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f28662a.createSocket(str, i, inetAddress, i2);
        m45533a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f28662a.createSocket(inetAddress, i);
        m45533a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f28662a.createSocket(inetAddress, i, inetAddress2, i2);
        m45533a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f28662a.createSocket(socket, str, i, z);
        m45533a(createSocket);
        return createSocket;
    }
}