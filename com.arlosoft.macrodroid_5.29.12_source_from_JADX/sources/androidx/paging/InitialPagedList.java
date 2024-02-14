package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/InitialPagedList;", "", "K", "V", "Landroidx/paging/ContiguousPagedList;", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$Config;", "config", "initialLastKey", "<init>", "(Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* compiled from: InitialPagedList.kt */
public final class InitialPagedList<K, V> extends ContiguousPagedList<K, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitialPagedList(C15478k0 k0Var, C15415h0 h0Var, C15415h0 h0Var2, PagedList.Config config, K k) {
        super(new LegacyPagingSource(h0Var, new InitialDataSource()), k0Var, h0Var, h0Var2, (PagedList.BoundaryCallback) null, config, PagingSource.LoadResult.Page.Companion.empty$paging_common(), k);
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(h0Var, "notifyDispatcher");
        C13706o.m87929f(h0Var2, "backgroundDispatcher");
        C13706o.m87929f(config, "config");
    }
}
