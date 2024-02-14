package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import p287ia.C12478a;

public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* renamed from: a */
    private final C12478a<Clock> f1475a;

    public SchedulingConfigModule_ConfigFactory(C12478a<Clock> aVar) {
        this.f1475a = aVar;
    }

    /* renamed from: a */
    public static SchedulerConfig m1399a(Clock clock) {
        return (SchedulerConfig) Preconditions.m1337c(SchedulingConfigModule.m1398a(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static SchedulingConfigModule_ConfigFactory m1400b(C12478a<Clock> aVar) {
        return new SchedulingConfigModule_ConfigFactory(aVar);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return m1399a(this.f1475a.get());
    }
}
