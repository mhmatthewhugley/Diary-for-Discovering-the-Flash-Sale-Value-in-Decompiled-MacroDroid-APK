package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbq extends zzah implements RandomAccess, zzca, zzdj {

    /* renamed from: f */
    private static final zzbq f45623f;

    /* renamed from: c */
    private float[] f45624c;

    /* renamed from: d */
    private int f45625d;

    static {
        zzbq zzbq = new zzbq(new float[0], 0);
        f45623f = zzbq;
        zzbq.zzb();
    }

    zzbq() {
        this(new float[10], 0);
    }

    /* renamed from: d */
    public static zzbq m64172d() {
        return f45623f;
    }

    /* renamed from: h */
    private final String m64173h(int i) {
        int i2 = this.f45625d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m64174i(int i) {
        if (i < 0 || i >= this.f45625d) {
            throw new IndexOutOfBoundsException(m64173h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo53807c();
        if (i < 0 || i > (i2 = this.f45625d)) {
            throw new IndexOutOfBoundsException(m64173h(i));
        }
        float[] fArr = this.f45624c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f45624c, i, fArr2, i + 1, this.f45625d - i);
            this.f45624c = fArr2;
        }
        this.f45624c[i] = floatValue;
        this.f45625d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo53807c();
        zzcd.m64226e(collection);
        if (!(collection instanceof zzbq)) {
            return super.addAll(collection);
        }
        zzbq zzbq = (zzbq) collection;
        int i = zzbq.f45625d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45625d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f45624c;
            if (i3 > fArr.length) {
                this.f45624c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzbq.f45624c, 0, this.f45624c, this.f45625d, zzbq.f45625d);
            this.f45625d = i3;
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
        if (!(obj instanceof zzbq)) {
            return super.equals(obj);
        }
        zzbq zzbq = (zzbq) obj;
        if (this.f45625d != zzbq.f45625d) {
            return false;
        }
        float[] fArr = zzbq.f45624c;
        for (int i = 0; i < this.f45625d; i++) {
            if (Float.floatToIntBits(this.f45624c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo53926f(float f) {
        mo53807c();
        int i = this.f45625d;
        float[] fArr = this.f45624c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f45624c = fArr2;
        }
        float[] fArr3 = this.f45624c;
        int i2 = this.f45625d;
        this.f45625d = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ Object get(int i) {
        m64174i(i);
        return Float.valueOf(this.f45624c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45625d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f45624c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f45625d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45624c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        m64174i(i);
        float[] fArr = this.f45624c;
        float f = fArr[i];
        int i2 = this.f45625d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f45625d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53807c();
        if (i2 >= i) {
            float[] fArr = this.f45624c;
            System.arraycopy(fArr, i2, fArr, i, this.f45625d - i2);
            this.f45625d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo53807c();
        m64174i(i);
        float[] fArr = this.f45624c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f45625d;
    }

    /* renamed from: y */
    public final zzca mo53817G(int i) {
        if (i >= this.f45625d) {
            return new zzbq(Arrays.copyOf(this.f45624c, i), this.f45625d);
        }
        throw new IllegalArgumentException();
    }

    private zzbq(float[] fArr, int i) {
        this.f45624c = fArr;
        this.f45625d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo53926f(((Float) obj).floatValue());
        return true;
    }
}
