package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {608}, mo71896m = "currentPagingState")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$currentPagingState$1 extends C13656d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$currentPagingState$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C13635d<? super PageFetcherSnapshot$currentPagingState$1> dVar) {
        super(dVar);
        this.this$0 = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.currentPagingState(this);
    }
}
