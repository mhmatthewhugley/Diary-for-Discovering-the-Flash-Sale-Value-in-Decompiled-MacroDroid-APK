package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzh f48021a;

    zzg(zzh zzh) {
        this.f48021a = zzh;
    }

    public final void run() {
        synchronized (this.f48021a.f48023b) {
            zzh zzh = this.f48021a;
            if (zzh.f48024c != null) {
                zzh.f48024c.mo30644d();
            }
        }
    }
}
