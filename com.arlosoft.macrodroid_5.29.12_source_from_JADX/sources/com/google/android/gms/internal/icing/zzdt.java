package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdt extends zzbt<Long> implements RandomAccess, zzdf, zzel {

    /* renamed from: f */
    private static final zzdt f40903f;

    /* renamed from: c */
    private long[] f40904c;

    /* renamed from: d */
    private int f40905d;

    static {
        zzdt zzdt = new zzdt(new long[0], 0);
        f40903f = zzdt;
        zzdt.zzb();
    }

    zzdt() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    public static zzdt m58846d() {
        return f40903f;
    }

    /* renamed from: h */
    private final void m58847h(int i) {
        if (i < 0 || i >= this.f40905d) {
            throw new IndexOutOfBoundsException(m58848i(i));
        }
    }

    /* renamed from: i */
    private final String m58848i(int i) {
        int i2 = this.f40905d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= this.f40905d) {
            return new zzdt(Arrays.copyOf(this.f40904c, i), this.f40905d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo50190c();
        if (i < 0 || i > (i2 = this.f40905d)) {
            throw new IndexOutOfBoundsException(m58848i(i));
        }
        long[] jArr = this.f40904c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f40904c, i, jArr2, i + 1, this.f40905d - i);
            this.f40904c = jArr2;
        }
        this.f40904c[i] = longValue;
        this.f40905d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo50190c();
        zzdh.m58816a(collection);
        if (!(collection instanceof zzdt)) {
            return super.addAll(collection);
        }
        zzdt zzdt = (zzdt) collection;
        int i = zzdt.f40905d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40905d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f40904c;
            if (i3 > jArr.length) {
                this.f40904c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzdt.f40904c, 0, this.f40904c, this.f40905d, zzdt.f40905d);
            this.f40905d = i3;
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
        if (!(obj instanceof zzdt)) {
            return super.equals(obj);
        }
        zzdt zzdt = (zzdt) obj;
        if (this.f40905d != zzdt.f40905d) {
            return false;
        }
        long[] jArr = zzdt.f40904c;
        for (int i = 0; i < this.f40905d; i++) {
            if (this.f40904c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo50336f(int i) {
        m58847h(i);
        return this.f40904c[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m58847h(i);
        return Long.valueOf(this.f40904c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40905d; i2++) {
            i = (i * 31) + zzdh.m58820e(this.f40904c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f40905d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40904c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50190c();
        m58847h(i);
        long[] jArr = this.f40904c;
        long j = jArr[i];
        int i2 = this.f40905d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f40905d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo50190c();
        if (i2 >= i) {
            long[] jArr = this.f40904c;
            System.arraycopy(jArr, i2, jArr, i, this.f40905d - i2);
            this.f40905d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo50190c();
        m58847h(i);
        long[] jArr = this.f40904c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f40905d;
    }

    private zzdt(long[] jArr, int i) {
        this.f40904c = jArr;
        this.f40905d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        mo50190c();
        int i = this.f40905d;
        long[] jArr = this.f40904c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f40904c = jArr2;
        }
        long[] jArr3 = this.f40904c;
        int i2 = this.f40905d;
        this.f40905d = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
