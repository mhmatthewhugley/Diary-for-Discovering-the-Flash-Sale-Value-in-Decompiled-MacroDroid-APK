package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class MLTaskExecutor {

    /* renamed from: b */
    private static final Object f56296b = new Object();
    @GuardedBy("lock")
    @Nullable

    /* renamed from: c */
    private static MLTaskExecutor f56297c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Handler f56298a;

    private MLTaskExecutor(Looper looper) {
        this.f56298a = new zza(looper);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static MLTaskExecutor m79033b() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (f56296b) {
            if (f56297c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f56297c = new MLTaskExecutor(handlerThread.getLooper());
            }
            mLTaskExecutor = f56297c;
        }
        return mLTaskExecutor;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public static Executor m79034f() {
        return zzh.INSTANCE;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public Handler mo64549a() {
        return this.f56298a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public <ResultT> Task<ResultT> mo64550c(@NonNull Callable<ResultT> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        mo64551d(new zzf(callable, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo64551d(@NonNull Runnable runnable) {
        m79034f().execute(runnable);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo64552e(@NonNull Runnable runnable, long j) {
        this.f56298a.postDelayed(runnable, j);
    }
}
