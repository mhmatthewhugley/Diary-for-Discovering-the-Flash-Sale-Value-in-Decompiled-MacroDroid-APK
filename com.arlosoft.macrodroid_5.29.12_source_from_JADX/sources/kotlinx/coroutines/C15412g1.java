package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C15428a;
import kotlinx.coroutines.internal.C15452l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010!¨\u0006&"}, mo71668d2 = {"Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/h0;", "", "unconfined", "", "B", "K", "L", "M", "Lkotlinx/coroutines/x0;", "task", "Lja/u;", "C", "E", "o", "", "parallelism", "limitedParallelism", "shutdown", "a", "J", "useCount", "c", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "d", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "D", "()J", "nextTime", "H", "()Z", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.g1 */
/* compiled from: EventLoop.common.kt */
public abstract class C15412g1 extends C15415h0 {

    /* renamed from: a */
    private long f64617a;

    /* renamed from: c */
    private boolean f64618c;

    /* renamed from: d */
    private C15428a<C15566x0<?>> f64619d;

    /* renamed from: B */
    private final long m94279B(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: G */
    public static /* synthetic */ void m94280G(C15412g1 g1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            g1Var.mo74721E(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: s */
    public static /* synthetic */ void m94281s(C15412g1 g1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            g1Var.mo74727o(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: C */
    public final void mo74719C(C15566x0<?> x0Var) {
        C15428a<C15566x0<?>> aVar = this.f64619d;
        if (aVar == null) {
            aVar = new C15428a<>();
            this.f64619d = aVar;
        }
        aVar.mo74751a(x0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public long mo74720D() {
        C15428a<C15566x0<?>> aVar = this.f64619d;
        if (aVar != null && !aVar.mo74752c()) {
            return 0;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    /* renamed from: E */
    public final void mo74721E(boolean z) {
        this.f64617a += m94279B(z);
        if (!z) {
            this.f64618c = true;
        }
    }

    /* renamed from: H */
    public final boolean mo74722H() {
        return this.f64617a >= m94279B(true);
    }

    /* renamed from: J */
    public final boolean mo74723J() {
        C15428a<C15566x0<?>> aVar = this.f64619d;
        if (aVar == null) {
            return true;
        }
        return aVar.mo74752c();
    }

    /* renamed from: K */
    public long mo74724K() {
        if (!mo74725L()) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return 0;
    }

    /* renamed from: L */
    public final boolean mo74725L() {
        C15566x0 d;
        C15428a<C15566x0<?>> aVar = this.f64619d;
        if (aVar == null || (d = aVar.mo74753d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* renamed from: M */
    public boolean mo74726M() {
        return false;
    }

    public final C15415h0 limitedParallelism(int i) {
        C15452l.m94416a(i);
        return this;
    }

    /* renamed from: o */
    public final void mo74727o(boolean z) {
        long B = this.f64617a - m94279B(z);
        this.f64617a = B;
        if (B <= 0 && this.f64618c) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
