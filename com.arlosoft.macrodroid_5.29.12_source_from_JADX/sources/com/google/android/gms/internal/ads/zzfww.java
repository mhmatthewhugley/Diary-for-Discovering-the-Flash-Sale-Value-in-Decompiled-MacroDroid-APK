package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfww extends zzfvn {

    /* renamed from: g */
    static final zzfvn f36502g = new zzfww(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f36503d;

    /* renamed from: f */
    private final transient int f36504f;

    zzfww(Object[] objArr, int i) {
        this.f36503d = objArr;
        this.f36504f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46413c(Object[] objArr, int i) {
        System.arraycopy(this.f36503d, 0, objArr, i, this.f36504f);
        return i + this.f36504f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo46416d() {
        return this.f36504f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo46417f() {
        return 0;
    }

    public final Object get(int i) {
        zzfsx.m50936a(i, this.f36504f, "index");
        Object obj = this.f36503d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo46421j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo46422k() {
        return this.f36503d;
    }

    public final int size() {
        return this.f36504f;
    }
}
