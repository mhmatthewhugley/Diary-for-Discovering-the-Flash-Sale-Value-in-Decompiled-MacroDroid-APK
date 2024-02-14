package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", mo71894f = "AsyncPagingDataDiffer.kt", mo71895l = {98}, mo71896m = "presentNewList")
/* compiled from: AsyncPagingDataDiffer.kt */
final class AsyncPagingDataDiffer$differBase$1$presentNewList$1 extends C13656d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncPagingDataDiffer$differBase$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1$presentNewList$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, C13635d<? super AsyncPagingDataDiffer$differBase$1$presentNewList$1> dVar) {
        super(dVar);
        this.this$0 = asyncPagingDataDiffer$differBase$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.presentNewList((NullPaddedList) null, (NullPaddedList) null, 0, (C16254a<C13339u>) null, this);
    }
}
