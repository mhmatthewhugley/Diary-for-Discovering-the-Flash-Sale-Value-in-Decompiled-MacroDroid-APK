package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final K[] f5525a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final V[] f5526c;

    /* renamed from: d */
    private final Comparator<K> f5527d;

    public ArraySortedMap(Comparator<K> comparator) {
        this.f5525a = new Object[0];
        this.f5526c = new Object[0];
        this.f5527d = comparator;
    }

    /* renamed from: o */
    private static <T> T[] m7627o(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    /* renamed from: p */
    public static <A, B, C> ArraySortedMap<A, C> m7628p(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A next : list) {
            objArr[i] = next;
            objArr2[i] = map.get(keyTranslator.mo23551a(next));
            i++;
        }
        return new ArraySortedMap<>(comparator, objArr, objArr2);
    }

    /* renamed from: q */
    private int m7629q(K k) {
        int i = 0;
        for (K compare : this.f5525a) {
            if (this.f5527d.compare(k, compare) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: s */
    private int m7630s(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.f5525a;
            if (i >= kArr.length || this.f5527d.compare(kArr[i], k) >= 0) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: t */
    private Iterator<Map.Entry<K, V>> m7631t(int i, boolean z) {
        return new Iterator<Map.Entry<K, V>>(i, z) {

            /* renamed from: a */
            int f5528a;

            /* renamed from: c */
            final /* synthetic */ int f5529c;

            /* renamed from: d */
            final /* synthetic */ boolean f5530d;

            {
                this.f5529c = r2;
                this.f5530d = r3;
                this.f5528a = r2;
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                Object obj = ArraySortedMap.this.f5525a[this.f5528a];
                Object[] n = ArraySortedMap.this.f5526c;
                int i = this.f5528a;
                Object obj2 = n[i];
                this.f5528a = this.f5530d ? i - 1 : i + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            public boolean hasNext() {
                if (this.f5530d) {
                    if (this.f5528a >= 0) {
                        return true;
                    }
                } else if (this.f5528a < ArraySortedMap.this.f5525a.length) {
                    return true;
                }
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    /* renamed from: u */
    private static <T> T[] m7632u(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* renamed from: w */
    private static <T> T[] m7633w(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    /* renamed from: c */
    public boolean mo23533c(K k) {
        return m7629q(k) != -1;
    }

    /* renamed from: d */
    public V mo23534d(K k) {
        int q = m7629q(k);
        if (q != -1) {
            return this.f5526c[q];
        }
        return null;
    }

    /* renamed from: f */
    public Comparator<K> mo23535f() {
        return this.f5527d;
    }

    /* renamed from: h */
    public K mo23536h() {
        K[] kArr = this.f5525a;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    /* renamed from: i */
    public K mo23537i() {
        K[] kArr = this.f5525a;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    public boolean isEmpty() {
        return this.f5525a.length == 0;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return m7631t(0, false);
    }

    /* renamed from: j */
    public ImmutableSortedMap<K, V> mo23540j(K k, V v) {
        int q = m7629q(k);
        if (q != -1) {
            K[] kArr = this.f5525a;
            if (kArr[q] == k && this.f5526c[q] == v) {
                return this;
            }
            return new ArraySortedMap(this.f5527d, m7633w(kArr, q, k), m7633w(this.f5526c, q, v));
        } else if (this.f5525a.length > 25) {
            HashMap hashMap = new HashMap(this.f5525a.length + 1);
            int i = 0;
            while (true) {
                K[] kArr2 = this.f5525a;
                if (i < kArr2.length) {
                    hashMap.put(kArr2[i], this.f5526c[i]);
                    i++;
                } else {
                    hashMap.put(k, v);
                    return RBTreeSortedMap.m7709n(hashMap, this.f5527d);
                }
            }
        } else {
            int s = m7630s(k);
            return new ArraySortedMap(this.f5527d, m7627o(this.f5525a, s, k), m7627o(this.f5526c, s, v));
        }
    }

    /* renamed from: k */
    public Iterator<Map.Entry<K, V>> mo23541k(K k) {
        return m7631t(m7630s(k), false);
    }

    /* renamed from: l */
    public ImmutableSortedMap<K, V> mo23542l(K k) {
        int q = m7629q(k);
        if (q == -1) {
            return this;
        }
        return new ArraySortedMap(this.f5527d, m7632u(this.f5525a, q), m7632u(this.f5526c, q));
    }

    public int size() {
        return this.f5525a.length;
    }

    private ArraySortedMap(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f5525a = kArr;
        this.f5526c = vArr;
        this.f5527d = comparator;
    }
}
