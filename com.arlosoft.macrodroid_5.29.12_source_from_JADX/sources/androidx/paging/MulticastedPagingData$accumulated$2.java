package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/g;", "Landroidx/paging/PageEvent;", "", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.MulticastedPagingData$accumulated$2", mo71894f = "CachedPagingData.kt", mo71895l = {46}, mo71896m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
final class MulticastedPagingData$accumulated$2 extends C13665l implements C16270q<C15288g<? super PageEvent<T>>, Throwable, C13635d<? super C13339u>, Object> {
    int label;
    final /* synthetic */ MulticastedPagingData<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MulticastedPagingData$accumulated$2(MulticastedPagingData<T> multicastedPagingData, C13635d<? super MulticastedPagingData$accumulated$2> dVar) {
        super(3, dVar);
        this.this$0 = multicastedPagingData;
    }

    public final Object invoke(C15288g<? super PageEvent<T>> gVar, Throwable th, C13635d<? super C13339u> dVar) {
        return new MulticastedPagingData$accumulated$2(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            ActiveFlowTracker tracker = this.this$0.getTracker();
            if (tracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                this.label = 1;
                if (tracker.onComplete(flowType, this) == c) {
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
