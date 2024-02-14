package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface RowSortedTable<R, C, V> extends Table<R, C, V> {
    /* renamed from: j */
    SortedMap<R, Map<C, V>> mo34741j();
}
