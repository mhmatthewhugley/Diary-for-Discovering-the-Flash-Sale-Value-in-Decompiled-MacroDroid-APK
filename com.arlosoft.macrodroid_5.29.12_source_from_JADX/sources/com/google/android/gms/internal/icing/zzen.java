package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzen<E> extends zzbt<E> implements RandomAccess {

    /* renamed from: f */
    private static final zzen<Object> f40940f;

    /* renamed from: c */
    private E[] f40941c;

    /* renamed from: d */
    private int f40942d;

    static {
        zzen<Object> zzen = new zzen<>(new Object[0], 0);
        f40940f = zzen;
        zzen.zzb();
    }

    zzen() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static <E> zzen<E> m58922d() {
        return f40940f;
    }

    /* renamed from: f */
    private final void m58923f(int i) {
        if (i < 0 || i >= this.f40942d) {
            throw new IndexOutOfBoundsException(m58924h(i));
        }
    }

    /* renamed from: h */
    private final String m58924h(int i) {
        int i2 = this.f40942d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= this.f40942d) {
            return new zzen(Arrays.copyOf(this.f40941c, i), this.f40942d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        int i2;
        mo50190c();
        if (i < 0 || i > (i2 = this.f40942d)) {
            throw new IndexOutOfBoundsException(m58924h(i));
        }
        E[] eArr = this.f40941c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f40941c, i, eArr2, i + 1, this.f40942d - i);
            this.f40941c = eArr2;
        }
        this.f40941c[i] = e;
        this.f40942d++;
        this.modCount++;
    }

    public final E get(int i) {
        m58923f(i);
        return this.f40941c[i];
    }

    public final E remove(int i) {
        mo50190c();
        m58923f(i);
        E[] eArr = this.f40941c;
        E e = eArr[i];
        int i2 = this.f40942d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f40942d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo50190c();
        m58923f(i);
        E[] eArr = this.f40941c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f40942d;
    }

    private zzen(E[] eArr, int i) {
        this.f40941c = eArr;
        this.f40942d = i;
    }

    public final boolean add(E e) {
        mo50190c();
        int i = this.f40942d;
        E[] eArr = this.f40941c;
        if (i == eArr.length) {
            this.f40941c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f40941c;
        int i2 = this.f40942d;
        this.f40942d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
