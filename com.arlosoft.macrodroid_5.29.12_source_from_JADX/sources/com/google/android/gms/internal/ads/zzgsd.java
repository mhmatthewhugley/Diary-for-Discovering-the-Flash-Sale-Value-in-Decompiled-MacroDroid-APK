package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsd extends zzgpg implements RandomAccess, zzgrm, zzgsv {

    /* renamed from: f */
    private static final zzgsd f37208f;

    /* renamed from: c */
    private long[] f37209c;

    /* renamed from: d */
    private int f37210d;

    static {
        zzgsd zzgsd = new zzgsd(new long[0], 0);
        f37208f = zzgsd;
        zzgsd.zzb();
    }

    zzgsd() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static zzgsd m53074f() {
        return f37208f;
    }

    /* renamed from: i */
    private final String m53075i(int i) {
        int i2 = this.f37210d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m53076j(int i) {
        if (i < 0 || i >= this.f37210d) {
            throw new IndexOutOfBoundsException(m53075i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo47057c();
        if (i < 0 || i > (i2 = this.f37210d)) {
            throw new IndexOutOfBoundsException(m53075i(i));
        }
        long[] jArr = this.f37209c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f37209c, i, jArr2, i + 1, this.f37210d - i);
            this.f37209c = jArr2;
        }
        this.f37209c[i] = longValue;
        this.f37210d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo47057c();
        zzgro.m53027e(collection);
        if (!(collection instanceof zzgsd)) {
            return super.addAll(collection);
        }
        zzgsd zzgsd = (zzgsd) collection;
        int i = zzgsd.f37210d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37210d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f37209c;
            if (i3 > jArr.length) {
                this.f37209c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzgsd.f37209c, 0, this.f37209c, this.f37210d, zzgsd.f37210d);
            this.f37210d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long mo47390d(int i) {
        m53076j(i);
        return this.f37209c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgsd)) {
            return super.equals(obj);
        }
        zzgsd zzgsd = (zzgsd) obj;
        if (this.f37210d != zzgsd.f37210d) {
            return false;
        }
        long[] jArr = zzgsd.f37209c;
        for (int i = 0; i < this.f37210d; i++) {
            if (this.f37209c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m53076j(i);
        return Long.valueOf(this.f37209c[i]);
    }

    /* renamed from: h */
    public final void mo47392h(long j) {
        mo47057c();
        int i = this.f37210d;
        long[] jArr = this.f37209c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f37209c = jArr2;
        }
        long[] jArr3 = this.f37209c;
        int i2 = this.f37210d;
        this.f37210d = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37210d; i2++) {
            i = (i * 31) + zzgro.m53025c(this.f37209c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f37210d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37209c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        m53076j(i);
        long[] jArr = this.f37209c;
        long j = jArr[i];
        int i2 = this.f37210d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f37210d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo47057c();
        if (i2 >= i) {
            long[] jArr = this.f37209c;
            System.arraycopy(jArr, i2, jArr, i, this.f37210d - i2);
            this.f37210d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo47057c();
        m53076j(i);
        long[] jArr = this.f37209c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f37210d;
    }

    /* renamed from: v */
    public final zzgrm mo47067G(int i) {
        if (i >= this.f37210d) {
            return new zzgsd(Arrays.copyOf(this.f37209c, i), this.f37210d);
        }
        throw new IllegalArgumentException();
    }

    private zzgsd(long[] jArr, int i) {
        this.f37209c = jArr;
        this.f37210d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo47392h(((Long) obj).longValue());
        return true;
    }
}
