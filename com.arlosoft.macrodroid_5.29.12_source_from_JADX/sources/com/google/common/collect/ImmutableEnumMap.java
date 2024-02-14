package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    /* renamed from: g */
    private final transient EnumMap<K, V> f16646g;

    private static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumMap<K, V> delegate;

        EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new ImmutableEnumMap(this.delegate);
        }
    }

    public boolean containsKey(Object obj) {
        return this.f16646g.containsKey(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).f16646g;
        }
        return this.f16646g.equals(obj);
    }

    public V get(Object obj) {
        return this.f16646g.get(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34967j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public UnmodifiableIterator<K> mo35372k() {
        return Iterators.m27704K(this.f16646g.keySet().iterator());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public UnmodifiableIterator<Map.Entry<K, V>> mo34973q() {
        return Maps.m28078U(this.f16646g.entrySet().iterator());
    }

    public int size() {
        return this.f16646g.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new EnumSerializedForm(this.f16646g);
    }

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.f16646g = enumMap;
        Preconditions.m5377d(!enumMap.isEmpty());
    }
}
