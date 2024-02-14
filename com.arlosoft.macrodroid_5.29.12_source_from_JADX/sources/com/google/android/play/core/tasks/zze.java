package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zze implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f51967a;

    /* renamed from: c */
    final /* synthetic */ zzf f51968c;

    zze(zzf zzf, Task task) {
        this.f51968c = zzf;
        this.f51967a = task;
    }

    public final void run() {
        synchronized (this.f51968c.f51970b) {
            zzf zzf = this.f51968c;
            if (zzf.f51971c != null) {
                zzf.f51971c.mo32242b(this.f51967a.mo60021g());
            }
        }
    }
}
