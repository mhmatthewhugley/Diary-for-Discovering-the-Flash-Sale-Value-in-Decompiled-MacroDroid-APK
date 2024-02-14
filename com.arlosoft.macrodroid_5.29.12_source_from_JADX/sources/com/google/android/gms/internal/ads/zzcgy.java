package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcgy implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f28451a = new AtomicInteger(1);

    /* renamed from: c */
    final /* synthetic */ String f28452c;

    zzcgy(String str) {
        this.f28452c = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f28452c;
        int andIncrement = this.f28451a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
