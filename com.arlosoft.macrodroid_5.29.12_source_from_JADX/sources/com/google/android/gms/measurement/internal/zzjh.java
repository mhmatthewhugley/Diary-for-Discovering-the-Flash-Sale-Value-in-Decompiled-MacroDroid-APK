package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f47161a;

    /* renamed from: c */
    final /* synthetic */ zzjl f47162c;

    zzjh(zzjl zzjl, ComponentName componentName) {
        this.f47162c = zzjl;
        this.f47161a = componentName;
    }

    public final void run() {
        zzjm.m65939M(this.f47162c.f47169d, this.f47161a);
    }
}
