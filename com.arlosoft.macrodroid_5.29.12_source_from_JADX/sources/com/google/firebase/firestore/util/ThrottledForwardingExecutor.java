package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

class ThrottledForwardingExecutor implements Executor {

    /* renamed from: a */
    private final Executor f54790a;

    /* renamed from: c */
    private final Semaphore f54791c;

    ThrottledForwardingExecutor(int i, Executor executor) {
        this.f54791c = new Semaphore(i);
        this.f54790a = executor;
    }

    /* renamed from: a */
    static /* synthetic */ void m76516a(ThrottledForwardingExecutor throttledForwardingExecutor, Runnable runnable) {
        runnable.run();
        throttledForwardingExecutor.f54791c.release();
    }

    public void execute(Runnable runnable) {
        if (this.f54791c.tryAcquire()) {
            try {
                this.f54790a.execute(ThrottledForwardingExecutor$$Lambda$1.m76517a(this, runnable));
            } catch (RejectedExecutionException unused) {
                runnable.run();
            }
        } else {
            runnable.run();
        }
    }
}
