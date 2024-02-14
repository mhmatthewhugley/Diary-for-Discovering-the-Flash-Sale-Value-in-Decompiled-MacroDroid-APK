package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15499o1;
import kotlinx.coroutines.C15503p1;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0017\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%B%\b\u0017\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(B+\b\u0017\u0012\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b$\u0010,B+\b\u0017\u0012\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010-J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u0010R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u0012\u0004\b \u0010\u001aR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006."}, mo71668d2 = {"Landroidx/paging/LivePagedListBuilder;", "", "Key", "Value", "Lkotlinx/coroutines/k0;", "coroutineScope", "setCoroutineScope", "key", "setInitialLoadKey", "(Ljava/lang/Object;)Landroidx/paging/LivePagedListBuilder;", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "Ljava/util/concurrent/Executor;", "fetchExecutor", "setFetchExecutor", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "build", "Landroidx/paging/DataSource$Factory;", "dataSourceFactory", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$Config;", "getConfig$annotations", "()V", "Lkotlinx/coroutines/k0;", "getCoroutineScope$annotations", "initialLoadKey", "Ljava/lang/Object;", "Landroidx/paging/PagedList$BoundaryCallback;", "getBoundaryCallback$annotations", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "Lkotlinx/coroutines/h0;", "<init>", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource$Factory;I)V", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "(Lqa/a;Landroidx/paging/PagedList$Config;)V", "(Lqa/a;I)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LivePagedListBuilder.kt */
public final class LivePagedListBuilder<Key, Value> {
    private PagedList.BoundaryCallback<Value> boundaryCallback;
    private final PagedList.Config config;
    private C15478k0 coroutineScope;
    private final DataSource.Factory<Key, Value> dataSourceFactory;
    private C15415h0 fetchDispatcher;
    private Key initialLoadKey;
    private final C16254a<PagingSource<Key, Value>> pagingSourceFactory;

    public LivePagedListBuilder(DataSource.Factory<Key, Value> factory, PagedList.Config config2) {
        C13706o.m87929f(factory, "dataSourceFactory");
        C13706o.m87929f(config2, "config");
        this.coroutineScope = C15503p1.f64723a;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        C13706o.m87928e(iOThreadExecutor, "getIOThreadExecutor()");
        this.fetchDispatcher = C15499o1.m94574a(iOThreadExecutor);
        this.pagingSourceFactory = null;
        this.dataSourceFactory = factory;
        this.config = config2;
    }

    private static /* synthetic */ void getBoundaryCallback$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    private static /* synthetic */ void getCoroutineScope$annotations() {
    }

    public final LiveData<PagedList<Value>> build() {
        C16254a<PagingSource<Key, Value>> aVar = this.pagingSourceFactory;
        if (aVar == null) {
            DataSource.Factory<Key, Value> factory = this.dataSourceFactory;
            aVar = factory == null ? null : factory.asPagingSourceFactory(this.fetchDispatcher);
        }
        C16254a<PagingSource<Key, Value>> aVar2 = aVar;
        if (aVar2 != null) {
            C15478k0 k0Var = this.coroutineScope;
            Key key = this.initialLoadKey;
            PagedList.Config config2 = this.config;
            PagedList.BoundaryCallback<Value> boundaryCallback2 = this.boundaryCallback;
            Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
            C13706o.m87928e(mainThreadExecutor, "getMainThreadExecutor()");
            return new LivePagedList(k0Var, key, config2, boundaryCallback2, aVar2, C15499o1.m94574a(mainThreadExecutor), this.fetchDispatcher);
        }
        throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory".toString());
    }

    public final LivePagedListBuilder<Key, Value> setBoundaryCallback(PagedList.BoundaryCallback<Value> boundaryCallback2) {
        this.boundaryCallback = boundaryCallback2;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setCoroutineScope(C15478k0 k0Var) {
        C13706o.m87929f(k0Var, "coroutineScope");
        this.coroutineScope = k0Var;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setFetchExecutor(Executor executor) {
        C13706o.m87929f(executor, "fetchExecutor");
        this.fetchDispatcher = C15499o1.m94574a(executor);
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setInitialLoadKey(Key key) {
        this.initialLoadKey = key;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LivePagedListBuilder(DataSource.Factory<Key, Value> factory, int i) {
        this(factory, new PagedList.Config.Builder().setPageSize(i).build());
        C13706o.m87929f(factory, "dataSourceFactory");
    }

    public LivePagedListBuilder(C16254a<? extends PagingSource<Key, Value>> aVar, PagedList.Config config2) {
        C13706o.m87929f(aVar, "pagingSourceFactory");
        C13706o.m87929f(config2, "config");
        this.coroutineScope = C15503p1.f64723a;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        C13706o.m87928e(iOThreadExecutor, "getIOThreadExecutor()");
        this.fetchDispatcher = C15499o1.m94574a(iOThreadExecutor);
        this.pagingSourceFactory = aVar;
        this.dataSourceFactory = null;
        this.config = config2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LivePagedListBuilder(C16254a<? extends PagingSource<Key, Value>> aVar, int i) {
        this(aVar, new PagedList.Config.Builder().setPageSize(i).build());
        C13706o.m87929f(aVar, "pagingSourceFactory");
    }
}
