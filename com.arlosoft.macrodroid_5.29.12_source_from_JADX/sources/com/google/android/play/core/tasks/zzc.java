package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f51962a;

    /* renamed from: c */
    final /* synthetic */ zzd f51963c;

    zzc(zzd zzd, Task task) {
        this.f51963c = zzd;
        this.f51962a = task;
    }

    public final void run() {
        synchronized (this.f51963c.f51965b) {
            zzd zzd = this.f51963c;
            if (zzd.f51966c != null) {
                zzd.f51966c.mo32241c(this.f51962a.mo60020f());
            }
        }
    }
}
