package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
public abstract class TimeModule {
    @Provides
    @WallTime
    /* renamed from: a */
    static Clock m1658a() {
        return new WallTimeClock();
    }

    @Provides
    @Monotonic
    /* renamed from: b */
    static Clock m1659b() {
        return new UptimeClock();
    }
}
