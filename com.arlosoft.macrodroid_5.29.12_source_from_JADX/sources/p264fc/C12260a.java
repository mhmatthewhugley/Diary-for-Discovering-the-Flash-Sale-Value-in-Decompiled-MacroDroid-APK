package p264fc;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p272gc.C12354e;

/* renamed from: fc.a */
/* compiled from: scopeUtils.kt */
public final class C12260a {
    /* renamed from: a */
    public static final <T> Collection<T> m83002a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C13706o.m87929f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C12354e<C14692h> m83003b(Iterable<? extends C14692h> iterable) {
        C13706o.m87929f(iterable, "scopes");
        C12354e<C14692h> eVar = new C12354e<>();
        for (Object next : iterable) {
            C14692h hVar = (C14692h) next;
            if ((hVar == null || hVar == C14692h.C14695b.f63726b) ? false : true) {
                eVar.add(next);
            }
        }
        return eVar;
    }
}
