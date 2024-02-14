package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzau extends zzao {

    /* renamed from: g */
    static final zzao f41951g = new zzau(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f41952d;

    /* renamed from: f */
    private final transient int f41953f;

    zzau(Object[] objArr, int i) {
        this.f41952d = objArr;
        this.f41953f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo51730c(Object[] objArr, int i) {
        System.arraycopy(this.f41952d, 0, objArr, 0, this.f41953f);
        return this.f41953f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo51733d() {
        return this.f41953f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo51734f() {
        return 0;
    }

    public final Object get(int i) {
        zzac.m61133a(i, this.f41953f, "index");
        Object obj = this.f41952d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo51736i() {
        return this.f41952d;
    }

    public final int size() {
        return this.f41953f;
    }
}
