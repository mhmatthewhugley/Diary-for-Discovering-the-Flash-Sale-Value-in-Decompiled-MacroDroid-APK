package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.multicast.StoreRealActor", mo71894f = "StoreRealActor.kt", mo71895l = {74, 76}, mo71896m = "close")
/* compiled from: StoreRealActor.kt */
final class StoreRealActor$close$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StoreRealActor<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoreRealActor$close$1(StoreRealActor<T> storeRealActor, C13635d<? super StoreRealActor$close$1> dVar) {
        super(dVar);
        this.this$0 = storeRealActor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.close(this);
    }
}
