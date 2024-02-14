package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzfn extends Thread {

    /* renamed from: a */
    private final Object f46794a;

    /* renamed from: c */
    private final BlockingQueue f46795c;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: d */
    private boolean f46796d = false;

    /* renamed from: f */
    final /* synthetic */ zzfo f46797f;

    public zzfn(zzfo zzfo, String str, BlockingQueue blockingQueue) {
        this.f46797f = zzfo;
        Preconditions.m4488k(str);
        Preconditions.m4488k(blockingQueue);
        this.f46794a = new Object();
        this.f46795c = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m65655b() {
        synchronized (this.f46797f.f46805i) {
            if (!this.f46796d) {
                this.f46797f.f46806j.release();
                this.f46797f.f46805i.notifyAll();
                zzfo zzfo = this.f46797f;
                if (this == zzfo.f46799c) {
                    zzfo.f46799c = null;
                } else if (this == zzfo.f46800d) {
                    zzfo.f46800d = null;
                } else {
                    zzfo.f46899a.mo55221z().mo55098p().mo55091a("Current scheduler thread is neither worker nor network");
                }
                this.f46796d = true;
            }
        }
    }

    /* renamed from: c */
    private final void m65656c(InterruptedException interruptedException) {
        this.f46797f.f46899a.mo55221z().mo55103u().mo55092b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo55173a() {
        synchronized (this.f46794a) {
            this.f46794a.notifyAll();
        }
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f46797f.f46806j.acquire();
                z = true;
            } catch (InterruptedException e) {
                m65656c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfm zzfm = (zzfm) this.f46795c.poll();
                if (zzfm != null) {
                    Process.setThreadPriority(true != zzfm.f46791c ? 10 : threadPriority);
                    zzfm.run();
                } else {
                    synchronized (this.f46794a) {
                        if (this.f46795c.peek() == null) {
                            boolean unused = this.f46797f.f46807k;
                            try {
                                this.f46794a.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e2) {
                                m65656c(e2);
                            }
                        }
                    }
                    synchronized (this.f46797f.f46805i) {
                        if (this.f46795c.peek() == null) {
                            m65655b();
                            m65655b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m65655b();
            throw th;
        }
    }
}
