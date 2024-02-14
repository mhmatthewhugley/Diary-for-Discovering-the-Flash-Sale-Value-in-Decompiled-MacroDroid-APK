package com.google.android.play.core.splitcompat;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzd {
    @Nullable

    /* renamed from: a */
    private static ThreadPoolExecutor f51766a;

    /* renamed from: a */
    public static Executor m71068a() {
        if (f51766a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzc());
            f51766a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f51766a;
    }
}
