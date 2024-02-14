package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.o0 */
/* compiled from: KotlinTypeFactory.kt */
final class C14959o0 extends C14971s {

    /* renamed from: d */
    private final C14830a1 f64085d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14959o0(C14951m0 m0Var, C14830a1 a1Var) {
        super(m0Var);
        C13706o.m87929f(m0Var, "delegate");
        C13706o.m87929f(a1Var, "attributes");
        this.f64085d = a1Var;
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return this.f64085d;
    }

    /* renamed from: Z0 */
    public C14959o0 mo73025Y0(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        return new C14959o0(m0Var, mo73701M0());
    }
}
