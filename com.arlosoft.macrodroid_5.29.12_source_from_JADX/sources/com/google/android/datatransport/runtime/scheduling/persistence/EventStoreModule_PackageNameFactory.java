package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import p287ia.C12478a;

public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* renamed from: a */
    private final C12478a<Context> f1573a;

    public EventStoreModule_PackageNameFactory(C12478a<Context> aVar) {
        this.f1573a = aVar;
    }

    /* renamed from: a */
    public static EventStoreModule_PackageNameFactory m1528a(C12478a<Context> aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    /* renamed from: c */
    public static String m1529c(Context context) {
        return (String) Preconditions.m1337c(EventStoreModule.m1521b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m1529c(this.f1573a.get());
    }
}
