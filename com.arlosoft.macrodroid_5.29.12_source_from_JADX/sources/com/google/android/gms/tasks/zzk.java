package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48030a;

    /* renamed from: c */
    final /* synthetic */ zzl f48031c;

    zzk(zzl zzl, Task task) {
        this.f48031c = zzl;
        this.f48030a = task;
    }

    public final void run() {
        synchronized (this.f48031c.f48033b) {
            zzl zzl = this.f48031c;
            if (zzl.f48034c != null) {
                zzl.f48034c.mo22733c((Exception) Preconditions.m4488k(this.f48030a.mo23714o()));
            }
        }
    }
}
