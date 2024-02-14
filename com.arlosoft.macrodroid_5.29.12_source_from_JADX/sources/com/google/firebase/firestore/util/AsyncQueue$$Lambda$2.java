package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$2 implements Callable {

    /* renamed from: a */
    private final Runnable f54745a;

    private AsyncQueue$$Lambda$2(Runnable runnable) {
        this.f54745a = runnable;
    }

    /* renamed from: a */
    public static Callable m76484a(Runnable runnable) {
        return new AsyncQueue$$Lambda$2(runnable);
    }

    public Object call() {
        return this.f54745a.run();
    }
}
