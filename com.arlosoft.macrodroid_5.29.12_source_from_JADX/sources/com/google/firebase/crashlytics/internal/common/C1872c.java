package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1872c implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ SessionReportingCoordinator f5036a;

    public /* synthetic */ C1872c(SessionReportingCoordinator sessionReportingCoordinator) {
        this.f5036a = sessionReportingCoordinator;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return Boolean.valueOf(this.f5036a.m6787p(task));
    }
}
