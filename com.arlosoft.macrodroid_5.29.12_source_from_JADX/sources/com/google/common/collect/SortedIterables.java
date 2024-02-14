package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedIterables {
    private SortedIterables() {
    }

    /* renamed from: a */
    public static <E> Comparator<? super E> m28778a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.m28521e() : comparator;
    }

    /* renamed from: b */
    public static boolean m28779b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        Preconditions.m5392s(comparator);
        Preconditions.m5392s(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m28778a((SortedSet) iterable);
        } else if (!(iterable instanceof SortedIterable)) {
            return false;
        } else {
            comparator2 = ((SortedIterable) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
