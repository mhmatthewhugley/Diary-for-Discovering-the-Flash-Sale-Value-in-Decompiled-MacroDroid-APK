package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p292io.grpc.C12930o0;

/* renamed from: io.grpc.internal.e1 */
/* compiled from: ManagedChannelOrphanWrapper */
final class C12667e1 extends C12719j0 {

    /* renamed from: c */
    private static final ReferenceQueue<C12667e1> f59848c = new ReferenceQueue<>();

    /* renamed from: d */
    private static final ConcurrentMap<C12668a, C12668a> f59849d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f59850e = Logger.getLogger(C12667e1.class.getName());

    /* renamed from: b */
    private final C12668a f59851b;

    @VisibleForTesting
    /* renamed from: io.grpc.internal.e1$a */
    /* compiled from: ManagedChannelOrphanWrapper */
    static final class C12668a extends WeakReference<C12667e1> {

        /* renamed from: f */
        private static final boolean f59852f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        private static final RuntimeException f59853g = m84119d();

        /* renamed from: a */
        private final ReferenceQueue<C12667e1> f59854a;

        /* renamed from: b */
        private final ConcurrentMap<C12668a, C12668a> f59855b;

        /* renamed from: c */
        private final String f59856c;

        /* renamed from: d */
        private final Reference<RuntimeException> f59857d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public volatile boolean f59858e;

        C12668a(C12667e1 e1Var, C12930o0 o0Var, ReferenceQueue<C12667e1> referenceQueue, ConcurrentMap<C12668a, C12668a> concurrentMap) {
            super(e1Var, referenceQueue);
            RuntimeException runtimeException;
            if (f59852f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f59853g;
            }
            this.f59857d = new SoftReference(runtimeException);
            this.f59856c = o0Var.toString();
            this.f59854a = referenceQueue;
            this.f59855b = concurrentMap;
            concurrentMap.put(this, this);
            m84117b(referenceQueue);
        }

        @VisibleForTesting
        /* renamed from: b */
        static int m84117b(ReferenceQueue<C12667e1> referenceQueue) {
            int i = 0;
            while (true) {
                C12668a aVar = (C12668a) referenceQueue.poll();
                if (aVar == null) {
                    return i;
                }
                RuntimeException runtimeException = aVar.f59857d.get();
                aVar.m84118c();
                if (!aVar.f59858e) {
                    i++;
                    Level level = Level.SEVERE;
                    if (C12667e1.f59850e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C12667e1.f59850e.getName());
                        logRecord.setParameters(new Object[]{aVar.f59856c});
                        logRecord.setThrown(runtimeException);
                        C12667e1.f59850e.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: c */
        private void m84118c() {
            super.clear();
            this.f59855b.remove(this);
            this.f59857d.clear();
        }

        /* renamed from: d */
        private static RuntimeException m84119d() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        public void clear() {
            m84118c();
            m84117b(this.f59854a);
        }
    }

    C12667e1(C12930o0 o0Var) {
        this(o0Var, f59848c, f59849d);
    }

    /* renamed from: n */
    public C12930o0 mo69274n() {
        boolean unused = this.f59851b.f59858e = true;
        this.f59851b.clear();
        return super.mo69274n();
    }

    /* renamed from: o */
    public C12930o0 mo69275o() {
        boolean unused = this.f59851b.f59858e = true;
        this.f59851b.clear();
        return super.mo69275o();
    }

    @VisibleForTesting
    C12667e1(C12930o0 o0Var, ReferenceQueue<C12667e1> referenceQueue, ConcurrentMap<C12668a, C12668a> concurrentMap) {
        super(o0Var);
        this.f59851b = new C12668a(this, o0Var, referenceQueue, concurrentMap);
    }
}
