package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbg extends zzah implements RandomAccess, zzdj {

    /* renamed from: f */
    private static final zzbg f45556f;

    /* renamed from: c */
    private double[] f45557c;

    /* renamed from: d */
    private int f45558d;

    static {
        zzbg zzbg = new zzbg(new double[0], 0);
        f45556f = zzbg;
        zzbg.zzb();
    }

    zzbg() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m64154f(int i) {
        int i2 = this.f45558d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m64155h(int i) {
        if (i < 0 || i >= this.f45558d) {
            throw new IndexOutOfBoundsException(m64154f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzcc mo53817G(int i) {
        if (i >= this.f45558d) {
            return new zzbg(Arrays.copyOf(this.f45557c, i), this.f45558d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo53807c();
        if (i < 0 || i > (i2 = this.f45558d)) {
            throw new IndexOutOfBoundsException(m64154f(i));
        }
        double[] dArr = this.f45557c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f45557c, i, dArr2, i + 1, this.f45558d - i);
            this.f45557c = dArr2;
        }
        this.f45557c[i] = doubleValue;
        this.f45558d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo53807c();
        zzcd.m64226e(collection);
        if (!(collection instanceof zzbg)) {
            return super.addAll(collection);
        }
        zzbg zzbg = (zzbg) collection;
        int i = zzbg.f45558d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45558d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f45557c;
            if (i3 > dArr.length) {
                this.f45557c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzbg.f45557c, 0, this.f45557c, this.f45558d, zzbg.f45558d);
            this.f45558d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo53906d(double d) {
        mo53807c();
        int i = this.f45558d;
        double[] dArr = this.f45557c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f45557c = dArr2;
        }
        double[] dArr3 = this.f45557c;
        int i2 = this.f45558d;
        this.f45558d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return super.equals(obj);
        }
        zzbg zzbg = (zzbg) obj;
        if (this.f45558d != zzbg.f45558d) {
            return false;
        }
        double[] dArr = zzbg.f45557c;
        for (int i = 0; i < this.f45558d; i++) {
            if (Double.doubleToLongBits(this.f45557c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m64155h(i);
        return Double.valueOf(this.f45557c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45558d; i2++) {
            i = (i * 31) + zzcd.m64224c(Double.doubleToLongBits(this.f45557c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f45558d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45557c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        m64155h(i);
        double[] dArr = this.f45557c;
        double d = dArr[i];
        int i2 = this.f45558d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f45558d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53807c();
        if (i2 >= i) {
            double[] dArr = this.f45557c;
            System.arraycopy(dArr, i2, dArr, i, this.f45558d - i2);
            this.f45558d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo53807c();
        m64155h(i);
        double[] dArr = this.f45557c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f45558d;
    }

    private zzbg(double[] dArr, int i) {
        this.f45557c = dArr;
        this.f45558d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo53906d(((Double) obj).doubleValue());
        return true;
    }
}
