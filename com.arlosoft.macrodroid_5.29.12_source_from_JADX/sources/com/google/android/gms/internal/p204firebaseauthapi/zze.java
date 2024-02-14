package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zze */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zze implements zzc {
    private zze() {
    }

    /* synthetic */ zze(zzd zzd) {
    }

    /* renamed from: v */
    public final ExecutorService mo49367v(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
