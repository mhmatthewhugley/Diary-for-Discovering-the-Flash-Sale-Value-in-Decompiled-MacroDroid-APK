package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11350e implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ ConfigFetchHandler f55293a;

    /* renamed from: b */
    public final /* synthetic */ Task f55294b;

    /* renamed from: c */
    public final /* synthetic */ Task f55295c;

    /* renamed from: d */
    public final /* synthetic */ Date f55296d;

    public /* synthetic */ C11350e(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date) {
        this.f55293a = configFetchHandler;
        this.f55294b = task;
        this.f55295c = task2;
        this.f55296d = date;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f55293a.m77279t(this.f55294b, this.f55295c, this.f55296d, task);
    }
}
