package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13646h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/z0;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "execute", "", "toString", "Lkotlinx/coroutines/h0;", "a", "Lkotlinx/coroutines/h0;", "dispatcher", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z0 */
/* compiled from: Executors.kt */
final class C15574z0 implements Executor {

    /* renamed from: a */
    public final C15415h0 f64816a;

    public void execute(Runnable runnable) {
        this.f64816a.dispatch(C13646h.f61899a, runnable);
    }

    public String toString() {
        return this.f64816a.toString();
    }
}
