package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {

    /* renamed from: f */
    private static final ProtobufArrayList<Object> f57049f;

    /* renamed from: c */
    private E[] f57050c;

    /* renamed from: d */
    private int f57051d;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        f57049f = protobufArrayList;
        protobufArrayList.mo64743U();
    }

    ProtobufArrayList() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    private static <E> E[] m81047d(int i) {
        return new Object[i];
    }

    /* renamed from: f */
    public static <E> ProtobufArrayList<E> m81048f() {
        return f57049f;
    }

    /* renamed from: h */
    private void m81049h(int i) {
        if (i < 0 || i >= this.f57051d) {
            throw new IndexOutOfBoundsException(m81050i(i));
        }
    }

    /* renamed from: i */
    private String m81050i(int i) {
        return "Index:" + i + ", Size:" + this.f57051d;
    }

    public boolean add(E e) {
        mo64748c();
        int i = this.f57051d;
        E[] eArr = this.f57050c;
        if (i == eArr.length) {
            this.f57050c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f57050c;
        int i2 = this.f57051d;
        this.f57051d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        m81049h(i);
        return this.f57050c[i];
    }

    /* renamed from: j */
    public ProtobufArrayList<E> mo64901q1(int i) {
        if (i >= this.f57051d) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.f57050c, i), this.f57051d);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo64748c();
        m81049h(i);
        E[] eArr = this.f57050c;
        E e = eArr[i];
        int i2 = this.f57051d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f57051d--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo64748c();
        m81049h(i);
        E[] eArr = this.f57050c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f57051d;
    }

    private ProtobufArrayList(E[] eArr, int i) {
        this.f57050c = eArr;
        this.f57051d = i;
    }

    public void add(int i, E e) {
        int i2;
        mo64748c();
        if (i < 0 || i > (i2 = this.f57051d)) {
            throw new IndexOutOfBoundsException(m81050i(i));
        }
        E[] eArr = this.f57050c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] d = m81047d(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f57050c, 0, d, 0, i);
            System.arraycopy(this.f57050c, i, d, i + 1, this.f57051d - i);
            this.f57050c = d;
        }
        this.f57050c[i] = e;
        this.f57051d++;
        this.modCount++;
    }
}
