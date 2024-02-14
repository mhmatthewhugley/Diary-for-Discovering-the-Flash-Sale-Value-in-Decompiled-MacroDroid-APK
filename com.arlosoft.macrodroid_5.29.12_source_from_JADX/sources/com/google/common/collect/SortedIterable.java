package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
interface SortedIterable<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
