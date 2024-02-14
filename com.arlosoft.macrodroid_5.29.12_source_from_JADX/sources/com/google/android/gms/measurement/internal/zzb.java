package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f46485a;

    /* renamed from: c */
    final /* synthetic */ long f46486c;

    /* renamed from: d */
    final /* synthetic */ zzd f46487d;

    zzb(zzd zzd, String str, long j) {
        this.f46487d = zzd;
        this.f46485a = str;
        this.f46486c = j;
    }

    public final void run() {
        zzd.m65473g(this.f46487d, this.f46485a, this.f46486c);
    }
}
