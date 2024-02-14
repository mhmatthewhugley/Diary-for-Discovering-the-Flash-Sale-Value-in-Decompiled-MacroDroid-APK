package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14070n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14072o0;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.i */
/* compiled from: CompositePackageFragmentProvider.kt */
public final class C13997i implements C14072o0 {

    /* renamed from: a */
    private final List<C14053l0> f62524a;

    /* renamed from: b */
    private final String f62525b;

    public C13997i(List<? extends C14053l0> list, String str) {
        C13706o.m87929f(list, "providers");
        C13706o.m87929f(str, "debugName");
        this.f62524a = list;
        this.f62525b = str;
        list.size();
        C13566b0.m87407K0(list).size();
    }

    /* renamed from: a */
    public boolean mo72408a(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        List<C14053l0> list = this.f62524a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C14053l0 b : list) {
            if (!C14070n0.m89332b(b, cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public List<C14050k0> mo72409b(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C14053l0 a : this.f62524a) {
            C14070n0.m89331a(a, cVar, arrayList);
        }
        return C13566b0.m87402F0(arrayList);
    }

    /* renamed from: c */
    public void mo72410c(C16152c cVar, Collection<C14050k0> collection) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(collection, "packageFragments");
        for (C14053l0 a : this.f62524a) {
            C14070n0.m89331a(a, cVar, collection);
        }
    }

    /* renamed from: o */
    public Collection<C16152c> mo72411o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C14053l0 o : this.f62524a) {
            hashSet.addAll(o.mo72411o(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f62525b;
    }
}
