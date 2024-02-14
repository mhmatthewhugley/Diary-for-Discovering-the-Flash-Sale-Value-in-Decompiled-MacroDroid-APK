package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15506q0;
import kotlinx.coroutines.C15546t0;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0001J\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, mo71668d2 = {"Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/h0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/t0;", "", "s", "block", "o", "", "timeMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/c1;", "j", "Lkotlinx/coroutines/n;", "Lja/u;", "continuation", "f", "", "parallelism", "limitedParallelism", "run", "dispatch", "dispatchYield", "a", "Lkotlinx/coroutines/h0;", "dispatcher", "c", "I", "runningWorkers", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/p;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "g", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/h0;I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.k */
/* compiled from: LimitedDispatcher.kt */
public final class C15451k extends C15415h0 implements Runnable, C15546t0 {

    /* renamed from: a */
    private final C15415h0 f64667a;

    /* renamed from: c */
    private final int f64668c;

    /* renamed from: d */
    private final /* synthetic */ C15546t0 f64669d;

    /* renamed from: f */
    private final C15459p<Runnable> f64670f;

    /* renamed from: g */
    private final Object f64671g;
    private volatile int runningWorkers;

    public C15451k(C15415h0 h0Var, int i) {
        this.f64667a = h0Var;
        this.f64668c = i;
        C15546t0 t0Var = h0Var instanceof C15546t0 ? (C15546t0) h0Var : null;
        this.f64669d = t0Var == null ? C15506q0.m94590a() : t0Var;
        this.f64670f = new C15459p<>(false);
        this.f64671g = new Object();
    }

    /* renamed from: o */
    private final boolean m94412o(Runnable runnable) {
        this.f64670f.mo74809a(runnable);
        return this.runningWorkers >= this.f64668c;
    }

    /* renamed from: s */
    private final boolean m94413s() {
        synchronized (this.f64671g) {
            if (this.runningWorkers >= this.f64668c) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        if (!m94412o(runnable) && m94413s()) {
            this.f64667a.dispatch(this, this);
        }
    }

    public void dispatchYield(C13640g gVar, Runnable runnable) {
        if (!m94412o(runnable) && m94413s()) {
            this.f64667a.dispatchYield(this, this);
        }
    }

    /* renamed from: f */
    public void mo74504f(long j, C15492n<? super C13339u> nVar) {
        this.f64669d.mo74504f(j, nVar);
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        return this.f64669d.mo74506j(j, runnable, gVar);
    }

    public C15415h0 limitedParallelism(int i) {
        C15452l.m94416a(i);
        if (i >= this.f64668c) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f64671g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f64670f.mo74811c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p297ja.C13339u.f61331a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.f64670f
            java.lang.Object r2 = r2.mo74812d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            kotlin.coroutines.h r3 = kotlin.coroutines.C13646h.f61899a
            kotlinx.coroutines.C15474j0.m94494a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.h0 r2 = r4.f64667a
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.h0 r0 = r4.f64667a
            r0.dispatch(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f64671g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.f64670f     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo74811c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C15451k.run():void");
    }
}
