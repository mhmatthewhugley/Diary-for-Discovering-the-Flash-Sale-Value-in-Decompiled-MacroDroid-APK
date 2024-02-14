package com.google.android.play.core.internal;

import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzai implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ zzas f51661a;

    public /* synthetic */ zzai(zzas zzas) {
        this.f51661a = zzas;
    }

    public final void binderDied() {
        zzas.m70814i(this.f51661a);
    }
}
