package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

public class BackgroundQueue implements Executor {

    /* renamed from: a */
    private Semaphore f54759a = new Semaphore(0);

    /* renamed from: c */
    private int f54760c = 0;

    /* renamed from: b */
    static /* synthetic */ void m76492b(BackgroundQueue backgroundQueue, Runnable runnable) {
        runnable.run();
        backgroundQueue.f54759a.release();
    }

    /* renamed from: a */
    public void mo63173a() throws InterruptedException {
        this.f54759a.acquire(this.f54760c);
        this.f54760c = 0;
    }

    public void execute(Runnable runnable) {
        this.f54760c++;
        Executors.f54771c.execute(BackgroundQueue$$Lambda$1.m76494a(this, runnable));
    }
}
