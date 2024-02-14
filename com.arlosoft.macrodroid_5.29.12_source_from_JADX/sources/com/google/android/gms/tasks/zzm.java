package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48035a;

    /* renamed from: c */
    final /* synthetic */ zzn f48036c;

    zzm(zzn zzn, Task task) {
        this.f48036c = zzn;
        this.f48035a = task;
    }

    public final void run() {
        synchronized (this.f48036c.f48038b) {
            zzn zzn = this.f48036c;
            if (zzn.f48039c != null) {
                zzn.f48039c.mo22751b(this.f48035a.mo23715p());
            }
        }
    }
}
