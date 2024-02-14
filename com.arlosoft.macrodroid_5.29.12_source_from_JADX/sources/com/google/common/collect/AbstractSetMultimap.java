package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public <E> Collection<E> mo34422G(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
        return new AbstractMapBasedMultimap.WrappedSet(k, (Set) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract Set<V> mo34431y();

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public Set<V> mo34421C() {
        return Collections.emptySet();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return super.put(k, v);
    }

    /* renamed from: w */
    public Map<K, Collection<V>> mo34430w() {
        return super.mo34430w();
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public Set<V> m26429d(Object obj) {
        return (Set) super.mo34426d(obj);
    }

    public Set<V> get(@ParametricNullness K k) {
        return (Set) super.get(k);
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> m26431i() {
        return (Set) super.mo34445i();
    }
}
