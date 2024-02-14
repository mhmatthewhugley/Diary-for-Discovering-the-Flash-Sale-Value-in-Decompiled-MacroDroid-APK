package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u000b"}, mo71668d2 = {"Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/c2;", "", "cause", "Lja/u;", "D", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v1 */
/* compiled from: JobSupport.kt */
final class C15557v1 extends C15203c2 {

    /* renamed from: g */
    private final C16265l<Throwable, C13339u> f64804g;

    public C15557v1(C16265l<? super Throwable, C13339u> lVar) {
        this.f64804g = lVar;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        this.f64804g.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
