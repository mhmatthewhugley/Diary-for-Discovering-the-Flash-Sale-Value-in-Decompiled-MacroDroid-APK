package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"androidx/paging/AsyncPagedListDiffer$pagedListCallback$1", "Landroidx/paging/PagedList$Callback;", "", "position", "count", "Lja/u;", "onInserted", "onRemoved", "onChanged", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagedListDiffer.kt */
public final class AsyncPagedListDiffer$pagedListCallback$1 extends PagedList.Callback {
    final /* synthetic */ AsyncPagedListDiffer<T> this$0;

    AsyncPagedListDiffer$pagedListCallback$1(AsyncPagedListDiffer<T> asyncPagedListDiffer) {
        this.this$0 = asyncPagedListDiffer;
    }

    public void onChanged(int i, int i2) {
        this.this$0.getUpdateCallback$paging_runtime_release().onChanged(i, i2, (Object) null);
    }

    public void onInserted(int i, int i2) {
        this.this$0.getUpdateCallback$paging_runtime_release().onInserted(i, i2);
    }

    public void onRemoved(int i, int i2) {
        this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(i, i2);
    }
}
