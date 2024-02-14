package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/g;", "Landroidx/paging/PagingData;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPagingDataKt$cachedIn$4", mo71894f = "CachedPagingData.kt", mo71895l = {104}, mo71896m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
final class CachedPagingDataKt$cachedIn$4 extends C13665l implements C16269p<C15288g<? super PagingData<T>>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ ActiveFlowTracker $tracker;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CachedPagingDataKt$cachedIn$4(ActiveFlowTracker activeFlowTracker, C13635d<? super CachedPagingDataKt$cachedIn$4> dVar) {
        super(2, dVar);
        this.$tracker = activeFlowTracker;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CachedPagingDataKt$cachedIn$4(this.$tracker, dVar);
    }

    public final Object invoke(C15288g<? super PagingData<T>> gVar, C13635d<? super C13339u> dVar) {
        return ((CachedPagingDataKt$cachedIn$4) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            ActiveFlowTracker activeFlowTracker = this.$tracker;
            if (activeFlowTracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                this.label = 1;
                if (activeFlowTracker.onStart(flowType, this) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
