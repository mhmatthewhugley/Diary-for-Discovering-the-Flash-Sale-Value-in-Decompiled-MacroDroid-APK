package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfgt implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f35769a = new AtomicInteger(1);

    zzfgt() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f35769a.getAndIncrement();
        return new Thread(runnable, "AdWorker(NG) #" + andIncrement);
    }
}
