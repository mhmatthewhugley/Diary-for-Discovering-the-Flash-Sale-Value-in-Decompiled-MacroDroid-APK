package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzo implements zzp {

    /* renamed from: a */
    private final CountDownLatch f51982a = new CountDownLatch(1);

    private zzo() {
    }

    /* renamed from: a */
    public final void mo60041a() throws InterruptedException {
        this.f51982a.await();
    }

    /* renamed from: b */
    public final void mo32242b(Object obj) {
        this.f51982a.countDown();
    }

    /* renamed from: c */
    public final void mo32241c(Exception exc) {
        this.f51982a.countDown();
    }

    /* synthetic */ zzo(zzn zzn) {
    }
}
