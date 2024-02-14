package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    /* access modifiers changed from: private */
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    /* access modifiers changed from: private */
    public final ImmutableList<C> columnList;

    /* renamed from: d */
    private transient ArrayTable<R, C, V>.ColumnMap f16454d;

    /* renamed from: f */
    private transient ArrayTable<R, C, V>.RowMap f16455f;
    /* access modifiers changed from: private */
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    /* access modifiers changed from: private */
    public final ImmutableList<R> rowList;

    private static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* renamed from: a */
        private final ImmutableMap<K, Integer> f16462a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo34750a() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map.Entry<K, V> mo34410a(int i) {
                    return ArrayMap.this.mo34751b(i);
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry<K, V> mo34751b(final int i) {
            Preconditions.m5390q(i, size());
            return new AbstractMapEntry<K, V>() {
                public K getKey() {
                    return ArrayMap.this.mo34752c(i);
                }

                @ParametricNullness
                public V getValue() {
                    return ArrayMap.this.mo34756e(i);
                }

                @ParametricNullness
                public V setValue(@ParametricNullness V v) {
                    return ArrayMap.this.mo34757f(i, v);
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public K mo34752c(int i) {
            return this.f16462a.keySet().mo35029c().get(i);
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(Object obj) {
            return this.f16462a.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract String mo34755d();

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: e */
        public abstract V mo34756e(int i);

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: f */
        public abstract V mo34757f(int i, @ParametricNullness V v);

        public V get(Object obj) {
            Integer num = this.f16462a.get(obj);
            if (num == null) {
                return null;
            }
            return mo34756e(num.intValue());
        }

        public boolean isEmpty() {
            return this.f16462a.isEmpty();
        }

        public Set<K> keySet() {
            return this.f16462a.keySet();
        }

        public V put(K k, @ParametricNullness V v) {
            Integer num = this.f16462a.get(k);
            if (num != null) {
                return mo34757f(num.intValue(), v);
            }
            String d = mo34755d();
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(this.f16462a.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 9 + valueOf.length() + valueOf2.length());
            sb.append(d);
            sb.append(" ");
            sb.append(valueOf);
            sb.append(" not in ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f16462a.size();
        }

        private ArrayMap(ImmutableMap<K, Integer> immutableMap) {
            this.f16462a = immutableMap;
        }
    }

    private class Column extends ArrayMap<R, V> {

        /* renamed from: c */
        final int f16466c;

        Column(int i) {
            super(ArrayTable.this.rowKeyToIndex);
            this.f16466c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo34755d() {
            return "Row";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public V mo34756e(int i) {
            return ArrayTable.this.mo34743r(i, this.f16466c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public V mo34757f(int i, V v) {
            return ArrayTable.this.mo34745v(i, this.f16466c, v);
        }
    }

    private class ColumnMap extends ArrayMap<C, Map<R, V>> {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo34755d() {
            return "Column";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Map<R, V> mo34756e(int i) {
            return new Column(i);
        }

        /* renamed from: h */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Map<R, V> mo34757f(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        private ColumnMap() {
            super(ArrayTable.this.columnKeyToIndex);
        }
    }

    private class Row extends ArrayMap<C, V> {

        /* renamed from: c */
        final int f16469c;

        Row(int i) {
            super(ArrayTable.this.columnKeyToIndex);
            this.f16469c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo34755d() {
            return "Column";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public V mo34756e(int i) {
            return ArrayTable.this.mo34743r(this.f16469c, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public V mo34757f(int i, V v) {
            return ArrayTable.this.mo34745v(this.f16469c, i, v);
        }
    }

    private class RowMap extends ArrayMap<R, Map<C, V>> {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo34755d() {
            return "Row";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Map<C, V> mo34756e(int i) {
            return new Row(i);
        }

        /* renamed from: h */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Map<C, V> mo34757f(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        private RowMap() {
            super(ArrayTable.this.rowKeyToIndex);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public Table.Cell<R, C, V> m26486t(int i) {
        return new Tables.AbstractCell<R, C, V>(i) {

            /* renamed from: a */
            final int f16457a;

            /* renamed from: c */
            final int f16458c;

            /* renamed from: d */
            final /* synthetic */ int f16459d;

            {
                this.f16459d = r3;
                this.f16457a = r3 / ArrayTable.this.columnList.size();
                this.f16458c = r3 % ArrayTable.this.columnList.size();
            }

            /* renamed from: a */
            public R mo34747a() {
                return ArrayTable.this.rowList.get(this.f16457a);
            }

            /* renamed from: b */
            public C mo34748b() {
                return ArrayTable.this.columnList.get(this.f16458c);
            }

            public V getValue() {
                return ArrayTable.this.mo34743r(this.f16457a, this.f16458c);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public V m26487u(int i) {
        return mo34743r(i / this.columnList.size(), i % this.columnList.size());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Iterator<Table.Cell<R, C, V>> mo34712a() {
        return new AbstractIndexedListIterator<Table.Cell<R, C, V>>(size()) {
            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Table.Cell<R, C, V> mo34410a(int i) {
                return ArrayTable.this.m26486t(i);
            }
        };
    }

    @DoNotCall
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V a : r0[r3]) {
                if (Objects.m5349a(obj, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<V> mo34721g() {
        return new AbstractIndexedListIterator<V>(size()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public V mo34410a(int i) {
                return ArrayTable.this.m26487u(i);
            }
        };
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: j */
    public Map<R, Map<C, V>> mo34741j() {
        ArrayTable<R, C, V>.RowMap rowMap = this.f16455f;
        if (rowMap != null) {
            return rowMap;
        }
        ArrayTable<R, C, V>.RowMap rowMap2 = new RowMap();
        this.f16455f = rowMap2;
        return rowMap2;
    }

    /* renamed from: l */
    public Map<C, Map<R, V>> mo34742l() {
        ArrayTable<R, C, V>.ColumnMap columnMap = this.f16454d;
        if (columnMap != null) {
            return columnMap;
        }
        ArrayTable<R, C, V>.ColumnMap columnMap2 = new ColumnMap();
        this.f16454d = columnMap2;
        return columnMap2;
    }

    /* renamed from: m */
    public Set<Table.Cell<R, C, V>> mo34723m() {
        return super.mo34723m();
    }

    /* renamed from: r */
    public V mo34743r(int i, int i2) {
        Preconditions.m5390q(i, this.rowList.size());
        Preconditions.m5390q(i2, this.columnList.size());
        return this.array[i][i2];
    }

    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @CanIgnoreReturnValue
    /* renamed from: v */
    public V mo34745v(int i, int i2, V v) {
        Preconditions.m5390q(i, this.rowList.size());
        Preconditions.m5390q(i2, this.columnList.size());
        V[][] vArr = this.array;
        V v2 = vArr[i][i2];
        vArr[i][i2] = v;
        return v2;
    }

    public Collection<V> values() {
        return super.values();
    }
}
