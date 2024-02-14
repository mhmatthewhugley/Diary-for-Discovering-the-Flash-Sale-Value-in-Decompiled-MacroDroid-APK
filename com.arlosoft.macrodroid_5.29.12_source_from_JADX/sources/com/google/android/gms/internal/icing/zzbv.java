package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzbv extends zzbt<Boolean> implements RandomAccess, zzdc, zzel {

    /* renamed from: f */
    private static final zzbv f40785f;

    /* renamed from: c */
    private boolean[] f40786c;

    /* renamed from: d */
    private int f40787d;

    static {
        zzbv zzbv = new zzbv(new boolean[0], 0);
        f40785f = zzbv;
        zzbv.zzb();
    }

    zzbv() {
        this(new boolean[10], 0);
    }

    /* renamed from: d */
    public static zzbv m58647d() {
        return f40785f;
    }

    /* renamed from: f */
    private final void m58648f(int i) {
        if (i < 0 || i >= this.f40787d) {
            throw new IndexOutOfBoundsException(m58649h(i));
        }
    }

    /* renamed from: h */
    private final String m58649h(int i) {
        int i2 = this.f40787d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= this.f40787d) {
            return new zzbv(Arrays.copyOf(this.f40786c, i), this.f40787d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo50190c();
        if (i < 0 || i > (i2 = this.f40787d)) {
            throw new IndexOutOfBoundsException(m58649h(i));
        }
        boolean[] zArr = this.f40786c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f40786c, i, zArr2, i + 1, this.f40787d - i);
            this.f40786c = zArr2;
        }
        this.f40786c[i] = booleanValue;
        this.f40787d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo50190c();
        zzdh.m58816a(collection);
        if (!(collection instanceof zzbv)) {
            return super.addAll(collection);
        }
        zzbv zzbv = (zzbv) collection;
        int i = zzbv.f40787d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40787d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f40786c;
            if (i3 > zArr.length) {
                this.f40786c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzbv.f40786c, 0, this.f40786c, this.f40787d, zzbv.f40787d);
            this.f40787d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbv)) {
            return super.equals(obj);
        }
        zzbv zzbv = (zzbv) obj;
        if (this.f40787d != zzbv.f40787d) {
            return false;
        }
        boolean[] zArr = zzbv.f40786c;
        for (int i = 0; i < this.f40787d; i++) {
            if (this.f40786c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m58648f(i);
        return Boolean.valueOf(this.f40786c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40787d; i2++) {
            i = (i * 31) + zzdh.m58821f(this.f40786c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f40787d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40786c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50190c();
        m58648f(i);
        boolean[] zArr = this.f40786c;
        boolean z = zArr[i];
        int i2 = this.f40787d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f40787d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo50190c();
        if (i2 >= i) {
            boolean[] zArr = this.f40786c;
            System.arraycopy(zArr, i2, zArr, i, this.f40787d - i2);
            this.f40787d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo50190c();
        m58648f(i);
        boolean[] zArr = this.f40786c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f40787d;
    }

    private zzbv(boolean[] zArr, int i) {
        this.f40786c = zArr;
        this.f40787d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo50190c();
        int i = this.f40787d;
        boolean[] zArr = this.f40786c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f40786c = zArr2;
        }
        boolean[] zArr3 = this.f40786c;
        int i2 = this.f40787d;
        this.f40787d = i2 + 1;
        zArr3[i2] = booleanValue;
        return true;
    }
}
