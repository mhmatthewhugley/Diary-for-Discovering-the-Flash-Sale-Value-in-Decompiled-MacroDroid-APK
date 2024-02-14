package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import p272gc.C12359f;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.l */
/* compiled from: overridingUtils.kt */
public final class C14671l {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.l$a */
    /* compiled from: overridingUtils.kt */
    static final class C14672a extends C13708q implements C16265l<H, C13339u> {
        final /* synthetic */ C12359f<H> $conflictedHandles;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14672a(C12359f<H> fVar) {
            super(1);
            this.$conflictedHandles = fVar;
        }

        /* renamed from: a */
        public final void mo73791a(H h) {
            C12359f<H> fVar = this.$conflictedHandles;
            C13706o.m87928e(h, "it");
            fVar.add(h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73791a(obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: a */
    public static final <H> Collection<H> m91795a(Collection<? extends H> collection, C16265l<? super H, ? extends C13908a> lVar) {
        C13706o.m87929f(collection, "<this>");
        C13706o.m87929f(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C12359f a = C12359f.f59044d.mo68706a();
        while (!linkedList.isEmpty()) {
            Object W = C13566b0.m87422W(linkedList);
            C12359f a2 = C12359f.f59044d.mo68706a();
            Collection<H> p = C14658j.m91681p(W, linkedList, lVar, new C14672a(a2));
            C13706o.m87928e(p, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (p.size() != 1 || !a2.isEmpty()) {
                Object L = C14658j.m91665L(p, lVar);
                C13706o.m87928e(L, "selectMostSpecificMember…roup, descriptorByHandle)");
                C13908a aVar = (C13908a) lVar.invoke(L);
                for (T next : p) {
                    C13706o.m87928e(next, "it");
                    if (!C14658j.m91658B(aVar, (C13908a) lVar.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(L);
            } else {
                Object t0 = C13566b0.m87445t0(p);
                C13706o.m87928e(t0, "overridableGroup.single()");
                a.add(t0);
            }
        }
        return a;
    }
}
