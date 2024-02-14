package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzao extends zzq<Double> implements zzcw, RandomAccess {

    /* renamed from: f */
    private static final zzao f45174f;

    /* renamed from: c */
    private double[] f45175c;

    /* renamed from: d */
    private int f45176d;

    static {
        zzao zzao = new zzao(new double[0], 0);
        f45174f = zzao;
        zzao.mo53475h2();
    }

    zzao() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final void m63247f(int i, double d) {
        int i2;
        mo53665c();
        if (i < 0 || i > (i2 = this.f45176d)) {
            throw new IndexOutOfBoundsException(m63249i(i));
        }
        double[] dArr = this.f45175c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f45175c, i, dArr2, i + 1, this.f45176d - i);
            this.f45175c = dArr2;
        }
        this.f45175c[i] = d;
        this.f45176d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final void m63248h(int i) {
        if (i < 0 || i >= this.f45176d) {
            throw new IndexOutOfBoundsException(m63249i(i));
        }
    }

    /* renamed from: i */
    private final String m63249i(int i) {
        int i2 = this.f45176d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= this.f45176d) {
            return new zzao(Arrays.copyOf(this.f45175c, i), this.f45176d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m63247f(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo53665c();
        zzbd.m63340a(collection);
        if (!(collection instanceof zzao)) {
            return super.addAll(collection);
        }
        zzao zzao = (zzao) collection;
        int i = zzao.f45176d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45176d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f45175c;
            if (i3 > dArr.length) {
                this.f45175c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzao.f45175c, 0, this.f45175c, this.f45176d, zzao.f45176d);
            this.f45176d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final void mo53399d(double d) {
        m63247f(this.f45176d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzao)) {
            return super.equals(obj);
        }
        zzao zzao = (zzao) obj;
        if (this.f45176d != zzao.f45176d) {
            return false;
        }
        double[] dArr = zzao.f45175c;
        for (int i = 0; i < this.f45176d; i++) {
            if (Double.doubleToLongBits(this.f45175c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m63248h(i);
        return Double.valueOf(this.f45175c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45176d; i2++) {
            i = (i * 31) + zzbd.m63349j(Double.doubleToLongBits(this.f45175c[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo53665c();
        for (int i = 0; i < this.f45176d; i++) {
            if (obj.equals(Double.valueOf(this.f45175c[i]))) {
                double[] dArr = this.f45175c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f45176d - i) - 1);
                this.f45176d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53665c();
        if (i2 >= i) {
            double[] dArr = this.f45175c;
            System.arraycopy(dArr, i2, dArr, i, this.f45176d - i2);
            this.f45176d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo53665c();
        m63248h(i);
        double[] dArr = this.f45175c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f45176d;
    }

    private zzao(double[] dArr, int i) {
        this.f45175c = dArr;
        this.f45176d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        m63248h(i);
        double[] dArr = this.f45175c;
        double d = dArr[i];
        int i2 = this.f45176d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f45176d--;
        this.modCount++;
        return Double.valueOf(d);
    }
}
