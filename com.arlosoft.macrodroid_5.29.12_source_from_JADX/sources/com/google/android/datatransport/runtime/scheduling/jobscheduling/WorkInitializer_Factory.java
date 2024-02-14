package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p287ia.C12478a;

public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* renamed from: a */
    private final C12478a<Executor> f1524a;

    /* renamed from: b */
    private final C12478a<EventStore> f1525b;

    /* renamed from: c */
    private final C12478a<WorkScheduler> f1526c;

    /* renamed from: d */
    private final C12478a<SynchronizationGuard> f1527d;

    public WorkInitializer_Factory(C12478a<Executor> aVar, C12478a<EventStore> aVar2, C12478a<WorkScheduler> aVar3, C12478a<SynchronizationGuard> aVar4) {
        this.f1524a = aVar;
        this.f1525b = aVar2;
        this.f1526c = aVar3;
        this.f1527d = aVar4;
    }

    /* renamed from: a */
    public static WorkInitializer_Factory m1477a(C12478a<Executor> aVar, C12478a<EventStore> aVar2, C12478a<WorkScheduler> aVar3, C12478a<SynchronizationGuard> aVar4) {
        return new WorkInitializer_Factory(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static WorkInitializer m1478c(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    /* renamed from: b */
    public WorkInitializer get() {
        return m1478c(this.f1524a.get(), this.f1525b.get(), this.f1526c.get(), this.f1527d.get());
    }
}
