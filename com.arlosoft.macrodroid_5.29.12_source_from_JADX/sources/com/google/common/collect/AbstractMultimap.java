package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    @LazyInit

    /* renamed from: a */
    private transient Collection<Map.Entry<K, V>> f16433a;
    @LazyInit

    /* renamed from: c */
    private transient Set<K> f16434c;
    @LazyInit

    /* renamed from: d */
    private transient Multiset<K> f16435d;
    @LazyInit

    /* renamed from: f */
    private transient Collection<V> f16436f;
    @LazyInit

    /* renamed from: g */
    private transient Map<K, Collection<V>> f16437g;

    class Entries extends Multimaps.Entries<K, V> {
        Entries() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Multimap<K, V> mo34634c() {
            return AbstractMultimap.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.mo34443g();
        }
    }

    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        EntrySet(AbstractMultimap abstractMultimap) {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.m28719b(this, obj);
        }

        public int hashCode() {
            return Sets.m28723f(this);
        }
    }

    class Values extends AbstractCollection<V> {
        Values() {
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return AbstractMultimap.this.mo34444h();
        }

        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    AbstractMultimap() {
    }

    /* renamed from: P */
    public boolean mo34625P(Object obj, Object obj2) {
        Collection collection = (Collection) mo34430w().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo34436a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Collection<Map.Entry<K, V>> mo34437b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Set<K> mo34438c();

    public boolean containsValue(Object obj) {
        for (Collection contains : mo34430w().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Multiset<K> mo34441e();

    public boolean equals(Object obj) {
        return Multimaps.m28272c(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Collection<V> mo34442f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Iterator<Map.Entry<K, V>> mo34443g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<V> mo34444h() {
        return Maps.m28083Z(mo34445i().iterator());
    }

    public int hashCode() {
        return mo34430w().hashCode();
    }

    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo34445i() {
        Collection<Map.Entry<K, V>> collection = this.f16433a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> b = mo34437b();
        this.f16433a = b;
        return b;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public Collection<V> mo34629j() {
        Collection<V> collection = this.f16436f;
        if (collection != null) {
            return collection;
        }
        Collection<V> f = mo34442f();
        this.f16436f = f;
        return f;
    }

    /* renamed from: k */
    public Multiset<K> mo34630k() {
        Multiset<K> multiset = this.f16435d;
        if (multiset != null) {
            return multiset;
        }
        Multiset<K> e = mo34441e();
        this.f16435d = e;
        return e;
    }

    public Set<K> keySet() {
        Set<K> set = this.f16434c;
        if (set != null) {
            return set;
        }
        Set<K> c = mo34438c();
        this.f16434c = c;
        return c;
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return get(k).add(v);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) mo34430w().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo34430w().toString();
    }

    /* renamed from: w */
    public Map<K, Collection<V>> mo34430w() {
        Map<K, Collection<V>> map = this.f16437g;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a = mo34436a();
        this.f16437g = a;
        return a;
    }
}
