package androidx.core.p007os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;

@RequiresApi(31)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "Lja/u;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.ContinuationOutcomeReceiver */
/* compiled from: OutcomeReceiver.kt */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final C13635d<R> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationOutcomeReceiver(C13635d<? super R> dVar) {
        super(false);
        C13706o.m87929f(dVar, "continuation");
        this.continuation = dVar;
    }

    public void onError(E e) {
        C13706o.m87929f(e, "error");
        if (compareAndSet(false, true)) {
            C13635d<R> dVar = this.continuation;
            C13329n.C13330a aVar = C13329n.f61327a;
            dVar.resumeWith(C13329n.m85676a(C13332o.m85684a(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            C13635d<R> dVar = this.continuation;
            C13329n.C13330a aVar = C13329n.f61327a;
            dVar.resumeWith(C13329n.m85676a(r));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
