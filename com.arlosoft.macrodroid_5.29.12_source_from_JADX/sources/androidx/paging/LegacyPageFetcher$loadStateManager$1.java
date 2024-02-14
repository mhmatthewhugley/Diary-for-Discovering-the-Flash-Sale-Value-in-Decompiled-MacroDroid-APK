package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"androidx/paging/LegacyPageFetcher$loadStateManager$1", "Landroidx/paging/PagedList$LoadStateManager;", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "Lja/u;", "onStateChanged", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LegacyPageFetcher.kt */
public final class LegacyPageFetcher$loadStateManager$1 extends PagedList.LoadStateManager {
    final /* synthetic */ LegacyPageFetcher<K, V> this$0;

    LegacyPageFetcher$loadStateManager$1(LegacyPageFetcher<K, V> legacyPageFetcher) {
        this.this$0 = legacyPageFetcher;
    }

    public void onStateChanged(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "type");
        C13706o.m87929f(loadState, "state");
        this.this$0.getPageConsumer().onStateChanged(loadType, loadState);
    }
}
