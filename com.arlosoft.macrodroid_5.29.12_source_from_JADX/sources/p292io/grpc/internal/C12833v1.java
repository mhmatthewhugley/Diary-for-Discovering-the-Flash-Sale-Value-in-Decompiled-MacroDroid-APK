package p292io.grpc.internal;

import com.google.common.base.Stopwatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.v1 */
/* compiled from: Rescheduler */
final class C12833v1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f60269a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f60270b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Runnable f60271c;

    /* renamed from: d */
    private final Stopwatch f60272d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f60273e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f60274f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f60275g;

    /* renamed from: io.grpc.internal.v1$b */
    /* compiled from: Rescheduler */
    private final class C12835b implements Runnable {
        private C12835b() {
        }

        public void run() {
            if (!C12833v1.this.f60274f) {
                ScheduledFuture unused = C12833v1.this.f60275g = null;
                return;
            }
            long e = C12833v1.this.m84664j();
            if (C12833v1.this.f60273e - e > 0) {
                C12833v1 v1Var = C12833v1.this;
                ScheduledFuture unused2 = v1Var.f60275g = v1Var.f60269a.schedule(new C12836c(), C12833v1.this.f60273e - e, TimeUnit.NANOSECONDS);
                return;
            }
            boolean unused3 = C12833v1.this.f60274f = false;
            ScheduledFuture unused4 = C12833v1.this.f60275g = null;
            C12833v1.this.f60271c.run();
        }
    }

    /* renamed from: io.grpc.internal.v1$c */
    /* compiled from: Rescheduler */
    private final class C12836c implements Runnable {
        private C12836c() {
        }

        public void run() {
            C12833v1.this.f60270b.execute(new C12835b());
        }
    }

    C12833v1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.f60271c = runnable;
        this.f60270b = executor;
        this.f60269a = scheduledExecutorService;
        this.f60272d = stopwatch;
        stopwatch.mo22255i();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public long m84664j() {
        return this.f60272d.mo22252e(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo69597i(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.f60274f = false;
        if (z && (scheduledFuture = this.f60275g) != null) {
            scheduledFuture.cancel(false);
            this.f60275g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo69598k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long j2 = m84664j() + nanos;
        this.f60274f = true;
        if (j2 - this.f60273e < 0 || this.f60275g == null) {
            ScheduledFuture<?> scheduledFuture = this.f60275g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f60275g = this.f60269a.schedule(new C12836c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f60273e = j2;
    }
}
