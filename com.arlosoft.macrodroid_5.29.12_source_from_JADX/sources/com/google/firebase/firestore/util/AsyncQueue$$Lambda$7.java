package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$7 implements Continuation {

    /* renamed from: a */
    private final TaskCompletionSource f54753a;

    private AsyncQueue$$Lambda$7(TaskCompletionSource taskCompletionSource) {
        this.f54753a = taskCompletionSource;
    }

    /* renamed from: b */
    public static Continuation m76487b(TaskCompletionSource taskCompletionSource) {
        return new AsyncQueue$$Lambda$7(taskCompletionSource);
    }

    /* renamed from: a */
    public Object mo21119a(Task task) {
        return AsyncQueue.m76447k(this.f54753a, task);
    }
}
