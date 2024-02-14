package com.google.firebase.firestore.util;

import java.util.concurrent.Semaphore;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$4 implements Runnable {

    /* renamed from: a */
    private final Runnable f54747a;

    /* renamed from: c */
    private final Throwable[] f54748c;

    /* renamed from: d */
    private final Semaphore f54749d;

    public void run() {
        AsyncQueue.m76453q(this.f54747a, this.f54748c, this.f54749d);
    }
}
