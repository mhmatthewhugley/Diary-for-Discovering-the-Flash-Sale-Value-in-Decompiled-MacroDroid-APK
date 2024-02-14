package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1683m implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ EventStore f1555a;

    public /* synthetic */ C1683m(EventStore eventStore) {
        this.f1555a = eventStore;
    }

    public final Object execute() {
        return Integer.valueOf(this.f1555a.mo19600P());
    }
}
