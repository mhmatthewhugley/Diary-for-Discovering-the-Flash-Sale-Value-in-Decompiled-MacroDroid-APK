package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new AbstractMapBasedMultimap.WrappedNavigableSet(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
        }
        return new AbstractMapBasedMultimap.WrappedSortedSet(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract SortedSet<V> mo34431y();

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public SortedSet<V> mo34693L() {
        return mo34422G(mo34431y());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public <E> SortedSet<E> mo34422G(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return Sets.m28733p((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* renamed from: w */
    public Map<K, Collection<V>> mo34430w() {
        return super.mo34430w();
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public SortedSet<V> m26458d(Object obj) {
        return (SortedSet) super.mo34426d(obj);
    }

    public SortedSet<V> get(@ParametricNullness K k) {
        return (SortedSet) super.get((Object) k);
    }
}
