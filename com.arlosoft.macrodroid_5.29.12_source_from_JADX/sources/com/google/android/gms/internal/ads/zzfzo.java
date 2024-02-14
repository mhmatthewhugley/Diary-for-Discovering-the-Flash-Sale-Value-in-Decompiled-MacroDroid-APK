package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfzo extends AtomicReference implements Runnable {

    /* renamed from: a */
    private static final Runnable f36608a = new zzfzn((zzfzl) null);

    /* renamed from: c */
    private static final Runnable f36609c = new zzfzn((zzfzl) null);

    zzfzo() {
    }

    /* renamed from: c */
    private final void m51426c(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfzm zzfzm = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfzm)) {
                if (runnable != f36609c) {
                    break;
                }
            } else {
                zzfzm = (zzfzm) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f36609c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfzm);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo46604a() throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo46605b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo46607d(Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo46608e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo46609f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo46633g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfzm zzfzm = new zzfzm(this, (zzfzl) null);
            zzfzo.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfzm)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f36608a)) == f36609c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f36608a)) == f36609c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo46609f();
            if (z) {
                try {
                    obj = mo46604a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f36608a)) {
                        m51426c(currentThread);
                    }
                    mo46608e((Object) null);
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, f36608a)) {
                m51426c(currentThread);
            }
            if (z) {
                mo46608e(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f36608a) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfzm) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo46605b();
    }
}
