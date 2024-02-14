package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1672b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f1529a;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f1530c;

    public /* synthetic */ C1672b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f1529a = jobInfoSchedulerService;
        this.f1530c = jobParameters;
    }

    public final void run() {
        this.f1529a.m1425b(this.f1530c);
    }
}
