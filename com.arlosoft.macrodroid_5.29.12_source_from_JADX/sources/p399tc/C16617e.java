package p399tc;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\tB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, mo71668d2 = {"Ltc/e;", "", "Ltc/a;", "task", "Lja/u;", "e", "j", "", "delayNanos", "c", "Ltc/d;", "taskQueue", "h", "(Ltc/d;)V", "d", "i", "f", "Ltc/e$a;", "backend", "Ltc/e$a;", "g", "()Ltc/e$a;", "<init>", "(Ltc/e$a;)V", "a", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: tc.e */
/* compiled from: TaskRunner.kt */
public final class C16617e {

    /* renamed from: h */
    public static final C16617e f67465h = new C16617e(new C16620c(C16279b.m97634J(C16279b.f66630i + " TaskRunner", true)));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Logger f67466i;

    /* renamed from: j */
    public static final C16619b f67467j = new C16619b((C13695i) null);

    /* renamed from: a */
    private int f67468a = SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE;

    /* renamed from: b */
    private boolean f67469b;

    /* renamed from: c */
    private long f67470c;

    /* renamed from: d */
    private final List<C16616d> f67471d = new ArrayList();

    /* renamed from: e */
    private final List<C16616d> f67472e = new ArrayList();

    /* renamed from: f */
    private final Runnable f67473f = new C16621d(this);

    /* renamed from: g */
    private final C16618a f67474g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, mo71668d2 = {"Ltc/e$a;", "", "", "b", "Ltc/e;", "taskRunner", "Lja/u;", "c", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: tc.e$a */
    /* compiled from: TaskRunner.kt */
    public interface C16618a {
        /* renamed from: a */
        void mo79493a(C16617e eVar, long j);

        /* renamed from: b */
        long mo79494b();

        /* renamed from: c */
        void mo79495c(C16617e eVar);

        void execute(Runnable runnable);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo71668d2 = {"Ltc/e$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Ltc/e;", "INSTANCE", "Ltc/e;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: tc.e$b */
    /* compiled from: TaskRunner.kt */
    public static final class C16619b {
        private C16619b() {
        }

        public /* synthetic */ C16619b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Logger mo79497a() {
            return C16617e.f67466i;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, mo71668d2 = {"Ltc/e$c;", "Ltc/e$a;", "", "b", "Ltc/e;", "taskRunner", "Lja/u;", "c", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: tc.e$c */
    /* compiled from: TaskRunner.kt */
    public static final class C16620c implements C16618a {

        /* renamed from: a */
        private final ThreadPoolExecutor f67475a;

        public C16620c(ThreadFactory threadFactory) {
            C13706o.m87929f(threadFactory, "threadFactory");
            this.f67475a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public void mo79493a(C16617e eVar, long j) throws InterruptedException {
            C13706o.m87929f(eVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                eVar.wait(j2, (int) j3);
            }
        }

        /* renamed from: b */
        public long mo79494b() {
            return System.nanoTime();
        }

        /* renamed from: c */
        public void mo79495c(C16617e eVar) {
            C13706o.m87929f(eVar, "taskRunner");
            eVar.notify();
        }

        public void execute(Runnable runnable) {
            C13706o.m87929f(runnable, "runnable");
            this.f67475a.execute(runnable);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"tc/e$d", "Ljava/lang/Runnable;", "Lja/u;", "run", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: tc.e$d */
    /* compiled from: TaskRunner.kt */
    public static final class C16621d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C16617e f67476a;

        C16621d(C16617e eVar) {
            this.f67476a = eVar;
        }

        public void run() {
            C16613a d;
            while (true) {
                synchronized (this.f67476a) {
                    d = this.f67476a.mo79488d();
                }
                if (d != null) {
                    C16616d d2 = d.mo79470d();
                    C13706o.m87926c(d2);
                    long j = -1;
                    boolean isLoggable = C16617e.f67467j.mo79497a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d2.mo79481h().mo79490g().mo79494b();
                        C16614b.m98955c(d, d2, "starting");
                    }
                    try {
                        this.f67476a.m98975j(d);
                        C13339u uVar = C13339u.f61331a;
                        if (isLoggable) {
                            long b = d2.mo79481h().mo79490g().mo79494b() - j;
                            C16614b.m98955c(d, d2, "finished run in " + C16614b.m98954b(b));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long b2 = d2.mo79481h().mo79490g().mo79494b() - j;
                            C16614b.m98955c(d, d2, "failed a run in " + C16614b.m98954b(b2));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C16617e.class.getName());
        C13706o.m87928e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f67466i = logger;
    }

    public C16617e(C16618a aVar) {
        C13706o.m87929f(aVar, "backend");
        this.f67474g = aVar;
    }

    /* renamed from: c */
    private final void m98973c(C16613a aVar, long j) {
        if (!C16279b.f66629h || Thread.holdsLock(this)) {
            C16616d d = aVar.mo79470d();
            C13706o.m87926c(d);
            if (d.mo79476c() == aVar) {
                boolean d2 = d.mo79477d();
                d.mo79485m(false);
                d.mo79484l((C16613a) null);
                this.f67471d.remove(d);
                if (j != -1 && !d2 && !d.mo79480g()) {
                    d.mo79483k(aVar, j, true);
                }
                if (!d.mo79478e().isEmpty()) {
                    this.f67472e.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: e */
    private final void m98974e(C16613a aVar) {
        if (!C16279b.f66629h || Thread.holdsLock(this)) {
            aVar.mo79472g(-1);
            C16616d d = aVar.mo79470d();
            C13706o.m87926c(d);
            d.mo79478e().remove(aVar);
            this.f67472e.remove(d);
            d.mo79484l(aVar);
            this.f67471d.add(d);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m98975j(C16613a aVar) {
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.mo79468b());
            try {
                long f = aVar.mo76151f();
                synchronized (this) {
                    m98973c(aVar, f);
                    C13339u uVar = C13339u.f61331a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    m98973c(aVar, -1);
                    C13339u uVar2 = C13339u.f61331a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            C13706o.m87928e(currentThread2, "Thread.currentThread()");
            sb.append(currentThread2.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|36|39|40|47|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r15.f67469b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c3 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p399tc.C16613a mo79488d() {
        /*
            r15 = this;
            boolean r0 = p372qc.C16279b.f66629h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.util.List<tc.d> r0 = r15.f67472e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            tc.e$a r0 = r15.f67474g
            long r2 = r0.mo79494b()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<tc.d> r0 = r15.f67472e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x0053:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.next()
            tc.d r7 = (p399tc.C16616d) r7
            java.util.List r7 = r7.mo79478e()
            java.lang.Object r7 = r7.get(r9)
            tc.a r7 = (p399tc.C16613a) r7
            long r10 = r7.mo79469c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x007f
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x0053
        L_0x007f:
            if (r6 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0086
        L_0x0083:
            r6 = r7
            goto L_0x0053
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r6 == 0) goto L_0x00a2
            r15.m98974e(r6)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r15.f67469b
            if (r0 != 0) goto L_0x00a1
            java.util.List<tc.d> r0 = r15.f67472e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00a1
        L_0x009a:
            tc.e$a r0 = r15.f67474g
            java.lang.Runnable r1 = r15.f67473f
            r0.execute(r1)
        L_0x00a1:
            return r6
        L_0x00a2:
            boolean r0 = r15.f67469b
            if (r0 == 0) goto L_0x00b3
            long r6 = r15.f67470c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            tc.e$a r0 = r15.f67474g
            r0.mo79495c(r15)
        L_0x00b2:
            return r1
        L_0x00b3:
            r15.f67469b = r8
            long r2 = r2 + r4
            r15.f67470c = r2
            tc.e$a r0 = r15.f67474g     // Catch:{ InterruptedException -> 0x00c3 }
            r0.mo79493a(r15, r4)     // Catch:{ InterruptedException -> 0x00c3 }
        L_0x00bd:
            r15.f67469b = r9
            goto L_0x0037
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c3:
            r15.mo79489f()     // Catch:{ all -> 0x00c1 }
            goto L_0x00bd
        L_0x00c7:
            r15.f67469b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p399tc.C16617e.mo79488d():tc.a");
    }

    /* renamed from: f */
    public final void mo79489f() {
        for (int size = this.f67471d.size() - 1; size >= 0; size--) {
            this.f67471d.get(size).mo79475b();
        }
        for (int size2 = this.f67472e.size() - 1; size2 >= 0; size2--) {
            C16616d dVar = this.f67472e.get(size2);
            dVar.mo79475b();
            if (dVar.mo79478e().isEmpty()) {
                this.f67472e.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final C16618a mo79490g() {
        return this.f67474g;
    }

    /* renamed from: h */
    public final void mo79491h(C16616d dVar) {
        C13706o.m87929f(dVar, "taskQueue");
        if (!C16279b.f66629h || Thread.holdsLock(this)) {
            if (dVar.mo79476c() == null) {
                if (!dVar.mo79478e().isEmpty()) {
                    C16279b.m97647a(this.f67472e, dVar);
                } else {
                    this.f67472e.remove(dVar);
                }
            }
            if (this.f67469b) {
                this.f67474g.mo79495c(this);
            } else {
                this.f67474g.execute(this.f67473f);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: i */
    public final C16616d mo79492i() {
        int i;
        synchronized (this) {
            i = this.f67468a;
            this.f67468a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C16616d(this, sb.toString());
    }
}
