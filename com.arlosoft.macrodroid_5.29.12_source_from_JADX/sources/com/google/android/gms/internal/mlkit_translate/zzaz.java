package com.google.android.gms.internal.mlkit_translate;

import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
enum zzaz implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
