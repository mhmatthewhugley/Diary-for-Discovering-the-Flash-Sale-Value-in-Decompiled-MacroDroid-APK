package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1682l implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ ClientHealthMetricsStore f1554a;

    public /* synthetic */ C1682l(ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f1554a = clientHealthMetricsStore;
    }

    public final Object execute() {
        return this.f1554a.mo19597e();
    }
}
