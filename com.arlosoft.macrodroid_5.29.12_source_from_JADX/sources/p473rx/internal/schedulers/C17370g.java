package p473rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17163i;
import p464jf.C17176a;
import p468nf.C17195c;
import p470pf.C17223b;
import p473rx.exceptions.OnErrorNotImplementedException;
import p473rx.internal.util.C17391g;

/* renamed from: rx.internal.schedulers.g */
/* compiled from: ScheduledAction */
public final class C17370g extends AtomicReference<Thread> implements Runnable, C17163i {
    private static final long serialVersionUID = -3962399486978279857L;
    final C17176a action;
    final C17391g cancel;

    /* renamed from: rx.internal.schedulers.g$a */
    /* compiled from: ScheduledAction */
    final class C17371a implements C17163i {

        /* renamed from: a */
        private final Future<?> f69118a;

        C17371a(Future<?> future) {
            this.f69118a = future;
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f69118a.isCancelled();
        }

        /* renamed from: d */
        public void mo80450d() {
            if (C17370g.this.get() != Thread.currentThread()) {
                this.f69118a.cancel(true);
            } else {
                this.f69118a.cancel(false);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.g$b */
    /* compiled from: ScheduledAction */
    static final class C17372b extends AtomicBoolean implements C17163i {
        private static final long serialVersionUID = 247232374289553518L;
        final C17391g parent;

        /* renamed from: s */
        final C17370g f69120s;

        public C17372b(C17370g gVar, C17391g gVar2) {
            this.f69120s = gVar;
            this.parent = gVar2;
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f69120s.mo80449b();
        }

        /* renamed from: d */
        public void mo80450d() {
            if (compareAndSet(false, true)) {
                this.parent.mo80710c(this.f69120s);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.g$c */
    /* compiled from: ScheduledAction */
    static final class C17373c extends AtomicBoolean implements C17163i {
        private static final long serialVersionUID = 247232374289553518L;
        final C17223b parent;

        /* renamed from: s */
        final C17370g f69121s;

        public C17373c(C17370g gVar, C17223b bVar) {
            this.f69121s = gVar;
            this.parent = bVar;
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f69121s.mo80449b();
        }

        /* renamed from: d */
        public void mo80450d() {
            if (compareAndSet(false, true)) {
                this.parent.mo80522c(this.f69121s);
            }
        }
    }

    public C17370g(C17176a aVar) {
        this.action = aVar;
        this.cancel = new C17391g();
    }

    /* renamed from: a */
    public void mo80690a(C17163i iVar) {
        this.cancel.mo80709a(iVar);
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return this.cancel.mo80449b();
    }

    /* renamed from: c */
    public void mo80691c(Future<?> future) {
        this.cancel.mo80709a(new C17371a(future));
    }

    /* renamed from: d */
    public void mo80450d() {
        if (!this.cancel.mo80449b()) {
            this.cancel.mo80450d();
        }
    }

    /* renamed from: e */
    public void mo80692e(C17223b bVar) {
        this.cancel.mo80709a(new C17373c(this, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo80693f(Throwable th) {
        C17195c.m100723g(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.action.call();
        } catch (OnErrorNotImplementedException e) {
            mo80693f(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            mo80450d();
            throw th;
        }
        mo80450d();
    }

    public C17370g(C17176a aVar, C17223b bVar) {
        this.action = aVar;
        this.cancel = new C17391g((C17163i) new C17373c(this, bVar));
    }

    public C17370g(C17176a aVar, C17391g gVar) {
        this.action = aVar;
        this.cancel = new C17391g((C17163i) new C17372b(this, gVar));
    }
}
