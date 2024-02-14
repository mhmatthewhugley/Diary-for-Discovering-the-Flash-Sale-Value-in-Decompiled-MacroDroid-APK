package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import p287ia.C12478a;

public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a */
    private final C12478a<Context> f1511a;

    /* renamed from: b */
    private final C12478a<BackendRegistry> f1512b;

    /* renamed from: c */
    private final C12478a<EventStore> f1513c;

    /* renamed from: d */
    private final C12478a<WorkScheduler> f1514d;

    /* renamed from: e */
    private final C12478a<Executor> f1515e;

    /* renamed from: f */
    private final C12478a<SynchronizationGuard> f1516f;

    /* renamed from: g */
    private final C12478a<Clock> f1517g;

    /* renamed from: h */
    private final C12478a<Clock> f1518h;

    /* renamed from: i */
    private final C12478a<ClientHealthMetricsStore> f1519i;

    public Uploader_Factory(C12478a<Context> aVar, C12478a<BackendRegistry> aVar2, C12478a<EventStore> aVar3, C12478a<WorkScheduler> aVar4, C12478a<Executor> aVar5, C12478a<SynchronizationGuard> aVar6, C12478a<Clock> aVar7, C12478a<Clock> aVar8, C12478a<ClientHealthMetricsStore> aVar9) {
        this.f1511a = aVar;
        this.f1512b = aVar2;
        this.f1513c = aVar3;
        this.f1514d = aVar4;
        this.f1515e = aVar5;
        this.f1516f = aVar6;
        this.f1517g = aVar7;
        this.f1518h = aVar8;
        this.f1519i = aVar9;
    }

    /* renamed from: a */
    public static Uploader_Factory m1469a(C12478a<Context> aVar, C12478a<BackendRegistry> aVar2, C12478a<EventStore> aVar3, C12478a<WorkScheduler> aVar4, C12478a<Executor> aVar5, C12478a<SynchronizationGuard> aVar6, C12478a<Clock> aVar7, C12478a<Clock> aVar8, C12478a<ClientHealthMetricsStore> aVar9) {
        return new Uploader_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static Uploader m1470c(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    /* renamed from: b */
    public Uploader get() {
        return m1470c(this.f1511a.get(), this.f1512b.get(), this.f1513c.get(), this.f1514d.get(), this.f1515e.get(), this.f1516f.get(), this.f1517g.get(), this.f1518h.get(), this.f1519i.get());
    }
}
