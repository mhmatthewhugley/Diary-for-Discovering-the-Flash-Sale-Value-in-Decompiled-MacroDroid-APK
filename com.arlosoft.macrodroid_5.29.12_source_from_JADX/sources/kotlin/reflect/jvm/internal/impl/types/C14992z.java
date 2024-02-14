package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p225cc.C11170a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.z */
/* compiled from: flexibleTypes.kt */
public final class C14992z extends C14990y implements C14954n {

    /* renamed from: g */
    public static final C14993a f64119g = new C14993a((C13695i) null);

    /* renamed from: o */
    public static boolean f64120o;

    /* renamed from: f */
    private boolean f64121f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.z$a */
    /* compiled from: flexibleTypes.kt */
    public static final class C14993a {
        private C14993a() {
        }

        public /* synthetic */ C14993a(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14992z(C14951m0 m0Var, C14951m0 m0Var2) {
        super(m0Var, m0Var2);
        C13706o.m87929f(m0Var, "lowerBound");
        C13706o.m87929f(m0Var2, "upperBound");
    }

    /* renamed from: Z0 */
    private final void m93184Z0() {
        if (f64120o && !this.f64121f) {
            this.f64121f = true;
            C14833b0.m92415b(mo74251V0());
            C14833b0.m92415b(mo74252W0());
            C13706o.m87924a(mo74251V0(), mo74252W0());
            C14844e.f63967a.mo74060d(mo74251V0(), mo74252W0());
        }
    }

    /* renamed from: E0 */
    public boolean mo73020E0() {
        return (mo74251V0().mo73702N0().mo62183c() instanceof C13950e1) && C13706o.m87924a(mo74251V0().mo73702N0(), mo74252W0().mo73702N0());
    }

    /* renamed from: R0 */
    public C14967q1 mo72947R0(boolean z) {
        return C14906f0.m92816d(mo74251V0().mo73022U0(z), mo74252W0().mo73022U0(z));
    }

    /* renamed from: T0 */
    public C14967q1 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return C14906f0.m92816d(mo74251V0().mo73023V0(a1Var), mo74252W0().mo73023V0(a1Var));
    }

    /* renamed from: U0 */
    public C14951m0 mo72950U0() {
        m93184Z0();
        return mo74251V0();
    }

    /* renamed from: X0 */
    public String mo72951X0(C14552c cVar, C14580f fVar) {
        C13706o.m87929f(cVar, "renderer");
        C13706o.m87929f(fVar, "options");
        if (!fVar.mo73590i()) {
            return cVar.mo73529t(cVar.mo73532w(mo74251V0()), cVar.mo73532w(mo74252W0()), C11170a.m74959h(this));
        }
        return '(' + cVar.mo73532w(mo74251V0()) + ".." + cVar.mo73532w(mo74252W0()) + ')';
    }

    /* renamed from: Y0 */
    public C14990y mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo74251V0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C14900e0 h2 = gVar.mo74070h(mo74252W0());
        C13706o.m87927d(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C14992z((C14951m0) h, (C14951m0) h2);
    }

    /* renamed from: k0 */
    public C14900e0 mo73028k0(C14900e0 e0Var) {
        C14967q1 q1Var;
        C13706o.m87929f(e0Var, "replacement");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            q1Var = Q0;
        } else if (Q0 instanceof C14951m0) {
            C14951m0 m0Var = (C14951m0) Q0;
            q1Var = C14906f0.m92816d(m0Var, m0Var.mo73022U0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C14964p1.m93055b(q1Var, Q0);
    }

    public String toString() {
        return '(' + mo74251V0() + ".." + mo74252W0() + ')';
    }
}
