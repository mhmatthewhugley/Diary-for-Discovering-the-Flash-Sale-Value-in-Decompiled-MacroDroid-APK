package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractScheduledService implements Service {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f53389b = Logger.getLogger(AbstractScheduledService.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AbstractService f53390a = new ServiceDelegate(this, (C109601) null);

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1 */
    class C109601 extends Service.Listener {

        /* renamed from: a */
        final /* synthetic */ ScheduledExecutorService f53391a;

        /* renamed from: a */
        public void mo61608a(Service.State state, Throwable th) {
            this.f53391a.shutdown();
        }

        /* renamed from: e */
        public void mo61609e(Service.State state) {
            this.f53391a.shutdown();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl  reason: invalid class name */
    class AnonymousClass1ThreadFactoryImpl implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AbstractScheduledService f53392a;

        public Thread newThread(Runnable runnable) {
            return MoreExecutors.m74261c(this.f53392a.mo61604f(), runnable);
        }
    }

    interface Cancellable {
        void cancel(boolean z);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends Scheduler {

        private final class ReschedulableCallable implements Callable<Void> {

            /* renamed from: a */
            private final Runnable f53393a;

            /* renamed from: c */
            private final ScheduledExecutorService f53394c;

            /* renamed from: d */
            private final AbstractService f53395d;

            /* renamed from: f */
            private final ReentrantLock f53396f = new ReentrantLock();
            @GuardedBy

            /* renamed from: g */
            private SupplantableFuture f53397g;

            ReschedulableCallable(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f53393a = runnable;
                this.f53394c = scheduledExecutorService;
                this.f53395d = abstractService;
            }

            @GuardedBy
            /* renamed from: b */
            private Cancellable m73985b(Schedule schedule) {
                SupplantableFuture supplantableFuture = this.f53397g;
                if (supplantableFuture == null) {
                    SupplantableFuture supplantableFuture2 = new SupplantableFuture(this.f53396f, m73986d(schedule));
                    this.f53397g = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.f53402b.isCancelled()) {
                    Future unused = this.f53397g.f53402b = m73986d(schedule);
                }
                return this.f53397g;
            }

            /* renamed from: d */
            private ScheduledFuture<Void> m73986d(Schedule schedule) {
                return this.f53394c.schedule(this, schedule.f53399a, schedule.f53400b);
            }

            /* renamed from: a */
            public Void call() throws Exception {
                this.f53393a.run();
                mo61616c();
                return null;
            }

            @CanIgnoreReturnValue
            /* renamed from: c */
            public Cancellable mo61616c() {
                Cancellable futureAsCancellable;
                try {
                    Schedule b = CustomScheduler.this.mo61614b();
                    Throwable th = null;
                    this.f53396f.lock();
                    try {
                        futureAsCancellable = m73985b(b);
                    } catch (Throwable th2) {
                        this.f53396f.unlock();
                        throw th2;
                    }
                    this.f53396f.unlock();
                    if (th != null) {
                        this.f53395d.mo61623i(th);
                    }
                    return futureAsCancellable;
                } catch (Throwable th3) {
                    this.f53395d.mo61623i(th3);
                    return new FutureAsCancellable(Futures.m74208b());
                }
            }
        }

        protected static final class Schedule {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final long f53399a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final TimeUnit f53400b;
        }

        private static final class SupplantableFuture implements Cancellable {

            /* renamed from: a */
            private final ReentrantLock f53401a;
            /* access modifiers changed from: private */
            @GuardedBy

            /* renamed from: b */
            public Future<Void> f53402b;

            SupplantableFuture(ReentrantLock reentrantLock, Future<Void> future) {
                this.f53401a = reentrantLock;
                this.f53402b = future;
            }

            public void cancel(boolean z) {
                this.f53401a.lock();
                try {
                    this.f53402b.cancel(z);
                } finally {
                    this.f53401a.unlock();
                }
            }

            public boolean isCancelled() {
                this.f53401a.lock();
                try {
                    return this.f53402b.isCancelled();
                } finally {
                    this.f53401a.unlock();
                }
            }
        }

        public CustomScheduler() {
            super((C109601) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Cancellable mo61613a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new ReschedulableCallable(abstractService, scheduledExecutorService, runnable).mo61616c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract Schedule mo61614b() throws Exception;
    }

    private static final class FutureAsCancellable implements Cancellable {

        /* renamed from: a */
        private final Future<?> f53403a;

        FutureAsCancellable(Future<?> future) {
            this.f53403a = future;
        }

        public void cancel(boolean z) {
            this.f53403a.cancel(z);
        }

        public boolean isCancelled() {
            return this.f53403a.isCancelled();
        }
    }

    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 */
        class C109611 extends Scheduler {

            /* renamed from: a */
            final /* synthetic */ long f53404a;

            /* renamed from: b */
            final /* synthetic */ long f53405b;

            /* renamed from: c */
            final /* synthetic */ TimeUnit f53406c;

            /* renamed from: a */
            public Cancellable mo61613a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f53404a, this.f53405b, this.f53406c));
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 */
        class C109622 extends Scheduler {

            /* renamed from: a */
            final /* synthetic */ long f53407a;

            /* renamed from: b */
            final /* synthetic */ long f53408b;

            /* renamed from: c */
            final /* synthetic */ TimeUnit f53409c;

            /* renamed from: a */
            public Cancellable mo61613a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f53407a, this.f53408b, this.f53409c));
            }
        }

        private Scheduler() {
        }

        /* synthetic */ Scheduler(C109601 r1) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Cancellable mo61613a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);
    }

    protected AbstractScheduledService() {
    }

    /* renamed from: a */
    public final Service.State mo61550a() {
        return this.f53390a.mo61550a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo61602d() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Scheduler mo61603e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo61604f() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo61605g() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo61606h() throws Exception {
    }

    public String toString() {
        String f = mo61604f();
        String valueOf = String.valueOf(mo61550a());
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 3 + valueOf.length());
        sb.append(f);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    private final class ServiceDelegate extends AbstractService {
        /* access modifiers changed from: private */

        /* renamed from: p */
        public volatile Cancellable f53410p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public volatile ScheduledExecutorService f53411q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public final ReentrantLock f53412r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public final Runnable f53413s;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1 */
        class C109631 implements Supplier<String> {

            /* renamed from: a */
            final /* synthetic */ ServiceDelegate f53415a;

            /* renamed from: a */
            public String get() {
                String f = AbstractScheduledService.this.mo61604f();
                String valueOf = String.valueOf(this.f53415a.mo61550a());
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 1 + valueOf.length());
                sb.append(f);
                sb.append(" ");
                sb.append(valueOf);
                return sb.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2 */
        class C109642 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ServiceDelegate f53416a;

            public void run() {
                this.f53416a.f53412r.lock();
                try {
                    AbstractScheduledService.this.mo61606h();
                    ServiceDelegate serviceDelegate = this.f53416a;
                    Cancellable unused = serviceDelegate.f53410p = AbstractScheduledService.this.mo61603e().mo61613a(AbstractScheduledService.this.f53390a, this.f53416a.f53411q, this.f53416a.f53413s);
                    this.f53416a.mo61624j();
                } catch (Throwable th) {
                    this.f53416a.f53412r.unlock();
                    throw th;
                }
                this.f53416a.f53412r.unlock();
            }
        }

        class Task implements Runnable {
            Task() {
            }

            public void run() {
                ServiceDelegate.this.f53412r.lock();
                try {
                    Cancellable o = ServiceDelegate.this.f53410p;
                    Objects.requireNonNull(o);
                    if (o.isCancelled()) {
                        ServiceDelegate.this.f53412r.unlock();
                        return;
                    }
                    AbstractScheduledService.this.mo61602d();
                    ServiceDelegate.this.f53412r.unlock();
                } catch (Throwable th) {
                    ServiceDelegate.this.f53412r.unlock();
                    throw th;
                }
            }
        }

        private ServiceDelegate() {
            this.f53412r = new ReentrantLock();
            this.f53413s = new Task();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo61557d() {
            Objects.requireNonNull(this.f53410p);
            Objects.requireNonNull(this.f53411q);
            this.f53410p.cancel(false);
            this.f53411q.execute(new Runnable() {
                public void run() {
                    try {
                        ServiceDelegate.this.f53412r.lock();
                        if (ServiceDelegate.this.mo61550a() != Service.State.STOPPING) {
                            ServiceDelegate.this.f53412r.unlock();
                            return;
                        }
                        AbstractScheduledService.this.mo61605g();
                        ServiceDelegate.this.f53412r.unlock();
                        ServiceDelegate.this.mo61625k();
                    } catch (Throwable th) {
                        ServiceDelegate.this.mo61623i(th);
                    }
                }
            });
        }

        public String toString() {
            return AbstractScheduledService.this.toString();
        }

        /* synthetic */ ServiceDelegate(AbstractScheduledService abstractScheduledService, C109601 r2) {
            this();
        }
    }
}
