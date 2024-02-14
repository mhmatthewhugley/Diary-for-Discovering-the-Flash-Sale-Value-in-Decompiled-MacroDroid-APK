package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14004k0;
import p225cc.C11170a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.t */
/* compiled from: DescriptorSubstitutor */
public class C14975t {
    /* renamed from: a */
    private static /* synthetic */ void m93113a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static C14945l1 m93114b(List<C13950e1> list, C14936j1 j1Var, C14064m mVar, List<C13950e1> list2) {
        if (list == null) {
            m93113a(0);
        }
        if (j1Var == null) {
            m93113a(1);
        }
        if (mVar == null) {
            m93113a(2);
        }
        if (list2 == null) {
            m93113a(3);
        }
        C14945l1 c = m93115c(list, j1Var, mVar, list2, (boolean[]) null);
        if (c != null) {
            return c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static C14945l1 m93115c(List<C13950e1> list, C14936j1 j1Var, C14064m mVar, List<C13950e1> list2, boolean[] zArr) {
        C14936j1 j1Var2 = j1Var;
        List<C13950e1> list3 = list2;
        if (list == null) {
            m93113a(5);
        }
        if (j1Var2 == null) {
            m93113a(6);
        }
        if (mVar == null) {
            m93113a(7);
        }
        if (list3 == null) {
            m93113a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (C13950e1 next : list) {
            C14004k0 Q0 = C14004k0.m88944Q0(mVar, next.getAnnotations(), next.mo72276v(), next.mo72273l(), next.getName(), i, C14158z0.f62778a, next.mo72268M());
            hashMap.put(next.mo62171j(), new C14933i1(Q0.mo72274p()));
            hashMap2.put(next, Q0);
            list3.add(Q0);
            i++;
        }
        C14911f1 j = C14911f1.m92830j(hashMap);
        C14945l1 h = C14945l1.m92940h(j1Var2, j);
        C14945l1 h2 = C14945l1.m92940h(j1Var.mo74206h(), j);
        for (C13950e1 next2 : list) {
            C14004k0 k0Var = (C14004k0) hashMap2.get(next2);
            for (C14900e0 next3 : next2.getUpperBounds()) {
                C13961h c = next3.mo73702N0().mo62183c();
                C14900e0 p = ((!(c instanceof C13950e1) || !C11170a.m74961j((C13950e1) c)) ? h2 : h).mo74215p(next3, C14970r1.OUT_VARIANCE);
                if (p == null) {
                    return null;
                }
                if (!(p == next3 || zArr == null)) {
                    zArr[0] = true;
                }
                k0Var.mo72423M0(p);
            }
            k0Var.mo72425V0();
        }
        return h;
    }
}
