package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/n;", "", "Lkotlinx/coroutines/scheduling/h;", "task", "c", "(Lkotlinx/coroutines/scheduling/h;)Lkotlinx/coroutines/scheduling/h;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/n;Z)J", "Lkotlinx/coroutines/scheduling/d;", "queue", "j", "(Lkotlinx/coroutines/scheduling/d;)Z", "i", "()Lkotlinx/coroutines/scheduling/h;", "Lja/u;", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "l", "(Lkotlinx/coroutines/scheduling/n;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.n */
/* compiled from: WorkQueue.kt */
public final class C15534n {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64780b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64781c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64782d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64783e;

    /* renamed from: a */
    private final AtomicReferenceArray<C15528h> f64784a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C15534n> cls = C15534n.class;
        f64780b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f64781c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f64782d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f64783e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C15528h m94653b(C15534n nVar, C15528h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo74898a(hVar, z);
    }

    /* renamed from: c */
    private final C15528h m94654c(C15528h hVar) {
        boolean z = true;
        if (hVar.f64769c.mo74895b() != 1) {
            z = false;
        }
        if (z) {
            f64783e.incrementAndGet(this);
        }
        if (mo74899e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f64784a.get(i) != null) {
            Thread.yield();
        }
        this.f64784a.lazySet(i, hVar);
        f64781c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m94655d(C15528h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f64769c.mo74895b() != 1) {
                z = false;
            }
            if (z) {
                f64783e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final C15528h m94656i() {
        C15528h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f64782d.compareAndSet(this, i, i + 1) && (andSet = this.f64784a.getAndSet(i2, (Object) null)) != null) {
                m94655d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m94657j(C15524d dVar) {
        C15528h i = m94656i();
        if (i == null) {
            return false;
        }
        dVar.mo74809a(i);
        return true;
    }

    /* renamed from: m */
    private final long m94658m(C15534n nVar, boolean z) {
        C15528h hVar;
        do {
            hVar = (C15528h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f64769c.mo74895b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C15532l.f64776e.mo74892a() - hVar.f64768a;
            long j = C15532l.f64772a;
            if (a < j) {
                return j - a;
            }
        } while (!C0320a.m383a(f64780b, nVar, hVar, (Object) null));
        m94653b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C15528h mo74898a(C15528h hVar, boolean z) {
        if (z) {
            return m94654c(hVar);
        }
        C15528h hVar2 = (C15528h) f64780b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m94654c(hVar2);
    }

    /* renamed from: e */
    public final int mo74899e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo74900f() {
        return this.lastScheduledTask != null ? mo74899e() + 1 : mo74899e();
    }

    /* renamed from: g */
    public final void mo74901g(C15524d dVar) {
        C15528h hVar = (C15528h) f64780b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo74809a(hVar);
        }
        do {
        } while (m94657j(dVar));
    }

    /* renamed from: h */
    public final C15528h mo74902h() {
        C15528h hVar = (C15528h) f64780b.getAndSet(this, (Object) null);
        return hVar == null ? m94656i() : hVar;
    }

    /* renamed from: k */
    public final long mo74903k(C15534n nVar) {
        int i = nVar.consumerIndex;
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<C15528h> atomicReferenceArray = nVar.f64784a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C15528h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f64769c.mo74895b() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    f64783e.decrementAndGet(nVar);
                    m94653b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return m94658m(nVar, true);
    }

    /* renamed from: l */
    public final long mo74904l(C15534n nVar) {
        C15528h i = nVar.m94656i();
        if (i == null) {
            return m94658m(nVar, false);
        }
        m94653b(this, i, false, 2, (Object) null);
        return -1;
    }
}
