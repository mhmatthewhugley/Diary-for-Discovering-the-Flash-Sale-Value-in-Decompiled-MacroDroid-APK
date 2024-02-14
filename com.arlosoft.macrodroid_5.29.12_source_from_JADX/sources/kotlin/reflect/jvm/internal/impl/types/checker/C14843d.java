package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14833b0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14984w;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.d */
/* compiled from: IntersectionType.kt */
public final class C14843d {
    /* renamed from: a */
    public static final C14967q1 m92530a(List<? extends C14967q1> list) {
        C14951m0 m0Var;
        C13706o.m87929f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size == 1) {
            return (C14967q1) C13566b0.m87446u0(list);
        } else {
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            boolean z = false;
            boolean z2 = false;
            for (C14967q1 q1Var : list) {
                z = z || C14925g0.m92873a(q1Var);
                if (q1Var instanceof C14951m0) {
                    m0Var = (C14951m0) q1Var;
                } else if (!(q1Var instanceof C14990y)) {
                    throw new NoWhenBranchMatchedException();
                } else if (C14984w.m93156a(q1Var)) {
                    return q1Var;
                } else {
                    m0Var = ((C14990y) q1Var).mo74251V0();
                    z2 = true;
                }
                arrayList.add(m0Var);
            }
            if (z) {
                return C17088k.m100540d(C17087j.INTERSECTION_OF_ERROR_TYPES, list.toString());
            } else if (!z2) {
                return C14871w.f63995a.mo74103c(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
                for (C14967q1 d : list) {
                    arrayList2.add(C14833b0.m92417d(d));
                }
                C14871w wVar = C14871w.f63995a;
                return C14906f0.m92816d(wVar.mo74103c(arrayList), wVar.mo74103c(arrayList2));
            }
        }
    }
}
