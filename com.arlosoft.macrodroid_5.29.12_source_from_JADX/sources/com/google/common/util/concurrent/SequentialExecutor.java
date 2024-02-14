package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class SequentialExecutor implements Executor {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Logger f53640o = Logger.getLogger(SequentialExecutor.class.getName());

    /* renamed from: a */
    private final Executor f53641a;
    /* access modifiers changed from: private */
    @GuardedBy

    /* renamed from: c */
    public final Deque<Runnable> f53642c;
    /* access modifiers changed from: private */
    @GuardedBy

    /* renamed from: d */
    public WorkerRunningState f53643d;
    @GuardedBy

    /* renamed from: f */
    private long f53644f;
    @RetainedWith

    /* renamed from: g */
    private final QueueWorker f53645g;

    private final class QueueWorker implements Runnable {

        /* renamed from: a */
        Runnable f53647a;

        /* renamed from: c */
        final /* synthetic */ SequentialExecutor f53648c;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r9.f53647a.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r4 = com.google.common.util.concurrent.SequentialExecutor.m74288e();
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r9.f53647a);
            r8 = new java.lang.StringBuilder(r6.length() + 35);
            r8.append("Exception while executing runnable ");
            r8.append(r6);
            r4.log(r5, r8.toString(), r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m74289a() {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                com.google.common.util.concurrent.SequentialExecutor r2 = r9.f53648c     // Catch:{ all -> 0x008c }
                java.util.Deque r2 = r2.f53642c     // Catch:{ all -> 0x008c }
                monitor-enter(r2)     // Catch:{ all -> 0x008c }
                if (r0 != 0) goto L_0x002b
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.f53648c     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r0.f53643d     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0089 }
                if (r0 != r3) goto L_0x0020
                monitor-exit(r2)     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x001f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001f:
                return
            L_0x0020:
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.f53648c     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor.m74287d(r0)     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.f53648c     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState unused = r0.f53643d = r3     // Catch:{ all -> 0x0089 }
                r0 = 1
            L_0x002b:
                com.google.common.util.concurrent.SequentialExecutor r3 = r9.f53648c     // Catch:{ all -> 0x0089 }
                java.util.Deque r3 = r3.f53642c     // Catch:{ all -> 0x0089 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0089 }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x0089 }
                r9.f53647a = r3     // Catch:{ all -> 0x0089 }
                if (r3 != 0) goto L_0x004d
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.f53648c     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x0089 }
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState unused = r0.f53643d = r3     // Catch:{ all -> 0x0089 }
                monitor-exit(r2)     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x004c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x004c:
                return
            L_0x004d:
                monitor-exit(r2)     // Catch:{ all -> 0x0089 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x008c }
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f53647a     // Catch:{ RuntimeException -> 0x005e }
                r3.run()     // Catch:{ RuntimeException -> 0x005e }
            L_0x0059:
                r9.f53647a = r2     // Catch:{ all -> 0x008c }
                goto L_0x0002
            L_0x005c:
                r0 = move-exception
                goto L_0x0086
            L_0x005e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.f53640o     // Catch:{ all -> 0x005c }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x005c }
                java.lang.Runnable r6 = r9.f53647a     // Catch:{ all -> 0x005c }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x005c }
                int r7 = r6.length()     // Catch:{ all -> 0x005c }
                int r7 = r7 + 35
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
                r8.<init>(r7)     // Catch:{ all -> 0x005c }
                java.lang.String r7 = "Exception while executing runnable "
                r8.append(r7)     // Catch:{ all -> 0x005c }
                r8.append(r6)     // Catch:{ all -> 0x005c }
                java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x005c }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x005c }
                goto L_0x0059
            L_0x0086:
                r9.f53647a = r2     // Catch:{ all -> 0x008c }
                throw r0     // Catch:{ all -> 0x008c }
            L_0x0089:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0089 }
                throw r0     // Catch:{ all -> 0x008c }
            L_0x008c:
                r0 = move-exception
                if (r1 == 0) goto L_0x0096
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0096:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.QueueWorker.m74289a():void");
        }

        public void run() {
            try {
                m74289a();
            } catch (Error e) {
                synchronized (this.f53648c.f53642c) {
                    WorkerRunningState unused = this.f53648c.f53643d = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f53647a;
            if (runnable != null) {
                String valueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("SequentialExecutorWorker{running=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
            String valueOf2 = String.valueOf(this.f53648c.f53643d);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 32);
            sb2.append("SequentialExecutorWorker{state=");
            sb2.append(valueOf2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* renamed from: d */
    static /* synthetic */ long m74287d(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.f53644f;
        sequentialExecutor.f53644f = 1 + j;
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f53641a.execute(r8.f53645g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8.f53643d == r9) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = r8.f53642c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r8.f53644f != r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r8.f53643d != r9) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8.f53643d = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        monitor-enter(r8.f53642c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3 = r8.f53643d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r3 == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.f53649a) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r9 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(final java.lang.Runnable r9) {
        /*
            r8 = this;
            com.google.common.base.Preconditions.m5392s(r9)
            java.util.Deque<java.lang.Runnable> r0 = r8.f53642c
            monitor-enter(r0)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r8.f53643d     // Catch:{ all -> 0x0075 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0075 }
            if (r1 == r2) goto L_0x006e
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x0075 }
            if (r1 != r2) goto L_0x0011
            goto L_0x006e
        L_0x0011:
            long r3 = r8.f53644f     // Catch:{ all -> 0x0075 }
            com.google.common.util.concurrent.SequentialExecutor$1 r1 = new com.google.common.util.concurrent.SequentialExecutor$1     // Catch:{ all -> 0x0075 }
            r1.<init>(r8, r9)     // Catch:{ all -> 0x0075 }
            java.util.Deque<java.lang.Runnable> r9 = r8.f53642c     // Catch:{ all -> 0x0075 }
            r9.add(r1)     // Catch:{ all -> 0x0075 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r9 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x0075 }
            r8.f53643d = r9     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f53641a     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r7 = r8.f53645g     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r8.f53643d
            if (r1 == r9) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.util.Deque<java.lang.Runnable> r6 = r8.f53642c
            monitor-enter(r6)
            long r0 = r8.f53644f     // Catch:{ all -> 0x0045 }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r8.f53643d     // Catch:{ all -> 0x0045 }
            if (r0 != r9) goto L_0x0043
            r8.f53643d = r2     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r9
        L_0x0048:
            r9 = move-exception
            goto L_0x004b
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            java.util.Deque<java.lang.Runnable> r2 = r8.f53642c
            monitor-enter(r2)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = r8.f53643d     // Catch:{ all -> 0x006b }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x0058
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x006b }
            if (r3 != r4) goto L_0x0061
        L_0x0058:
            java.util.Deque<java.lang.Runnable> r3 = r8.f53642c     // Catch:{ all -> 0x006b }
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            return
        L_0x006a:
            throw r9     // Catch:{ all -> 0x006b }
        L_0x006b:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            java.util.Deque<java.lang.Runnable> r1 = r8.f53642c     // Catch:{ all -> 0x0075 }
            r1.add(r9)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.execute(java.lang.Runnable):void");
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.f53641a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}