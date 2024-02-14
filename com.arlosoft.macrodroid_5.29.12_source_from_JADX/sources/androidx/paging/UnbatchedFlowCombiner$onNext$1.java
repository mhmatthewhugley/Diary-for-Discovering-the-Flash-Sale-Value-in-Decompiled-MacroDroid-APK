package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.UnbatchedFlowCombiner", mo71894f = "FlowExt.kt", mo71895l = {188, 227, 205}, mo71896m = "onNext")
/* compiled from: FlowExt.kt */
final class UnbatchedFlowCombiner$onNext$1 extends C13656d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnbatchedFlowCombiner<T1, T2> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnbatchedFlowCombiner$onNext$1(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, C13635d<? super UnbatchedFlowCombiner$onNext$1> dVar) {
        super(dVar);
        this.this$0 = unbatchedFlowCombiner;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onNext(0, (Object) null, this);
    }
}
