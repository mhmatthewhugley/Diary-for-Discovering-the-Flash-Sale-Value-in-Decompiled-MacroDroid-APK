package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zza implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f46400a;

    /* renamed from: c */
    final /* synthetic */ long f46401c;

    /* renamed from: d */
    final /* synthetic */ zzd f46402d;

    zza(zzd zzd, String str, long j) {
        this.f46402d = zzd;
        this.f46400a = str;
        this.f46401c = j;
    }

    public final void run() {
        zzd.m65472f(this.f46402d, this.f46400a, this.f46401c);
    }
}
