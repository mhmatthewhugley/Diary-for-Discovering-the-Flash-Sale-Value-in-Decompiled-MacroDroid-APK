package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlv extends zzip implements RandomAccess {

    /* renamed from: f */
    private static final zzlv f41697f;

    /* renamed from: c */
    private Object[] f41698c;

    /* renamed from: d */
    private int f41699d;

    static {
        zzlv zzlv = new zzlv(new Object[0], 0);
        f41697f = zzlv;
        zzlv.zzb();
    }

    zzlv() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static zzlv m60681d() {
        return f41697f;
    }

    /* renamed from: f */
    private final String m60682f(int i) {
        int i2 = this.f41699d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m60683h(int i) {
        if (i < 0 || i >= this.f41699d) {
            throw new IndexOutOfBoundsException(m60682f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzkm mo51322G(int i) {
        if (i >= this.f41699d) {
            return new zzlv(Arrays.copyOf(this.f41698c, i), this.f41699d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo51312c();
        if (i < 0 || i > (i2 = this.f41699d)) {
            throw new IndexOutOfBoundsException(m60682f(i));
        }
        Object[] objArr = this.f41698c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f41698c, i, objArr2, i + 1, this.f41699d - i);
            this.f41698c = objArr2;
        }
        this.f41698c[i] = obj;
        this.f41699d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m60683h(i);
        return this.f41698c[i];
    }

    public final Object remove(int i) {
        mo51312c();
        m60683h(i);
        Object[] objArr = this.f41698c;
        Object obj = objArr[i];
        int i2 = this.f41699d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f41699d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo51312c();
        m60683h(i);
        Object[] objArr = this.f41698c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f41699d;
    }

    private zzlv(Object[] objArr, int i) {
        this.f41698c = objArr;
        this.f41699d = i;
    }

    public final boolean add(Object obj) {
        mo51312c();
        int i = this.f41699d;
        Object[] objArr = this.f41698c;
        if (i == objArr.length) {
            this.f41698c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f41698c;
        int i2 = this.f41699d;
        this.f41699d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
