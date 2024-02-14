package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.PageFetcher", mo71894f = "PageFetcher.kt", mo71895l = {188}, mo71896m = "generateNewPagingSource")
/* compiled from: PageFetcher.kt */
final class PageFetcher$generateNewPagingSource$1 extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcher<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcher$generateNewPagingSource$1(PageFetcher<Key, Value> pageFetcher, C13635d<? super PageFetcher$generateNewPagingSource$1> dVar) {
        super(dVar);
        this.this$0 = pageFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.generateNewPagingSource((PagingSource) null, this);
    }
}
