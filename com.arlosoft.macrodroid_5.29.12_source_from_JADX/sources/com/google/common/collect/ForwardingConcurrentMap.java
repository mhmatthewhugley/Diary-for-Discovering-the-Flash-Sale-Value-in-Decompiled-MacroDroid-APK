package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingConcurrentMap<K, V> extends ForwardingMap<K, V> implements ConcurrentMap<K, V> {
    protected ForwardingConcurrentMap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract ConcurrentMap<K, V> mo34375R();

    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        return mo34375R().putIfAbsent(k, v);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        return mo34375R().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        return mo34375R().replace(k, v);
    }

    @CanIgnoreReturnValue
    public boolean replace(K k, V v, V v2) {
        return mo34375R().replace(k, v, v2);
    }
}
