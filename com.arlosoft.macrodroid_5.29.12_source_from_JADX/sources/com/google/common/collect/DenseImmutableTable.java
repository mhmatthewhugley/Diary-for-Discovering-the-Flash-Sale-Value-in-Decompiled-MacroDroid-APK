package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Immutable
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    /* access modifiers changed from: private */
    public final int[] columnCounts;
    /* access modifiers changed from: private */
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    /* access modifiers changed from: private */
    public final int[] rowCounts;
    /* access modifiers changed from: private */
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    /* access modifiers changed from: private */
    public final V[][] values;

    private final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;

        Column(int i) {
            super(DenseImmutableTable.this.columnCounts[i]);
            this.columnIndex = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34967j() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public V mo34968t(int i) {
            return DenseImmutableTable.this.values[i][this.columnIndex];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public ImmutableMap<R, Integer> mo34969v() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    private final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34967j() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public ImmutableMap<C, Integer> mo34969v() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public ImmutableMap<R, V> mo34968t(int i) {
            return new Column(i);
        }

        private ColumnMap() {
            super(DenseImmutableTable.this.columnCounts.length);
        }
    }

    private static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        ImmutableArrayMap(int i) {
            this.size = i;
        }

        /* renamed from: u */
        private boolean m26831u() {
            return this.size == mo34969v().size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public ImmutableSet<K> mo34971f() {
            return m26831u() ? mo34969v().keySet() : super.mo34971f();
        }

        public V get(Object obj) {
            Integer num = (Integer) mo34969v().get(obj);
            if (num == null) {
                return null;
            }
            return mo34968t(num.intValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public UnmodifiableIterator<Map.Entry<K, V>> mo34973q() {
            return new AbstractIterator<Map.Entry<K, V>>() {

                /* renamed from: d */
                private int f16547d = -1;

                /* renamed from: f */
                private final int f16548f;

                {
                    this.f16548f = ImmutableArrayMap.this.mo34969v().size();
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<K, V> mo34417a() {
                    int i = this.f16547d;
                    while (true) {
                        this.f16547d = i + 1;
                        int i2 = this.f16547d;
                        if (i2 >= this.f16548f) {
                            return (Map.Entry) mo34418b();
                        }
                        Object t = ImmutableArrayMap.this.mo34968t(i2);
                        if (t != null) {
                            return Maps.m28105t(ImmutableArrayMap.this.mo34974r(this.f16547d), t);
                        }
                        i = this.f16547d;
                    }
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public K mo34974r(int i) {
            return mo34969v().keySet().mo35029c().get(i);
        }

        public int size() {
            return this.size;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public abstract V mo34968t(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public abstract ImmutableMap<K, Integer> mo34969v();
    }

    private final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;

        Row(int i) {
            super(DenseImmutableTable.this.rowCounts[i]);
            this.rowIndex = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34967j() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public V mo34968t(int i) {
            return DenseImmutableTable.this.values[this.rowIndex][i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public ImmutableMap<C, Integer> mo34969v() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    private final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34967j() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public ImmutableMap<R, Integer> mo34969v() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public ImmutableMap<C, V> mo34968t(int i) {
            return new Row(i);
        }

        private RowMap() {
            super(DenseImmutableTable.this.rowCounts.length);
        }
    }

    DenseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        int size = immutableSet.size();
        int[] iArr = new int[2];
        iArr[1] = immutableSet2.size();
        iArr[0] = size;
        this.values = (Object[][]) Array.newInstance(Object.class, iArr);
        ImmutableMap<R, Integer> u = Maps.m28106u(immutableSet);
        this.rowKeyToIndex = u;
        ImmutableMap<C, Integer> u2 = Maps.m28106u(immutableSet2);
        this.columnKeyToIndex = u2;
        this.rowCounts = new int[u.size()];
        this.columnCounts = new int[u2.size()];
        int[] iArr2 = new int[immutableList.size()];
        int[] iArr3 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell cell = immutableList.get(i);
            Object a = cell.mo34747a();
            Object b = cell.mo34748b();
            Integer num = this.rowKeyToIndex.get(a);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Integer num2 = this.columnKeyToIndex.get(b);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            mo36324z(a, b, this.values[intValue][intValue2], cell.getValue());
            this.values[intValue][intValue2] = cell.getValue();
            int[] iArr4 = this.rowCounts;
            iArr4[intValue] = iArr4[intValue] + 1;
            int[] iArr5 = this.columnCounts;
            iArr5[intValue2] = iArr5[intValue2] + 1;
            iArr2[i] = intValue;
            iArr3[i] = intValue2;
        }
        this.cellRowIndices = iArr2;
        this.cellColumnIndices = iArr3;
        this.rowMap = new RowMap();
        this.columnMap = new ColumnMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Table.Cell<R, C, V> mo34962B(int i) {
        int i2 = this.cellRowIndices[i];
        int i3 = this.cellColumnIndices[i];
        Object obj = mo35594w().mo35029c().get(i2);
        Object obj2 = mo35591n().mo35029c().get(i3);
        V v = this.values[i2][i3];
        Objects.requireNonNull(v);
        return ImmutableTable.m27645i(obj, obj2, v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public V mo34963C(int i) {
        V v = this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]];
        Objects.requireNonNull(v);
        return v;
    }

    /* renamed from: e */
    public V mo34718e(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    /* renamed from: p */
    public ImmutableMap<C, Map<R, V>> mo34742l() {
        return ImmutableMap.m27351d(this.columnMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public ImmutableTable.SerializedForm mo34965r() {
        return ImmutableTable.SerializedForm.m27667a(this, this.cellRowIndices, this.cellColumnIndices);
    }

    public int size() {
        return this.cellRowIndices.length;
    }

    /* renamed from: x */
    public ImmutableMap<R, Map<C, V>> mo34741j() {
        return ImmutableMap.m27351d(this.rowMap);
    }
}
