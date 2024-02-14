package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzco extends zzbt<Double> implements RandomAccess, zzdd, zzel {

    /* renamed from: f */
    private static final zzco f40806f;

    /* renamed from: c */
    private double[] f40807c;

    /* renamed from: d */
    private int f40808d;

    static {
        zzco zzco = new zzco(new double[0], 0);
        f40806f = zzco;
        zzco.zzb();
    }

    zzco() {
        this(new double[10], 0);
    }

    /* renamed from: d */
    public static zzco m58764d() {
        return f40806f;
    }

    /* renamed from: f */
    private final void m58765f(int i) {
        if (i < 0 || i >= this.f40808d) {
            throw new IndexOutOfBoundsException(m58766h(i));
        }
    }

    /* renamed from: h */
    private final String m58766h(int i) {
        int i2 = this.f40808d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= this.f40808d) {
            return new zzco(Arrays.copyOf(this.f40807c, i), this.f40808d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo50190c();
        if (i < 0 || i > (i2 = this.f40808d)) {
            throw new IndexOutOfBoundsException(m58766h(i));
        }
        double[] dArr = this.f40807c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f40807c, i, dArr2, i + 1, this.f40808d - i);
            this.f40807c = dArr2;
        }
        this.f40807c[i] = doubleValue;
        this.f40808d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo50190c();
        zzdh.m58816a(collection);
        if (!(collection instanceof zzco)) {
            return super.addAll(collection);
        }
        zzco zzco = (zzco) collection;
        int i = zzco.f40808d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40808d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f40807c;
            if (i3 > dArr.length) {
                this.f40807c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzco.f40807c, 0, this.f40807c, this.f40808d, zzco.f40808d);
            this.f40808d = i3;
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
        if (!(obj instanceof zzco)) {
            return super.equals(obj);
        }
        zzco zzco = (zzco) obj;
        if (this.f40808d != zzco.f40808d) {
            return false;
        }
        double[] dArr = zzco.f40807c;
        for (int i = 0; i < this.f40808d; i++) {
            if (Double.doubleToLongBits(this.f40807c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m58765f(i);
        return Double.valueOf(this.f40807c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40808d; i2++) {
            i = (i * 31) + zzdh.m58820e(Double.doubleToLongBits(this.f40807c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f40808d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40807c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50190c();
        m58765f(i);
        double[] dArr = this.f40807c;
        double d = dArr[i];
        int i2 = this.f40808d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f40808d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo50190c();
        if (i2 >= i) {
            double[] dArr = this.f40807c;
            System.arraycopy(dArr, i2, dArr, i, this.f40808d - i2);
            this.f40808d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo50190c();
        m58765f(i);
        double[] dArr = this.f40807c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f40808d;
    }

    private zzco(double[] dArr, int i) {
        this.f40807c = dArr;
        this.f40808d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo50190c();
        int i = this.f40808d;
        double[] dArr = this.f40807c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f40807c = dArr2;
        }
        double[] dArr3 = this.f40807c;
        int i2 = this.f40808d;
        this.f40808d = i2 + 1;
        dArr3[i2] = doubleValue;
        return true;
    }
}
