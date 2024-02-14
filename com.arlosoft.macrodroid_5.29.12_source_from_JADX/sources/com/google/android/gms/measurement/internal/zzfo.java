package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzfo extends zzgl {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f46798l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public zzfn f46799c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public zzfn f46800d;

    /* renamed from: e */
    private final PriorityBlockingQueue f46801e = new PriorityBlockingQueue();

    /* renamed from: f */
    private final BlockingQueue f46802f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f46803g = new zzfl(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f46804h = new zzfl(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f46805i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f46806j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f46807k;

    zzfo(zzfr zzfr) {
        super(zzfr);
    }

    /* renamed from: D */
    private final void m65659D(zzfm zzfm) {
        synchronized (this.f46805i) {
            this.f46801e.add(zzfm);
            zzfn zzfn = this.f46799c;
            if (zzfn == null) {
                zzfn zzfn2 = new zzfn(this, "Measurement Worker", this.f46801e);
                this.f46799c = zzfn2;
                zzfn2.setUncaughtExceptionHandler(this.f46803g);
                this.f46799c.start();
            } else {
                zzfn.mo55173a();
            }
        }
    }

    /* renamed from: C */
    public final boolean mo55175C() {
        return Thread.currentThread() == this.f46799c;
    }

    /* renamed from: d */
    public final void mo55176d() {
        if (Thread.currentThread() != this.f46800d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: e */
    public final void mo55073e() {
        if (Thread.currentThread() != this.f46799c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo55000g() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f46899a.mo55221z().mo55103u();
        r3.mo55091a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f46899a.mo55221z().mo55103u().mo55091a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    @androidx.annotation.Nullable
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55177p(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzfo r0 = r0.mo55185B()     // Catch:{ all -> 0x0049 }
            r0.mo55181x(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.zzfr r3 = r1.f46899a
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo55091a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.zzfr r3 = r1.f46899a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo55091a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.mo55177p(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: q */
    public final Future mo55178q(Callable callable) throws IllegalStateException {
        mo55243i();
        Preconditions.m4488k(callable);
        zzfm zzfm = new zzfm(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46799c) {
            if (!this.f46801e.isEmpty()) {
                this.f46899a.mo55221z().mo55103u().mo55091a("Callable skipped the worker queue.");
            }
            zzfm.run();
        } else {
            m65659D(zzfm);
        }
        return zzfm;
    }

    /* renamed from: r */
    public final Future mo55179r(Callable callable) throws IllegalStateException {
        mo55243i();
        Preconditions.m4488k(callable);
        zzfm zzfm = new zzfm(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46799c) {
            zzfm.run();
        } else {
            m65659D(zzfm);
        }
        return zzfm;
    }

    /* renamed from: w */
    public final void mo55180w(Runnable runnable) throws IllegalStateException {
        mo55243i();
        Preconditions.m4488k(runnable);
        zzfm zzfm = new zzfm(this, runnable, false, "Task exception on network thread");
        synchronized (this.f46805i) {
            this.f46802f.add(zzfm);
            zzfn zzfn = this.f46800d;
            if (zzfn == null) {
                zzfn zzfn2 = new zzfn(this, "Measurement Network", this.f46802f);
                this.f46800d = zzfn2;
                zzfn2.setUncaughtExceptionHandler(this.f46804h);
                this.f46800d.start();
            } else {
                zzfn.mo55173a();
            }
        }
    }

    /* renamed from: x */
    public final void mo55181x(Runnable runnable) throws IllegalStateException {
        mo55243i();
        Preconditions.m4488k(runnable);
        m65659D(new zzfm(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: y */
    public final void mo55182y(Runnable runnable) throws IllegalStateException {
        mo55243i();
        Preconditions.m4488k(runnable);
        m65659D(new zzfm(this, runnable, true, "Task exception on worker thread"));
    }
}
