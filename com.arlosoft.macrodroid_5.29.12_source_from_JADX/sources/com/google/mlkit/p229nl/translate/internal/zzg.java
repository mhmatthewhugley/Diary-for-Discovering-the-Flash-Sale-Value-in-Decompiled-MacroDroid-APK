package com.google.mlkit.p229nl.translate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;

/* renamed from: com.google.mlkit.nl.translate.internal.zzg */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzg extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ zzi f56507a;

    zzg(zzi zzi, zzi zzi2) {
        this.f56507a = zzi2;
    }

    public final void onReceive(Context context, Intent intent) {
        MLTaskExecutor.m79033b().mo64549a().post(new zzf(this.f56507a));
    }
}
