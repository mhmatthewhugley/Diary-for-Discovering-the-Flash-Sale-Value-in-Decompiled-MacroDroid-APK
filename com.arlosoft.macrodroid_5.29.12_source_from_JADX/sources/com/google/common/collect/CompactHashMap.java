package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final Object f16491A = new Object();

    /* renamed from: a */
    private transient Object f16492a;
    @VisibleForTesting

    /* renamed from: c */
    transient int[] f16493c;
    @VisibleForTesting

    /* renamed from: d */
    transient Object[] f16494d;
    @VisibleForTesting

    /* renamed from: f */
    transient Object[] f16495f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int f16496g;

    /* renamed from: o */
    private transient int f16497o;

    /* renamed from: p */
    private transient Set<K> f16498p;

    /* renamed from: s */
    private transient Set<Map.Entry<K, V>> f16499s;

    /* renamed from: z */
    private transient Collection<V> f16500z;

    class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        EntrySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            Map z = CompactHashMap.this.mo34848z();
            if (z != null) {
                return z.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int i = CompactHashMap.this.m26561G(entry.getKey());
            if (i == -1 || !Objects.m5349a(CompactHashMap.this.m26577c0(i), entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.mo34818B();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.CompactHashMap.m26585k(r9.f16504a);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                java.util.Map r0 = r0.mo34848z()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                boolean r0 = r0.mo34826O()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                int r0 = r0.m26560E()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object r5 = r10.m26566T()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                int[] r6 = r10.m26564Q()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r7 = r10.m26565R()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r8 = r10.m26567U()
                r4 = r0
                int r10 = com.google.common.collect.CompactHashing.m26653f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.this
                r1.mo34825N(r10, r0)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                com.google.common.collect.CompactHashMap.m26579e(r10)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                r10.mo34821F()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.EntrySetView.remove(java.lang.Object):boolean");
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    private abstract class Itr<T> implements Iterator<T> {

        /* renamed from: a */
        int f16505a;

        /* renamed from: c */
        int f16506c;

        /* renamed from: d */
        int f16507d;

        private Itr() {
            this.f16505a = CompactHashMap.this.f16496g;
            this.f16506c = CompactHashMap.this.mo34819C();
            this.f16507d = -1;
        }

        /* renamed from: a */
        private void m26614a() {
            if (CompactHashMap.this.f16496g != this.f16505a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: b */
        public abstract T mo34849b(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo34856c() {
            this.f16505a += 32;
        }

        public boolean hasNext() {
            return this.f16506c >= 0;
        }

        @ParametricNullness
        public T next() {
            m26614a();
            if (hasNext()) {
                int i = this.f16506c;
                this.f16507d = i;
                T b = mo34849b(i);
                this.f16506c = CompactHashMap.this.mo34820D(this.f16506c);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m26614a();
            CollectPreconditions.m26538e(this.f16507d >= 0);
            mo34856c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.m26562L(this.f16507d));
            this.f16506c = CompactHashMap.this.mo34837p(this.f16506c, this.f16507d);
            this.f16507d = -1;
        }
    }

    class KeySetView extends AbstractSet<K> {
        KeySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return CompactHashMap.this.mo34824M();
        }

        public boolean remove(Object obj) {
            Map z = CompactHashMap.this.mo34848z();
            if (z != null) {
                return z.keySet().remove(obj);
            }
            return CompactHashMap.this.m26563P(obj) != CompactHashMap.f16491A;
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    final class MapEntry extends AbstractMapEntry<K, V> {
        @ParametricNullness

        /* renamed from: a */
        private final K f16510a;

        /* renamed from: c */
        private int f16511c;

        MapEntry(int i) {
            this.f16510a = CompactHashMap.this.m26562L(i);
            this.f16511c = i;
        }

        /* renamed from: a */
        private void m26617a() {
            int i = this.f16511c;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.m5349a(this.f16510a, CompactHashMap.this.m26562L(this.f16511c))) {
                this.f16511c = CompactHashMap.this.m26561G(this.f16510a);
            }
        }

        @ParametricNullness
        public K getKey() {
            return this.f16510a;
        }

        @ParametricNullness
        public V getValue() {
            Map z = CompactHashMap.this.mo34848z();
            if (z != null) {
                return NullnessCasts.m28457a(z.get(this.f16510a));
            }
            m26617a();
            int i = this.f16511c;
            return i == -1 ? NullnessCasts.m28458b() : CompactHashMap.this.m26577c0(i);
        }

        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            Map z = CompactHashMap.this.mo34848z();
            if (z != null) {
                return NullnessCasts.m28457a(z.put(this.f16510a, v));
            }
            m26617a();
            int i = this.f16511c;
            if (i == -1) {
                CompactHashMap.this.put(this.f16510a, v);
                return NullnessCasts.m28458b();
            }
            V j = CompactHashMap.this.m26577c0(i);
            CompactHashMap.this.m26575b0(this.f16511c, v);
            return j;
        }
    }

    class ValuesView extends AbstractCollection<V> {
        ValuesView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<V> iterator() {
            return CompactHashMap.this.mo34831d0();
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        mo34822H(3);
    }

    /* renamed from: A */
    private int m26559A(int i) {
        return m26564Q()[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public int m26560E() {
        return (1 << (this.f16496g & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public int m26561G(Object obj) {
        if (mo34826O()) {
            return -1;
        }
        int d = Hashing.m27250d(obj);
        int E = m26560E();
        int h = CompactHashing.m26655h(m26566T(), d & E);
        if (h == 0) {
            return -1;
        }
        int b = CompactHashing.m26649b(d, E);
        do {
            int i = h - 1;
            int A = m26559A(i);
            if (CompactHashing.m26649b(A, E) == b && Objects.m5349a(obj, m26562L(i))) {
                return i;
            }
            h = CompactHashing.m26650c(A, E);
        } while (h != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public K m26562L(int i) {
        return m26565R()[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public Object m26563P(Object obj) {
        if (mo34826O()) {
            return f16491A;
        }
        int E = m26560E();
        int f = CompactHashing.m26653f(obj, (Object) null, E, m26566T(), m26564Q(), m26565R(), (Object[]) null);
        if (f == -1) {
            return f16491A;
        }
        Object c0 = m26577c0(f);
        mo34825N(f, E);
        this.f16497o--;
        mo34821F();
        return c0;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public int[] m26564Q() {
        int[] iArr = this.f16493c;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public Object[] m26565R() {
        Object[] objArr = this.f16494d;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public Object m26566T() {
        Object obj = this.f16492a;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public Object[] m26567U() {
        Object[] objArr = this.f16495f;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: W */
    private void m26568W(int i) {
        int min;
        int length = m26564Q().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo34827V(min);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: X */
    private int m26569X(int i, int i2, int i3, int i4) {
        Object a = CompactHashing.m26648a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.m26656i(a, i3 & i5, i4 + 1);
        }
        Object T = m26566T();
        int[] Q = m26564Q();
        for (int i6 = 0; i6 <= i; i6++) {
            int h = CompactHashing.m26655h(T, i6);
            while (h != 0) {
                int i7 = h - 1;
                int i8 = Q[i7];
                int b = CompactHashing.m26649b(i8, i) | i6;
                int i9 = b & i5;
                int h2 = CompactHashing.m26655h(a, i9);
                CompactHashing.m26656i(a, i9, h);
                Q[i7] = CompactHashing.m26651d(b, h2, i5);
                h = CompactHashing.m26650c(i8, i);
            }
        }
        this.f16492a = a;
        m26571Z(i5);
        return i5;
    }

    /* renamed from: Y */
    private void m26570Y(int i, int i2) {
        m26564Q()[i] = i2;
    }

    /* renamed from: Z */
    private void m26571Z(int i) {
        this.f16496g = CompactHashing.m26651d(this.f16496g, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: a0 */
    private void m26573a0(int i, K k) {
        m26565R()[i] = k;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m26575b0(int i, V v) {
        m26567U()[i] = v;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public V m26577c0(int i) {
        return m26567U()[i];
    }

    /* renamed from: e */
    static /* synthetic */ int m26579e(CompactHashMap compactHashMap) {
        int i = compactHashMap.f16497o;
        compactHashMap.f16497o = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo34822H(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    /* renamed from: t */
    public static <K, V> CompactHashMap<K, V> m26588t() {
        return new CompactHashMap<>();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator B = mo34818B();
        while (B.hasNext()) {
            Map.Entry entry = (Map.Entry) B.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: y */
    public static <K, V> CompactHashMap<K, V> m26589y(int i) {
        return new CompactHashMap<>(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Iterator<Map.Entry<K, V>> mo34818B() {
        Map z = mo34848z();
        if (z != null) {
            return z.entrySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Map.Entry<K, V> mo34849b(int i) {
                return new MapEntry(i);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo34819C() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo34820D(int i) {
        int i2 = i + 1;
        if (i2 < this.f16497o) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo34821F() {
        this.f16496g += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo34822H(int i) {
        Preconditions.m5378e(i >= 0, "Expected size must be >= 0");
        this.f16496g = Ints.m73616e(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo34823I(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        m26570Y(i, CompactHashing.m26651d(i2, 0, i3));
        m26573a0(i, k);
        m26575b0(i, v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public Iterator<K> mo34824M() {
        Map z = mo34848z();
        if (z != null) {
            return z.keySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<K>() {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public K mo34849b(int i) {
                return CompactHashMap.this.m26562L(i);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo34825N(int i, int i2) {
        Object T = m26566T();
        int[] Q = m26564Q();
        Object[] R = m26565R();
        Object[] U = m26567U();
        int size = size() - 1;
        if (i < size) {
            Object obj = R[size];
            R[i] = obj;
            U[i] = U[size];
            R[size] = null;
            U[size] = null;
            Q[i] = Q[size];
            Q[size] = 0;
            int d = Hashing.m27250d(obj) & i2;
            int h = CompactHashing.m26655h(T, d);
            int i3 = size + 1;
            if (h == i3) {
                CompactHashing.m26656i(T, d, i + 1);
                return;
            }
            while (true) {
                int i4 = h - 1;
                int i5 = Q[i4];
                int c = CompactHashing.m26650c(i5, i2);
                if (c == i3) {
                    Q[i4] = CompactHashing.m26651d(i5, i + 1, i2);
                    return;
                }
                h = c;
            }
        } else {
            R[i] = null;
            U[i] = null;
            Q[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: O */
    public boolean mo34826O() {
        return this.f16492a == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo34827V(int i) {
        this.f16493c = Arrays.copyOf(m26564Q(), i);
        this.f16494d = Arrays.copyOf(m26565R(), i);
        this.f16495f = Arrays.copyOf(m26567U(), i);
    }

    public void clear() {
        if (!mo34826O()) {
            mo34821F();
            Map z = mo34848z();
            if (z != null) {
                this.f16496g = Ints.m73616e(size(), 3, 1073741823);
                z.clear();
                this.f16492a = null;
                this.f16497o = 0;
                return;
            }
            Arrays.fill(m26565R(), 0, this.f16497o, (Object) null);
            Arrays.fill(m26567U(), 0, this.f16497o, (Object) null);
            CompactHashing.m26654g(m26566T());
            Arrays.fill(m26564Q(), 0, this.f16497o, 0);
            this.f16497o = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map z = mo34848z();
        if (z != null) {
            return z.containsKey(obj);
        }
        return m26561G(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map z = mo34848z();
        if (z != null) {
            return z.containsValue(obj);
        }
        for (int i = 0; i < this.f16497o; i++) {
            if (Objects.m5349a(obj, m26577c0(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public Iterator<V> mo34831d0() {
        Map z = mo34848z();
        if (z != null) {
            return z.values().iterator();
        }
        return new CompactHashMap<K, V>.Itr<V>() {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public V mo34849b(int i) {
                return CompactHashMap.this.m26577c0(i);
            }
        };
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f16499s;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> u = mo34843u();
        this.f16499s = u;
        return u;
    }

    public V get(Object obj) {
        Map z = mo34848z();
        if (z != null) {
            return z.get(obj);
        }
        int G = m26561G(obj);
        if (G == -1) {
            return null;
        }
        mo34836n(G);
        return m26577c0(G);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f16498p;
        if (set != null) {
            return set;
        }
        Set<K> w = mo34846w();
        this.f16498p = w;
        return w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo34836n(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo34837p(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        int i;
        int X;
        if (mo34826O()) {
            mo34839q();
        }
        Map z = mo34848z();
        if (z != null) {
            return z.put(k, v);
        }
        int[] Q = m26564Q();
        Object[] R = m26565R();
        V[] U = m26567U();
        int i2 = this.f16497o;
        int i3 = i2 + 1;
        int d = Hashing.m27250d(k);
        int E = m26560E();
        int i4 = d & E;
        int h = CompactHashing.m26655h(m26566T(), i4);
        if (h != 0) {
            int b = CompactHashing.m26649b(d, E);
            int i5 = 0;
            while (true) {
                int i6 = h - 1;
                int i7 = Q[i6];
                if (CompactHashing.m26649b(i7, E) != b || !Objects.m5349a(k, R[i6])) {
                    int c = CompactHashing.m26650c(i7, E);
                    i5++;
                    if (c != 0) {
                        h = c;
                    } else if (i5 >= 9) {
                        return mo34840r().put(k, v);
                    } else {
                        if (i3 > E) {
                            X = m26569X(E, CompactHashing.m26652e(E), d, i2);
                        } else {
                            Q[i6] = CompactHashing.m26651d(i7, i3, E);
                        }
                    }
                } else {
                    V v2 = U[i6];
                    U[i6] = v;
                    mo34836n(i6);
                    return v2;
                }
            }
            i = E;
            m26568W(i3);
            mo34823I(i2, k, v, d, i);
            this.f16497o = i3;
            mo34821F();
            return null;
        } else if (i3 > E) {
            X = m26569X(E, CompactHashing.m26652e(E), d, i2);
        } else {
            CompactHashing.m26656i(m26566T(), i4, i3);
            i = E;
            m26568W(i3);
            mo34823I(i2, k, v, d, i);
            this.f16497o = i3;
            mo34821F();
            return null;
        }
        i = X;
        m26568W(i3);
        mo34823I(i2, k, v, d, i);
        this.f16497o = i3;
        mo34821F();
        return null;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: q */
    public int mo34839q() {
        Preconditions.m5399z(mo34826O(), "Arrays already allocated");
        int i = this.f16496g;
        int j = CompactHashing.m26657j(i);
        this.f16492a = CompactHashing.m26648a(j);
        m26571Z(j - 1);
        this.f16493c = new int[i];
        this.f16494d = new Object[i];
        this.f16495f = new Object[i];
        return i;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    @VisibleForTesting
    /* renamed from: r */
    public Map<K, V> mo34840r() {
        Map<K, V> v = mo34844v(m26560E() + 1);
        int C = mo34819C();
        while (C >= 0) {
            v.put(m26562L(C), m26577c0(C));
            C = mo34820D(C);
        }
        this.f16492a = v;
        this.f16493c = null;
        this.f16494d = null;
        this.f16495f = null;
        mo34821F();
        return v;
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        Map z = mo34848z();
        if (z != null) {
            return z.remove(obj);
        }
        V P = m26563P(obj);
        if (P == f16491A) {
            return null;
        }
        return P;
    }

    public int size() {
        Map z = mo34848z();
        return z != null ? z.size() : this.f16497o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Set<Map.Entry<K, V>> mo34843u() {
        return new EntrySetView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Map<K, V> mo34844v(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f16500z;
        if (collection != null) {
            return collection;
        }
        Collection<V> x = mo34847x();
        this.f16500z = x;
        return x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Set<K> mo34846w() {
        return new KeySetView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Collection<V> mo34847x() {
        return new ValuesView();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: z */
    public Map<K, V> mo34848z() {
        Object obj = this.f16492a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    CompactHashMap(int i) {
        mo34822H(i);
    }
}
