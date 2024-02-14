package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: f */
    private static final DoubleArrayList f56767f;

    /* renamed from: c */
    private double[] f56768c;

    /* renamed from: d */
    private int f56769d;

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[0], 0);
        f56767f = doubleArrayList;
        doubleArrayList.mo64743U();
    }

    DoubleArrayList() {
        this(new double[10], 0);
    }

    /* renamed from: i */
    private void m80493i(int i, double d) {
        int i2;
        mo64748c();
        if (i < 0 || i > (i2 = this.f56769d)) {
            throw new IndexOutOfBoundsException(m80496n(i));
        }
        double[] dArr = this.f56768c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f56768c, i, dArr2, i + 1, this.f56769d - i);
            this.f56768c = dArr2;
        }
        this.f56768c[i] = d;
        this.f56769d++;
        this.modCount++;
    }

    /* renamed from: j */
    public static DoubleArrayList m80494j() {
        return f56767f;
    }

    /* renamed from: k */
    private void m80495k(int i) {
        if (i < 0 || i >= this.f56769d) {
            throw new IndexOutOfBoundsException(m80496n(i));
        }
    }

    /* renamed from: n */
    private String m80496n(int i) {
        return "Index:" + i + ", Size:" + this.f56769d;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo64748c();
        Internal.m80732a(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i = doubleArrayList.f56769d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56769d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f56768c;
            if (i3 > dArr.length) {
                this.f56768c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(doubleArrayList.f56768c, 0, this.f56768c, this.f56769d, doubleArrayList.f56769d);
            this.f56769d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i, Double d) {
        m80493i(i, d.doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f56769d != doubleArrayList.f56769d) {
            return false;
        }
        double[] dArr = doubleArrayList.f56768c;
        for (int i = 0; i < this.f56769d; i++) {
            if (Double.doubleToLongBits(this.f56768c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Double d) {
        mo65087h(d.doubleValue());
        return true;
    }

    /* renamed from: h */
    public void mo65087h(double d) {
        mo64748c();
        int i = this.f56769d;
        double[] dArr = this.f56768c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f56768c = dArr2;
        }
        double[] dArr3 = this.f56768c;
        int i2 = this.f56769d;
        this.f56769d = i2 + 1;
        dArr3[i2] = d;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56769d; i2++) {
            i = (i * 31) + Internal.m80737f(Double.doubleToLongBits(this.f56768c[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f56768c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Double get(int i) {
        return Double.valueOf(mo65090m(i));
    }

    /* renamed from: m */
    public double mo65090m(int i) {
        m80495k(i);
        return this.f56768c[i];
    }

    /* renamed from: o */
    public Internal.DoubleList mo64901q1(int i) {
        if (i >= this.f56769d) {
            return new DoubleArrayList(Arrays.copyOf(this.f56768c, i), this.f56769d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public Double remove(int i) {
        mo64748c();
        m80495k(i);
        double[] dArr = this.f56768c;
        double d = dArr[i];
        int i2 = this.f56769d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f56769d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: q */
    public Double set(int i, Double d) {
        return Double.valueOf(mo65095s(i, d.doubleValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo64748c();
        if (i2 >= i) {
            double[] dArr = this.f56768c;
            System.arraycopy(dArr, i2, dArr, i, this.f56769d - i2);
            this.f56769d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public double mo65095s(int i, double d) {
        mo64748c();
        m80495k(i);
        double[] dArr = this.f56768c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public int size() {
        return this.f56769d;
    }

    private DoubleArrayList(double[] dArr, int i) {
        this.f56768c = dArr;
        this.f56769d = i;
    }
}
