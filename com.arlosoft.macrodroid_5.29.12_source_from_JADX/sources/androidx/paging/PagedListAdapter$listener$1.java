package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\n"}, mo71668d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/paging/PagedList;", "previousList", "currentList", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: PagedListAdapter.kt */
final class PagedListAdapter$listener$1 extends C13708q implements C16269p<PagedList<T>, PagedList<T>, C13339u> {
    final /* synthetic */ PagedListAdapter<T, VH> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagedListAdapter$listener$1(PagedListAdapter<T, VH> pagedListAdapter) {
        super(2);
        this.this$0 = pagedListAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PagedList) obj, (PagedList) obj2);
        return C13339u.f61331a;
    }

    public final void invoke(PagedList<T> pagedList, PagedList<T> pagedList2) {
        this.this$0.onCurrentListChanged(pagedList2);
        this.this$0.onCurrentListChanged(pagedList, pagedList2);
    }
}
