package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n0 */
/* compiled from: PackageFragmentProvider.kt */
public final class C14070n0 {
    /* renamed from: a */
    public static final void m89331a(C14053l0 l0Var, C16152c cVar, Collection<C14050k0> collection) {
        C13706o.m87929f(l0Var, "<this>");
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(collection, "packageFragments");
        if (l0Var instanceof C14072o0) {
            ((C14072o0) l0Var).mo72410c(cVar, collection);
        } else {
            collection.addAll(l0Var.mo72409b(cVar));
        }
    }

    /* renamed from: b */
    public static final boolean m89332b(C14053l0 l0Var, C16152c cVar) {
        C13706o.m87929f(l0Var, "<this>");
        C13706o.m87929f(cVar, "fqName");
        if (l0Var instanceof C14072o0) {
            return ((C14072o0) l0Var).mo72408a(cVar);
        }
        return m89333c(l0Var, cVar).isEmpty();
    }

    /* renamed from: c */
    public static final List<C14050k0> m89333c(C14053l0 l0Var, C16152c cVar) {
        C13706o.m87929f(l0Var, "<this>");
        C13706o.m87929f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        m89331a(l0Var, cVar, arrayList);
        return arrayList;
    }
}
