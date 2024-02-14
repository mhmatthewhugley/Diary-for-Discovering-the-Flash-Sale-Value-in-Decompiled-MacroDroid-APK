package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class AtomicLongMap<K> implements Serializable {
    private final ConcurrentHashMap<K, AtomicLong> map;

    /* renamed from: com.google.common.util.concurrent.AtomicLongMap$1 */
    class C109731 implements Function<AtomicLong, Long> {
        /* renamed from: a */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    public String toString() {
        return this.map.toString();
    }
}
