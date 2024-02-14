package p292io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11968a;
import p262fa.C12251a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.c */
/* compiled from: InstantPeriodicTask */
final class C13184c implements Callable<Void>, C17071b {

    /* renamed from: o */
    static final FutureTask<Void> f61041o = new FutureTask<>(C11968a.f58165b, (Object) null);

    /* renamed from: a */
    final Runnable f61042a;

    /* renamed from: c */
    final AtomicReference<Future<?>> f61043c = new AtomicReference<>();

    /* renamed from: d */
    final AtomicReference<Future<?>> f61044d = new AtomicReference<>();

    /* renamed from: f */
    final ExecutorService f61045f;

    /* renamed from: g */
    Thread f61046g;

    C13184c(Runnable runnable, ExecutorService executorService) {
        this.f61042a = runnable;
        this.f61045f = executorService;
    }

    /* renamed from: a */
    public Void call() throws Exception {
        this.f61046g = Thread.currentThread();
        try {
            this.f61042a.run();
            mo70002c(this.f61045f.submit(this));
            this.f61046g = null;
        } catch (Throwable th) {
            this.f61046g = null;
            C12251a.m82985p(th);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70001b(Future<?> future) {
        Future future2;
        do {
            future2 = this.f61044d.get();
            if (future2 == f61041o) {
                future.cancel(this.f61046g != Thread.currentThread());
                return;
            }
        } while (!this.f61044d.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo70002c(Future<?> future) {
        Future future2;
        do {
            future2 = this.f61043c.get();
            if (future2 == f61041o) {
                future.cancel(this.f61046g != Thread.currentThread());
                return;
            }
        } while (!this.f61043c.compareAndSet(future2, future));
    }

    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f61044d;
        Future future = f61041o;
        Future andSet = atomicReference.getAndSet(future);
        boolean z = true;
        if (!(andSet == null || andSet == future)) {
            andSet.cancel(this.f61046g != Thread.currentThread());
        }
        Future andSet2 = this.f61043c.getAndSet(future);
        if (andSet2 != null && andSet2 != future) {
            if (this.f61046g == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.f61044d.get() == f61041o;
    }
}
