package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacz extends zzabn implements RandomAccess, zzaer {

    /* renamed from: f */
    private static final zzacz f39732f;

    /* renamed from: c */
    private float[] f39733c;

    /* renamed from: d */
    private int f39734d;

    static {
        zzacz zzacz = new zzacz(new float[0], 0);
        f39732f = zzacz;
        zzacz.zzb();
    }

    zzacz() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m56404f(int i) {
        int i2 = this.f39734d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m56405h(int i) {
        if (i < 0 || i >= this.f39734d) {
            throw new IndexOutOfBoundsException(m56404f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39734d) {
            return new zzacz(Arrays.copyOf(this.f39733c, i), this.f39734d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo48867c();
        if (i < 0 || i > (i2 = this.f39734d)) {
            throw new IndexOutOfBoundsException(m56404f(i));
        }
        float[] fArr = this.f39733c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f39733c, i, fArr2, i + 1, this.f39734d - i);
            this.f39733c = fArr2;
        }
        this.f39733c[i] = floatValue;
        this.f39734d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo48867c();
        zzadl.m56461e(collection);
        if (!(collection instanceof zzacz)) {
            return super.addAll(collection);
        }
        zzacz zzacz = (zzacz) collection;
        int i = zzacz.f39734d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39734d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f39733c;
            if (i3 > fArr.length) {
                this.f39733c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzacz.f39733c, 0, this.f39733c, this.f39734d, zzacz.f39734d);
            this.f39734d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo49059d(float f) {
        mo48867c();
        int i = this.f39734d;
        float[] fArr = this.f39733c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f39733c = fArr2;
        }
        float[] fArr3 = this.f39733c;
        int i2 = this.f39734d;
        this.f39734d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacz)) {
            return super.equals(obj);
        }
        zzacz zzacz = (zzacz) obj;
        if (this.f39734d != zzacz.f39734d) {
            return false;
        }
        float[] fArr = zzacz.f39733c;
        for (int i = 0; i < this.f39734d; i++) {
            if (Float.floatToIntBits(this.f39733c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m56405h(i);
        return Float.valueOf(this.f39733c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39734d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f39733c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f39734d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39733c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        m56405h(i);
        float[] fArr = this.f39733c;
        float f = fArr[i];
        int i2 = this.f39734d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f39734d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo48867c();
        if (i2 >= i) {
            float[] fArr = this.f39733c;
            System.arraycopy(fArr, i2, fArr, i, this.f39734d - i2);
            this.f39734d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo48867c();
        m56405h(i);
        float[] fArr = this.f39733c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f39734d;
    }

    private zzacz(float[] fArr, int i) {
        this.f39733c = fArr;
        this.f39734d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo49059d(((Float) obj).floatValue());
        return true;
    }
}
