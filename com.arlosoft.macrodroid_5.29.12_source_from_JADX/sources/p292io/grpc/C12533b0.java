package p292io.grpc;

import com.google.common.base.Preconditions;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: io.grpc.b0 */
/* compiled from: InternalChannelz */
public final class C12533b0 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f59394f = Logger.getLogger(C12533b0.class.getName());

    /* renamed from: g */
    private static final C12533b0 f59395g = new C12533b0();

    /* renamed from: a */
    private final ConcurrentNavigableMap<Long, C12556e0<Object>> f59396a = new ConcurrentSkipListMap();

    /* renamed from: b */
    private final ConcurrentNavigableMap<Long, C12556e0<Object>> f59397b = new ConcurrentSkipListMap();

    /* renamed from: c */
    private final ConcurrentMap<Long, C12556e0<Object>> f59398c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Long, C12556e0<Object>> f59399d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ConcurrentMap<Long, Object> f59400e = new ConcurrentHashMap();

    /* renamed from: io.grpc.b0$b */
    /* compiled from: InternalChannelz */
    public static final class C12535b {

        /* renamed from: a */
        public final C12536c f59401a;

        public C12535b(C12536c cVar) {
            this.f59401a = (C12536c) Preconditions.m5392s(cVar);
        }
    }

    /* renamed from: io.grpc.b0$c */
    /* compiled from: InternalChannelz */
    public static final class C12536c {

        /* renamed from: a */
        public final String f59402a;

        /* renamed from: b */
        public final Certificate f59403b;

        /* renamed from: c */
        public final Certificate f59404c;

        public C12536c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C12533b0.f59394f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[]{sSLSession.getPeerHost()}), e);
            }
            this.f59402a = cipherSuite;
            this.f59403b = certificate2;
            this.f59404c = certificate;
        }
    }

    /* renamed from: b */
    private static <T extends C12556e0<?>> void m83669b(Map<Long, T> map, T t) {
        C12556e0 e0Var = (C12556e0) map.put(Long.valueOf(t.mo69268c().mo69134d()), t);
    }

    /* renamed from: f */
    public static long m83670f(C12904j0 j0Var) {
        return j0Var.mo69268c().mo69134d();
    }

    /* renamed from: g */
    public static C12533b0 m83671g() {
        return f59395g;
    }

    /* renamed from: h */
    private static <T extends C12556e0<?>> void m83672h(Map<Long, T> map, T t) {
        C12556e0 e0Var = (C12556e0) map.remove(Long.valueOf(m83670f(t)));
    }

    /* renamed from: c */
    public void mo69050c(C12556e0<Object> e0Var) {
        m83669b(this.f59399d, e0Var);
    }

    /* renamed from: d */
    public void mo69051d(C12556e0<Object> e0Var) {
        m83669b(this.f59397b, e0Var);
    }

    /* renamed from: e */
    public void mo69052e(C12556e0<Object> e0Var) {
        m83669b(this.f59398c, e0Var);
    }

    /* renamed from: i */
    public void mo69053i(C12556e0<Object> e0Var) {
        m83672h(this.f59399d, e0Var);
    }

    /* renamed from: j */
    public void mo69054j(C12556e0<Object> e0Var) {
        m83672h(this.f59397b, e0Var);
    }

    /* renamed from: k */
    public void mo69055k(C12556e0<Object> e0Var) {
        m83672h(this.f59398c, e0Var);
    }
}
