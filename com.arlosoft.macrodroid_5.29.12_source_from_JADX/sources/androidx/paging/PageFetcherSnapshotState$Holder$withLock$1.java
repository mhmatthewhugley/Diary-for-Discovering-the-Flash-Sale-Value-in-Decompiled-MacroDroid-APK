package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshotState$Holder", mo71894f = "PageFetcherSnapshotState.kt", mo71895l = {403}, mo71896m = "withLock")
/* compiled from: PageFetcherSnapshotState.kt */
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends C13656d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshotState.Holder<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshotState$Holder$withLock$1(PageFetcherSnapshotState.Holder<Key, Value> holder, C13635d<? super PageFetcherSnapshotState$Holder$withLock$1> dVar) {
        super(dVar);
        this.this$0 = holder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withLock((C16265l) null, this);
    }
}
