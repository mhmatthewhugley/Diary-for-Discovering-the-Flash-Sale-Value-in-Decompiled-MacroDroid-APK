package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    Set<V> values();

    /* renamed from: x0 */
    BiMap<V, K> mo34390x0();
}
