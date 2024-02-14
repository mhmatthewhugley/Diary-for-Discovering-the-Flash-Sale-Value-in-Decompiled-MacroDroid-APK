package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Tables {

    /* renamed from: a */
    private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> f17224a = new Function<Map<Object, Object>, Map<Object, Object>>() {
        /* renamed from: a */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        AbstractCell() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            if (!Objects.m5349a(mo34747a(), cell.mo34747a()) || !Objects.m5349a(mo34748b(), cell.mo34748b()) || !Objects.m5349a(getValue(), cell.getValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(mo34747a(), mo34748b(), getValue());
        }

        public String toString() {
            String valueOf = String.valueOf(mo34747a());
            String valueOf2 = String.valueOf(mo34748b());
            String valueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
            sb.append("(");
            sb.append(valueOf);
            sb.append(",");
            sb.append(valueOf2);
            sb.append(")=");
            sb.append(valueOf3);
            return sb.toString();
        }
    }

    static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        private final C columnKey;
        @ParametricNullness
        private final R rowKey;
        @ParametricNullness
        private final V value;

        ImmutableCell(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        @ParametricNullness
        /* renamed from: a */
        public R mo34747a() {
            return this.rowKey;
        }

        @ParametricNullness
        /* renamed from: b */
        public C mo34748b() {
            return this.columnKey;
        }

        @ParametricNullness
        public V getValue() {
            return this.value;
        }
    }

    private static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* renamed from: d */
        final Table<R, C, V1> f17225d;

        /* renamed from: f */
        final Function<? super V1, V2> f17226f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Table.Cell<R, C, V2>> mo34712a() {
            return Iterators.m27703J(this.f17225d.mo34723m().iterator(), mo36643h());
        }

        public void clear() {
            this.f17225d.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Collection<V2> mo34717d() {
            return Collections2.m26548j(this.f17225d.values(), this.f17226f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> mo36643h() {
            return new Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>>() {
                /* renamed from: a */
                public Table.Cell<R, C, V2> apply(Table.Cell<R, C, V1> cell) {
                    return Tables.m28966c(cell.mo34747a(), cell.mo34748b(), TransformedTable.this.f17226f.apply(cell.getValue()));
                }
            };
        }

        /* renamed from: j */
        public Map<R, Map<C, V2>> mo34741j() {
            return Maps.m28075R(this.f17225d.mo34741j(), new Function<Map<C, V1>, Map<C, V2>>() {
                /* renamed from: a */
                public Map<C, V2> apply(Map<C, V1> map) {
                    return Maps.m28075R(map, TransformedTable.this.f17226f);
                }
            });
        }

        /* renamed from: l */
        public Map<C, Map<R, V2>> mo34742l() {
            return Maps.m28075R(this.f17225d.mo34742l(), new Function<Map<R, V1>, Map<R, V2>>() {
                /* renamed from: a */
                public Map<R, V2> apply(Map<R, V1> map) {
                    return Maps.m28075R(map, TransformedTable.this.f17226f);
                }
            });
        }

        public int size() {
            return this.f17225d.size();
        }
    }

    private static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {

        /* renamed from: f */
        private static final Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> f17230f = new Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>>() {
            /* renamed from: a */
            public Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
                return Tables.m28966c(cell.mo34748b(), cell.mo34747a(), cell.getValue());
            }
        };

        /* renamed from: d */
        final Table<R, C, V> f17231d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Table.Cell<C, R, V>> mo34712a() {
            return Iterators.m27703J(this.f17231d.mo34723m().iterator(), f17230f);
        }

        public void clear() {
            this.f17231d.clear();
        }

        public boolean containsValue(Object obj) {
            return this.f17231d.containsValue(obj);
        }

        /* renamed from: j */
        public Map<C, Map<R, V>> mo34741j() {
            return this.f17231d.mo34742l();
        }

        /* renamed from: l */
        public Map<R, Map<C, V>> mo34742l() {
            return this.f17231d.mo34741j();
        }

        public int size() {
            return this.f17231d.size();
        }

        public Collection<V> values() {
            return this.f17231d.values();
        }
    }

    static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public RowSortedTable<R, C, V> mo35253R() {
            return (RowSortedTable) super.mo22325Q();
        }

        /* renamed from: j */
        public SortedMap<R, Map<C, V>> m28987j() {
            return Collections.unmodifiableSortedMap(Maps.m28076S(mo35253R().mo34741j(), Tables.m28967d()));
        }
    }

    private static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Table<? extends R, ? extends C, ? extends V> delegate;

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Table<R, C, V> mo22325Q() {
            return this.delegate;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public Map<R, Map<C, V>> mo34741j() {
            return Collections.unmodifiableMap(Maps.m28075R(super.mo34741j(), Tables.m28967d()));
        }

        /* renamed from: l */
        public Map<C, Map<R, V>> mo34742l() {
            return Collections.unmodifiableMap(Maps.m28075R(super.mo34742l(), Tables.m28967d()));
        }

        /* renamed from: m */
        public Set<Table.Cell<R, C, V>> mo34723m() {
            return Collections.unmodifiableSet(super.mo34723m());
        }

        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    private Tables() {
    }

    /* renamed from: b */
    static boolean m28965b(Table<?, ?, ?> table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.mo34723m().equals(((Table) obj).mo34723m());
        }
        return false;
    }

    /* renamed from: c */
    public static <R, C, V> Table.Cell<R, C, V> m28966c(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
        return new ImmutableCell(r, c, v);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <K, V> Function<Map<K, V>, Map<K, V>> m28967d() {
        return f17224a;
    }
}
