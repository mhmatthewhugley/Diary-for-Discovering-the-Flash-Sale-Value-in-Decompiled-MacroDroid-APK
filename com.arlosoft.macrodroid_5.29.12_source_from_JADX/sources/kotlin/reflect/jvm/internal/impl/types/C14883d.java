package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import p218bc.C11132g;
import p218bc.C11134i;
import p218bc.C11136k;
import p218bc.C11138m;
import p218bc.C11141p;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.d */
/* compiled from: AbstractStrictEqualityTypeChecker.kt */
public final class C14883d {

    /* renamed from: a */
    public static final C14883d f64003a = new C14883d();

    private C14883d() {
    }

    /* renamed from: a */
    private final boolean m92719a(C11141p pVar, C11136k kVar, C11136k kVar2) {
        if (pVar.mo62322r0(kVar) == pVar.mo62322r0(kVar2) && pVar.mo62332x0(kVar) == pVar.mo62332x0(kVar2)) {
            if ((pVar.mo62282N(kVar) == null) == (pVar.mo62282N(kVar2) == null) && pVar.mo62289X(pVar.mo62292b(kVar), pVar.mo62292b(kVar2))) {
                if (pVar.mo62337q(kVar, kVar2)) {
                    return true;
                }
                int r0 = pVar.mo62322r0(kVar);
                for (int i = 0; i < r0; i++) {
                    C11138m A = pVar.mo62265A(kVar, i);
                    C11138m A2 = pVar.mo62265A(kVar2, i);
                    if (pVar.mo62336z0(A) != pVar.mo62336z0(A2)) {
                        return false;
                    }
                    if (!pVar.mo62336z0(A) && (pVar.mo62313l0(A) != pVar.mo62313l0(A2) || !m92720c(pVar, pVar.mo62326u(A), pVar.mo62326u(A2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m92720c(C11141p pVar, C11134i iVar, C11134i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        C11136k e = pVar.mo62298e(iVar);
        C11136k e2 = pVar.mo62298e(iVar2);
        if (e != null && e2 != null) {
            return m92719a(pVar, e, e2);
        }
        C11132g L = pVar.mo62281L(iVar);
        C11132g L2 = pVar.mo62281L(iVar2);
        if (L == null || L2 == null || !m92719a(pVar, pVar.mo62294c(L), pVar.mo62294c(L2)) || !m92719a(pVar, pVar.mo62302g(L), pVar.mo62302g(L2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo74112b(C11141p pVar, C11134i iVar, C11134i iVar2) {
        C13706o.m87929f(pVar, "context");
        C13706o.m87929f(iVar, "a");
        C13706o.m87929f(iVar2, "b");
        return m92720c(pVar, iVar, iVar2);
    }
}
