package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15414h;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo71668d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/c1;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", "target", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_ktx_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/g;)V", "lifecycle-livedata-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineLiveData.kt */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final C13640g coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, C13640g gVar) {
        C13706o.m87929f(coroutineLiveData, TypedValues.Attributes.S_TARGET);
        C13706o.m87929f(gVar, "context");
        this.target = coroutineLiveData;
        this.coroutineContext = gVar.plus(C15186a1.m93731c().mo74507o());
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        Object g = C15414h.m94298g(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t, (C13635d<? super LiveDataScopeImpl$emit$2>) null), dVar);
        return g == C13652d.m87832c() ? g : C13339u.f61331a;
    }

    public Object emitSource(LiveData<T> liveData, C13635d<? super C15202c1> dVar) {
        return C15414h.m94298g(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, (C13635d<? super LiveDataScopeImpl$emitSource$2>) null), dVar);
    }

    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_ktx_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_ktx_release(CoroutineLiveData<T> coroutineLiveData) {
        C13706o.m87929f(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
