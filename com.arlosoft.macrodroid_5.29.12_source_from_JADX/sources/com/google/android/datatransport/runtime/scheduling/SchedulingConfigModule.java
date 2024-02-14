package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
public abstract class SchedulingConfigModule {
    @Provides
    /* renamed from: a */
    static SchedulerConfig m1398a(@WallTime Clock clock) {
        return SchedulerConfig.m1429f(clock);
    }
}
