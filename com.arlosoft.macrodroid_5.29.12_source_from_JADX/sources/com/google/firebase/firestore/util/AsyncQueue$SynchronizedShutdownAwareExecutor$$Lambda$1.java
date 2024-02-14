package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.lang.Thread;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final AsyncQueue.SynchronizedShutdownAwareExecutor f54755a;

    private AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$1(AsyncQueue.SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor) {
        this.f54755a = synchronizedShutdownAwareExecutor;
    }

    /* renamed from: a */
    public static Thread.UncaughtExceptionHandler m76490a(AsyncQueue.SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor) {
        return new AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$1(synchronizedShutdownAwareExecutor);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        AsyncQueue.this.mo63155r(th);
    }
}
