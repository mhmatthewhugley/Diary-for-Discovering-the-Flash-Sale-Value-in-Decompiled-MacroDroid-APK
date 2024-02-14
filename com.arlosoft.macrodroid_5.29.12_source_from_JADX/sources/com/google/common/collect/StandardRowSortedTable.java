package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    private class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        private RowSortedMap() {
            super();
        }

        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.m28815E().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public SortedSet<R> mo34484b() {
            return new Maps.SortedKeySet(this);
        }

        public R firstKey() {
            return StandardRowSortedTable.this.m28815E().firstKey();
        }

        /* renamed from: g */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap<R, Map<C, V>> headMap(R r) {
            Preconditions.m5392s(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.m28815E().headMap(r), StandardRowSortedTable.this.factory).mo34741j();
        }

        public R lastKey() {
            return StandardRowSortedTable.this.m28815E().lastKey();
        }

        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            Preconditions.m5392s(r);
            Preconditions.m5392s(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.m28815E().subMap(r, r2), StandardRowSortedTable.this.factory).mo34741j();
        }

        public SortedMap<R, Map<C, V>> tailMap(R r) {
            Preconditions.m5392s(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.m28815E().tailMap(r), StandardRowSortedTable.this.factory).mo34741j();
        }
    }

    StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public SortedMap<R, Map<C, V>> m28815E() {
        return (SortedMap) this.backingMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public SortedMap<R, Map<C, V>> mo36440v() {
        return new RowSortedMap();
    }

    /* renamed from: j */
    public SortedMap<R, Map<C, V>> m28818j() {
        return (SortedMap) super.mo34741j();
    }
}
