package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
public abstract class EventStoreModule {
    @Provides
    /* renamed from: a */
    static String m1520a() {
        return "com.google.android.datatransport.events";
    }

    @Provides
    /* renamed from: b */
    static String m1521b(Context context) {
        return context.getPackageName();
    }

    @Provides
    /* renamed from: c */
    static int m1522c() {
        return SchemaManager.f1591f;
    }

    @Provides
    /* renamed from: d */
    static EventStoreConfig m1523d() {
        return EventStoreConfig.f1571a;
    }
}
