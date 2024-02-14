package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, mo71668d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/paging/CombinedLoadStates;", "loadStates", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: PagingDataAdapter.kt */
final class PagingDataAdapter$withLoadStateHeader$1 extends C13708q implements C16265l<CombinedLoadStates, C13339u> {
    final /* synthetic */ LoadStateAdapter<?> $header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataAdapter$withLoadStateHeader$1(LoadStateAdapter<?> loadStateAdapter) {
        super(1);
        this.$header = loadStateAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CombinedLoadStates) obj);
        return C13339u.f61331a;
    }

    public final void invoke(CombinedLoadStates combinedLoadStates) {
        C13706o.m87929f(combinedLoadStates, "loadStates");
        this.$header.setLoadState(combinedLoadStates.getPrepend());
    }
}
