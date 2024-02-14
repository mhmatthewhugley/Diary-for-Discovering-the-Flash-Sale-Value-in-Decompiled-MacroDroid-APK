package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    /* renamed from: n */
    Predicate<? super Map.Entry<K, V>> mo35061n();

    /* renamed from: t */
    Multimap<K, V> mo35064t();
}
