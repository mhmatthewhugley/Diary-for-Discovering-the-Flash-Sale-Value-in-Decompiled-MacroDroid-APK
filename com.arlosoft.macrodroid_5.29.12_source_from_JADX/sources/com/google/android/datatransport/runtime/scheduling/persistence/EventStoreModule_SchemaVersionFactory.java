package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final EventStoreModule_SchemaVersionFactory f1574a = new EventStoreModule_SchemaVersionFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static EventStoreModule_SchemaVersionFactory m1531a() {
        return InstanceHolder.f1574a;
    }

    /* renamed from: c */
    public static int m1532c() {
        return EventStoreModule.m1522c();
    }

    /* renamed from: b */
    public Integer get() {
        return Integer.valueOf(m1532c());
    }
}
