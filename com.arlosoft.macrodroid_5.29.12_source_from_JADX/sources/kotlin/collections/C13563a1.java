package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¨\u0006\n"}, mo71668d2 = {"T", "", "element", "i", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "h", "k", "j", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.a1 */
/* compiled from: _Sets.kt */
class C13563a1 extends C13627z0 {
    /* renamed from: h */
    public static <T> Set<T> m87389h(Set<? extends T> set, Iterable<? extends T> iterable) {
        C13706o.m87929f(set, "<this>");
        C13706o.m87929f(iterable, "elements");
        Collection<? extends T> a = C13606p.m87639a(iterable, set);
        if (a.isEmpty()) {
            return C13566b0.m87407K0(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    /* renamed from: i */
    public static <T> Set<T> m87390i(Set<? extends T> set, T t) {
        C13706o.m87929f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13613s0.m87740e(set.size()));
        boolean z = false;
        for (T next : set) {
            boolean z2 = true;
            if (!z && C13706o.m87924a(next, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: j */
    public static <T> Set<T> m87391j(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        C13706o.m87929f(set, "<this>");
        C13706o.m87929f(iterable, "elements");
        Integer v = C13616u.m87775v(iterable);
        if (v != null) {
            i = set.size() + v.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13613s0.m87740e(i));
        linkedHashSet.addAll(set);
        boolean unused = C13624y.m87797z(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: k */
    public static <T> Set<T> m87392k(Set<? extends T> set, T t) {
        C13706o.m87929f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13613s0.m87740e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
