package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends Multimap<K, V> {
    @CanIgnoreReturnValue
    /* renamed from: d */
    List<V> mo34426d(Object obj);

    List<V> get(@ParametricNullness K k);
}
