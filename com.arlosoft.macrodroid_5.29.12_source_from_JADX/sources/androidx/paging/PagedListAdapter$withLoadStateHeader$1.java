package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, mo71668d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/LoadState;", "loadState", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: PagedListAdapter.kt */
final class PagedListAdapter$withLoadStateHeader$1 extends C13708q implements C16269p<LoadType, LoadState, C13339u> {
    final /* synthetic */ LoadStateAdapter<?> $header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagedListAdapter$withLoadStateHeader$1(LoadStateAdapter<?> loadStateAdapter) {
        super(2);
        this.$header = loadStateAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LoadType) obj, (LoadState) obj2);
        return C13339u.f61331a;
    }

    public final void invoke(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(loadState, "loadState");
        if (loadType == LoadType.PREPEND) {
            this.$header.setLoadState(loadState);
        }
    }
}
