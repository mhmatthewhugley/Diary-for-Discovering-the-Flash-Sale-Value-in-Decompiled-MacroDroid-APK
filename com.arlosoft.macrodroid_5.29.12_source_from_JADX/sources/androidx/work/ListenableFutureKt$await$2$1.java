package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, mo71668d2 = {"R", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ C15492n<R> $cancellableContinuation;
    final /* synthetic */ ListenableFuture<R> $this_await;

    public ListenableFutureKt$await$2$1(C15492n<? super R> nVar, ListenableFuture<R> listenableFuture) {
        this.$cancellableContinuation = nVar;
        this.$this_await = listenableFuture;
    }

    public final void run() {
        try {
            C15492n<R> nVar = this.$cancellableContinuation;
            R r = this.$this_await.get();
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(r));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.mo74845k(cause);
                return;
            }
            C15492n<R> nVar2 = this.$cancellableContinuation;
            C13329n.C13330a aVar2 = C13329n.f61327a;
            nVar2.resumeWith(C13329n.m85676a(C13332o.m85684a(cause)));
        }
    }
}
