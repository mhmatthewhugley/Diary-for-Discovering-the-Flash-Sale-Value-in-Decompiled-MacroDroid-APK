package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public <E> Collection<E> mo34422G(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
        return mo34435I(k, (List) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract List<V> mo34431y();

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public List<V> mo34421C() {
        return Collections.emptyList();
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
    public List<V> m26301d(Object obj) {
        return (List) super.mo34426d(obj);
    }

    public List<V> get(@ParametricNullness K k) {
        return (List) super.get(k);
    }
}
