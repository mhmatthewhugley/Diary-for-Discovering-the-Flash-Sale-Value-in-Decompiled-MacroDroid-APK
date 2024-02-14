package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Multimaps {

    static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        /* access modifiers changed from: private */
        @Weak

        /* renamed from: f */
        public final Multimap<K, V> f16987f;

        class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            EntrySet() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Map<K, Collection<V>> mo34465i() {
                return AsMap.this;
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.m28096k(AsMap.this.f16987f.keySet(), new Function<K, Collection<V>>() {
                    /* renamed from: a */
                    public Collection<V> apply(@ParametricNullness K k) {
                        return AsMap.this.f16987f.get(k);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.mo36180g(entry.getKey());
                return true;
            }
        }

        AsMap(Multimap<K, V> multimap) {
            this.f16987f = (Multimap) Preconditions.m5392s(multimap);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo34451a() {
            return new EntrySet();
        }

        public void clear() {
            this.f16987f.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f16987f.containsKey(obj);
        }

        /* renamed from: e */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f16987f.get(obj);
            }
            return null;
        }

        /* renamed from: f */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f16987f.mo34426d(obj);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36180g(Object obj) {
            this.f16987f.keySet().remove(obj);
        }

        public boolean isEmpty() {
            return this.f16987f.isEmpty();
        }

        public Set<K> keySet() {
            return this.f16987f.keySet();
        }

        public int size() {
            return this.f16987f.keySet().size();
        }
    }

    private static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        /* renamed from: s */
        transient Supplier<? extends List<V>> f16990s;

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f16990s = (Supplier) objectInputStream.readObject();
            mo34434F((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f16990s);
            objectOutputStream.writeObject(mo34447x());
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public List<V> mo34431y() {
            return (List) this.f16990s.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V>> mo34436a() {
            return mo34432A();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return mo34433B();
        }
    }

    private static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        /* renamed from: s */
        transient Supplier<? extends Collection<V>> f16991s;

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f16991s = (Supplier) objectInputStream.readObject();
            mo34434F((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f16991s);
            objectOutputStream.writeObject(mo34447x());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public <E> Collection<E> mo34422G(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m28733p((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            if (collection instanceof List) {
                return Collections.unmodifiableList((List) collection);
            }
            return Collections.unmodifiableCollection(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
            if (collection instanceof List) {
                return mo34435I(k, (List) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
            }
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.WrappedSortedSet(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
            }
            if (collection instanceof Set) {
                return new AbstractMapBasedMultimap.WrappedSet(k, (Set) collection);
            }
            return new AbstractMapBasedMultimap.WrappedCollection(k, collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V>> mo34436a() {
            return mo34432A();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return mo34433B();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<V> mo34431y() {
            return (Collection) this.f16991s.get();
        }
    }

    private static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        /* renamed from: s */
        transient Supplier<? extends Set<V>> f16992s;

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f16992s = (Supplier) objectInputStream.readObject();
            mo34434F((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f16992s);
            objectOutputStream.writeObject(mo34447x());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public <E> Collection<E> mo34422G(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m28733p((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public Collection<V> mo34423H(@ParametricNullness K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.WrappedSortedSet(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.WrappedCollection) null);
            }
            return new AbstractMapBasedMultimap.WrappedSet(k, (Set) collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public Set<V> mo34431y() {
            return (Set) this.f16992s.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V>> mo34436a() {
            return mo34432A();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return mo34433B();
        }
    }

    private static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        /* renamed from: s */
        transient Supplier<? extends SortedSet<V>> f16993s;

        /* renamed from: z */
        transient Comparator<? super V> f16994z;

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Supplier<? extends SortedSet<V>> supplier = (Supplier) objectInputStream.readObject();
            this.f16993s = supplier;
            this.f16994z = ((SortedSet) supplier.get()).comparator();
            mo34434F((Map) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f16993s);
            objectOutputStream.writeObject(mo34447x());
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public SortedSet<V> mo34431y() {
            return (SortedSet) this.f16993s.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V>> mo34436a() {
            return mo34432A();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return mo34433B();
        }
    }

    static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        Entries() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Multimap<K, V> mo34634c();

        public void clear() {
            mo34634c().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo34634c().mo34625P(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo34634c().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo34634c().size();
        }
    }

    static class Keys<K, V> extends AbstractMultiset<K> {
        @Weak

        /* renamed from: d */
        final Multimap<K, V> f16995d;

        Keys(Multimap<K, V> multimap) {
            this.f16995d = multimap;
        }

        /* renamed from: C */
        public Set<K> mo34642C() {
            return this.f16995d.keySet();
        }

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            Collection collection = (Collection) Maps.m28068K(this.f16995d.mo34430w(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public void clear() {
            this.f16995d.clear();
        }

        public boolean contains(Object obj) {
            return this.f16995d.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo34604f() {
            return this.f16995d.mo34430w().size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Iterator<K> mo34605h() {
            throw new AssertionError("should never be called");
        }

        /* renamed from: h1 */
        public int mo34606h1(Object obj, int i) {
            CollectPreconditions.m26535b(i, "occurrences");
            if (i == 0) {
                return mo34601J1(obj);
            }
            Collection collection = (Collection) Maps.m28068K(this.f16995d.mo34430w(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Iterator<Multiset.Entry<K>> mo34607i() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>>(this, this.f16995d.mo34430w().entrySet().iterator()) {
                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public Multiset.Entry<K> mo34726a(final Map.Entry<K, Collection<V>> entry) {
                    return new Multisets.AbstractEntry<K>(this) {
                        @ParametricNullness
                        /* renamed from: b */
                        public K mo35049b() {
                            return entry.getKey();
                        }

                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        public Iterator<K> iterator() {
            return Maps.m28108w(this.f16995d.mo34445i().iterator());
        }

        public int size() {
            return this.f16995d.size();
        }
    }

    private static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final Map<K, V> map;

        /* renamed from: P */
        public boolean mo34625P(Object obj, Object obj2) {
            return this.map.entrySet().contains(Maps.m28105t(obj, obj2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V>> mo34436a() {
            return new AsMap(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<Map.Entry<K, V>> mo34437b() {
            throw new AssertionError("unreachable");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return this.map.keySet();
        }

        public void clear() {
            this.map.clear();
        }

        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Multiset<K> mo34441e() {
            return new Keys(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<V> mo34442f() {
            return this.map.values();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Iterator<Map.Entry<K, V>> mo34443g() {
            return this.map.entrySet().iterator();
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(Maps.m28105t(obj, obj2));
        }

        public int size() {
            return this.map.size();
        }

        /* renamed from: d */
        public Set<V> m28319d(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        public Set<V> get(@ParametricNullness final K k) {
            return new Sets.ImprovedAbstractSet<V>() {
                public Iterator<V> iterator() {
                    return new Iterator<V>() {

                        /* renamed from: a */
                        int f16999a;

                        public boolean hasNext() {
                            if (this.f16999a == 0) {
                                C70521 r0 = C70521.this;
                                if (MapMultimap.this.map.containsKey(k)) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @ParametricNullness
                        public V next() {
                            if (hasNext()) {
                                this.f16999a++;
                                C70521 r0 = C70521.this;
                                return NullnessCasts.m28457a(MapMultimap.this.map.get(k));
                            }
                            throw new NoSuchElementException();
                        }

                        public void remove() {
                            boolean z = true;
                            if (this.f16999a != 1) {
                                z = false;
                            }
                            CollectPreconditions.m26538e(z);
                            this.f16999a = -1;
                            C70521 r0 = C70521.this;
                            MapMultimap.this.map.remove(k);
                        }
                    };
                }

                public int size() {
                    return MapMultimap.this.map.containsKey(k) ? 1 : 0;
                }
            };
        }

        /* renamed from: i */
        public Set<Map.Entry<K, V>> m28324i() {
            return this.map.entrySet();
        }
    }

    private static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        TransformedEntriesListMultimap(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public List<V2> mo36198l(@ParametricNullness K k, Collection<V1> collection) {
            return Lists.m27838n((List) collection, Maps.m28097l(this.f17002p, k));
        }

        /* renamed from: d */
        public List<V2> m28326d(Object obj) {
            return mo36198l(obj, this.f17001o.mo34426d(obj));
        }

        public List<V2> get(@ParametricNullness K k) {
            return mo36198l(k, this.f17001o.get(k));
        }
    }

    private static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {

        /* renamed from: o */
        final Multimap<K, V1> f17001o;

        /* renamed from: p */
        final Maps.EntryTransformer<? super K, ? super V1, V2> f17002p;

        TransformedEntriesMultimap(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.f17001o = (Multimap) Preconditions.m5392s(multimap);
            this.f17002p = (Maps.EntryTransformer) Preconditions.m5392s(entryTransformer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<K, Collection<V2>> mo34436a() {
            return Maps.m28071N(this.f17001o.mo34430w(), new Maps.EntryTransformer<K, Collection<V1>, Collection<V2>>() {
                /* renamed from: b */
                public Collection<V2> mo35953a(@ParametricNullness K k, Collection<V1> collection) {
                    return TransformedEntriesMultimap.this.mo36198l(k, collection);
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<Map.Entry<K, V2>> mo34437b() {
            return new AbstractMultimap.Entries();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Set<K> mo34438c() {
            return this.f17001o.keySet();
        }

        public void clear() {
            this.f17001o.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f17001o.containsKey(obj);
        }

        /* renamed from: d */
        public Collection<V2> mo34426d(Object obj) {
            return mo36198l(obj, this.f17001o.mo34426d(obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Multiset<K> mo34441e() {
            return this.f17001o.mo34630k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<V2> mo34442f() {
            return Collections2.m26548j(this.f17001o.mo34445i(), Maps.m28091f(this.f17002p));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Iterator<Map.Entry<K, V2>> mo34443g() {
            return Iterators.m27703J(this.f17001o.mo34445i().iterator(), Maps.m28090e(this.f17002p));
        }

        public Collection<V2> get(@ParametricNullness K k) {
            return mo36198l(k, this.f17001o.get(k));
        }

        public boolean isEmpty() {
            return this.f17001o.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Collection<V2> mo36198l(@ParametricNullness K k, Collection<V1> collection) {
            Function<? super V1, V2> l = Maps.m28097l(this.f17002p, k);
            if (collection instanceof List) {
                return Lists.m27838n((List) collection, l);
            }
            return Collections2.m26548j(collection, l);
        }

        public boolean put(@ParametricNullness K k, @ParametricNullness V2 v2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        public int size() {
            return this.f17001o.size();
        }
    }

    private static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: T */
        public ListMultimap<K, V> mo35176R() {
            return (ListMultimap) super.mo22325Q();
        }

        /* renamed from: d */
        public List<V> m28343d(Object obj) {
            throw new UnsupportedOperationException();
        }

        public List<V> get(@ParametricNullness K k) {
            return Collections.unmodifiableList(mo35176R().get(k));
        }
    }

    private static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        @LazyInit

        /* renamed from: a */
        transient Collection<Map.Entry<K, V>> f17004a;
        @LazyInit

        /* renamed from: c */
        transient Multiset<K> f17005c;
        @LazyInit

        /* renamed from: d */
        transient Set<K> f17006d;
        final Multimap<K, V> delegate;
        @LazyInit

        /* renamed from: f */
        transient Map<K, Collection<V>> f17007f;

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Multimap<K, V> mo22325Q() {
            return this.delegate;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public Collection<V> mo34426d(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> get(@ParametricNullness K k) {
            return Multimaps.m28276g(this.delegate.get(k));
        }

        /* renamed from: i */
        public Collection<Map.Entry<K, V>> mo34445i() {
            Collection<Map.Entry<K, V>> collection = this.f17004a;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> b = Multimaps.m28275f(this.delegate.mo34445i());
            this.f17004a = b;
            return b;
        }

        /* renamed from: k */
        public Multiset<K> mo34630k() {
            Multiset<K> multiset = this.f17005c;
            if (multiset != null) {
                return multiset;
            }
            Multiset<K> p = Multisets.m28387p(this.delegate.mo34630k());
            this.f17005c = p;
            return p;
        }

        public Set<K> keySet() {
            Set<K> set = this.f17006d;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.f17006d = unmodifiableSet;
            return unmodifiableSet;
        }

        public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: w */
        public Map<K, Collection<V>> mo34430w() {
            Map<K, Collection<V>> map = this.f17007f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(Maps.m28075R(this.delegate.mo34430w(), new Function<Collection<V>, Collection<V>>(this) {
                /* renamed from: a */
                public Collection<V> apply(Collection<V> collection) {
                    return Multimaps.m28276g(collection);
                }
            }));
            this.f17007f = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    private static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: T */
        public SetMultimap<K, V> mo35176R() {
            return (SetMultimap) super.mo22325Q();
        }

        /* renamed from: d */
        public Set<V> m28355d(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set<V> get(@ParametricNullness K k) {
            return Collections.unmodifiableSet(mo35176R().get(k));
        }

        /* renamed from: i */
        public Set<Map.Entry<K, V>> m28357i() {
            return Maps.m28079V(mo35176R().mo34445i());
        }
    }

    private Multimaps() {
    }

    /* renamed from: c */
    static boolean m28272c(Multimap<?, ?> multimap, Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.mo34430w().equals(((Multimap) obj).mo34430w());
        }
        return false;
    }

    /* renamed from: d */
    public static <K, V1, V2> ListMultimap<K, V2> m28273d(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    /* renamed from: e */
    public static <K, V1, V2> ListMultimap<K, V2> m28274e(ListMultimap<K, V1> listMultimap, Function<? super V1, V2> function) {
        Preconditions.m5392s(function);
        return m28273d(listMultimap, Maps.m28092g(function));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static <K, V> Collection<Map.Entry<K, V>> m28275f(Collection<Map.Entry<K, V>> collection) {
        if (collection instanceof Set) {
            return Maps.m28079V((Set) collection);
        }
        return new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static <V> Collection<V> m28276g(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    private static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: V */
        public SortedSetMultimap<K, V> mo36203T() {
            return (SortedSetMultimap) super.mo35176R();
        }

        /* renamed from: d */
        public SortedSet<V> m28364d(Object obj) {
            throw new UnsupportedOperationException();
        }

        public SortedSet<V> get(@ParametricNullness K k) {
            return Collections.unmodifiableSortedSet(mo36203T().get(k));
        }
    }
}
