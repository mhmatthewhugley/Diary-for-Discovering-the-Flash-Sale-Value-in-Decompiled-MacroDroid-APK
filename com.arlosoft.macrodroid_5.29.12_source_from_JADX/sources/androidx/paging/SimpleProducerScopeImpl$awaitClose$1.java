package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SimpleProducerScopeImpl", mo71894f = "SimpleChannelFlow.kt", mo71895l = {97}, mo71896m = "awaitClose")
/* compiled from: SimpleChannelFlow.kt */
final class SimpleProducerScopeImpl$awaitClose$1 extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SimpleProducerScopeImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleProducerScopeImpl$awaitClose$1(SimpleProducerScopeImpl<T> simpleProducerScopeImpl, C13635d<? super SimpleProducerScopeImpl$awaitClose$1> dVar) {
        super(dVar);
        this.this$0 = simpleProducerScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitClose((C16254a<C13339u>) null, this);
    }
}
