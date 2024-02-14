package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjy extends zzip implements RandomAccess, zzlt {

    /* renamed from: f */
    private static final zzjy f41622f;

    /* renamed from: c */
    private float[] f41623c;

    /* renamed from: d */
    private int f41624d;

    static {
        zzjy zzjy = new zzjy(new float[0], 0);
        f41622f = zzjy;
        zzjy.zzb();
    }

    zzjy() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m60478f(int i) {
        int i2 = this.f41624d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m60479h(int i) {
        if (i < 0 || i >= this.f41624d) {
            throw new IndexOutOfBoundsException(m60478f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzkm mo51322G(int i) {
        if (i >= this.f41624d) {
            return new zzjy(Arrays.copyOf(this.f41623c, i), this.f41624d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo51312c();
        if (i < 0 || i > (i2 = this.f41624d)) {
            throw new IndexOutOfBoundsException(m60478f(i));
        }
        float[] fArr = this.f41623c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f41623c, i, fArr2, i + 1, this.f41624d - i);
            this.f41623c = fArr2;
        }
        this.f41623c[i] = floatValue;
        this.f41624d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo51312c();
        zzkn.m60542e(collection);
        if (!(collection instanceof zzjy)) {
            return super.addAll(collection);
        }
        zzjy zzjy = (zzjy) collection;
        int i = zzjy.f41624d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f41624d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f41623c;
            if (i3 > fArr.length) {
                this.f41623c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzjy.f41623c, 0, this.f41623c, this.f41624d, zzjy.f41624d);
            this.f41624d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo51430d(float f) {
        mo51312c();
        int i = this.f41624d;
        float[] fArr = this.f41623c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f41623c = fArr2;
        }
        float[] fArr3 = this.f41623c;
        int i2 = this.f41624d;
        this.f41624d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjy)) {
            return super.equals(obj);
        }
        zzjy zzjy = (zzjy) obj;
        if (this.f41624d != zzjy.f41624d) {
            return false;
        }
        float[] fArr = zzjy.f41623c;
        for (int i = 0; i < this.f41624d; i++) {
            if (Float.floatToIntBits(this.f41623c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m60479h(i);
        return Float.valueOf(this.f41623c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41624d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f41623c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f41624d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41623c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo51312c();
        m60479h(i);
        float[] fArr = this.f41623c;
        float f = fArr[i];
        int i2 = this.f41624d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f41624d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo51312c();
        if (i2 >= i) {
            float[] fArr = this.f41623c;
            System.arraycopy(fArr, i2, fArr, i, this.f41624d - i2);
            this.f41624d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo51312c();
        m60479h(i);
        float[] fArr = this.f41623c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f41624d;
    }

    private zzjy(float[] fArr, int i) {
        this.f41623c = fArr;
        this.f41624d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo51430d(((Float) obj).floatValue());
        return true;
    }
}
