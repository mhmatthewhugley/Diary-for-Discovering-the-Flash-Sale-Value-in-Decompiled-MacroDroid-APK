package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* renamed from: s */
    private static final Comparator<Comparable> f16718s = Ordering.m28521e();
    private static final long serialVersionUID = 0;

    /* renamed from: z */
    private static final ImmutableSortedMap<Comparable, Object> f16719z = new ImmutableSortedMap<>(ImmutableSortedSet.m27619T(Ordering.m28521e()), ImmutableList.m27301D());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient RegularImmutableSortedSet<K> f16720g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final transient ImmutableList<V> f16721o;

    /* renamed from: p */
    private transient ImmutableSortedMap<K, V> f16722p;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1 */
    class C69801 implements Comparator<Map.Entry<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ Comparator f16723a;

        /* renamed from: a */
        public int compare(Map.Entry<Object, Object> entry, Map.Entry<Object, Object> entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f16723a.compare(entry.getKey(), entry2.getKey());
        }
    }

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* renamed from: f */
        private transient Object[] f16724f;

        /* renamed from: g */
        private transient Object[] f16725g;

        /* renamed from: h */
        private final Comparator<? super K> f16726h;

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        /* renamed from: e */
        private void m27576e(int i) {
            Object[] objArr = this.f16724f;
            if (i > objArr.length) {
                int d = ImmutableCollection.Builder.m27291d(objArr.length, i);
                this.f16724f = Arrays.copyOf(this.f16724f, d);
                this.f16725g = Arrays.copyOf(this.f16725g, d);
            }
        }

        /* renamed from: l */
        public ImmutableSortedMap<K, V> mo35335a() {
            return mo35337d();
        }

        @DoNotCall
        @Deprecated
        /* renamed from: m */
        public final ImmutableSortedMap<K, V> mo35336c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        /* renamed from: n */
        public ImmutableSortedMap<K, V> mo35337d() {
            int i = this.f16661c;
            if (i == 0) {
                return ImmutableSortedMap.m27551w(this.f16726h);
            }
            if (i != 1) {
                Object[] copyOf = Arrays.copyOf(this.f16724f, i);
                Arrays.sort(copyOf, this.f16726h);
                Object[] objArr = new Object[this.f16661c];
                for (int i2 = 0; i2 < this.f16661c; i2++) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.f16726h.compare(copyOf[i3], copyOf[i2]) == 0) {
                            String valueOf = String.valueOf(copyOf[i3]);
                            String valueOf2 = String.valueOf(copyOf[i2]);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
                            sb.append("keys required to be distinct but compared as equal: ");
                            sb.append(valueOf);
                            sb.append(" and ");
                            sb.append(valueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    Object obj = this.f16724f[i2];
                    Objects.requireNonNull(obj);
                    int binarySearch = Arrays.binarySearch(copyOf, obj, this.f16726h);
                    Object obj2 = this.f16725g[i2];
                    Objects.requireNonNull(obj2);
                    objArr[binarySearch] = obj2;
                }
                return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m27304l(copyOf), this.f16726h), ImmutableList.m27304l(objArr));
            }
            Comparator<? super K> comparator = this.f16726h;
            Object obj3 = this.f16724f[0];
            Objects.requireNonNull(obj3);
            Object obj4 = this.f16725g[0];
            Objects.requireNonNull(obj4);
            return ImmutableSortedMap.m27547D(comparator, obj3, obj4);
        }

        @CanIgnoreReturnValue
        /* renamed from: o */
        public Builder<K, V> mo35338g(K k, V v) {
            m27576e(this.f16661c + 1);
            CollectPreconditions.m26534a(k, v);
            Object[] objArr = this.f16724f;
            int i = this.f16661c;
            objArr[i] = k;
            this.f16725g[i] = v;
            this.f16661c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: p */
        public Builder<K, V> mo35339h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo35339h(entry);
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: q */
        public Builder<K, V> mo35340i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo35340i(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: r */
        public Builder<K, V> mo35341j(Map<? extends K, ? extends V> map) {
            super.mo35341j(map);
            return this;
        }

        private Builder(Comparator<? super K> comparator, int i) {
            this.f16726h = (Comparator) Preconditions.m5392s(comparator);
            this.f16724f = new Object[i];
            this.f16725g = new Object[i];
        }
    }

    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final Comparator<? super K> comparator;

        SerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Builder<K, V> mo35349b(int i) {
            return new Builder<>(this.comparator);
        }
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, (ImmutableSortedMap) null);
    }

    /* renamed from: C */
    public static <K, V> ImmutableSortedMap<K, V> m27546C() {
        return f16719z;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static <K, V> ImmutableSortedMap<K, V> m27547D(Comparator<? super K> comparator, K k, V v) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m27302F(k), (Comparator) Preconditions.m5392s(comparator)), ImmutableList.m27302F(v));
    }

    /* renamed from: w */
    static <K, V> ImmutableSortedMap<K, V> m27551w(Comparator<? super K> comparator) {
        if (Ordering.m28521e().equals(comparator)) {
            return m27546C();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.m27619T(comparator), ImmutableList.m27301D());
    }

    /* renamed from: x */
    private ImmutableSortedMap<K, V> m27552x(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return m27551w(comparator());
        }
        return new ImmutableSortedMap<>(this.f16720g.mo36319m0(i, i2), this.f16721o.subList(i, i2));
    }

    /* renamed from: A */
    public ImmutableSortedSet<K> mo35420l() {
        return this.f16720g;
    }

    /* renamed from: B */
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f16720g;
    }

    /* renamed from: E */
    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* renamed from: F */
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(k2);
        Preconditions.m5387n(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    /* renamed from: G */
    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    /* renamed from: H */
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return m27552x(this.f16720g.mo36321o0(Preconditions.m5392s(k), z), size());
    }

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return Maps.m28109x(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return mo35420l().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ImmutableSet<Map.Entry<K, V>> mo35412e() {
        return isEmpty() ? ImmutableSet.m27506F() : new ImmutableMapEntrySet<K, V>() {
            /* access modifiers changed from: package-private */
            /* renamed from: B */
            public ImmutableList<Map.Entry<K, V>> mo35439B() {
                return new ImmutableList<Map.Entry<K, V>>() {
                    /* renamed from: P */
                    public Map.Entry<K, V> get(int i) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f16720g.mo35029c().get(i), ImmutableSortedMap.this.f16721o.get(i));
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: j */
                    public boolean mo34781j() {
                        return true;
                    }

                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            /* access modifiers changed from: package-private */
            /* renamed from: O */
            public ImmutableMap<K, V> mo35428O() {
                return ImmutableSortedMap.this;
            }

            /* renamed from: k */
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return mo35029c().iterator();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ImmutableSet<K> mo34971f() {
        throw new AssertionError("should never be called");
    }

    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo35029c().get(0);
    }

    public K firstKey() {
        return mo35420l().first();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return Maps.m28109x(floorEntry(k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ImmutableCollection<V> mo35329g() {
        throw new AssertionError("should never be called");
    }

    public V get(Object obj) {
        int indexOf = this.f16720g.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f16721o.get(indexOf);
    }

    /* renamed from: h */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return Maps.m28109x(higherEntry(k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34967j() {
        return this.f16720g.mo34781j() || this.f16721o.mo34781j();
    }

    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo35029c().get(size() - 1);
    }

    public K lastKey() {
        return mo35420l().last();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return Maps.m28109x(lowerEntry(k));
    }

    /* renamed from: p */
    public ImmutableCollection<V> values() {
        return this.f16721o;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f16721o.size();
    }

    /* renamed from: u */
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f16720g.descendingSet();
    }

    /* renamed from: v */
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f16722p;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return m27551w(Ordering.m28520a(comparator()).mo34739j());
        }
        return new ImmutableSortedMap<>((RegularImmutableSortedSet) this.f16720g.descendingSet(), this.f16721o.mo35381I(), this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: y */
    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    /* renamed from: z */
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return m27552x(0, this.f16720g.mo36320n0(Preconditions.m5392s(k), z));
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f16720g = regularImmutableSortedSet;
        this.f16721o = immutableList;
        this.f16722p = immutableSortedMap;
    }
}
