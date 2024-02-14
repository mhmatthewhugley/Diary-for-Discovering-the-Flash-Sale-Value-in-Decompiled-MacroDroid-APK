package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/l;", "", "cause", "Lja/u;", "a", "", "toString", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C15548t1 extends C15481l {

    /* renamed from: a */
    private final C16265l<Throwable, C13339u> f64800a;

    public C15548t1(C16265l<? super Throwable, C13339u> lVar) {
        this.f64800a = lVar;
    }

    /* renamed from: a */
    public void mo74549a(Throwable th) {
        this.f64800a.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74549a((Throwable) obj);
        return C13339u.f61331a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C15498o0.m94571a(this.f64800a) + '@' + C15498o0.m94572b(this) + ']';
    }
}
