package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final EventStoreModule_StoreConfigFactory f1575a = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static EventStoreModule_StoreConfigFactory m1535a() {
        return InstanceHolder.f1575a;
    }

    /* renamed from: c */
    public static EventStoreConfig m1536c() {
        return (EventStoreConfig) Preconditions.m1337c(EventStoreModule.m1523d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public EventStoreConfig get() {
        return m1536c();
    }
}
