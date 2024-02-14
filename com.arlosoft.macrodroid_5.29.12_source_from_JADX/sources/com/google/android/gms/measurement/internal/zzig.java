package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f47063a;

    /* renamed from: c */
    final /* synthetic */ zzie f47064c;

    /* renamed from: d */
    final /* synthetic */ zzie f47065d;

    /* renamed from: f */
    final /* synthetic */ long f47066f;

    /* renamed from: g */
    final /* synthetic */ zzim f47067g;

    zzig(zzim zzim, Bundle bundle, zzie zzie, zzie zzie2, long j) {
        this.f47067g = zzim;
        this.f47063a = bundle;
        this.f47064c = zzie;
        this.f47065d = zzie2;
        this.f47066f = j;
    }

    public final void run() {
        zzim.m65908u(this.f47067g, this.f47063a, this.f47064c, this.f47065d, this.f47066f);
    }
}
