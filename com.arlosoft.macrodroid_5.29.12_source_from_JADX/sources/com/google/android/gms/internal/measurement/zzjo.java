package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjo extends zzip implements RandomAccess, zzlt {

    /* renamed from: f */
    private static final zzjo f41554f;

    /* renamed from: c */
    private double[] f41555c;

    /* renamed from: d */
    private int f41556d;

    static {
        zzjo zzjo = new zzjo(new double[0], 0);
        f41554f = zzjo;
        zzjo.zzb();
    }

    zzjo() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m60459f(int i) {
        int i2 = this.f41556d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m60460h(int i) {
        if (i < 0 || i >= this.f41556d) {
            throw new IndexOutOfBoundsException(m60459f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzkm mo51322G(int i) {
        if (i >= this.f41556d) {
            return new zzjo(Arrays.copyOf(this.f41555c, i), this.f41556d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo51312c();
        if (i < 0 || i > (i2 = this.f41556d)) {
            throw new IndexOutOfBoundsException(m60459f(i));
        }
        double[] dArr = this.f41555c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f41555c, i, dArr2, i + 1, this.f41556d - i);
            this.f41555c = dArr2;
        }
        this.f41555c[i] = doubleValue;
        this.f41556d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo51312c();
        zzkn.m60542e(collection);
        if (!(collection instanceof zzjo)) {
            return super.addAll(collection);
        }
        zzjo zzjo = (zzjo) collection;
        int i = zzjo.f41556d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f41556d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f41555c;
            if (i3 > dArr.length) {
                this.f41555c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzjo.f41555c, 0, this.f41555c, this.f41556d, zzjo.f41556d);
            this.f41556d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo51409d(double d) {
        mo51312c();
        int i = this.f41556d;
        double[] dArr = this.f41555c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f41555c = dArr2;
        }
        double[] dArr3 = this.f41555c;
        int i2 = this.f41556d;
        this.f41556d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjo)) {
            return super.equals(obj);
        }
        zzjo zzjo = (zzjo) obj;
        if (this.f41556d != zzjo.f41556d) {
            return false;
        }
        double[] dArr = zzjo.f41555c;
        for (int i = 0; i < this.f41556d; i++) {
            if (Double.doubleToLongBits(this.f41555c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m60460h(i);
        return Double.valueOf(this.f41555c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41556d; i2++) {
            i = (i * 31) + zzkn.m60540c(Double.doubleToLongBits(this.f41555c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f41556d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41555c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo51312c();
        m60460h(i);
        double[] dArr = this.f41555c;
        double d = dArr[i];
        int i2 = this.f41556d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f41556d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo51312c();
        if (i2 >= i) {
            double[] dArr = this.f41555c;
            System.arraycopy(dArr, i2, dArr, i, this.f41556d - i2);
            this.f41556d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo51312c();
        m60460h(i);
        double[] dArr = this.f41555c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f41556d;
    }

    private zzjo(double[] dArr, int i) {
        this.f41555c = dArr;
        this.f41556d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo51409d(((Double) obj).doubleValue());
        return true;
    }
}
