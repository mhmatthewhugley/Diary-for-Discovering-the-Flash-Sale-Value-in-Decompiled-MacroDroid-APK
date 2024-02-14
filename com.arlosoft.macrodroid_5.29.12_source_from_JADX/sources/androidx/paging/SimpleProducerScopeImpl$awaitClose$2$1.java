package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, mo71668d2 = {"T", "", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: SimpleChannelFlow.kt */
final class SimpleProducerScopeImpl$awaitClose$2$1 extends C13708q implements C16265l<Throwable, C13339u> {
    final /* synthetic */ C15492n<C13339u> $cont;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleProducerScopeImpl$awaitClose$2$1(C15492n<? super C13339u> nVar) {
        super(1);
        this.$cont = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13339u.f61331a;
    }

    public final void invoke(Throwable th) {
        C15492n<C13339u> nVar = this.$cont;
        C13339u uVar = C13339u.f61331a;
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(uVar));
    }
}
