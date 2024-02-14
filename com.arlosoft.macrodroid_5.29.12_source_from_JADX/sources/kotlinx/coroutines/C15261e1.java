package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/e1;", "Lkotlinx/coroutines/c2;", "", "cause", "Lja/u;", "D", "Lkotlinx/coroutines/c1;", "g", "Lkotlinx/coroutines/c1;", "handle", "<init>", "(Lkotlinx/coroutines/c1;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e1 */
/* compiled from: JobSupport.kt */
public final class C15261e1 extends C15203c2 {

    /* renamed from: g */
    private final C15202c1 f64473g;

    public C15261e1(C15202c1 c1Var) {
        this.f64473g = c1Var;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        this.f64473g.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
