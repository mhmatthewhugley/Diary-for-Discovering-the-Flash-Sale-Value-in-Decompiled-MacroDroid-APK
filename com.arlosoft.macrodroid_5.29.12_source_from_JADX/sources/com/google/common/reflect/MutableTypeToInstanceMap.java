package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: a */
    private final Map<TypeToken<? extends B>, B> f53281a = Maps.m28058A();

    private static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {

        /* renamed from: a */
        private final Map.Entry<K, V> f53282a;

        private UnmodifiableEntry(Map.Entry<K, V> entry) {
            this.f53282a = (Map.Entry) Preconditions.m5392s(entry);
        }

        /* renamed from: V */
        public static /* synthetic */ UnmodifiableEntry m73705V(Map.Entry entry) {
            return new UnmodifiableEntry(entry);
        }

        /* access modifiers changed from: private */
        /* renamed from: X */
        public static <K, V> Iterator<Map.Entry<K, V>> m73707X(Iterator<Map.Entry<K, V>> it) {
            return Iterators.m27703J(it, C10947a.f53337a);
        }

        /* renamed from: Y */
        static <K, V> Set<Map.Entry<K, V>> m73708Y(final Set<Map.Entry<K, V>> set) {
            return new ForwardingSet<Map.Entry<K, V>>() {
                /* access modifiers changed from: protected */
                /* renamed from: b0 */
                public Set<Map.Entry<K, V>> mo34397R() {
                    return set;
                }

                public Iterator<Map.Entry<K, V>> iterator() {
                    return UnmodifiableEntry.m73707X(super.iterator());
                }

                public Object[] toArray() {
                    return mo35131X();
                }

                public <T> T[] toArray(T[] tArr) {
                    return mo35132Y(tArr);
                }
            };
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Map.Entry<K, V> mo22325Q() {
            return this.f53282a;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public Map<TypeToken<? extends B>, B> mo22325Q() {
        return this.f53281a;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: V */
    public B put(TypeToken<? extends B> typeToken, B b) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return UnmodifiableEntry.m73708Y(super.entrySet());
    }

    @DoNotCall
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
