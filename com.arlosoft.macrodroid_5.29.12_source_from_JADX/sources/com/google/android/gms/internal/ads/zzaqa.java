package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaqa implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f25284a = Executors.defaultThreadFactory();

    /* renamed from: c */
    private final AtomicInteger f25285c = new AtomicInteger(1);

    zzaqa() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25284a.newThread(runnable);
        int andIncrement = this.f25285c.getAndIncrement();
        newThread.setName("gads-" + andIncrement);
        return newThread;
    }
}
