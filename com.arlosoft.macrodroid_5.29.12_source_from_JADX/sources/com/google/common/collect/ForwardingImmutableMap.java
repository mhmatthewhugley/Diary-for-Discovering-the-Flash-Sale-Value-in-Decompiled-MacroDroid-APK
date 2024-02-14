package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class ForwardingImmutableMap<K, V> {
    private ForwardingImmutableMap() {
    }
}
