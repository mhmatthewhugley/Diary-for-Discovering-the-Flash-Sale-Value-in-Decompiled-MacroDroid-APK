package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzaj extends zzaa {

    /* renamed from: s */
    private static final Object[] f43102s;

    /* renamed from: z */
    static final zzaj f43103z;

    /* renamed from: d */
    final transient Object[] f43104d;

    /* renamed from: f */
    private final transient int f43105f;

    /* renamed from: g */
    final transient Object[] f43106g;

    /* renamed from: o */
    private final transient int f43107o;

    /* renamed from: p */
    private final transient int f43108p;

    static {
        Object[] objArr = new Object[0];
        f43102s = objArr;
        f43103z = new zzaj(objArr, 0, objArr, 0, 0);
    }

    zzaj(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f43104d = objArr;
        this.f43105f = i;
        this.f43106g = objArr2;
        this.f43107o = i2;
        this.f43108p = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo52031c(Object[] objArr, int i) {
        System.arraycopy(this.f43104d, 0, objArr, 0, this.f43108p);
        return this.f43108p;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f43106g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = zzo.m62080a(obj.hashCode());
        while (true) {
            int i = a & this.f43107o;
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
    public final int mo52032d() {
        return this.f43108p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo52033f() {
        return 0;
    }

    /* renamed from: h */
    public final zzam mo52023h() {
        return mo52026k().listIterator(0);
    }

    public final int hashCode() {
        return this.f43105f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo52035i() {
        return this.f43104d;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo52026k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final zzv mo52027l() {
        return zzv.m62254m(this.f43104d, this.f43108p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo52028p() {
        return true;
    }

    public final int size() {
        return this.f43108p;
    }
}
