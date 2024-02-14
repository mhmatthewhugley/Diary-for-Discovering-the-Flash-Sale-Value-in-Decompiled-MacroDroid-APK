package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfxa extends zzfvn {

    /* renamed from: d */
    private final transient Object[] f36517d;

    /* renamed from: f */
    private final transient int f36518f;

    /* renamed from: g */
    private final transient int f36519g;

    zzfxa(Object[] objArr, int i, int i2) {
        this.f36517d = objArr;
        this.f36518f = i;
        this.f36519g = i2;
    }

    public final Object get(int i) {
        zzfsx.m50936a(i, this.f36519g, "index");
        Object obj = this.f36517d[i + i + this.f36518f];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo46421j() {
        return true;
    }

    public final int size() {
        return this.f36519g;
    }
}
