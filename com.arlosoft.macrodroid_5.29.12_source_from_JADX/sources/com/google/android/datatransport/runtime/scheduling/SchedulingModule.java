package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;

@Module
public abstract class SchedulingModule {
    @Provides
    /* renamed from: a */
    static WorkScheduler m1402a(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, @Monotonic Clock clock) {
        return new JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
