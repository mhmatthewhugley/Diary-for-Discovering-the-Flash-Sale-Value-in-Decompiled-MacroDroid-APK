package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.remoteconfig.internal.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11346a implements SuccessContinuation {

    /* renamed from: a */
    public final /* synthetic */ ConfigCacheClient f55285a;

    /* renamed from: b */
    public final /* synthetic */ boolean f55286b;

    /* renamed from: c */
    public final /* synthetic */ ConfigContainer f55287c;

    public /* synthetic */ C11346a(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer) {
        this.f55285a = configCacheClient;
        this.f55286b = z;
        this.f55287c = configContainer;
    }

    /* renamed from: a */
    public final Task mo21121a(Object obj) {
        return this.f55285a.m77237j(this.f55286b, this.f55287c, (Void) obj);
    }
}
