package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementJobService extends JobService implements zzjs {

    /* renamed from: a */
    private zzjt f46394a;

    /* renamed from: c */
    private final zzjt m65317c() {
        if (this.f46394a == null) {
            this.f46394a = new zzjt(this);
        }
        return this.f46394a;
    }

    /* renamed from: a */
    public final void mo54874a(@NonNull Intent intent) {
    }

    /* renamed from: b */
    public final void mo54875b(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: f */
    public final boolean mo54876f(int i) {
        throw new UnsupportedOperationException();
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m65317c().mo55478e();
    }

    @MainThread
    public void onDestroy() {
        m65317c().mo55479f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m65317c().mo55480g(intent);
    }

    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        m65317c().mo55482i(jobParameters);
        return true;
    }

    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m65317c().mo55483j(intent);
        return true;
    }
}
