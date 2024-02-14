package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdb extends zzbt<Integer> implements RandomAccess, zzel {

    /* renamed from: f */
    private static final zzdb f40875f;

    /* renamed from: c */
    private int[] f40876c;

    /* renamed from: d */
    private int f40877d;

    static {
        zzdb zzdb = new zzdb(new int[0], 0);
        f40875f = zzdb;
        zzdb.zzb();
    }

    zzdb() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    private final void m58811f(int i) {
        if (i < 0 || i >= this.f40877d) {
            throw new IndexOutOfBoundsException(m58812h(i));
        }
    }

    /* renamed from: h */
    private final String m58812h(int i) {
        int i2 = this.f40877d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= this.f40877d) {
            return new zzdb(Arrays.copyOf(this.f40876c, i), this.f40877d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo50190c();
        if (i < 0 || i > (i2 = this.f40877d)) {
            throw new IndexOutOfBoundsException(m58812h(i));
        }
        int[] iArr = this.f40876c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f40876c, i, iArr2, i + 1, this.f40877d - i);
            this.f40876c = iArr2;
        }
        this.f40876c[i] = intValue;
        this.f40877d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo50190c();
        zzdh.m58816a(collection);
        if (!(collection instanceof zzdb)) {
            return super.addAll(collection);
        }
        zzdb zzdb = (zzdb) collection;
        int i = zzdb.f40877d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40877d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f40876c;
            if (i3 > iArr.length) {
                this.f40876c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzdb.f40876c, 0, this.f40876c, this.f40877d, zzdb.f40877d);
            this.f40877d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo50315d(int i) {
        m58811f(i);
        return this.f40876c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return super.equals(obj);
        }
        zzdb zzdb = (zzdb) obj;
        if (this.f40877d != zzdb.f40877d) {
            return false;
        }
        int[] iArr = zzdb.f40876c;
        for (int i = 0; i < this.f40877d; i++) {
            if (this.f40876c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m58811f(i);
        return Integer.valueOf(this.f40876c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40877d; i2++) {
            i = (i * 31) + this.f40876c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f40877d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40876c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50190c();
        m58811f(i);
        int[] iArr = this.f40876c;
        int i2 = iArr[i];
        int i3 = this.f40877d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f40877d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo50190c();
        if (i2 >= i) {
            int[] iArr = this.f40876c;
            System.arraycopy(iArr, i2, iArr, i, this.f40877d - i2);
            this.f40877d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo50190c();
        m58811f(i);
        int[] iArr = this.f40876c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f40877d;
    }

    private zzdb(int[] iArr, int i) {
        this.f40876c = iArr;
        this.f40877d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo50190c();
        int i = this.f40877d;
        int[] iArr = this.f40876c;
        if (i == iArr.length) {
            int[] iArr2 = new int[(((i * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f40876c = iArr2;
        }
        int[] iArr3 = this.f40876c;
        int i2 = this.f40877d;
        this.f40877d = i2 + 1;
        iArr3[i2] = intValue;
        return true;
    }
}
