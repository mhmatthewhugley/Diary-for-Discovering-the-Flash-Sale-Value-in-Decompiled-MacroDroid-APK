package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Synchronized {

    private static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        transient Set<Map.Entry<K, Collection<V>>> f17200f;

        /* renamed from: g */
        transient Collection<Collection<V>> f17201g;

        SynchronizedAsMap(Map<K, Collection<V>> map, Object obj) {
            super(map, obj);
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.mutex) {
                if (this.f17200f == null) {
                    this.f17200f = new SynchronizedAsMapEntries(mo36521f().entrySet(), this.mutex);
                }
                set = this.f17200f;
            }
            return set;
        }

        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.mutex) {
                if (this.f17201g == null) {
                    this.f17201g = new SynchronizedAsMapValues(mo36521f().values(), this.mutex);
                }
                collection = this.f17201g;
            }
            return collection;
        }

        public Collection<V> get(Object obj) {
            Collection<V> collection;
            synchronized (this.mutex) {
                Collection collection2 = (Collection) super.get(obj);
                if (collection2 == null) {
                    collection = null;
                } else {
                    collection = Synchronized.m28886q(collection2, this.mutex);
                }
            }
            return collection;
        }
    }

    private static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapValues(Collection<Collection<V>> collection, Object obj) {
            super(collection, obj);
        }

        public Iterator<Collection<V>> iterator() {
            return new TransformedIterator<Collection<V>, Collection<V>>(super.iterator()) {
                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public Collection<V> mo34726a(Collection<V> collection) {
                    return Synchronized.m28886q(collection, SynchronizedAsMapValues.this.mutex);
                }
            };
        }
    }

    @VisibleForTesting
    static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private transient Set<V> f17206f;
        @RetainedWith

        /* renamed from: g */
        private transient BiMap<V, K> f17207g;

        private SynchronizedBiMap(BiMap<K, V> biMap, Object obj, BiMap<V, K> biMap2) {
            super(biMap, obj);
            this.f17207g = biMap2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public BiMap<K, V> mo36521f() {
            return (BiMap) super.mo36521f();
        }

        /* renamed from: x0 */
        public BiMap<V, K> mo34390x0() {
            BiMap<V, K> biMap;
            synchronized (this.mutex) {
                if (this.f17207g == null) {
                    this.f17207g = new SynchronizedBiMap(mo36521f().mo34390x0(), this.mutex, this);
                }
                biMap = this.f17207g;
            }
            return biMap;
        }

        public Set<V> values() {
            Set<V> set;
            synchronized (this.mutex) {
                if (this.f17206f == null) {
                    this.f17206f = Synchronized.m28883n(mo36521f().values(), this.mutex);
                }
                set = this.f17206f;
            }
            return set;
        }
    }

    @VisibleForTesting
    static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        public boolean add(E e) {
            boolean add;
            synchronized (this.mutex) {
                add = mo36526f().add(e);
            }
            return add;
        }

        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = mo36526f().addAll(collection);
            }
            return addAll;
        }

        public void clear() {
            synchronized (this.mutex) {
                mo36526f().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.mutex) {
                contains = mo36526f().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.mutex) {
                containsAll = mo36526f().containsAll(collection);
            }
            return containsAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<E> mo36526f() {
            return (Collection) super.mo36620c();
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = mo36526f().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return mo36526f().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.mutex) {
                remove = mo36526f().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.mutex) {
                removeAll = mo36526f().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.mutex) {
                retainAll = mo36526f().retainAll(collection);
            }
            return retainAll;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = mo36526f().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.mutex) {
                array = mo36526f().toArray();
            }
            return array;
        }

        private SynchronizedCollection(Collection<E> collection, Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] array;
            synchronized (this.mutex) {
                array = mo36526f().toArray(tArr);
            }
            return array;
        }
    }

    private static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public void addFirst(E e) {
            synchronized (this.mutex) {
                mo36534h().addFirst(e);
            }
        }

        public void addLast(E e) {
            synchronized (this.mutex) {
                mo36534h().addLast(e);
            }
        }

        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.mutex) {
                descendingIterator = mo36534h().descendingIterator();
            }
            return descendingIterator;
        }

        public E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = mo36534h().getFirst();
            }
            return first;
        }

        public E getLast() {
            E last;
            synchronized (this.mutex) {
                last = mo36534h().getLast();
            }
            return last;
        }

        public boolean offerFirst(E e) {
            boolean offerFirst;
            synchronized (this.mutex) {
                offerFirst = mo36534h().offerFirst(e);
            }
            return offerFirst;
        }

        public boolean offerLast(E e) {
            boolean offerLast;
            synchronized (this.mutex) {
                offerLast = mo36534h().offerLast(e);
            }
            return offerLast;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public Deque<E> mo36534h() {
            return (Deque) super.mo36526f();
        }

        public E peekFirst() {
            E peekFirst;
            synchronized (this.mutex) {
                peekFirst = mo36534h().peekFirst();
            }
            return peekFirst;
        }

        public E peekLast() {
            E peekLast;
            synchronized (this.mutex) {
                peekLast = mo36534h().peekLast();
            }
            return peekLast;
        }

        public E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = mo36534h().pollFirst();
            }
            return pollFirst;
        }

        public E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = mo36534h().pollLast();
            }
            return pollLast;
        }

        public E pop() {
            E pop;
            synchronized (this.mutex) {
                pop = mo36534h().pop();
            }
            return pop;
        }

        public void push(E e) {
            synchronized (this.mutex) {
                mo36534h().push(e);
            }
        }

        public E removeFirst() {
            E removeFirst;
            synchronized (this.mutex) {
                removeFirst = mo36534h().removeFirst();
            }
            return removeFirst;
        }

        public boolean removeFirstOccurrence(Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.mutex) {
                removeFirstOccurrence = mo36534h().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        public E removeLast() {
            E removeLast;
            synchronized (this.mutex) {
                removeLast = mo36534h().removeLast();
            }
            return removeLast;
        }

        public boolean removeLastOccurrence(Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.mutex) {
                removeLastOccurrence = mo36534h().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }
    }

    @GwtIncompatible
    private static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(Map.Entry<K, V> entry, Object obj) {
            super(entry, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            synchronized (this.mutex) {
                equals = mo36549f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map.Entry<K, V> mo36549f() {
            return (Map.Entry) super.mo36620c();
        }

        public K getKey() {
            K key;
            synchronized (this.mutex) {
                key = mo36549f().getKey();
            }
            return key;
        }

        public V getValue() {
            V value;
            synchronized (this.mutex) {
                value = mo36549f().getValue();
            }
            return value;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36549f().hashCode();
            }
            return hashCode;
        }

        public V setValue(V v) {
            V value;
            synchronized (this.mutex) {
                value = mo36549f().setValue(v);
            }
            return value;
        }
    }

    private static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(List<E> list, Object obj) {
            super(list, obj);
        }

        public void add(int i, E e) {
            synchronized (this.mutex) {
                mo36526f().add(i, e);
            }
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = mo36526f().addAll(i, collection);
            }
            return addAll;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36526f().equals(obj);
            }
            return equals;
        }

        public E get(int i) {
            E e;
            synchronized (this.mutex) {
                e = mo36526f().get(i);
            }
            return e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public List<E> mo36526f() {
            return (List) super.mo36526f();
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36526f().hashCode();
            }
            return hashCode;
        }

        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.mutex) {
                indexOf = mo36526f().indexOf(obj);
            }
            return indexOf;
        }

        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.mutex) {
                lastIndexOf = mo36526f().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        public ListIterator<E> listIterator() {
            return mo36526f().listIterator();
        }

        public E remove(int i) {
            E remove;
            synchronized (this.mutex) {
                remove = mo36526f().remove(i);
            }
            return remove;
        }

        public E set(int i, E e) {
            E e2;
            synchronized (this.mutex) {
                e2 = mo36526f().set(i, e);
            }
            return e2;
        }

        public List<E> subList(int i, int i2) {
            List<E> b;
            synchronized (this.mutex) {
                b = Synchronized.m28877h(mo36526f().subList(i, i2), this.mutex);
            }
            return b;
        }

        public ListIterator<E> listIterator(int i) {
            return mo36526f().listIterator(i);
        }
    }

    private static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public ListMultimap<K, V> mo36567f() {
            return (ListMultimap) super.mo36567f();
        }

        /* renamed from: d */
        public List<V> m28906d(Object obj) {
            List<V> d;
            synchronized (this.mutex) {
                d = mo36567f().mo34426d(obj);
            }
            return d;
        }

        public List<V> get(K k) {
            List<V> b;
            synchronized (this.mutex) {
                b = Synchronized.m28877h(mo36567f().get(k), this.mutex);
            }
            return b;
        }
    }

    private static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient Set<K> f17208a;

        /* renamed from: c */
        transient Collection<V> f17209c;

        /* renamed from: d */
        transient Set<Map.Entry<K, V>> f17210d;

        SynchronizedMap(Map<K, V> map, Object obj) {
            super(map, obj);
        }

        public void clear() {
            synchronized (this.mutex) {
                mo36521f().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = mo36521f().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = mo36521f().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.f17210d == null) {
                    this.f17210d = Synchronized.m28883n(mo36521f().entrySet(), this.mutex);
                }
                set = this.f17210d;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36521f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<K, V> mo36521f() {
            return (Map) super.mo36620c();
        }

        public V get(Object obj) {
            V v;
            synchronized (this.mutex) {
                v = mo36521f().get(obj);
            }
            return v;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36521f().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = mo36521f().isEmpty();
            }
            return isEmpty;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.f17208a == null) {
                    this.f17208a = Synchronized.m28883n(mo36521f().keySet(), this.mutex);
                }
                set = this.f17208a;
            }
            return set;
        }

        public V put(K k, V v) {
            V put;
            synchronized (this.mutex) {
                put = mo36521f().put(k, v);
            }
            return put;
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                mo36521f().putAll(map);
            }
        }

        public V remove(Object obj) {
            V remove;
            synchronized (this.mutex) {
                remove = mo36521f().remove(obj);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = mo36521f().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                if (this.f17209c == null) {
                    this.f17209c = Synchronized.m28876g(mo36521f().values(), this.mutex);
                }
                collection = this.f17209c;
            }
            return collection;
        }
    }

    private static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient Set<K> f17211a;

        /* renamed from: c */
        transient Collection<Map.Entry<K, V>> f17212c;

        /* renamed from: d */
        transient Map<K, Collection<V>> f17213d;

        /* renamed from: f */
        transient Multiset<K> f17214f;

        /* renamed from: P */
        public boolean mo34625P(Object obj, Object obj2) {
            boolean P;
            synchronized (this.mutex) {
                P = mo36567f().mo34625P(obj, obj2);
            }
            return P;
        }

        public void clear() {
            synchronized (this.mutex) {
                mo36567f().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = mo36567f().containsKey(obj);
            }
            return containsKey;
        }

        /* renamed from: d */
        public Collection<V> mo34426d(Object obj) {
            Collection<V> d;
            synchronized (this.mutex) {
                d = mo36567f().mo34426d(obj);
            }
            return d;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36567f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Multimap<K, V> mo36567f() {
            return (Multimap) super.mo36620c();
        }

        public Collection<V> get(K k) {
            Collection<V> d;
            synchronized (this.mutex) {
                d = Synchronized.m28886q(mo36567f().get(k), this.mutex);
            }
            return d;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36567f().hashCode();
            }
            return hashCode;
        }

        /* renamed from: i */
        public Collection<Map.Entry<K, V>> mo34445i() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                if (this.f17212c == null) {
                    this.f17212c = Synchronized.m28886q(mo36567f().mo34445i(), this.mutex);
                }
                collection = this.f17212c;
            }
            return collection;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = mo36567f().isEmpty();
            }
            return isEmpty;
        }

        /* renamed from: k */
        public Multiset<K> mo34630k() {
            Multiset<K> multiset;
            synchronized (this.mutex) {
                if (this.f17214f == null) {
                    this.f17214f = Synchronized.m28879j(mo36567f().mo34630k(), this.mutex);
                }
                multiset = this.f17214f;
            }
            return multiset;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.f17211a == null) {
                    this.f17211a = Synchronized.m28887r(mo36567f().keySet(), this.mutex);
                }
                set = this.f17211a;
            }
            return set;
        }

        public boolean put(K k, V v) {
            boolean put;
            synchronized (this.mutex) {
                put = mo36567f().put(k, v);
            }
            return put;
        }

        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.mutex) {
                remove = mo36567f().remove(obj, obj2);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = mo36567f().size();
            }
            return size;
        }

        /* renamed from: w */
        public Map<K, Collection<V>> mo34430w() {
            Map<K, Collection<V>> map;
            synchronized (this.mutex) {
                if (this.f17213d == null) {
                    this.f17213d = new SynchronizedAsMap(mo36567f().mo34430w(), this.mutex);
                }
                map = this.f17213d;
            }
            return map;
        }
    }

    private static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient Set<E> f17215a;

        /* renamed from: c */
        transient Set<Multiset.Entry<E>> f17216c;

        SynchronizedMultiset(Multiset<E> multiset, Object obj) {
            super(multiset, obj);
        }

        /* renamed from: C */
        public Set<E> mo34642C() {
            Set<E> set;
            synchronized (this.mutex) {
                if (this.f17215a == null) {
                    this.f17215a = Synchronized.m28887r(mo36526f().mo34642C(), this.mutex);
                }
                set = this.f17215a;
            }
            return set;
        }

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            int J1;
            synchronized (this.mutex) {
                J1 = mo36526f().mo34601J1(obj);
            }
            return J1;
        }

        /* renamed from: e0 */
        public int mo34603e0(E e, int i) {
            int e0;
            synchronized (this.mutex) {
                e0 = mo36526f().mo34603e0(e, i);
            }
            return e0;
        }

        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set;
            synchronized (this.mutex) {
                if (this.f17216c == null) {
                    this.f17216c = Synchronized.m28887r(mo36526f().entrySet(), this.mutex);
                }
                set = this.f17216c;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36526f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Multiset<E> mo36526f() {
            return (Multiset) super.mo36526f();
        }

        /* renamed from: h1 */
        public int mo34606h1(Object obj, int i) {
            int h1;
            synchronized (this.mutex) {
                h1 = mo36526f().mo34606h1(obj, i);
            }
            return h1;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36526f().hashCode();
            }
            return hashCode;
        }

        /* renamed from: k1 */
        public int mo34611k1(E e, int i) {
            int k1;
            synchronized (this.mutex) {
                k1 = mo36526f().mo34611k1(e, i);
            }
            return k1;
        }

        /* renamed from: z1 */
        public boolean mo34613z1(E e, int i, int i2) {
            boolean z1;
            synchronized (this.mutex) {
                z1 = mo36526f().mo34613z1(e, i, i2);
            }
            return z1;
        }
    }

    static class SynchronizedObject implements Serializable {
        @GwtIncompatible
        private static final long serialVersionUID = 0;
        final Object delegate;
        final Object mutex;

        SynchronizedObject(Object obj, Object obj2) {
            this.delegate = Preconditions.m5392s(obj);
            this.mutex = obj2 == null ? this : obj2;
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Object mo36620c() {
            return this.delegate;
        }

        public String toString() {
            String obj;
            synchronized (this.mutex) {
                obj = this.delegate.toString();
            }
            return obj;
        }
    }

    private static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public E element() {
            E element;
            synchronized (this.mutex) {
                element = mo36526f().element();
            }
            return element;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Queue<E> mo36526f() {
            return (Queue) super.mo36526f();
        }

        public boolean offer(E e) {
            boolean offer;
            synchronized (this.mutex) {
                offer = mo36526f().offer(e);
            }
            return offer;
        }

        public E peek() {
            E peek;
            synchronized (this.mutex) {
                peek = mo36526f().peek();
            }
            return peek;
        }

        public E poll() {
            E poll;
            synchronized (this.mutex) {
                poll = mo36526f().poll();
            }
            return poll;
        }

        public E remove() {
            E remove;
            synchronized (this.mutex) {
                remove = mo36526f().remove();
            }
            return remove;
        }
    }

    private static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(List<E> list, Object obj) {
            super(list, obj);
        }
    }

    static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(Set<E> set, Object obj) {
            super(set, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36526f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Set<E> mo36526f() {
            return (Set) super.mo36526f();
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36526f().hashCode();
            }
            return hashCode;
        }
    }

    private static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: g */
        transient Set<Map.Entry<K, V>> f17221g;

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public SetMultimap<K, V> mo36567f() {
            return (SetMultimap) super.mo36567f();
        }

        /* renamed from: d */
        public Set<V> m28937d(Object obj) {
            Set<V> d;
            synchronized (this.mutex) {
                d = mo36567f().mo34426d(obj);
            }
            return d;
        }

        public Set<V> get(K k) {
            Set<V> n;
            synchronized (this.mutex) {
                n = Synchronized.m28883n(mo36567f().get(k), this.mutex);
            }
            return n;
        }

        /* renamed from: i */
        public Set<Map.Entry<K, V>> m28941i() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.f17221g == null) {
                    this.f17221g = Synchronized.m28883n(mo36567f().mo34445i(), this.mutex);
                }
                set = this.f17221g;
            }
            return set;
        }
    }

    static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(SortedMap<K, V> sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = mo36521f().comparator();
            }
            return comparator;
        }

        public K firstKey() {
            K firstKey;
            synchronized (this.mutex) {
                firstKey = mo36521f().firstKey();
            }
            return firstKey;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public SortedMap<K, V> mo36521f() {
            return (SortedMap) super.mo36521f();
        }

        public SortedMap<K, V> headMap(K k) {
            SortedMap<K, V> o;
            synchronized (this.mutex) {
                o = Synchronized.m28884o(mo36521f().headMap(k), this.mutex);
            }
            return o;
        }

        public K lastKey() {
            K lastKey;
            synchronized (this.mutex) {
                lastKey = mo36521f().lastKey();
            }
            return lastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SortedMap<K, V> o;
            synchronized (this.mutex) {
                o = Synchronized.m28884o(mo36521f().subMap(k, k2), this.mutex);
            }
            return o;
        }

        public SortedMap<K, V> tailMap(K k) {
            SortedMap<K, V> o;
            synchronized (this.mutex) {
                o = Synchronized.m28884o(mo36521f().tailMap(k), this.mutex);
            }
            return o;
        }
    }

    static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(SortedSet<E> sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = mo36607h().comparator();
            }
            return comparator;
        }

        public E first() {
            E first;
            synchronized (this.mutex) {
                first = mo36607h().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e) {
            SortedSet<E> a;
            synchronized (this.mutex) {
                a = Synchronized.m28885p(mo36607h().headSet(e), this.mutex);
            }
            return a;
        }

        public E last() {
            E last;
            synchronized (this.mutex) {
                last = mo36607h().last();
            }
            return last;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public SortedSet<E> mo36607h() {
            return (SortedSet) super.mo36526f();
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet<E> a;
            synchronized (this.mutex) {
                a = Synchronized.m28885p(mo36607h().subSet(e, e2), this.mutex);
            }
            return a;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet<E> a;
            synchronized (this.mutex) {
                a = Synchronized.m28885p(mo36607h().tailSet(e), this.mutex);
            }
            return a;
        }
    }

    private static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {
        public void clear() {
            synchronized (this.mutex) {
                mo36636f().clear();
            }
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = mo36636f().containsValue(obj);
            }
            return containsValue;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                equals = mo36636f().equals(obj);
            }
            return equals;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Table<R, C, V> mo36636f() {
            return (Table) super.mo36620c();
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = mo36636f().hashCode();
            }
            return hashCode;
        }

        /* renamed from: j */
        public Map<R, Map<C, V>> mo34741j() {
            Map<R, Map<C, V>> i;
            synchronized (this.mutex) {
                i = Synchronized.m28878i(Maps.m28075R(mo36636f().mo34741j(), new Function<Map<C, V>, Map<C, V>>() {
                    /* renamed from: a */
                    public Map<C, V> apply(Map<C, V> map) {
                        return Synchronized.m28878i(map, SynchronizedTable.this.mutex);
                    }
                }), this.mutex);
            }
            return i;
        }

        /* renamed from: l */
        public Map<C, Map<R, V>> mo34742l() {
            Map<C, Map<R, V>> i;
            synchronized (this.mutex) {
                i = Synchronized.m28878i(Maps.m28075R(mo36636f().mo34742l(), new Function<Map<R, V>, Map<R, V>>() {
                    /* renamed from: a */
                    public Map<R, V> apply(Map<R, V> map) {
                        return Synchronized.m28878i(map, SynchronizedTable.this.mutex);
                    }
                }), this.mutex);
            }
            return i;
        }

        /* renamed from: m */
        public Set<Table.Cell<R, C, V>> mo34723m() {
            Set<Table.Cell<R, C, V>> n;
            synchronized (this.mutex) {
                n = Synchronized.m28883n(mo36636f().mo34723m(), this.mutex);
            }
            return n;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = mo36636f().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> e;
            synchronized (this.mutex) {
                e = Synchronized.m28876g(mo36636f().values(), this.mutex);
            }
            return e;
        }
    }

    private Synchronized() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static <E> Collection<E> m28876g(Collection<E> collection, Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static <E> List<E> m28877h(List<E> list, Object obj) {
        if (list instanceof RandomAccess) {
            return new SynchronizedRandomAccessList(list, obj);
        }
        return new SynchronizedList(list, obj);
    }

    @VisibleForTesting
    /* renamed from: i */
    static <K, V> Map<K, V> m28878i(Map<K, V> map, Object obj) {
        return new SynchronizedMap(map, obj);
    }

    /* renamed from: j */
    static <E> Multiset<E> m28879j(Multiset<E> multiset, Object obj) {
        return ((multiset instanceof SynchronizedMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new SynchronizedMultiset(multiset, obj);
    }

    @GwtIncompatible
    /* renamed from: k */
    static <K, V> NavigableMap<K, V> m28880k(NavigableMap<K, V> navigableMap, Object obj) {
        return new SynchronizedNavigableMap(navigableMap, obj);
    }

    @GwtIncompatible
    /* renamed from: l */
    static <E> NavigableSet<E> m28881l(NavigableSet<E> navigableSet, Object obj) {
        return new SynchronizedNavigableSet(navigableSet, obj);
    }

    /* access modifiers changed from: private */
    @GwtIncompatible
    /* renamed from: m */
    public static <K, V> Map.Entry<K, V> m28882m(Map.Entry<K, V> entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    @VisibleForTesting
    /* renamed from: n */
    static <E> Set<E> m28883n(Set<E> set, Object obj) {
        return new SynchronizedSet(set, obj);
    }

    /* renamed from: o */
    static <K, V> SortedMap<K, V> m28884o(SortedMap<K, V> sortedMap, Object obj) {
        return new SynchronizedSortedMap(sortedMap, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static <E> SortedSet<E> m28885p(SortedSet<E> sortedSet, Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static <E> Collection<E> m28886q(Collection<E> collection, Object obj) {
        if (collection instanceof SortedSet) {
            return m28885p((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return m28883n((Set) collection, obj);
        }
        if (collection instanceof List) {
            return m28877h((List) collection, obj);
        }
        return m28876g(collection, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static <E> Set<E> m28887r(Set<E> set, Object obj) {
        if (set instanceof SortedSet) {
            return m28885p((SortedSet) set, obj);
        }
        return m28883n(set, obj);
    }

    private static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public SortedSetMultimap<K, V> mo36628h() {
            return (SortedSetMultimap) super.mo36567f();
        }

        /* renamed from: d */
        public SortedSet<V> m28949d(Object obj) {
            SortedSet<V> d;
            synchronized (this.mutex) {
                d = mo36628h().mo34426d(obj);
            }
            return d;
        }

        public SortedSet<V> get(K k) {
            SortedSet<V> a;
            synchronized (this.mutex) {
                a = Synchronized.m28885p(mo36628h().get(k), this.mutex);
            }
            return a;
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        transient NavigableSet<K> f17217f;

        /* renamed from: g */
        transient NavigableMap<K, V> f17218g;

        /* renamed from: o */
        transient NavigableSet<K> f17219o;

        SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        public Map.Entry<K, V> ceilingEntry(K k) {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().ceilingEntry(k), this.mutex);
            }
            return f;
        }

        public K ceilingKey(K k) {
            K ceilingKey;
            synchronized (this.mutex) {
                ceilingKey = mo36587h().ceilingKey(k);
            }
            return ceilingKey;
        }

        public NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.f17217f;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> l = Synchronized.m28881l(mo36587h().descendingKeySet(), this.mutex);
                this.f17217f = l;
                return l;
            }
        }

        public NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                NavigableMap<K, V> navigableMap = this.f17218g;
                if (navigableMap != null) {
                    return navigableMap;
                }
                NavigableMap<K, V> k = Synchronized.m28880k(mo36587h().descendingMap(), this.mutex);
                this.f17218g = k;
                return k;
            }
        }

        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().firstEntry(), this.mutex);
            }
            return f;
        }

        public Map.Entry<K, V> floorEntry(K k) {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().floorEntry(k), this.mutex);
            }
            return f;
        }

        public K floorKey(K k) {
            K floorKey;
            synchronized (this.mutex) {
                floorKey = mo36587h().floorKey(k);
            }
            return floorKey;
        }

        public NavigableMap<K, V> headMap(K k, boolean z) {
            NavigableMap<K, V> k2;
            synchronized (this.mutex) {
                k2 = Synchronized.m28880k(mo36587h().headMap(k, z), this.mutex);
            }
            return k2;
        }

        public Map.Entry<K, V> higherEntry(K k) {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().higherEntry(k), this.mutex);
            }
            return f;
        }

        public K higherKey(K k) {
            K higherKey;
            synchronized (this.mutex) {
                higherKey = mo36587h().higherKey(k);
            }
            return higherKey;
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().lastEntry(), this.mutex);
            }
            return f;
        }

        public Map.Entry<K, V> lowerEntry(K k) {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().lowerEntry(k), this.mutex);
            }
            return f;
        }

        public K lowerKey(K k) {
            K lowerKey;
            synchronized (this.mutex) {
                lowerKey = mo36587h().lowerKey(k);
            }
            return lowerKey;
        }

        public NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.f17219o;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> l = Synchronized.m28881l(mo36587h().navigableKeySet(), this.mutex);
                this.f17219o = l;
                return l;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public NavigableMap<K, V> mo36587h() {
            return (NavigableMap) super.mo36521f();
        }

        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().pollFirstEntry(), this.mutex);
            }
            return f;
        }

        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> f;
            synchronized (this.mutex) {
                f = Synchronized.m28882m(mo36587h().pollLastEntry(), this.mutex);
            }
            return f;
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            NavigableMap<K, V> k3;
            synchronized (this.mutex) {
                k3 = Synchronized.m28880k(mo36587h().subMap(k, z, k2, z2), this.mutex);
            }
            return k3;
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            NavigableMap<K, V> k2;
            synchronized (this.mutex) {
                k2 = Synchronized.m28880k(mo36587h().tailMap(k, z), this.mutex);
            }
            return k2;
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient NavigableSet<E> f17220a;

        SynchronizedNavigableSet(NavigableSet<E> navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        public E ceiling(E e) {
            E ceiling;
            synchronized (this.mutex) {
                ceiling = mo36612p().ceiling(e);
            }
            return ceiling;
        }

        public Iterator<E> descendingIterator() {
            return mo36612p().descendingIterator();
        }

        public NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                NavigableSet<E> navigableSet = this.f17220a;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<E> l = Synchronized.m28881l(mo36612p().descendingSet(), this.mutex);
                this.f17220a = l;
                return l;
            }
        }

        public E floor(E e) {
            E floor;
            synchronized (this.mutex) {
                floor = mo36612p().floor(e);
            }
            return floor;
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            NavigableSet<E> l;
            synchronized (this.mutex) {
                l = Synchronized.m28881l(mo36612p().headSet(e, z), this.mutex);
            }
            return l;
        }

        public E higher(E e) {
            E higher;
            synchronized (this.mutex) {
                higher = mo36612p().higher(e);
            }
            return higher;
        }

        public E lower(E e) {
            E lower;
            synchronized (this.mutex) {
                lower = mo36612p().lower(e);
            }
            return lower;
        }

        public E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = mo36612p().pollFirst();
            }
            return pollFirst;
        }

        public E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = mo36612p().pollLast();
            }
            return pollLast;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public NavigableSet<E> mo36612p() {
            return (NavigableSet) super.mo36607h();
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            NavigableSet<E> l;
            synchronized (this.mutex) {
                l = Synchronized.m28881l(mo36612p().subSet(e, z, e2, z2), this.mutex);
            }
            return l;
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            NavigableSet<E> l;
            synchronized (this.mutex) {
                l = Synchronized.m28881l(mo36612p().tailSet(e, z), this.mutex);
            }
            return l;
        }

        public SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        public SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }

        public SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }
    }

    private static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, Object obj) {
            super(set, obj);
        }

        public boolean contains(Object obj) {
            boolean n;
            synchronized (this.mutex) {
                n = Maps.m28099n(mo36526f(), obj);
            }
            return n;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean b;
            synchronized (this.mutex) {
                b = Collections2.m26540b(mo36526f(), collection);
            }
            return b;
        }

        public boolean equals(Object obj) {
            boolean b;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                b = Sets.m28719b(mo36526f(), obj);
            }
            return b;
        }

        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>>(super.iterator()) {
                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public Map.Entry<K, Collection<V>> mo34726a(final Map.Entry<K, Collection<V>> entry) {
                    return new ForwardingMapEntry<K, Collection<V>>() {
                        /* access modifiers changed from: protected */
                        /* renamed from: R */
                        public Map.Entry<K, Collection<V>> mo22325Q() {
                            return entry;
                        }

                        /* renamed from: V */
                        public Collection<V> getValue() {
                            return Synchronized.m28886q((Collection) entry.getValue(), SynchronizedAsMapEntries.this.mutex);
                        }
                    };
                }
            };
        }

        public boolean remove(Object obj) {
            boolean F;
            synchronized (this.mutex) {
                F = Maps.m28063F(mo36526f(), obj);
            }
            return F;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean D;
            synchronized (this.mutex) {
                D = Iterators.m27697D(mo36526f().iterator(), collection);
            }
            return D;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean F;
            synchronized (this.mutex) {
                F = Iterators.m27699F(mo36526f().iterator(), collection);
            }
            return F;
        }

        public Object[] toArray() {
            Object[] h;
            synchronized (this.mutex) {
                h = ObjectArrays.m28472h(mo36526f());
            }
            return h;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] i;
            synchronized (this.mutex) {
                i = ObjectArrays.m28473i(mo36526f(), tArr);
            }
            return i;
        }
    }
}
