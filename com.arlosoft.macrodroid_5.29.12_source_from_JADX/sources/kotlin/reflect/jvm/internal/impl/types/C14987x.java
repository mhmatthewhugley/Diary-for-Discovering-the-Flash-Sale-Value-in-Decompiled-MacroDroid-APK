package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.C13706o;
import p218bc.C11134i;
import p218bc.C11136k;
import p218bc.C11139n;
import p218bc.C11140o;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.x */
/* compiled from: expandedTypeUtils.kt */
public final class C14987x {
    /* renamed from: a */
    public static final C11134i m93162a(C14952m1 m1Var, C11134i iVar) {
        C13706o.m87929f(m1Var, "<this>");
        C13706o.m87929f(iVar, "inlineClassType");
        return m93163b(m1Var, iVar, new HashSet());
    }

    /* renamed from: b */
    private static final C11134i m93163b(C14952m1 m1Var, C11134i iVar, HashSet<C11139n> hashSet) {
        C11134i iVar2;
        C11134i iVar3;
        C11139n T = m1Var.mo62285T(iVar);
        if (!hashSet.add(T)) {
            return null;
        }
        C11140o y0 = m1Var.mo62334y0(T);
        if (y0 != null) {
            C11134i R = m1Var.mo73783R(y0);
            iVar2 = m93163b(m1Var, R, hashSet);
            if (iVar2 == null) {
                return null;
            }
            boolean z = m1Var.mo73782Q(m1Var.mo62285T(R)) || ((R instanceof C11136k) && m1Var.mo62316o((C11136k) R));
            if ((iVar2 instanceof C11136k) && m1Var.mo62316o((C11136k) iVar2) && m1Var.mo62327u0(iVar) && z) {
                iVar3 = m1Var.mo73784Z(R);
            } else if (!m1Var.mo62327u0(iVar2) && m1Var.mo62318p(iVar)) {
                iVar3 = m1Var.mo73784Z(iVar2);
            }
            return iVar3;
        } else if (!m1Var.mo73782Q(T)) {
            return iVar;
        } else {
            C11134i M = m1Var.mo73780M(iVar);
            if (M == null || (iVar2 = m93163b(m1Var, M, hashSet)) == null) {
                return null;
            }
            if (m1Var.mo62327u0(iVar)) {
                if (m1Var.mo62327u0(iVar2)) {
                    return iVar;
                }
                return (!(iVar2 instanceof C11136k) || !m1Var.mo62316o((C11136k) iVar2)) ? m1Var.mo73784Z(iVar2) : iVar;
            }
        }
        return iVar2;
    }
}
