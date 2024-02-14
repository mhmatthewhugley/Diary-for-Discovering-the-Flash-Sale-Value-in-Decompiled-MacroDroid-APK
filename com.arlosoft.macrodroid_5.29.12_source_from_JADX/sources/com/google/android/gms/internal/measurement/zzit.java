package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzit extends zzip implements RandomAccess, zzlt {

    /* renamed from: f */
    private static final zzit f41532f;

    /* renamed from: c */
    private boolean[] f41533c;

    /* renamed from: d */
    private int f41534d;

    static {
        zzit zzit = new zzit(new boolean[0], 0);
        f41532f = zzit;
        zzit.zzb();
    }

    zzit() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m60339f(int i) {
        int i2 = this.f41534d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m60340h(int i) {
        if (i < 0 || i >= this.f41534d) {
            throw new IndexOutOfBoundsException(m60339f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzkm mo51322G(int i) {
        if (i >= this.f41534d) {
            return new zzit(Arrays.copyOf(this.f41533c, i), this.f41534d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo51312c();
        if (i < 0 || i > (i2 = this.f41534d)) {
            throw new IndexOutOfBoundsException(m60339f(i));
        }
        boolean[] zArr = this.f41533c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f41533c, i, zArr2, i + 1, this.f41534d - i);
            this.f41533c = zArr2;
        }
        this.f41533c[i] = booleanValue;
        this.f41534d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo51312c();
        zzkn.m60542e(collection);
        if (!(collection instanceof zzit)) {
            return super.addAll(collection);
        }
        zzit zzit = (zzit) collection;
        int i = zzit.f41534d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f41534d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f41533c;
            if (i3 > zArr.length) {
                this.f41533c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzit.f41533c, 0, this.f41533c, this.f41534d, zzit.f41534d);
            this.f41534d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo51324d(boolean z) {
        mo51312c();
        int i = this.f41534d;
        boolean[] zArr = this.f41533c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f41533c = zArr2;
        }
        boolean[] zArr3 = this.f41533c;
        int i2 = this.f41534d;
        this.f41534d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzit)) {
            return super.equals(obj);
        }
        zzit zzit = (zzit) obj;
        if (this.f41534d != zzit.f41534d) {
            return false;
        }
        boolean[] zArr = zzit.f41533c;
        for (int i = 0; i < this.f41534d; i++) {
            if (this.f41533c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m60340h(i);
        return Boolean.valueOf(this.f41533c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41534d; i2++) {
            i = (i * 31) + zzkn.m60538a(this.f41533c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f41534d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41533c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo51312c();
        m60340h(i);
        boolean[] zArr = this.f41533c;
        boolean z = zArr[i];
        int i2 = this.f41534d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f41534d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo51312c();
        if (i2 >= i) {
            boolean[] zArr = this.f41533c;
            System.arraycopy(zArr, i2, zArr, i, this.f41534d - i2);
            this.f41534d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo51312c();
        m60340h(i);
        boolean[] zArr = this.f41533c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f41534d;
    }

    private zzit(boolean[] zArr, int i) {
        this.f41533c = zArr;
        this.f41534d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo51324d(((Boolean) obj).booleanValue());
        return true;
    }
}
