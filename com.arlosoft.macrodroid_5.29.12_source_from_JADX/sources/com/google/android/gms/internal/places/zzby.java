package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzby extends zzq<Long> implements zzcw, RandomAccess {

    /* renamed from: f */
    private static final zzby f45309f;

    /* renamed from: c */
    private long[] f45310c;

    /* renamed from: d */
    private int f45311d;

    static {
        zzby zzby = new zzby(new long[0], 0);
        f45309f = zzby;
        zzby.mo53475h2();
    }

    zzby() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    private final void m63398f(int i) {
        if (i < 0 || i >= this.f45311d) {
            throw new IndexOutOfBoundsException(m63399h(i));
        }
    }

    /* renamed from: h */
    private final String m63399h(int i) {
        int i2 = this.f45311d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m63400i(int i, long j) {
        int i2;
        mo53665c();
        if (i < 0 || i > (i2 = this.f45311d)) {
            throw new IndexOutOfBoundsException(m63399h(i));
        }
        long[] jArr = this.f45310c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f45310c, i, jArr2, i + 1, this.f45311d - i);
            this.f45310c = jArr2;
        }
        this.f45310c[i] = j;
        this.f45311d++;
        this.modCount++;
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= this.f45311d) {
            return new zzby(Arrays.copyOf(this.f45310c, i), this.f45311d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m63400i(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo53665c();
        zzbd.m63340a(collection);
        if (!(collection instanceof zzby)) {
            return super.addAll(collection);
        }
        zzby zzby = (zzby) collection;
        int i = zzby.f45311d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45311d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f45310c;
            if (i3 > jArr.length) {
                this.f45310c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzby.f45310c, 0, this.f45310c, this.f45311d, zzby.f45311d);
            this.f45311d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final long mo53503d(int i) {
        m63398f(i);
        return this.f45310c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzby)) {
            return super.equals(obj);
        }
        zzby zzby = (zzby) obj;
        if (this.f45311d != zzby.f45311d) {
            return false;
        }
        long[] jArr = zzby.f45310c;
        for (int i = 0; i < this.f45311d; i++) {
            if (this.f45310c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo53503d(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45311d; i2++) {
            i = (i * 31) + zzbd.m63349j(this.f45310c[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public final void mo53505j(long j) {
        m63400i(this.f45311d, j);
    }

    public final boolean remove(Object obj) {
        mo53665c();
        for (int i = 0; i < this.f45311d; i++) {
            if (obj.equals(Long.valueOf(this.f45310c[i]))) {
                long[] jArr = this.f45310c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f45311d - i) - 1);
                this.f45311d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo53665c();
        if (i2 >= i) {
            long[] jArr = this.f45310c;
            System.arraycopy(jArr, i2, jArr, i, this.f45311d - i2);
            this.f45311d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo53665c();
        m63398f(i);
        long[] jArr = this.f45310c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f45311d;
    }

    private zzby(long[] jArr, int i) {
        this.f45310c = jArr;
        this.f45311d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        m63398f(i);
        long[] jArr = this.f45310c;
        long j = jArr[i];
        int i2 = this.f45311d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f45311d--;
        this.modCount++;
        return Long.valueOf(j);
    }
}
