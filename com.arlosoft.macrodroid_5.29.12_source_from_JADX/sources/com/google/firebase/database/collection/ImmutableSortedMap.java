package com.google.firebase.database.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    public static class Builder {

        /* renamed from: a */
        private static final KeyTranslator f5532a = ImmutableSortedMap$Builder$$Lambda$1.m7656b();

        /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
        public interface KeyTranslator<C, D> {
            /* renamed from: a */
            D mo23551a(C c);
        }

        /* renamed from: a */
        public static <A, B, C> ImmutableSortedMap<A, C> m7651a(List<A> list, Map<B, C> map, KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            if (list.size() < 25) {
                return ArraySortedMap.m7628p(list, map, keyTranslator, comparator);
            }
            return RBTreeSortedMap.m7708m(list, map, keyTranslator, comparator);
        }

        /* renamed from: b */
        public static <K, V> ImmutableSortedMap<K, V> m7652b(Comparator<K> comparator) {
            return new ArraySortedMap(comparator);
        }

        /* renamed from: c */
        public static <A> KeyTranslator<A, A> m7653c() {
            return f5532a;
        }

        /* renamed from: d */
        static /* synthetic */ Object m7654d(Object obj) {
            return obj;
        }
    }

    /* renamed from: c */
    public abstract boolean mo23533c(K k);

    /* renamed from: d */
    public abstract V mo23534d(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        if (!mo23535f().equals(immutableSortedMap.mo23535f()) || size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = immutableSortedMap.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Comparator<K> mo23535f();

    /* renamed from: h */
    public abstract K mo23536h();

    public int hashCode() {
        int hashCode = mo23535f().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public abstract K mo23537i();

    public abstract boolean isEmpty();

    public abstract Iterator<Map.Entry<K, V>> iterator();

    /* renamed from: j */
    public abstract ImmutableSortedMap<K, V> mo23540j(K k, V v);

    /* renamed from: k */
    public abstract Iterator<Map.Entry<K, V>> mo23541k(K k);

    /* renamed from: l */
    public abstract ImmutableSortedMap<K, V> mo23542l(K k);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
