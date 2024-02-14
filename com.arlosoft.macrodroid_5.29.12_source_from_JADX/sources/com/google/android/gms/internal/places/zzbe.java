package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbe extends zzq<Integer> implements zzbi, zzcw, RandomAccess {

    /* renamed from: f */
    private static final zzbe f45281f;

    /* renamed from: c */
    private int[] f45282c;

    /* renamed from: d */
    private int f45283d;

    static {
        zzbe zzbe = new zzbe(new int[0], 0);
        f45281f = zzbe;
        zzbe.mo53475h2();
    }

    zzbe() {
        this(new int[10], 0);
    }

    /* renamed from: h */
    public static zzbe m63350h() {
        return f45281f;
    }

    /* renamed from: i */
    private final void m63351i(int i) {
        if (i < 0 || i >= this.f45283d) {
            throw new IndexOutOfBoundsException(m63352j(i));
        }
    }

    /* renamed from: j */
    private final String m63352j(int i) {
        int i2 = this.f45283d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m63353k(int i, int i2) {
        int i3;
        mo53665c();
        if (i < 0 || i > (i3 = this.f45283d)) {
            throw new IndexOutOfBoundsException(m63352j(i));
        }
        int[] iArr = this.f45282c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f45282c, i, iArr2, i + 1, this.f45283d - i);
            this.f45282c = iArr2;
        }
        this.f45282c[i] = i2;
        this.f45283d++;
        this.modCount++;
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= this.f45283d) {
            return new zzbe(Arrays.copyOf(this.f45282c, i), this.f45283d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m63353k(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo53665c();
        zzbd.m63340a(collection);
        if (!(collection instanceof zzbe)) {
            return super.addAll(collection);
        }
        zzbe zzbe = (zzbe) collection;
        int i = zzbe.f45283d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45283d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f45282c;
            if (i3 > iArr.length) {
                this.f45282c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzbe.f45282c, 0, this.f45282c, this.f45283d, zzbe.f45283d);
            this.f45283d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final int mo53467d(int i) {
        m63351i(i);
        return this.f45282c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbe)) {
            return super.equals(obj);
        }
        zzbe zzbe = (zzbe) obj;
        if (this.f45283d != zzbe.f45283d) {
            return false;
        }
        int[] iArr = zzbe.f45282c;
        for (int i = 0; i < this.f45283d; i++) {
            if (this.f45282c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo53468f(int i) {
        m63353k(this.f45283d, i);
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo53467d(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45283d; i2++) {
            i = (i * 31) + this.f45282c[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo53665c();
        for (int i = 0; i < this.f45283d; i++) {
            if (obj.equals(Integer.valueOf(this.f45282c[i]))) {
                int[] iArr = this.f45282c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f45283d - i) - 1);
                this.f45283d--;
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
            int[] iArr = this.f45282c;
            System.arraycopy(iArr, i2, iArr, i, this.f45283d - i2);
            this.f45283d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo53665c();
        m63351i(i);
        int[] iArr = this.f45282c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f45283d;
    }

    private zzbe(int[] iArr, int i) {
        this.f45282c = iArr;
        this.f45283d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        m63351i(i);
        int[] iArr = this.f45282c;
        int i2 = iArr[i];
        int i3 = this.f45283d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f45283d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
