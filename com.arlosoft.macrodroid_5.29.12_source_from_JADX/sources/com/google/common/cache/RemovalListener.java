package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface RemovalListener<K, V> {
    /* renamed from: b */
    void mo22313b(RemovalNotification<K, V> removalNotification);
}
