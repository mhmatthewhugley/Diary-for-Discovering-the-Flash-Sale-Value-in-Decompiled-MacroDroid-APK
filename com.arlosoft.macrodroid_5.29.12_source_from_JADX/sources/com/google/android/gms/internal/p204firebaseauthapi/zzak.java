package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzak extends zzal {

    /* renamed from: d */
    final transient int f39892d;

    /* renamed from: f */
    final transient int f39893f;
    final /* synthetic */ zzal zzc;

    zzak(zzal zzal, int i, int i2) {
        this.zzc = zzal;
        this.f39892d = i;
        this.f39893f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo49268d() {
        return this.zzc.mo49269f() + this.f39892d + this.f39893f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo49269f() {
        return this.zzc.mo49269f() + this.f39892d;
    }

    public final Object get(int i) {
        zzy.m58435a(i, this.f39893f, "index");
        return this.zzc.get(i + this.f39892d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo49271i() {
        return this.zzc.mo49271i();
    }

    /* renamed from: j */
    public final zzal mo49279j(int i, int i2) {
        zzy.m58437c(i, i2, this.f39893f);
        zzal zzal = this.zzc;
        int i3 = this.f39892d;
        return zzal.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f39893f;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
