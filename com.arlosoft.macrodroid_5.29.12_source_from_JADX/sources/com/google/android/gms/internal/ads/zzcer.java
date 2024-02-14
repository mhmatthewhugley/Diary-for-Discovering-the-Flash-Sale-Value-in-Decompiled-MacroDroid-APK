package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcer implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f28313a = new AtomicInteger(1);

    zzcer(zzceu zzceu) {
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        int andIncrement = this.f28313a.getAndIncrement();
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + andIncrement);
    }
}
