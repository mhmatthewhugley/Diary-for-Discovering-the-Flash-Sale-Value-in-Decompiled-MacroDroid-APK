package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1678h implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1543a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1544b;

    /* renamed from: c */
    public final /* synthetic */ long f1545c;

    public /* synthetic */ C1678h(Uploader uploader, TransportContext transportContext, long j) {
        this.f1543a = uploader;
        this.f1544b = transportContext;
        this.f1545c = j;
    }

    public final Object execute() {
        return this.f1543a.m1462r(this.f1544b, this.f1545c);
    }
}
