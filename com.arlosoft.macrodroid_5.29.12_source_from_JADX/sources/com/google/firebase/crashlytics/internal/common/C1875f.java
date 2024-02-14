package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.crashlytics.internal.common.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1875f implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f5039a;

    public /* synthetic */ C1875f(TaskCompletionSource taskCompletionSource) {
        this.f5039a = taskCompletionSource;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return Utils.m6808h(this.f5039a, task);
    }
}
