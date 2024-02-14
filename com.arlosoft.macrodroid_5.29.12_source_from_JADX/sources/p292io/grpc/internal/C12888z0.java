package p292io.grpc.internal;

import androidx.core.app.NotificationCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12537b1;
import p292io.grpc.internal.C12793s;

/* renamed from: io.grpc.internal.z0 */
/* compiled from: KeepAliveManager */
public class C12888z0 {

    /* renamed from: l */
    private static final long f60417l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m */
    private static final long f60418m = TimeUnit.MILLISECONDS.toNanos(10);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f60419a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Stopwatch f60420b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12893d f60421c;

    /* renamed from: d */
    private final boolean f60422d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C12894e f60423e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f60424f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f60425g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Runnable f60426h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Runnable f60427i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final long f60428j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f60429k;

    /* renamed from: io.grpc.internal.z0$a */
    /* compiled from: KeepAliveManager */
    class C12889a implements Runnable {
        C12889a() {
        }

        public void run() {
            boolean z;
            synchronized (C12888z0.this) {
                C12894e a = C12888z0.this.f60423e;
                C12894e eVar = C12894e.DISCONNECTED;
                if (a != eVar) {
                    C12894e unused = C12888z0.this.f60423e = eVar;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                C12888z0.this.f60421c.mo69654b();
            }
        }
    }

    /* renamed from: io.grpc.internal.z0$b */
    /* compiled from: KeepAliveManager */
    class C12890b implements Runnable {
        C12890b() {
        }

        public void run() {
            boolean z;
            synchronized (C12888z0.this) {
                ScheduledFuture unused = C12888z0.this.f60425g = null;
                C12894e a = C12888z0.this.f60423e;
                C12894e eVar = C12894e.PING_SCHEDULED;
                if (a == eVar) {
                    z = true;
                    C12894e unused2 = C12888z0.this.f60423e = C12894e.PING_SENT;
                    C12888z0 z0Var = C12888z0.this;
                    ScheduledFuture unused3 = z0Var.f60424f = z0Var.f60419a.schedule(C12888z0.this.f60426h, C12888z0.this.f60429k, TimeUnit.NANOSECONDS);
                } else {
                    if (C12888z0.this.f60423e == C12894e.PING_DELAYED) {
                        C12888z0 z0Var2 = C12888z0.this;
                        ScheduledExecutorService h = z0Var2.f60419a;
                        Runnable i = C12888z0.this.f60427i;
                        long j = C12888z0.this.f60428j;
                        Stopwatch k = C12888z0.this.f60420b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        ScheduledFuture unused4 = z0Var2.f60425g = h.schedule(i, j - k.mo22252e(timeUnit), timeUnit);
                        C12894e unused5 = C12888z0.this.f60423e = eVar;
                    }
                    z = false;
                }
            }
            if (z) {
                C12888z0.this.f60421c.mo69653a();
            }
        }
    }

    /* renamed from: io.grpc.internal.z0$c */
    /* compiled from: KeepAliveManager */
    public static final class C12891c implements C12893d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12812v f60432a;

        /* renamed from: io.grpc.internal.z0$c$a */
        /* compiled from: KeepAliveManager */
        class C12892a implements C12793s.C12794a {
            C12892a() {
            }

            /* renamed from: a */
            public void mo69538a(Throwable th) {
                C12891c.this.f60432a.mo69405b(C12537b1.f59422u.mo69066q("Keepalive failed. The connection is likely gone"));
            }

            /* renamed from: b */
            public void mo69539b(long j) {
            }
        }

        public C12891c(C12812v vVar) {
            this.f60432a = vVar;
        }

        /* renamed from: a */
        public void mo69653a() {
            this.f60432a.mo69434d(new C12892a(), MoreExecutors.m74259a());
        }

        /* renamed from: b */
        public void mo69654b() {
            this.f60432a.mo69405b(C12537b1.f59422u.mo69066q("Keepalive failed. The connection is likely gone"));
        }
    }

    /* renamed from: io.grpc.internal.z0$d */
    /* compiled from: KeepAliveManager */
    public interface C12893d {
        /* renamed from: a */
        void mo69653a();

        /* renamed from: b */
        void mo69654b();
    }

    /* renamed from: io.grpc.internal.z0$e */
    /* compiled from: KeepAliveManager */
    private enum C12894e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C12888z0(C12893d dVar, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(dVar, scheduledExecutorService, Stopwatch.m5464d(), j, j2, z);
    }

