package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Set<Map.Entry<K, V>> mo34437b() {
        return Sets.m28721d(mo35064t().mo34445i(), mo35061n());
    }

    /* renamed from: v */
    public SetMultimap<K, V> mo35064t() {
        return (SetMultimap) this.f16577o;
    }

    /* renamed from: d */
    public Set<V> m26999d(Object obj) {
        return (Set) super.mo34426d(obj);
    }

    public Set<V> get(@ParametricNullness K k) {
        return (Set) super.get(k);
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> m27001i() {
        return (Set) super.mo34445i();
    }
}
