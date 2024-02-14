package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WriteTimeoutSocket */
class TimeoutOutputStream extends OutputStream {

    /* renamed from: b1 */
    private byte[] f57627b1;
    /* access modifiers changed from: private */

    /* renamed from: os */
    public final OutputStream f57628os;
    private final ScheduledExecutorService ses;
    private final int timeout;
    private final Callable<Object> timeoutTask = new Callable<Object>() {
        public Object call() throws Exception {
            TimeoutOutputStream.this.f57628os.close();
            return null;
        }
    };

    public TimeoutOutputStream(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, int i) throws IOException {
        this.f57628os = outputStream;
        this.ses = scheduledExecutorService;
        this.timeout = i;
    }

    public void close() throws IOException {
        this.f57628os.close();
    }

    public synchronized void write(int i) throws IOException {
        if (this.f57627b1 == null) {
            this.f57627b1 = new byte[1];
        }
        byte[] bArr = this.f57627b1;
        bArr[0] = (byte) i;
        write(bArr);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|(1:16)|18|19|(2:21|22)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[SYNTHETIC, Splitter:B:21:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void write(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r9 < 0) goto L_0x0039
            int r0 = r8.length     // Catch:{ all -> 0x003f }
            if (r9 > r0) goto L_0x0039
            if (r10 < 0) goto L_0x0039
            int r0 = r9 + r10
            int r1 = r8.length     // Catch:{ all -> 0x003f }
            if (r0 > r1) goto L_0x0039
            if (r0 < 0) goto L_0x0039
            if (r10 != 0) goto L_0x0013
            monitor-exit(r7)
            return
        L_0x0013:
            r0 = 0
            r1 = 1
            int r2 = r7.timeout     // Catch:{ RejectedExecutionException -> 0x0027 }
            if (r2 <= 0) goto L_0x0027
            java.util.concurrent.ScheduledExecutorService r3 = r7.ses     // Catch:{ RejectedExecutionException -> 0x0027 }
            java.util.concurrent.Callable<java.lang.Object> r4 = r7.timeoutTask     // Catch:{ RejectedExecutionException -> 0x0027 }
            long r5 = (long) r2     // Catch:{ RejectedExecutionException -> 0x0027 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RejectedExecutionException -> 0x0027 }
            java.util.concurrent.ScheduledFuture r0 = r3.schedule(r4, r5, r2)     // Catch:{ RejectedExecutionException -> 0x0027 }
            goto L_0x0027
        L_0x0025:
            r8 = move-exception
            goto L_0x0033
        L_0x0027:
            java.io.OutputStream r2 = r7.f57628os     // Catch:{ all -> 0x0025 }
            r2.write(r8, r9, r10)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0031
            r0.cancel(r1)     // Catch:{ all -> 0x003f }
        L_0x0031:
            monitor-exit(r7)
            return
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.cancel(r1)     // Catch:{ all -> 0x003f }
        L_0x0038:
            throw r8     // Catch:{ all -> 0x003f }
        L_0x0039:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x003f }
            r8.<init>()     // Catch:{ all -> 0x003f }
            throw r8     // Catch:{ all -> 0x003f }
        L_0x003f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.TimeoutOutputStream.write(byte[], int, int):void");
    }
}
