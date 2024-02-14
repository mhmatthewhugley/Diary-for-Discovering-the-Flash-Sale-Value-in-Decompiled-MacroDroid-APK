package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzkk extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ zzkl f37749a;

    /* synthetic */ zzkk(zzkl zzkl, zzkj zzkj) {
        this.f37749a = zzkl;
    }

    public final void onReceive(Context context, Intent intent) {
        zzkl zzkl = this.f37749a;
        zzkl.f37751b.post(new zzki(zzkl));
    }
}
