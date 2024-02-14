package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Table;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    private final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        private CellSet() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public Table.Cell<R, C, V> get(int i) {
            return RegularImmutableTable.this.mo34962B(i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Object e = RegularImmutableTable.this.mo34718e(cell.mo34747a(), cell.mo34748b());
            if (e == null || !e.equals(cell.getValue())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return false;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    private final class Values extends ImmutableList<V> {
        private Values() {
        }

        public V get(int i) {
            return RegularImmutableTable.this.mo34963C(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    RegularImmutableTable() {
    }

    /* renamed from: A */
    static <R, C, V> RegularImmutableTable<R, C, V> m28682A(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        if (((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2) {
            return new DenseImmutableTable(immutableList, immutableSet, immutableSet2);
        }
        return new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public abstract Table.Cell<R, C, V> mo34962B(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public abstract V mo34963C(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final ImmutableSet<Table.Cell<R, C, V>> mo34714c() {
        return mo34720f() ? ImmutableSet.m27506F() : new CellSet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ImmutableCollection<V> mo34717d() {
        return mo34720f() ? ImmutableList.m27301D() : new Values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo36324z(R r, C c, V v, V v2) {
        Preconditions.m5389p(v == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v);
    }
}
