package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.u */
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class C14978u extends C14936j1 {

    /* renamed from: e */
    public static final C14979a f64101e = new C14979a((C13695i) null);

    /* renamed from: c */
    private final C14936j1 f64102c;

    /* renamed from: d */
    private final C14936j1 f64103d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.u$a */
    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class C14979a {
        private C14979a() {
        }

        public /* synthetic */ C14979a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14936j1 mo74237a(C14936j1 j1Var, C14936j1 j1Var2) {
            C13706o.m87929f(j1Var, "first");
            C13706o.m87929f(j1Var2, "second");
            if (j1Var.mo72942f()) {
                return j1Var2;
            }
            if (j1Var2.mo72942f()) {
                return j1Var;
            }
            return new C14978u(j1Var, j1Var2, (C13695i) null);
        }
    }

    private C14978u(C14936j1 j1Var, C14936j1 j1Var2) {
        this.f64102c = j1Var;
        this.f64103d = j1Var2;
    }

    public /* synthetic */ C14978u(C14936j1 j1Var, C14936j1 j1Var2, C13695i iVar) {
        this(j1Var, j1Var2);
    }

    /* renamed from: i */
    public static final C14936j1 m93119i(C14936j1 j1Var, C14936j1 j1Var2) {
        return f64101e.mo74237a(j1Var, j1Var2);
    }

    /* renamed from: a */
    public boolean mo74164a() {
        return this.f64102c.mo74164a() || this.f64103d.mo74164a();
    }

    /* renamed from: b */
    public boolean mo73714b() {
        return this.f64102c.mo73714b() || this.f64103d.mo73714b();
    }

    /* renamed from: d */
    public C13921g mo74204d(C13921g gVar) {
        C13706o.m87929f(gVar, "annotations");
        return this.f64103d.mo74204d(this.f64102c.mo74204d(gVar));
    }

    /* renamed from: e */
    public C14926g1 mo72941e(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "key");
        C14926g1 e = this.f64102c.mo72941e(e0Var);
        return e == null ? this.f64103d.mo72941e(e0Var) : e;
    }

    /* renamed from: f */
    public boolean mo72942f() {
        return false;
    }

    /* renamed from: g */
    public C14900e0 mo74205g(C14900e0 e0Var, C14970r1 r1Var) {
        C13706o.m87929f(e0Var, "topLevelType");
        C13706o.m87929f(r1Var, "position");
        return this.f64103d.mo74205g(this.f64102c.mo74205g(e0Var, r1Var), r1Var);
    }
}
