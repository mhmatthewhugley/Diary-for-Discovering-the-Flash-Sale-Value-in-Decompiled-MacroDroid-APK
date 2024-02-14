package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {
    @LazyInit

    /* renamed from: a */
    private transient Set<Table.Cell<R, C, V>> f16448a;
    @LazyInit

    /* renamed from: c */
    private transient Collection<V> f16449c;

    class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        CellSet() {
        }

        public void clear() {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m28068K(AbstractTable.this.mo34741j(), cell.mo34747a());
            if (map == null || !Collections2.m26545g(map.entrySet(), Maps.m28105t(cell.mo34748b(), cell.getValue()))) {
                return false;
            }
            return true;
        }

        public Iterator<Table.Cell<R, C, V>> iterator() {
            return AbstractTable.this.mo34712a();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m28068K(AbstractTable.this.mo34741j(), cell.mo34747a());
            if (map == null || !Collections2.m26546h(map.entrySet(), Maps.m28105t(cell.mo34748b(), cell.getValue()))) {
                return false;
            }
            return true;
        }

        public int size() {
            return AbstractTable.this.size();
        }
    }

    class Values extends AbstractCollection<V> {
        Values() {
        }

        public void clear() {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj) {
            return AbstractTable.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return AbstractTable.this.mo34721g();
        }

        public int size() {
            return AbstractTable.this.size();
        }
    }

    AbstractTable() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Iterator<Table.Cell<R, C, V>> mo34712a();

    /* renamed from: b */
    public boolean mo34713b(Object obj, Object obj2) {
        Map map = (Map) Maps.m28068K(mo34741j(), obj);
        return map != null && Maps.m28067J(map, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<Table.Cell<R, C, V>> mo34714c() {
        return new CellSet();
    }

    public void clear() {
        Iterators.m27709e(mo34723m().iterator());
    }

    public boolean containsValue(Object obj) {
        for (Map containsValue : mo34741j().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Collection<V> mo34717d() {
        return new Values();
    }

    /* renamed from: e */
    public V mo34718e(Object obj, Object obj2) {
        Map map = (Map) Maps.m28068K(mo34741j(), obj);
        if (map == null) {
            return null;
        }
        return Maps.m28068K(map, obj2);
    }

    public boolean equals(Object obj) {
        return Tables.m28965b(this, obj);
    }

    /* renamed from: f */
    public boolean mo34720f() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<V> mo34721g() {
        return new TransformedIterator<Table.Cell<R, C, V>, V>(this, mo34723m().iterator()) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public V mo34726a(Table.Cell<R, C, V> cell) {
                return cell.getValue();
            }
        };
    }

    public int hashCode() {
        return mo34723m().hashCode();
    }

    /* renamed from: m */
    public Set<Table.Cell<R, C, V>> mo34723m() {
        Set<Table.Cell<R, C, V>> set = this.f16448a;
        if (set != null) {
            return set;
        }
        Set<Table.Cell<R, C, V>> c = mo34714c();
        this.f16448a = c;
        return c;
    }

    public String toString() {
        return mo34741j().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f16449c;
        if (collection != null) {
            return collection;
        }
        Collection<V> d = mo34717d();
        this.f16449c = d;
        return d;
    }
}
