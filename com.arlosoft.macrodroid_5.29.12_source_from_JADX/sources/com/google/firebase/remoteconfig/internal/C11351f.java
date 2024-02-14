package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11351f implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ ConfigFetchHandler f55297a;

    /* renamed from: b */
    public final /* synthetic */ Date f55298b;

    public /* synthetic */ C11351f(ConfigFetchHandler configFetchHandler, Date date) {
        this.f55297a = configFetchHandler;
        this.f55298b = date;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f55297a.m77280u(this.f55298b, task);
    }
}
