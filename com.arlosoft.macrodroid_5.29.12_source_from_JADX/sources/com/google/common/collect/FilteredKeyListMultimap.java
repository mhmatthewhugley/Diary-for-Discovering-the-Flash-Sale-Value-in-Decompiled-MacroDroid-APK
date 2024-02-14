package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FilteredKeyListMultimap<K, V> extends FilteredKeyMultimap<K, V> implements ListMultimap<K, V> {
    /* renamed from: m */
    public ListMultimap<K, V> mo35064t() {
        return (ListMultimap) super.mo35064t();
    }

    /* renamed from: d */
    public List<V> m27006d(Object obj) {
        return (List) super.mo34426d(obj);
    }

    public List<V> get(@ParametricNullness K k) {
        return (List) super.get(k);
    }
}
