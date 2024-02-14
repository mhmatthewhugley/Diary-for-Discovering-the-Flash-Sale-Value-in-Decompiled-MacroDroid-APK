package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.f1 */
/* compiled from: TypeSubstitution.kt */
public abstract class C14911f1 extends C14936j1 {

    /* renamed from: c */
    public static final C14912a f64041c = new C14912a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f1$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C14912a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.f1$a$a */
        /* compiled from: TypeSubstitution.kt */
        public static final class C14913a extends C14911f1 {

            /* renamed from: d */
            final /* synthetic */ Map<C14901e1, C14926g1> f64042d;

            /* renamed from: e */
            final /* synthetic */ boolean f64043e;

            C14913a(Map<C14901e1, ? extends C14926g1> map, boolean z) {
                this.f64042d = map;
                this.f64043e = z;
            }

            /* renamed from: a */
            public boolean mo74164a() {
                return this.f64043e;
            }

            /* renamed from: f */
            public boolean mo72942f() {
                return this.f64042d.isEmpty();
            }

            /* renamed from: k */
            public C14926g1 mo67460k(C14901e1 e1Var) {
                C13706o.m87929f(e1Var, "key");
                return this.f64042d.get(e1Var);
            }
        }

        private C14912a() {
        }

        public /* synthetic */ C14912a(C13695i iVar) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ C14911f1 m92833e(C14912a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo74163d(map, z);
        }

        /* renamed from: a */
        public final C14936j1 mo74160a(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "kotlinType");
            return mo74161b(e0Var.mo73702N0(), e0Var.mo73700L0());
        }

        /* renamed from: b */
        public final C14936j1 mo74161b(C14901e1 e1Var, List<? extends C14926g1> list) {
            C13706o.m87929f(e1Var, "typeConstructor");
            C13706o.m87929f(list, "arguments");
            List<C13950e1> parameters = e1Var.getParameters();
            C13706o.m87928e(parameters, "typeConstructor.parameters");
            C13950e1 e1Var2 = (C13950e1) C13566b0.m87436k0(parameters);
            boolean z = true;
            if (e1Var2 == null || !e1Var2.mo72269R()) {
                z = false;
            }
            if (!z) {
                return new C14836c0(parameters, list);
            }
            List<C13950e1> parameters2 = e1Var.getParameters();
            C13706o.m87928e(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters2, 10));
            for (C13950e1 j : parameters2) {
                arrayList.add(j.mo62171j());
            }
            return m92833e(this, C13615t0.m87768r(C13566b0.m87413N0(arrayList, list)), false, 2, (Object) null);
        }

        /* renamed from: c */
        public final C14911f1 mo74162c(Map<C14901e1, ? extends C14926g1> map) {
            C13706o.m87929f(map, "map");
            return m92833e(this, map, false, 2, (Object) null);
        }

        /* renamed from: d */
        public final C14911f1 mo74163d(Map<C14901e1, ? extends C14926g1> map, boolean z) {
            C13706o.m87929f(map, "map");
            return new C14913a(map, z);
        }
    }

    /* renamed from: i */
    public static final C14936j1 m92829i(C14901e1 e1Var, List<? extends C14926g1> list) {
        return f64041c.mo74161b(e1Var, list);
    }

    /* renamed from: j */
    public static final C14911f1 m92830j(Map<C14901e1, ? extends C14926g1> map) {
        return f64041c.mo74162c(map);
    }

    /* renamed from: e */
    public C14926g1 mo72941e(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "key");
        return mo67460k(e0Var.mo73702N0());
    }

    /* renamed from: k */
    public abstract C14926g1 mo67460k(C14901e1 e1Var);
}
