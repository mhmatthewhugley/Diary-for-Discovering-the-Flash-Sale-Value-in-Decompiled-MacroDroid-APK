package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_EventClockFactory implements Factory<Clock> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final TimeModule_EventClockFactory f1652a = new TimeModule_EventClockFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static TimeModule_EventClockFactory m1660a() {
        return InstanceHolder.f1652a;
    }

    /* renamed from: b */
    public static Clock m1661b() {
        return (Clock) Preconditions.m1337c(TimeModule.m1658a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Clock get() {
        return m1661b();
    }
}
