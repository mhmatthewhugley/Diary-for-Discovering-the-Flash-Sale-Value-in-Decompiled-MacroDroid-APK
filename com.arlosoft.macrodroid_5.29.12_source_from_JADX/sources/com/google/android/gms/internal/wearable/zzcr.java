package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcr extends zzah implements RandomAccess, zzcb, zzdj {

    /* renamed from: f */
    private static final zzcr f45660f;

    /* renamed from: c */
    private long[] f45661c;

    /* renamed from: d */
    private int f45662d;

    static {
        zzcr zzcr = new zzcr(new long[0], 0);
        f45660f = zzcr;
        zzcr.zzb();
    }

    zzcr() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static zzcr m64255f() {
        return f45660f;
    }

    /* renamed from: i */
    private final String m64256i(int i) {
        int i2 = this.f45662d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m64257j(int i) {
        if (i < 0 || i >= this.f45662d) {
            throw new IndexOutOfBoundsException(m64256i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo53807c();
        if (i < 0 || i > (i2 = this.f45662d)) {
            throw new IndexOutOfBoundsException(m64256i(i));
        }
        long[] jArr = this.f45661c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f45661c, i, jArr2, i + 1, this.f45662d - i);
            this.f45661c = jArr2;
        }
        this.f45661c[i] = longValue;
        this.f45662d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo53807c();
        zzcd.m64226e(collection);
        if (!(collection instanceof zzcr)) {
            return super.addAll(collection);
        }
        zzcr zzcr = (zzcr) collection;
        int i = zzcr.f45662d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45662d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f45661c;
            if (i3 > jArr.length) {
                this.f45661c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzcr.f45661c, 0, this.f45661c, this.f45662d, zzcr.f45662d);
            this.f45662d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long mo53975d(int i) {
        m64257j(i);
        return this.f45661c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcr)) {
            return super.equals(obj);
        }
        zzcr zzcr = (zzcr) obj;
        if (this.f45662d != zzcr.f45662d) {
            return false;
        }
        long[] jArr = zzcr.f45661c;
        for (int i = 0; i < this.f45662d; i++) {
            if (this.f45661c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m64257j(i);
        return Long.valueOf(this.f45661c[i]);
    }

    /* renamed from: h */
    public final void mo53977h(long j) {
        mo53807c();
        int i = this.f45662d;
        long[] jArr = this.f45661c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f45661c = jArr2;
        }
        long[] jArr3 = this.f45661c;
        int i2 = this.f45662d;
        this.f45662d = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45662d; i2++) {
            i = (i * 31) + zzcd.m64224c(this.f45661c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f45662d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45661c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        m64257j(i);
        long[] jArr = this.f45661c;
        long j = jArr[i];
        int i2 = this.f45662d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f45662d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53807c();
        if (i2 >= i) {
            long[] jArr = this.f45661c;
            System.arraycopy(jArr, i2, jArr, i, this.f45662d - i2);
            this.f45662d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo53807c();
        m64257j(i);
        long[] jArr = this.f45661c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f45662d;
    }

    /* renamed from: v */
    public final zzcb mo53817G(int i) {
        if (i >= this.f45662d) {
            return new zzcr(Arrays.copyOf(this.f45661c, i), this.f45662d);
        }
        throw new IllegalArgumentException();
    }

    private zzcr(long[] jArr, int i) {
        this.f45661c = jArr;
        this.f45662d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo53977h(((Long) obj).longValue());
        return true;
    }
}
