package p292io.grpc.internal;

import com.google.common.base.Stopwatch;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.internal.C12793s;

/* renamed from: io.grpc.internal.s0 */
/* compiled from: Http2Ping */
public class C12795s0 {

    /* renamed from: g */
    private static final Logger f60177g = Logger.getLogger(C12795s0.class.getName());

    /* renamed from: a */
    private final long f60178a;

    /* renamed from: b */
    private final Stopwatch f60179b;

    /* renamed from: c */
    private Map<C12793s.C12794a, Executor> f60180c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f60181d;

    /* renamed from: e */
    private Throwable f60182e;

    /* renamed from: f */
    private long f60183f;

    /* renamed from: io.grpc.internal.s0$a */
    /* compiled from: Http2Ping */
    class C12796a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12793s.C12794a f60184a;

        /* renamed from: c */
        final /* synthetic */ long f60185c;

        C12796a(C12793s.C12794a aVar, long j) {
            this.f60184a = aVar;
            this.f60185c = j;
        }

        public void run() {
            this.f60184a.mo69539b(this.f60185c);
        }
    }

    /* renamed from: io.grpc.internal.s0$b */
    /* compiled from: Http2Ping */
    class C12797b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12793s.C12794a f60186a;

        /* renamed from: c */
        final /* synthetic */ Throwable f60187c;

        C12797b(C12793s.C12794a aVar, Throwable th) {
            this.f60186a = aVar;
            this.f60187c = th;
        }

        public void run() {
            this.f60186a.mo69538a(this.f60187c);
        }
    }

    public C12795s0(long j, Stopwatch stopwatch) {
        this.f60178a = j;
        this.f60179b = stopwatch;
    }

    /* renamed from: b */
    private static Runnable m84537b(C12793s.C12794a aVar, long j) {
        return new C12796a(aVar, j);
    }

    /* renamed from: c */
    private static Runnable m84538c(C12793s.C12794a aVar, Throwable th) {
        return new C12797b(aVar, th);
    }

    /* renamed from: e */
    private static void m84539e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f60177g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: g */
    public static void m84540g(C12793s.C12794a aVar, Executor executor, Throwable th) {
        m84539e(executor, m84538c(aVar, th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        m84539e(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69540a(p292io.grpc.internal.C12793s.C12794a r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f60181d     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x000c
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r2.f60180c     // Catch:{ all -> 0x0020 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x000c:
            java.lang.Throwable r0 = r2.f60182e     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0015
            java.lang.Runnable r3 = m84538c(r3, r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001b
        L_0x0015:
            long r0 = r2.f60183f     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r3 = m84537b(r3, r0)     // Catch:{ all -> 0x0020 }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            m84539e(r4, r3)
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12795s0.mo69540a(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = r3.next();
        m84539e((java.util.concurrent.Executor) r4.getValue(), m84537b((p292io.grpc.internal.C12793s.C12794a) r4.getKey(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = r3.entrySet().iterator();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo69541d() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f60181d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            return r0
        L_0x0008:
            r0 = 1
            r6.f60181d = r0     // Catch:{ all -> 0x0044 }
            com.google.common.base.Stopwatch r1 = r6.f60179b     // Catch:{ all -> 0x0044 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0044 }
            long r1 = r1.mo22252e(r2)     // Catch:{ all -> 0x0044 }
            r6.f60183f = r1     // Catch:{ all -> 0x0044 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r3 = r6.f60180c     // Catch:{ all -> 0x0044 }
            r4 = 0
            r6.f60180c = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r4 = r4.getKey()
            io.grpc.internal.s$a r4 = (p292io.grpc.internal.C12793s.C12794a) r4
            java.lang.Runnable r4 = m84537b(r4, r1)
            m84539e(r5, r4)
            goto L_0x0023
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12795s0.mo69541d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r0.next();
        m84540g((p292io.grpc.internal.C12793s.C12794a) r1.getKey(), (java.util.concurrent.Executor) r1.getValue(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r0.entrySet().iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69542f(java.lang.Throwable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f60181d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0007:
            r0 = 1
            r3.f60181d = r0     // Catch:{ all -> 0x0037 }
            r3.f60182e = r4     // Catch:{ all -> 0x0037 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r3.f60180c     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.f60180c = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            io.grpc.internal.s$a r2 = (p292io.grpc.internal.C12793s.C12794a) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            m84540g(r2, r1, r4)
            goto L_0x001a
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12795s0.mo69542f(java.lang.Throwable):void");
    }

    /* renamed from: h */
    public long mo69543h() {
        return this.f60178a;
    }
}
