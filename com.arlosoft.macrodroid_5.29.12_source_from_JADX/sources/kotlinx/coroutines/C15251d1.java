package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/l;", "", "cause", "Lja/u;", "a", "", "toString", "Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/c1;", "handle", "<init>", "(Lkotlinx/coroutines/c1;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d1 */
/* compiled from: CancellableContinuation.kt */
final class C15251d1 extends C15481l {

    /* renamed from: a */
    private final C15202c1 f64460a;

    public C15251d1(C15202c1 c1Var) {
        this.f64460a = c1Var;
    }

    /* renamed from: a */
    public void mo74549a(Throwable th) {
        this.f64460a.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74549a((Throwable) obj);
        return C13339u.f61331a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f64460a + ']';
    }
}
