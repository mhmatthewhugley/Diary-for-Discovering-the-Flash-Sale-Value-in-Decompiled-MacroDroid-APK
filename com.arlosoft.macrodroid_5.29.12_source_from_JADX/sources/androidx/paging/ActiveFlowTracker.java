package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "Landroidx/paging/ActiveFlowTracker$FlowType;", "flowType", "Lja/u;", "onStart", "(Landroidx/paging/ActiveFlowTracker$FlowType;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onComplete", "FlowType", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@VisibleForTesting
/* compiled from: CachedPagingData.kt */
public interface ActiveFlowTracker {

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo71668d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "(Ljava/lang/String;I)V", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: CachedPagingData.kt */
    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    Object onComplete(FlowType flowType, C13635d<? super C13339u> dVar);

    Object onStart(FlowType flowType, C13635d<? super C13339u> dVar);
}
