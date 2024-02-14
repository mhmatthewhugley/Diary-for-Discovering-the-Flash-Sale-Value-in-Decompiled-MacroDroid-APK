package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @CanIgnoreReturnValue
    /* renamed from: d */
    Set<V> mo34426d(Object obj);

    Set<V> get(@ParametricNullness K k);

    /* renamed from: i */
    Set<Map.Entry<K, V>> mo34445i();
}
