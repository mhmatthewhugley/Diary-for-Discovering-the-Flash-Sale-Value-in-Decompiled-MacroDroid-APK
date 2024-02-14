package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

class SafeLoggingExecutor implements Executor {

    /* renamed from: a */
    private final Executor f1358a;

    static class SafeLoggingRunnable implements Runnable {

        /* renamed from: a */
        private final Runnable f1359a;

        SafeLoggingRunnable(Runnable runnable) {
            this.f1359a = runnable;
        }

        public void run() {
            try {
                this.f1359a.run();
            } catch (Exception e) {
                Logging.m1383d("Executor", "Background execution failure.", e);
            }
        }
    }

    SafeLoggingExecutor(Executor executor) {
        this.f1358a = executor;
    }

    public void execute(Runnable runnable) {
        this.f1358a.execute(new SafeLoggingRunnable(runnable));
    }
}
