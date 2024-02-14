package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {
    @CanIgnoreReturnValue
    /* renamed from: d */
    SortedSet<V> mo34426d(Object obj);

    SortedSet<V> get(@ParametricNullness K k);
}
