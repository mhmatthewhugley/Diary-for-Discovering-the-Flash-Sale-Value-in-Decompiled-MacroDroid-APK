package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacp extends zzabn implements RandomAccess, zzaer {

    /* renamed from: f */
    private static final zzacp f39665f;

    /* renamed from: c */
    private double[] f39666c;

    /* renamed from: d */
    private int f39667d;

    static {
        zzacp zzacp = new zzacp(new double[0], 0);
        f39665f = zzacp;
        zzacp.zzb();
    }

    zzacp() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m56375f(int i) {
        int i2 = this.f39667d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m56376h(int i) {
        if (i < 0 || i >= this.f39667d) {
            throw new IndexOutOfBoundsException(m56375f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39667d) {
            return new zzacp(Arrays.copyOf(this.f39666c, i), this.f39667d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo48867c();
        if (i < 0 || i > (i2 = this.f39667d)) {
            throw new IndexOutOfBoundsException(m56375f(i));
        }
        double[] dArr = this.f39666c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f39666c, i, dArr2, i + 1, this.f39667d - i);
            this.f39666c = dArr2;
        }
        this.f39666c[i] = doubleValue;
        this.f39667d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo48867c();
        zzadl.m56461e(collection);
        if (!(collection instanceof zzacp)) {
            return super.addAll(collection);
        }
        zzacp zzacp = (zzacp) collection;
        int i = zzacp.f39667d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39667d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f39666c;
            if (i3 > dArr.length) {
                this.f39666c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzacp.f39666c, 0, this.f39666c, this.f39667d, zzacp.f39667d);
            this.f39667d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo49033d(double d) {
        mo48867c();
        int i = this.f39667d;
        double[] dArr = this.f39666c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f39666c = dArr2;
        }
        double[] dArr3 = this.f39666c;
        int i2 = this.f39667d;
        this.f39667d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacp)) {
            return super.equals(obj);
        }
        zzacp zzacp = (zzacp) obj;
        if (this.f39667d != zzacp.f39667d) {
            return false;
        }
        double[] dArr = zzacp.f39666c;
        for (int i = 0; i < this.f39667d; i++) {
            if (Double.doubleToLongBits(this.f39666c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m56376h(i);
        return Double.valueOf(this.f39666c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39667d; i2++) {
            i = (i * 31) + zzadl.m56459c(Double.doubleToLongBits(this.f39666c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f39667d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39666c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        m56376h(i);
        double[] dArr = this.f39666c;
        double d = dArr[i];
        int i2 = this.f39667d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f39667d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo48867c();
        if (i2 >= i) {
            double[] dArr = this.f39666c;
            System.arraycopy(dArr, i2, dArr, i, this.f39667d - i2);
            this.f39667d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo48867c();
        m56376h(i);
        double[] dArr = this.f39666c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f39667d;
    }

    private zzacp(double[] dArr, int i) {
        this.f39666c = dArr;
        this.f39667d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo49033d(((Double) obj).doubleValue());
        return true;
    }
}
