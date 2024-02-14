package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H@"}, mo71668d2 = {"", "T", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagingDataDiffer$collectFrom$2", mo71894f = "PagingDataDiffer.kt", mo71895l = {467}, mo71896m = "invokeSuspend")
/* compiled from: PagingDataDiffer.kt */
final class PagingDataDiffer$collectFrom$2 extends C13665l implements C16265l<C13635d<? super C13339u>, Object> {
    final /* synthetic */ PagingData<T> $pagingData;
    int label;
    final /* synthetic */ PagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataDiffer$collectFrom$2(PagingDataDiffer<T> pagingDataDiffer, PagingData<T> pagingData, C13635d<? super PagingDataDiffer$collectFrom$2> dVar) {
        super(1, dVar);
        this.this$0 = pagingDataDiffer;
        this.$pagingData = pagingData;
    }

    public final C13635d<C13339u> create(C13635d<?> dVar) {
        return new PagingDataDiffer$collectFrom$2(this.this$0, this.$pagingData, dVar);
    }

    public final Object invoke(C13635d<? super C13339u> dVar) {
        return ((PagingDataDiffer$collectFrom$2) create(dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            this.this$0.receiver = this.$pagingData.getReceiver$paging_common();
            C15285f<PageEvent<T>> flow$paging_common = this.$pagingData.getFlow$paging_common();
            PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 = new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(this.this$0);
            this.label = 1;
            if (flow$paging_common.collect(pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
