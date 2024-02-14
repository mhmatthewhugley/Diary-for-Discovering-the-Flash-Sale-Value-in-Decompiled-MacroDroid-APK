package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Weigher<K, V> {
    /* renamed from: b */
    int mo22314b(K k, V v);
}
