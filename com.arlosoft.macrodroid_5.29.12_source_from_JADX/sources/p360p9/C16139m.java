package p360p9;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p292io.grpc.okhttp.internal.C12932b;
import p292io.grpc.okhttp.internal.C12936d;
import p292io.grpc.okhttp.internal.C12947g;

/* renamed from: p9.m */
/* compiled from: OkHttpTlsUpgrader */
final class C16139m {
    @VisibleForTesting

    /* renamed from: a */
    static final List<C12947g> f66260a = Collections.unmodifiableList(Arrays.asList(new C12947g[]{C12947g.HTTP_2}));

    @VisibleForTesting
    /* renamed from: a */
    static String m96935a(String str) {
        return (!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1);
    }

    /* renamed from: b */
    public static SSLSocket m96936b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C12932b bVar) throws IOException {
        Preconditions.m5393t(sSLSocketFactory, "sslSocketFactory");
        Preconditions.m5393t(socket, "socket");
        Preconditions.m5393t(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        bVar.mo69711c(sSLSocket, false);
        String f = C16135j.m96922d().mo78520f(sSLSocket, str, bVar.mo69714f() ? f66260a : null);
        List<C12947g> list = f66260a;
        boolean contains = list.contains(C12947g.m85021b(f));
        Preconditions.m5372C(contains, "Only " + list + " are supported, but negotiated protocol is %s", f);
        if (hostnameVerifier == null) {
            hostnameVerifier = C12936d.f60602a;
        }
        if (hostnameVerifier.verify(m96935a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
