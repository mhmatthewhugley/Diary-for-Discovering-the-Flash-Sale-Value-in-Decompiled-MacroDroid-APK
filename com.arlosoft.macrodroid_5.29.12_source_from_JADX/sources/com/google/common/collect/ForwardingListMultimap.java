package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    protected ForwardingListMultimap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract ListMultimap<K, V> mo35176R();

    @CanIgnoreReturnValue
    /* renamed from: d */
    public List<V> m27081d(Object obj) {
        return mo35176R().mo34426d(obj);
    }

    public List<V> get(@ParametricNullness K k) {
        return mo35176R().get(k);
    }
}
