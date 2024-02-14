package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.RemoteMediatorAccessImpl", mo71894f = "RemoteMediatorAccessor.kt", mo71895l = {397}, mo71896m = "initialize")
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$initialize$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$initialize$1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, C13635d<? super RemoteMediatorAccessImpl$initialize$1> dVar) {
        super(dVar);
        this.this$0 = remoteMediatorAccessImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initialize(this);
    }
}
