package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzfa;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfa.zza {

    /* renamed from: a */
    private zzfa f46395a;

    @MainThread
    /* renamed from: a */
    public void mo54883a(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f46395a == null) {
            this.f46395a = new zzfa(this);
        }
        this.f46395a.mo55144a(context, intent);
    }
}
