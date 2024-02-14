package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.checker.C14852i;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.q0 */
/* compiled from: SpecialTypes.kt */
public final class C14966q0 {
    /* renamed from: a */
    public static final C14828a m93063a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14828a) {
            return (C14828a) Q0;
        }
        return null;
    }

    /* renamed from: b */
    public static final C14951m0 m93064b(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14828a a = m93063a(e0Var);
        if (a != null) {
            return a.mo74034Z0();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m93065c(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return e0Var.mo74145Q0() instanceof C14961p;
    }

    /* renamed from: d */
    private static final C14884d0 m93066d(C14884d0 d0Var) {
        C14900e0 e0Var;
        Collection<C14900e0> l = d0Var.mo72370l();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(l, 10));
        Iterator<T> it = l.iterator();
        boolean z = false;
        while (true) {
            e0Var = null;
            if (!it.hasNext()) {
                break;
            }
            C14900e0 next = it.next();
            if (C14956n1.m92997l(next)) {
                next = m93068f(next.mo74145Q0(), false, 1, (Object) null);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            return null;
        }
        C14900e0 g = d0Var.mo74116g();
        if (g != null) {
            if (C14956n1.m92997l(g)) {
                g = m93068f(g.mo74145Q0(), false, 1, (Object) null);
            }
            e0Var = g;
        }
        return new C14884d0(arrayList).mo74120k(e0Var);
    }

    /* renamed from: e */
    public static final C14967q1 m93067e(C14967q1 q1Var, boolean z) {
        C13706o.m87929f(q1Var, "<this>");
        C14961p b = C14961p.f64086f.mo74228b(q1Var, z);
        if (b != null) {
            return b;
        }
        C14951m0 g = m93069g(q1Var);
        return g != null ? g : q1Var.mo72947R0(false);
    }

    /* renamed from: f */
    public static /* synthetic */ C14967q1 m93068f(C14967q1 q1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m93067e(q1Var, z);
    }

    /* renamed from: g */
    private static final C14951m0 m93069g(C14900e0 e0Var) {
        C14884d0 d;
        C14901e1 N0 = e0Var.mo73702N0();
        C14884d0 d0Var = N0 instanceof C14884d0 ? (C14884d0) N0 : null;
        if (d0Var == null || (d = m93066d(d0Var)) == null) {
            return null;
        }
        return d.mo74115f();
    }

    /* renamed from: h */
    public static final C14951m0 m93070h(C14951m0 m0Var, boolean z) {
        C13706o.m87929f(m0Var, "<this>");
        C14961p b = C14961p.f64086f.mo74228b(m0Var, z);
        if (b != null) {
            return b;
        }
        C14951m0 g = m93069g(m0Var);
        return g == null ? m0Var.mo73022U0(false) : g;
    }

    /* renamed from: i */
    public static /* synthetic */ C14951m0 m93071i(C14951m0 m0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m93070h(m0Var, z);
    }

    /* renamed from: j */
    public static final C14951m0 m93072j(C14951m0 m0Var, C14951m0 m0Var2) {
        C13706o.m87929f(m0Var, "<this>");
        C13706o.m87929f(m0Var2, "abbreviatedType");
        if (C14925g0.m92873a(m0Var)) {
            return m0Var;
        }
        return new C14828a(m0Var, m0Var2);
    }

    /* renamed from: k */
    public static final C14852i m93073k(C14852i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return new C14852i(iVar.mo74073W0(), iVar.mo73702N0(), iVar.mo74075Y0(), iVar.mo73701M0(), iVar.mo73021O0(), true);
    }
}
