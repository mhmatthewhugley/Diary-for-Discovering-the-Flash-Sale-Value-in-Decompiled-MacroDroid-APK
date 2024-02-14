package com.google.firebase.firestore.util;

/* compiled from: Util */
final /* synthetic */ class Util$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final RuntimeException f54797a;

    private Util$$Lambda$1(RuntimeException runtimeException) {
        this.f54797a = runtimeException;
    }

    /* renamed from: a */
    public static Runnable m76532a(RuntimeException runtimeException) {
        return new Util$$Lambda$1(runtimeException);
    }

    public void run() {
        Util.m76528k(this.f54797a);
    }
}
