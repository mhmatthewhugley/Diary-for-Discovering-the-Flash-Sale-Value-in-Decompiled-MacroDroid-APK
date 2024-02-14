package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    protected AbstractLoadingCache() {
    }

    /* renamed from: a */
    public V mo22281a(K k) {
        try {
            return get(k);
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }

    public final V apply(K k) {
        return mo22281a(k);
    }
}
