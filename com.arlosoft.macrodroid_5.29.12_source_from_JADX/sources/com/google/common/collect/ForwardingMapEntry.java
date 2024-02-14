package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Map.Entry<K, V> mo22325Q();

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public boolean mo35185T(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.m5349a(getKey(), entry.getKey()) || !Objects.m5349a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        return mo22325Q().equals(obj);
    }

    @ParametricNullness
    public K getKey() {
        return mo22325Q().getKey();
    }

    @ParametricNullness
    public V getValue() {
        return mo22325Q().getValue();
    }

    public int hashCode() {
        return mo22325Q().hashCode();
    }

    @ParametricNullness
    public V setValue(@ParametricNullness V v) {
        return mo22325Q().setValue(v);
    }
}
