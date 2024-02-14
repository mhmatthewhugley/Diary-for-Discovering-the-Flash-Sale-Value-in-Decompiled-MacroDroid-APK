package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.C15418h1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/i1;", "Lkotlinx/coroutines/g1;", "Lja/u;", "Q", "", "now", "Lkotlinx/coroutines/h1$c;", "delayedTask", "O", "Ljava/lang/Thread;", "N", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i1 */
/* compiled from: EventLoop.kt */
public abstract class C15426i1 extends C15412g1 {
    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract Thread mo74715N();

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo74749O(long j, C15418h1.C15421c cVar) {
        C15502p0.f64721o.mo74735j0(j, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo74750Q() {
        Thread N = mo74715N();
        if (Thread.currentThread() != N) {
            C15200c.m93755a();
            LockSupport.unpark(N);
        }
    }
}
