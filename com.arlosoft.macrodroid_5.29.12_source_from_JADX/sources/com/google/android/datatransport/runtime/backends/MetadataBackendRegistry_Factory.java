package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import p287ia.C12478a;

public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* renamed from: a */
    private final C12478a<Context> f1405a;

    /* renamed from: b */
    private final C12478a<CreationContextFactory> f1406b;

    public MetadataBackendRegistry_Factory(C12478a<Context> aVar, C12478a<CreationContextFactory> aVar2) {
        this.f1405a = aVar;
        this.f1406b = aVar2;
    }

    /* renamed from: a */
    public static MetadataBackendRegistry_Factory m1320a(C12478a<Context> aVar, C12478a<CreationContextFactory> aVar2) {
        return new MetadataBackendRegistry_Factory(aVar, aVar2);
    }

    /* renamed from: c */
    public static MetadataBackendRegistry m1321c(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    /* renamed from: b */
    public MetadataBackendRegistry get() {
        return m1321c(this.f1405a.get(), this.f1406b.get());
    }
}
