package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SeparatorState", mo71894f = "Separators.kt", mo71895l = {305, 368, 380, 386, 398, 407, 429, 438, 451, 462}, mo71896m = "onInsert")
/* compiled from: Separators.kt */
final class SeparatorState$onInsert$1 extends C13656d {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeparatorState<R, T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SeparatorState$onInsert$1(SeparatorState<R, T> separatorState, C13635d<? super SeparatorState$onInsert$1> dVar) {
        super(dVar);
        this.this$0 = separatorState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onInsert((PageEvent.Insert) null, this);
    }
}
