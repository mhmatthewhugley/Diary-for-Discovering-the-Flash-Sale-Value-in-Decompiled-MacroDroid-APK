package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12520a;
import p292io.grpc.C12537b1;
import p292io.grpc.C12554e;
import p292io.grpc.C12910l0;
import p292io.grpc.C12924m0;
import p292io.grpc.C12926n;
import p292io.grpc.C12927n0;
import p292io.grpc.C12981s0;
import p292io.grpc.C13005w;
import p292io.grpc.internal.C12612b2;

/* renamed from: io.grpc.internal.i */
/* compiled from: AutoConfiguredLoadBalancerFactory */
public final class C12702i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12927n0 f59929a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f59930b;

    @VisibleForTesting
    /* renamed from: io.grpc.internal.i$b */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    public final class C12704b {

        /* renamed from: a */
        private final C12910l0.C12915d f59931a;

        /* renamed from: b */
        private C12910l0 f59932b;

        /* renamed from: c */
        private C12924m0 f59933c;

        C12704b(C12910l0.C12915d dVar) {
            this.f59931a = dVar;
            C12924m0 d = C12702i.this.f59929a.mo69703d(C12702i.this.f59930b);
            this.f59933c = d;
            if (d != null) {
                this.f59932b = d.mo69515a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C12702i.this.f59930b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        @VisibleForTesting
        /* renamed from: a */
        public C12910l0 mo69421a() {
            return this.f59932b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69422b(C12537b1 b1Var) {
            mo69421a().mo69427b(b1Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo69423c() {
            mo69421a().mo69496d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo69424d() {
            this.f59932b.mo69429e();
            this.f59932b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C12537b1 mo69425e(C12910l0.C12918g gVar) {
            List<C13005w> a = gVar.mo69686a();
            C12520a b = gVar.mo69687b();
            C12520a.C12523c cVar = C12910l0.f60452a;
            if (b.mo69026b(cVar) == null) {
                C12709g gVar2 = (C12709g) gVar.mo69688c();
                if (gVar2 == null) {
                    try {
                        C12702i iVar = C12702i.this;
                        gVar2 = new C12709g(iVar.m84222d(iVar.f59930b, "using default policy"), (Map<String, ?>) null, (Object) null);
                    } catch (C12708f e) {
                        this.f59931a.mo69308d(C12926n.TRANSIENT_FAILURE, new C12706d(C12537b1.f59421t.mo69066q(e.getMessage())));
                        this.f59932b.mo69429e();
                        this.f59933c = null;
                        this.f59932b = new C12707e();
                        return C12537b1.f59407f;
                    }
                }
                if (this.f59933c == null || !gVar2.f59936a.mo69516b().equals(this.f59933c.mo69516b())) {
                    this.f59931a.mo69308d(C12926n.CONNECTING, new C12705c());
                    this.f59932b.mo69429e();
                    C12924m0 m0Var = gVar2.f59936a;
                    this.f59933c = m0Var;
                    C12910l0 l0Var = this.f59932b;
                    this.f59932b = m0Var.mo69515a(this.f59931a);
                    this.f59931a.mo69306b().mo69127b(C12554e.C12555a.INFO, "Load balancer changed from {0} to {1}", l0Var.getClass().getSimpleName(), this.f59932b.getClass().getSimpleName());
                }
                Object obj = gVar2.f59938c;
                if (obj != null) {
                    this.f59931a.mo69306b().mo69127b(C12554e.C12555a.DEBUG, "Load-balancing config: {0}", gVar2.f59938c);
                    b = b.mo69027d().mo69033d(cVar, gVar2.f59937b).mo69031a();
                }
                C12910l0 a2 = mo69421a();
                if (!gVar.mo69686a().isEmpty() || a2.mo69671a()) {
                    a2.mo69428c(C12910l0.C12918g.m84911d().mo69693b(gVar.mo69686a()).mo69694c(b).mo69695d(obj).mo69692a());
                    return C12537b1.f59407f;
                }
                C12537b1 b1Var = C12537b1.f59422u;
                return b1Var.mo69066q("NameResolver returned no usable address. addrs=" + a + ", attrs=" + b);
            }
            throw new IllegalArgumentException("Unexpected ATTR_LOAD_BALANCING_CONFIG from upstream: " + b.mo69026b(cVar));
        }
    }

    /* renamed from: io.grpc.internal.i$c */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12705c extends C12910l0.C12921i {
        private C12705c() {
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return C12910l0.C12916e.m84901g();
        }

        public String toString() {
            return MoreObjects.m5333b(C12705c.class).toString();
        }
    }

    /* renamed from: io.grpc.internal.i$d */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12706d extends C12910l0.C12921i {

        /* renamed from: a */
        private final C12537b1 f59935a;

        C12706d(C12537b1 b1Var) {
            this.f59935a = b1Var;
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return C12910l0.C12916e.m84900f(this.f59935a);
        }
    }

    /* renamed from: io.grpc.internal.i$e */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12707e extends C12910l0 {
        private C12707e() {
        }

        /* renamed from: b */
        public void mo69427b(C12537b1 b1Var) {
        }

        /* renamed from: c */
        public void mo69428c(C12910l0.C12918g gVar) {
        }

        /* renamed from: e */
        public void mo69429e() {
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.i$f */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    static final class C12708f extends Exception {
        private static final long serialVersionUID = 1;

        private C12708f(String str) {
            super(str);
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.i$g */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    static final class C12709g {

        /* renamed from: a */
        final C12924m0 f59936a;

        /* renamed from: b */
        final Map<String, ?> f59937b;

        /* renamed from: c */
        final Object f59938c;

        C12709g(C12924m0 m0Var, Map<String, ?> map, Object obj) {
            this.f59936a = (C12924m0) Preconditions.m5393t(m0Var, "provider");
            this.f59937b = map;
            this.f59938c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12709g.class != obj.getClass()) {
                return false;
            }
            C12709g gVar = (C12709g) obj;
            if (!Objects.m5349a(this.f59936a, gVar.f59936a) || !Objects.m5349a(this.f59937b, gVar.f59937b) || !Objects.m5349a(this.f59938c, gVar.f59938c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f59936a, this.f59937b, this.f59938c);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("provider", this.f59936a).mo22194d("rawConfig", this.f59937b).mo22194d("config", this.f59938c).toString();
        }
    }

    public C12702i(String str) {
        this(C12927n0.m84937b(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C12924m0 m84222d(String str, String str2) throws C12708f {
        C12924m0 d = this.f59929a.mo69703d(str);
        if (d != null) {
            return d;
        }
        throw new C12708f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public C12704b mo69419e(C12910l0.C12915d dVar) {
        return new C12704b(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12981s0.C12985c mo69420f(Map<String, ?> map, C12554e eVar) {
        List<C12612b2.C12613a> list;
        if (map != null) {
            try {
                list = C12612b2.m83931x(C12612b2.m83913f(map));
            } catch (RuntimeException e) {
                return C12981s0.C12985c.m85164b(C12537b1.f59409h.mo69066q("can't parse load balancer configuration").mo69065p(e));
            }
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C12612b2.C12613a next : list) {
            String a = next.mo69233a();
            C12924m0 d = this.f59929a.mo69703d(a);
            if (d == null) {
                arrayList.add(a);
            } else {
                if (!arrayList.isEmpty()) {
                    eVar.mo69127b(C12554e.C12555a.DEBUG, "{0} specified by Service Config are not available", arrayList);
                }
                C12981s0.C12985c e2 = d.mo69519e(next.mo69234b());
                if (e2.mo69828d() != null) {
                    return e2;
                }
                return C12981s0.C12985c.m85163a(new C12709g(d, next.mo69234b(), e2.mo69827c()));
            }
        }
        return C12981s0.C12985c.m85164b(C12537b1.f59409h.mo69066q("None of " + arrayList + " specified by Service Config are available."));
    }

    @VisibleForTesting
    C12702i(C12927n0 n0Var, String str) {
        this.f59929a = (C12927n0) Preconditions.m5393t(n0Var, "registry");
        this.f59930b = (String) Preconditions.m5393t(str, "defaultPolicy");
    }
}
