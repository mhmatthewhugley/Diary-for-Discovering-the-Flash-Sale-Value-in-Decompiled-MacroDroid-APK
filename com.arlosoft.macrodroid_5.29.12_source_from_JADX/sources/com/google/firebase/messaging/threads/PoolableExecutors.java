package com.google.firebase.messaging.threads;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolableExecutors {

    /* renamed from: a */
    private static final ExecutorFactory f55161a;

    /* renamed from: b */
    private static volatile ExecutorFactory f55162b;

    private static class DefaultExecutorFactory implements ExecutorFactory {
        private DefaultExecutorFactory() {
        }

        @NonNull
        /* renamed from: a */
        public ExecutorService mo63489a(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return mo63490b(1, threadFactory, threadPriority);
        }

        @NonNull
        /* renamed from: b */
        public ExecutorService mo63490b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
        f55161a = defaultExecutorFactory;
        f55162b = defaultExecutorFactory;
    }

    private PoolableExecutors() {
    }

    /* renamed from: a */
    public static ExecutorFactory m77151a() {
        return f55162b;
    }
}
