package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsx extends zzgpg implements RandomAccess {

    /* renamed from: f */
    private static final zzgsx f37244f;

    /* renamed from: c */
    private Object[] f37245c;

    /* renamed from: d */
    private int f37246d;

    static {
        zzgsx zzgsx = new zzgsx(new Object[0], 0);
        f37244f = zzgsx;
        zzgsx.zzb();
    }

    zzgsx() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static zzgsx m53180d() {
        return f37244f;
    }

    /* renamed from: f */
    private final String m53181f(int i) {
        int i2 = this.f37246d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: h */
    private final void m53182h(int i) {
        if (i < 0 || i >= this.f37246d) {
            throw new IndexOutOfBoundsException(m53181f(i));
        }
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzgrn mo47067G(int i) {
        if (i >= this.f37246d) {
            return new zzgsx(Arrays.copyOf(this.f37245c, i), this.f37246d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i2;
        mo47057c();
        if (i < 0 || i > (i2 = this.f37246d)) {
            throw new IndexOutOfBoundsException(m53181f(i));
        }
        Object[] objArr = this.f37245c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f37245c, i, objArr2, i + 1, this.f37246d - i);
            this.f37245c = objArr2;
        }
        this.f37245c[i] = obj;
        this.f37246d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m53182h(i);
        return this.f37245c[i];
    }

    public final Object remove(int i) {
        mo47057c();
        m53182h(i);
        Object[] objArr = this.f37245c;
        Object obj = objArr[i];
        int i2 = this.f37246d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f37246d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo47057c();
        m53182h(i);
        Object[] objArr = this.f37245c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f37246d;
    }

    private zzgsx(Object[] objArr, int i) {
        this.f37245c = objArr;
        this.f37246d = i;
    }

    public final boolean add(Object obj) {
        mo47057c();
        int i = this.f37246d;
        Object[] objArr = this.f37245c;
        if (i == objArr.length) {
            this.f37245c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f37245c;
        int i2 = this.f37246d;
        this.f37246d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
