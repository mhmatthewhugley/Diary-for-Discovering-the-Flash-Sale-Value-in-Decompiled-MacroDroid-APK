package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {

        /* renamed from: a */
        private final LoadingCache<K, V> f4334a;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public final LoadingCache<K, V> mo22326R() {
            return this.f4334a;
        }
    }

    protected ForwardingLoadingCache() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract LoadingCache<K, V> mo22326R();

    public V apply(K k) {
        return mo22326R().apply(k);
    }
}
