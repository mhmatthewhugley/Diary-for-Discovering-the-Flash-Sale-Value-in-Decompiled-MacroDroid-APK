package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzjl f47165a;

    zzjj(zzjl zzjl) {
        this.f47165a = zzjl;
    }

    public final void run() {
        zzjm zzjm = this.f47165a.f47169d;
        Context c = zzjm.f46899a.mo55202c();
        this.f47165a.f47169d.f46899a.mo55207h();
        zzjm.m65939M(zzjm, new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
