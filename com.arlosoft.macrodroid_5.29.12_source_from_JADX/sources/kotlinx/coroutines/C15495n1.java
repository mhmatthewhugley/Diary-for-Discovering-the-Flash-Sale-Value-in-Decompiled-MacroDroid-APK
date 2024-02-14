package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.internal.C15434d;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, mo71668d2 = {"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/t0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "B", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lja/u;", "o", "dispatch", "Lkotlinx/coroutines/n;", "continuation", "f", "Lkotlinx/coroutines/c1;", "j", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "s", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n1 */
/* compiled from: Executors.kt */
public final class C15495n1 extends C15488m1 implements C15546t0 {

    /* renamed from: c */
    private final Executor f64712c;

    public C15495n1(Executor executor) {
        this.f64712c = executor;
        C15434d.m94354a(mo74852s());
    }

    /* renamed from: B */
    private final ScheduledFuture<?> m94524B(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C13640g gVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m94525o(gVar, e);
            return null;
        }
    }

    /* renamed from: o */
    private final void m94525o(C13640g gVar, RejectedExecutionException rejectedExecutionException) {
        C15575z1.m94755c(gVar, C15483l1.m94506a("The task was rejected", rejectedExecutionException));
    }

    public void close() {
        Executor s = mo74852s();
        ExecutorService executorService = s instanceof ExecutorService ? (ExecutorService) s : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        try {
            Executor s = mo74852s();
            C15200c.m93755a();
            s.execute(runnable);
        } catch (RejectedExecutionException e) {
            C15200c.m93755a();
            m94525o(gVar, e);
            C15186a1.m93730b().dispatch(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15495n1) && ((C15495n1) obj).mo74852s() == mo74852s();
    }

    /* renamed from: f */
    public void mo74504f(long j, C15492n<? super C13339u> nVar) {
        Executor s = mo74852s();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = s instanceof ScheduledExecutorService ? (ScheduledExecutorService) s : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = m94524B(scheduledExecutorService, new C15504p2(this, nVar), nVar.getContext(), j);
        }
        if (scheduledFuture != null) {
            C15575z1.m94757e(nVar, scheduledFuture);
        } else {
            C15502p0.f64721o.mo74504f(j, nVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo74852s());
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        Executor s = mo74852s();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = s instanceof ScheduledExecutorService ? (ScheduledExecutorService) s : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = m94524B(scheduledExecutorService, runnable, gVar, j);
        }
        if (scheduledFuture != null) {
            return new C15197b1(scheduledFuture);
        }
        return C15502p0.f64721o.mo74506j(j, runnable, gVar);
    }

    /* renamed from: s */
    public Executor mo74852s() {
        return this.f64712c;
    }

    public String toString() {
        return mo74852s().toString();
    }
}
