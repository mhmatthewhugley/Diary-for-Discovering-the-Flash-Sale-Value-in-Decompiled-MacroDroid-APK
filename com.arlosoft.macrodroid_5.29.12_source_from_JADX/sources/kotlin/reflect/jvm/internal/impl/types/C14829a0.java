package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.a0 */
/* compiled from: TypeWithEnhancement.kt */
public final class C14829a0 extends C14990y implements C14960o1 {

    /* renamed from: f */
    private final C14990y f63957f;

    /* renamed from: g */
    private final C14900e0 f63958g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14829a0(C14990y yVar, C14900e0 e0Var) {
        super(yVar.mo74251V0(), yVar.mo74252W0());
        C13706o.m87929f(yVar, "origin");
        C13706o.m87929f(e0Var, "enhancement");
        this.f63957f = yVar;
        this.f63958g = e0Var;
    }

    /* renamed from: R0 */
    public C14967q1 mo72947R0(boolean z) {
        return C14964p1.m93057d(mo74038G0().mo72947R0(z), mo74041h0().mo74145Q0().mo72947R0(z));
    }

    /* renamed from: T0 */
    public C14967q1 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return C14964p1.m93057d(mo74038G0().mo72949T0(a1Var), mo74041h0());
    }

    /* renamed from: U0 */
    public C14951m0 mo72950U0() {
        return mo74038G0().mo72950U0();
    }

    /* renamed from: X0 */
    public String mo72951X0(C14552c cVar, C14580f fVar) {
        C13706o.m87929f(cVar, "renderer");
        C13706o.m87929f(fVar, "options");
        if (fVar.mo73580d()) {
            return cVar.mo73532w(mo74041h0());
        }
        return mo74038G0().mo72951X0(cVar, fVar);
    }

    /* renamed from: Y0 */
    public C14990y mo74038G0() {
        return this.f63957f;
    }

    /* renamed from: Z0 */
    public C14829a0 mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo74038G0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C14829a0((C14990y) h, gVar.mo74070h(mo74041h0()));
    }

    /* renamed from: h0 */
    public C14900e0 mo74041h0() {
        return this.f63958g;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + mo74041h0() + ")] " + mo74038G0();
    }
}
