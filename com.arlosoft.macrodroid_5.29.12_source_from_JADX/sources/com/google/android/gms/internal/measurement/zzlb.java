package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlb extends zzip implements RandomAccess, zzkl, zzlt {

    /* renamed from: f */
    private static final zzlb f41661f;

    /* renamed from: c */
    private long[] f41662c;

    /* renamed from: d */
    private int f41663d;

    static {
        zzlb zzlb = new zzlb(new long[0], 0);
        f41661f = zzlb;
        zzlb.zzb();
    }

    zzlb() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    public static zzlb m60576d() {
        return f41661f;
    }

    /* renamed from: h */
    private final String m60577h(int i) {
        int i2 = this.f41663d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m60578i(int i) {
        if (i < 0 || i >= this.f41663d) {
            throw new IndexOutOfBoundsException(m60577h(i));
        }
    }

    /* renamed from: A */
    public final zzkl mo51322G(int i) {
        if (i >= this.f41663d) {
            return new zzlb(Arrays.copyOf(this.f41662c, i), this.f41663d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo51312c();
        if (i < 0 || i > (i2 = this.f41663d)) {
            throw new IndexOutOfBoundsException(m60577h(i));
        }
        long[] jArr = this.f41662c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f41662c, i, jArr2, i + 1, this.f41663d - i);
            this.f41662c = jArr2;
        }
        this.f41662c[i] = longValue;
        this.f41663d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo51312c();
        zzkn.m60542e(collection);
        if (!(collection instanceof zzlb)) {
            return super.addAll(collection);
        }
        zzlb zzlb = (zzlb) collection;
        int i = zzlb.f41663d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f41663d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f41662c;
            if (i3 > jArr.length) {
                this.f41662c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzlb.f41662c, 0, this.f41662c, this.f41663d, zzlb.f41663d);
            this.f41663d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlb)) {
            return super.equals(obj);
        }
        zzlb zzlb = (zzlb) obj;
        if (this.f41663d != zzlb.f41663d) {
            return false;
        }
        long[] jArr = zzlb.f41662c;
        for (int i = 0; i < this.f41663d; i++) {
            if (this.f41662c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo51488f(long j) {
        mo51312c();
        int i = this.f41663d;
        long[] jArr = this.f41662c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f41662c = jArr2;
        }
        long[] jArr3 = this.f41662c;
        int i2 = this.f41663d;
        this.f41663d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m60578i(i);
        return Long.valueOf(this.f41662c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41663d; i2++) {
            i = (i * 31) + zzkn.m60540c(this.f41662c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f41663d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41662c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo51312c();
        m60578i(i);
        long[] jArr = this.f41662c;
        long j = jArr[i];
        int i2 = this.f41663d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f41663d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo51312c();
        if (i2 >= i) {
            long[] jArr = this.f41662c;
            System.arraycopy(jArr, i2, jArr, i, this.f41663d - i2);
            this.f41663d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo51312c();
        m60578i(i);
        long[] jArr = this.f41662c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f41663d;
    }

    /* renamed from: v */
    public final long mo51470v(int i) {
        m60578i(i);
        return this.f41662c[i];
    }

    private zzlb(long[] jArr, int i) {
        this.f41662c = jArr;
        this.f41663d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo51488f(((Long) obj).longValue());
        return true;
    }
}
