package p360p9;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import p292io.grpc.okhttp.internal.C12937e;
import p292io.grpc.okhttp.internal.C12938f;
import p292io.grpc.okhttp.internal.C12947g;
import p292io.grpc.okhttp.internal.C12949i;

/* renamed from: p9.j */
/* compiled from: OkHttpProtocolNegotiator */
class C16135j {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f66249b;

    /* renamed from: c */
    private static final C12938f f66250c = C12938f.m84997e();

    /* renamed from: d */
    private static C16135j f66251d;

    /* renamed from: a */
    protected final C12938f f66252a;

    @VisibleForTesting
    /* renamed from: p9.j$a */
    /* compiled from: OkHttpProtocolNegotiator */
    static final class C16136a extends C16135j {

        /* renamed from: e */
        private static final C12937e<Socket> f66253e = new C12937e<>((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);

        /* renamed from: f */
        private static final C12937e<Socket> f66254f = new C12937e<>((Class<?>) null, "setHostname", String.class);

        /* renamed from: g */
        private static final C12937e<Socket> f66255g;

        /* renamed from: h */
        private static final C12937e<Socket> f66256h;

        /* renamed from: i */
        private static final C12937e<Socket> f66257i;

        /* renamed from: j */
        private static final C12937e<Socket> f66258j;

        static {
            Class<byte[]> cls = byte[].class;
            f66255g = new C12937e<>(cls, "getAlpnSelectedProtocol", new Class[0]);
            f66256h = new C12937e<>((Class<?>) null, "setAlpnProtocols", cls);
            f66257i = new C12937e<>(cls, "getNpnSelectedProtocol", new Class[0]);
            f66258j = new C12937e<>((Class<?>) null, "setNpnProtocols", cls);
        }

        C16136a(C12938f fVar) {
            super(fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo78518b(SSLSocket sSLSocket, String str, List<C12947g> list) {
            if (str != null) {
                f66253e.mo69729e(sSLSocket, Boolean.TRUE);
                f66254f.mo69729e(sSLSocket, str);
            }
            Object[] objArr = {C12938f.m84995b(list)};
            if (this.f66252a.mo69736i() == C12938f.C12946h.ALPN_AND_NPN) {
                f66256h.mo69730f(sSLSocket, objArr);
            }
            if (this.f66252a.mo69736i() != C12938f.C12946h.f60630d) {
                f66258j.mo69730f(sSLSocket, objArr);
                return;
            }
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }

        /* renamed from: e */
        public String mo78519e(SSLSocket sSLSocket) {
            if (this.f66252a.mo69736i() == C12938f.C12946h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f66255g.mo69730f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C12949i.f60644c);
                    }
                } catch (Exception e) {
                    C16135j.f66249b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", e);
                }
            }
            if (this.f66252a.mo69736i() == C12938f.C12946h.f60630d) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f66257i.mo69730f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, C12949i.f60644c);
                }
                return null;
            } catch (Exception e2) {
                C16135j.f66249b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", e2);
                return null;
            }
        }

        /* renamed from: f */
        public String mo78520f(SSLSocket sSLSocket, String str, List<C12947g> list) throws IOException {
            String e = mo78519e(sSLSocket);
            return e == null ? C16135j.super.mo78520f(sSLSocket, str, list) : e;
        }
    }

    static {
        Class<C16135j> cls = C16135j.class;
        f66249b = Logger.getLogger(cls.getName());
        f66251d = m96921c(cls.getClassLoader());
    }

    @VisibleForTesting
    C16135j(C12938f fVar) {
        this.f66252a = (C12938f) Preconditions.m5393t(fVar, "platform");
    }

    @VisibleForTesting
    /* renamed from: c */
    static C16135j m96921c(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f66249b.log(Level.FINE, "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f66249b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                z = false;
            }
        }
        z = true;
        if (z) {
            return new C16136a(f66250c);
        }
        return new C16135j(f66250c);
    }

    /* renamed from: d */
    public static C16135j m96922d() {
        return f66251d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo78518b(SSLSocket sSLSocket, String str, List<C12947g> list) {
        this.f66252a.mo69733c(sSLSocket, str, list);
    }

    /* renamed from: e */
    public String mo78519e(SSLSocket sSLSocket) {
        return this.f66252a.mo69735h(sSLSocket);
    }

    /* renamed from: f */
    public String mo78520f(SSLSocket sSLSocket, String str, List<C12947g> list) throws IOException {
        if (list != null) {
            mo78518b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String e = mo78519e(sSLSocket);
            if (e != null) {
                return e;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f66252a.mo69732a(sSLSocket);
        }
    }
}
