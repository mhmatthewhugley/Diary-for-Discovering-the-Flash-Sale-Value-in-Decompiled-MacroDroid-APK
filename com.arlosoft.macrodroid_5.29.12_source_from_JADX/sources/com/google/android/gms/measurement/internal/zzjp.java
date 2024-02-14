package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzjp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzjt f47186a;

    /* renamed from: c */
    public final /* synthetic */ zzeh f47187c;

    /* renamed from: d */
    public final /* synthetic */ JobParameters f47188d;

    public /* synthetic */ zzjp(zzjt zzjt, zzeh zzeh, JobParameters jobParameters) {
        this.f47186a = zzjt;
        this.f47187c = zzeh;
        this.f47188d = jobParameters;
    }

    public final void run() {
        this.f47186a.mo55477d(this.f47187c, this.f47188d);
    }
}
