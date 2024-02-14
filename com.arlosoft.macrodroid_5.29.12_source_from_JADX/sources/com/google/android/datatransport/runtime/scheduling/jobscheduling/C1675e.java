package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1675e implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1536a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1537b;

    public /* synthetic */ C1675e(Uploader uploader, TransportContext transportContext) {
        this.f1536a = uploader;
        this.f1537b = transportContext;
    }

    public final Object execute() {
        return this.f1536a.m1456l(this.f1537b);
    }
}
