package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/c2;", "", "cause", "Lja/u;", "D", "Lkotlin/coroutines/d;", "g", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o2 */
/* compiled from: JobSupport.kt */
final class C15500o2 extends C15203c2 {

    /* renamed from: g */
    private final C13635d<C13339u> f64719g;

    public C15500o2(C13635d<? super C13339u> dVar) {
        this.f64719g = dVar;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        C13635d<C13339u> dVar = this.f64719g;
        C13329n.C13330a aVar = C13329n.f61327a;
        dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
