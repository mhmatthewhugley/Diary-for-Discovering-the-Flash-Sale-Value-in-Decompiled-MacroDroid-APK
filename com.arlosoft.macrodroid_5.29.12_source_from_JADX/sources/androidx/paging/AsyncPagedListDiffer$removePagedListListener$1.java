package androidx.paging;

import androidx.paging.AsyncPagedListDiffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002H\n"}, mo71668d2 = {"", "T", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagedListDiffer.kt */
final class AsyncPagedListDiffer$removePagedListListener$1 extends C13708q implements C16265l<AsyncPagedListDiffer.PagedListListener<T>, Boolean> {
    final /* synthetic */ C16269p<PagedList<T>, PagedList<T>, C13339u> $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncPagedListDiffer$removePagedListListener$1(C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u> pVar) {
        super(1);
        this.$callback = pVar;
    }

    public final Boolean invoke(AsyncPagedListDiffer.PagedListListener<T> pagedListListener) {
        return Boolean.valueOf((pagedListListener instanceof AsyncPagedListDiffer.OnCurrentListChangedWrapper) && ((AsyncPagedListDiffer.OnCurrentListChangedWrapper) pagedListListener).getCallback() == this.$callback);
    }
}
