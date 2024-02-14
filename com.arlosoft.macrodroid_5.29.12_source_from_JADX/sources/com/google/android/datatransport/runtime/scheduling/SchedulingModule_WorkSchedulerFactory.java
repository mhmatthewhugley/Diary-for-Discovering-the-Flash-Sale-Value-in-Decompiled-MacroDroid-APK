package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import p287ia.C12478a;

public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* renamed from: a */
    private final C12478a<Context> f1476a;

    /* renamed from: b */
    private final C12478a<EventStore> f1477b;

    /* renamed from: c */
    private final C12478a<SchedulerConfig> f1478c;

    /* renamed from: d */
    private final C12478a<Clock> f1479d;

    public SchedulingModule_WorkSchedulerFactory(C12478a<Context> aVar, C12478a<EventStore> aVar2, C12478a<SchedulerConfig> aVar3, C12478a<Clock> aVar4) {
        this.f1476a = aVar;
        this.f1477b = aVar2;
        this.f1478c = aVar3;
        this.f1479d = aVar4;
    }

    /* renamed from: a */
    public static SchedulingModule_WorkSchedulerFactory m1403a(C12478a<Context> aVar, C12478a<EventStore> aVar2, C12478a<SchedulerConfig> aVar3, C12478a<Clock> aVar4) {
        return new SchedulingModule_WorkSchedulerFactory(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static WorkScheduler m1404c(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.m1337c(SchedulingModule.m1402a(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public WorkScheduler get() {
        return m1404c(this.f1476a.get(), this.f1477b.get(), this.f1478c.get(), this.f1479d.get());
    }
}
