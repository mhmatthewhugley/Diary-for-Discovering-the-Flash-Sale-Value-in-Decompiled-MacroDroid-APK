package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;

/* renamed from: com.google.firebase.crashlytics.internal.send.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1919b implements TransportScheduleCallback {

    /* renamed from: a */
    public final /* synthetic */ ReportQueue f5471a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f5472b;

    /* renamed from: c */
    public final /* synthetic */ CrashlyticsReportWithSessionId f5473c;

    public /* synthetic */ C1919b(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f5471a = reportQueue;
        this.f5472b = taskCompletionSource;
        this.f5473c = crashlyticsReportWithSessionId;
    }

    /* renamed from: a */
    public final void mo19275a(Exception exc) {
        this.f5471a.m7568n(this.f5472b, this.f5473c, exc);
    }
}
