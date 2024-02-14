package com.google.android.gms.internal.nearby;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzsv extends zzsq {

    /* renamed from: g */
    static final zzsq f45111g = new zzsv(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f45112d;

    /* renamed from: f */
    private final transient int f45113f;

    zzsv(Object[] objArr, int i) {
        this.f45112d = objArr;
        this.f45113f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo53239c(Object[] objArr, int i) {
        System.arraycopy(this.f45112d, 0, objArr, 0, this.f45113f);
        return this.f45113f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo53241d() {
        return this.f45113f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo53242f() {
        return 0;
    }

    public final Object get(int i) {
        zzsg.m62983a(i, this.f45113f, "index");
        Object obj = this.f45112d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo53246j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo53247k() {
        return this.f45112d;
    }

    public final int size() {
        return this.f45113f;
    }
}
