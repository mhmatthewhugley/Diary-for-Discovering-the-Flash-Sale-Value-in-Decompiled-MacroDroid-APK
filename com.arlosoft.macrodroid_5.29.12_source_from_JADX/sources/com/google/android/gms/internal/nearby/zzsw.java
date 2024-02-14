package com.google.android.gms.internal.nearby;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzsw extends zzss {

    /* renamed from: s */
    private static final Object[] f45114s;

    /* renamed from: z */
    static final zzsw f45115z;

    /* renamed from: d */
    final transient Object[] f45116d;

    /* renamed from: f */
    private final transient int f45117f;

    /* renamed from: g */
    final transient Object[] f45118g;

    /* renamed from: o */
    private final transient int f45119o;

    /* renamed from: p */
    private final transient int f45120p;

    static {
        Object[] objArr = new Object[0];
        f45114s = objArr;
        f45115z = new zzsw(objArr, 0, objArr, 0, 0);
    }

    zzsw(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f45116d = objArr;
        this.f45117f = i;
        this.f45118g = objArr2;
        this.f45119o = i2;
        this.f45120p = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo53239c(Object[] objArr, int i) {
        System.arraycopy(this.f45116d, 0, objArr, 0, this.f45120p);
        return this.f45120p;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f45118g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = zzsk.m62995a(obj.hashCode());
        while (true) {
            int i = a & this.f45119o;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo53241d() {
        return this.f45120p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo53242f() {
        return 0;
    }

    public final int hashCode() {
        return this.f45117f;
    }

    /* renamed from: i */
    public final zzsy mo53244i() {
        return mo53243h().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo53243h().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo53247k() {
        return this.f45116d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final zzsq mo53273m() {
        return zzsq.m63012n(this.f45116d, this.f45120p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo53274p() {
        return true;
    }

    public final int size() {
        return this.f45120p;
    }
}
