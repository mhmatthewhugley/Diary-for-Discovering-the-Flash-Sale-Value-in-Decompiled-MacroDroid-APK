package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48025a;

    /* renamed from: c */
    final /* synthetic */ zzj f48026c;

    zzi(zzj zzj, Task task) {
        this.f48026c = zzj;
        this.f48025a = task;
    }

    public final void run() {
        synchronized (this.f48026c.f48028b) {
            zzj zzj = this.f48026c;
            if (zzj.f48029c != null) {
                zzj.f48029c.mo21120a(this.f48025a);
            }
        }
    }
}
