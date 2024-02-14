package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    @Beta
    protected abstract class StandardEntrySet extends Maps.EntrySet<K, V> {

        /* renamed from: a */
        final /* synthetic */ ForwardingMap f16600a;

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Map<K, V> mo34465i() {
            return this.f16600a;
        }
    }

    @Beta
    protected class StandardKeySet extends Maps.KeySet<K, V> {
    }

    @Beta
    protected class StandardValues extends Maps.Values<K, V> {
    }

    protected ForwardingMap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Map<K, V> mo22325Q();

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public String mo35178T() {
        return Maps.m28070M(this);
    }

    public void clear() {
        mo22325Q().clear();
    }

    public boolean containsKey(Object obj) {
        return mo22325Q().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo22325Q().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo22325Q().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || mo22325Q().equals(obj);
    }

    public V get(Object obj) {
        return mo22325Q().get(obj);
    }

    public int hashCode() {
        return mo22325Q().hashCode();
    }

    public boolean isEmpty() {
        return mo22325Q().isEmpty();
    }

    public Set<K> keySet() {
        return mo22325Q().keySet();
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return mo22325Q().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo22325Q().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return mo22325Q().remove(obj);
    }

    public int size() {
        return mo22325Q().size();
    }

    public Collection<V> values() {
        return mo22325Q().values();
    }
}
