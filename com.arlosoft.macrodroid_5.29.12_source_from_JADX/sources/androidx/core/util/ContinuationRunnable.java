package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo71668d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lja/u;", "run", "", "toString", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Runnable.kt */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final C13635d<C13339u> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationRunnable(C13635d<? super C13339u> dVar) {
        super(false);
        C13706o.m87929f(dVar, "continuation");
        this.continuation = dVar;
    }

    public void run() {
        if (compareAndSet(false, true)) {
            C13635d<C13339u> dVar = this.continuation;
            C13329n.C13330a aVar = C13329n.f61327a;
            dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
        }
    }

    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
