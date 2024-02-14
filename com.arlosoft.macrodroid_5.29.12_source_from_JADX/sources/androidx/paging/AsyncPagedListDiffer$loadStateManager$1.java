package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"androidx/paging/AsyncPagedListDiffer$loadStateManager$1", "Landroidx/paging/PagedList$LoadStateManager;", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "Lja/u;", "onStateChanged", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagedListDiffer.kt */
public final class AsyncPagedListDiffer$loadStateManager$1 extends PagedList.LoadStateManager {
    final /* synthetic */ AsyncPagedListDiffer<T> this$0;

    AsyncPagedListDiffer$loadStateManager$1(AsyncPagedListDiffer<T> asyncPagedListDiffer) {
        this.this$0 = asyncPagedListDiffer;
    }

    public void onStateChanged(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "type");
        C13706o.m87929f(loadState, "state");
        for (C16269p invoke : this.this$0.getLoadStateListeners$paging_runtime_release()) {
            invoke.invoke(loadType, loadState);
        }
    }
}
