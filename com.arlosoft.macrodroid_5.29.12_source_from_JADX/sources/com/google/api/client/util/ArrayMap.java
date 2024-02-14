package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayMap<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    int f52727a;

    /* renamed from: c */
    private Object[] f52728c;

    final class Entry implements Map.Entry<K, V> {

        /* renamed from: a */
        private int f52729a;

        Entry(int i) {
            this.f52729a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!Objects.m72708a(getKey(), entry.getKey()) || !Objects.m72708a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return ArrayMap.this.mo60676f(this.f52729a);
        }

        public V getValue() {
            return ArrayMap.this.mo60677g(this.f52729a);
        }

        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public V setValue(V v) {
            return ArrayMap.this.mo60680l(this.f52729a, v);
        }
    }

    final class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private boolean f52731a;

        /* renamed from: c */
        private int f52732c;

        EntryIterator() {
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            int i = this.f52732c;
            ArrayMap arrayMap = ArrayMap.this;
            if (i != arrayMap.f52727a) {
                this.f52732c = i + 1;
                return new Entry(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f52732c < ArrayMap.this.f52727a;
        }

        public void remove() {
            int i = this.f52732c - 1;
            if (this.f52731a || i < 0) {
                throw new IllegalArgumentException();
            }
            ArrayMap.this.mo60679h(i);
            this.f52731a = true;
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        public int size() {
            return ArrayMap.this.f52727a;
        }
    }

    /* renamed from: b */
    public static <K, V> ArrayMap<K, V> m72611b() {
        return new ArrayMap<>();
    }

    /* renamed from: d */
    private int m72612d(Object obj) {
        int i = this.f52727a << 1;
        Object[] objArr = this.f52728c;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    /* renamed from: k */
    private V m72613k(int i) {
        int i2 = this.f52727a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V q = m72616q(i + 1);
        Object[] objArr = this.f52728c;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f52727a--;
        m72614o(i2 - 2, (Object) null, (Object) null);
        return q;
    }

    /* renamed from: o */
    private void m72614o(int i, K k, V v) {
        Object[] objArr = this.f52728c;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    /* renamed from: p */
    private void m72615p(int i) {
        if (i == 0) {
            this.f52728c = null;
            return;
        }
        int i2 = this.f52727a;
        Object[] objArr = this.f52728c;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.f52728c = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    /* renamed from: q */
    private V m72616q(int i) {
        if (i < 0) {
            return null;
        }
        return this.f52728c[i];
    }

    /* renamed from: a */
    public ArrayMap<K, V> clone() {
        try {
            ArrayMap<K, V> arrayMap = (ArrayMap) super.clone();
            Object[] objArr = this.f52728c;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                arrayMap.f52728c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return arrayMap;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo60669c(int i) {
        int i2;
        if (i >= 0) {
            Object[] objArr = this.f52728c;
            int i3 = i << 1;
            if (objArr == null) {
                i2 = 0;
            } else {
                i2 = objArr.length;
            }
            if (i3 > i2) {
                int i4 = ((i2 / 2) * 3) + 1;
                if (i4 % 2 != 0) {
                    i4++;
                }
                if (i4 >= i3) {
                    i3 = i4;
                }
                m72615p(i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void clear() {
        this.f52727a = 0;
        this.f52728c = null;
    }

    public final boolean containsKey(Object obj) {
        return -2 != m72612d(obj);
    }

    public final boolean containsValue(Object obj) {
        int i = this.f52727a << 1;
        Object[] objArr = this.f52728c;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo60674e(K k) {
        return m72612d(k) >> 1;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    /* renamed from: f */
    public final K mo60676f(int i) {
        if (i < 0 || i >= this.f52727a) {
            return null;
        }
        return this.f52728c[i << 1];
    }

    /* renamed from: g */
    public final V mo60677g(int i) {
        if (i < 0 || i >= this.f52727a) {
            return null;
        }
        return m72616q((i << 1) + 1);
    }

    public final V get(Object obj) {
        return m72616q(m72612d(obj) + 1);
    }

    /* renamed from: h */
    public final V mo60679h(int i) {
        return m72613k(i << 1);
    }

    /* renamed from: l */
    public final V mo60680l(int i, V v) {
        int i2 = this.f52727a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V q = m72616q(i3);
        this.f52728c[i3] = v;
        return q;
    }

    /* renamed from: n */
    public final V mo60681n(int i, K k, V v) {
        if (i >= 0) {
            int i2 = i + 1;
            mo60669c(i2);
            int i3 = i << 1;
            V q = m72616q(i3 + 1);
            m72614o(i3, k, v);
            if (i2 > this.f52727a) {
                this.f52727a = i2;
            }
            return q;
        }
        throw new IndexOutOfBoundsException();
    }

    public final V put(K k, V v) {
        int e = mo60674e(k);
        if (e == -1) {
            e = this.f52727a;
        }
        return mo60681n(e, k, v);
    }

    public final V remove(Object obj) {
        return m72613k(m72612d(obj));
    }

    public final int size() {
        return this.f52727a;
    }
}
