package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaet */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaet extends zzabn implements RandomAccess {

    /* renamed from: f */
    private static final zzaet f39808f;

    /* renamed from: c */
    private Object[] f39809c;

    /* renamed from: d */
    private int f39810d;

    static {
        zzaet zzaet = new zzaet(new Object[0], 0);
        f39808f = zzaet;
        zzaet.zzb();
    }

    zzaet() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static zzaet m56610d() {
        return f39808f;
    }

    /* renamed from: f */
    private final String m56611f(int i) {
        int i2 = this.f39810d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m56612h(int i) {
        if (i < 0 || i >= this.f39810d) {
            throw new IndexOutOfBoundsException(m56611f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39810d) {
            return new zzaet(Arrays.copyOf(this.f39809c, i), this.f39810d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo48867c();
        if (i < 0 || i > (i2 = this.f39810d)) {
            throw new IndexOutOfBoundsException(m56611f(i));
        }
        Object[] objArr = this.f39809c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f39809c, i, objArr2, i + 1, this.f39810d - i);
            this.f39809c = objArr2;
        }
        this.f39809c[i] = obj;
        this.f39810d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m56612h(i);
        return this.f39809c[i];
    }

    public final Object remove(int i) {
        mo48867c();
        m56612h(i);
        Object[] objArr = this.f39809c;
        Object obj = objArr[i];
        int i2 = this.f39810d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f39810d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo48867c();
        m56612h(i);
        Object[] objArr = this.f39809c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f39810d;
    }

    private zzaet(Object[] objArr, int i) {
        this.f39809c = objArr;
        this.f39810d = i;
    }

    public final boolean add(Object obj) {
        mo48867c();
        int i = this.f39810d;
        Object[] objArr = this.f39809c;
        if (i == objArr.length) {
            this.f39809c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f39809c;
        int i2 = this.f39810d;
        this.f39810d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
