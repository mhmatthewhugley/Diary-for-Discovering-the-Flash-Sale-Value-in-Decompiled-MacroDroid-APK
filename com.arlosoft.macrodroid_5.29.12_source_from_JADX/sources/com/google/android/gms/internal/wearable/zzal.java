package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzal extends zzah implements RandomAccess, zzdj {

    /* renamed from: f */
    private static final zzal f45535f;

    /* renamed from: c */
    private boolean[] f45536c;

    /* renamed from: d */
    private int f45537d;

    static {
        zzal zzal = new zzal(new boolean[0], 0);
        f45535f = zzal;
        zzal.zzb();
    }

    zzal() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m64035f(int i) {
        int i2 = this.f45537d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m64036h(int i) {
        if (i < 0 || i >= this.f45537d) {
            throw new IndexOutOfBoundsException(m64035f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzcc mo53817G(int i) {
        if (i >= this.f45537d) {
            return new zzal(Arrays.copyOf(this.f45536c, i), this.f45537d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo53807c();
        if (i < 0 || i > (i2 = this.f45537d)) {
            throw new IndexOutOfBoundsException(m64035f(i));
        }
        boolean[] zArr = this.f45536c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f45536c, i, zArr2, i + 1, this.f45537d - i);
            this.f45536c = zArr2;
        }
        this.f45536c[i] = booleanValue;
        this.f45537d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo53807c();
        zzcd.m64226e(collection);
        if (!(collection instanceof zzal)) {
            return super.addAll(collection);
        }
        zzal zzal = (zzal) collection;
        int i = zzal.f45537d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45537d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f45536c;
            if (i3 > zArr.length) {
                this.f45536c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzal.f45536c, 0, this.f45536c, this.f45537d, zzal.f45537d);
            this.f45537d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo53819d(boolean z) {
        mo53807c();
        int i = this.f45537d;
        boolean[] zArr = this.f45536c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f45536c = zArr2;
        }
        boolean[] zArr3 = this.f45536c;
        int i2 = this.f45537d;
        this.f45537d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzal)) {
            return super.equals(obj);
        }
        zzal zzal = (zzal) obj;
        if (this.f45537d != zzal.f45537d) {
            return false;
        }
        boolean[] zArr = zzal.f45536c;
        for (int i = 0; i < this.f45537d; i++) {
            if (this.f45536c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m64036h(i);
        return Boolean.valueOf(this.f45536c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45537d; i2++) {
            i = (i * 31) + zzcd.m64222a(this.f45536c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f45537d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45536c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        m64036h(i);
        boolean[] zArr = this.f45536c;
        boolean z = zArr[i];
        int i2 = this.f45537d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f45537d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53807c();
        if (i2 >= i) {
            boolean[] zArr = this.f45536c;
            System.arraycopy(zArr, i2, zArr, i, this.f45537d - i2);
            this.f45537d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo53807c();
        m64036h(i);
        boolean[] zArr = this.f45536c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f45537d;
    }

    private zzal(boolean[] zArr, int i) {
        this.f45536c = zArr;
        this.f45537d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo53819d(((Boolean) obj).booleanValue());
        return true;
    }
}
