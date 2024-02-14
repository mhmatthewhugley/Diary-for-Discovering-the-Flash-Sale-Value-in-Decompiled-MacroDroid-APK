package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    /* renamed from: Q */
    public SortedMap<K, Collection<V>> mo34430w() {
        return (SortedMap) super.mo34430w();
    }

    /* renamed from: R */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        return mo34433B();
    }
}
