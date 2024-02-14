package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbb extends zzq<Float> implements zzcw, RandomAccess {

    /* renamed from: f */
    private static final zzbb f45255f;

    /* renamed from: c */
    private float[] f45256c;

    /* renamed from: d */
    private int f45257d;

    static {
        zzbb zzbb = new zzbb(new float[0], 0);
        f45255f = zzbb;
        zzbb.mo53475h2();
    }

    zzbb() {
        this(new float[10], 0);
    }

    /* renamed from: d */
    private final void m63305d(int i, float f) {
        int i2;
        mo53665c();
        if (i < 0 || i > (i2 = this.f45257d)) {
            throw new IndexOutOfBoundsException(m63307i(i));
        }
        float[] fArr = this.f45256c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f45256c, i, fArr2, i + 1, this.f45257d - i);
            this.f45256c = fArr2;
        }
        this.f45256c[i] = f;
        this.f45257d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final void m63306h(int i) {
        if (i < 0 || i >= this.f45257d) {
            throw new IndexOutOfBoundsException(m63307i(i));
        }
    }

    /* renamed from: i */
    private final String m63307i(int i) {
        int i2 = this.f45257d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= this.f45257d) {
            return new zzbb(Arrays.copyOf(this.f45256c, i), this.f45257d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m63305d(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo53665c();
        zzbd.m63340a(collection);
        if (!(collection instanceof zzbb)) {
            return super.addAll(collection);
        }
        zzbb zzbb = (zzbb) collection;
        int i = zzbb.f45257d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45257d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f45256c;
            if (i3 > fArr.length) {
                this.f45256c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzbb.f45256c, 0, this.f45256c, this.f45257d, zzbb.f45257d);
            this.f45257d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbb)) {
            return super.equals(obj);
        }
        zzbb zzbb = (zzbb) obj;
        if (this.f45257d != zzbb.f45257d) {
            return false;
        }
        float[] fArr = zzbb.f45256c;
        for (int i = 0; i < this.f45257d; i++) {
            if (Float.floatToIntBits(this.f45256c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo53441f(float f) {
        m63305d(this.f45257d, f);
    }

    public final /* synthetic */ Object get(int i) {
        m63306h(i);
        return Float.valueOf(this.f45256c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45257d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f45256c[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo53665c();
        for (int i = 0; i < this.f45257d; i++) {
            if (obj.equals(Float.valueOf(this.f45256c[i]))) {
                float[] fArr = this.f45256c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f45257d - i) - 1);
                this.f45257d--;
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
            float[] fArr = this.f45256c;
            System.arraycopy(fArr, i2, fArr, i, this.f45257d - i2);
            this.f45257d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo53665c();
        m63306h(i);
        float[] fArr = this.f45256c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f45257d;
    }

    private zzbb(float[] fArr, int i) {
        this.f45256c = fArr;
        this.f45257d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        m63306h(i);
        float[] fArr = this.f45256c;
        float f = fArr[i];
        int i2 = this.f45257d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f45257d--;
        this.modCount++;
        return Float.valueOf(f);
    }
}
