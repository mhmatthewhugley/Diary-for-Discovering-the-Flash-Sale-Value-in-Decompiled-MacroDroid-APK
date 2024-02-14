package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SingleRunner", mo71894f = "SingleRunner.kt", mo71895l = {49}, mo71896m = "runInIsolation")
/* compiled from: SingleRunner.kt */
final class SingleRunner$runInIsolation$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$1(SingleRunner singleRunner, C13635d<? super SingleRunner$runInIsolation$1> dVar) {
        super(dVar);
        this.this$0 = singleRunner;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runInIsolation(0, (C16265l<? super C13635d<? super C13339u>, ? extends Object>) null, this);
    }
}
