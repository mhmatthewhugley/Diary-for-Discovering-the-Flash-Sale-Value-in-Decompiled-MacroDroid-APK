package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    private final ImmutableMap<K, V> map;

    @GwtIncompatible
    private static class KeySetSerializedForm<K> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, ?> map;

        KeySetSerializedForm(ImmutableMap<K, ?> immutableMap) {
            this.map = immutableMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.map.keySet();
        }
    }

    ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    public K get(int i) {
        return this.map.entrySet().mo35029c().get(i).getKey();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return true;
    }

    /* renamed from: k */
    public UnmodifiableIterator<K> iterator() {
        return this.map.mo35372k();
    }

    public int size() {
        return this.map.size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new KeySetSerializedForm(this.map);
    }
}
