package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/l;", "", "cause", "Lja/u;", "a", "", "toString", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k */
/* compiled from: Future.kt */
final class C15477k extends C15481l {

    /* renamed from: a */
    private final Future<?> f64700a;

    public C15477k(Future<?> future) {
        this.f64700a = future;
    }

    /* renamed from: a */
    public void mo74549a(Throwable th) {
        if (th != null) {
            this.f64700a.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74549a((Throwable) obj);
        return C13339u.f61331a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f64700a + ']';
    }
}
