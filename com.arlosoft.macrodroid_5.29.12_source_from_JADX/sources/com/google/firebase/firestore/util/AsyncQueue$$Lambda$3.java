package com.google.firebase.firestore.util;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$3 implements Runnable {

    /* renamed from: a */
    private final Throwable f54746a;

    private AsyncQueue$$Lambda$3(Throwable th) {
        this.f54746a = th;
    }

    /* renamed from: a */
    public static Runnable m76485a(Throwable th) {
        return new AsyncQueue$$Lambda$3(th);
    }

    public void run() {
        AsyncQueue.m76450n(this.f54746a);
    }
}
