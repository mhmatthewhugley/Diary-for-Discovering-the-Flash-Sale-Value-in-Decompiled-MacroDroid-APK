package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11347b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ConfigCacheClient f55288a;

    /* renamed from: c */
    public final /* synthetic */ ConfigContainer f55289c;

    public /* synthetic */ C11347b(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        this.f55288a = configCacheClient;
        this.f55289c = configContainer;
    }

    public final Object call() {
        return this.f55288a.m77236i(this.f55289c);
    }
}
