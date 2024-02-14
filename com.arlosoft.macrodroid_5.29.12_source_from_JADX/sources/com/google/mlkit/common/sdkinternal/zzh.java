package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.5.0 */
enum zzh implements Executor {
    INSTANCE;

    public final void execute(@NonNull Runnable runnable) {
        MLTaskExecutor.m79033b().f56298a.post(runnable);
    }
}
