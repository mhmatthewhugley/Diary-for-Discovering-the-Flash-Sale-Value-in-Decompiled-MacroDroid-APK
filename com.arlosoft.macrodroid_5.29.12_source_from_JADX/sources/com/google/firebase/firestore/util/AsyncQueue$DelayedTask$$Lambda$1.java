package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$DelayedTask$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final AsyncQueue.DelayedTask f54754a;

    private AsyncQueue$DelayedTask$$Lambda$1(AsyncQueue.DelayedTask delayedTask) {
        this.f54754a = delayedTask;
    }

    /* renamed from: a */
    public static Runnable m76489a(AsyncQueue.DelayedTask delayedTask) {
        return new AsyncQueue$DelayedTask$$Lambda$1(delayedTask);
    }

    public void run() {
        this.f54754a.m76468f();
    }
}
