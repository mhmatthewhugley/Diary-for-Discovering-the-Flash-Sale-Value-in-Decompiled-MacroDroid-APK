package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0007\u0010\b\"\u00020\u00012\u00020\u0001¨\u0006\t"}, mo71668d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/m1;", "b", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/h0;", "a", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/h0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o1 */
/* compiled from: Executors.kt */
public final class C15499o1 {
    /* renamed from: a */
    public static final C15415h0 m94574a(Executor executor) {
        C15415h0 h0Var = null;
        C15574z0 z0Var = executor instanceof C15574z0 ? (C15574z0) executor : null;
        if (z0Var != null) {
            h0Var = z0Var.f64816a;
        }
        return h0Var == null ? new C15495n1(executor) : h0Var;
    }

    /* renamed from: b */
    public static final C15488m1 m94575b(ExecutorService executorService) {
        return new C15495n1(executorService);
    }
}
