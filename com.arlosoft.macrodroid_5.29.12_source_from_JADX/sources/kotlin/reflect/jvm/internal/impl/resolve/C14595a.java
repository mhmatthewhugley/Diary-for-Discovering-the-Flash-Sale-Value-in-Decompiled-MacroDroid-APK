package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k;
import p263fb.C12256d;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a */
/* compiled from: SealedClassInheritorsProvider.kt */
public final class C14595a extends C14675o {

    /* renamed from: a */
    public static final C14595a f63598a = new C14595a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a$a */
    /* compiled from: Comparisons.kt */
    public static final class C14596a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a(C16519a.m98615h((C13948e) t).mo78556b(), C16519a.m98615h((C13948e) t2).mo78556b());
        }
    }

    private C14595a() {
    }

    /* renamed from: b */
    private static final void m91453b(C13948e eVar, LinkedHashSet<C13948e> linkedHashSet, C14692h hVar, boolean z) {
        for (C14064m mVar : C14698k.C14699a.m91887a(hVar, C14683d.f63704t, (C16265l) null, 2, (Object) null)) {
            if (mVar instanceof C13948e) {
                C13948e eVar2 = (C13948e) mVar;
                if (eVar2.mo62175l0()) {
                    C16157f name = eVar2.getName();
                    C13706o.m87928e(name, "descriptor.name");
                    C13961h e = hVar.mo72800e(name, C12256d.WHEN_GET_ALL_DESCRIPTORS);
                    if (e instanceof C13948e) {
                        eVar2 = (C13948e) e;
                    } else {
                        eVar2 = e instanceof C13947d1 ? ((C13947d1) e).mo72281s() : null;
                    }
                }
                if (eVar2 != null) {
                    if (C14650d.m91639z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z) {
                        C14692h T = eVar2.mo72284T();
                        C13706o.m87928e(T, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m91453b(eVar, linkedHashSet, T, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<C13948e> mo73690a(C13948e eVar, boolean z) {
        C14064m mVar;
        C14064m mVar2;
        C13706o.m87929f(eVar, "sealedClass");
        if (eVar.mo62179r() != C13945d0.SEALED) {
            return C13614t.m87748j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            mVar = eVar.mo62163b();
        } else {
            Iterator<C14064m> it = C16519a.m98620m(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar2 = null;
                    break;
                }
                mVar2 = it.next();
                if (mVar2 instanceof C14050k0) {
                    break;
                }
            }
            mVar = mVar2;
        }
        if (mVar instanceof C14050k0) {
            m91453b(eVar, linkedHashSet, ((C14050k0) mVar).mo72205n(), z);
        }
        C14692h T = eVar.mo72284T();
        C13706o.m87928e(T, "sealedClass.unsubstitutedInnerClassesScope");
        m91453b(eVar, linkedHashSet, T, true);
        return C13566b0.m87450y0(linkedHashSet, new C14596a());
    }
}
