package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.concurrent.Callable;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$2 implements Runnable {

    /* renamed from: a */
    private final TaskCompletionSource f54756a;

    /* renamed from: c */
    private final Callable f54757c;

    private AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$2(TaskCompletionSource taskCompletionSource, Callable callable) {
        this.f54756a = taskCompletionSource;
        this.f54757c = callable;
    }

    /* renamed from: a */
    public static Runnable m76491a(TaskCompletionSource taskCompletionSource, Callable callable) {
        return new AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$2(taskCompletionSource, callable);
    }

    public void run() {
        AsyncQueue.SynchronizedShutdownAwareExecutor.m76481i(this.f54756a, this.f54757c);
    }
}
