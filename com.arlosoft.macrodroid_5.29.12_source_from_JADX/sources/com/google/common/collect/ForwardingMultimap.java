package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    protected ForwardingMultimap() {
    }

    /* renamed from: P */
    public boolean mo34625P(Object obj, Object obj2) {
        return mo22325Q().mo34625P(obj, obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Multimap<K, V> mo22325Q();

    public void clear() {
        mo22325Q().clear();
    }

    public boolean containsKey(Object obj) {
        return mo22325Q().containsKey(obj);
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public Collection<V> mo34426d(Object obj) {
        return mo22325Q().mo34426d(obj);
    }

    public boolean equals(Object obj) {
        return obj == this || mo22325Q().equals(obj);
    }

    public Collection<V> get(@ParametricNullness K k) {
        return mo22325Q().get(k);
    }

    public int hashCode() {
        return mo22325Q().hashCode();
    }

    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo34445i() {
        return mo22325Q().mo34445i();
    }

    public boolean isEmpty() {
        return mo22325Q().isEmpty();
    }

    /* renamed from: k */
    public Multiset<K> mo34630k() {
        return mo22325Q().mo34630k();
    }

    public Set<K> keySet() {
        return mo22325Q().keySet();
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return mo22325Q().put(k, v);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        return mo22325Q().remove(obj, obj2);
    }

    public int size() {
        return mo22325Q().size();
    }

    /* renamed from: w */
    public Map<K, Collection<V>> mo34430w() {
        return mo22325Q().mo34430w();
    }
}
