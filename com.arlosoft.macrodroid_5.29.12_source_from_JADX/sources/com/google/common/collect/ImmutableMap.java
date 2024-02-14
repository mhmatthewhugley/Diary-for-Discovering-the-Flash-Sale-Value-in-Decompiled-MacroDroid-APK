package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* renamed from: f */
    static final Map.Entry<?, ?>[] f16654f = new Map.Entry[0];
    @RetainedWith
    @LazyInit

    /* renamed from: a */
    private transient ImmutableSet<Map.Entry<K, V>> f16655a;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient ImmutableSet<K> f16656c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    private transient ImmutableCollection<V> f16657d;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a */
        Comparator<? super V> f16659a;

        /* renamed from: b */
        Object[] f16660b;

        /* renamed from: c */
        int f16661c;

        /* renamed from: d */
        boolean f16662d;

        /* renamed from: e */
        DuplicateKey f16663e;

        static final class DuplicateKey {

            /* renamed from: a */
            private final Object f16664a;

            /* renamed from: b */
            private final Object f16665b;

            /* renamed from: c */
            private final Object f16666c;

            DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f16664a = obj;
                this.f16665b = obj2;
                this.f16666c = obj3;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public IllegalArgumentException mo35427a() {
                String valueOf = String.valueOf(this.f16664a);
                String valueOf2 = String.valueOf(this.f16665b);
                String valueOf3 = String.valueOf(this.f16664a);
                String valueOf4 = String.valueOf(this.f16666c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public Builder() {
            this(4);
        }

        /* renamed from: b */
        private ImmutableMap<K, V> m27363b(boolean z) {
            Object[] objArr;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (!z || (duplicateKey2 = this.f16663e) == null) {
                int i = this.f16661c;
                if (this.f16659a == null) {
                    objArr = this.f16660b;
                } else {
                    if (this.f16662d) {
                        this.f16660b = Arrays.copyOf(this.f16660b, i * 2);
                    }
                    objArr = this.f16660b;
                    if (!z) {
                        objArr = m27365f(objArr, this.f16661c);
                        if (objArr.length < this.f16660b.length) {
                            i = objArr.length >>> 1;
                        }
                    }
                    m27366k(objArr, i, this.f16659a);
                }
                this.f16662d = true;
                RegularImmutableMap r = RegularImmutableMap.m28616r(i, objArr, this);
                if (!z || (duplicateKey = this.f16663e) == null) {
                    return r;
                }
                throw duplicateKey.mo35427a();
            }
            throw duplicateKey2.mo35427a();
        }

        /* renamed from: e */
        private void m27364e(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f16660b;
            if (i2 > objArr.length) {
                this.f16660b = Arrays.copyOf(objArr, ImmutableCollection.Builder.m27291d(objArr.length, i2));
                this.f16662d = false;
            }
        }

        /* renamed from: f */
        private Object[] m27365f(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i - bitSet.cardinality()) * 2)];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 = i5 + 1;
                    i3 = i6 + 1;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: k */
        static <V> void m27366k(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, Ordering.m28520a(comparator).mo36268i(Maps.m28082Y()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo35335a() {
            return mo35337d();
        }

        /* renamed from: c */
        public ImmutableMap<K, V> mo35336c() {
            return m27363b(false);
        }

        /* renamed from: d */
        public ImmutableMap<K, V> mo35337d() {
            return m27363b(true);
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder<K, V> mo35338g(K k, V v) {
            m27364e(this.f16661c + 1);
            CollectPreconditions.m26534a(k, v);
            Object[] objArr = this.f16660b;
            int i = this.f16661c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f16661c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public Builder<K, V> mo35339h(Map.Entry<? extends K, ? extends V> entry) {
            return mo35338g(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: i */
        public Builder<K, V> mo35340i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m27364e(this.f16661c + ((Collection) iterable).size());
            }
            for (Map.Entry h : iterable) {
                mo35339h(h);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public Builder<K, V> mo35341j(Map<? extends K, ? extends V> map) {
            return mo35340i(map.entrySet());
        }

        Builder(int i) {
            this.f16660b = new Object[(i * 2)];
            this.f16661c = 0;
            this.f16662d = false;
        }
    }

    static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        IteratorBasedImmutableMap() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public ImmutableSet<Map.Entry<K, V>> mo35412e() {
            return new ImmutableMapEntrySet<K, V>() {
                /* access modifiers changed from: package-private */
                /* renamed from: O */
                public ImmutableMap<K, V> mo35428O() {
                    return IteratorBasedImmutableMap.this;
                }

                /* renamed from: k */
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.mo34973q();
                }
            };
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public ImmutableSet<K> mo34971f() {
            return new ImmutableMapKeySet(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public ImmutableCollection<V> mo35329g() {
            return new ImmutableMapValues(this);
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public abstract UnmodifiableIterator<Map.Entry<K, V>> mo34973q();

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    private final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        final /* synthetic */ ImmutableMap this$0;

        public boolean containsKey(Object obj) {
            return this.this$0.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public ImmutableSet<K> mo34971f() {
            return this.this$0.keySet();
        }

        public int hashCode() {
            return this.this$0.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo35417i() {
            return this.this$0.mo35417i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34967j() {
            return this.this$0.mo34967j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> mo34973q() {
            final UnmodifiableIterator k = this.this$0.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) {
                /* renamed from: a */
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) k.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) {
                        /* renamed from: a */
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.m27507I(entry.getValue());
                        }

                        public K getKey() {
                            return entry.getKey();
                        }
                    };
                }

                public boolean hasNext() {
                    return k.hasNext();
                }
            };
        }

        /* renamed from: r */
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = this.this$0.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m27507I(obj2);
        }

        public int size() {
            return this.this$0.size();
        }
    }

    static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> k = immutableMap.entrySet().iterator();
            int i = 0;
            while (k.hasNext()) {
                Map.Entry next = k.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Object mo35435a() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder b = mo35349b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b.mo35338g(objArr[i], objArr2[i]);
            }
            return b.mo35337d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Builder<K, V> mo35349b(int i) {
            return new Builder<>(i);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return mo35435a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            Builder b = mo35349b(immutableSet.size());
            UnmodifiableIterator k = immutableSet.iterator();
            UnmodifiableIterator k2 = ((ImmutableCollection) this.values).iterator();
            while (k.hasNext()) {
                b.mo35338g(k.next(), k2.next());
            }
            return b.mo35337d();
        }
    }

    ImmutableMap() {
    }

    /* renamed from: a */
    public static <K, V> Builder<K, V> m27348a() {
        return new Builder<>();
    }

    @Beta
    /* renamed from: b */
    public static <K, V> Builder<K, V> m27349b(int i) {
        CollectPreconditions.m26535b(i, "expectedSize");
        return new Builder<>(i);
    }

    @Beta
    /* renamed from: c */
    public static <K, V> ImmutableMap<K, V> m27350c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.mo35340i(iterable);
        return builder.mo35335a();
    }

    /* renamed from: d */
    public static <K, V> ImmutableMap<K, V> m27351d(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.mo34967j()) {
                return immutableMap;
            }
        }
        return m27350c(map.entrySet());
    }

    /* renamed from: m */
    public static <K, V> ImmutableMap<K, V> m27352m() {
        return RegularImmutableMap.f17080s;
    }

    /* renamed from: n */
    public static <K, V> ImmutableMap<K, V> m27353n(K k, V v) {
        CollectPreconditions.m26534a(k, v);
        return RegularImmutableMap.m28615q(1, new Object[]{k, v});
    }

    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract ImmutableSet<Map.Entry<K, V>> mo35412e();

    public boolean equals(Object obj) {
        return Maps.m28100o(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract ImmutableSet<K> mo34971f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract ImmutableCollection<V> mo35329g();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f16655a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> e = mo35412e();
        this.f16655a = e;
        return e;
    }

    public int hashCode() {
        return Sets.m28723f(entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo35417i() {
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo34967j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public UnmodifiableIterator<K> mo35372k() {
        final UnmodifiableIterator k = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) {
            public boolean hasNext() {
                return k.hasNext();
            }

            public K next() {
                return ((Map.Entry) k.next()).getKey();
            }
        };
    }

    /* renamed from: l */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f16656c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> f = mo34971f();
        this.f16656c = f;
        return f;
    }

    /* renamed from: p */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f16657d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> g = mo35329g();
        this.f16657d = g;
        return g;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m28070M(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
