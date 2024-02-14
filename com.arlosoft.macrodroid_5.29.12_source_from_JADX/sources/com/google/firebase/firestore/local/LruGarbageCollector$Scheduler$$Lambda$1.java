package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;

/* compiled from: LruGarbageCollector */
final /* synthetic */ class LruGarbageCollector$Scheduler$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final LruGarbageCollector.Scheduler f54259a;

    private LruGarbageCollector$Scheduler$$Lambda$1(LruGarbageCollector.Scheduler scheduler) {
        this.f54259a = scheduler;
    }

    /* renamed from: a */
    public static Runnable m75423a(LruGarbageCollector.Scheduler scheduler) {
        return new LruGarbageCollector$Scheduler$$Lambda$1(scheduler);
    }

    public void run() {
        LruGarbageCollector.Scheduler.m75418a(this.f54259a);
    }
}
