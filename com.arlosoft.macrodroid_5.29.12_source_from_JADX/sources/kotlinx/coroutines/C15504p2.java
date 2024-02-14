package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/p2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lja/u;", "run", "Lkotlinx/coroutines/h0;", "a", "Lkotlinx/coroutines/h0;", "dispatcher", "Lkotlinx/coroutines/n;", "c", "Lkotlinx/coroutines/n;", "continuation", "<init>", "(Lkotlinx/coroutines/h0;Lkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p2 */
/* compiled from: Executors.kt */
final class C15504p2 implements Runnable {

    /* renamed from: a */
    private final C15415h0 f64724a;

    /* renamed from: c */
    private final C15492n<C13339u> f64725c;

    public C15504p2(C15415h0 h0Var, C15492n<? super C13339u> nVar) {
        this.f64724a = h0Var;
        this.f64725c = nVar;
    }

    public void run() {
        this.f64725c.mo74847q(this.f64724a, C13339u.f61331a);
    }
}
