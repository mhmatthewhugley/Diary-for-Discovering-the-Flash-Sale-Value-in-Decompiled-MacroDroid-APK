package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Arrays;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        /* renamed from: l */
        public ImmutableBiMap<K, V> mo35335a() {
            return mo35337d();
        }

        @DoNotCall
        @Deprecated
        /* renamed from: m */
        public ImmutableBiMap<K, V> mo35336c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        /* renamed from: n */
        public ImmutableBiMap<K, V> mo35337d() {
            int i = this.f16661c;
            if (i == 0) {
                return ImmutableBiMap.m27253t();
            }
            if (this.f16659a != null) {
                if (this.f16662d) {
                    this.f16660b = Arrays.copyOf(this.f16660b, i * 2);
                }
                ImmutableMap.Builder.m27366k(this.f16660b, this.f16661c, this.f16659a);
            }
            this.f16662d = true;
            return new RegularImmutableBiMap(this.f16660b, this.f16661c);
        }

        @CanIgnoreReturnValue
        /* renamed from: o */
        public Builder<K, V> mo35338g(K k, V v) {
            super.mo35338g(k, v);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: p */
        public Builder<K, V> mo35339h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo35339h(entry);
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: q */
        public Builder<K, V> mo35340i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo35340i(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: r */
        public Builder<K, V> mo35341j(Map<? extends K, ? extends V> map) {
            super.mo35341j(map);
            return this;
        }

        Builder(int i) {
            super(i);
        }
    }

    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Builder<K, V> mo35349b(int i) {
            return new Builder<>(i);
        }
    }

    ImmutableBiMap() {
    }

    /* renamed from: t */
    public static <K, V> ImmutableBiMap<K, V> m27253t() {
        return RegularImmutableBiMap.f17071A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final ImmutableSet<V> mo35329g() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: r */
    public abstract ImmutableBiMap<V, K> mo34390x0();

    /* renamed from: u */
    public ImmutableSet<V> values() {
        return mo34390x0().keySet();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
