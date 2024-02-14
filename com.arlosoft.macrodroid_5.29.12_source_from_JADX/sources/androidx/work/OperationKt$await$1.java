package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.work.OperationKt", mo71894f = "Operation.kt", mo71895l = {39}, mo71896m = "await")
/* compiled from: Operation.kt */
final class OperationKt$await$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    OperationKt$await$1(C13635d<? super OperationKt$await$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OperationKt.await((Operation) null, this);
    }
}
