package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    /* access modifiers changed from: private */
    public final ImmutableMap<K, V> map;

    @GwtIncompatible
    private static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<?, V> map;

        SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.map.values();
        }
    }

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    /* renamed from: c */
    public ImmutableList<V> mo35029c() {
        final ImmutableList<Map.Entry<K, V>> c = this.map.entrySet().mo35029c();
        return new ImmutableList<V>(this) {
            public V get(int i) {
                return ((Map.Entry) c.get(i)).getValue();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public boolean mo34781j() {
                return true;
            }

            public int size() {
                return c.size();
            }
        };
    }

    public boolean contains(Object obj) {
        return obj != null && Iterators.m27714j(iterator(), obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return true;
    }

    /* renamed from: k */
    public UnmodifiableIterator<V> iterator() {
        return new UnmodifiableIterator<V>() {

            /* renamed from: a */
            final UnmodifiableIterator<Map.Entry<K, V>> f16671a;

            {
                this.f16671a = ImmutableMapValues.this.map.entrySet().iterator();
            }

            public boolean hasNext() {
                return this.f16671a.hasNext();
            }

            public V next() {
                return this.f16671a.next().getValue();
            }
        };
    }

    public int size() {
        return this.map.size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.map);
    }
}
