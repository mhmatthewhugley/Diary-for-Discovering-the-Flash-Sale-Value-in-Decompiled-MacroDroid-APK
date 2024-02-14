package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.concurrent.ExecutionException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;
}
