package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13932l;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.k1 */
/* compiled from: TypeSubstitution.kt */
public final class C14942k1 {
    /* renamed from: a */
    public static final C14951m0 m92921a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        C14951m0 m0Var = Q0 instanceof C14951m0 ? (C14951m0) Q0 : null;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + e0Var).toString());
    }

    /* renamed from: b */
    public static final C14900e0 m92922b(C14900e0 e0Var, List<? extends C14926g1> list, C13921g gVar) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(list, "newArguments");
        C13706o.m87929f(gVar, "newAnnotations");
        return m92925e(e0Var, list, gVar, (List) null, 4, (Object) null);
    }

    /* renamed from: c */
    public static final C14900e0 m92923c(C14900e0 e0Var, List<? extends C14926g1> list, C13921g gVar, List<? extends C14926g1> list2) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(list, "newArguments");
        C13706o.m87929f(gVar, "newAnnotations");
        C13706o.m87929f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == e0Var.mo73700L0()) && gVar == e0Var.getAnnotations()) {
            return e0Var;
        }
        C14830a1 M0 = e0Var.mo73701M0();
        if ((gVar instanceof C13932l) && gVar.isEmpty()) {
            gVar = C13921g.f62330v.mo72251b();
        }
        C14830a1 a = C14834b1.m92418a(M0, gVar);
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            C14990y yVar = (C14990y) Q0;
            return C14906f0.m92816d(m92924d(yVar.mo74251V0(), list, a), m92924d(yVar.mo74252W0(), list2, a));
        } else if (Q0 instanceof C14951m0) {
            return m92924d((C14951m0) Q0, list, a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final C14951m0 m92924d(C14951m0 m0Var, List<? extends C14926g1> list, C14830a1 a1Var) {
        C13706o.m87929f(m0Var, "<this>");
        C13706o.m87929f(list, "newArguments");
        C13706o.m87929f(a1Var, "newAttributes");
        if (list.isEmpty() && a1Var == m0Var.mo73701M0()) {
            return m0Var;
        }
        if (list.isEmpty()) {
            return m0Var.mo73023V0(a1Var);
        }
        return C14906f0.m92821i(a1Var, m0Var.mo73702N0(), list, m0Var.mo73021O0(), (C14849g) null, 16, (Object) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C14900e0 m92925e(C14900e0 e0Var, List<C14926g1> list, C13921g gVar, List<C14926g1> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = e0Var.mo73700L0();
        }
        if ((i & 2) != 0) {
            gVar = e0Var.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m92923c(e0Var, list, gVar, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ C14951m0 m92926f(C14951m0 m0Var, List<C14926g1> list, C14830a1 a1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = m0Var.mo73700L0();
        }
        if ((i & 2) != 0) {
            a1Var = m0Var.mo73701M0();
        }
        return m92924d(m0Var, list, a1Var);
    }
}
