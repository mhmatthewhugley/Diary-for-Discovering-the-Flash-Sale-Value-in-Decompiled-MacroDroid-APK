package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqn extends zzgpg implements RandomAccess, zzgsv {

    /* renamed from: f */
    private static final zzgqn f37067f;

    /* renamed from: c */
    private double[] f37068c;

    /* renamed from: d */
    private int f37069d;

    static {
        zzgqn zzgqn = new zzgqn(new double[0], 0);
        f37067f = zzgqn;
        zzgqn.zzb();
    }

    zzgqn() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m52896f(int i) {
        int i2 = this.f37069d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m52897h(int i) {
        if (i < 0 || i >= this.f37069d) {
            throw new IndexOutOfBoundsException(m52896f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzgrn mo47067G(int i) {
        if (i >= this.f37069d) {
            return new zzgqn(Arrays.copyOf(this.f37068c, i), this.f37069d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo47057c();
        if (i < 0 || i > (i2 = this.f37069d)) {
            throw new IndexOutOfBoundsException(m52896f(i));
        }
        double[] dArr = this.f37068c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f37068c, i, dArr2, i + 1, this.f37069d - i);
            this.f37068c = dArr2;
        }
        this.f37068c[i] = doubleValue;
        this.f37069d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo47057c();
        zzgro.m53027e(collection);
        if (!(collection instanceof zzgqn)) {
            return super.addAll(collection);
        }
        zzgqn zzgqn = (zzgqn) collection;
        int i = zzgqn.f37069d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37069d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f37068c;
            if (i3 > dArr.length) {
                this.f37068c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzgqn.f37068c, 0, this.f37068c, this.f37069d, zzgqn.f37069d);
            this.f37069d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo47266d(double d) {
        mo47057c();
        int i = this.f37069d;
        double[] dArr = this.f37068c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f37068c = dArr2;
        }
        double[] dArr3 = this.f37068c;
        int i2 = this.f37069d;
        this.f37069d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqn)) {
            return super.equals(obj);
        }
        zzgqn zzgqn = (zzgqn) obj;
        if (this.f37069d != zzgqn.f37069d) {
            return false;
        }
        double[] dArr = zzgqn.f37068c;
        for (int i = 0; i < this.f37069d; i++) {
            if (Double.doubleToLongBits(this.f37068c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m52897h(i);
        return Double.valueOf(this.f37068c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37069d; i2++) {
            i = (i * 31) + zzgro.m53025c(Double.doubleToLongBits(this.f37068c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f37069d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37068c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        m52897h(i);
        double[] dArr = this.f37068c;
        double d = dArr[i];
        int i2 = this.f37069d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f37069d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo47057c();
        if (i2 >= i) {
            double[] dArr = this.f37068c;
            System.arraycopy(dArr, i2, dArr, i, this.f37069d - i2);
            this.f37069d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo47057c();
        m52897h(i);
        double[] dArr = this.f37068c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f37069d;
    }

    private zzgqn(double[] dArr, int i) {
        this.f37068c = dArr;
        this.f37069d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo47266d(((Double) obj).doubleValue());
        return true;
    }
}
