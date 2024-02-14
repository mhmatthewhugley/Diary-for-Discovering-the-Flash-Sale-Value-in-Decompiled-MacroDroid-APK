package com.google.firebase.firestore.util;

/* compiled from: ExponentialBackoff */
final /* synthetic */ class ExponentialBackoff$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final ExponentialBackoff f54782a;

    /* renamed from: c */
    private final Runnable f54783c;

    private ExponentialBackoff$$Lambda$1(ExponentialBackoff exponentialBackoff, Runnable runnable) {
        this.f54782a = exponentialBackoff;
        this.f54783c = runnable;
    }

    /* renamed from: a */
    public static Runnable m76503a(ExponentialBackoff exponentialBackoff, Runnable runnable) {
        return new ExponentialBackoff$$Lambda$1(exponentialBackoff, runnable);
    }

    public void run() {
        ExponentialBackoff.m76497d(this.f54782a, this.f54783c);
    }
}
