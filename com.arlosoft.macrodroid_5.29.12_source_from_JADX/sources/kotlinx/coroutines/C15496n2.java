package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/n2;", "T", "Lkotlinx/coroutines/c2;", "", "cause", "Lja/u;", "D", "Lkotlinx/coroutines/o;", "g", "Lkotlinx/coroutines/o;", "continuation", "<init>", "(Lkotlinx/coroutines/o;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n2 */
/* compiled from: JobSupport.kt */
final class C15496n2<T> extends C15203c2 {

    /* renamed from: g */
    private final C15497o<T> f64713g;

    public C15496n2(C15497o<? super T> oVar) {
        this.f64713g = oVar;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        Object a0 = mo74519E().mo74608a0();
        if (a0 instanceof C15196b0) {
            C15497o<T> oVar = this.f64713g;
            C13329n.C13330a aVar = C13329n.f61327a;
            oVar.resumeWith(C13329n.m85676a(C13332o.m85684a(((C15196b0) a0).f64404a)));
            return;
        }
        C15497o<T> oVar2 = this.f64713g;
        C13329n.C13330a aVar2 = C13329n.f61327a;
        oVar2.resumeWith(C13329n.m85676a(C15262e2.m94031h(a0)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
