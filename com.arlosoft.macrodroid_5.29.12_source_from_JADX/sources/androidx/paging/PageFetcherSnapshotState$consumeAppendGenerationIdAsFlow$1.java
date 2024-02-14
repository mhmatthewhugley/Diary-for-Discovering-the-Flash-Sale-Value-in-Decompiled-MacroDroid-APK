package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/g;", "", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", mo71894f = "PageFetcherSnapshotState.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcherSnapshotState.kt */
final class PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 extends C13665l implements C16269p<C15288g<? super Integer>, C13635d<? super C13339u>, Object> {
    int label;
    final /* synthetic */ PageFetcherSnapshotState<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, C13635d<? super PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = pageFetcherSnapshotState;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this.this$0, dVar);
    }

    public final Object invoke(C15288g<? super Integer> gVar, C13635d<? super C13339u> dVar) {
        return ((PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            this.this$0.appendGenerationIdCh.m101371trySendJP2dKIU(C13654b.m87834b(this.this$0.appendGenerationId));
            return C13339u.f61331a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