    /* renamed from: l */
    public static long m84840l(long j) {
        return Math.max(j, f60417l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo69646m() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.common.base.Stopwatch r0 = r5.f60420b     // Catch:{ all -> 0x004d }
            com.google.common.base.Stopwatch r0 = r0.mo22254h()     // Catch:{ all -> 0x004d }
            r0.mo22255i()     // Catch:{ all -> 0x004d }
            io.grpc.internal.z0$e r0 = r5.f60423e     // Catch:{ all -> 0x004d }
            io.grpc.internal.z0$e r1 = p292io.grpc.internal.C12888z0.C12894e.PING_SCHEDULED     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x0015
            io.grpc.internal.z0$e r0 = p292io.grpc.internal.C12888z0.C12894e.PING_DELAYED     // Catch:{ all -> 0x004d }
            r5.f60423e = r0     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x0015:
            io.grpc.internal.z0$e r2 = p292io.grpc.internal.C12888z0.C12894e.PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 == r2) goto L_0x001d
            io.grpc.internal.z0$e r2 = p292io.grpc.internal.C12888z0.C12894e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r2) goto L_0x004b
        L_0x001d:
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f60424f     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0.cancel(r2)     // Catch:{ all -> 0x004d }
        L_0x0025:
            io.grpc.internal.z0$e r0 = r5.f60423e     // Catch:{ all -> 0x004d }
            io.grpc.internal.z0$e r3 = p292io.grpc.internal.C12888z0.C12894e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r3) goto L_0x0031
            io.grpc.internal.z0$e r0 = p292io.grpc.internal.C12888z0.C12894e.IDLE     // Catch:{ all -> 0x004d }
            r5.f60423e = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0031:
            r5.f60423e = r1     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f60425g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            java.lang.String r0 = "There should be no outstanding pingFuture"
            com.google.common.base.Preconditions.m5399z(r2, r0)     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledExecutorService r0 = r5.f60419a     // Catch:{ all -> 0x004d }
            java.lang.Runnable r1 = r5.f60427i     // Catch:{ all -> 0x004d }
            long r2 = r5.f60428j     // Catch:{ all -> 0x004d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004d }
            r5.f60425g = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12888z0.mo69646m():void");
    }

    /* renamed from: n */
    public synchronized void mo69647n() {
        C12894e eVar = this.f60423e;
        if (eVar == C12894e.IDLE) {
            this.f60423e = C12894e.PING_SCHEDULED;
            if (this.f60425g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f60419a;
                Runnable runnable = this.f60427i;
                long j = this.f60428j;
                Stopwatch stopwatch = this.f60420b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f60425g = scheduledExecutorService.schedule(runnable, j - stopwatch.mo22252e(timeUnit), timeUnit);
            }
        } else if (eVar == C12894e.IDLE_AND_PING_SENT) {
            this.f60423e = C12894e.PING_SENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo69648o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f60422d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            io.grpc.internal.z0$e r0 = r2.f60423e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.z0$e r1 = p292io.grpc.internal.C12888z0.C12894e.PING_SCHEDULED     // Catch:{ all -> 0x0021 }
            if (r0 == r1) goto L_0x0011
            io.grpc.internal.z0$e r1 = p292io.grpc.internal.C12888z0.C12894e.PING_DELAYED     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x0015
        L_0x0011:
            io.grpc.internal.z0$e r0 = p292io.grpc.internal.C12888z0.C12894e.IDLE     // Catch:{ all -> 0x0021 }
            r2.f60423e = r0     // Catch:{ all -> 0x0021 }
        L_0x0015:
            io.grpc.internal.z0$e r0 = r2.f60423e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.z0$e r1 = p292io.grpc.internal.C12888z0.C12894e.PING_SENT     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x001f
            io.grpc.internal.z0$e r0 = p292io.grpc.internal.C12888z0.C12894e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x0021 }
            r2.f60423e = r0     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12888z0.mo69648o():void");
    }

    /* renamed from: p */
    public synchronized void mo69649p() {
        if (this.f60422d) {
            mo69647n();
        }
    }

    /* renamed from: q */
    public synchronized void mo69650q() {
        C12894e eVar = this.f60423e;
        C12894e eVar2 = C12894e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f60423e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f60424f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f60425g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f60425g = null;
            }
        }
    }

    @VisibleForTesting
    C12888z0(C12893d dVar, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch, long j, long j2, boolean z) {
        this.f60423e = C12894e.IDLE;
        this.f60426h = new C12595a1(new C12889a());
        this.f60427i = new C12595a1(new C12890b());
        this.f60421c = (C12893d) Preconditions.m5393t(dVar, "keepAlivePinger");
        this.f60419a = (ScheduledExecutorService) Preconditions.m5393t(scheduledExecutorService, "scheduler");
        this.f60420b = (Stopwatch) Preconditions.m5393t(stopwatch, NotificationCompat.CATEGORY_STOPWATCH);
        this.f60428j = j;
        this.f60429k = j2;
        this.f60422d = z;
        stopwatch.mo22254h().mo22255i();
    }
}
