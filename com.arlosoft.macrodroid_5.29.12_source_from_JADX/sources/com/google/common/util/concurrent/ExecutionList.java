package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ExecutionList {

    /* renamed from: c */
    private static final Logger f53550c = Logger.getLogger(ExecutionList.class.getName());
    @GuardedBy

    /* renamed from: a */
    private RunnableExecutorPair f53551a;
    @GuardedBy

    /* renamed from: b */
    private boolean f53552b;

    private static final class RunnableExecutorPair {

        /* renamed from: a */
        final Runnable f53553a;

        /* renamed from: b */
        final Executor f53554b;

        /* renamed from: c */
        RunnableExecutorPair f53555c;

        RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f53553a = runnable;
            this.f53554b = executor;
            this.f53555c = runnableExecutorPair;
        }
    }

    /* renamed from: c */
    private static void m74170c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f53550c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo61748a(Runnable runnable, Executor executor) {
        Preconditions.m5393t(runnable, "Runnable was null.");
        Preconditions.m5393t(executor, "Executor was null.");
        synchronized (this) {
            if (!this.f53552b) {
                this.f53551a = new RunnableExecutorPair(runnable, executor, this.f53551a);
            } else {
                m74170c(runnable, executor);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        m74170c(r1.f53553a, r1.f53554b);
        r1 = r1.f53555c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r0.f53555c;
        r0.f53555c = r1;
        r1 = r0;
        r0 = r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61749b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f53552b     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            return
        L_0x0007:
            r0 = 1
            r3.f53552b = r0     // Catch:{ all -> 0x0026 }
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = r3.f53551a     // Catch:{ all -> 0x0026 }
            r1 = 0
            r3.f53551a = r1     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r2 = r0.f53555c
            r0.f53555c = r1
            r1 = r0
            r0 = r2
            goto L_0x0010
        L_0x0019:
            if (r1 == 0) goto L_0x0025
            java.lang.Runnable r0 = r1.f53553a
            java.util.concurrent.Executor r2 = r1.f53554b
            m74170c(r0, r2)
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r1.f53555c
            goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ExecutionList.mo61749b():void");
    }
}
