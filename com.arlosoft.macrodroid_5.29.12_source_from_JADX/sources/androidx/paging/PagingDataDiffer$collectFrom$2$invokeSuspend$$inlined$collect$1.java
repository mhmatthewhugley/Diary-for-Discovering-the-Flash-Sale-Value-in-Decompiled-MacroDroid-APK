package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Collect.kt */
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 implements C15288g<PageEvent<T>> {
    final /* synthetic */ PagingDataDiffer this$0;

    public PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(PagingDataDiffer pagingDataDiffer) {
        this.this$0 = pagingDataDiffer;
    }

    public Object emit(PageEvent<T> pageEvent, C13635d<? super C13339u> dVar) {
        Object g = C15414h.m94298g(this.this$0.mainDispatcher, new PagingDataDiffer$collectFrom$2$1$1(pageEvent, this.this$0, (C13635d<? super PagingDataDiffer$collectFrom$2$1$1>) null), dVar);
        if (g == C13652d.m87832c()) {
            return g;
        }
        return C13339u.f61331a;
    }
}
