package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzbt<E> extends zzbs<E> {

    /* renamed from: g */
    static final zzbs<Object> f41135g = new zzbt(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f41136d;

    /* renamed from: f */
    private final transient int f41137f;

    zzbt(Object[] objArr, int i) {
        this.f41136d = objArr;
        this.f41137f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object[] mo50605d() {
        return this.f41136d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo50606f() {
        return 0;
    }

    public final E get(int i) {
        zzbm.m59265a(i, this.f41137f, "index");
        return this.f41136d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo50607h() {
        return this.f41137f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo50610j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo50611k(Object[] objArr, int i) {
        System.arraycopy(this.f41136d, 0, objArr, 0, this.f41137f);
        return this.f41137f;
    }

    public final int size() {
        return this.f41137f;
    }
}
