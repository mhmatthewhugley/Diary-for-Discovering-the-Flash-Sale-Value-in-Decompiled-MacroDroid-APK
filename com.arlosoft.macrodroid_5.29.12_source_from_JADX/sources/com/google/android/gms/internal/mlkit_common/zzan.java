package com.google.android.gms.internal.mlkit_common;

import java.util.List;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzan extends zzao {

    /* renamed from: d */
    final transient int f41938d;

    /* renamed from: f */
    final transient int f41939f;
    final /* synthetic */ zzao zzc;

    zzan(zzao zzao, int i, int i2) {
        this.zzc = zzao;
        this.f41938d = i;
        this.f41939f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo51733d() {
        return this.zzc.mo51734f() + this.f41938d + this.f41939f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo51734f() {
        return this.zzc.mo51734f() + this.f41938d;
    }

    public final Object get(int i) {
        zzac.m61133a(i, this.f41939f, "index");
        return this.zzc.get(i + this.f41938d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo51736i() {
        return this.zzc.mo51736i();
    }

    /* renamed from: j */
    public final zzao mo51746j(int i, int i2) {
        zzac.m61135c(i, i2, this.f41939f);
        zzao zzao = this.zzc;
        int i3 = this.f41938d;
        return zzao.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f41939f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
