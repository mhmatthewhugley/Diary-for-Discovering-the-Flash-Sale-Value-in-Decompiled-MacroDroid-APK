package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.remoteconfig.internal.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11349d implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ ConfigFetchHandler f55291a;

    /* renamed from: b */
    public final /* synthetic */ long f55292b;

    public /* synthetic */ C11349d(ConfigFetchHandler configFetchHandler, long j) {
        this.f55291a = configFetchHandler;
        this.f55292b = j;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f55291a.m77277r(this.f55292b, task);
    }
}
