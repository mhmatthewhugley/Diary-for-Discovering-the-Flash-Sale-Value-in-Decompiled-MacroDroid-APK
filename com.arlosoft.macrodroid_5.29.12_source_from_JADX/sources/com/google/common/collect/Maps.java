package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Maps {

    private static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: f */
        final Map<K, V> f16919f;

        /* renamed from: g */
        final Predicate<? super Map.Entry<K, V>> f16920g;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            this.f16919f = map;
            this.f16920g = predicate;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo35065c() {
            return new FilteredMapValues(this, this.f16919f, this.f16920g);
        }

        public boolean containsKey(Object obj) {
            return this.f16919f.containsKey(obj) && mo35955d(obj, this.f16919f.get(obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo35955d(Object obj, @ParametricNullness V v) {
            return this.f16920g.apply(Maps.m28105t(obj, v));
        }

        public V get(Object obj) {
            V v = this.f16919f.get(obj);
            if (v == null || !mo35955d(obj, v)) {
                return null;
            }
            return v;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V put(@ParametricNullness K k, @ParametricNullness V v) {
            Preconditions.m5377d(mo35955d(k, v));
            return this.f16919f.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry next : map.entrySet()) {
                Preconditions.m5377d(mo35955d(next.getKey(), next.getValue()));
            }
            this.f16919f.putAll(map);
        }

        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f16919f.remove(obj);
            }
            return null;
        }
    }

    private static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: f */
        private final Set<K> f16921f;

        /* renamed from: g */
        final Function<? super K, V> f16922g;

        AsMapView(Set<K> set, Function<? super K, V> function) {
            this.f16921f = (Set) Preconditions.m5392s(set);
            this.f16922g = (Function) Preconditions.m5392s(function);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo34451a() {
            return new EntrySet<K, V>() {
                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public Map<K, V> mo34465i() {
                    return AsMapView.this;
                }

                public Iterator<Map.Entry<K, V>> iterator() {
                    return Maps.m28096k(AsMapView.this.mo35963d(), AsMapView.this.f16922g);
                }
            };
        }

        /* renamed from: b */
        public Set<K> mo34484b() {
            return Maps.m28065H(mo35963d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo35065c() {
            return Collections2.m26548j(this.f16921f, this.f16922g);
        }

        public void clear() {
            mo35963d().clear();
        }

        public boolean containsKey(Object obj) {
            return mo35963d().contains(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<K> mo35963d() {
            return this.f16921f;
        }

        public V get(Object obj) {
            if (Collections2.m26545g(mo35963d(), obj)) {
                return this.f16922g.apply(obj);
            }
            return null;
        }

        public V remove(Object obj) {
            if (mo35963d().remove(obj)) {
                return this.f16922g.apply(obj);
            }
            return null;
        }

        public int size() {
            return mo35963d().size();
        }
    }

    private static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> bimap;

        /* renamed from: h */
        private static <X, Y> Y m28141h(BiMap<X, Y> biMap, X x) {
            Y y = biMap.get(x);
            Preconditions.m5385l(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo22095d(B b) {
            return m28141h(this.bimap.mo34390x0(), b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public B mo22096e(A a) {
            return m28141h(this.bimap, a);
        }

        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.bimap.equals(((BiMapConverter) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.bimap);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Maps.asConverter(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    @GwtIncompatible
    static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* renamed from: a */
        private transient Comparator<? super K> f16924a;

        /* renamed from: c */
        private transient Set<Map.Entry<K, V>> f16925c;

        /* renamed from: d */
        private transient NavigableSet<K> f16926d;

        DescendingMap() {
        }

        /* renamed from: Y */
        private static <T> Ordering<T> m28144Y(Comparator<T> comparator) {
            return Ordering.m28520a(comparator).mo34739j();
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public final Map<K, V> mo22325Q() {
            return mo34684X();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: V */
        public Set<Map.Entry<K, V>> mo35970V() {
            return new EntrySet<K, V>() {
                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public Map<K, V> mo34465i() {
                    return DescendingMap.this;
                }

                public Iterator<Map.Entry<K, V>> iterator() {
                    return DescendingMap.this.mo34683W();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public abstract Iterator<Map.Entry<K, V>> mo34683W();

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public abstract NavigableMap<K, V> mo34684X();

        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
            return mo34684X().floorEntry(k);
        }

        public K ceilingKey(@ParametricNullness K k) {
            return mo34684X().floorKey(k);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f16924a;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = mo34684X().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.m28521e();
            }
            Ordering Y = m28144Y(comparator2);
            this.f16924a = Y;
            return Y;
        }

        public NavigableSet<K> descendingKeySet() {
            return mo34684X().navigableKeySet();
        }

        public NavigableMap<K, V> descendingMap() {
            return mo34684X();
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f16925c;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> V = mo35970V();
            this.f16925c = V;
            return V;
        }

        public Map.Entry<K, V> firstEntry() {
            return mo34684X().lastEntry();
        }

        @ParametricNullness
        public K firstKey() {
            return mo34684X().lastKey();
        }

        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
            return mo34684X().ceilingEntry(k);
        }

        public K floorKey(@ParametricNullness K k) {
            return mo34684X().ceilingKey(k);
        }

        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return mo34684X().tailMap(k, z).descendingMap();
        }

        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
            return mo34684X().lowerEntry(k);
        }

        public K higherKey(@ParametricNullness K k) {
            return mo34684X().lowerKey(k);
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            return mo34684X().firstEntry();
        }

        @ParametricNullness
        public K lastKey() {
            return mo34684X().firstKey();
        }

        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
            return mo34684X().higherEntry(k);
        }

        public K lowerKey(@ParametricNullness K k) {
            return mo34684X().higherKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f16926d;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f16926d = navigableKeySet;
            return navigableKeySet;
        }

        public Map.Entry<K, V> pollFirstEntry() {
            return mo34684X().pollLastEntry();
        }

        public Map.Entry<K, V> pollLastEntry() {
            return mo34684X().pollFirstEntry();
        }

        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return mo34684X().subMap(k2, z2, k, z).descendingMap();
        }

        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return mo34684X().headMap(k, z).descendingMap();
        }

        public String toString() {
            return mo35178T();
        }

        public Collection<V> values() {
            return new Values(this);
        }

        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }
    }

    private enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: d */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: d */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public void clear() {
            mo34465i().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object K = Maps.m28068K(mo34465i(), key);
            if (!Objects.m5349a(K, entry.getValue())) {
                return false;
            }
            if (K != null || mo34465i().containsKey(key)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract Map<K, V> mo34465i();

        public boolean isEmpty() {
            return mo34465i().isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            return mo34465i().keySet().remove(((Map.Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.m5392s(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.m28731n(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.m5392s(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet i = Sets.m28726i(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        i.add(((Map.Entry) next).getKey());
                    }
                }
                return mo34465i().keySet().retainAll(i);
            }
        }

        public int size() {
            return mo34465i().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        /* renamed from: a */
        V2 mo35953a(@ParametricNullness K k, @ParametricNullness V1 v1);
    }

    static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {
        @RetainedWith

        /* renamed from: p */
        private final BiMap<V, K> f16931p;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1 */
        class C70331 implements Predicate<Map.Entry<Object, Object>> {

            /* renamed from: a */
            final /* synthetic */ Predicate f16932a;

            /* renamed from: a */
            public boolean apply(Map.Entry<Object, Object> entry) {
                return this.f16932a.apply(Maps.m28105t(entry.getValue(), entry.getKey()));
            }
        }

        /* renamed from: x0 */
        public BiMap<V, K> mo34390x0() {
            return this.f16931p;
        }

        public Set<V> values() {
            return this.f16931p.keySet();
        }
    }

    static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: o */
        final Set<Map.Entry<K, V>> f16933o;

        private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            private EntrySet() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: b0 */
            public Set<Map.Entry<K, V>> mo34397R() {
                return FilteredEntryMap.this.f16933o;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(FilteredEntryMap.this.f16933o.iterator()) {
                    /* access modifiers changed from: package-private */
                    /* renamed from: b */
                    public Map.Entry<K, V> mo34726a(final Map.Entry<K, V> entry) {
                        return new ForwardingMapEntry<K, V>() {
                            /* access modifiers changed from: protected */
                            /* renamed from: R */
                            public Map.Entry<K, V> mo22325Q() {
                                return entry;
                            }

                            @ParametricNullness
                            public V setValue(@ParametricNullness V v) {
                                Preconditions.m5377d(FilteredEntryMap.this.mo35955d(getKey(), v));
                                return super.setValue(v);
                            }
                        };
                    }
                };
            }
        }

        class KeySet extends KeySet<K, V> {
            KeySet() {
                super(FilteredEntryMap.this);
            }

            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.f16919f.remove(obj);
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m28158e(filteredEntryMap.f16919f, filteredEntryMap.f16920g, collection);
            }

            public boolean retainAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m28159f(filteredEntryMap.f16919f, filteredEntryMap.f16920g, collection);
            }

            public Object[] toArray() {
                return Lists.m27834j(iterator()).toArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return Lists.m27834j(iterator()).toArray(tArr);
            }
        }

        FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.f16933o = Sets.m28721d(map.entrySet(), this.f16920g);
        }

        /* renamed from: e */
        static <K, V> boolean m28158e(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: f */
        static <K, V> boolean m28159f(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo34451a() {
            return new EntrySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Set<K> mo34484b() {
            return new KeySet();
        }
    }

    @GwtIncompatible
    private static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final NavigableMap<K, V> f16939a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Predicate<? super Map.Entry<K, V>> f16940c;

        /* renamed from: d */
        private final Map<K, V> f16941d;

        FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
            this.f16939a = (NavigableMap) Preconditions.m5392s(navigableMap);
            this.f16940c = predicate;
            this.f16941d = new FilteredEntryMap(navigableMap, predicate);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo34750a() {
            return Iterators.m27720p(this.f16939a.entrySet().iterator(), this.f16940c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> mo34661b() {
            return Iterators.m27720p(this.f16939a.descendingMap().entrySet().iterator(), this.f16940c);
        }

        public void clear() {
            this.f16941d.clear();
        }

        public Comparator<? super K> comparator() {
            return this.f16939a.comparator();
        }

        public boolean containsKey(Object obj) {
            return this.f16941d.containsKey(obj);
        }

        public NavigableMap<K, V> descendingMap() {
            return Maps.m28101p(this.f16939a.descendingMap(), this.f16940c);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return this.f16941d.entrySet();
        }

        public V get(Object obj) {
            return this.f16941d.get(obj);
        }

        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.m28101p(this.f16939a.headMap(k, z), this.f16940c);
        }

        public boolean isEmpty() {
            return !Iterables.m27675b(this.f16939a.entrySet(), this.f16940c);
        }

        public NavigableSet<K> navigableKeySet() {
            return new NavigableKeySet<K, V>(this) {
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMap.m28158e(FilteredEntryNavigableMap.this.f16939a, FilteredEntryNavigableMap.this.f16940c, collection);
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMap.m28159f(FilteredEntryNavigableMap.this.f16939a, FilteredEntryNavigableMap.this.f16940c, collection);
                }
            };
        }

        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.m27682i(this.f16939a.entrySet(), this.f16940c);
        }

        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.m27682i(this.f16939a.descendingMap().entrySet(), this.f16940c);
        }

        public V put(@ParametricNullness K k, @ParametricNullness V v) {
            return this.f16941d.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            this.f16941d.putAll(map);
        }

        public V remove(Object obj) {
            return this.f16941d.remove(obj);
        }

        public int size() {
            return this.f16941d.size();
        }

        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.m28101p(this.f16939a.subMap(k, z, k2, z2), this.f16940c);
        }

        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.m28101p(this.f16939a.tailMap(k, z), this.f16940c);
        }

        public Collection<V> values() {
            return new FilteredMapValues(this, this.f16939a, this.f16940c);
        }
    }

    private static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            SortedKeySet() {
                super();
            }

            public Comparator<? super K> comparator() {
                return FilteredEntrySortedMap.this.mo36022i().comparator();
            }

            @ParametricNullness
            public K first() {
                return FilteredEntrySortedMap.this.firstKey();
            }

            public SortedSet<K> headSet(@ParametricNullness K k) {
                return (SortedSet) FilteredEntrySortedMap.this.headMap(k).keySet();
            }

            @ParametricNullness
            public K last() {
                return FilteredEntrySortedMap.this.lastKey();
            }

            public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
                return (SortedSet) FilteredEntrySortedMap.this.subMap(k, k2).keySet();
            }

            public SortedSet<K> tailSet(@ParametricNullness K k) {
                return (SortedSet) FilteredEntrySortedMap.this.tailMap(k).keySet();
            }
        }

        FilteredEntrySortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        public Comparator<? super K> comparator() {
            return mo36022i().comparator();
        }

        @ParametricNullness
        public K firstKey() {
            return keySet().iterator().next();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedSet<K> mo34484b() {
            return new SortedKeySet();
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return new FilteredEntrySortedMap(mo36022i().headMap(k), this.f16920g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public SortedMap<K, V> mo36022i() {
            return (SortedMap) this.f16919f;
        }

        @ParametricNullness
        public K lastKey() {
            SortedMap i = mo36022i();
            while (true) {
                K lastKey = i.lastKey();
                if (mo35955d(lastKey, NullnessCasts.m28457a(this.f16919f.get(lastKey)))) {
                    return lastKey;
                }
                i = mo36022i().headMap(lastKey);
            }
        }

        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return new FilteredEntrySortedMap(mo36022i().subMap(k, k2), this.f16920g);
        }

        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return new FilteredEntrySortedMap(mo36022i().tailMap(k), this.f16920g);
        }
    }

    private static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: o */
        final Predicate<? super K> f16944o;

        FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.f16944o = predicate;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo34451a() {
            return Sets.m28721d(this.f16919f.entrySet(), this.f16920g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Set<K> mo34484b() {
            return Sets.m28721d(this.f16919f.keySet(), this.f16944o);
        }

        public boolean containsKey(Object obj) {
            return this.f16919f.containsKey(obj) && this.f16944o.apply(obj);
        }
    }

    private static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* renamed from: c */
        final Map<K, V> f16945c;

        /* renamed from: d */
        final Predicate<? super Map.Entry<K, V>> f16946d;

        FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map);
            this.f16945c = map2;
            this.f16946d = predicate;
        }

        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f16945c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (this.f16946d.apply(next) && Objects.m5349a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f16945c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (this.f16946d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f16945c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (this.f16946d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public Object[] toArray() {
            return Lists.m27834j(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return Lists.m27834j(iterator()).toArray(tArr);
        }
    }

    static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        IteratorBasedAbstractMap() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo34750a();

        public void clear() {
            Iterators.m27709e(mo34750a());
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new EntrySet<K, V>() {
                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public Map<K, V> mo34465i() {
                    return IteratorBasedAbstractMap.this;
                }

                public Iterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedAbstractMap.this.mo34750a();
                }
            };
        }
    }

    static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        @Weak

        /* renamed from: a */
        final Map<K, V> f16948a;

        KeySet(Map<K, V> map) {
            this.f16948a = (Map) Preconditions.m5392s(map);
        }

        public void clear() {
            mo36036i().clear();
        }

        public boolean contains(Object obj) {
            return mo36036i().containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Map<K, V> mo36036i() {
            return this.f16948a;
        }

        public boolean isEmpty() {
            return mo36036i().isEmpty();
        }

        public Iterator<K> iterator() {
            return Maps.m28108w(mo36036i().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo36036i().remove(obj);
            return true;
        }

        public int size() {
            return mo36036i().size();
        }
    }

    static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {

        /* renamed from: a */
        final Map<K, V> f16949a;

        /* renamed from: b */
        final Map<K, V> f16950b;

        /* renamed from: c */
        final Map<K, V> f16951c;

        /* renamed from: d */
        final Map<K, MapDifference.ValueDifference<V>> f16952d;

        /* renamed from: a */
        public Map<K, V> mo35772a() {
            return this.f16950b;
        }

        /* renamed from: b */
        public Map<K, V> mo35773b() {
            return this.f16949a;
        }

        /* renamed from: c */
        public Map<K, MapDifference.ValueDifference<V>> mo35774c() {
            return this.f16952d;
        }

        /* renamed from: d */
        public Map<K, V> mo35775d() {
            return this.f16951c;
        }

        /* renamed from: e */
        public boolean mo36039e() {
            return this.f16949a.isEmpty() && this.f16950b.isEmpty() && this.f16952d.isEmpty();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            if (!mo35773b().equals(mapDifference.mo35773b()) || !mo35772a().equals(mapDifference.mo35772a()) || !mo35775d().equals(mapDifference.mo35775d()) || !mo35774c().equals(mapDifference.mo35774c())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(mo35773b(), mo35772a(), mo35775d(), mo35774c());
        }

        public String toString() {
            if (mo36039e()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f16949a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f16949a);
            }
            if (!this.f16950b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f16950b);
            }
            if (!this.f16952d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f16952d);
            }
            return sb.toString();
        }
    }

    @GwtIncompatible
    private static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: a */
        private final NavigableSet<K> f16953a;

        /* renamed from: c */
        private final Function<? super K, V> f16954c;

        NavigableAsMapView(NavigableSet<K> navigableSet, Function<? super K, V> function) {
            this.f16953a = (NavigableSet) Preconditions.m5392s(navigableSet);
            this.f16954c = (Function) Preconditions.m5392s(function);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo34750a() {
            return Maps.m28096k(this.f16953a, this.f16954c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> mo34661b() {
            return descendingMap().entrySet().iterator();
        }

        public void clear() {
            this.f16953a.clear();
        }

        public Comparator<? super K> comparator() {
            return this.f16953a.comparator();
        }

        public NavigableMap<K, V> descendingMap() {
            return Maps.m28094i(this.f16953a.descendingSet(), this.f16954c);
        }

        public V get(Object obj) {
            if (Collections2.m26545g(this.f16953a, obj)) {
                return this.f16954c.apply(obj);
            }
            return null;
        }

        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.m28094i(this.f16953a.headSet(k, z), this.f16954c);
        }

        public NavigableSet<K> navigableKeySet() {
            return Maps.m28064G(this.f16953a);
        }

        public int size() {
            return this.f16953a.size();
        }

        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.m28094i(this.f16953a.subSet(k, z, k2, z2), this.f16954c);
        }

        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.m28094i(this.f16953a.tailSet(k, z), this.f16954c);
        }
    }

    @GwtIncompatible
    static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        NavigableKeySet(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(@ParametricNullness K k) {
            return mo36056j().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return mo36056j().descendingKeySet();
        }

        public K floor(@ParametricNullness K k) {
            return mo36056j().floorKey(k);
        }

        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return mo36056j().headMap(k, z).navigableKeySet();
        }

        public K higher(@ParametricNullness K k) {
            return mo36056j().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public NavigableMap<K, V> mo36056j() {
            return (NavigableMap) this.f16948a;
        }

        public K lower(@ParametricNullness K k) {
            return mo36056j().lowerKey(k);
        }

        public K pollFirst() {
            return Maps.m28109x(mo36056j().pollFirstEntry());
        }

        public K pollLast() {
            return Maps.m28109x(mo36056j().pollLastEntry());
        }

        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return mo36056j().subMap(k, z, k2, z2).navigableKeySet();
        }

        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return mo36056j().tailMap(k, z).navigableKeySet();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return headSet(k, false);
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return subSet(k, true, k2, false);
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return tailSet(k, true);
        }
    }

    private static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        SortedAsMapView(SortedSet<K> sortedSet, Function<? super K, V> function) {
            super(sortedSet, function);
        }

        public Comparator<? super K> comparator() {
            return mo35963d().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public SortedSet<K> mo35963d() {
            return (SortedSet) super.mo35963d();
        }

        @ParametricNullness
        public K firstKey() {
            return mo35963d().first();
        }

        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return Maps.m28095j(mo35963d().headSet(k), this.f16922g);
        }

        public Set<K> keySet() {
            return Maps.m28066I(mo35963d());
        }

        @ParametricNullness
        public K lastKey() {
            return mo35963d().last();
        }

        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return Maps.m28095j(mo35963d().subSet(k, k2), this.f16922g);
        }

        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return Maps.m28095j(mo35963d().tailSet(k), this.f16922g);
        }
    }

    static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        SortedKeySet(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo36036i().comparator();
        }

        @ParametricNullness
        public K first() {
            return mo36036i().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new SortedKeySet(mo36036i().headMap(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public SortedMap<K, V> mo36036i() {
            return (SortedMap) super.mo36036i();
        }

        @ParametricNullness
        public K last() {
            return mo36036i().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedKeySet(mo36036i().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new SortedKeySet(mo36036i().tailMap(k));
        }
    }

    static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        /* renamed from: f */
        public SortedMap<K, MapDifference.ValueDifference<V>> mo35774c() {
            return (SortedMap) super.mo35774c();
        }

        /* renamed from: g */
        public SortedMap<K, V> mo35775d() {
            return (SortedMap) super.mo35775d();
        }

        /* renamed from: h */
        public SortedMap<K, V> mo35773b() {
            return (SortedMap) super.mo35773b();
        }

        /* renamed from: i */
        public SortedMap<K, V> mo35772a() {
            return (SortedMap) super.mo35772a();
        }
    }

    static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* renamed from: a */
        final Map<K, V1> f16955a;

        /* renamed from: c */
        final EntryTransformer<? super K, ? super V1, V2> f16956c;

        TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.f16955a = (Map) Preconditions.m5392s(map);
            this.f16956c = (EntryTransformer) Preconditions.m5392s(entryTransformer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo34750a() {
            return Iterators.m27703J(this.f16955a.entrySet().iterator(), Maps.m28090e(this.f16956c));
        }

        public void clear() {
            this.f16955a.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f16955a.containsKey(obj);
        }

        public V2 get(Object obj) {
            V1 v1 = this.f16955a.get(obj);
            if (v1 != null || this.f16955a.containsKey(obj)) {
                return this.f16956c.mo35953a(obj, NullnessCasts.m28457a(v1));
            }
            return null;
        }

        public Set<K> keySet() {
            return this.f16955a.keySet();
        }

        public V2 remove(Object obj) {
            if (this.f16955a.containsKey(obj)) {
                return this.f16956c.mo35953a(obj, NullnessCasts.m28457a(this.f16955a.remove(obj)));
            }
            return null;
        }

        public int size() {
            return this.f16955a.size();
        }

        public Collection<V2> values() {
            return new Values(this);
        }
    }

    @GwtIncompatible
    private static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        /* renamed from: g */
        private Map.Entry<K, V2> m28205g(Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return Maps.m28074Q(this.f16956c, entry);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public NavigableMap<K, V1> mo36085b() {
            return (NavigableMap) super.mo36085b();
        }

        public Map.Entry<K, V2> ceilingEntry(@ParametricNullness K k) {
            return m28205g(mo36085b().ceilingEntry(k));
        }

        public K ceilingKey(@ParametricNullness K k) {
            return mo36085b().ceilingKey(k);
        }

        /* renamed from: d */
        public NavigableMap<K, V2> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        public NavigableSet<K> descendingKeySet() {
            return mo36085b().descendingKeySet();
        }

        public NavigableMap<K, V2> descendingMap() {
            return Maps.m28072O(mo36085b().descendingMap(), this.f16956c);
        }

        /* renamed from: e */
        public NavigableMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: f */
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        public Map.Entry<K, V2> firstEntry() {
            return m28205g(mo36085b().firstEntry());
        }

        public Map.Entry<K, V2> floorEntry(@ParametricNullness K k) {
            return m28205g(mo36085b().floorEntry(k));
        }

        public K floorKey(@ParametricNullness K k) {
            return mo36085b().floorKey(k);
        }

        public Map.Entry<K, V2> higherEntry(@ParametricNullness K k) {
            return m28205g(mo36085b().higherEntry(k));
        }

        public K higherKey(@ParametricNullness K k) {
            return mo36085b().higherKey(k);
        }

        public Map.Entry<K, V2> lastEntry() {
            return m28205g(mo36085b().lastEntry());
        }

        public Map.Entry<K, V2> lowerEntry(@ParametricNullness K k) {
            return m28205g(mo36085b().lowerEntry(k));
        }

        public K lowerKey(@ParametricNullness K k) {
            return mo36085b().lowerKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            return mo36085b().navigableKeySet();
        }

        public Map.Entry<K, V2> pollFirstEntry() {
            return m28205g(mo36085b().pollFirstEntry());
        }

        public Map.Entry<K, V2> pollLastEntry() {
            return m28205g(mo36085b().pollLastEntry());
        }

        public NavigableMap<K, V2> headMap(@ParametricNullness K k, boolean z) {
            return Maps.m28072O(mo36085b().headMap(k, z), this.f16956c);
        }

        public NavigableMap<K, V2> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.m28072O(mo36085b().subMap(k, z, k2, z2), this.f16956c);
        }

        public NavigableMap<K, V2> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.m28072O(mo36085b().tailMap(k, z), this.f16956c);
        }
    }

    static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public SortedMap<K, V1> mo36085b() {
            return (SortedMap) this.f16955a;
        }

        public Comparator<? super K> comparator() {
            return mo36085b().comparator();
        }

        @ParametricNullness
        public K firstKey() {
            return mo36085b().firstKey();
        }

        public SortedMap<K, V2> headMap(@ParametricNullness K k) {
            return Maps.m28073P(mo36085b().headMap(k), this.f16956c);
        }

        @ParametricNullness
        public K lastKey() {
            return mo36085b().lastKey();
        }

        public SortedMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return Maps.m28073P(mo36085b().subMap(k, k2), this.f16956c);
        }

        public SortedMap<K, V2> tailMap(@ParametricNullness K k) {
            return Maps.m28073P(mo36085b().tailMap(k), this.f16956c);
        }
    }

    private static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient Set<V> f16957a;
        final BiMap<? extends K, ? extends V> delegate;
        @RetainedWith
        BiMap<V, K> inverse;
        final Map<K, V> unmodifiableMap;

        UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, BiMap<V, K> biMap2) {
            this.unmodifiableMap = Collections.unmodifiableMap(biMap);
            this.delegate = biMap;
            this.inverse = biMap2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Map<K, V> mo22325Q() {
            return this.unmodifiableMap;
        }

        /* renamed from: x0 */
        public BiMap<V, K> mo34390x0() {
            BiMap<V, K> biMap = this.inverse;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.mo34390x0(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        public Set<V> values() {
            Set<V> set = this.f16957a;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.f16957a = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {

        /* renamed from: a */
        private final Collection<Map.Entry<K, V>> f16958a;

        UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
            this.f16958a = collection;
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Collection<Map.Entry<K, V>> mo22325Q() {
            return this.f16958a;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.m28078U(this.f16958a.iterator());
        }

        public Object[] toArray() {
            return mo35131X();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo35132Y(tArr);
        }
    }

    static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        public boolean equals(Object obj) {
            return Sets.m28719b(this, obj);
        }

        public int hashCode() {
            return Sets.m28723f(this);
        }
    }

    @GwtIncompatible
    static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: a */
        private transient UnmodifiableNavigableMap<K, V> f16959a;
        private final NavigableMap<K, ? extends V> delegate;

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public SortedMap<K, V> mo34375R() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }

        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
            return Maps.m28081X(this.delegate.ceilingEntry(k));
        }

        public K ceilingKey(@ParametricNullness K k) {
            return this.delegate.ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return Sets.m28733p(this.delegate.descendingKeySet());
        }

        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.f16959a;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.f16959a = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        public Map.Entry<K, V> firstEntry() {
            return Maps.m28081X(this.delegate.firstEntry());
        }

        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
            return Maps.m28081X(this.delegate.floorEntry(k));
        }

        public K floorKey(@ParametricNullness K k) {
            return this.delegate.floorKey(k);
        }

        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
            return Maps.m28081X(this.delegate.higherEntry(k));
        }

        public K higherKey(@ParametricNullness K k) {
            return this.delegate.higherKey(k);
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            return Maps.m28081X(this.delegate.lastEntry());
        }

        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
            return Maps.m28081X(this.delegate.lowerEntry(k));
        }

        public K lowerKey(@ParametricNullness K k) {
            return this.delegate.lowerKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            return Sets.m28733p(this.delegate.navigableKeySet());
        }

        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.m28080W(this.delegate.headMap(k, z));
        }

        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.m28080W(this.delegate.subMap(k, z, k2, z2));
        }

        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.m28080W(this.delegate.tailMap(k, z));
        }

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.f16959a = unmodifiableNavigableMap;
        }
    }

    static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        @ParametricNullness

        /* renamed from: a */
        private final V f16960a;
        @ParametricNullness

        /* renamed from: b */
        private final V f16961b;

        @ParametricNullness
        /* renamed from: a */
        public V mo35776a() {
            return this.f16960a;
        }

        @ParametricNullness
        /* renamed from: b */
        public V mo35777b() {
            return this.f16961b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            if (!Objects.m5349a(this.f16960a, valueDifference.mo35776a()) || !Objects.m5349a(this.f16961b, valueDifference.mo35777b())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f16960a, this.f16961b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f16960a);
            String valueOf2 = String.valueOf(this.f16961b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append("(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    static class Values<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: a */
        final Map<K, V> f16962a;

        Values(Map<K, V> map) {
            this.f16962a = (Map) Preconditions.m5392s(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final Map<K, V> mo36137c() {
            return this.f16962a;
        }

        public void clear() {
            mo36137c().clear();
        }

        public boolean contains(Object obj) {
            return mo36137c().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo36137c().isEmpty();
        }

        public Iterator<V> iterator() {
            return Maps.m28083Z(mo36137c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo36137c().entrySet()) {
                    if (Objects.m5349a(obj, entry.getValue())) {
                        mo36137c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.m5392s(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet h = Sets.m28725h();
                for (Map.Entry entry : mo36137c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        h.add(entry.getKey());
                    }
                }
                return mo36137c().keySet().removeAll(h);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.m5392s(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet h = Sets.m28725h();
                for (Map.Entry entry : mo36137c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        h.add(entry.getKey());
                    }
                }
                return mo36137c().keySet().retainAll(h);
            }
        }

        public int size() {
            return mo36137c().size();
        }
    }

    @GwtCompatible
    static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f16963a;

        /* renamed from: c */
        private transient Set<K> f16964c;

        /* renamed from: d */
        private transient Collection<V> f16965d;

        ViewCachingAbstractMap() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo34451a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Set<K> mo34484b() {
            return new KeySet(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo35065c() {
            return new Values(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f16963a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo34451a();
            this.f16963a = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f16964c;
            if (set != null) {
                return set;
            }
            Set<K> b = mo34484b();
            this.f16964c = b;
            return b;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f16965d;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo35065c();
            this.f16965d = c;
            return c;
        }
    }

    private Maps() {
    }

    /* renamed from: A */
    public static <K, V> HashMap<K, V> m28058A() {
        return new HashMap<>();
    }

    /* renamed from: B */
    public static <K, V> IdentityHashMap<K, V> m28059B() {
        return new IdentityHashMap<>();
    }

    /* renamed from: C */
    public static <K, V> LinkedHashMap<K, V> m28060C() {
        return new LinkedHashMap<>();
    }

    /* renamed from: D */
    public static <K, V> LinkedHashMap<K, V> m28061D(int i) {
        return new LinkedHashMap<>(m28098m(i));
    }

    /* renamed from: E */
    public static <K extends Comparable, V> TreeMap<K, V> m28062E() {
        return new TreeMap<>();
    }

    /* renamed from: F */
    static <K, V> boolean m28063F(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(m28077T((Map.Entry) obj));
    }

    /* access modifiers changed from: private */
    @GwtIncompatible
    /* renamed from: G */
    public static <E> NavigableSet<E> m28064G(final NavigableSet<E> navigableSet) {
        return new ForwardingNavigableSet<E>() {
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            public NavigableSet<E> descendingSet() {
                return Maps.m28064G(super.descendingSet());
            }

            /* access modifiers changed from: protected */
            /* renamed from: h0 */
            public NavigableSet<E> mo35219g0() {
                return navigableSet;
            }

            public SortedSet<E> headSet(@ParametricNullness E e) {
                return Maps.m28066I(super.headSet(e));
            }

            public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
                return Maps.m28066I(super.subSet(e, e2));
            }

            public SortedSet<E> tailSet(@ParametricNullness E e) {
                return Maps.m28066I(super.tailSet(e));
            }

            public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
                return Maps.m28064G(super.headSet(e, z));
            }

            public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
                return Maps.m28064G(super.subSet(e, z, e2, z2));
            }

            public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
                return Maps.m28064G(super.tailSet(e, z));
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static <E> Set<E> m28065H(final Set<E> set) {
        return new ForwardingSet<E>() {
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b0 */
            public Set<E> mo34397R() {
                return set;
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static <E> SortedSet<E> m28066I(final SortedSet<E> sortedSet) {
        return new ForwardingSortedSet<E>() {
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            /* access modifiers changed from: protected */
            /* renamed from: g0 */
            public SortedSet<E> mo34398b0() {
                return sortedSet;
            }

            public SortedSet<E> headSet(@ParametricNullness E e) {
                return Maps.m28066I(super.headSet(e));
            }

            public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
                return Maps.m28066I(super.subSet(e, e2));
            }

            public SortedSet<E> tailSet(@ParametricNullness E e) {
                return Maps.m28066I(super.tailSet(e));
            }
        };
    }

    /* renamed from: J */
    static boolean m28067J(Map<?, ?> map, Object obj) {
        Preconditions.m5392s(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: K */
    static <V> V m28068K(Map<?, V> map, Object obj) {
        Preconditions.m5392s(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: L */
    static <V> V m28069L(Map<?, V> map, Object obj) {
        Preconditions.m5392s(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: M */
    static String m28070M(Map<?, ?> map) {
        StringBuilder f = Collections2.m26544f(map.size());
        f.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                f.append(", ");
            }
            z = false;
            f.append(next.getKey());
            f.append('=');
            f.append(next.getValue());
        }
        f.append('}');
        return f.toString();
    }

    /* renamed from: N */
    public static <K, V1, V2> Map<K, V2> m28071N(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    @GwtIncompatible
    /* renamed from: O */
    public static <K, V1, V2> NavigableMap<K, V2> m28072O(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    /* renamed from: P */
    public static <K, V1, V2> SortedMap<K, V2> m28073P(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    /* renamed from: Q */
    static <V2, K, V1> Map.Entry<K, V2> m28074Q(final EntryTransformer<? super K, ? super V1, V2> entryTransformer, final Map.Entry<K, V1> entry) {
        Preconditions.m5392s(entryTransformer);
        Preconditions.m5392s(entry);
        return new AbstractMapEntry<K, V2>() {
            @ParametricNullness
            public K getKey() {
                return entry.getKey();
            }

            @ParametricNullness
            public V2 getValue() {
                return entryTransformer.mo35953a(entry.getKey(), entry.getValue());
            }
        };
    }

    /* renamed from: R */
    public static <K, V1, V2> Map<K, V2> m28075R(Map<K, V1> map, Function<? super V1, V2> function) {
        return m28071N(map, m28092g(function));
    }

    /* renamed from: S */
    public static <K, V1, V2> SortedMap<K, V2> m28076S(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
        return m28073P(sortedMap, m28092g(function));
    }

    /* renamed from: T */
    static <K, V> Map.Entry<K, V> m28077T(final Map.Entry<? extends K, ? extends V> entry) {
        Preconditions.m5392s(entry);
        return new AbstractMapEntry<K, V>() {
            @ParametricNullness
            public K getKey() {
                return entry.getKey();
            }

            @ParametricNullness
            public V getValue() {
                return entry.getValue();
            }
        };
    }

    /* renamed from: U */
    static <K, V> UnmodifiableIterator<Map.Entry<K, V>> m28078U(final Iterator<Map.Entry<K, V>> it) {
        return new UnmodifiableIterator<Map.Entry<K, V>>() {
            /* renamed from: a */
            public Map.Entry<K, V> next() {
                return Maps.m28077T((Map.Entry) it.next());
            }

            public boolean hasNext() {
                return it.hasNext();
            }
        };
    }

    /* renamed from: V */
    static <K, V> Set<Map.Entry<K, V>> m28079V(Set<Map.Entry<K, V>> set) {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    @GwtIncompatible
    /* renamed from: W */
    public static <K, V> NavigableMap<K, V> m28080W(NavigableMap<K, ? extends V> navigableMap) {
        Preconditions.m5392s(navigableMap);
        if (navigableMap instanceof UnmodifiableNavigableMap) {
            return navigableMap;
        }
        return new UnmodifiableNavigableMap(navigableMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static <K, V> Map.Entry<K, V> m28081X(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return m28077T(entry);
    }

    /* renamed from: Y */
    static <V> Function<Map.Entry<?, V>, V> m28082Y() {
        return EntryFunction.VALUE;
    }

    /* renamed from: Z */
    static <K, V> Iterator<V> m28083Z(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, V>(it) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public V mo34726a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: a0 */
    static <V> V m28085a0(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: b0 */
    static <V> Predicate<Map.Entry<?, V>> m28087b0(Predicate<? super V> predicate) {
        return Predicates.m5404e(predicate, m28082Y());
    }

    /* renamed from: e */
    static <K, V1, V2> Function<Map.Entry<K, V1>, Map.Entry<K, V2>> m28090e(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.m5392s(entryTransformer);
        return new Function<Map.Entry<K, V1>, Map.Entry<K, V2>>() {
            /* renamed from: a */
            public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
                return Maps.m28074Q(EntryTransformer.this, entry);
            }
        };
    }

    /* renamed from: f */
    static <K, V1, V2> Function<Map.Entry<K, V1>, V2> m28091f(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.m5392s(entryTransformer);
        return new Function<Map.Entry<K, V1>, V2>() {
            @ParametricNullness
            /* renamed from: a */
            public V2 apply(Map.Entry<K, V1> entry) {
                return EntryTransformer.this.mo35953a(entry.getKey(), entry.getValue());
            }
        };
    }

    /* renamed from: g */
    static <K, V1, V2> EntryTransformer<K, V1, V2> m28092g(final Function<? super V1, V2> function) {
        Preconditions.m5392s(function);
        return new EntryTransformer<K, V1, V2>() {
            @ParametricNullness
            /* renamed from: a */
            public V2 mo35953a(@ParametricNullness K k, @ParametricNullness V1 v1) {
                return Function.this.apply(v1);
            }
        };
    }

    /* renamed from: h */
    public static <K, V> Map<K, V> m28093h(Set<K> set, Function<? super K, V> function) {
        return new AsMapView(set, function);
    }

    @GwtIncompatible
    /* renamed from: i */
    public static <K, V> NavigableMap<K, V> m28094i(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        return new NavigableAsMapView(navigableSet, function);
    }

    /* renamed from: j */
    public static <K, V> SortedMap<K, V> m28095j(SortedSet<K> sortedSet, Function<? super K, V> function) {
        return new SortedAsMapView(sortedSet, function);
    }

    /* renamed from: k */
    static <K, V> Iterator<Map.Entry<K, V>> m28096k(Set<K> set, final Function<? super K, V> function) {
        return new TransformedIterator<K, Map.Entry<K, V>>(set.iterator()) {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> mo34726a(@ParametricNullness K k) {
                return Maps.m28105t(k, function.apply(k));
            }
        };
    }

    /* renamed from: l */
    static <K, V1, V2> Function<V1, V2> m28097l(final EntryTransformer<? super K, V1, V2> entryTransformer, @ParametricNullness final K k) {
        Preconditions.m5392s(entryTransformer);
        return new Function<V1, V2>() {
            @ParametricNullness
            public V2 apply(@ParametricNullness V1 v1) {
                return EntryTransformer.this.mo35953a(k, v1);
            }
        };
    }

    /* renamed from: m */
    static int m28098m(int i) {
        if (i < 3) {
            CollectPreconditions.m26535b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: n */
    static <K, V> boolean m28099n(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(m28077T((Map.Entry) obj));
    }

    /* renamed from: o */
    static boolean m28100o(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @GwtIncompatible
    /* renamed from: p */
    public static <K, V> NavigableMap<K, V> m28101p(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.m5392s(predicate);
        if (navigableMap instanceof FilteredEntryNavigableMap) {
            return m28103r((FilteredEntryNavigableMap) navigableMap, predicate);
        }
        return new FilteredEntryNavigableMap((NavigableMap) Preconditions.m5392s(navigableMap), predicate);
    }

    /* renamed from: q */
    private static <K, V> Map<K, V> m28102q(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryMap(abstractFilteredMap.f16919f, Predicates.m5402c(abstractFilteredMap.f16920g, predicate));
    }

    @GwtIncompatible
    /* renamed from: r */
    private static <K, V> NavigableMap<K, V> m28103r(FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.f16939a, Predicates.m5402c(filteredEntryNavigableMap.f16940c, predicate));
    }

    /* renamed from: s */
    public static <K, V> Map<K, V> m28104s(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.m5392s(predicate);
        Predicate<Map.Entry<K, ?>> y = m28110y(predicate);
        if (map instanceof AbstractFilteredMap) {
            return m28102q((AbstractFilteredMap) map, y);
        }
        return new FilteredKeyMap((Map) Preconditions.m5392s(map), predicate, y);
    }

    @GwtCompatible
    /* renamed from: t */
    public static <K, V> Map.Entry<K, V> m28105t(@ParametricNullness K k, @ParametricNullness V v) {
        return new ImmutableEntry(k, v);
    }

    /* renamed from: u */
    static <E> ImmutableMap<E, Integer> m28106u(Collection<E> collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (E g : collection) {
            builder.mo35338g(g, Integer.valueOf(i));
            i++;
        }
        return builder.mo35337d();
    }

    /* renamed from: v */
    static <K> Function<Map.Entry<K, ?>, K> m28107v() {
        return EntryFunction.KEY;
    }

    /* renamed from: w */
    static <K, V> Iterator<K> m28108w(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, K>(it) {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public K mo34726a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    /* renamed from: x */
    static <K> K m28109x(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: y */
    static <K> Predicate<Map.Entry<K, ?>> m28110y(Predicate<? super K> predicate) {
        return Predicates.m5404e(predicate, m28107v());
    }

    /* renamed from: z */
    public static <K, V> ConcurrentMap<K, V> m28111z() {
        return new ConcurrentHashMap();
    }
}
