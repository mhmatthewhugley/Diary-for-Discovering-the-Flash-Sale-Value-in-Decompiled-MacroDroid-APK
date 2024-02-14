package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbe;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class MlKitThreadPool extends zzbe {

    /* renamed from: c */
    private static final ThreadLocal f56302c = new ThreadLocal();

    /* renamed from: a */
    private final ThreadPoolExecutor f56303a;

    public MlKitThreadPool() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzj(defaultThreadFactory));
        this.f56303a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: d */
    static /* synthetic */ void m79046d(Runnable runnable) {
        f56302c.set(new ArrayDeque());
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m79047e(Deque deque, Runnable runnable) {
        Preconditions.m4488k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public final /* synthetic */ Object mo51725a() {
        return this.f56303a;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: b */
    public final ExecutorService mo51802b() {
        return this.f56303a;
    }

    public final void execute(@NonNull Runnable runnable) {
        Deque deque = (Deque) f56302c.get();
        if (deque == null || deque.size() > 1) {
            this.f56303a.execute(new zzk(runnable));
        } else {
            m79047e(deque, runnable);
        }
    }
}
