package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;

/* compiled from: Executors */
final /* synthetic */ class Executors$$Lambda$1 implements Executor {

    /* renamed from: a */
    private static final Executors$$Lambda$1 f54772a = new Executors$$Lambda$1();

    private Executors$$Lambda$1() {
    }

    /* renamed from: a */
    public static Executor m76495a() {
        return f54772a;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
