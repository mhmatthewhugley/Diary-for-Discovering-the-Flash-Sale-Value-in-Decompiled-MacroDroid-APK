package com.google.android.gms.internal.location;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzbr extends zzbs {

    /* renamed from: d */
    final transient int f41132d;

    /* renamed from: f */
    final transient int f41133f;
    final /* synthetic */ zzbs zzc;

    zzbr(zzbs zzbs, int i, int i2) {
        this.zzc = zzbs;
        this.f41132d = i;
        this.f41133f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object[] mo50605d() {
        return this.zzc.mo50605d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo50606f() {
        return this.zzc.mo50606f() + this.f41132d;
    }

    public final Object get(int i) {
        zzbm.m59265a(i, this.f41133f, "index");
        return this.zzc.get(i + this.f41132d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo50607h() {
        return this.zzc.mo50606f() + this.f41132d + this.f41133f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo50610j() {
        return true;
    }

    /* renamed from: l */
    public final zzbs mo50618l(int i, int i2) {
        zzbm.m59267c(i, i2, this.f41133f);
        zzbs zzbs = this.zzc;
        int i3 = this.f41132d;
        return zzbs.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f41133f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
