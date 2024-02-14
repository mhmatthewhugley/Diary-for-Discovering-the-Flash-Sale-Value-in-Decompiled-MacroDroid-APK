package p292io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11968a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.a */
/* compiled from: AbstractDirectTask */
abstract class C13179a extends AtomicReference<Future<?>> implements C17071b {

    /* renamed from: a */
    protected static final FutureTask<Void> f61025a;

    /* renamed from: c */
    protected static final FutureTask<Void> f61026c;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        Runnable runnable2 = C11968a.f58165b;
        f61025a = new FutureTask<>(runnable2, (Object) null);
        f61026c = new FutureTask<>(runnable2, (Object) null);
    }

    C13179a(Runnable runnable2) {
        this.runnable = runnable2;
    }

    /* renamed from: a */
    public final void mo69991a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f61025a) {
                if (future2 == f61026c) {
                    future.cancel(this.runner != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f61025a && future != (futureTask = f61026c) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.runner != Thread.currentThread());
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f61025a || future == f61026c;
    }
}
