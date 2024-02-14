package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

@GwtCompatible
@ReflectionSupport
@ElementTypesAreNonnullByDefault
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a */
    private static final Runnable f53596a = new DoNothingRunnable();

    /* renamed from: c */
    private static final Runnable f53597c = new DoNothingRunnable();

    @VisibleForTesting
    static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m74238b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public void run() {
        }

        public String toString() {
            return this.task.toString();
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }
    }

    private static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        public void run() {
        }
    }

    static {
        Class<LockSupport> cls = LockSupport.class;
    }

    InterruptibleTask() {
    }

    /* renamed from: g */
    private void m74230g(Thread thread) {
        Runnable runnable = (Runnable) get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            if (!z2 && runnable != f53597c) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f53597c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(blocker);
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
    public abstract void mo61716a(Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo61717b(@ParametricNullness T t);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61834c() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.m74238b(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f53596a)) == f53597c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo61718d();

    /* access modifiers changed from: package-private */
    @ParametricNullness
    /* renamed from: e */
    public abstract T mo61711e() throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract String mo61712f();

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo61718d();
            if (z) {
                try {
                    obj = mo61711e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f53596a)) {
                        m74230g(currentThread);
                    }
                    if (z) {
                        mo61716a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, f53596a)) {
                m74230g(currentThread);
            }
            if (z) {
                mo61717b(NullnessCasts.m74277a(obj));
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f53596a) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String f = mo61712f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(f).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(f);
        return sb2.toString();
    }
}
