package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgrf extends zzgpg implements RandomAccess, zzgrj, zzgsv {

    /* renamed from: f */
    private static final zzgrf f37156f;

    /* renamed from: c */
    private int[] f37157c;

    /* renamed from: d */
    private int f37158d;

    static {
        zzgrf zzgrf = new zzgrf(new int[0], 0);
        f37156f = zzgrf;
        zzgrf.zzb();
    }

    zzgrf() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    public static zzgrf m53010f() {
        return f37156f;
    }

    /* renamed from: h */
    private final String m53011h(int i) {
        int i2 = this.f37158d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m53012i(int i) {
        if (i < 0 || i >= this.f37158d) {
            throw new IndexOutOfBoundsException(m53011h(i));
        }
    }

    /* renamed from: E */
    public final void mo47354E(int i) {
        mo47057c();
        int i2 = this.f37158d;
        int[] iArr = this.f37157c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f37157c = iArr2;
        }
        int[] iArr3 = this.f37157c;
        int i3 = this.f37158d;
        this.f37158d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo47057c();
        if (i < 0 || i > (i2 = this.f37158d)) {
            throw new IndexOutOfBoundsException(m53011h(i));
        }
        int[] iArr = this.f37157c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f37157c, i, iArr2, i + 1, this.f37158d - i);
            this.f37157c = iArr2;
        }
        this.f37157c[i] = intValue;
        this.f37158d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo47057c();
        zzgro.m53027e(collection);
        if (!(collection instanceof zzgrf)) {
            return super.addAll(collection);
        }
        zzgrf zzgrf = (zzgrf) collection;
        int i = zzgrf.f37158d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37158d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f37157c;
            if (i3 > iArr.length) {
                this.f37157c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzgrf.f37157c, 0, this.f37157c, this.f37158d, zzgrf.f37158d);
            this.f37158d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo47356d(int i) {
        m53012i(i);
        return this.f37157c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgrf)) {
            return super.equals(obj);
        }
        zzgrf zzgrf = (zzgrf) obj;
        if (this.f37158d != zzgrf.f37158d) {
            return false;
        }
        int[] iArr = zzgrf.f37157c;
        for (int i = 0; i < this.f37158d; i++) {
            if (this.f37157c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m53012i(i);
        return Integer.valueOf(this.f37157c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37158d; i2++) {
            i = (i * 31) + this.f37157c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f37158d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37157c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        m53012i(i);
        int[] iArr = this.f37157c;
        int i2 = iArr[i];
        int i3 = this.f37158d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f37158d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo47057c();
        if (i2 >= i) {
            int[] iArr = this.f37157c;
            System.arraycopy(iArr, i2, iArr, i, this.f37158d - i2);
            this.f37158d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo47057c();
        m53012i(i);
        int[] iArr = this.f37157c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f37158d;
    }

    /* renamed from: x */
    public final zzgrj mo47067G(int i) {
        if (i >= this.f37158d) {
            return new zzgrf(Arrays.copyOf(this.f37157c, i), this.f37158d);
        }
        throw new IllegalArgumentException();
    }

    private zzgrf(int[] iArr, int i) {
        this.f37157c = iArr;
        this.f37158d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo47354E(((Integer) obj).intValue());
        return true;
    }
}
