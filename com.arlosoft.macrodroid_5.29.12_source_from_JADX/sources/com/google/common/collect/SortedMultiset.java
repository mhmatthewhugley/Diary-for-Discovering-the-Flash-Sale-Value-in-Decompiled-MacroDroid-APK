package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    /* renamed from: C */
    NavigableSet<E> mo34642C();

    /* renamed from: E1 */
    SortedMultiset<E> mo34979E1(@ParametricNullness E e, BoundType boundType);

    /* renamed from: T1 */
    SortedMultiset<E> mo34981T1(@ParametricNullness E e, BoundType boundType);

    /* renamed from: Z0 */
    SortedMultiset<E> mo34696Z0(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2);

    Comparator<? super E> comparator();

    Set<Multiset.Entry<E>> entrySet();

    Multiset.Entry<E> firstEntry();

    Multiset.Entry<E> lastEntry();

    Multiset.Entry<E> pollFirstEntry();

    Multiset.Entry<E> pollLastEntry();

    /* renamed from: t1 */
    SortedMultiset<E> mo34706t1();
}
