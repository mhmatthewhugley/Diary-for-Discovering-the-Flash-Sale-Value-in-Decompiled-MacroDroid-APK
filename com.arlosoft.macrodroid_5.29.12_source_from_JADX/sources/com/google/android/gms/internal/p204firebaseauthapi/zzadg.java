package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzadg extends zzabn implements RandomAccess, zzaer {

    /* renamed from: f */
    private static final zzadg f39742f;

    /* renamed from: c */
    private int[] f39743c;

    /* renamed from: d */
    private int f39744d;

    static {
        zzadg zzadg = new zzadg(new int[0], 0);
        f39742f = zzadg;
        zzadg.zzb();
    }

    zzadg() {
        this(new int[10], 0);
    }

    /* renamed from: E */
    private final void m56450E(int i) {
        if (i < 0 || i >= this.f39744d) {
            throw new IndexOutOfBoundsException(m56451h(i));
        }
    }

    /* renamed from: h */
    private final String m56451h(int i) {
        int i2 = this.f39744d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= this.f39744d) {
            return new zzadg(Arrays.copyOf(this.f39743c, i), this.f39744d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo48867c();
        if (i < 0 || i > (i2 = this.f39744d)) {
            throw new IndexOutOfBoundsException(m56451h(i));
        }
        int[] iArr = this.f39743c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f39743c, i, iArr2, i + 1, this.f39744d - i);
            this.f39743c = iArr2;
        }
        this.f39743c[i] = intValue;
        this.f39744d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo48867c();
        zzadl.m56461e(collection);
        if (!(collection instanceof zzadg)) {
            return super.addAll(collection);
        }
        zzadg zzadg = (zzadg) collection;
        int i = zzadg.f39744d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39744d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f39743c;
            if (i3 > iArr.length) {
                this.f39743c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzadg.f39743c, 0, this.f39743c, this.f39744d, zzadg.f39744d);
            this.f39744d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo49092d(int i) {
        m56450E(i);
        return this.f39743c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadg)) {
            return super.equals(obj);
        }
        zzadg zzadg = (zzadg) obj;
        if (this.f39744d != zzadg.f39744d) {
            return false;
        }
        int[] iArr = zzadg.f39743c;
        for (int i = 0; i < this.f39744d; i++) {
            if (this.f39743c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo49093f(int i) {
        mo48867c();
        int i2 = this.f39744d;
        int[] iArr = this.f39743c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f39743c = iArr2;
        }
        int[] iArr3 = this.f39743c;
        int i3 = this.f39744d;
        this.f39744d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        m56450E(i);
        return Integer.valueOf(this.f39743c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39744d; i2++) {
            i = (i * 31) + this.f39743c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f39744d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39743c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        m56450E(i);
        int[] iArr = this.f39743c;
        int i2 = iArr[i];
        int i3 = this.f39744d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f39744d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo48867c();
        if (i2 >= i) {
            int[] iArr = this.f39743c;
            System.arraycopy(iArr, i2, iArr, i, this.f39744d - i2);
            this.f39744d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo48867c();
        m56450E(i);
        int[] iArr = this.f39743c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f39744d;
    }

    private zzadg(int[] iArr, int i) {
        this.f39743c = iArr;
        this.f39744d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo49093f(((Integer) obj).intValue());
        return true;
    }
}
