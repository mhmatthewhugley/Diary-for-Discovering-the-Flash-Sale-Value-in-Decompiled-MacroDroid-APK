package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    @Beta
    protected class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    protected ForwardingSortedMap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract SortedMap<K, V> mo34375R();

    public Comparator<? super K> comparator() {
        return mo34375R().comparator();
    }

    @ParametricNullness
    public K firstKey() {
        return mo34375R().firstKey();
    }

    public SortedMap<K, V> headMap(@ParametricNullness K k) {
        return mo34375R().headMap(k);
    }

    @ParametricNullness
    public K lastKey() {
        return mo34375R().lastKey();
    }

    public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        return mo34375R().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        return mo34375R().tailMap(k);
    }
}
