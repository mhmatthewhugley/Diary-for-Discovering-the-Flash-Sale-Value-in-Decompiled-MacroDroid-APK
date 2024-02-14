package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f51957a;

    /* renamed from: c */
    final /* synthetic */ zzb f51958c;

    zza(zzb zzb, Task task) {
        this.f51958c = zzb;
        this.f51957a = task;
    }

    public final void run() {
        synchronized (this.f51958c.f51960b) {
            zzb zzb = this.f51958c;
            if (zzb.f51961c != null) {
                zzb.f51961c.mo59814a(this.f51957a);
            }
        }
    }
}
