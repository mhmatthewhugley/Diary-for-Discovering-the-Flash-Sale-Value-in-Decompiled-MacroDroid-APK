package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    protected ForwardingSortedSetMultimap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract SortedSetMultimap<K, V> mo35238T();

    /* renamed from: d */
    public SortedSet<V> m27160d(Object obj) {
        return mo35238T().mo34426d(obj);
    }

    public SortedSet<V> get(@ParametricNullness K k) {
        return mo35238T().get(k);
    }
}
