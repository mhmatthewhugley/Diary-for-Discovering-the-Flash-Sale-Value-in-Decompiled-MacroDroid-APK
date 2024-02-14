package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.FlattenedPageController", mo71894f = "CachedPageEventFlow.kt", mo71895l = {262}, mo71896m = "getStateAsEvents")
/* compiled from: CachedPageEventFlow.kt */
final class FlattenedPageController$getStateAsEvents$1 extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlattenedPageController<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlattenedPageController$getStateAsEvents$1(FlattenedPageController<T> flattenedPageController, C13635d<? super FlattenedPageController$getStateAsEvents$1> dVar) {
        super(dVar);
        this.this$0 = flattenedPageController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getStateAsEvents(this);
    }
}
