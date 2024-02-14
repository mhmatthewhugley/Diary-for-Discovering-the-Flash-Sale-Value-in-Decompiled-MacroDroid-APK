package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    @Beta
    protected class StandardDescendingMap extends Maps.DescendingMap<K, V> {

        /* renamed from: f */
        final /* synthetic */ ForwardingNavigableMap f16602f;

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public Iterator<Map.Entry<K, V>> mo34683W() {
            return new Iterator<Map.Entry<K, V>>() {

                /* renamed from: a */
                private Map.Entry<K, V> f16603a = null;

                /* renamed from: c */
                private Map.Entry<K, V> f16604c;

                {
                    this.f16604c = StandardDescendingMap.this.mo34684X().lastEntry();
                }

                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.f16604c;
                    if (entry != null) {
                        this.f16603a = entry;
                        this.f16604c = StandardDescendingMap.this.mo34684X().lowerEntry(this.f16604c.getKey());
                        return entry;
                    }
                    throw new NoSuchElementException();
                }

                public boolean hasNext() {
                    return this.f16604c != null;
                }

                public void remove() {
                    if (this.f16603a != null) {
                        StandardDescendingMap.this.mo34684X().remove(this.f16603a.getKey());
                        this.f16603a = null;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public NavigableMap<K, V> mo34684X() {
            return this.f16602f;
        }
    }

    @Beta
    protected class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
    }

    protected ForwardingNavigableMap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract NavigableMap<K, V> mo35191V();

    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        return mo35191V().ceilingEntry(k);
    }

    public K ceilingKey(@ParametricNullness K k) {
        return mo35191V().ceilingKey(k);
    }

    public NavigableSet<K> descendingKeySet() {
        return mo35191V().descendingKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return mo35191V().descendingMap();
    }

    public Map.Entry<K, V> firstEntry() {
        return mo35191V().firstEntry();
    }

    public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        return mo35191V().floorEntry(k);
    }

    public K floorKey(@ParametricNullness K k) {
        return mo35191V().floorKey(k);
    }

    public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        return mo35191V().headMap(k, z);
    }

    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        return mo35191V().higherEntry(k);
    }

    public K higherKey(@ParametricNullness K k) {
        return mo35191V().higherKey(k);
    }

    public Map.Entry<K, V> lastEntry() {
        return mo35191V().lastEntry();
    }

    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        return mo35191V().lowerEntry(k);
    }

    public K lowerKey(@ParametricNullness K k) {
        return mo35191V().lowerKey(k);
    }

    public NavigableSet<K> navigableKeySet() {
        return mo35191V().navigableKeySet();
    }

    public Map.Entry<K, V> pollFirstEntry() {
        return mo35191V().pollFirstEntry();
    }

    public Map.Entry<K, V> pollLastEntry() {
        return mo35191V().pollLastEntry();
    }

    public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        return mo35191V().subMap(k, z, k2, z2);
    }

    public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        return mo35191V().tailMap(k, z);
    }
}
