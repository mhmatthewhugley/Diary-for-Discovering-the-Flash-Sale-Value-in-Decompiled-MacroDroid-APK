package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", mo71894f = "AsyncPagingDataDiffer.kt", mo71895l = {163}, mo71896m = "invokeSuspend")
/* compiled from: AsyncPagingDataDiffer.kt */
final class AsyncPagingDataDiffer$submitData$2 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ int $id;
    final /* synthetic */ PagingData<T> $pagingData;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$submitData$2(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, int i, PagingData<T> pagingData, C13635d<? super AsyncPagingDataDiffer$submitData$2> dVar) {
        super(2, dVar);
        this.this$0 = asyncPagingDataDiffer;
        this.$id = i;
        this.$pagingData = pagingData;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new AsyncPagingDataDiffer$submitData$2(this.this$0, this.$id, this.$pagingData, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((AsyncPagingDataDiffer$submitData$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            if (this.this$0.submitDataId.get() == this.$id) {
                AsyncPagingDataDiffer$differBase$1 access$getDifferBase$p = this.this$0.differBase;
                PagingData<T> pagingData = this.$pagingData;
                this.label = 1;
                if (access$getDifferBase$p.collectFrom(pagingData, this) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
