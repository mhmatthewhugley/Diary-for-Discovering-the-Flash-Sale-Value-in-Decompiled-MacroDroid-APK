package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.firebase.crashlytics.internal.send.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1920c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReportQueue f5474a;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f5475c;

    public /* synthetic */ C1920c(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        this.f5474a = reportQueue;
        this.f5475c = countDownLatch;
    }

    public final void run() {
        this.f5474a.m7567m(this.f5475c);
    }
}
