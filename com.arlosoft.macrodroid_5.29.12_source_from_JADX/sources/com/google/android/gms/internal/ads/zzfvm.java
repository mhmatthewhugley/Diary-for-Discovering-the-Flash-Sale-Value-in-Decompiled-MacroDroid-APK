package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfvm extends zzfvn {

    /* renamed from: d */
    final transient int f36471d;

    /* renamed from: f */
    final transient int f36472f;
    final /* synthetic */ zzfvn zzc;

    zzfvm(zzfvn zzfvn, int i, int i2) {
        this.zzc = zzfvn;
        this.f36471d = i;
        this.f36472f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo46416d() {
        return this.zzc.mo46417f() + this.f36471d + this.f36472f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo46417f() {
        return this.zzc.mo46417f() + this.f36471d;
    }

    public final Object get(int i) {
        zzfsx.m50936a(i, this.f36472f, "index");
        return this.zzc.get(i + this.f36471d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo46421j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo46422k() {
        return this.zzc.mo46422k();
    }

    /* renamed from: l */
    public final zzfvn mo46432l(int i, int i2) {
        zzfsx.m50942g(i, i2, this.f36472f);
        zzfvn zzfvn = this.zzc;
        int i3 = this.f36471d;
        return zzfvn.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f36472f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
