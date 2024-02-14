package androidx.paging;

import androidx.paging.PagePresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, mo71668d2 = {"androidx/paging/PagingDataDiffer$processPageEventCallback$1", "Landroidx/paging/PagePresenter$ProcessPageEventCallback;", "", "position", "count", "Lja/u;", "onChanged", "onInserted", "onRemoved", "Landroidx/paging/LoadStates;", "source", "mediator", "onStateUpdate", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Landroidx/paging/LoadState;", "loadState", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagingDataDiffer.kt */
public final class PagingDataDiffer$processPageEventCallback$1 implements PagePresenter.ProcessPageEventCallback {
    final /* synthetic */ PagingDataDiffer<T> this$0;

    PagingDataDiffer$processPageEventCallback$1(PagingDataDiffer<T> pagingDataDiffer) {
        this.this$0 = pagingDataDiffer;
    }

    public void onChanged(int i, int i2) {
        this.this$0.differCallback.onChanged(i, i2);
    }

    public void onInserted(int i, int i2) {
        this.this$0.differCallback.onInserted(i, i2);
    }

    public void onRemoved(int i, int i2) {
        this.this$0.differCallback.onRemoved(i, i2);
    }

    public void onStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
        C13706o.m87929f(loadStates, "source");
        this.this$0.dispatchLoadStates$paging_common(loadStates, loadStates2);
    }

    public void onStateUpdate(LoadType loadType, boolean z, LoadState loadState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(loadState, "loadState");
        if (!C13706o.m87924a(this.this$0.combinedLoadStatesCollection.get(loadType, z), loadState)) {
            this.this$0.combinedLoadStatesCollection.set(loadType, z, loadState);
        }
    }
}
