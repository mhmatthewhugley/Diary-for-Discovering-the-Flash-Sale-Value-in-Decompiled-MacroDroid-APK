package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbw extends zzah implements RandomAccess, zzdj {

    /* renamed from: f */
    private static final zzbw f45630f;

    /* renamed from: c */
    private int[] f45631c;

    /* renamed from: d */
    private int f45632d;

    static {
        zzbw zzbw = new zzbw(new int[0], 0);
        f45630f = zzbw;
        zzbw.zzb();
    }

    zzbw() {
        this(new int[10], 0);
    }

    /* renamed from: E */
    private final void m64208E(int i) {
        if (i < 0 || i >= this.f45632d) {
            throw new IndexOutOfBoundsException(m64209h(i));
        }
    }

    /* renamed from: h */
    private final String m64209h(int i) {
        int i2 = this.f45632d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzcc mo53817G(int i) {
        if (i >= this.f45632d) {
            return new zzbw(Arrays.copyOf(this.f45631c, i), this.f45632d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo53807c();
        if (i < 0 || i > (i2 = this.f45632d)) {
            throw new IndexOutOfBoundsException(m64209h(i));
        }
        int[] iArr = this.f45631c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f45631c, i, iArr2, i + 1, this.f45632d - i);
            this.f45631c = iArr2;
        }
        this.f45631c[i] = intValue;
        this.f45632d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo53807c();
        zzcd.m64226e(collection);
        if (!(collection instanceof zzbw)) {
            return super.addAll(collection);
        }
        zzbw zzbw = (zzbw) collection;
        int i = zzbw.f45632d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45632d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f45631c;
            if (i3 > iArr.length) {
                this.f45631c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzbw.f45631c, 0, this.f45631c, this.f45632d, zzbw.f45632d);
            this.f45632d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo53951d(int i) {
        m64208E(i);
        return this.f45631c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbw)) {
            return super.equals(obj);
        }
        zzbw zzbw = (zzbw) obj;
        if (this.f45632d != zzbw.f45632d) {
            return false;
        }
        int[] iArr = zzbw.f45631c;
        for (int i = 0; i < this.f45632d; i++) {
            if (this.f45631c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo53952f(int i) {
        mo53807c();
        int i2 = this.f45632d;
        int[] iArr = this.f45631c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f45631c = iArr2;
        }
        int[] iArr3 = this.f45631c;
        int i3 = this.f45632d;
        this.f45632d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        m64208E(i);
        return Integer.valueOf(this.f45631c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45632d; i2++) {
            i = (i * 31) + this.f45631c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f45632d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45631c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        m64208E(i);
        int[] iArr = this.f45631c;
        int i2 = iArr[i];
        int i3 = this.f45632d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f45632d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53807c();
        if (i2 >= i) {
            int[] iArr = this.f45631c;
            System.arraycopy(iArr, i2, iArr, i, this.f45632d - i2);
            this.f45632d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo53807c();
        m64208E(i);
        int[] iArr = this.f45631c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f45632d;
    }

    private zzbw(int[] iArr, int i) {
        this.f45631c = iArr;
        this.f45632d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo53952f(((Integer) obj).intValue());
        return true;
    }
}
