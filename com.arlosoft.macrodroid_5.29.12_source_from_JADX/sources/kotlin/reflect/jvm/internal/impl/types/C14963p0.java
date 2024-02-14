package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.p0 */
/* compiled from: TypeWithEnhancement.kt */
public final class C14963p0 extends C14968r implements C14960o1 {

    /* renamed from: c */
    private final C14951m0 f64089c;

    /* renamed from: d */
    private final C14900e0 f64090d;

    public C14963p0(C14951m0 m0Var, C14900e0 e0Var) {
        C13706o.m87929f(m0Var, "delegate");
        C13706o.m87929f(e0Var, "enhancement");
        this.f64089c = m0Var;
        this.f64090d = e0Var;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        C14967q1 d = C14964p1.m93057d(mo74038G0().mo73022U0(z), mo74041h0().mo74145Q0().mo72947R0(z));
        C13706o.m87927d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C14951m0) d;
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        C14967q1 d = C14964p1.m93057d(mo74038G0().mo73023V0(a1Var), mo74041h0());
        C13706o.m87927d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C14951m0) d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C14951m0 mo73024W0() {
        return this.f64089c;
    }

    /* renamed from: Z0 */
    public C14951m0 mo74038G0() {
        return mo73024W0();
    }

    /* renamed from: a1 */
    public C14963p0 mo74033X0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo73024W0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C14963p0((C14951m0) h, gVar.mo74070h(mo74041h0()));
    }

    /* renamed from: b1 */
    public C14963p0 mo73025Y0(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        return new C14963p0(m0Var, mo74041h0());
    }

    /* renamed from: h0 */
    public C14900e0 mo74041h0() {
        return this.f64090d;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + mo74041h0() + ")] " + mo74038G0();
    }
}
