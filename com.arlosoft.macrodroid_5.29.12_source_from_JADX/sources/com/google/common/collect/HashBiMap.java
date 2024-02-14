package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: A */
    private transient int f16607A;

    /* renamed from: B */
    private transient int[] f16608B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public transient int[] f16609C;

    /* renamed from: D */
    private transient Set<K> f16610D;

    /* renamed from: E */
    private transient Set<V> f16611E;

    /* renamed from: F */
    private transient Set<Map.Entry<K, V>> f16612F;
    /* access modifiers changed from: private */
    @RetainedWith
    @LazyInit

    /* renamed from: G */
    public transient BiMap<V, K> f16613G;

    /* renamed from: a */
    transient K[] f16614a;

    /* renamed from: c */
    transient V[] f16615c;

    /* renamed from: d */
    transient int f16616d;

    /* renamed from: f */
    transient int f16617f;

    /* renamed from: g */
    private transient int[] f16618g;

    /* renamed from: o */
    private transient int[] f16619o;

    /* renamed from: p */
    private transient int[] f16620p;

    /* renamed from: s */
    private transient int[] f16621s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public transient int f16622z;

    final class EntryForKey extends AbstractMapEntry<K, V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16623a;

        /* renamed from: c */
        int f16624c;

        EntryForKey(int i) {
            this.f16623a = NullnessCasts.m28457a(HashBiMap.this.f16614a[i]);
            this.f16624c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35298a() {
            int i = this.f16624c;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.f16616d && Objects.m5349a(hashBiMap.f16614a[i], this.f16623a)) {
                    return;
                }
            }
            this.f16624c = HashBiMap.this.mo35286m(this.f16623a);
        }

        @ParametricNullness
        public K getKey() {
            return this.f16623a;
        }

        @ParametricNullness
        public V getValue() {
            mo35298a();
            int i = this.f16624c;
            return i == -1 ? NullnessCasts.m28458b() : NullnessCasts.m28457a(HashBiMap.this.f16615c[i]);
        }

        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            mo35298a();
            int i = this.f16624c;
            if (i == -1) {
                HashBiMap.this.put(this.f16623a, v);
                return NullnessCasts.m28458b();
            }
            V a = NullnessCasts.m28457a(HashBiMap.this.f16615c[i]);
            if (Objects.m5349a(a, v)) {
                return v;
            }
            HashBiMap.this.m27195F(this.f16624c, v, false);
            return a;
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* renamed from: a */
        final HashBiMap<K, V> f16626a;
        @ParametricNullness

        /* renamed from: c */
        final V f16627c;

        /* renamed from: d */
        int f16628d;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
            this.f16626a = hashBiMap;
            this.f16627c = NullnessCasts.m28457a(hashBiMap.f16615c[i]);
            this.f16628d = i;
        }

        /* renamed from: a */
        private void m27226a() {
            int i = this.f16628d;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f16626a;
                if (i <= hashBiMap.f16616d && Objects.m5349a(this.f16627c, hashBiMap.f16615c[i])) {
                    return;
                }
            }
            this.f16628d = this.f16626a.mo35288p(this.f16627c);
        }

        @ParametricNullness
        public V getKey() {
            return this.f16627c;
        }

        @ParametricNullness
        public K getValue() {
            m27226a();
            int i = this.f16628d;
            return i == -1 ? NullnessCasts.m28458b() : NullnessCasts.m28457a(this.f16626a.f16614a[i]);
        }

        @ParametricNullness
        public K setValue(@ParametricNullness K k) {
            m27226a();
            int i = this.f16628d;
            if (i == -1) {
                this.f16626a.mo35296y(this.f16627c, k, false);
                return NullnessCasts.m28458b();
            }
            K a = NullnessCasts.m28457a(this.f16626a.f16614a[i]);
            if (Objects.m5349a(a, k)) {
                return k;
            }
            this.f16626a.m27194E(this.f16628d, k, false);
            return a;
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m = HashBiMap.this.mo35286m(key);
            if (m == -1 || !Objects.m5349a(value, HashBiMap.this.f16615c[m])) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map.Entry<K, V> mo35299c(int i) {
            return new EntryForKey(i);
        }

        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = Hashing.m27250d(key);
            int n = HashBiMap.this.mo35287n(key, d);
            if (n == -1 || !Objects.m5349a(value, HashBiMap.this.f16615c[n])) {
                return false;
            }
            HashBiMap.this.mo35276B(n, d);
            return true;
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* renamed from: a */
        private transient Set<Map.Entry<V, K>> f16630a;
        private final HashBiMap<K, V> forward;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            BiMap unused = this.forward.f16613G = this;
        }

        public void clear() {
            this.forward.clear();
        }

        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f16630a;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.f16630a = inverseEntrySet;
            return inverseEntrySet;
        }

        public K get(Object obj) {
            return this.forward.mo35291r(obj);
        }

        public Set<V> keySet() {
            return this.forward.values();
        }

        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v, @ParametricNullness K k) {
            return this.forward.mo35296y(v, k, false);
        }

        @CanIgnoreReturnValue
        public K remove(Object obj) {
            return this.forward.mo35278D(obj);
        }

        public int size() {
            return this.forward.f16616d;
        }

        /* renamed from: x0 */
        public BiMap<K, V> mo34390x0() {
            return this.forward;
        }

        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int p = this.f16633a.mo35288p(key);
            if (p == -1 || !Objects.m5349a(this.f16633a.f16614a[p], value)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map.Entry<V, K> mo35299c(int i) {
            return new EntryForValue(this.f16633a, i);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = Hashing.m27250d(key);
            int q = this.f16633a.mo35290q(key, d);
            if (q == -1 || !Objects.m5349a(this.f16633a.f16614a[q], value)) {
                return false;
            }
            this.f16633a.mo35277C(q, d);
            return true;
        }
    }

    final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: c */
        public K mo35299c(int i) {
            return NullnessCasts.m28457a(HashBiMap.this.f16614a[i]);
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            int d = Hashing.m27250d(obj);
            int n = HashBiMap.this.mo35287n(obj, d);
            if (n == -1) {
                return false;
            }
            HashBiMap.this.mo35276B(n, d);
            return true;
        }
    }

    final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: c */
        public V mo35299c(int i) {
            return NullnessCasts.m28457a(HashBiMap.this.f16615c[i]);
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public boolean remove(Object obj) {
            int d = Hashing.m27250d(obj);
            int q = HashBiMap.this.mo35290q(obj, d);
            if (q == -1) {
                return false;
            }
            HashBiMap.this.mo35277C(q, d);
            return true;
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {

        /* renamed from: a */
        final HashBiMap<K, V> f16633a;

        View(HashBiMap<K, V> hashBiMap) {
            this.f16633a = hashBiMap;
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: c */
        public abstract T mo35299c(int i);

        public void clear() {
            this.f16633a.clear();
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {

                /* renamed from: a */
                private int f16634a;

                /* renamed from: c */
                private int f16635c = -1;

                /* renamed from: d */
                private int f16636d;

                /* renamed from: f */
                private int f16637f;

                {
                    this.f16634a = View.this.f16633a.f16622z;
                    HashBiMap<K, V> hashBiMap = View.this.f16633a;
                    this.f16636d = hashBiMap.f16617f;
                    this.f16637f = hashBiMap.f16616d;
                }

                /* renamed from: a */
                private void m27235a() {
                    if (View.this.f16633a.f16617f != this.f16636d) {
                        throw new ConcurrentModificationException();
                    }
                }

                public boolean hasNext() {
                    m27235a();
                    return this.f16634a != -2 && this.f16637f > 0;
                }

                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        T c = View.this.mo35299c(this.f16634a);
                        this.f16635c = this.f16634a;
                        this.f16634a = View.this.f16633a.f16609C[this.f16634a];
                        this.f16637f--;
                        return c;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    m27235a();
                    CollectPreconditions.m26538e(this.f16635c != -1);
                    View.this.f16633a.mo35297z(this.f16635c);
                    int i = this.f16634a;
                    HashBiMap<K, V> hashBiMap = View.this.f16633a;
                    if (i == hashBiMap.f16616d) {
                        this.f16634a = this.f16635c;
                    }
                    this.f16635c = -1;
                    this.f16636d = hashBiMap.f16617f;
                }
            };
        }

        public int size() {
            return this.f16633a.f16616d;
        }
    }

    /* renamed from: A */
    private void m27193A(int i, int i2, int i3) {
        Preconditions.m5377d(i != -1);
        m27204h(i, i2);
        m27205i(i, i3);
        m27196G(this.f16608B[i], this.f16609C[i]);
        m27210w(this.f16616d - 1, i);
        K[] kArr = this.f16614a;
        int i4 = this.f16616d;
        kArr[i4 - 1] = null;
        this.f16615c[i4 - 1] = null;
        this.f16616d = i4 - 1;
        this.f16617f++;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m27194E(int i, @ParametricNullness K k, boolean z) {
        Preconditions.m5377d(i != -1);
        int d = Hashing.m27250d(k);
        int n = mo35287n(k, d);
        int i2 = this.f16607A;
        int i3 = -2;
        if (n != -1) {
            if (z) {
                i2 = this.f16608B[n];
                i3 = this.f16609C[n];
                mo35276B(n, d);
                if (i == this.f16616d) {
                    i = n;
                }
            } else {
                String valueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i2 == i) {
            i2 = this.f16608B[i];
        } else if (i2 == this.f16616d) {
            i2 = n;
        }
        if (i3 == i) {
            n = this.f16609C[i];
        } else if (i3 != this.f16616d) {
            n = i3;
        }
        m27196G(this.f16608B[i], this.f16609C[i]);
        m27204h(i, Hashing.m27250d(this.f16614a[i]));
        this.f16614a[i] = k;
        m27208u(i, Hashing.m27250d(k));
        m27196G(i2, i);
        m27196G(i, n);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m27195F(int i, @ParametricNullness V v, boolean z) {
        Preconditions.m5377d(i != -1);
        int d = Hashing.m27250d(v);
        int q = mo35290q(v, d);
        if (q != -1) {
            if (z) {
                mo35277C(q, d);
                if (i == this.f16616d) {
                    i = q;
                }
            } else {
                String valueOf = String.valueOf(v);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m27205i(i, Hashing.m27250d(this.f16615c[i]));
        this.f16615c[i] = v;
        m27209v(i, d);
    }

    /* renamed from: G */
    private void m27196G(int i, int i2) {
        if (i == -2) {
            this.f16622z = i2;
        } else {
            this.f16609C[i] = i2;
        }
        if (i2 == -2) {
            this.f16607A = i;
        } else {
            this.f16608B[i2] = i;
        }
    }

    /* renamed from: f */
    private int m27202f(int i) {
        return i & (this.f16618g.length - 1);
    }

    /* renamed from: g */
    private static int[] m27203g(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: h */
    private void m27204h(int i, int i2) {
        Preconditions.m5377d(i != -1);
        int f = m27202f(i2);
        int[] iArr = this.f16618g;
        if (iArr[f] == i) {
            int[] iArr2 = this.f16620p;
            iArr[f] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[f];
        int i4 = this.f16620p[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f16614a[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.f16620p;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f16620p[i3];
            }
        }
    }

    /* renamed from: i */
    private void m27205i(int i, int i2) {
        Preconditions.m5377d(i != -1);
        int f = m27202f(i2);
        int[] iArr = this.f16619o;
        if (iArr[f] == i) {
            int[] iArr2 = this.f16621s;
            iArr[f] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[f];
        int i4 = this.f16621s[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f16615c[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.f16621s;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f16621s[i3];
            }
        }
    }

    /* renamed from: j */
    private void m27206j(int i) {
        int[] iArr = this.f16620p;
        if (iArr.length < i) {
            int d = ImmutableCollection.Builder.m27291d(iArr.length, i);
            this.f16614a = Arrays.copyOf(this.f16614a, d);
            this.f16615c = Arrays.copyOf(this.f16615c, d);
            this.f16620p = m27207k(this.f16620p, d);
            this.f16621s = m27207k(this.f16621s, d);
            this.f16608B = m27207k(this.f16608B, d);
            this.f16609C = m27207k(this.f16609C, d);
        }
        if (this.f16618g.length < i) {
            int a = Hashing.m27247a(i, 1.0d);
            this.f16618g = m27203g(a);
            this.f16619o = m27203g(a);
            for (int i2 = 0; i2 < this.f16616d; i2++) {
                int f = m27202f(Hashing.m27250d(this.f16614a[i2]));
                int[] iArr2 = this.f16620p;
                int[] iArr3 = this.f16618g;
                iArr2[i2] = iArr3[f];
                iArr3[f] = i2;
                int f2 = m27202f(Hashing.m27250d(this.f16615c[i2]));
                int[] iArr4 = this.f16621s;
                int[] iArr5 = this.f16619o;
                iArr4[i2] = iArr5[f2];
                iArr5[f2] = i2;
            }
        }
    }

    /* renamed from: k */
    private static int[] m27207k(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int h = Serialization.m28710h(objectInputStream);
        mo35294t(16);
        Serialization.m28705c(this, objectInputStream, h);
    }

    /* renamed from: u */
    private void m27208u(int i, int i2) {
        Preconditions.m5377d(i != -1);
        int f = m27202f(i2);
        int[] iArr = this.f16620p;
        int[] iArr2 = this.f16618g;
        iArr[i] = iArr2[f];
        iArr2[f] = i;
    }

    /* renamed from: v */
    private void m27209v(int i, int i2) {
        Preconditions.m5377d(i != -1);
        int f = m27202f(i2);
        int[] iArr = this.f16621s;
        int[] iArr2 = this.f16619o;
        iArr[i] = iArr2[f];
        iArr2[f] = i;
    }

    /* renamed from: w */
    private void m27210w(int i, int i2) {
        int i3;
        int i4;
        if (i != i2) {
            int i5 = this.f16608B[i];
            int i6 = this.f16609C[i];
            m27196G(i5, i2);
            m27196G(i2, i6);
            K[] kArr = this.f16614a;
            K k = kArr[i];
            V[] vArr = this.f16615c;
            V v = vArr[i];
            kArr[i2] = k;
            vArr[i2] = v;
            int f = m27202f(Hashing.m27250d(k));
            int[] iArr = this.f16618g;
            if (iArr[f] == i) {
                iArr[f] = i2;
            } else {
                int i7 = iArr[f];
                int i8 = this.f16620p[i7];
                while (true) {
                    int i9 = i8;
                    i4 = i7;
                    i7 = i9;
                    if (i7 == i) {
                        break;
                    }
                    i8 = this.f16620p[i7];
                }
                this.f16620p[i4] = i2;
            }
            int[] iArr2 = this.f16620p;
            iArr2[i2] = iArr2[i];
            iArr2[i] = -1;
            int f2 = m27202f(Hashing.m27250d(v));
            int[] iArr3 = this.f16619o;
            if (iArr3[f2] == i) {
                iArr3[f2] = i2;
            } else {
                int i10 = iArr3[f2];
                int i11 = this.f16621s[i10];
                while (true) {
                    int i12 = i11;
                    i3 = i10;
                    i10 = i12;
                    if (i10 == i) {
                        break;
                    }
                    i11 = this.f16621s[i10];
                }
                this.f16621s[i3] = i2;
            }
            int[] iArr4 = this.f16621s;
            iArr4[i2] = iArr4[i];
            iArr4[i] = -1;
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m28711i(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo35276B(int i, int i2) {
        m27193A(i, i2, Hashing.m27250d(this.f16615c[i]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo35277C(int i, int i2) {
        m27193A(i, Hashing.m27250d(this.f16614a[i]), i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public K mo35278D(Object obj) {
        int d = Hashing.m27250d(obj);
        int q = mo35290q(obj, d);
        if (q == -1) {
            return null;
        }
        K k = this.f16614a[q];
        mo35277C(q, d);
        return k;
    }

    public void clear() {
        Arrays.fill(this.f16614a, 0, this.f16616d, (Object) null);
        Arrays.fill(this.f16615c, 0, this.f16616d, (Object) null);
        Arrays.fill(this.f16618g, -1);
        Arrays.fill(this.f16619o, -1);
        Arrays.fill(this.f16620p, 0, this.f16616d, -1);
        Arrays.fill(this.f16621s, 0, this.f16616d, -1);
        Arrays.fill(this.f16608B, 0, this.f16616d, -1);
        Arrays.fill(this.f16609C, 0, this.f16616d, -1);
        this.f16616d = 0;
        this.f16622z = -2;
        this.f16607A = -2;
        this.f16617f++;
    }

    public boolean containsKey(Object obj) {
        return mo35286m(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        return mo35288p(obj) != -1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f16612F;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f16612F = entrySet;
        return entrySet;
    }

    public V get(Object obj) {
        int m = mo35286m(obj);
        if (m == -1) {
            return null;
        }
        return this.f16615c[m];
    }

    public Set<K> keySet() {
        Set<K> set = this.f16610D;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f16610D = keySet;
        return keySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo35285l(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m27202f(i)];
        while (i2 != -1) {
            if (Objects.m5349a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo35286m(Object obj) {
        return mo35287n(obj, Hashing.m27250d(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo35287n(Object obj, int i) {
        return mo35285l(obj, i, this.f16618g, this.f16620p, this.f16614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo35288p(Object obj) {
        return mo35290q(obj, Hashing.m27250d(obj));
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return mo35295x(k, v, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo35290q(Object obj, int i) {
        return mo35285l(obj, i, this.f16619o, this.f16621s, this.f16615c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public K mo35291r(Object obj) {
        int p = mo35288p(obj);
        if (p == -1) {
            return null;
        }
        return this.f16614a[p];
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        int d = Hashing.m27250d(obj);
        int n = mo35287n(obj, d);
        if (n == -1) {
            return null;
        }
        V v = this.f16615c[n];
        mo35276B(n, d);
        return v;
    }

    public int size() {
        return this.f16616d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo35294t(int i) {
        CollectPreconditions.m26535b(i, "expectedSize");
        int a = Hashing.m27247a(i, 1.0d);
        this.f16616d = 0;
        this.f16614a = new Object[i];
        this.f16615c = new Object[i];
        this.f16618g = m27203g(a);
        this.f16619o = m27203g(a);
        this.f16620p = m27203g(i);
        this.f16621s = m27203g(i);
        this.f16622z = -2;
        this.f16607A = -2;
        this.f16608B = m27203g(i);
        this.f16609C = m27203g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public V mo35295x(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        int d = Hashing.m27250d(k);
        int n = mo35287n(k, d);
        if (n != -1) {
            V v2 = this.f16615c[n];
            if (Objects.m5349a(v2, v)) {
                return v;
            }
            m27195F(n, v, z);
            return v2;
        }
        int d2 = Hashing.m27250d(v);
        int q = mo35290q(v, d2);
        if (!z) {
            Preconditions.m5385l(q == -1, "Value already present: %s", v);
        } else if (q != -1) {
            mo35277C(q, d2);
        }
        m27206j(this.f16616d + 1);
        K[] kArr = this.f16614a;
        int i = this.f16616d;
        kArr[i] = k;
        this.f16615c[i] = v;
        m27208u(i, d);
        m27209v(this.f16616d, d2);
        m27196G(this.f16607A, this.f16616d);
        m27196G(this.f16616d, -2);
        this.f16616d++;
        this.f16617f++;
        return null;
    }

    /* renamed from: x0 */
    public BiMap<V, K> mo34390x0() {
        BiMap<V, K> biMap = this.f16613G;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.f16613G = inverse;
        return inverse;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: y */
    public K mo35296y(@ParametricNullness V v, @ParametricNullness K k, boolean z) {
        int d = Hashing.m27250d(v);
        int q = mo35290q(v, d);
        if (q != -1) {
            K k2 = this.f16614a[q];
            if (Objects.m5349a(k2, k)) {
                return k;
            }
            m27194E(q, k, z);
            return k2;
        }
        int i = this.f16607A;
        int d2 = Hashing.m27250d(k);
        int n = mo35287n(k, d2);
        if (!z) {
            Preconditions.m5385l(n == -1, "Key already present: %s", k);
        } else if (n != -1) {
            i = this.f16608B[n];
            mo35276B(n, d2);
        }
        m27206j(this.f16616d + 1);
        K[] kArr = this.f16614a;
        int i2 = this.f16616d;
        kArr[i2] = k;
        this.f16615c[i2] = v;
        m27208u(i2, d2);
        m27209v(this.f16616d, d);
        int i3 = i == -2 ? this.f16622z : this.f16609C[i];
        m27196G(i, this.f16616d);
        m27196G(this.f16616d, i3);
        this.f16616d++;
        this.f16617f++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo35297z(int i) {
        mo35276B(i, Hashing.m27250d(this.f16614a[i]));
    }

    public Set<V> values() {
        Set<V> set = this.f16611E;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f16611E = valueSet;
        return valueSet;
    }
}
