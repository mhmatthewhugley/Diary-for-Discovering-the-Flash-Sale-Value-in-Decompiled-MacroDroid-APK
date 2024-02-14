package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o */
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f16673o;

    /* renamed from: p */
    final transient int f16674p;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a */
        final Map<K, Collection<V>> f16682a = Platform.m28539h();

        /* renamed from: b */
        Comparator<? super K> f16683b;

        /* renamed from: c */
        Comparator<? super V> f16684c;

        /* renamed from: a */
        public ImmutableMultimap<K, V> mo35464a() {
            Collection entrySet = this.f16682a.entrySet();
            Comparator comparator = this.f16683b;
            if (comparator != null) {
                entrySet = Ordering.m28520a(comparator).mo36267h().mo34737b(entrySet);
            }
            return ImmutableListMultimap.m27337D(entrySet, this.f16684c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<V> mo35465b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder<K, V> mo35466c(K k, V v) {
            CollectPreconditions.m26534a(k, v);
            Collection collection = this.f16682a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f16682a;
                Collection b = mo35465b();
                map.put(k, b);
                collection = b;
            }
            collection.add(v);
            return this;
        }
    }

    private static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        @Weak
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.mo34625P(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return this.multimap.mo35456x();
        }

        /* renamed from: k */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.multimap.mo34443g();
        }

        public int size() {
            return this.multimap.size();
        }
    }

    @GwtIncompatible
    static class FieldSettersHolder {

        /* renamed from: a */
        static final Serialization.FieldSetter<ImmutableMultimap> f16685a = Serialization.m28703a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        static final Serialization.FieldSetter<ImmutableMultimap> f16686b = Serialization.m28703a(ImmutableMultimap.class, "size");

        FieldSettersHolder() {
        }
    }

    class Keys extends ImmutableMultiset<K> {
        Keys() {
        }

        /* renamed from: J1 */
        public int mo34601J1(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.f16673o.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        /* renamed from: n */
        public ImmutableSet<K> mo34642C() {
            return ImmutableMultimap.this.keySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public Multiset.Entry<K> mo34983q(int i) {
            Map.Entry entry = ImmutableMultimap.this.f16673o.entrySet().mo35029c().get(i);
            return Multisets.m28379h(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        public int size() {
            return ImmutableMultimap.this.size();
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    @GwtIncompatible
    private static final class KeysSerializedForm implements Serializable {
        final ImmutableMultimap<?, ?> multimap;

        KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.multimap.mo34630k();
        }
    }

    private static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        @Weak

        /* renamed from: c */
        private final transient ImmutableMultimap<K, V> f16687c;

        Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f16687c = immutableMultimap;
        }

        public boolean contains(Object obj) {
            return this.f16687c.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        /* renamed from: d */
        public int mo35355d(Object[] objArr, int i) {
            UnmodifiableIterator<? extends ImmutableCollection<V>> k = this.f16687c.f16673o.values().iterator();
            while (k.hasNext()) {
                i = ((ImmutableCollection) k.next()).mo35355d(objArr, i);
            }
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        /* renamed from: k */
        public UnmodifiableIterator<V> iterator() {
            return this.f16687c.mo34444h();
        }

        public int size() {
            return this.f16687c.size();
        }
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.f16673o = immutableMap;
        this.f16674p = i;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: A */
    public ImmutableCollection<V> mo34426d(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public UnmodifiableIterator<V> mo34444h() {
        return new UnmodifiableIterator<V>() {

            /* renamed from: a */
            Iterator<? extends ImmutableCollection<V>> f16679a;

            /* renamed from: c */
            Iterator<V> f16680c = Iterators.m27717m();

            {
                this.f16679a = ImmutableMultimap.this.f16673o.values().iterator();
            }

            public boolean hasNext() {
                return this.f16680c.hasNext() || this.f16679a.hasNext();
            }

            public V next() {
                if (!this.f16680c.hasNext()) {
                    this.f16680c = ((ImmutableCollection) this.f16679a.next()).iterator();
                }
                return this.f16680c.next();
            }
        };
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ boolean mo34625P(Object obj, Object obj2) {
        return super.mo34625P(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        throw new AssertionError("unreachable");
    }

    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return this.f16673o.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: l */
    public ImmutableMap<K, Collection<V>> mo34430w() {
        return this.f16673o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ImmutableCollection<Map.Entry<K, V>> mo34437b() {
        return new EntryCollection(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public ImmutableMultiset<K> mo34441e() {
        return new Keys();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ImmutableCollection<V> mo34442f() {
        return new Values(this);
    }

    /* renamed from: r */
    public ImmutableCollection<Map.Entry<K, V>> mo34445i() {
        return (ImmutableCollection) super.mo34445i();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f16674p;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public UnmodifiableIterator<Map.Entry<K, V>> mo34443g() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() {

            /* renamed from: a */
            final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f16675a;

            /* renamed from: c */
            K f16676c = null;

            /* renamed from: d */
            Iterator<V> f16677d = Iterators.m27717m();

            {
                this.f16675a = ImmutableMultimap.this.f16673o.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                if (!this.f16677d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f16675a.next();
                    this.f16676c = entry.getKey();
                    this.f16677d = ((ImmutableCollection) entry.getValue()).iterator();
                }
                K k = this.f16676c;
                Objects.requireNonNull(k);
                return Maps.m28105t(k, this.f16677d.next());
            }

            public boolean hasNext() {
                return this.f16677d.hasNext() || this.f16675a.hasNext();
            }
        };
    }

    /* renamed from: v */
    public abstract ImmutableCollection<V> get(K k);

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo35456x() {
        return this.f16673o.mo34967j();
    }

    /* renamed from: y */
    public ImmutableSet<K> keySet() {
        return this.f16673o.keySet();
    }

    /* renamed from: z */
    public ImmutableMultiset<K> mo34630k() {
        return (ImmutableMultiset) super.mo34630k();
    }
}
