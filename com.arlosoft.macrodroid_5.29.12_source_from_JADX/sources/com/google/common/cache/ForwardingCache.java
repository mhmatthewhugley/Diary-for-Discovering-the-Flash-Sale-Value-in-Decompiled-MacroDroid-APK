package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {

        /* renamed from: a */
        private final Cache<K, V> f4333a;

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public final Cache<K, V> mo22325Q() {
            return this.f4333a;
        }
    }

    protected ForwardingCache() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Cache<K, V> mo22325Q();
}
