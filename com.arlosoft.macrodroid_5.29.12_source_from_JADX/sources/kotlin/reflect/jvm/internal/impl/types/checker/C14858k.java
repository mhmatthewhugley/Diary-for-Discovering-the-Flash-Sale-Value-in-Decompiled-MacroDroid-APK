package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14911f1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14846f;
import p218bc.C11127b;
import p225cc.C11170a;
import p297ja.C13328m;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.k */
/* compiled from: NewCapturedType.kt */
public final class C14858k {
    /* renamed from: a */
    private static final List<C14926g1> m92588a(C14967q1 q1Var, C11127b bVar) {
        boolean z;
        if (q1Var.mo73700L0().size() != q1Var.mo73702N0().getParameters().size()) {
            return null;
        }
        List<C14926g1> L0 = q1Var.mo73700L0();
        boolean z2 = true;
        if (!(L0 instanceof Collection) || !L0.isEmpty()) {
            Iterator<T> it = L0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C14926g1) it.next()).mo74185c() == C14970r1.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        List<C13950e1> parameters = q1Var.mo73702N0().getParameters();
        C13706o.m87928e(parameters, "type.constructor.parameters");
        List<C13328m> N0 = C13566b0.m87413N0(L0, parameters);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(N0, 10));
        for (C13328m mVar : N0) {
            C14926g1 g1Var = (C14926g1) mVar.mo70152a();
            C13950e1 e1Var = (C13950e1) mVar.mo70153b();
            if (g1Var.mo74185c() != C14970r1.INVARIANT) {
                C14967q1 Q0 = (g1Var.mo74184b() || g1Var.mo74185c() != C14970r1.IN_VARIANCE) ? null : g1Var.getType().mo74145Q0();
                C13706o.m87928e(e1Var, "parameter");
                g1Var = C11170a.m74952a(new C14852i(bVar, Q0, g1Var, e1Var));
            }
            arrayList.add(g1Var);
        }
        C14945l1 c = C14911f1.f64041c.mo74161b(q1Var.mo73702N0(), arrayList).mo74203c();
        int size = L0.size();
        for (int i = 0; i < size; i++) {
            C14926g1 g1Var2 = L0.get(i);
            C14926g1 g1Var3 = (C14926g1) arrayList.get(i);
            if (g1Var2.mo74185c() != C14970r1.INVARIANT) {
                List<C14900e0> upperBounds = q1Var.mo73702N0().getParameters().get(i).getUpperBounds();
                C13706o.m87928e(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                for (C14900e0 n : upperBounds) {
                    arrayList2.add(C14846f.C14847a.f63968a.mo74061a(c.mo74214n(n, C14970r1.INVARIANT).mo74145Q0()));
                }
                C14967q1 b = (g1Var2.mo74184b() || g1Var2.mo74185c() != C14970r1.OUT_VARIANCE) ? null : C14846f.C14847a.f63968a.mo74061a(g1Var2.getType().mo74145Q0());
                C14900e0 type = g1Var3.getType();
                C13706o.m87927d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((C14852i) type).mo73702N0().mo74081h(b, arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C14951m0 m92589b(C14951m0 m0Var, C11127b bVar) {
        C13706o.m87929f(m0Var, "type");
        C13706o.m87929f(bVar, NotificationCompat.CATEGORY_STATUS);
        List<C14926g1> a = m92588a(m0Var, bVar);
        if (a != null) {
            return m92590c(m0Var, a);
        }
        return null;
    }

    /* renamed from: c */
    private static final C14951m0 m92590c(C14967q1 q1Var, List<? extends C14926g1> list) {
        return C14906f0.m92821i(q1Var.mo73701M0(), q1Var.mo73702N0(), list, q1Var.mo73021O0(), (C14849g) null, 16, (Object) null);
    }
}
