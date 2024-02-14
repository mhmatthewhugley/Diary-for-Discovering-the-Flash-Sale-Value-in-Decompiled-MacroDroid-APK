package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1676f implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1538a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1539b;

    public /* synthetic */ C1676f(Uploader uploader, TransportContext transportContext) {
        this.f1538a = uploader;
        this.f1539b = transportContext;
    }

    public final Object execute() {
        return this.f1538a.m1457m(this.f1539b);
    }
}
