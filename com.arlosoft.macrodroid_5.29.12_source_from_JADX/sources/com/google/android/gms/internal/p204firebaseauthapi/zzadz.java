package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzadz extends zzabn implements RandomAccess, zzaer {

    /* renamed from: f */
    private static final zzadz f39771f;

    /* renamed from: c */
    private long[] f39772c;

    /* renamed from: d */
    private int f39773d;

    static {
        zzadz zzadz = new zzadz(new long[0], 0);
        f39771f = zzadz;
        zzadz.zzb();
    }

    zzadz() {
        this(new long[10], 0);
    }

    /* renamed from: E */
    private final void m56501E(int i) {
        if (i < 0 || i >= this.f39773d) {
            throw new IndexOutOfBoundsException(m56502h(i));
        }
    }

    /* renamed from: h */
    private final String m56502h(int i) {
        int i2 = this.f39773d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39773d) {
            return new zzadz(Arrays.copyOf(this.f39772c, i), this.f39773d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo48867c();
        if (i < 0 || i > (i2 = this.f39773d)) {
            throw new IndexOutOfBoundsException(m56502h(i));
        }
        long[] jArr = this.f39772c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f39772c, i, jArr2, i + 1, this.f39773d - i);
            this.f39772c = jArr2;
        }
        this.f39772c[i] = longValue;
        this.f39773d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo48867c();
        zzadl.m56461e(collection);
        if (!(collection instanceof zzadz)) {
            return super.addAll(collection);
        }
        zzadz zzadz = (zzadz) collection;
        int i = zzadz.f39773d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39773d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f39772c;
            if (i3 > jArr.length) {
                this.f39772c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzadz.f39772c, 0, this.f39772c, this.f39773d, zzadz.f39773d);
            this.f39773d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long mo49118d(int i) {
        m56501E(i);
        return this.f39772c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadz)) {
            return super.equals(obj);
        }
        zzadz zzadz = (zzadz) obj;
        if (this.f39773d != zzadz.f39773d) {
            return false;
        }
        long[] jArr = zzadz.f39772c;
        for (int i = 0; i < this.f39773d; i++) {
            if (this.f39772c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo49119f(long j) {
        mo48867c();
        int i = this.f39773d;
        long[] jArr = this.f39772c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f39772c = jArr2;
        }
        long[] jArr3 = this.f39772c;
        int i2 = this.f39773d;
        this.f39773d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m56501E(i);
        return Long.valueOf(this.f39772c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39773d; i2++) {
            i = (i * 31) + zzadl.m56459c(this.f39772c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f39773d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39772c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        m56501E(i);
        long[] jArr = this.f39772c;
        long j = jArr[i];
        int i2 = this.f39773d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f39773d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo48867c();
        if (i2 >= i) {
            long[] jArr = this.f39772c;
            System.arraycopy(jArr, i2, jArr, i, this.f39773d - i2);
            this.f39773d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo48867c();
        m56501E(i);
        long[] jArr = this.f39772c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f39773d;
    }

    private zzadz(long[] jArr, int i) {
        this.f39772c = jArr;
        this.f39773d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo49119f(((Long) obj).longValue());
        return true;
    }
}
