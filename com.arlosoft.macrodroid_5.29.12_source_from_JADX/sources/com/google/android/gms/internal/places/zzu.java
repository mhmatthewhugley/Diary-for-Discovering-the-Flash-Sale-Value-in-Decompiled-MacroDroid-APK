package com.google.android.gms.internal.places;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzu extends zzq<Boolean> implements zzcw, RandomAccess {

    /* renamed from: f */
    private static final zzu f45468f;

    /* renamed from: c */
    private boolean[] f45469c;

    /* renamed from: d */
    private int f45470d;

    static {
        zzu zzu = new zzu(new boolean[0], 0);
        f45468f = zzu;
        zzu.mo53475h2();
    }

    zzu() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final void m63858f(int i, boolean z) {
        int i2;
        mo53665c();
        if (i < 0 || i > (i2 = this.f45470d)) {
            throw new IndexOutOfBoundsException(m63860i(i));
        }
        boolean[] zArr = this.f45469c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f45469c, i, zArr2, i + 1, this.f45470d - i);
            this.f45469c = zArr2;
        }
        this.f45469c[i] = z;
        this.f45470d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final void m63859h(int i) {
        if (i < 0 || i >= this.f45470d) {
            throw new IndexOutOfBoundsException(m63860i(i));
        }
    }

    /* renamed from: i */
    private final String m63860i(int i) {
        int i2 = this.f45470d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= this.f45470d) {
            return new zzu(Arrays.copyOf(this.f45469c, i), this.f45470d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m63858f(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo53665c();
        zzbd.m63340a(collection);
        if (!(collection instanceof zzu)) {
            return super.addAll(collection);
        }
        zzu zzu = (zzu) collection;
        int i = zzu.f45470d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45470d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f45469c;
            if (i3 > zArr.length) {
                this.f45469c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzu.f45469c, 0, this.f45469c, this.f45470d, zzu.f45470d);
            this.f45470d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final void mo53666d(boolean z) {
        m63858f(this.f45470d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzu)) {
            return super.equals(obj);
        }
        zzu zzu = (zzu) obj;
        if (this.f45470d != zzu.f45470d) {
            return false;
        }
        boolean[] zArr = zzu.f45469c;
        for (int i = 0; i < this.f45470d; i++) {
            if (this.f45469c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m63859h(i);
        return Boolean.valueOf(this.f45469c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45470d; i2++) {
            i = (i * 31) + zzbd.m63345f(this.f45469c[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo53665c();
        for (int i = 0; i < this.f45470d; i++) {
            if (obj.equals(Boolean.valueOf(this.f45469c[i]))) {
                boolean[] zArr = this.f45469c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f45470d - i) - 1);
                this.f45470d--;
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
            boolean[] zArr = this.f45469c;
            System.arraycopy(zArr, i2, zArr, i, this.f45470d - i2);
            this.f45470d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo53665c();
        m63859h(i);
        boolean[] zArr = this.f45469c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f45470d;
    }

    private zzu(boolean[] zArr, int i) {
        this.f45469c = zArr;
        this.f45470d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        m63859h(i);
        boolean[] zArr = this.f45469c;
        boolean z = zArr[i];
        int i2 = this.f45470d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f45470d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }
}
