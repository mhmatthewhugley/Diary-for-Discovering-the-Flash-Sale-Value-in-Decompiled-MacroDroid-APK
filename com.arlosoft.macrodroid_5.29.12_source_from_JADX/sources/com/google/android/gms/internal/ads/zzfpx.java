package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzfpx implements zzfpv {
    private zzfpx() {
    }

    /* synthetic */ zzfpx(zzfpw zzfpw) {
    }

    /* renamed from: a */
    public final ExecutorService mo46074a(ThreadFactory threadFactory, int i) {
        return mo46075b(1, threadFactory, 1);
    }

    /* renamed from: b */
    public final ExecutorService mo46075b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: v */
    public final ExecutorService mo46076v(int i) {
        return mo46075b(1, Executors.defaultThreadFactory(), 2);
    }
}
