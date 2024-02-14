package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfrq implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ zzfry f36307a;

    public /* synthetic */ zzfrq(zzfry zzfry) {
        this.f36307a = zzfry;
    }

    public final void binderDied() {
        zzfry.m50894h(this.f36307a);
    }
}
