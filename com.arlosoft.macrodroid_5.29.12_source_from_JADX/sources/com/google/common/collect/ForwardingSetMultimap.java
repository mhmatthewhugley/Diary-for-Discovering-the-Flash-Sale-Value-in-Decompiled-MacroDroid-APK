package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract SetMultimap<K, V> mo35176R();

    @CanIgnoreReturnValue
    /* renamed from: d */
    public Set<V> m27133d(Object obj) {
        return mo35176R().mo34426d(obj);
    }

    public Set<V> get(@ParametricNullness K k) {
        return mo35176R().get(k);
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> m27135i() {
        return mo35176R().mo34445i();
    }
}
