package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.r */
/* compiled from: SpecialTypes.kt */
public abstract class C14968r extends C14951m0 {
    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return mo73024W0().mo73700L0();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return mo73024W0().mo73701M0();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return mo73024W0().mo73702N0();
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return mo73024W0().mo73021O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public abstract C14951m0 mo73024W0();

    /* renamed from: X0 */
    public C14951m0 mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo73024W0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo73025Y0((C14951m0) h);
    }

    /* renamed from: Y0 */
    public abstract C14968r mo73025Y0(C14951m0 m0Var);

    /* renamed from: n */
    public C14692h mo72955n() {
        return mo73024W0().mo72955n();
    }
}
