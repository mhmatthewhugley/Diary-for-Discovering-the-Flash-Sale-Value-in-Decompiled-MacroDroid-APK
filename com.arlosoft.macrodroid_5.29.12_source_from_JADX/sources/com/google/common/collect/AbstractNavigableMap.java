package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    private final class DescendingMap extends Maps.DescendingMap<K, V> {
        private DescendingMap() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public Iterator<Map.Entry<K, V>> mo34683W() {
            return AbstractNavigableMap.this.mo34661b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public NavigableMap<K, V> mo34684X() {
            return AbstractNavigableMap.this;
        }
    }

    AbstractNavigableMap() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo34661b();

    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(@ParametricNullness K k) {
        return Maps.m28109x(ceilingEntry(k));
    }

    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new DescendingMap();
    }

    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.m27725u(mo34750a(), null);
    }

    @ParametricNullness
    public K firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(@ParametricNullness K k) {
        return Maps.m28109x(floorEntry(k));
    }

    public SortedMap<K, V> headMap(@ParametricNullness K k) {
        return headMap(k, false);
    }

    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(@ParametricNullness K k) {
        return Maps.m28109x(higherEntry(k));
    }

    public Set<K> keySet() {
        return navigableKeySet();
    }

    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.m27725u(mo34661b(), null);
    }

    @ParametricNullness
    public K lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(@ParametricNullness K k) {
        return Maps.m28109x(lowerEntry(k));
    }

    public NavigableSet<K> navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.m27696C(mo34750a());
    }

    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.m27696C(mo34661b());
    }

    public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        return subMap(k, true, k2, false);
    }

    public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        return tailMap(k, true);
    }
}
