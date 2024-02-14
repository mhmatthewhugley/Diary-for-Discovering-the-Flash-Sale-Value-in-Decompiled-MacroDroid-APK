package com.google.common.collect;

import WrappedCollection.WrappedIterator;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public transient Map<K, Collection<V>> f16390o;

    /* renamed from: p */
    private transient int f16391p;

    private class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* renamed from: f */
        final transient Map<K, Collection<V>> f16392f;

        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            AsMapEntries() {
            }

            public boolean contains(Object obj) {
                return Collections2.m26545g(AsMap.this.f16392f.entrySet(), obj);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Map<K, Collection<V>> mo34465i() {
                return AsMap.this;
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new AsMapIterator();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.m26305E(entry.getKey());
                return true;
            }
        }

        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Map.Entry<K, Collection<V>>> f16395a;

            /* renamed from: c */
            Collection<V> f16396c;

            AsMapIterator() {
                this.f16395a = AsMap.this.f16392f.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f16395a.next();
                this.f16396c = (Collection) next.getValue();
                return AsMap.this.mo34457f(next);
            }

            public boolean hasNext() {
                return this.f16395a.hasNext();
            }

            public void remove() {
                Preconditions.m5399z(this.f16396c != null, "no calls to next() since the last call to remove()");
                this.f16395a.remove();
                AbstractMapBasedMultimap.m26311u(AbstractMapBasedMultimap.this, this.f16396c.size());
                this.f16396c.clear();
                this.f16396c = null;
            }
        }

        AsMap(Map<K, Collection<V>> map) {
            this.f16392f = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo34451a() {
            return new AsMapEntries();
        }

        public void clear() {
            if (this.f16392f == AbstractMapBasedMultimap.this.f16390o) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m27709e(new AsMapIterator());
            }
        }

        public boolean containsKey(Object obj) {
            return Maps.m28067J(this.f16392f, obj);
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) Maps.m28068K(this.f16392f, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.mo34423H(obj, collection);
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f16392f.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> y = AbstractMapBasedMultimap.this.mo34431y();
            y.addAll(remove);
            AbstractMapBasedMultimap.m26311u(AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return y;
        }

        public boolean equals(Object obj) {
            return this == obj || this.f16392f.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map.Entry<K, Collection<V>> mo34457f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.m28105t(key, AbstractMapBasedMultimap.this.mo34423H(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f16392f.hashCode();
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public int size() {
            return this.f16392f.size();
        }

        public String toString() {
            return this.f16392f.toString();
        }
    }

    private abstract class Itr<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<K, Collection<V>>> f16398a;

        /* renamed from: c */
        K f16399c = null;

        /* renamed from: d */
        Collection<V> f16400d = null;

        /* renamed from: f */
        Iterator<V> f16401f = Iterators.m27719o();

        Itr() {
            this.f16398a = AbstractMapBasedMultimap.this.f16390o.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo34449a(@ParametricNullness K k, @ParametricNullness V v);

        public boolean hasNext() {
            return this.f16398a.hasNext() || this.f16401f.hasNext();
        }

        public T next() {
            if (!this.f16401f.hasNext()) {
                Map.Entry next = this.f16398a.next();
                this.f16399c = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f16400d = collection;
                this.f16401f = collection.iterator();
            }
            return mo34449a(NullnessCasts.m28457a(this.f16399c), this.f16401f.next());
        }

        public void remove() {
            this.f16401f.remove();
            Collection<V> collection = this.f16400d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f16398a.remove();
            }
            AbstractMapBasedMultimap.m26309q(AbstractMapBasedMultimap.this);
        }
    }

    private class KeySet extends Maps.KeySet<K, Collection<V>> {
        KeySet(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterators.m27709e(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo36036i().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || mo36036i().keySet().equals(obj);
        }

        public int hashCode() {
            return mo36036i().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = mo36036i().entrySet().iterator();
            return new Iterator<K>() {

                /* renamed from: a */
                Map.Entry<K, Collection<V>> f16404a;

                public boolean hasNext() {
                    return it.hasNext();
                }

                @ParametricNullness
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f16404a = entry;
                    return entry.getKey();
                }

                public void remove() {
                    Preconditions.m5399z(this.f16404a != null, "no calls to next() since the last call to remove()");
                    Collection value = this.f16404a.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.m26311u(AbstractMapBasedMultimap.this, value.size());
                    value.clear();
                    this.f16404a = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo36036i().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.m26311u(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        NavigableAsMap(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k) {
            Map.Entry ceilingEntry = mo34498i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo34457f(ceilingEntry);
        }

        public K ceilingKey(@ParametricNullness K k) {
            return mo34498i().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new NavigableAsMap(mo34498i().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo34498i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo34457f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k) {
            Map.Entry floorEntry = mo34498i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo34457f(floorEntry);
        }

        public K floorKey(@ParametricNullness K k) {
            return mo34498i().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k) {
            Map.Entry higherEntry = mo34498i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo34457f(higherEntry);
        }

        public K higherKey(@ParametricNullness K k) {
            return mo34498i().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public NavigableSet<K> mo34492g() {
            return new NavigableKeySet(mo34498i());
        }

        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo34498i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo34457f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k) {
            Map.Entry lowerEntry = mo34498i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo34457f(lowerEntry);
        }

        public K lowerKey(@ParametricNullness K k) {
            return mo34498i().lowerKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Map.Entry<K, Collection<V>> mo34505m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection y = AbstractMapBasedMultimap.this.mo34431y();
            y.addAll((Collection) next.getValue());
            it.remove();
            return Maps.m28105t(next.getKey(), AbstractMapBasedMultimap.this.mo34422G(y));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo34498i() {
            return (NavigableMap) super.mo34498i();
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo34505m(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo34505m(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k, boolean z) {
            return new NavigableAsMap(mo34498i().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new NavigableAsMap(mo34498i().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k, boolean z) {
            return new NavigableAsMap(mo34498i().tailMap(k, z));
        }
    }

    class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        NavigableKeySet(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(@ParametricNullness K k) {
            return mo34523j().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new NavigableKeySet(mo34523j().descendingMap());
        }

        public K floor(@ParametricNullness K k) {
            return mo34523j().floorKey(k);
        }

        public K higher(@ParametricNullness K k) {
            return mo34523j().higherKey(k);
        }

        /* renamed from: k */
        public NavigableSet<K> headSet(@ParametricNullness K k) {
            return headSet(k, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public NavigableMap<K, Collection<V>> mo34523j() {
            return (NavigableMap) super.mo34523j();
        }

        public K lower(@ParametricNullness K k) {
            return mo34523j().lowerKey(k);
        }

        /* renamed from: m */
        public NavigableSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: n */
        public NavigableSet<K> tailSet(@ParametricNullness K k) {
            return tailSet(k, true);
        }

        public K pollFirst() {
            return Iterators.m27696C(iterator());
        }

        public K pollLast() {
            return Iterators.m27696C(descendingIterator());
        }

        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return new NavigableKeySet(mo34523j().headMap(k, z));
        }

        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new NavigableKeySet(mo34523j().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return new NavigableKeySet(mo34523j().tailMap(k, z));
        }
    }

    private class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        RandomAccessWrappedList(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }
    }

    private class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {

        /* renamed from: o */
        SortedSet<K> f16409o;

        SortedAsMap(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo34498i().comparator();
        }

        @ParametricNullness
        public K firstKey() {
            return mo34498i().firstKey();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedSet<K> mo34484b() {
            return new SortedKeySet(mo34498i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f16409o;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g = mo34484b();
            this.f16409o = g;
            return g;
        }

        public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k) {
            return new SortedAsMap(mo34498i().headMap(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo34498i() {
            return (SortedMap) this.f16392f;
        }

        @ParametricNullness
        public K lastKey() {
            return mo34498i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedAsMap(mo34498i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
            return new SortedAsMap(mo34498i().tailMap(k));
        }
    }

    private class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        SortedKeySet(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo34523j().comparator();
        }

        @ParametricNullness
        public K first() {
            return mo34523j().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new SortedKeySet(mo34523j().headMap(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public SortedMap<K, Collection<V>> mo34523j() {
            return (SortedMap) super.mo36036i();
        }

        @ParametricNullness
        public K last() {
            return mo34523j().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedKeySet(mo34523j().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new SortedKeySet(mo34523j().tailMap(k));
        }
    }

    class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        WrappedNavigableSet(@ParametricNullness K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, navigableSet, wrappedCollection);
        }

        /* renamed from: m */
        private NavigableSet<V> m26373m(NavigableSet<V> navigableSet) {
            return new WrappedNavigableSet(this.f16412a, navigableSet, mo34547d() == null ? this : mo34547d());
        }

        public V ceiling(@ParametricNullness V v) {
            return mo34588k().ceiling(v);
        }

        public Iterator<V> descendingIterator() {
            return new WrappedCollection.WrappedIterator(mo34588k().descendingIterator());
        }

        public NavigableSet<V> descendingSet() {
            return m26373m(mo34588k().descendingSet());
        }

        public V floor(@ParametricNullness V v) {
            return mo34588k().floor(v);
        }

        public NavigableSet<V> headSet(@ParametricNullness V v, boolean z) {
            return m26373m(mo34588k().headSet(v, z));
        }

        public V higher(@ParametricNullness V v) {
            return mo34588k().higher(v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public NavigableSet<V> mo34588k() {
            return (NavigableSet) super.mo34588k();
        }

        public V lower(@ParametricNullness V v) {
            return mo34588k().lower(v);
        }

        public V pollFirst() {
            return Iterators.m27696C(iterator());
        }

        public V pollLast() {
            return Iterators.m27696C(descendingIterator());
        }

        public NavigableSet<V> subSet(@ParametricNullness V v, boolean z, @ParametricNullness V v2, boolean z2) {
            return m26373m(mo34588k().subSet(v, z, v2, z2));
        }

        public NavigableSet<V> tailSet(@ParametricNullness V v, boolean z) {
            return m26373m(mo34588k().tailSet(v, z));
        }
    }

    class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        WrappedSet(@ParametricNullness K k, Set<V> set) {
            super(k, set, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m = Sets.m28730m((Set) this.f16413c, collection);
            if (m) {
                AbstractMapBasedMultimap.m26310r(AbstractMapBasedMultimap.this, this.f16413c.size() - size);
                mo34554j();
            }
            return m;
        }
    }

    class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        WrappedSortedSet(@ParametricNullness K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, sortedSet, wrappedCollection);
        }

        public Comparator<? super V> comparator() {
            return mo34588k().comparator();
        }

        @ParametricNullness
        public V first() {
            mo34552i();
            return mo34588k().first();
        }

        public SortedSet<V> headSet(@ParametricNullness V v) {
            mo34552i();
            return new WrappedSortedSet(mo34550h(), mo34588k().headSet(v), mo34547d() == null ? this : mo34547d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public SortedSet<V> mo34588k() {
            return (SortedSet) mo34549f();
        }

        @ParametricNullness
        public V last() {
            mo34552i();
            return mo34588k().last();
        }

        public SortedSet<V> subSet(@ParametricNullness V v, @ParametricNullness V v2) {
            mo34552i();
            return new WrappedSortedSet(mo34550h(), mo34588k().subSet(v, v2), mo34547d() == null ? this : mo34547d());
        }

        public SortedSet<V> tailSet(@ParametricNullness V v) {
            mo34552i();
            return new WrappedSortedSet(mo34550h(), mo34588k().tailSet(v), mo34547d() == null ? this : mo34547d());
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        Preconditions.m5377d(map.isEmpty());
        this.f16390o = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static <E> Iterator<E> m26304D(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m26305E(Object obj) {
        Collection collection = (Collection) Maps.m28069L(this.f16390o, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f16391p -= size;
        }
    }

    /* renamed from: p */
    static /* synthetic */ int m26308p(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f16391p;
        abstractMapBasedMultimap.f16391p = i + 1;
        return i;
    }

    /* renamed from: q */
    static /* synthetic */ int m26309q(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f16391p;
        abstractMapBasedMultimap.f16391p = i - 1;
        return i;
    }

    /* renamed from: r */
    static /* synthetic */ int m26310r(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f16391p + i;
        abstractMapBasedMultimap.f16391p = i2;
        return i2;
    }

    /* renamed from: u */
    static /* synthetic */ int m26311u(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f16391p - i;
        abstractMapBasedMultimap.f16391p = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final Map<K, Collection<V>> mo34432A() {
        Map<K, Collection<V>> map = this.f16390o;
        if (map instanceof NavigableMap) {
            return new NavigableAsMap((NavigableMap) this.f16390o);
        }
        if (map instanceof SortedMap) {
            return new SortedAsMap((SortedMap) this.f16390o);
        }
        return new AsMap(this.f16390o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final Set<K> mo34433B() {
        Map<K, Collection<V>> map = this.f16390o;
        if (map instanceof NavigableMap) {
            return new NavigableKeySet((NavigableMap) this.f16390o);
        }
        if (map instanceof SortedMap) {
            return new SortedKeySet((SortedMap) this.f16390o);
        }
        return new KeySet(this.f16390o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Collection<V> mo34421C() {
        return mo34422G(mo34431y());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo34434F(Map<K, Collection<V>> map) {
        this.f16390o = map;
        this.f16391p = 0;
        for (Collection next : map.values()) {
            Preconditions.m5377d(!next.isEmpty());
            this.f16391p += next.size();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public <E> Collection<E> mo34422G(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
        return new WrappedCollection(k, collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final List<V> mo34435I(@ParametricNullness K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        if (list instanceof RandomAccess) {
            return new RandomAccessWrappedList(this, k, list, wrappedCollection);
        }
        return new WrappedList(k, list, wrappedCollection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        return new AsMap(this.f16390o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo34437b() {
        if (this instanceof SetMultimap) {
            return new AbstractMultimap.EntrySet(this);
        }
        return new AbstractMultimap.Entries();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        return new KeySet(this.f16390o);
    }

    public void clear() {
        for (Collection<V> clear : this.f16390o.values()) {
            clear.clear();
        }
        this.f16390o.clear();
        this.f16391p = 0;
    }

    public boolean containsKey(Object obj) {
        return this.f16390o.containsKey(obj);
    }

    /* renamed from: d */
    public Collection<V> mo34426d(Object obj) {
        Collection remove = this.f16390o.remove(obj);
        if (remove == null) {
            return mo34421C();
        }
        Collection y = mo34431y();
        y.addAll(remove);
        this.f16391p -= remove.size();
        remove.clear();
        return mo34422G(y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Multiset<K> mo34441e() {
        return new Multimaps.Keys(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<V> mo34442f() {
        return new AbstractMultimap.Values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<K, V>> mo34443g() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>(this) {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> mo34449a(@ParametricNullness K k, @ParametricNullness V v) {
                return Maps.m28105t(k, v);
            }
        };
    }

    public Collection<V> get(@ParametricNullness K k) {
        Collection collection = this.f16390o.get(k);
        if (collection == null) {
            collection = mo34448z(k);
        }
        return mo34423H(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<V> mo34444h() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>(this) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: a */
            public V mo34449a(@ParametricNullness K k, @ParametricNullness V v) {
                return v;
            }
        };
    }

    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo34445i() {
        return super.mo34445i();
    }

    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        Collection collection = this.f16390o.get(k);
        if (collection == null) {
            Collection z = mo34448z(k);
            if (z.add(v)) {
                this.f16391p++;
                this.f16390o.put(k, z);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f16391p++;
            return true;
        }
    }

    public int size() {
        return this.f16391p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Map<K, Collection<V>> mo34447x() {
        return this.f16390o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public abstract Collection<V> mo34431y();

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Collection<V> mo34448z(@ParametricNullness K k) {
        return mo34431y();
    }

    class WrappedCollection extends AbstractCollection<V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16412a;

        /* renamed from: c */
        Collection<V> f16413c;

        /* renamed from: d */
        final AbstractMapBasedMultimap<K, V>.WrappedCollection f16414d;

        /* renamed from: f */
        final Collection<V> f16415f;

        WrappedCollection(@ParametricNullness K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            Collection<V> collection2;
            this.f16412a = k;
            this.f16413c = collection;
            this.f16414d = wrappedCollection;
            if (wrappedCollection == null) {
                collection2 = null;
            } else {
                collection2 = wrappedCollection.mo34549f();
            }
            this.f16415f = collection2;
        }

        public boolean add(@ParametricNullness V v) {
            mo34552i();
            boolean isEmpty = this.f16413c.isEmpty();
            boolean add = this.f16413c.add(v);
            if (add) {
                AbstractMapBasedMultimap.m26308p(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    mo34543c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f16413c.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.m26310r(AbstractMapBasedMultimap.this, this.f16413c.size() - size);
                if (size == 0) {
                    mo34543c();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo34543c() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f16414d;
            if (wrappedCollection != null) {
                wrappedCollection.mo34543c();
            } else {
                AbstractMapBasedMultimap.this.f16390o.put(this.f16412a, this.f16413c);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f16413c.clear();
                AbstractMapBasedMultimap.m26311u(AbstractMapBasedMultimap.this, size);
                mo34554j();
            }
        }

        public boolean contains(Object obj) {
            mo34552i();
            return this.f16413c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo34552i();
            return this.f16413c.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public AbstractMapBasedMultimap<K, V>.WrappedCollection mo34547d() {
            return this.f16414d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo34552i();
            return this.f16413c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<V> mo34549f() {
            return this.f16413c;
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: h */
        public K mo34550h() {
            return this.f16412a;
        }

        public int hashCode() {
            mo34552i();
            return this.f16413c.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo34552i() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f16414d;
            if (wrappedCollection != null) {
                wrappedCollection.mo34552i();
                if (this.f16414d.mo34549f() != this.f16415f) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f16413c.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.f16390o.get(this.f16412a)) != null) {
                this.f16413c = collection;
            }
        }

        public Iterator<V> iterator() {
            mo34552i();
            return new WrappedIterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34554j() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f16414d;
            if (wrappedCollection != null) {
                wrappedCollection.mo34554j();
            } else if (this.f16413c.isEmpty()) {
                AbstractMapBasedMultimap.this.f16390o.remove(this.f16412a);
            }
        }

        public boolean remove(Object obj) {
            mo34552i();
            boolean remove = this.f16413c.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.m26309q(AbstractMapBasedMultimap.this);
                mo34554j();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f16413c.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.m26310r(AbstractMapBasedMultimap.this, this.f16413c.size() - size);
                mo34554j();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.m5392s(collection);
            int size = size();
            boolean retainAll = this.f16413c.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.m26310r(AbstractMapBasedMultimap.this, this.f16413c.size() - size);
                mo34554j();
            }
            return retainAll;
        }

        public int size() {
            mo34552i();
            return this.f16413c.size();
        }

        public String toString() {
            mo34552i();
            return this.f16413c.toString();
        }

        class WrappedIterator implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f16417a;

            /* renamed from: c */
            final Collection<V> f16418c;

            WrappedIterator() {
                Collection<V> collection = WrappedCollection.this.f16413c;
                this.f16418c = collection;
                this.f16417a = AbstractMapBasedMultimap.m26304D(collection);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Iterator<V> mo34560a() {
                mo34561b();
                return this.f16417a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo34561b() {
                WrappedCollection.this.mo34552i();
                if (WrappedCollection.this.f16413c != this.f16418c) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo34561b();
                return this.f16417a.hasNext();
            }

            @ParametricNullness
            public V next() {
                mo34561b();
                return this.f16417a.next();
            }

            public void remove() {
                this.f16417a.remove();
                AbstractMapBasedMultimap.m26309q(AbstractMapBasedMultimap.this);
                WrappedCollection.this.mo34554j();
            }

            WrappedIterator(Iterator<V> it) {
                this.f16418c = WrappedCollection.this.f16413c;
                this.f16417a = it;
            }
        }
    }

    class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        private class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedIterator implements ListIterator<V> {
            WrappedListIterator() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator, com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator] */
            /* renamed from: c */
            private ListIterator<V> m26372c() {
                return (ListIterator) mo34560a();
            }

            public void add(@ParametricNullness V v) {
                boolean isEmpty = WrappedList.this.isEmpty();
                m26372c().add(v);
                AbstractMapBasedMultimap.m26308p(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.mo34543c();
                }
            }

            public boolean hasPrevious() {
                return m26372c().hasPrevious();
            }

            public int nextIndex() {
                return m26372c().nextIndex();
            }

            @ParametricNullness
            public V previous() {
                return m26372c().previous();
            }

            public int previousIndex() {
                return m26372c().previousIndex();
            }

            public void set(@ParametricNullness V v) {
                m26372c().set(v);
            }

            public WrappedListIterator(int i) {
                super(WrappedList.this.mo34569k().listIterator(i));
            }
        }

        WrappedList(@ParametricNullness K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }

        public void add(int i, @ParametricNullness V v) {
            mo34552i();
            boolean isEmpty = mo34549f().isEmpty();
            mo34569k().add(i, v);
            AbstractMapBasedMultimap.m26308p(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                mo34543c();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo34569k().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.m26310r(AbstractMapBasedMultimap.this, mo34549f().size() - size);
                if (size == 0) {
                    mo34543c();
                }
            }
            return addAll;
        }

        @ParametricNullness
        public V get(int i) {
            mo34552i();
            return mo34569k().get(i);
        }

        public int indexOf(Object obj) {
            mo34552i();
            return mo34569k().indexOf(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public List<V> mo34569k() {
            return (List) mo34549f();
        }

        public int lastIndexOf(Object obj) {
            mo34552i();
            return mo34569k().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo34552i();
            return new WrappedListIterator();
        }

        @ParametricNullness
        public V remove(int i) {
            mo34552i();
            V remove = mo34569k().remove(i);
            AbstractMapBasedMultimap.m26309q(AbstractMapBasedMultimap.this);
            mo34554j();
            return remove;
        }

        @ParametricNullness
        public V set(int i, @ParametricNullness V v) {
            mo34552i();
            return mo34569k().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo34552i();
            return AbstractMapBasedMultimap.this.mo34435I(mo34550h(), mo34569k().subList(i, i2), mo34547d() == null ? this : mo34547d());
        }

        public ListIterator<V> listIterator(int i) {
            mo34552i();
            return new WrappedListIterator(i);
        }
    }
}
