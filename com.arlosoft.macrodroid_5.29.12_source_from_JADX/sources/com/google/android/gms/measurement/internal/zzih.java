package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzih implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzie f47068a;

    /* renamed from: c */
    final /* synthetic */ zzie f47069c;

    /* renamed from: d */
    final /* synthetic */ long f47070d;

    /* renamed from: f */
    final /* synthetic */ boolean f47071f;

    /* renamed from: g */
    final /* synthetic */ zzim f47072g;

    zzih(zzim zzim, zzie zzie, zzie zzie2, long j, boolean z) {
        this.f47072g = zzim;
        this.f47068a = zzie;
        this.f47069c = zzie2;
        this.f47070d = j;
        this.f47071f = z;
    }

    public final void run() {
        this.f47072g.m65903m(this.f47068a, this.f47069c, this.f47070d, this.f47071f, (Bundle) null);
    }
}
