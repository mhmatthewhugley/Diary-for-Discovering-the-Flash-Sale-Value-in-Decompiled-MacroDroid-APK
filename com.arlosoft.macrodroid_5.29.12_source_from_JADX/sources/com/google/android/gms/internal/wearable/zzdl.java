package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdl extends zzah implements RandomAccess {

    /* renamed from: f */
    private static final zzdl f45696f;

    /* renamed from: c */
    private Object[] f45697c;

    /* renamed from: d */
    private int f45698d;

    static {
        zzdl zzdl = new zzdl(new Object[0], 0);
        f45696f = zzdl;
        zzdl.zzb();
    }

    zzdl() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static zzdl m64338d() {
        return f45696f;
    }

    /* renamed from: f */
    private final String m64339f(int i) {
        int i2 = this.f45698d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m64340h(int i) {
        if (i < 0 || i >= this.f45698d) {
            throw new IndexOutOfBoundsException(m64339f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzcc mo53817G(int i) {
        if (i >= this.f45698d) {
            return new zzdl(Arrays.copyOf(this.f45697c, i), this.f45698d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo53807c();
        if (i < 0 || i > (i2 = this.f45698d)) {
            throw new IndexOutOfBoundsException(m64339f(i));
        }
        Object[] objArr = this.f45697c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f45697c, i, objArr2, i + 1, this.f45698d - i);
            this.f45697c = objArr2;
        }
        this.f45697c[i] = obj;
        this.f45698d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m64340h(i);
        return this.f45697c[i];
    }

    public final Object remove(int i) {
        mo53807c();
        m64340h(i);
        Object[] objArr = this.f45697c;
        Object obj = objArr[i];
        int i2 = this.f45698d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f45698d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo53807c();
        m64340h(i);
        Object[] objArr = this.f45697c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f45698d;
    }

    private zzdl(Object[] objArr, int i) {
        this.f45697c = objArr;
        this.f45698d = i;
    }

    public final boolean add(Object obj) {
        mo53807c();
        int i = this.f45698d;
        Object[] objArr = this.f45697c;
        if (i == objArr.length) {
            this.f45697c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f45697c;
        int i2 = this.f45698d;
        this.f45698d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
