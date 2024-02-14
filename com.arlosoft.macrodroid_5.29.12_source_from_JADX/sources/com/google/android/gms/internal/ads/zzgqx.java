package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqx extends zzgpg implements RandomAccess, zzgsv {

    /* renamed from: f */
    private static final zzgqx f37135f;

    /* renamed from: c */
    private float[] f37136c;

    /* renamed from: d */
    private int f37137d;

    static {
        zzgqx zzgqx = new zzgqx(new float[0], 0);
        f37135f = zzgqx;
        zzgqx.zzb();
    }

    zzgqx() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m52926f(int i) {
        int i2 = this.f37137d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m52927h(int i) {
        if (i < 0 || i >= this.f37137d) {
            throw new IndexOutOfBoundsException(m52926f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzgrn mo47067G(int i) {
        if (i >= this.f37137d) {
            return new zzgqx(Arrays.copyOf(this.f37136c, i), this.f37137d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo47057c();
        if (i < 0 || i > (i2 = this.f37137d)) {
            throw new IndexOutOfBoundsException(m52926f(i));
        }
        float[] fArr = this.f37136c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f37136c, i, fArr2, i + 1, this.f37137d - i);
            this.f37136c = fArr2;
        }
        this.f37136c[i] = floatValue;
        this.f37137d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo47057c();
        zzgro.m53027e(collection);
        if (!(collection instanceof zzgqx)) {
            return super.addAll(collection);
        }
        zzgqx zzgqx = (zzgqx) collection;
        int i = zzgqx.f37137d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37137d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f37136c;
            if (i3 > fArr.length) {
                this.f37136c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzgqx.f37136c, 0, this.f37136c, this.f37137d, zzgqx.f37137d);
            this.f37137d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo47292d(float f) {
        mo47057c();
        int i = this.f37137d;
        float[] fArr = this.f37136c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f37136c = fArr2;
        }
        float[] fArr3 = this.f37136c;
        int i2 = this.f37137d;
        this.f37137d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqx)) {
            return super.equals(obj);
        }
        zzgqx zzgqx = (zzgqx) obj;
        if (this.f37137d != zzgqx.f37137d) {
            return false;
        }
        float[] fArr = zzgqx.f37136c;
        for (int i = 0; i < this.f37137d; i++) {
            if (Float.floatToIntBits(this.f37136c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m52927h(i);
        return Float.valueOf(this.f37136c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37137d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f37136c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f37137d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37136c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        m52927h(i);
        float[] fArr = this.f37136c;
        float f = fArr[i];
        int i2 = this.f37137d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f37137d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo47057c();
        if (i2 >= i) {
            float[] fArr = this.f37136c;
            System.arraycopy(fArr, i2, fArr, i, this.f37137d - i2);
            this.f37137d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo47057c();
        m52927h(i);
        float[] fArr = this.f37136c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f37137d;
    }

    private zzgqx(float[] fArr, int i) {
        this.f37136c = fArr;
        this.f37137d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo47292d(((Float) obj).floatValue());
        return true;
    }
}
