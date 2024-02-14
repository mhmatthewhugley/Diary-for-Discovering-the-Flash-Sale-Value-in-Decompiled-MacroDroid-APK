package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    private static class Factory<C, V> implements Supplier<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        /* renamed from: a */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    private class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {

        /* renamed from: f */
        final C f17236f;

        /* renamed from: g */
        final C f17237g;

        /* renamed from: o */
        transient SortedMap<C, V> f17238o;

        TreeRow(TreeBasedTable treeBasedTable, R r) {
            this(r, (Object) null, (Object) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36481c() {
            mo36667j();
            SortedMap<C, V> sortedMap = this.f17238o;
            if (sortedMap != null && sortedMap.isEmpty()) {
                TreeBasedTable.this.backingMap.remove(this.f17190a);
                this.f17238o = null;
                this.f17191c = null;
            }
        }

        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.mo36657G();
        }

        public boolean containsKey(Object obj) {
            return mo36666i(obj) && super.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo36661f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        public C firstKey() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedMap<C, V> mo36480b() {
            mo36667j();
            SortedMap<C, V> sortedMap = this.f17238o;
            if (sortedMap == null) {
                return null;
            }
            C c = this.f17236f;
            if (c != null) {
                sortedMap = sortedMap.tailMap(c);
            }
            C c2 = this.f17237g;
            return c2 != null ? sortedMap.headMap(c2) : sortedMap;
        }

        /* renamed from: h */
        public SortedSet<C> keySet() {
            return new Maps.SortedKeySet(this);
        }

        public SortedMap<C, V> headMap(C c) {
            Preconditions.m5377d(mo36666i(Preconditions.m5392s(c)));
            return new TreeRow(this.f17190a, this.f17236f, c);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = r1.f17236f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
            r0 = r1.f17237g;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo36666i(java.lang.Object r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x0018
                C r0 = r1.f17236f
                if (r0 == 0) goto L_0x000c
                int r0 = r1.mo36661f(r0, r2)
                if (r0 > 0) goto L_0x0018
            L_0x000c:
                C r0 = r1.f17237g
                if (r0 == 0) goto L_0x0016
                int r2 = r1.mo36661f(r0, r2)
                if (r2 <= 0) goto L_0x0018
            L_0x0016:
                r2 = 1
                goto L_0x0019
            L_0x0018:
                r2 = 0
            L_0x0019:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.TreeRow.mo36666i(java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo36667j() {
            SortedMap<C, V> sortedMap = this.f17238o;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f17190a))) {
                this.f17238o = (SortedMap) TreeBasedTable.this.backingMap.get(this.f17190a);
            }
        }

        public C lastKey() {
            mo36483d();
            Map<C, V> map = this.f17191c;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        public V put(C c, V v) {
            Preconditions.m5377d(mo36666i(Preconditions.m5392s(c)));
            return super.put(c, v);
        }

        public SortedMap<C, V> subMap(C c, C c2) {
            Preconditions.m5377d(mo36666i(Preconditions.m5392s(c)) && mo36666i(Preconditions.m5392s(c2)));
            return new TreeRow(this.f17190a, c, c2);
        }

        public SortedMap<C, V> tailMap(C c) {
            Preconditions.m5377d(mo36666i(Preconditions.m5392s(c)));
            return new TreeRow(this.f17190a, c, this.f17237g);
        }

        TreeRow(R r, C c, C c2) {
            super(r);
            this.f17236f = c;
            this.f17237g = c2;
            Preconditions.m5377d(c == null || c2 == null || mo36661f(c, c2) <= 0);
        }
    }

    @Deprecated
    /* renamed from: G */
    public Comparator<? super C> mo36657G() {
        return this.columnComparator;
    }

    /* renamed from: I */
    public SortedMap<C, V> mo35268B(R r) {
        return new TreeRow(this, r);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo34713b(Object obj, Object obj2) {
        return super.mo34713b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ Object mo34718e(Object obj, Object obj2) {
        return super.mo34718e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ Map mo34742l() {
        return super.mo34742l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Set mo34723m() {
        return super.mo34723m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ Map mo35269n(Object obj) {
        return super.mo35269n(obj);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ Set mo35270p() {
        return super.mo35270p();
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo35271q(Object obj) {
        return super.mo35271q(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ boolean mo35272t(Object obj) {
        return super.mo35272t(obj);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Iterator<C> mo36449u() {
        final Comparator G = mo36657G();
        final UnmodifiableIterator<T> x = Iterators.m27728x(Iterables.m27692s(this.backingMap.values(), C7146c.f17331a), G);
        return new AbstractIterator<C>(this) {

            /* renamed from: d */
            C f17233d;

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C mo34417a() {
                boolean z;
                while (x.hasNext()) {
                    C next = x.next();
                    C c = this.f17233d;
                    if (c == null || G.compare(next, c) != 0) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (!z) {
                        this.f17233d = next;
                        return next;
                    }
                }
                this.f17233d = null;
                return mo34418b();
            }
        };
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @CanIgnoreReturnValue
    /* renamed from: x */
    public /* bridge */ /* synthetic */ Object mo35273x(Object obj, Object obj2, Object obj3) {
        return super.mo35273x(obj, obj2, obj3);
    }

    @CanIgnoreReturnValue
    /* renamed from: y */
    public /* bridge */ /* synthetic */ Object mo35274y(Object obj, Object obj2) {
        return super.mo35274y(obj, obj2);
    }

    /* renamed from: j */
    public SortedMap<R, Map<C, V>> m29003j() {
        return super.mo34741j();
    }
}
