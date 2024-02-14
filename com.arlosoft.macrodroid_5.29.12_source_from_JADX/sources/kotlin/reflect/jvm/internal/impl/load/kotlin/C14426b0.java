package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14399s;
import kotlin.reflect.jvm.internal.impl.types.C14952m1;
import p218bc.C11134i;
import p218bc.C11139n;
import p362pb.C16151b;
import p362pb.C16153d;
import p398tb.C16609d;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b0 */
/* compiled from: typeSignatureMapping.kt */
public final class C14426b0 {
    /* renamed from: a */
    public static final <T> T m90535a(C14451m<T> mVar, T t, boolean z) {
        C13706o.m87929f(mVar, "<this>");
        C13706o.m87929f(t, "possiblyPrimitiveType");
        return z ? mVar.mo73190b(t) : t;
    }

    /* renamed from: b */
    public static final <T> T m90536b(C14952m1 m1Var, C11134i iVar, C14451m<T> mVar, C14418a0 a0Var) {
        C13706o.m87929f(m1Var, "<this>");
        C13706o.m87929f(iVar, "type");
        C13706o.m87929f(mVar, "typeFactory");
        C13706o.m87929f(a0Var, "mode");
        C11139n T = m1Var.mo62285T(iVar);
        if (!m1Var.mo62330w0(T)) {
            return null;
        }
        C13859i m = m1Var.mo73786m(T);
        boolean z = true;
        if (m != null) {
            T c = mVar.mo73191c(m);
            if (!m1Var.mo62327u0(iVar) && !C14399s.m90442c(m1Var, iVar)) {
                z = false;
            }
            return m90535a(mVar, c, z);
        }
        C13859i a0 = m1Var.mo73785a0(T);
        if (a0 != null) {
            return mVar.mo73189a('[' + C16610e.m98935e(a0).mo79462f());
        }
        if (m1Var.mo73789v0(T)) {
            C16153d s0 = m1Var.mo73788s0(T);
            C16151b n = s0 != null ? C13871c.f62112a.mo72174n(s0) : null;
            if (n != null) {
                if (!a0Var.mo73126a()) {
                    List<C13871c.C13872a> i = C13871c.f62112a.mo72170i();
                    if (!(i instanceof Collection) || !i.isEmpty()) {
                        Iterator<T> it = i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C13706o.m87924a(((C13871c.C13872a) it.next()).mo72180d(), n)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String f = C16609d.m98927b(n).mo79458f();
                C13706o.m87928e(f, "byClassId(classId).internalName");
                return mVar.mo73193e(f);
            }
        }
        return null;
    }
}
