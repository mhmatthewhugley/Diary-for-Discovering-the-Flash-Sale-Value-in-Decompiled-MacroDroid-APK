package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpk extends zzgpg implements RandomAccess, zzgsv {

    /* renamed from: f */
    private static final zzgpk f37000f;

    /* renamed from: c */
    private boolean[] f37001c;

    /* renamed from: d */
    private int f37002d;

    static {
        zzgpk zzgpk = new zzgpk(new boolean[0], 0);
        f37000f = zzgpk;
        zzgpk.zzb();
    }

    zzgpk() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m52530f(int i) {
        int i2 = this.f37002d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m52531h(int i) {
        if (i < 0 || i >= this.f37002d) {
            throw new IndexOutOfBoundsException(m52530f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzgrn mo47067G(int i) {
        if (i >= this.f37002d) {
            return new zzgpk(Arrays.copyOf(this.f37001c, i), this.f37002d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo47057c();
        if (i < 0 || i > (i2 = this.f37002d)) {
            throw new IndexOutOfBoundsException(m52530f(i));
        }
        boolean[] zArr = this.f37001c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f37001c, i, zArr2, i + 1, this.f37002d - i);
            this.f37001c = zArr2;
        }
        this.f37001c[i] = booleanValue;
        this.f37002d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo47057c();
        zzgro.m53027e(collection);
        if (!(collection instanceof zzgpk)) {
            return super.addAll(collection);
        }
        zzgpk zzgpk = (zzgpk) collection;
        int i = zzgpk.f37002d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37002d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f37001c;
            if (i3 > zArr.length) {
                this.f37001c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzgpk.f37001c, 0, this.f37001c, this.f37002d, zzgpk.f37002d);
            this.f37002d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo47069d(boolean z) {
        mo47057c();
        int i = this.f37002d;
        boolean[] zArr = this.f37001c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f37001c = zArr2;
        }
        boolean[] zArr3 = this.f37001c;
        int i2 = this.f37002d;
        this.f37002d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgpk)) {
            return super.equals(obj);
        }
        zzgpk zzgpk = (zzgpk) obj;
        if (this.f37002d != zzgpk.f37002d) {
            return false;
        }
        boolean[] zArr = zzgpk.f37001c;
        for (int i = 0; i < this.f37002d; i++) {
            if (this.f37001c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m52531h(i);
        return Boolean.valueOf(this.f37001c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37002d; i2++) {
            i = (i * 31) + zzgro.m53023a(this.f37001c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f37002d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37001c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        m52531h(i);
        boolean[] zArr = this.f37001c;
        boolean z = zArr[i];
        int i2 = this.f37002d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f37002d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo47057c();
        if (i2 >= i) {
            boolean[] zArr = this.f37001c;
            System.arraycopy(zArr, i2, zArr, i, this.f37002d - i2);
            this.f37002d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo47057c();
        m52531h(i);
        boolean[] zArr = this.f37001c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f37002d;
    }

    private zzgpk(boolean[] zArr, int i) {
        this.f37001c = zArr;
        this.f37002d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo47069d(((Boolean) obj).booleanValue());
        return true;
    }
}
