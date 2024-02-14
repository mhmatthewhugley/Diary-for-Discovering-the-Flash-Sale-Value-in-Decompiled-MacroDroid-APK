package com.google.android.gms.internal.nearby;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzsp extends zzsq {

    /* renamed from: d */
    final transient int f45105d;

    /* renamed from: f */
    final transient int f45106f;
    final /* synthetic */ zzsq zzc;

    zzsp(zzsq zzsq, int i, int i2) {
        this.zzc = zzsq;
        this.f45105d = i;
        this.f45106f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo53241d() {
        return this.zzc.mo53242f() + this.f45105d + this.f45106f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo53242f() {
        return this.zzc.mo53242f() + this.f45105d;
    }

    public final Object get(int i) {
        zzsg.m62983a(i, this.f45106f, "index");
        return this.zzc.get(i + this.f45105d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo53246j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo53247k() {
        return this.zzc.mo53247k();
    }

    /* renamed from: l */
    public final zzsq mo53254l(int i, int i2) {
        zzsg.m62989g(i, i2, this.f45106f);
        zzsq zzsq = this.zzc;
        int i3 = this.f45105d;
        return zzsq.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f45106f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
