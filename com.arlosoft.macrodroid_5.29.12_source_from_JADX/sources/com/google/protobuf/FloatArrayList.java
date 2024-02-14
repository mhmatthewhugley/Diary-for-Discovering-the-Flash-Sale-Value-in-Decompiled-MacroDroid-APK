package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: f */
    private static final FloatArrayList f56903f;

    /* renamed from: c */
    private float[] f56904c;

    /* renamed from: d */
    private int f56905d;

    static {
        FloatArrayList floatArrayList = new FloatArrayList(new float[0], 0);
        f56903f = floatArrayList;
        floatArrayList.mo64743U();
    }

    FloatArrayList() {
        this(new float[10], 0);
    }

    /* renamed from: i */
    private void m80610i(int i, float f) {
        int i2;
        mo64748c();
        if (i < 0 || i > (i2 = this.f56905d)) {
            throw new IndexOutOfBoundsException(m80612m(i));
        }
        float[] fArr = this.f56904c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f56904c, i, fArr2, i + 1, this.f56905d - i);
            this.f56904c = fArr2;
        }
        this.f56904c[i] = f;
        this.f56905d++;
        this.modCount++;
    }

    /* renamed from: j */
    private void m80611j(int i) {
        if (i < 0 || i >= this.f56905d) {
            throw new IndexOutOfBoundsException(m80612m(i));
        }
    }

    /* renamed from: m */
    private String m80612m(int i) {
        return "Index:" + i + ", Size:" + this.f56905d;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo64748c();
        Internal.m80732a(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i = floatArrayList.f56905d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56905d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f56904c;
            if (i3 > fArr.length) {
                this.f56904c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(floatArrayList.f56904c, 0, this.f56904c, this.f56905d, floatArrayList.f56905d);
            this.f56905d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i, Float f) {
        m80610i(i, f.floatValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f56905d != floatArrayList.f56905d) {
            return false;
        }
        float[] fArr = floatArrayList.f56904c;
        for (int i = 0; i < this.f56905d; i++) {
            if (Float.floatToIntBits(this.f56904c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Float f) {
        mo65156h(f.floatValue());
        return true;
    }

    /* renamed from: h */
    public void mo65156h(float f) {
        mo64748c();
        int i = this.f56905d;
        float[] fArr = this.f56904c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f56904c = fArr2;
        }
        float[] fArr3 = this.f56904c;
        int i2 = this.f56905d;
        this.f56905d = i2 + 1;
        fArr3[i2] = f;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56905d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f56904c[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f56904c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Float get(int i) {
        return Float.valueOf(mo65159l(i));
    }

    /* renamed from: l */
    public float mo65159l(int i) {
        m80611j(i);
        return this.f56904c[i];
    }

    /* renamed from: n */
    public Internal.FloatList mo64901q1(int i) {
        if (i >= this.f56905d) {
            return new FloatArrayList(Arrays.copyOf(this.f56904c, i), this.f56905d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Float remove(int i) {
        mo64748c();
        m80611j(i);
        float[] fArr = this.f56904c;
        float f = fArr[i];
        int i2 = this.f56905d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f56905d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: p */
    public Float set(int i, Float f) {
        return Float.valueOf(mo65163q(i, f.floatValue()));
    }

    /* renamed from: q */
    public float mo65163q(int i, float f) {
        mo64748c();
        m80611j(i);
        float[] fArr = this.f56904c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo64748c();
        if (i2 >= i) {
            float[] fArr = this.f56904c;
            System.arraycopy(fArr, i2, fArr, i, this.f56905d - i2);
            this.f56905d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f56905d;
    }

    private FloatArrayList(float[] fArr, int i) {
        this.f56904c = fArr;
        this.f56905d = i;
    }
}
