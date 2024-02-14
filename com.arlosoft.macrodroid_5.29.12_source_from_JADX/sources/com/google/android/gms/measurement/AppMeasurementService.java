package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementService extends Service implements zzjs {

    /* renamed from: a */
    private zzjt f46396a;

    /* renamed from: c */
    private final zzjt m65322c() {
        if (this.f46396a == null) {
            this.f46396a = new zzjt(this);
        }
        return this.f46396a;
    }

    /* renamed from: a */
    public final void mo54874a(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: b */
    public final void mo54875b(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final boolean mo54876f(int i) {
        return stopSelfResult(i);
    }

    @MainThread
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return m65322c().mo55475b(intent);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m65322c().mo55478e();
    }

    @MainThread
    public void onDestroy() {
        m65322c().mo55479f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m65322c().mo55480g(intent);
    }

    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        m65322c().mo55474a(intent, i, i2);
        return 2;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m65322c().mo55483j(intent);
        return true;
    }
}
