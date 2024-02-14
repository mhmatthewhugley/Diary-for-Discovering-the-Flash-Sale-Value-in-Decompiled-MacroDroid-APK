package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.remoteconfig.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11335b implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ FirebaseRemoteConfig f55216a;

    /* renamed from: b */
    public final /* synthetic */ Task f55217b;

    /* renamed from: c */
    public final /* synthetic */ Task f55218c;

    public /* synthetic */ C11335b(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2) {
        this.f55216a = firebaseRemoteConfig;
        this.f55217b = task;
        this.f55218c = task2;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f55216a.m77187p(this.f55217b, this.f55218c, task);
    }
}
