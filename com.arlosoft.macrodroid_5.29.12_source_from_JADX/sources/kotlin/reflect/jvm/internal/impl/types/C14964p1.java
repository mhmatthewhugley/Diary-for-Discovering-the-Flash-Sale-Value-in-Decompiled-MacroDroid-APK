package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.p1 */
/* compiled from: TypeWithEnhancement.kt */
public final class C14964p1 {
    /* renamed from: a */
    public static final C14900e0 m93054a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        if (e0Var instanceof C14960o1) {
            return ((C14960o1) e0Var).mo74041h0();
        }
        return null;
    }

    /* renamed from: b */
    public static final C14967q1 m93055b(C14967q1 q1Var, C14900e0 e0Var) {
        C13706o.m87929f(q1Var, "<this>");
        C13706o.m87929f(e0Var, "origin");
        return m93057d(q1Var, m93054a(e0Var));
    }

    /* renamed from: c */
    public static final C14967q1 m93056c(C14967q1 q1Var, C14900e0 e0Var, C16265l<? super C14900e0, ? extends C14900e0> lVar) {
        C13706o.m87929f(q1Var, "<this>");
        C13706o.m87929f(e0Var, "origin");
        C13706o.m87929f(lVar, "transform");
        C14900e0 a = m93054a(e0Var);
        return m93057d(q1Var, a != null ? (C14900e0) lVar.invoke(a) : null);
    }

    /* renamed from: d */
    public static final C14967q1 m93057d(C14967q1 q1Var, C14900e0 e0Var) {
        C13706o.m87929f(q1Var, "<this>");
        if (q1Var instanceof C14960o1) {
            return m93057d(((C14960o1) q1Var).mo74038G0(), e0Var);
        }
        if (e0Var == null || C13706o.m87924a(e0Var, q1Var)) {
            return q1Var;
        }
        if (q1Var instanceof C14951m0) {
            return new C14963p0((C14951m0) q1Var, e0Var);
        }
        if (q1Var instanceof C14990y) {
            return new C14829a0((C14990y) q1Var, e0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
