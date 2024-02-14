package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;

/* renamed from: com.google.firebase.storage.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11383p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaskListenerImpl f55540a;

    /* renamed from: c */
    public final /* synthetic */ Object f55541c;

    /* renamed from: d */
    public final /* synthetic */ StorageTask.ProvideError f55542d;

    public /* synthetic */ C11383p(TaskListenerImpl taskListenerImpl, Object obj, StorageTask.ProvideError provideError) {
        this.f55540a = taskListenerImpl;
        this.f55541c = obj;
        this.f55542d = provideError;
    }

    public final void run() {
        this.f55540a.m77550g(this.f55541c, this.f55542d);
    }
}
