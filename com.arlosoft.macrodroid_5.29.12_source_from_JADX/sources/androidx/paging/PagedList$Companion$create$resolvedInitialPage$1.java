package androidx.paging;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "K", "T", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagingSource$LoadResult$Page;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", mo71894f = "PagedList.kt", mo71895l = {184}, mo71896m = "invokeSuspend")
/* compiled from: PagedList.kt */
final class PagedList$Companion$create$resolvedInitialPage$1 extends C13665l implements C16269p<C15478k0, C13635d<? super PagingSource.LoadResult.Page<K, T>>, Object> {
    final /* synthetic */ PagingSource<K, T> $pagingSource;
    final /* synthetic */ PagingSource.LoadParams.Refresh<K> $params;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagedList$Companion$create$resolvedInitialPage$1(PagingSource<K, T> pagingSource, PagingSource.LoadParams.Refresh<K> refresh, C13635d<? super PagedList$Companion$create$resolvedInitialPage$1> dVar) {
        super(2, dVar);
        this.$pagingSource = pagingSource;
        this.$params = refresh;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PagedList$Companion$create$resolvedInitialPage$1(this.$pagingSource, this.$params, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super PagingSource.LoadResult.Page<K, T>> dVar) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            PagingSource<K, T> pagingSource = this.$pagingSource;
            PagingSource.LoadParams.Refresh<K> refresh = this.$params;
            this.label = 1;
            obj = pagingSource.load(refresh, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
        if (loadResult instanceof PagingSource.LoadResult.Page) {
            return (PagingSource.LoadResult.Page) loadResult;
        }
        if (loadResult instanceof PagingSource.LoadResult.Error) {
            throw ((PagingSource.LoadResult.Error) loadResult).getThrowable();
        } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
            throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
