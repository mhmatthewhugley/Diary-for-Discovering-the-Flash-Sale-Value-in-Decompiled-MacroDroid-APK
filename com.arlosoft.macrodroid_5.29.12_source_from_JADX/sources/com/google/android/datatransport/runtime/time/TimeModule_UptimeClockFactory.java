package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final TimeModule_UptimeClockFactory f1653a = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static TimeModule_UptimeClockFactory m1664a() {
        return InstanceHolder.f1653a;
    }

    /* renamed from: c */
    public static Clock m1665c() {
        return (Clock) Preconditions.m1337c(TimeModule.m1659b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Clock get() {
        return m1665c();
    }
}
