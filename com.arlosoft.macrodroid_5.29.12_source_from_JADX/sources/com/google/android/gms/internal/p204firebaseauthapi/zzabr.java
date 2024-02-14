package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzabr extends zzabn implements RandomAccess, zzaer {

    /* renamed from: f */
    private static final zzabr f39628f;

    /* renamed from: c */
    private boolean[] f39629c;

    /* renamed from: d */
    private int f39630d;

    static {
        zzabr zzabr = new zzabr(new boolean[0], 0);
        f39628f = zzabr;
        zzabr.zzb();
    }

    zzabr() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m56136f(int i) {
        int i2 = this.f39630d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m56137h(int i) {
        if (i < 0 || i >= this.f39630d) {
            throw new IndexOutOfBoundsException(m56136f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39630d) {
            return new zzabr(Arrays.copyOf(this.f39629c, i), this.f39630d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo48867c();
        if (i < 0 || i > (i2 = this.f39630d)) {
            throw new IndexOutOfBoundsException(m56136f(i));
        }
        boolean[] zArr = this.f39629c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f39629c, i, zArr2, i + 1, this.f39630d - i);
            this.f39629c = zArr2;
        }
        this.f39629c[i] = booleanValue;
        this.f39630d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo48867c();
        zzadl.m56461e(collection);
        if (!(collection instanceof zzabr)) {
            return super.addAll(collection);
        }
        zzabr zzabr = (zzabr) collection;
        int i = zzabr.f39630d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39630d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f39629c;
            if (i3 > zArr.length) {
                this.f39629c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzabr.f39629c, 0, this.f39629c, this.f39630d, zzabr.f39630d);
            this.f39630d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo48879d(boolean z) {
        mo48867c();
        int i = this.f39630d;
        boolean[] zArr = this.f39629c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f39629c = zArr2;
        }
        boolean[] zArr3 = this.f39629c;
        int i2 = this.f39630d;
        this.f39630d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabr)) {
            return super.equals(obj);
        }
        zzabr zzabr = (zzabr) obj;
        if (this.f39630d != zzabr.f39630d) {
            return false;
        }
        boolean[] zArr = zzabr.f39629c;
        for (int i = 0; i < this.f39630d; i++) {
            if (this.f39629c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m56137h(i);
        return Boolean.valueOf(this.f39629c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39630d; i2++) {
            i = (i * 31) + zzadl.m56457a(this.f39629c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f39630d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39629c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        m56137h(i);
        boolean[] zArr = this.f39629c;
        boolean z = zArr[i];
        int i2 = this.f39630d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f39630d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo48867c();
        if (i2 >= i) {
            boolean[] zArr = this.f39629c;
            System.arraycopy(zArr, i2, zArr, i, this.f39630d - i2);
            this.f39630d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo48867c();
        m56137h(i);
        boolean[] zArr = this.f39629c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f39630d;
    }

    private zzabr(boolean[] zArr, int i) {
        this.f39629c = zArr;
        this.f39630d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo48879d(((Boolean) obj).booleanValue());
        return true;
    }
}
