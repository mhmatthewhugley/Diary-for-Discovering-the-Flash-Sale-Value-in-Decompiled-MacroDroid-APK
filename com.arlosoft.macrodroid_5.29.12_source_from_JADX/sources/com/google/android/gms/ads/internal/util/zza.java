package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zza implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzb f2140a;

    zza(zzb zzb) {
        this.f2140a = zzb;
    }

    public final void run() {
        this.f2140a.f2201b = Thread.currentThread();
        this.f2140a.mo20184a();
    }
}
