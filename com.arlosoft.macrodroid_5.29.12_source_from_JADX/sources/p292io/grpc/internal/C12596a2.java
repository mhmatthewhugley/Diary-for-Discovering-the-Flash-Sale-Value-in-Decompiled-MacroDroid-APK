package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Verify;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p292io.grpc.C12542c;
import p292io.grpc.C12548d;
import p292io.grpc.C12558f;
import p292io.grpc.C12561g;
import p292io.grpc.C12972r0;
import p292io.grpc.C12977s;
import p292io.grpc.internal.C12681f1;
import p292io.grpc.internal.C12782q0;
import p292io.grpc.internal.C12876x1;

/* renamed from: io.grpc.internal.a2 */
/* compiled from: ServiceConfigInterceptor */
final class C12596a2 implements C12561g {

    /* renamed from: d */
    static final C12542c.C12543a<C12876x1.C12877a> f59581d = C12542c.C12543a.m83731b("internal-retry-policy");

    /* renamed from: e */
    static final C12542c.C12543a<C12782q0.C12783a> f59582e = C12542c.C12543a.m83731b("internal-hedging-policy");
    @VisibleForTesting

    /* renamed from: a */
    final AtomicReference<C12681f1> f59583a = new AtomicReference<>();

    /* renamed from: b */
    private final boolean f59584b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f59585c;

    /* renamed from: io.grpc.internal.a2$a */
    /* compiled from: ServiceConfigInterceptor */
    final class C12597a implements C12782q0.C12783a {

        /* renamed from: a */
        final /* synthetic */ C12972r0 f59586a;

        C12597a(C12972r0 r0Var) {
            this.f59586a = r0Var;
        }

        public C12782q0 get() {
            if (!C12596a2.this.f59585c) {
                return C12782q0.f60154d;
            }
            C12782q0 c = C12596a2.this.mo69207c(this.f59586a);
            Verify.m5498a(c.equals(C12782q0.f60154d) || C12596a2.this.mo69208e(this.f59586a).equals(C12876x1.f60381f), "Can not apply both retry and hedging policy for the method '%s'", this.f59586a);
            return c;
        }
    }

    /* renamed from: io.grpc.internal.a2$b */
    /* compiled from: ServiceConfigInterceptor */
    final class C12598b implements C12876x1.C12877a {

        /* renamed from: a */
        final /* synthetic */ C12972r0 f59588a;

        C12598b(C12972r0 r0Var) {
            this.f59588a = r0Var;
        }

        public C12876x1 get() {
            if (!C12596a2.this.f59585c) {
                return C12876x1.f60381f;
            }
            return C12596a2.this.mo69208e(this.f59588a);
        }
    }

    /* renamed from: io.grpc.internal.a2$c */
    /* compiled from: ServiceConfigInterceptor */
    final class C12599c implements C12782q0.C12783a {

        /* renamed from: a */
        final /* synthetic */ C12782q0 f59590a;

        C12599c(C12782q0 q0Var) {
            this.f59590a = q0Var;
        }

        public C12782q0 get() {
            return this.f59590a;
        }
    }

    /* renamed from: io.grpc.internal.a2$d */
    /* compiled from: ServiceConfigInterceptor */
    final class C12600d implements C12876x1.C12877a {

        /* renamed from: a */
        final /* synthetic */ C12876x1 f59592a;

        C12600d(C12876x1 x1Var) {
            this.f59592a = x1Var;
        }

        public C12876x1 get() {
            return this.f59592a;
        }
    }

    C12596a2(boolean z) {
        this.f59584b = z;
    }

    /* renamed from: d */
    private C12681f1.C12682a m83857d(C12972r0<?, ?> r0Var) {
        C12681f1 f1Var = this.f59583a.get();
        C12681f1.C12682a aVar = f1Var != null ? f1Var.mo69394f().get(r0Var.mo69787c()) : null;
        if (aVar != null || f1Var == null) {
            return aVar;
        }
        return f1Var.mo69392e().get(r0Var.mo69788d());
    }

    /* renamed from: a */
    public <ReqT, RespT> C12558f<ReqT, RespT> mo69137a(C12972r0<ReqT, RespT> r0Var, C12542c cVar, C12548d dVar) {
        if (this.f59584b) {
            if (this.f59585c) {
                C12876x1 e = mo69208e(r0Var);
                C12782q0 c = mo69207c(r0Var);
                Verify.m5498a(e.equals(C12876x1.f60381f) || c.equals(C12782q0.f60154d), "Can not apply both retry and hedging policy for the method '%s'", r0Var);
                cVar = cVar.mo69091p(f59581d, new C12600d(e)).mo69091p(f59582e, new C12599c(c));
            } else {
                cVar = cVar.mo69091p(f59581d, new C12598b(r0Var)).mo69091p(f59582e, new C12597a(r0Var));
            }
        }
        C12681f1.C12682a d = m83857d(r0Var);
        if (d == null) {
            return dVar.mo69115h(r0Var, cVar);
        }
        Long l = d.f59887a;
        if (l != null) {
            C12977s b = C12977s.m85131b(l.longValue(), TimeUnit.NANOSECONDS);
            C12977s d2 = cVar.mo69079d();
            if (d2 == null || b.compareTo(d2) < 0) {
                cVar = cVar.mo69087l(b);
            }
        }
        Boolean bool = d.f59888b;
        if (bool != null) {
            cVar = bool.booleanValue() ? cVar.mo69093r() : cVar.mo69094s();
        }
        if (d.f59889c != null) {
            Integer f = cVar.mo69081f();
            if (f != null) {
                cVar = cVar.mo69089n(Math.min(f.intValue(), d.f59889c.intValue()));
            } else {
                cVar = cVar.mo69089n(d.f59889c.intValue());
            }
        }
        if (d.f59890d != null) {
            Integer g = cVar.mo69082g();
            if (g != null) {
                cVar = cVar.mo69090o(Math.min(g.intValue(), d.f59890d.intValue()));
            } else {
                cVar = cVar.mo69090o(d.f59890d.intValue());
            }
        }
        return dVar.mo69115h(r0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public C12782q0 mo69207c(C12972r0<?, ?> r0Var) {
        C12681f1.C12682a d = m83857d(r0Var);
        return d == null ? C12782q0.f60154d : d.f59892f;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public C12876x1 mo69208e(C12972r0<?, ?> r0Var) {
        C12681f1.C12682a d = m83857d(r0Var);
        return d == null ? C12876x1.f60381f : d.f59891e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo69209f(C12681f1 f1Var) {
        this.f59583a.set(f1Var);
        this.f59585c = true;
    }
}
