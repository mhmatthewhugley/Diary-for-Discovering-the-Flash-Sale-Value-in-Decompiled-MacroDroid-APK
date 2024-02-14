package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/k0;", "Landroidx/paging/NullPaddedDiffResult;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", mo71894f = "AsyncPagingDataDiffer.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: AsyncPagingDataDiffer.kt */
final class AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 extends C13665l implements C16269p<C15478k0, C13635d<? super NullPaddedDiffResult>, Object> {
    final /* synthetic */ NullPaddedList<T> $newList;
    final /* synthetic */ NullPaddedList<T> $previousList;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2, AsyncPagingDataDiffer<T> asyncPagingDataDiffer, C13635d<? super AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1> dVar) {
        super(2, dVar);
        this.$previousList = nullPaddedList;
        this.$newList = nullPaddedList2;
        this.this$0 = asyncPagingDataDiffer;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this.$previousList, this.$newList, this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super NullPaddedDiffResult> dVar) {
        return ((AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            return NullPaddedListDiffHelperKt.computeDiff(this.$previousList, this.$newList, this.this$0.diffCallback);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
