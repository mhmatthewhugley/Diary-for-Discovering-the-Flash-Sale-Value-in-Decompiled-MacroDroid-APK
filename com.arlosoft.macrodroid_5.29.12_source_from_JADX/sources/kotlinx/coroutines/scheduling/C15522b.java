package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15488m1;
import kotlinx.coroutines.internal.C15431b0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/m1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lja/u;", "execute", "", "parallelism", "Lkotlinx/coroutines/h0;", "limitedParallelism", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "dispatchYield", "close", "", "toString", "d", "Lkotlinx/coroutines/h0;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.b */
/* compiled from: Dispatcher.kt */
public final class C15522b extends C15488m1 implements Executor {

    /* renamed from: c */
    public static final C15522b f64759c = new C15522b();

    /* renamed from: d */
    private static final C15415h0 f64760d = C15533m.f64779a.limitedParallelism(C15435d0.m94358d("kotlinx.coroutines.io.parallelism", C16792h.m99540b(64, C15431b0.m94339a()), 0, 0, 12, (Object) null));

    private C15522b() {
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        f64760d.dispatch(gVar, runnable);
    }

    public void dispatchYield(C13640g gVar, Runnable runnable) {
        f64760d.dispatchYield(gVar, runnable);
    }

    public void execute(Runnable runnable) {
        dispatch(C13646h.f61899a, runnable);
    }

    public C15415h0 limitedParallelism(int i) {
        return C15533m.f64779a.limitedParallelism(i);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
