package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.s */
/* compiled from: KotlinTypeFactory.kt */
public abstract class C14971s extends C14968r {

    /* renamed from: c */
    private final C14951m0 f64097c;

    public C14971s(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        this.f64097c = m0Var;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        if (z == mo73021O0()) {
            return this;
        }
        return mo73024W0().mo73022U0(z).mo73023V0(mo73701M0());
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return a1Var != mo73701M0() ? new C14959o0(this, a1Var) : this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C14951m0 mo73024W0() {
        return this.f64097c;
    }
}
