package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p287ia.C12478a;

public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* renamed from: a */
    private final C12478a<Executor> f1470a;

    /* renamed from: b */
    private final C12478a<BackendRegistry> f1471b;

    /* renamed from: c */
    private final C12478a<WorkScheduler> f1472c;

    /* renamed from: d */
    private final C12478a<EventStore> f1473d;

    /* renamed from: e */
    private final C12478a<SynchronizationGuard> f1474e;

    public DefaultScheduler_Factory(C12478a<Executor> aVar, C12478a<BackendRegistry> aVar2, C12478a<WorkScheduler> aVar3, C12478a<EventStore> aVar4, C12478a<SynchronizationGuard> aVar5) {
        this.f1470a = aVar;
        this.f1471b = aVar2;
        this.f1472c = aVar3;
        this.f1473d = aVar4;
        this.f1474e = aVar5;
    }

    /* renamed from: a */
    public static DefaultScheduler_Factory m1394a(C12478a<Executor> aVar, C12478a<BackendRegistry> aVar2, C12478a<WorkScheduler> aVar3, C12478a<EventStore> aVar4, C12478a<SynchronizationGuard> aVar5) {
        return new DefaultScheduler_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static DefaultScheduler m1395c(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    /* renamed from: b */
    public DefaultScheduler get() {
        return m1395c(this.f1470a.get(), this.f1471b.get(), this.f1472c.get(), this.f1473d.get(), this.f1474e.get());
    }
}
