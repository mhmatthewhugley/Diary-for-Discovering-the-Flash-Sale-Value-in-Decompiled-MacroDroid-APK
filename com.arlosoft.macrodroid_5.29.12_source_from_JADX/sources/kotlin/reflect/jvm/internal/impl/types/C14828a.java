package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.a */
/* compiled from: SpecialTypes.kt */
public final class C14828a extends C14968r {

    /* renamed from: c */
    private final C14951m0 f63955c;

    /* renamed from: d */
    private final C14951m0 f63956d;

    public C14828a(C14951m0 m0Var, C14951m0 m0Var2) {
        C13706o.m87929f(m0Var, "delegate");
        C13706o.m87929f(m0Var2, "abbreviation");
        this.f63955c = m0Var;
        this.f63956d = m0Var2;
    }

    /* renamed from: G */
    public final C14951m0 mo74032G() {
        return mo73024W0();
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14828a(mo73024W0().mo73023V0(a1Var), this.f63956d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C14951m0 mo73024W0() {
        return this.f63955c;
    }

    /* renamed from: Z0 */
    public final C14951m0 mo74034Z0() {
        return this.f63956d;
    }

    /* renamed from: a1 */
    public C14828a mo73022U0(boolean z) {
        return new C14828a(mo73024W0().mo73022U0(z), this.f63956d.mo73022U0(z));
    }

    /* renamed from: b1 */
    public C14828a mo74033X0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo73024W0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C14900e0 h2 = gVar.mo74070h(this.f63956d);
        C13706o.m87927d(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C14828a((C14951m0) h, (C14951m0) h2);
    }

    /* renamed from: c1 */
    public C14828a mo73025Y0(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        return new C14828a(m0Var, this.f63956d);
    }
}
