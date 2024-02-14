package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfxc extends zzfvs {

    /* renamed from: s */
    private static final Object[] f36524s;

    /* renamed from: z */
    static final zzfxc f36525z;

    /* renamed from: d */
    final transient Object[] f36526d;

    /* renamed from: f */
    private final transient int f36527f;

    /* renamed from: g */
    final transient Object[] f36528g;

    /* renamed from: o */
    private final transient int f36529o;

    /* renamed from: p */
    private final transient int f36530p;

    static {
        Object[] objArr = new Object[0];
        f36524s = objArr;
        f36525z = new zzfxc(objArr, 0, objArr, 0, 0);
    }

    zzfxc(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f36526d = objArr;
        this.f36527f = i;
        this.f36528g = objArr2;
        this.f36529o = i2;
        this.f36530p = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46413c(Object[] objArr, int i) {
        System.arraycopy(this.f36526d, 0, objArr, i, this.f36530p);
        return i + this.f36530p;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f36528g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = zzfvf.m51101b(obj);
        while (true) {
            int i = b & this.f36529o;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo46416d() {
        return this.f36530p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo46417f() {
        return 0;
    }

    public final int hashCode() {
        return this.f36527f;
    }

    /* renamed from: i */
    public final zzfxm mo46419i() {
        return mo46418h().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo46418h().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo46422k() {
        return this.f36526d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final zzfvn mo46476m() {
        return zzfvn.m51131p(this.f36526d, this.f36530p);
    }

    public final int size() {
        return this.f36530p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo46477w() {
        return true;
    }
}
