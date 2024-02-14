package com.google.firebase.firestore.remote;

/* compiled from: OnlineStateTracker */
final /* synthetic */ class OnlineStateTracker$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final OnlineStateTracker f54634a;

    private OnlineStateTracker$$Lambda$1(OnlineStateTracker onlineStateTracker) {
        this.f54634a = onlineStateTracker;
    }

    /* renamed from: a */
    public static Runnable m76251a(OnlineStateTracker onlineStateTracker) {
        return new OnlineStateTracker$$Lambda$1(onlineStateTracker);
    }

    public void run() {
        OnlineStateTracker.m76244d(this.f54634a);
    }
}
