package androidx.paging;

import androidx.annotation.CheckResult;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15286f0;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001aB\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\t"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PagingData;", "Lkotlinx/coroutines/k0;", "scope", "cachedIn", "Landroidx/paging/ActiveFlowTracker;", "tracker", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt {
    @CheckResult
    public static final <T> C15285f<PagingData<T>> cachedIn(C15285f<PagingData<T>> fVar, C15478k0 k0Var) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(k0Var, "scope");
        return cachedIn(fVar, k0Var, (ActiveFlowTracker) null);
    }

    public static /* synthetic */ C15285f cachedIn$default(C15285f fVar, C15478k0 k0Var, ActiveFlowTracker activeFlowTracker, int i, Object obj) {
        if ((i & 2) != 0) {
            activeFlowTracker = null;
        }
        return cachedIn(fVar, k0Var, activeFlowTracker);
    }

    public static final <T> C15285f<PagingData<T>> cachedIn(C15285f<PagingData<T>> fVar, C15478k0 k0Var, ActiveFlowTracker activeFlowTracker) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(k0Var, "scope");
        return C15290h.m94110A(C15290h.m94137w(C15290h.m94139y(new CachedPagingDataKt$cachedIn$$inlined$map$1(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(fVar, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1((C13635d) null, k0Var)), new CachedPagingDataKt$cachedIn$2((C13635d<? super CachedPagingDataKt$cachedIn$2>) null))), new CachedPagingDataKt$cachedIn$4(activeFlowTracker, (C13635d<? super CachedPagingDataKt$cachedIn$4>) null)), new CachedPagingDataKt$cachedIn$5(activeFlowTracker, (C13635d<? super CachedPagingDataKt$cachedIn$5>) null)), k0Var, C15286f0.f64520a.mo74668b(), 1);
    }
}
