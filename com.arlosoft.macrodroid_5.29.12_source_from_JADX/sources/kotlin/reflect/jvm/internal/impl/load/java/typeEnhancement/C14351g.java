package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14935j0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14964p1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14968r;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import p225cc.C11170a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g */
/* compiled from: typeEnhancement.kt */
public final class C14351g extends C14968r implements C14935j0 {

    /* renamed from: c */
    private final C14951m0 f63135c;

    public C14351g(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        this.f63135c = m0Var;
    }

    /* renamed from: Z0 */
    private final C14951m0 m90332Z0(C14951m0 m0Var) {
        C14951m0 U0 = m0Var.mo73022U0(false);
        if (!C11170a.m74968q(m0Var)) {
            return U0;
        }
        return new C14351g(U0);
    }

    /* renamed from: E0 */
    public boolean mo73020E0() {
        return true;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return false;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        return z ? mo73024W0().mo73022U0(true) : this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C14951m0 mo73024W0() {
        return this.f63135c;
    }

    /* renamed from: a1 */
    public C14351g mo73023V0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14351g(mo73024W0().mo73023V0(a1Var));
    }

    /* renamed from: b1 */
    public C14351g mo73025Y0(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        return new C14351g(m0Var);
    }

    /* renamed from: k0 */
    public C14900e0 mo73028k0(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "replacement");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (!C11170a.m74968q(Q0) && !C14956n1.m92997l(Q0)) {
            return Q0;
        }
        if (Q0 instanceof C14951m0) {
            return m90332Z0((C14951m0) Q0);
        }
        if (Q0 instanceof C14990y) {
            C14990y yVar = (C14990y) Q0;
            return C14964p1.m93057d(C14906f0.m92816d(m90332Z0(yVar.mo74251V0()), m90332Z0(yVar.mo74252W0())), C14964p1.m93054a(Q0));
        }
        throw new IllegalStateException(("Incorrect type: " + Q0).toString());
    }
}
