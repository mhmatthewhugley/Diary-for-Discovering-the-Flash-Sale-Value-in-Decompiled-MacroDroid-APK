package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzcgd implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f28415a = new AtomicInteger(1);

    /* renamed from: c */
    final /* synthetic */ String f28416c;

    zzcgd(String str) {
        this.f28416c = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f28416c;
        int andIncrement = this.f28415a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
