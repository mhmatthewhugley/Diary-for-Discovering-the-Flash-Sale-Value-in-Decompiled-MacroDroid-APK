package kotlinx.coroutines.scheduling;

import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15200c;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15470x;
import p297ja.C13339u;
import p406ua.C16679c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0003<\u0019@B+\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010?\u001a\u00020\f\u0012\b\b\u0002\u0010B\u001a\u00020\u0013\u0012\b\b\u0002\u0010D\u001a\u000207¢\u0006\u0004\bM\u0010NJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u0014\u0010B\u001a\u00020\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u0002078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010CR\u0014\u0010G\u001a\u00020E8\u0006X\u0004¢\u0006\u0006\n\u0004\b2\u0010FR\u0014\u0010H\u001a\u00020E8\u0006X\u0004¢\u0006\u0006\n\u0004\b!\u0010FR\u001e\u0010K\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000I8\u0006X\u0004¢\u0006\u0006\n\u0004\b:\u0010JR\u0011\u0010L\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010\u0018¨\u0006O"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/h;", "task", "", "b", "(Lkotlinx/coroutines/scheduling/h;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "j", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", "", "i", "(Lkotlinx/coroutines/scheduling/a$c;)I", "skipUnpark", "Lja/u;", "s", "(Z)V", "", "state", "w", "(J)Z", "y", "()Z", "c", "()I", "tailDispatch", "v", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "f", "oldIndex", "newIndex", "o", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "m", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "r", "(J)V", "block", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "g", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "e", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;)Lkotlinx/coroutines/scheduling/h;", "u", "", "toString", "()Ljava/lang/String;", "p", "(Lkotlinx/coroutines/scheduling/h;)V", "a", "I", "corePoolSize", "maxPoolSize", "d", "J", "idleWorkerKeepAliveNs", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/scheduling/d;", "globalCpuQueue", "globalBlockingQueue", "Lkotlinx/coroutines/internal/x;", "Lkotlinx/coroutines/internal/x;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.a */
/* compiled from: CoroutineScheduler.kt */
public final class C15517a implements Executor, Closeable {

    /* renamed from: A */
    static final /* synthetic */ AtomicLongFieldUpdater f64732A = AtomicLongFieldUpdater.newUpdater(C15517a.class, "controlState");

    /* renamed from: B */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64733B = AtomicIntegerFieldUpdater.newUpdater(C15517a.class, "_isTerminated");

    /* renamed from: C */
    public static final C15429a0 f64734C = new C15429a0("NOT_IN_STACK");

    /* renamed from: s */
    public static final C15518a f64735s = new C15518a((C13695i) null);

    /* renamed from: z */
    private static final /* synthetic */ AtomicLongFieldUpdater f64736z = AtomicLongFieldUpdater.newUpdater(C15517a.class, "parkedWorkersStack");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a */
    public final int f64737a;

    /* renamed from: c */
    public final int f64738c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final long f64739d;

    /* renamed from: f */
    public final String f64740f;

    /* renamed from: g */
    public final C15524d f64741g;

    /* renamed from: o */
    public final C15524d f64742o;

