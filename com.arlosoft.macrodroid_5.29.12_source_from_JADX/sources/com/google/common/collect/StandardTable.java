package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @GwtTransient
    final Map<R, Map<C, V>> backingMap;

    /* renamed from: d */
    private transient Set<C> f17165d;

    /* renamed from: f */
    private transient Map<R, Map<C, V>> f17166f;
    @GwtTransient
    final Supplier<? extends Map<C, V>> factory;

    /* renamed from: g */
    private transient StandardTable<R, C, V>.ColumnMap f17167g;

    private class CellIterator implements Iterator<Table.Cell<R, C, V>> {

        /* renamed from: a */
        final Iterator<Map.Entry<R, Map<C, V>>> f17168a;

        /* renamed from: c */
        Map.Entry<R, Map<C, V>> f17169c;

        /* renamed from: d */
        Iterator<Map.Entry<C, V>> f17170d;

        private CellIterator() {
            this.f17168a = StandardTable.this.backingMap.entrySet().iterator();
            this.f17170d = Iterators.m27719o();
        }

        /* renamed from: a */
        public Table.Cell<R, C, V> next() {
            if (!this.f17170d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f17168a.next();
                this.f17169c = next;
                this.f17170d = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f17169c);
            Map.Entry next2 = this.f17170d.next();
            return Tables.m28966c(this.f17169c.getKey(), next2.getKey(), next2.getValue());
        }

        public boolean hasNext() {
            return this.f17168a.hasNext() || this.f17170d.hasNext();
        }

        public void remove() {
            this.f17170d.remove();
            Map.Entry<R, Map<C, V>> entry = this.f17169c;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f17168a.remove();
                this.f17169c = null;
            }
        }
    }

    private class Column extends Maps.ViewCachingAbstractMap<R, V> {

        /* renamed from: f */
        final C f17172f;

        private class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            private EntrySet() {
            }

            public void clear() {
                Column.this.mo36455d(Predicates.m5401b());
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.m28827r(entry.getKey(), Column.this.f17172f, entry.getValue());
            }

            public boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.mo35271q(column.f17172f);
            }

            public Iterator<Map.Entry<R, V>> iterator() {
                return new EntrySetIterator();
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.m28823A(entry.getKey(), Column.this.f17172f, entry.getValue());
            }

            public boolean retainAll(Collection<?> collection) {
                return Column.this.mo36455d(Predicates.m5409j(Predicates.m5406g(collection)));
            }

            public int size() {
                int i = 0;
                for (Map<C, V> containsKey : StandardTable.this.backingMap.values()) {
                    if (containsKey.containsKey(Column.this.f17172f)) {
                        i++;
                    }
                }
                return i;
            }
        }

        private class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* renamed from: d */
            final Iterator<Map.Entry<R, Map<C, V>>> f17175d;

            private EntrySetIterator() {
                this.f17175d = StandardTable.this.backingMap.entrySet().iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Map.Entry<R, V> mo34417a() {
                while (this.f17175d.hasNext()) {
                    final Map.Entry next = this.f17175d.next();
                    if (((Map) next.getValue()).containsKey(Column.this.f17172f)) {
                        return new AbstractMapEntry<R, V>() {
                            public R getKey() {
                                return next.getKey();
                            }

                            public V getValue() {
                                return ((Map) next.getValue()).get(Column.this.f17172f);
                            }

                            public V setValue(V v) {
                                return NullnessCasts.m28457a(((Map) next.getValue()).put(Column.this.f17172f, Preconditions.m5392s(v)));
                            }
                        };
                    }
                }
                return (Map.Entry) mo34418b();
            }
        }

        private class KeySet extends Maps.KeySet<R, V> {
            KeySet() {
                super(Column.this);
            }

            public boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.mo34713b(obj, column.f17172f);
            }

            public boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.mo35274y(obj, column.f17172f) != null;
            }

            public boolean retainAll(Collection<?> collection) {
                return Column.this.mo36455d(Maps.m28110y(Predicates.m5409j(Predicates.m5406g(collection))));
            }
        }

        private class Values extends Maps.Values<R, V> {
            Values() {
                super(Column.this);
            }

            public boolean remove(Object obj) {
                return obj != null && Column.this.mo36455d(Maps.m28087b0(Predicates.m5405f(obj)));
            }

            public boolean removeAll(Collection<?> collection) {
                return Column.this.mo36455d(Maps.m28087b0(Predicates.m5406g(collection)));
            }

            public boolean retainAll(Collection<?> collection) {
                return Column.this.mo36455d(Maps.m28087b0(Predicates.m5409j(Predicates.m5406g(collection))));
            }
        }

        Column(C c) {
            this.f17172f = Preconditions.m5392s(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Set<Map.Entry<R, V>> mo34451a() {
            return new EntrySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Set<R> mo34484b() {
            return new KeySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo35065c() {
            return new Values();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.mo34713b(obj, this.f17172f);
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        /* renamed from: d */
        public boolean mo36455d(Predicate<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Map map = (Map) next.getValue();
                Object obj = map.get(this.f17172f);
                if (obj != null && predicate.apply(Maps.m28105t(next.getKey(), obj))) {
                    map.remove(this.f17172f);
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public V get(Object obj) {
            return StandardTable.this.mo34718e(obj, this.f17172f);
        }

        public V put(R r, V v) {
            return StandardTable.this.mo35273x(r, this.f17172f, v);
        }

        public V remove(Object obj) {
            return StandardTable.this.mo35274y(obj, this.f17172f);
        }
    }

    private class ColumnKeyIterator extends AbstractIterator<C> {

        /* renamed from: d */
        final Map<C, V> f17181d;

        /* renamed from: f */
        final Iterator<Map<C, V>> f17182f;

        /* renamed from: g */
        Iterator<Map.Entry<C, V>> f17183g;

        private ColumnKeyIterator() {
            this.f17181d = (Map) StandardTable.this.factory.get();
            this.f17182f = StandardTable.this.backingMap.values().iterator();
            this.f17183g = Iterators.m27717m();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C mo34417a() {
            while (true) {
                if (this.f17183g.hasNext()) {
                    Map.Entry next = this.f17183g.next();
                    if (!this.f17181d.containsKey(next.getKey())) {
                        this.f17181d.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (!this.f17182f.hasNext()) {
                    return mo34418b();
                } else {
                    this.f17183g = this.f17182f.next().entrySet().iterator();
                }
            }
        }
    }

    private class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        private ColumnKeySet() {
            super();
        }

        public boolean contains(Object obj) {
            return StandardTable.this.mo35271q(obj);
        }

        public Iterator<C> iterator() {
            return StandardTable.this.mo36449u();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().remove(obj)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean removeAll(Collection<?> collection) {
            Preconditions.m5392s(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (Iterators.m27697D(next.keySet().iterator(), collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.m5392s(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public int size() {
            return Iterators.m27701H(iterator());
        }
    }

    private class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            ColumnMapEntrySet() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.mo35271q(entry.getKey())) {
                    return false;
                }
                Map d = ColumnMap.this.get(entry.getKey());
                Objects.requireNonNull(d);
                return d.equals(entry.getValue());
            }

            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.m28096k(StandardTable.this.mo35270p(), new Function<C, Map<R, V>>() {
                    /* renamed from: a */
                    public Map<R, V> apply(C c) {
                        return StandardTable.this.mo35269n(c);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                Map unused = StandardTable.this.m28829z(((Map.Entry) obj).getKey());
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.m5392s(collection);
                return Sets.m28731n(this, collection.iterator());
            }

            public boolean retainAll(Collection<?> collection) {
                Preconditions.m5392s(collection);
                Iterator it = Lists.m27834j(StandardTable.this.mo35270p().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(Maps.m28105t(next, StandardTable.this.mo35269n(next)))) {
                        Map unused = StandardTable.this.m28829z(next);
                        z = true;
                    }
                }
                return z;
            }

            public int size() {
                return StandardTable.this.mo35270p().size();
            }
        }

        private class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            ColumnMapValues() {
                super(ColumnMap.this);
            }

            public boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        Map unused = StandardTable.this.m28829z(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.m5392s(collection);
                Iterator it = Lists.m27834j(StandardTable.this.mo35270p().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(StandardTable.this.mo35269n(next))) {
                        Map unused = StandardTable.this.m28829z(next);
                        z = true;
                    }
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                Preconditions.m5392s(collection);
                Iterator it = Lists.m27834j(StandardTable.this.mo35270p().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(StandardTable.this.mo35269n(next))) {
                        Map unused = StandardTable.this.m28829z(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        private ColumnMap() {
        }

        /* renamed from: a */
        public Set<Map.Entry<C, Map<R, V>>> mo34451a() {
            return new ColumnMapEntrySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<Map<R, V>> mo35065c() {
            return new ColumnMapValues();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.mo35271q(obj);
        }

        /* renamed from: d */
        public Map<R, V> get(Object obj) {
            if (!StandardTable.this.mo35271q(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.mo35269n(obj);
        }

        /* renamed from: e */
        public Map<R, V> remove(Object obj) {
            if (StandardTable.this.mo35271q(obj)) {
                return StandardTable.this.m28829z(obj);
            }
            return null;
        }

        public Set<C> keySet() {
            return StandardTable.this.mo35270p();
        }
    }

    class Row extends Maps.IteratorBasedAbstractMap<C, V> {

        /* renamed from: a */
        final R f17190a;

        /* renamed from: c */
        Map<C, V> f17191c;

        Row(R r) {
            this.f17190a = Preconditions.m5392s(r);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<C, V>> mo34750a() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map == null) {
                return Iterators.m27719o();
            }
            final Iterator<Map.Entry<C, V>> it = map.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>() {
                /* renamed from: a */
                public Map.Entry<C, V> next() {
                    return Row.this.mo36484e((Map.Entry) it.next());
                }

                public boolean hasNext() {
                    return it.hasNext();
                }

                public void remove() {
                    it.remove();
                    Row.this.mo36481c();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map<C, V> mo36480b() {
            return StandardTable.this.backingMap.get(this.f17190a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36481c() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map != null && map.isEmpty()) {
                StandardTable.this.backingMap.remove(this.f17190a);
                this.f17191c = null;
            }
        }

        public void clear() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map != null) {
                map.clear();
            }
            mo36481c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r1.f17191c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean containsKey(java.lang.Object r2) {
            /*
                r1 = this;
                r1.mo36483d()
                if (r2 == 0) goto L_0x0011
                java.util.Map<C, V> r0 = r1.f17191c
                if (r0 == 0) goto L_0x0011
                boolean r2 = com.google.common.collect.Maps.m28067J(r0, r2)
                if (r2 == 0) goto L_0x0011
                r2 = 1
                goto L_0x0012
            L_0x0011:
                r2 = 0
            L_0x0012:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.StandardTable.Row.containsKey(java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo36483d() {
            Map<C, V> map = this.f17191c;
            if (map == null || (map.isEmpty() && StandardTable.this.backingMap.containsKey(this.f17190a))) {
                this.f17191c = mo36480b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map.Entry<C, V> mo36484e(final Map.Entry<C, V> entry) {
            return new ForwardingMapEntry<C, V>(this) {
                /* access modifiers changed from: protected */
                /* renamed from: R */
                public Map.Entry<C, V> mo22325Q() {
                    return entry;
                }

                public boolean equals(Object obj) {
                    return mo35185T(obj);
                }

                public V setValue(V v) {
                    return super.setValue(Preconditions.m5392s(v));
                }
            };
        }

        public V get(Object obj) {
            Map<C, V> map;
            mo36483d();
            if (obj == null || (map = this.f17191c) == null) {
                return null;
            }
            return Maps.m28068K(map, obj);
        }

        public V put(C c, V v) {
            Preconditions.m5392s(c);
            Preconditions.m5392s(v);
            Map<C, V> map = this.f17191c;
            if (map == null || map.isEmpty()) {
                return StandardTable.this.mo35273x(this.f17190a, c, v);
            }
            return this.f17191c.put(c, v);
        }

        public V remove(Object obj) {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map == null) {
                return null;
            }
            V L = Maps.m28069L(map, obj);
            mo36481c();
            return L;
        }

        public int size() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            EntrySet() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !Collections2.m26545g(StandardTable.this.backingMap.entrySet(), entry)) {
                    return false;
                }
                return true;
            }

            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.m28096k(StandardTable.this.backingMap.keySet(), new Function<R, Map<C, V>>() {
                    /* renamed from: a */
                    public Map<C, V> apply(R r) {
                        return StandardTable.this.mo35268B(r);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !StandardTable.this.backingMap.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }

            public int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        RowMap() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<R, Map<C, V>>> mo34451a() {
            return new EntrySet();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.mo35272t(obj);
        }

        /* renamed from: d */
        public Map<C, V> get(Object obj) {
            if (!StandardTable.this.mo35272t(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.mo35268B(obj);
        }

        /* renamed from: e */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }
    }

    private abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        private TableSet() {
        }

        public void clear() {
            StandardTable.this.backingMap.clear();
        }

        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.backingMap = map;
        this.factory = supplier;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public boolean m28823A(Object obj, Object obj2, Object obj3) {
        if (!m28827r(obj, obj2, obj3)) {
            return false;
        }
        mo35274y(obj, obj2);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m28827r(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(mo34718e(obj, obj2));
    }

    /* renamed from: w */
    private Map<C, V> m28828w(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.factory.get();
        this.backingMap.put(r, map2);
        return map2;
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* renamed from: z */
    public Map<R, V> m28829z(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object remove = ((Map) next.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (((Map) next.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: B */
    public Map<C, V> mo35268B(R r) {
        return new Row(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Iterator<Table.Cell<R, C, V>> mo34712a() {
        return new CellIterator();
    }

    /* renamed from: b */
    public boolean mo34713b(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.mo34713b(obj, obj2)) ? false : true;
    }

    public void clear() {
        this.backingMap.clear();
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    /* renamed from: e */
    public V mo34718e(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.mo34718e(obj, obj2);
    }

    /* renamed from: j */
    public Map<R, Map<C, V>> mo34741j() {
        Map<R, Map<C, V>> map = this.f17166f;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> v = mo36440v();
        this.f17166f = v;
        return v;
    }

    /* renamed from: l */
    public Map<C, Map<R, V>> mo34742l() {
        StandardTable<R, C, V>.ColumnMap columnMap = this.f17167g;
        if (columnMap != null) {
            return columnMap;
        }
        StandardTable<R, C, V>.ColumnMap columnMap2 = new ColumnMap();
        this.f17167g = columnMap2;
        return columnMap2;
    }

    /* renamed from: m */
    public Set<Table.Cell<R, C, V>> mo34723m() {
        return super.mo34723m();
    }

    /* renamed from: n */
    public Map<R, V> mo35269n(C c) {
        return new Column(c);
    }

    /* renamed from: p */
    public Set<C> mo35270p() {
        Set<C> set = this.f17165d;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.f17165d = columnKeySet;
        return columnKeySet;
    }

    /* renamed from: q */
    public boolean mo35271q(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> J : this.backingMap.values()) {
            if (Maps.m28067J(J, obj)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int i = 0;
        for (Map<C, V> size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: t */
    public boolean mo35272t(Object obj) {
        return obj != null && Maps.m28067J(this.backingMap, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Iterator<C> mo36449u() {
        return new ColumnKeyIterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Map<R, Map<C, V>> mo36440v() {
        return new RowMap();
    }

    public Collection<V> values() {
        return super.values();
    }

    @CanIgnoreReturnValue
    /* renamed from: x */
    public V mo35273x(R r, C c, V v) {
        Preconditions.m5392s(r);
        Preconditions.m5392s(c);
        Preconditions.m5392s(v);
        return m28828w(r).put(c, v);
    }

    @CanIgnoreReturnValue
    /* renamed from: y */
    public V mo35274y(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m28068K(this.backingMap, obj)) == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return remove;
    }
}
