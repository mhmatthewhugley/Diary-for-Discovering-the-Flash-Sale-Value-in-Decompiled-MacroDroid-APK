package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {609, 620, 398, 406, 631, 642, 448, 653, 470, 496, 664}, mo71896m = "doLoad")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$doLoad$1 extends C13656d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C13635d<? super PageFetcherSnapshot$doLoad$1> dVar) {
        super(dVar);
        this.this$0 = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doLoad((LoadType) null, (GenerationalViewportHint) null, this);
    }
}
