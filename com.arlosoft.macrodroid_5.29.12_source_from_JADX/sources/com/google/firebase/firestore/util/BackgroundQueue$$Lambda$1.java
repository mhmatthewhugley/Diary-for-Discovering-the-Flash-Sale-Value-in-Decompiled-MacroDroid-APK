package com.google.firebase.firestore.util;

/* compiled from: BackgroundQueue */
final /* synthetic */ class BackgroundQueue$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final BackgroundQueue f54761a;

    /* renamed from: c */
    private final Runnable f54762c;

    private BackgroundQueue$$Lambda$1(BackgroundQueue backgroundQueue, Runnable runnable) {
        this.f54761a = backgroundQueue;
        this.f54762c = runnable;
    }

    /* renamed from: a */
    public static Runnable m76494a(BackgroundQueue backgroundQueue, Runnable runnable) {
        return new BackgroundQueue$$Lambda$1(backgroundQueue, runnable);
    }

    public void run() {
        BackgroundQueue.m76492b(this.f54761a, this.f54762c);
    }
}
