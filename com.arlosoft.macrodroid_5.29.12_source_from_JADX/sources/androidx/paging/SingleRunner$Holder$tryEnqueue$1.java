package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SingleRunner$Holder", mo71894f = "SingleRunner.kt", mo71895l = {129, 100}, mo71896m = "tryEnqueue")
/* compiled from: SingleRunner.kt */
final class SingleRunner$Holder$tryEnqueue$1 extends C13656d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, C13635d<? super SingleRunner$Holder$tryEnqueue$1> dVar) {
        super(dVar);
        this.this$0 = holder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.tryEnqueue(0, (C15561w1) null, this);
    }
}
