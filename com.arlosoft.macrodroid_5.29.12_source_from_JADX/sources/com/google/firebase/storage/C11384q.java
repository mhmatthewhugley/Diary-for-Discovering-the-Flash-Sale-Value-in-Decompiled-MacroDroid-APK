package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;

/* renamed from: com.google.firebase.storage.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11384q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaskListenerImpl f55543a;

    /* renamed from: c */
    public final /* synthetic */ Object f55544c;

    /* renamed from: d */
    public final /* synthetic */ StorageTask.ProvideError f55545d;

    public /* synthetic */ C11384q(TaskListenerImpl taskListenerImpl, Object obj, StorageTask.ProvideError provideError) {
        this.f55543a = taskListenerImpl;
        this.f55544c = obj;
        this.f55545d = provideError;
    }

    public final void run() {
        this.f55543a.m77549f(this.f55544c, this.f55545d);
    }
}
