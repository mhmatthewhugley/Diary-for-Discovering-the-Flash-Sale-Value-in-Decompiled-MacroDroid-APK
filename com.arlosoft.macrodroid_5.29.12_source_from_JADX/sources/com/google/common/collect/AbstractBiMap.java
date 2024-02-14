package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public transient Map<K, V> f16365a;
    @RetainedWith

    /* renamed from: c */
    transient AbstractBiMap<V, K> f16366c;

    /* renamed from: d */
    private transient Set<K> f16367d;

    /* renamed from: f */
    private transient Set<V> f16368f;

    /* renamed from: g */
    private transient Set<Map.Entry<K, V>> f16369g;

    class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* renamed from: a */
        private final Map.Entry<K, V> f16373a;

        BiMapEntry(Map.Entry<K, V> entry) {
            this.f16373a = entry;
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Map.Entry<K, V> mo22325Q() {
            return this.f16373a;
        }

        public V setValue(V v) {
            AbstractBiMap.this.mo34377b0(v);
            Preconditions.m5399z(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.m5349a(v, getValue())) {
                return v;
            }
            Preconditions.m5385l(!AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            V value = this.f16373a.setValue(v);
            Preconditions.m5399z(Objects.m5349a(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.m26265o0(getKey(), true, value, v);
            return value;
        }
    }

    private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {

        /* renamed from: a */
        final Set<Map.Entry<K, V>> f16375a;

        private EntrySet() {
            this.f16375a = AbstractBiMap.this.f16365a.entrySet();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<Map.Entry<K, V>> mo34397R() {
            return this.f16375a;
        }

        public void clear() {
            AbstractBiMap.this.clear();
        }

        public boolean contains(Object obj) {
            return Maps.m28099n(mo34397R(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo35129V(collection);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.mo34380d0();
        }

        public boolean remove(Object obj) {
            if (!this.f16375a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f16366c.f16365a.remove(entry.getValue());
            this.f16375a.remove(entry);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return mo35235d0(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo35130W(collection);
        }

        public Object[] toArray() {
            return mo35131X();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo35132Y(tArr);
        }
    }

    static class Inverse<K, V> extends AbstractBiMap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            mo34385n0((AbstractBiMap) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(mo34390x0());
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public /* bridge */ /* synthetic */ Object mo22325Q() {
            return AbstractBiMap.super.mo22325Q();
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: a0 */
        public K mo34376a0(@ParametricNullness K k) {
            return this.f16366c.mo34377b0(k);
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: b0 */
        public V mo34377b0(@ParametricNullness V v) {
            return this.f16366c.mo34376a0(v);
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        public Object readResolve() {
            return mo34390x0().mo34390x0();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractBiMap.super.values();
        }
    }

    private class KeySet extends ForwardingSet<K> {
        private KeySet() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<K> mo34397R() {
            return AbstractBiMap.this.f16365a.keySet();
        }

        public void clear() {
            AbstractBiMap.this.clear();
        }

        public Iterator<K> iterator() {
            return Maps.m28108w(AbstractBiMap.this.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Object unused = AbstractBiMap.this.m26263i0(obj);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return mo35235d0(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo35130W(collection);
        }
    }

    private class ValueSet extends ForwardingSet<V> {

        /* renamed from: a */
        final Set<V> f16378a;

        private ValueSet() {
            this.f16378a = AbstractBiMap.this.f16366c.keySet();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<V> mo34397R() {
            return this.f16378a;
        }

        public Iterator<V> iterator() {
            return Maps.m28083Z(AbstractBiMap.this.entrySet().iterator());
        }

        public Object[] toArray() {
            return mo35131X();
        }

        public String toString() {
            return mo35133a0();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo35132Y(tArr);
        }
    }

    /* renamed from: h0 */
    private V m26262h0(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        mo34376a0(k);
        mo34377b0(v);
        boolean containsKey = containsKey(k);
        if (containsKey && Objects.m5349a(v, get(k))) {
            return v;
        }
        if (z) {
            mo34390x0().remove(v);
        } else {
            Preconditions.m5385l(!containsValue(v), "value already present: %s", v);
        }
        V put = this.f16365a.put(k, v);
        m26265o0(k, containsKey, put, v);
        return put;
    }

    /* access modifiers changed from: private */
    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: i0 */
    public V m26263i0(Object obj) {
        V a = NullnessCasts.m28457a(this.f16365a.remove(obj));
        m26264l0(a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m26264l0(@ParametricNullness V v) {
        this.f16366c.f16365a.remove(v);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m26265o0(@ParametricNullness K k, boolean z, V v, @ParametricNullness V v2) {
        if (z) {
            m26264l0(NullnessCasts.m28457a(v));
        }
        this.f16366c.f16365a.put(v2, k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public Map<K, V> mo22325Q() {
        return this.f16365a;
    }

    /* access modifiers changed from: package-private */
    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: a0 */
    public K mo34376a0(@ParametricNullness K k) {
        return k;
    }

    /* access modifiers changed from: package-private */
    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: b0 */
    public V mo34377b0(@ParametricNullness V v) {
        return v;
    }

    public void clear() {
        this.f16365a.clear();
        this.f16366c.f16365a.clear();
    }

    public boolean containsValue(Object obj) {
        return this.f16366c.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public Iterator<Map.Entry<K, V>> mo34380d0() {
        final Iterator<Map.Entry<K, V>> it = this.f16365a.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>() {

            /* renamed from: a */
            Map.Entry<K, V> f16370a;

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = (Map.Entry) it.next();
                this.f16370a = entry;
                return new BiMapEntry(entry);
            }

            public boolean hasNext() {
                return it.hasNext();
            }

            public void remove() {
                Map.Entry<K, V> entry = this.f16370a;
                if (entry != null) {
                    V value = entry.getValue();
                    it.remove();
                    AbstractBiMap.this.m26264l0(value);
                    this.f16370a = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        };
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f16369g;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f16369g = entrySet;
        return entrySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public AbstractBiMap<V, K> mo34382g0(Map<V, K> map) {
        return new Inverse(map, this);
    }

    public Set<K> keySet() {
        Set<K> set = this.f16367d;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f16367d = keySet;
        return keySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo34384m0(Map<K, V> map, Map<V, K> map2) {
        boolean z = true;
        Preconditions.m5398y(this.f16365a == null);
        Preconditions.m5398y(this.f16366c == null);
        Preconditions.m5377d(map.isEmpty());
        Preconditions.m5377d(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        Preconditions.m5377d(z);
        this.f16365a = map;
        this.f16366c = mo34382g0(map2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo34385n0(AbstractBiMap<V, K> abstractBiMap) {
        this.f16366c = abstractBiMap;
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return m26262h0(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return m26263i0(obj);
        }
        return null;
    }

    /* renamed from: x0 */
    public BiMap<V, K> mo34390x0() {
        return this.f16366c;
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.f16365a = map;
        this.f16366c = abstractBiMap;
    }

    public Set<V> values() {
        Set<V> set = this.f16368f;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f16368f = valueSet;
        return valueSet;
    }
}
