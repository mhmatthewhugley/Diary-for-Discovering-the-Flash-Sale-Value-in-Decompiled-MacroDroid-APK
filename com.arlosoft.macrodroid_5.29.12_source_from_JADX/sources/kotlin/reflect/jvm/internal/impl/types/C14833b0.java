package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.b0 */
/* compiled from: flexibleTypes.kt */
public final class C14833b0 {
    /* renamed from: a */
    public static final C14990y m92414a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        C13706o.m87927d(Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (C14990y) Q0;
    }

    /* renamed from: b */
    public static final boolean m92415b(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return e0Var.mo74145Q0() instanceof C14990y;
    }

    /* renamed from: c */
    public static final C14951m0 m92416c(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            return ((C14990y) Q0).mo74251V0();
        }
        if (Q0 instanceof C14951m0) {
            return (C14951m0) Q0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final C14951m0 m92417d(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            return ((C14990y) Q0).mo74252W0();
        }
        if (Q0 instanceof C14951m0) {
            return (C14951m0) Q0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
