package p398tb;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.C14654f;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p225cc.C11170a;
import p389sb.C16519a;

/* renamed from: tb.b */
/* compiled from: inlineClassManglingRules.kt */
public final class C16607b {
    /* renamed from: a */
    private static final boolean m98918a(C13948e eVar) {
        return C13706o.m87924a(C16519a.m98615h(eVar), C13902k.f62192n);
    }

    /* renamed from: b */
    public static final boolean m98919b(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return C14654f.m91643b(mVar) && !m98918a((C13948e) mVar);
    }

    /* renamed from: c */
    public static final boolean m98920c(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        return c != null && m98919b(c);
    }

    /* renamed from: d */
    private static final boolean m98921d(C14900e0 e0Var) {
        C13961h c = e0Var.mo73702N0().mo62183c();
        C13950e1 e1Var = c instanceof C13950e1 ? (C13950e1) c : null;
        if (e1Var == null) {
            return false;
        }
        return m98922e(C11170a.m74960i(e1Var));
    }

    /* renamed from: e */
    private static final boolean m98922e(C14900e0 e0Var) {
        return m98920c(e0Var) || m98921d(e0Var);
    }

    /* renamed from: f */
    public static final boolean m98923f(C13936b bVar) {
        C13706o.m87929f(bVar, "descriptor");
        C13944d dVar = bVar instanceof C13944d ? (C13944d) bVar : null;
        if (dVar == null || C14127t.m89525g(dVar.getVisibility())) {
            return false;
        }
        C13948e d0 = dVar.mo72390d0();
        C13706o.m87928e(d0, "constructorDescriptor.constructedClass");
        if (C14654f.m91643b(d0) || C14650d.m91607G(dVar.mo72390d0())) {
            return false;
        }
        List<C13966i1> g = dVar.mo72235g();
        C13706o.m87928e(g, "constructorDescriptor.valueParameters");
        if ((g instanceof Collection) && g.isEmpty()) {
            return false;
        }
        for (C13966i1 type : g) {
            C14900e0 type2 = type.getType();
            C13706o.m87928e(type2, "it.type");
            if (m98922e(type2)) {
                return true;
            }
        }
        return false;
    }
}
