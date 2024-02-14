package com.google.firebase.firestore.util;

/* compiled from: ThrottledForwardingExecutor */
final /* synthetic */ class ThrottledForwardingExecutor$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final ThrottledForwardingExecutor f54792a;

    /* renamed from: c */
    private final Runnable f54793c;

    private ThrottledForwardingExecutor$$Lambda$1(ThrottledForwardingExecutor throttledForwardingExecutor, Runnable runnable) {
        this.f54792a = throttledForwardingExecutor;
        this.f54793c = runnable;
    }

    /* renamed from: a */
    public static Runnable m76517a(ThrottledForwardingExecutor throttledForwardingExecutor, Runnable runnable) {
        return new ThrottledForwardingExecutor$$Lambda$1(throttledForwardingExecutor, runnable);
    }

    public void run() {
        ThrottledForwardingExecutor.m76516a(this.f54792a, this.f54793c);
    }
}
