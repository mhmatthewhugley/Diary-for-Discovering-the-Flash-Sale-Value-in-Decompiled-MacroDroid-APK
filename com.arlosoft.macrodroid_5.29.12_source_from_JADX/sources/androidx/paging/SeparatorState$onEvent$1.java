package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SeparatorState", mo71894f = "Separators.kt", mo71895l = {213, 215}, mo71896m = "onEvent")
/* compiled from: Separators.kt */
final class SeparatorState$onEvent$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeparatorState<R, T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SeparatorState$onEvent$1(SeparatorState<R, T> separatorState, C13635d<? super SeparatorState$onEvent$1> dVar) {
        super(dVar);
        this.this$0 = separatorState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onEvent((PageEvent) null, this);
    }
}
