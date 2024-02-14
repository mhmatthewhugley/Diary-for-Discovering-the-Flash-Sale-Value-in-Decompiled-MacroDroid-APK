package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StorageTaskScheduler {

    /* renamed from: a */
    public static StorageTaskScheduler f55394a = new StorageTaskScheduler();

    /* renamed from: b */
    private static BlockingQueue<Runnable> f55395b = new LinkedBlockingQueue();

    /* renamed from: c */
    private static final ThreadPoolExecutor f55396c;

    /* renamed from: d */
    private static BlockingQueue<Runnable> f55397d = new LinkedBlockingQueue();

    /* renamed from: e */
    private static final ThreadPoolExecutor f55398e;

    /* renamed from: f */
    private static BlockingQueue<Runnable> f55399f = new LinkedBlockingQueue();

    /* renamed from: g */
    private static final ThreadPoolExecutor f55400g;

    /* renamed from: h */
    private static BlockingQueue<Runnable> f55401h = new LinkedBlockingQueue();

    /* renamed from: i */
    private static final ThreadPoolExecutor f55402i;

    static class StorageThreadFactory implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f55403a = new AtomicInteger(1);

        /* renamed from: c */
        private final String f55404c;

        StorageThreadFactory(@NonNull String str) {
            this.f55404c = str;
        }

        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "FirebaseStorage-" + this.f55404c + this.f55403a.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, timeUnit, f55395b, new StorageThreadFactory("Command-"));
        f55396c = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5, timeUnit, f55397d, new StorageThreadFactory("Upload-"));
        f55398e = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5, timeUnit, f55399f, new StorageThreadFactory("Download-"));
        f55400g = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5, timeUnit, f55401h, new StorageThreadFactory("Callbacks-"));
        f55402i = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
    }

    /* renamed from: b */
    public static StorageTaskScheduler m77520b() {
        return f55394a;
    }

    /* renamed from: a */
    public Executor mo63674a() {
        return f55396c;
    }

    /* renamed from: c */
    public void mo63675c(Runnable runnable) {
        f55402i.execute(runnable);
    }

    /* renamed from: d */
    public void mo63676d(Runnable runnable) {
        f55396c.execute(runnable);
    }

    /* renamed from: e */
    public void mo63677e(Runnable runnable) {
        f55400g.execute(runnable);
    }

    /* renamed from: f */
    public void mo63678f(Runnable runnable) {
        f55398e.execute(runnable);
    }
}
