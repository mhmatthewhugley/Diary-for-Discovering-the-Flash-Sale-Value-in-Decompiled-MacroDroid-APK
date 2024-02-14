package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* renamed from: o */
    final Multimap<K, V> f16577o;

    /* renamed from: p */
    final Predicate<? super Map.Entry<K, V>> f16578p;

    class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        AsMap() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo34451a() {
            return new Maps.EntrySet<K, Collection<V>>() {
                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public Map<K, Collection<V>> mo34465i() {
                    return AsMap.this;
                }

                public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                    return new AbstractIterator<Map.Entry<K, Collection<V>>>() {

                        /* renamed from: d */
                        final Iterator<Map.Entry<K, Collection<V>>> f16581d;

                        {
                            this.f16581d = FilteredEntryMultimap.this.f16577o.mo34430w().entrySet().iterator();
                        }

                        /* access modifiers changed from: protected */
                        /* renamed from: d */
                        public Map.Entry<K, Collection<V>> mo34417a() {
                            while (this.f16581d.hasNext()) {
                                Map.Entry next = this.f16581d.next();
                                Object key = next.getKey();
                                Collection m = FilteredEntryMultimap.m26971m((Collection) next.getValue(), new ValuePredicate(key));
                                if (!m.isEmpty()) {
                                    return Maps.m28105t(key, m);
                                }
                            }
                            return (Map.Entry) mo34418b();
                        }
                    };
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Predicates.m5406g(collection));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Predicates.m5409j(Predicates.m5406g(collection)));
                }

                public int size() {
                    return Iterators.m27701H(iterator());
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Set<K> mo34484b() {
            return new Maps.KeySet<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    return AsMap.this.remove(obj) != null;
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Maps.m28110y(Predicates.m5406g(collection)));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Maps.m28110y(Predicates.m5409j(Predicates.m5406g(collection))));
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<Collection<V>> mo35065c() {
            return new Maps.Values<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    Collection collection = (Collection) obj;
                    Iterator<Map.Entry<K, Collection<V>>> it = FilteredEntryMultimap.this.f16577o.mo34430w().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        Collection m = FilteredEntryMultimap.m26971m((Collection) next.getValue(), new ValuePredicate(next.getKey()));
                        if (!m.isEmpty() && collection.equals(m)) {
                            if (m.size() == ((Collection) next.getValue()).size()) {
                                it.remove();
                                return true;
                            }
                            m.clear();
                            return true;
                        }
                    }
                    return false;
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Maps.m28087b0(Predicates.m5406g(collection)));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.mo35062p(Maps.m28087b0(Predicates.m5409j(Predicates.m5406g(collection))));
                }
            };
        }

        public void clear() {
            FilteredEntryMultimap.this.clear();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = FilteredEntryMultimap.this.f16577o.mo34430w().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> m = FilteredEntryMultimap.m26971m(collection, new ValuePredicate(obj));
            if (m.isEmpty()) {
                return null;
            }
            return m;
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection collection = FilteredEntryMultimap.this.f16577o.mo34430w().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList h = Lists.m27832h();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (FilteredEntryMultimap.this.m26972q(obj, next)) {
                    it.remove();
                    h.add(next);
                }
            }
            if (h.isEmpty()) {
                return null;
            }
            if (FilteredEntryMultimap.this.f16577o instanceof SetMultimap) {
                return Collections.unmodifiableSet(Sets.m28729l(h));
            }
            return Collections.unmodifiableList(h);
        }
    }

    class Keys extends Multimaps.Keys<K, V> {
        Keys() {
            super(FilteredEntryMultimap.this);
        }

        public Set<Multiset.Entry<K>> entrySet() {
            return new Multisets.EntrySet<K>() {
                /* renamed from: l */
                private boolean m26995l(Predicate<? super Multiset.Entry<K>> predicate) {
                    return FilteredEntryMultimap.this.mo35062p(new C7144a(predicate));
                }

                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public Multiset<K> mo34658i() {
                    return Keys.this;
                }

                public Iterator<Multiset.Entry<K>> iterator() {
                    return Keys.this.mo34607i();
                }

                public boolean removeAll(Collection<?> collection) {
                    return m26995l(Predicates.m5406g(collection));
                }

                public boolean retainAll(Collection<?> collection) {
                    return m26995l(Predicates.m5409j(Predicates.m5406g(collection)));
                }

                public int size() {
                    return FilteredEntryMultimap.this.keySet().size();
                }
            };
        }

        /* renamed from: h1 */
        public int mo34606h1(Object obj, int i) {
            CollectPreconditions.m26535b(i, "occurrences");
            if (i == 0) {
                return mo34601J1(obj);
            }
            Collection collection = FilteredEntryMultimap.this.f16577o.mo34430w().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (FilteredEntryMultimap.this.m26972q(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }
    }

    final class ValuePredicate implements Predicate<V> {
        @ParametricNullness

        /* renamed from: a */
        private final K f16587a;

        ValuePredicate(@ParametricNullness K k) {
            this.f16587a = k;
        }

        public boolean apply(@ParametricNullness V v) {
            return FilteredEntryMultimap.this.m26972q(this.f16587a, v);
        }
    }

    /* renamed from: m */
    static <E> Collection<E> m26971m(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof Set) {
            return Sets.m28721d((Set) collection, predicate);
        }
        return Collections2.m26542d(collection, predicate);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public boolean m26972q(@ParametricNullness K k, @ParametricNullness V v) {
        return this.f16578p.apply(Maps.m28105t(k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        return new AsMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo34437b() {
        return m26971m(this.f16577o.mo34445i(), this.f16578p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        return mo34430w().keySet();
    }

    public void clear() {
        mo34445i().clear();
    }

    public boolean containsKey(Object obj) {
        return mo34430w().get(obj) != null;
    }

    /* renamed from: d */
    public Collection<V> mo34426d(Object obj) {
        return (Collection) MoreObjects.m5332a((Collection) mo34430w().remove(obj), mo35063r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Multiset<K> mo34441e() {
        return new Keys();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<V> mo34442f() {
        return new FilteredMultimapValues(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<K, V>> mo34443g() {
        throw new AssertionError("should never be called");
    }

    public Collection<V> get(@ParametricNullness K k) {
        return m26971m(this.f16577o.get(k), new ValuePredicate(k));
    }

    /* renamed from: n */
    public Predicate<? super Map.Entry<K, V>> mo35061n() {
        return this.f16578p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo35062p(Predicate<? super Map.Entry<K, Collection<V>>> predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f16577o.mo34430w().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object key = next.getKey();
            Collection m = m26971m((Collection) next.getValue(), new ValuePredicate(key));
            if (!m.isEmpty() && predicate.apply(Maps.m28105t(key, m))) {
                if (m.size() == ((Collection) next.getValue()).size()) {
                    it.remove();
                } else {
                    m.clear();
                }
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Collection<V> mo35063r() {
        if (this.f16577o instanceof SetMultimap) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    public int size() {
        return mo34445i().size();
    }

    /* renamed from: t */
    public Multimap<K, V> mo35064t() {
        return this.f16577o;
    }
}
