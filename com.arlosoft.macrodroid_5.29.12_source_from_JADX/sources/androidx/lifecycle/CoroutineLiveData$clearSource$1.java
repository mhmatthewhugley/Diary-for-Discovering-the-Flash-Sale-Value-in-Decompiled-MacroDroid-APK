package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.lifecycle.CoroutineLiveData", mo71894f = "CoroutineLiveData.kt", mo71895l = {234}, mo71896m = "clearSource$lifecycle_livedata_ktx_release")
/* compiled from: CoroutineLiveData.kt */
final class CoroutineLiveData$clearSource$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$clearSource$1(CoroutineLiveData<T> coroutineLiveData, C13635d<? super CoroutineLiveData$clearSource$1> dVar) {
        super(dVar);
        this.this$0 = coroutineLiveData;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearSource$lifecycle_livedata_ktx_release(this);
    }
}
