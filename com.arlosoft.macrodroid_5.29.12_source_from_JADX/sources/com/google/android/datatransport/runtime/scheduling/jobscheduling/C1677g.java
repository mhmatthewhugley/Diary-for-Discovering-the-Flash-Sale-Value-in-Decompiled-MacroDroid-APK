package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1677g implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1540a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1541b;

    /* renamed from: c */
    public final /* synthetic */ int f1542c;

    public /* synthetic */ C1677g(Uploader uploader, TransportContext transportContext, int i) {
        this.f1540a = uploader;
        this.f1541b = transportContext;
        this.f1542c = i;
    }

    public final Object execute() {
        return this.f1540a.m1463s(this.f1541b, this.f1542c);
    }
}
