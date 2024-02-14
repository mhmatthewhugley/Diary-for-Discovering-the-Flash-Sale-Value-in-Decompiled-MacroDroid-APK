package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.j1 */
/* compiled from: TypeSubstitution.kt */
public abstract class C14936j1 {

    /* renamed from: a */
    public static final C14938b f64058a = new C14938b((C13695i) null);

    /* renamed from: b */
    public static final C14936j1 f64059b = new C14937a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j1$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C14937a extends C14936j1 {
        C14937a() {
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ C14926g1 mo72941e(C14900e0 e0Var) {
            return (C14926g1) mo74207i(e0Var);
        }

        /* renamed from: f */
        public boolean mo72942f() {
            return true;
        }

        /* renamed from: i */
        public Void mo74207i(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j1$b */
    /* compiled from: TypeSubstitution.kt */
    public static final class C14938b {
        private C14938b() {
        }

        public /* synthetic */ C14938b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j1$c */
    /* compiled from: TypeSubstitution.kt */
    public static final class C14939c extends C14936j1 {

        /* renamed from: c */
        final /* synthetic */ C14936j1 f64060c;

        C14939c(C14936j1 j1Var) {
            this.f64060c = j1Var;
        }

        /* renamed from: a */
        public boolean mo74164a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo73714b() {
            return false;
        }

        /* renamed from: d */
        public C13921g mo74204d(C13921g gVar) {
            C13706o.m87929f(gVar, "annotations");
            return this.f64060c.mo74204d(gVar);
        }

        /* renamed from: e */
        public C14926g1 mo72941e(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "key");
            return this.f64060c.mo72941e(e0Var);
        }

        /* renamed from: f */
        public boolean mo72942f() {
            return this.f64060c.mo72942f();
        }

        /* renamed from: g */
        public C14900e0 mo74205g(C14900e0 e0Var, C14970r1 r1Var) {
            C13706o.m87929f(e0Var, "topLevelType");
            C13706o.m87929f(r1Var, "position");
            return this.f64060c.mo74205g(e0Var, r1Var);
        }
    }

    /* renamed from: a */
    public boolean mo74164a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo73714b() {
        return false;
    }

    /* renamed from: c */
    public final C14945l1 mo74203c() {
        C14945l1 g = C14945l1.m92939g(this);
        C13706o.m87928e(g, "create(this)");
        return g;
    }

    /* renamed from: d */
    public C13921g mo74204d(C13921g gVar) {
        C13706o.m87929f(gVar, "annotations");
        return gVar;
    }

    /* renamed from: e */
    public abstract C14926g1 mo72941e(C14900e0 e0Var);

    /* renamed from: f */
    public boolean mo72942f() {
        return false;
    }

    /* renamed from: g */
    public C14900e0 mo74205g(C14900e0 e0Var, C14970r1 r1Var) {
        C13706o.m87929f(e0Var, "topLevelType");
        C13706o.m87929f(r1Var, "position");
        return e0Var;
    }

    /* renamed from: h */
    public final C14936j1 mo74206h() {
        return new C14939c(this);
    }
}
