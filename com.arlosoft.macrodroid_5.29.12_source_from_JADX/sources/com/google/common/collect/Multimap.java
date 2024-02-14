package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Multimap<K, V> {
    /* renamed from: P */
    boolean mo34625P(@CompatibleWith Object obj, @CompatibleWith Object obj2);

    void clear();

    boolean containsKey(@CompatibleWith Object obj);

    boolean containsValue(@CompatibleWith Object obj);

    @CanIgnoreReturnValue
    /* renamed from: d */
    Collection<V> mo34426d(@CompatibleWith Object obj);

    boolean equals(Object obj);

    Collection<V> get(@ParametricNullness K k);

    int hashCode();

    /* renamed from: i */
    Collection<Map.Entry<K, V>> mo34445i();

    boolean isEmpty();

    /* renamed from: k */
    Multiset<K> mo34630k();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean put(@ParametricNullness K k, @ParametricNullness V v);

    @CanIgnoreReturnValue
    boolean remove(@CompatibleWith Object obj, @CompatibleWith Object obj2);

    int size();

    /* renamed from: w */
    Map<K, Collection<V>> mo34430w();
}
