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

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u0011\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\r\u0010\u0018\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\r\u0010\u0019¨\u0006\u001a"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/PagedList$Config;", "config", "initialLoadKey", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Ljava/util/concurrent/Executor;", "fetchExecutor", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "toLiveData", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "", "pageSize", "(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "(Lqa/a;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;)Landroidx/lifecycle/LiveData;", "(Lqa/a;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;)Landroidx/lifecycle/LiveData;", "paging-runtime_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: LivePagedList.kt */
public final class LivePagedListKt {
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor executor) {
        C13706o.m87929f(factory, "<this>");
        C13706o.m87929f(config, "config");
        C13706o.m87929f(executor, "fetchExecutor");
        return new LivePagedListBuilder(factory, config).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(executor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i & 8) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            C13706o.m87928e(executor, "getIOThreadExecutor()");
        }
        return toLiveData(factory, config, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, int i, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i2 & 8) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            C13706o.m87928e(executor, "getIOThreadExecutor()");
        }
        return toLiveData(factory, i, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(C16254a aVar, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, C15478k0 k0Var, C15415h0 h0Var, int i, Object obj2) {
        Object obj3 = (i & 2) != 0 ? null : obj;
        PagedList.BoundaryCallback boundaryCallback2 = (i & 4) != 0 ? null : boundaryCallback;
        if ((i & 8) != 0) {
            k0Var = C15503p1.f64723a;
        }
        C15478k0 k0Var2 = k0Var;
        if ((i & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            C13706o.m87928e(iOThreadExecutor, "getIOThreadExecutor()");
            h0Var = C15499o1.m94574a(iOThreadExecutor);
        }
        return toLiveData(aVar, config, obj3, boundaryCallback2, k0Var2, h0Var);
    }

    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, int i, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor executor) {
        C13706o.m87929f(factory, "<this>");
        C13706o.m87929f(executor, "fetchExecutor");
        return new LivePagedListBuilder(factory, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, (Object) null)).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(executor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(C16254a aVar, int i, Object obj, PagedList.BoundaryCallback boundaryCallback, C15478k0 k0Var, C15415h0 h0Var, int i2, Object obj2) {
        Object obj3 = (i2 & 2) != 0 ? null : obj;
        PagedList.BoundaryCallback boundaryCallback2 = (i2 & 4) != 0 ? null : boundaryCallback;
        if ((i2 & 8) != 0) {
            k0Var = C15503p1.f64723a;
        }
        C15478k0 k0Var2 = k0Var;
        if ((i2 & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            C13706o.m87928e(iOThreadExecutor, "getIOThreadExecutor()");
            h0Var = C15499o1.m94574a(iOThreadExecutor);
        }
        return toLiveData(aVar, i, obj3, boundaryCallback2, k0Var2, h0Var);
    }

    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(C16254a<? extends PagingSource<Key, Value>> aVar, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, C15478k0 k0Var, C15415h0 h0Var) {
        C13706o.m87929f(aVar, "<this>");
        C13706o.m87929f(config, "config");
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(h0Var, "fetchDispatcher");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        C13706o.m87928e(mainThreadExecutor, "getMainThreadExecutor()");
        return new LivePagedList(k0Var, key, config, boundaryCallback, aVar, C15499o1.m94574a(mainThreadExecutor), h0Var);
    }

    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(C16254a<? extends PagingSource<Key, Value>> aVar, int i, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, C15478k0 k0Var, C15415h0 h0Var) {
        C13706o.m87929f(aVar, "<this>");
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(h0Var, "fetchDispatcher");
        PagedList.Config build = new PagedList.Config.Builder().setPageSize(i).build();
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        C13706o.m87928e(mainThreadExecutor, "getMainThreadExecutor()");
        return new LivePagedList(k0Var, key, build, boundaryCallback, aVar, C15499o1.m94574a(mainThreadExecutor), h0Var);
    }
}
