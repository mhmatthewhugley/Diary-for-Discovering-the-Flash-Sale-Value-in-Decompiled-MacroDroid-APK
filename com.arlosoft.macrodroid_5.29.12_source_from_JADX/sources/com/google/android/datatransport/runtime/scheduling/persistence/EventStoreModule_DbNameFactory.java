package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_DbNameFactory implements Factory<String> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final EventStoreModule_DbNameFactory f1572a = new EventStoreModule_DbNameFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static EventStoreModule_DbNameFactory m1524a() {
        return InstanceHolder.f1572a;
    }

    /* renamed from: b */
    public static String m1525b() {
        return (String) Preconditions.m1337c(EventStoreModule.m1520a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return m1525b();
    }
}
