package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.crashlytics.internal.common.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1874e implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f5038a;

    public /* synthetic */ C1874e(TaskCompletionSource taskCompletionSource) {
        this.f5038a = taskCompletionSource;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return Utils.m6809i(this.f5038a, task);
    }
}
