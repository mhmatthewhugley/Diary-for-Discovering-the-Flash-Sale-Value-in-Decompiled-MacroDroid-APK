package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class ImmutableSortedSet<T> implements Iterable<T> {

    /* renamed from: a */
    private final ImmutableSortedMap<T, Void> f5536a;

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    private static class WrappedEntryIterator<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<T, Void>> f5537a;

        public WrappedEntryIterator(Iterator<Map.Entry<T, Void>> it) {
            this.f5537a = it;
        }

        public boolean hasNext() {
            return this.f5537a.hasNext();
        }

        public T next() {
            return this.f5537a.next().getKey();
        }

        public void remove() {
            this.f5537a.remove();
        }
    }

    public ImmutableSortedSet(List<T> list, Comparator<T> comparator) {
        this.f5536a = ImmutableSortedMap.Builder.m7651a(list, Collections.emptyMap(), ImmutableSortedMap.Builder.m7653c(), comparator);
    }

    /* renamed from: c */
    public T mo23556c() {
        return this.f5536a.mo23536h();
    }

    public boolean contains(T t) {
        return this.f5536a.mo23533c(t);
    }

    /* renamed from: d */
    public T mo23558d() {
        return this.f5536a.mo23537i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedSet)) {
            return false;
        }
        return this.f5536a.equals(((ImmutableSortedSet) obj).f5536a);
    }

    /* renamed from: f */
    public ImmutableSortedSet<T> mo23560f(T t) {
        return new ImmutableSortedSet<>(this.f5536a.mo23540j(t, null));
    }

    /* renamed from: h */
    public Iterator<T> mo23561h(T t) {
        return new WrappedEntryIterator(this.f5536a.mo23541k(t));
    }

    public int hashCode() {
        return this.f5536a.hashCode();
    }

    /* renamed from: i */
    public ImmutableSortedSet<T> mo23563i(T t) {
        ImmutableSortedMap<T, Void> l = this.f5536a.mo23542l(t);
        return l == this.f5536a ? this : new ImmutableSortedSet<>(l);
    }

    public boolean isEmpty() {
        return this.f5536a.isEmpty();
    }

    public Iterator<T> iterator() {
        return new WrappedEntryIterator(this.f5536a.iterator());
    }

    /* renamed from: j */
    public ImmutableSortedSet<T> mo23566j(ImmutableSortedSet<T> immutableSortedSet) {
        ImmutableSortedSet<T> immutableSortedSet2;
        ImmutableSortedSet<T> immutableSortedSet3;
        if (size() < immutableSortedSet.size()) {
            immutableSortedSet3 = immutableSortedSet;
            immutableSortedSet2 = this;
        } else {
            immutableSortedSet3 = this;
            immutableSortedSet2 = immutableSortedSet;
        }
        Iterator it = immutableSortedSet2.iterator();
        while (it.hasNext()) {
            immutableSortedSet3 = immutableSortedSet3.mo23560f(it.next());
        }
        return immutableSortedSet3;
    }

    public int size() {
        return this.f5536a.size();
    }

    private ImmutableSortedSet(ImmutableSortedMap<T, Void> immutableSortedMap) {
        this.f5536a = immutableSortedMap;
    }
}