    /* renamed from: p */
    public final C15470x<C15520c> f64743p;
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/a0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/a0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C15518a {
        private C15518a() {
        }

        public /* synthetic */ C15518a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class C15519b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64744a;

        static {
            int[] iArr = new int[C15521d.values().length];
            iArr[C15521d.PARKING.ordinal()] = 1;
            iArr[C15521d.BLOCKING.ordinal()] = 2;
            iArr[C15521d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C15521d.DORMANT.ordinal()] = 4;
            iArr[C15521d.TERMINATED.ordinal()] = 5;
            f64744a = iArr;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    /* compiled from: CoroutineScheduler.kt */
    public enum C15521d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C15517a(int i, int i2, long j, String str) {
        this.f64737a = i;
        this.f64738c = i2;
        this.f64739d = j;
        this.f64740f = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f64741g = new C15524d();
                        this.f64742o = new C15524d();
                        this.parkedWorkersStack = 0;
                        this.f64743p = new C15470x<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: b */
    private final boolean m94605b(C15528h hVar) {
        boolean z = true;
        if (hVar.f64769c.mo74895b() != 1) {
            z = false;
        }
        if (z) {
            return this.f64742o.mo74809a(hVar);
        }
        return this.f64741g.mo74809a(hVar);
    }

    /* renamed from: c */
    private final int m94606c() {
        synchronized (this.f64743p) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z = false;
            int b = C16792h.m99540b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (b >= this.f64737a) {
                return 0;
            }
            if (i >= this.f64738c) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f64743p.mo74830b(i2) == null) {
                C15520c cVar = new C15520c(i2);
                this.f64743p.mo74831c(i2, cVar);
                if (i2 == ((int) (2097151 & f64732A.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    cVar.start();
                    int i3 = b + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: f */
    private final C15520c m94607f() {
        Thread currentThread = Thread.currentThread();
        C15520c cVar = currentThread instanceof C15520c ? (C15520c) currentThread : null;
        if (cVar != null && C13706o.m87924a(C15517a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m94608h(C15517a aVar, Runnable runnable, C15529i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C15532l.f64777f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo74873g(runnable, iVar, z);
    }

    /* renamed from: i */
    private final int m94609i(C15520c cVar) {
        Object h = cVar.mo74883h();
        while (h != f64734C) {
            if (h == null) {
                return 0;
            }
            C15520c cVar2 = (C15520c) h;
            int g = cVar2.mo74882g();
            if (g != 0) {
                return g;
            }
            h = cVar2.mo74883h();
        }
        return -1;
    }

    /* renamed from: j */
    private final C15520c m94610j() {
        while (true) {
            long j = this.parkedWorkersStack;
            C15520c b = this.f64743p.mo74830b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int i = m94609i(b);
            if (i >= 0) {
                if (f64736z.compareAndSet(this, j, ((long) i) | j2)) {
                    b.mo74886p(f64734C);
                    return b;
                }
            }
        }
    }

    /* renamed from: s */
    private final void m94611s(boolean z) {
        long addAndGet = f64732A.addAndGet(this, 2097152);
        if (!z && !m94615y() && !m94613w(addAndGet)) {
            m94615y();
        }
    }

    /* renamed from: v */
    private final C15528h m94612v(C15520c cVar, C15528h hVar, boolean z) {
        if (cVar == null || cVar.f64747c == C15521d.TERMINATED) {
            return hVar;
        }
        if (hVar.f64769c.mo74895b() == 0 && cVar.f64747c == C15521d.BLOCKING) {
            return hVar;
        }
        cVar.f64751o = true;
        return cVar.f64746a.mo74898a(hVar, z);
    }

    /* renamed from: w */
    private final boolean m94613w(long j) {
        if (C16792h.m99540b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f64737a) {
            int c = m94606c();
            if (c == 1 && this.f64737a > 1) {
                m94606c();
            }
            if (c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    static /* synthetic */ boolean m94614x(C15517a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m94613w(j);
    }

    /* renamed from: y */
    private final boolean m94615y() {
        C15520c j;
        do {
            j = m94610j();
            if (j == null) {
                return false;
            }
        } while (!C15520c.f64745s.compareAndSet(j, -1, 0));
        LockSupport.unpark(j);
        return true;
    }

    public void close() {
        mo74878r(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* renamed from: e */
    public final C15528h mo74871e(Runnable runnable, C15529i iVar) {
        long a = C15532l.f64776e.mo74892a();
        if (!(runnable instanceof C15528h)) {
            return new C15531k(runnable, a, iVar);
        }
        C15528h hVar = (C15528h) runnable;
        hVar.f64768a = a;
        hVar.f64769c = iVar;
        return hVar;
    }

    public void execute(Runnable runnable) {
        m94608h(this, runnable, (C15529i) null, false, 6, (Object) null);
    }

    /* renamed from: g */
    public final void mo74873g(Runnable runnable, C15529i iVar, boolean z) {
        C15200c.m93755a();
        C15528h e = mo74871e(runnable, iVar);
        C15520c f = m94607f();
        C15528h v = m94612v(f, e, z);
        if (v == null || m94605b(v)) {
            boolean z2 = z && f != null;
            if (e.f64769c.mo74895b() != 0) {
                m94611s(z2);
            } else if (!z2) {
                mo74880u();
            }
        } else {
            throw new RejectedExecutionException(C13706o.m87936m(this.f64740f, " was terminated"));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final boolean mo74875m(C15520c cVar) {
        long j;
        int g;
        if (cVar.mo74883h() != f64734C) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.mo74882g();
            cVar.mo74886p(this.f64743p.mo74830b((int) (2097151 & j)));
        } while (!f64736z.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) g)));
        return true;
    }

    /* renamed from: o */
    public final void mo74876o(C15520c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m94609i(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f64736z.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo74877p(C15528h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C15200c.m93755a();
            throw th;
        }
        C15200c.m93755a();
    }

    /* renamed from: r */
    public final void mo74878r(long j) {
        int i;
        C15528h hVar;
        if (f64733B.compareAndSet(this, 0, 1)) {
            C15520c f = m94607f();
            synchronized (this.f64743p) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C15520c b = this.f64743p.mo74830b(i2);
                    C13706o.m87926c(b);
                    C15520c cVar = b;
                    if (cVar != f) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f64746a.mo74901g(this.f64742o);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f64742o.mo74810b();
            this.f64741g.mo74810b();
            while (true) {
                if (f == null) {
                    hVar = null;
                } else {
                    hVar = f.mo74881f(true);
                }
                if (hVar == null && (hVar = (C15528h) this.f64741g.mo74812d()) == null && (hVar = (C15528h) this.f64742o.mo74812d()) == null) {
                    break;
                }
                mo74877p(hVar);
            }
            if (f != null) {
                f.mo74888s(C15521d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f64743p.mo74829a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C15520c b = this.f64743p.mo74830b(i6);
            if (b != null) {
                int f = b.f64746a.mo74900f();
                int i8 = C15519b.f64744a[b.f64747c.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i5++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f64740f + '@' + C15498o0.m94572b(this) + "[Pool Size {core = " + this.f64737a + ", max = " + this.f64738c + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f64741g.mo74811c() + ", global blocking queue size = " + this.f64742o.mo74811c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f64737a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void mo74880u() {
        if (!m94615y() && !m94614x(this, 0, 1, (Object) null)) {
            m94615y();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bA\u0010CJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u00100\u001a\u00020-8\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00104R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b,\u0010?¨\u0006D"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "", "q", "()Z", "Lja/u;", "n", "()V", "r", "j", "Lkotlinx/coroutines/scheduling/h;", "task", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "", "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/h;", "m", "()Lkotlinx/coroutines/scheduling/h;", "blockingOnly", "t", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "s", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "upperBound", "k", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "o", "Lkotlinx/coroutines/scheduling/n;", "a", "Lkotlinx/coroutines/scheduling/n;", "localQueue", "Lkotlinx/coroutines/scheduling/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public final class C15520c extends Thread {

        /* renamed from: s */
        static final /* synthetic */ AtomicIntegerFieldUpdater f64745s = AtomicIntegerFieldUpdater.newUpdater(C15520c.class, "workerCtl");

        /* renamed from: a */
        public final C15534n f64746a;

        /* renamed from: c */
        public C15521d f64747c;

        /* renamed from: d */
        private long f64748d;

        /* renamed from: f */
        private long f64749f;

        /* renamed from: g */
        private int f64750g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o */
        public boolean f64751o;
        volatile /* synthetic */ int workerCtl;

        private C15520c() {
            setDaemon(true);
            this.f64746a = new C15534n();
            this.f64747c = C15521d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C15517a.f64734C;
            this.f64750g = C16679c.f67568a.mo79577b();
        }

        /* renamed from: b */
        private final void m94624b(int i) {
            if (i != 0) {
                C15517a.f64732A.addAndGet(C15517a.this, -2097152);
                if (this.f64747c != C15521d.TERMINATED) {
                    this.f64747c = C15521d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m94625c(int i) {
            if (i != 0 && mo74888s(C15521d.BLOCKING)) {
                C15517a.this.mo74880u();
            }
        }

        /* renamed from: d */
        private final void m94626d(C15528h hVar) {
            int b = hVar.f64769c.mo74895b();
            m94628i(b);
            m94625c(b);
            C15517a.this.mo74877p(hVar);
            m94624b(b);
        }

        /* renamed from: e */
        private final C15528h m94627e(boolean z) {
            C15528h m;
            C15528h m2;
            if (z) {
                boolean z2 = mo74884k(C15517a.this.f64737a * 2) == 0;
                if (z2 && (m2 = m94631m()) != null) {
                    return m2;
                }
                C15528h h = this.f64746a.mo74902h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m94631m()) != null) {
                    return m;
                }
            } else {
                C15528h m3 = m94631m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m94635t(false);
        }

        /* renamed from: i */
        private final void m94628i(int i) {
            this.f64748d = 0;
            if (this.f64747c == C15521d.PARKING) {
                this.f64747c = C15521d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m94629j() {
            return this.nextParkedWorker != C15517a.f64734C;
        }

        /* renamed from: l */
        private final void m94630l() {
            if (this.f64748d == 0) {
                this.f64748d = System.nanoTime() + C15517a.this.f64739d;
            }
            LockSupport.parkNanos(C15517a.this.f64739d);
            if (System.nanoTime() - this.f64748d >= 0) {
                this.f64748d = 0;
                m94636u();
            }
        }

        /* renamed from: m */
        private final C15528h m94631m() {
            if (mo74884k(2) == 0) {
                C15528h hVar = (C15528h) C15517a.this.f64741g.mo74812d();
                return hVar == null ? (C15528h) C15517a.this.f64742o.mo74812d() : hVar;
            }
            C15528h hVar2 = (C15528h) C15517a.this.f64742o.mo74812d();
            return hVar2 == null ? (C15528h) C15517a.this.f64741g.mo74812d() : hVar2;
        }

        /* renamed from: n */
        private final void m94632n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C15517a.this.isTerminated() && this.f64747c != C15521d.TERMINATED) {
                    C15528h f = mo74881f(this.f64751o);
                    if (f != null) {
                        this.f64749f = 0;
                        m94626d(f);
                    } else {
                        this.f64751o = false;
                        if (this.f64749f == 0) {
                            m94634r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo74888s(C15521d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f64749f);
                            this.f64749f = 0;
                        }
                    }
                }
            }
            mo74888s(C15521d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m94633q() {
            boolean z;
            if (this.f64747c != C15521d.CPU_ACQUIRED) {
                C15517a aVar = C15517a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C15517a.f64732A.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f64747c = C15521d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m94634r() {
            if (!m94629j()) {
                C15517a.this.mo74875m(this);
                return;
            }
            this.workerCtl = -1;
            while (m94629j() && this.workerCtl == -1 && !C15517a.this.isTerminated() && this.f64747c != C15521d.TERMINATED) {
                mo74888s(C15521d.PARKING);
                Thread.interrupted();
                m94630l();
            }
        }

        /* renamed from: t */
        private final C15528h m94635t(boolean z) {
            long j;
            int i = (int) (C15517a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo74884k(i);
            C15517a aVar = C15517a.this;
            int i2 = 0;
            long j2 = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                k++;
                if (k > i) {
                    k = 1;
                }
                C15520c b = aVar.f64743p.mo74830b(k);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f64746a.mo74903k(b.f64746a);
                    } else {
                        j = this.f64746a.mo74904l(b.f64746a);
                    }
                    if (j == -1) {
                        return this.f64746a.mo74902h();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = 0;
            }
            this.f64749f = j2;
            return null;
        }

        /* renamed from: u */
        private final void m94636u() {
            C15517a aVar = C15517a.this;
            synchronized (aVar.f64743p) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f64737a) {
                        if (f64745s.compareAndSet(this, -1, 1)) {
                            int g = mo74882g();
                            mo74885o(0);
                            aVar.mo74876o(this, g, 0);
                            int andDecrement = (int) (C15517a.f64732A.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != g) {
                                C15520c b = aVar.f64743p.mo74830b(andDecrement);
                                C13706o.m87926c(b);
                                C15520c cVar = b;
                                aVar.f64743p.mo74831c(g, cVar);
                                cVar.mo74885o(g);
                                aVar.mo74876o(cVar, andDecrement, g);
                            }
                            aVar.f64743p.mo74831c(andDecrement, null);
                            C13339u uVar = C13339u.f61331a;
                            this.f64747c = C15521d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C15528h mo74881f(boolean z) {
            C15528h hVar;
            if (m94633q()) {
                return m94627e(z);
            }
            if (z) {
                hVar = this.f64746a.mo74902h();
                if (hVar == null) {
                    hVar = (C15528h) C15517a.this.f64742o.mo74812d();
                }
            } else {
                hVar = (C15528h) C15517a.this.f64742o.mo74812d();
            }
            return hVar == null ? m94635t(true) : hVar;
        }

        /* renamed from: g */
        public final int mo74882g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo74883h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo74884k(int i) {
            int i2 = this.f64750g;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f64750g = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo74885o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C15517a.this.f64740f);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo74886p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m94632n();
        }

        /* renamed from: s */
        public final boolean mo74888s(C15521d dVar) {
            C15521d dVar2 = this.f64747c;
            boolean z = dVar2 == C15521d.CPU_ACQUIRED;
            if (z) {
                C15517a.f64732A.addAndGet(C15517a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f64747c = dVar;
            }
            return z;
        }

        public C15520c(int i) {
            this();
            mo74885o(i);
        }
    }
}
