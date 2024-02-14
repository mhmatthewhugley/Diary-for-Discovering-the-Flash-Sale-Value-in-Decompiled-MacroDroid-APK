package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FilteredKeySetMultimap<K, V> extends FilteredKeyMultimap<K, V> implements FilteredSetMultimap<K, V> {

    class EntrySet extends FilteredKeyMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        EntrySet(FilteredKeySetMultimap filteredKeySetMultimap) {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.m28719b(this, obj);
        }

        public int hashCode() {
            return Sets.m28723f(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Set<Map.Entry<K, V>> mo34437b() {
        return new EntrySet(this);
    }

    /* renamed from: p */
    public SetMultimap<K, V> mo35064t() {
        return (SetMultimap) this.f16589o;
    }

    /* renamed from: d */
    public Set<V> m27029d(Object obj) {
        return (Set) super.mo34426d(obj);
    }

    public Set<V> get(@ParametricNullness K k) {
        return (Set) super.get(k);
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> m27031i() {
        return (Set) super.mo34445i();
    }
}
