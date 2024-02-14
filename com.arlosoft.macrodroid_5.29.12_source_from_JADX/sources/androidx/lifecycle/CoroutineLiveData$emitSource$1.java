package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.lifecycle.CoroutineLiveData", mo71894f = "CoroutineLiveData.kt", mo71895l = {227, 228}, mo71896m = "emitSource$lifecycle_livedata_ktx_release")
/* compiled from: CoroutineLiveData.kt */
final class CoroutineLiveData$emitSource$1 extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, C13635d<? super CoroutineLiveData$emitSource$1> dVar) {
        super(dVar);
        this.this$0 = coroutineLiveData;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_ktx_release((LiveData) null, this);
    }
}
