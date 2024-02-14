package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.paging.LoadState;
import androidx.paging.PagingSource;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15499o1;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b'\u0018\u0000 l*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006mnolpqBA\b\u0000\u0012\u0010\u00101\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u000000\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010;\u001a\u00020:\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bj\u0010kJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\r\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bH'J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H'J\b\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0017J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 J \u0010#\u001a\u00020\u000b2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010$\u001a\u00020\u000b2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010'\u001a\u00020\u000b2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 2\u0006\u0010\f\u001a\u00020&H\u0007J\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020&J\u000e\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020&J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0007J\u0018\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0007R$\u00101\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000008\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?8\u0000X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0S0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR2\u0010V\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0S0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010X\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010QR$\u0010^\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000Y8FX\u0004¢\u0006\f\u0012\u0004\b\\\u0010]\u001a\u0004\bZ\u0010[R\u0016\u0010a\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010QR\u0014\u0010g\u001a\u00020b8VX\u0004¢\u0006\u0006\u001a\u0004\bg\u0010dR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010Q¨\u0006r"}, mo71668d2 = {"Landroidx/paging/PagedList;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/NullPaddedList;", "getNullPaddedList", "", "lastLoad", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "Lja/u;", "callback", "dispatchCurrentLoadState", "index", "loadAroundInternal", "detach", "loadType", "loadState", "setInitialLoadState", "retry", "Ljava/lang/Runnable;", "refreshRetryCallback", "setRetryCallback", "type", "state", "dispatchStateChangeAsync$paging_common", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "dispatchStateChangeAsync", "get", "(I)Ljava/lang/Object;", "loadAround", "", "snapshot", "listener", "addWeakLoadStateListener", "removeWeakLoadStateListener", "previousSnapshot", "Landroidx/paging/PagedList$Callback;", "addWeakCallback", "removeWeakCallback", "position", "count", "notifyInserted$paging_common", "(II)V", "notifyInserted", "notifyChanged", "notifyRemoved", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/k0;", "getCoroutineScope$paging_common", "()Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "Lkotlinx/coroutines/h0;", "getNotifyDispatcher$paging_common", "()Lkotlinx/coroutines/h0;", "Landroidx/paging/PagedStorage;", "storage", "Landroidx/paging/PagedStorage;", "getStorage$paging_common", "()Landroidx/paging/PagedStorage;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common", "(Ljava/lang/Runnable;)V", "requiredRemainder", "I", "getRequiredRemainder$paging_common", "()I", "", "Ljava/lang/ref/WeakReference;", "callbacks", "Ljava/util/List;", "loadStateListeners", "getSize", "size", "Landroidx/paging/DataSource;", "getDataSource", "()Landroidx/paging/DataSource;", "getDataSource$annotations", "()V", "dataSource", "getLastKey", "()Ljava/lang/Object;", "lastKey", "", "isDetached", "()Z", "getLoadedCount", "loadedCount", "isImmutable", "getPositionOffset", "positionOffset", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V", "Companion", "BoundaryCallback", "Builder", "Callback", "Config", "LoadStateManager", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagedList.kt */
public abstract class PagedList<T> extends AbstractList<T> {
    public static final Companion Companion = new Companion((C13695i) null);
    private final List<WeakReference<Callback>> callbacks = new ArrayList();
    private final Config config;
    private final C15478k0 coroutineScope;
    /* access modifiers changed from: private */
    public final List<WeakReference<C16269p<LoadType, LoadState, C13339u>>> loadStateListeners = new ArrayList();
    private final C15415h0 notifyDispatcher;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final PagingSource<?, T> pagingSource;
    private Runnable refreshRetryCallback;
    private final int requiredRemainder;
    private final PagedStorage<T> storage;

    @MainThread
    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "", "T", "Lja/u;", "onZeroItemsLoaded", "itemAtFront", "onItemAtFrontLoaded", "(Ljava/lang/Object;)V", "itemAtEnd", "onItemAtEndLoaded", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedList.kt */
    public static abstract class BoundaryCallback<T> {
        public void onItemAtEndLoaded(T t) {
            C13706o.m87929f(t, "itemAtEnd");
        }

        public void onItemAtFrontLoaded(T t) {
            C13706o.m87929f(t, "itemAtFront");
        }

        public void onZeroItemsLoaded() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u000b"}, mo71668d2 = {"Landroidx/paging/PagedList$Callback;", "", "", "position", "count", "Lja/u;", "onChanged", "onInserted", "onRemoved", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedList.kt */
    public static abstract class Callback {
        public abstract void onChanged(int i, int i2);

        public abstract void onInserted(int i, int i2);

        public abstract void onRemoved(int i, int i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo71668d2 = {"Landroidx/paging/PagedList$Companion;", "", "K", "T", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "key", "Landroidx/paging/PagedList;", "create", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;", "", "currentSize", "snapshotSize", "Landroidx/paging/PagedList$Callback;", "callback", "Lja/u;", "dispatchNaiveUpdatesSinceSnapshot$paging_common", "(IILandroidx/paging/PagedList$Callback;)V", "dispatchNaiveUpdatesSinceSnapshot", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedList.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <K, T> PagedList<T> create(PagingSource<K, T> pagingSource, PagingSource.LoadResult.Page<K, T> page, C15478k0 k0Var, C15415h0 h0Var, C15415h0 h0Var2, BoundaryCallback<T> boundaryCallback, Config config, K k) {
            PagingSource.LoadResult.Page<K, T> page2;
            PagingSource<K, T> pagingSource2 = pagingSource;
            Config config2 = config;
            C13706o.m87929f(pagingSource, "pagingSource");
            C15478k0 k0Var2 = k0Var;
            C13706o.m87929f(k0Var, "coroutineScope");
            C15415h0 h0Var3 = h0Var;
            C13706o.m87929f(h0Var, "notifyDispatcher");
            C15415h0 h0Var4 = h0Var2;
            C13706o.m87929f(h0Var2, "fetchDispatcher");
            C13706o.m87929f(config2, "config");
            if (page == null) {
                page2 = (PagingSource.LoadResult.Page) C15424i.m94328b((C13640g) null, new PagedList$Companion$create$resolvedInitialPage$1(pagingSource, new PagingSource.LoadParams.Refresh(k, config2.initialLoadSizeHint, config2.enablePlaceholders), (C13635d<? super PagedList$Companion$create$resolvedInitialPage$1>) null), 1, (Object) null);
            } else {
                K k2 = k;
                page2 = page;
            }
            return new ContiguousPagedList(pagingSource, k0Var, h0Var, h0Var2, boundaryCallback, config, page2, k);
        }

        public final void dispatchNaiveUpdatesSinceSnapshot$paging_common(int i, int i2, Callback callback) {
            C13706o.m87929f(callback, "callback");
            if (i2 < i) {
                if (i2 > 0) {
                    callback.onChanged(0, i2);
                }
                int i3 = i - i2;
                if (i3 > 0) {
                    callback.onInserted(i2, i3);
                    return;
                }
                return;
            }
            if (i > 0) {
                callback.onChanged(0, i);
            }
            int i4 = i2 - i;
            if (i4 != 0) {
                callback.onRemoved(i, i4);
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/PagedList$Config;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "(IIZII)V", "Builder", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PagedList.kt */
    public static final class Config {
        public static final Companion Companion = new Companion((C13695i) null);
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int maxSize;
        public final int pageSize;
        public final int prefetchDistance;

        @Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo71668d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "()V", "enablePlaceholders", "", "initialLoadSizeHint", "", "maxSize", "pageSize", "prefetchDistance", "build", "Landroidx/paging/PagedList$Config;", "setEnablePlaceholders", "setInitialLoadSizeHint", "setMaxSize", "setPageSize", "setPrefetchDistance", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: PagedList.kt */
        public static final class Builder {
            public static final Companion Companion = new Companion((C13695i) null);
            public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            private boolean enablePlaceholders = true;
            private int initialLoadSizeHint = -1;
            private int maxSize = Integer.MAX_VALUE;
            private int pageSize = -1;
            private int prefetchDistance = -1;

            @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo71668d2 = {"Landroidx/paging/PagedList$Config$Builder$Companion;", "", "()V", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
            /* compiled from: PagedList.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(C13695i iVar) {
                    this();
                }
            }

            public final Config build() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (this.enablePlaceholders || this.prefetchDistance != 0) {
                    int i = this.maxSize;
                    if (i == Integer.MAX_VALUE || i >= this.pageSize + (this.prefetchDistance * 2)) {
                        return new Config(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
                    }
                    throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }

            public final Builder setEnablePlaceholders(boolean z) {
                this.enablePlaceholders = z;
                return this;
            }

            public final Builder setInitialLoadSizeHint(@IntRange(from = 1) int i) {
                this.initialLoadSizeHint = i;
                return this;
            }

            public final Builder setMaxSize(@IntRange(from = 2) int i) {
                this.maxSize = i;
                return this;
            }

            public final Builder setPageSize(@IntRange(from = 1) int i) {
                if (i >= 1) {
                    this.pageSize = i;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            public final Builder setPrefetchDistance(@IntRange(from = 0) int i) {
                this.prefetchDistance = i;
                return this;
            }
        }

        @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "()V", "MAX_SIZE_UNBOUNDED", "", "getMAX_SIZE_UNBOUNDED$annotations", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: PagedList.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C13695i iVar) {
                this();
            }

            public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
            }
        }

        public Config(int i, int i2, boolean z, int i3, int i4) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
            this.maxSize = i4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J \u0010\u000b\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001a"}, mo71668d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "Lja/u;", "setState", "onStateChanged", "Lkotlin/Function2;", "callback", "dispatchCurrentLoadState", "refreshState", "Landroidx/paging/LoadState;", "getRefreshState", "()Landroidx/paging/LoadState;", "setRefreshState", "(Landroidx/paging/LoadState;)V", "startState", "getStartState", "setStartState", "endState", "getEndState", "setEndState", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedList.kt */
    public static abstract class LoadStateManager {
        private LoadState endState;
        private LoadState refreshState;
        private LoadState startState;

        @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: PagedList.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                iArr[LoadType.REFRESH.ordinal()] = 1;
                iArr[LoadType.PREPEND.ordinal()] = 2;
                iArr[LoadType.APPEND.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public LoadStateManager() {
            LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
            this.refreshState = companion.getIncomplete$paging_common();
            this.startState = companion.getIncomplete$paging_common();
            this.endState = companion.getIncomplete$paging_common();
        }

        public final void dispatchCurrentLoadState(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
            C13706o.m87929f(pVar, "callback");
            pVar.invoke(LoadType.REFRESH, this.refreshState);
            pVar.invoke(LoadType.PREPEND, this.startState);
            pVar.invoke(LoadType.APPEND, this.endState);
        }

        public final LoadState getEndState() {
            return this.endState;
        }

        public final LoadState getRefreshState() {
            return this.refreshState;
        }

        public final LoadState getStartState() {
            return this.startState;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract void onStateChanged(LoadType loadType, LoadState loadState);

        public final void setEndState(LoadState loadState) {
            C13706o.m87929f(loadState, "<set-?>");
            this.endState = loadState;
        }

        public final void setRefreshState(LoadState loadState) {
            C13706o.m87929f(loadState, "<set-?>");
            this.refreshState = loadState;
        }

        public final void setStartState(LoadState loadState) {
            C13706o.m87929f(loadState, "<set-?>");
            this.startState = loadState;
        }

        public final void setState(LoadType loadType, LoadState loadState) {
            C13706o.m87929f(loadType, "type");
            C13706o.m87929f(loadState, "state");
            int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!C13706o.m87924a(this.endState, loadState)) {
                            this.endState = loadState;
                        } else {
                            return;
                        }
                    }
                } else if (!C13706o.m87924a(this.startState, loadState)) {
                    this.startState = loadState;
                } else {
                    return;
                }
            } else if (!C13706o.m87924a(this.refreshState, loadState)) {
                this.refreshState = loadState;
            } else {
                return;
            }
            onStateChanged(loadType, loadState);
        }
    }

    public PagedList(PagingSource<?, T> pagingSource2, C15478k0 k0Var, C15415h0 h0Var, PagedStorage<T> pagedStorage, Config config2) {
        C13706o.m87929f(pagingSource2, "pagingSource");
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(h0Var, "notifyDispatcher");
        C13706o.m87929f(pagedStorage, "storage");
        C13706o.m87929f(config2, "config");
        this.pagingSource = pagingSource2;
        this.coroutineScope = k0Var;
        this.notifyDispatcher = h0Var;
        this.storage = pagedStorage;
        this.config = config2;
        this.requiredRemainder = (config2.prefetchDistance * 2) + config2.pageSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <K, T> PagedList<T> create(PagingSource<K, T> pagingSource2, PagingSource.LoadResult.Page<K, T> page, C15478k0 k0Var, C15415h0 h0Var, C15415h0 h0Var2, BoundaryCallback<T> boundaryCallback, Config config2, K k) {
        return Companion.create(pagingSource2, page, k0Var, h0Var, h0Var2, boundaryCallback, config2, k);
    }

    public static /* synthetic */ void getDataSource$annotations() {
    }

    public final void addWeakCallback(List<? extends T> list, Callback callback) {
        C13706o.m87929f(callback, "callback");
        if (!(list == null || list == this)) {
            Companion.dispatchNaiveUpdatesSinceSnapshot$paging_common(size(), list.size(), callback);
        }
        addWeakCallback(callback);
    }

    public final void addWeakLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        boolean unused = C13624y.m87795D(this.loadStateListeners, PagedList$addWeakLoadStateListener$1.INSTANCE);
        this.loadStateListeners.add(new WeakReference(pVar));
        dispatchCurrentLoadState(pVar);
    }

    public abstract void detach();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void dispatchCurrentLoadState(C16269p<? super LoadType, ? super LoadState, C13339u> pVar);

    public final void dispatchStateChangeAsync$paging_common(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "type");
        C13706o.m87929f(loadState, "state");
        C15561w1 unused = C15473j.m94492d(this.coroutineScope, this.notifyDispatcher, (C15486m0) null, new PagedList$dispatchStateChangeAsync$1(this, loadType, loadState, (C13635d<? super PagedList$dispatchStateChangeAsync$1>) null), 2, (Object) null);
    }

    public T get(int i) {
        return this.storage.get(i);
    }

    public final Config getConfig() {
        return this.config;
    }

    public final C15478k0 getCoroutineScope$paging_common() {
        return this.coroutineScope;
    }

    public final DataSource<?, T> getDataSource() {
        PagingSource pagingSource2 = getPagingSource();
        if (pagingSource2 instanceof LegacyPagingSource) {
            return ((LegacyPagingSource) pagingSource2).getDataSource$paging_common();
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + pagingSource2.getClass().getSimpleName() + " instead of a DataSource");
    }

    public abstract Object getLastKey();

    public final int getLoadedCount() {
        return this.storage.getStorageCount();
    }

    public final C15415h0 getNotifyDispatcher$paging_common() {
        return this.notifyDispatcher;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NullPaddedList<T> getNullPaddedList() {
        return this.storage;
    }

    public PagingSource<?, T> getPagingSource() {
        return this.pagingSource;
    }

    public final int getPositionOffset() {
        return this.storage.getPositionOffset();
    }

    public final Runnable getRefreshRetryCallback$paging_common() {
        return this.refreshRetryCallback;
    }

    public final int getRequiredRemainder$paging_common() {
        return this.requiredRemainder;
    }

    public int getSize() {
        return this.storage.size();
    }

    public final PagedStorage<T> getStorage$paging_common() {
        return this.storage;
    }

    public abstract boolean isDetached();

    public boolean isImmutable() {
        return isDetached();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int lastLoad() {
        return this.storage.getLastLoadAroundIndex();
    }

    public final void loadAround(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        }
        this.storage.setLastLoadAroundIndex(i);
        loadAroundInternal(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void loadAroundInternal(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyChanged(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C13566b0.m87444s0(this.callbacks)) {
                Callback callback = (Callback) weakReference.get();
                if (callback != null) {
                    callback.onChanged(i, i2);
                }
            }
        }
    }

    public final void notifyInserted$paging_common(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C13566b0.m87444s0(this.callbacks)) {
                Callback callback = (Callback) weakReference.get();
                if (callback != null) {
                    callback.onInserted(i, i2);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyRemoved(int i, int i2) {
        if (i2 != 0) {
            for (WeakReference weakReference : C13566b0.m87444s0(this.callbacks)) {
                Callback callback = (Callback) weakReference.get();
                if (callback != null) {
                    callback.onRemoved(i, i2);
                }
            }
        }
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void removeWeakCallback(Callback callback) {
        C13706o.m87929f(callback, "callback");
        boolean unused = C13624y.m87795D(this.callbacks, new PagedList$removeWeakCallback$1(callback));
    }

    public final void removeWeakLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        boolean unused = C13624y.m87795D(this.loadStateListeners, new PagedList$removeWeakLoadStateListener$1(pVar));
    }

    public void retry() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(loadState, "loadState");
    }

    public final void setRefreshRetryCallback$paging_common(Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setRetryCallback(Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final List<T> snapshot() {
        if (isImmutable()) {
            return this;
        }
        return new SnapshotPagedList(this);
    }

    public final void addWeakCallback(Callback callback) {
        C13706o.m87929f(callback, "callback");
        boolean unused = C13624y.m87795D(this.callbacks, PagedList$addWeakCallback$1.INSTANCE);
        this.callbacks.add(new WeakReference(callback));
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0016\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010,B%\b\u0016\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/B9\b\u0016\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u00100B9\b\u0016\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u00101J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0011J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0005\u0010%\u0012\u0004\b&\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u00062"}, mo71668d2 = {"Landroidx/paging/PagedList$Builder;", "", "Key", "Value", "Lkotlinx/coroutines/k0;", "coroutineScope", "setCoroutineScope", "Ljava/util/concurrent/Executor;", "notifyExecutor", "setNotifyExecutor", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "setNotifyDispatcher", "fetchExecutor", "setFetchExecutor", "fetchDispatcher", "setFetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "initialKey", "setInitialKey", "(Ljava/lang/Object;)Landroidx/paging/PagedList$Builder;", "Landroidx/paging/PagedList;", "build", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource;", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/DataSource;", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "Landroidx/paging/PagingSource$LoadResult$Page;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$Config;", "Lkotlinx/coroutines/k0;", "getCoroutineScope$annotations", "()V", "Lkotlinx/coroutines/h0;", "Landroidx/paging/PagedList$BoundaryCallback;", "Ljava/lang/Object;", "<init>", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource;I)V", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;I)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedList.kt */
    public static final class Builder<Key, Value> {
        private BoundaryCallback<Value> boundaryCallback;
        private final Config config;
        private C15478k0 coroutineScope;
        private DataSource<Key, Value> dataSource;
        private C15415h0 fetchDispatcher;
        private Key initialKey;
        private final PagingSource.LoadResult.Page<Key, Value> initialPage;
        private C15415h0 notifyDispatcher;
        private final PagingSource<Key, Value> pagingSource;

        public Builder(DataSource<Key, Value> dataSource2, Config config2) {
            C13706o.m87929f(dataSource2, "dataSource");
            C13706o.m87929f(config2, "config");
            this.coroutineScope = C15503p1.f64723a;
            this.pagingSource = null;
            this.dataSource = dataSource2;
            this.initialPage = null;
            this.config = config2;
        }

        private static /* synthetic */ void getCoroutineScope$annotations() {
        }

        public final PagedList<Value> build() {
            C15415h0 h0Var = this.fetchDispatcher;
            if (h0Var == null) {
                h0Var = C15186a1.m93730b();
            }
            C15415h0 h0Var2 = h0Var;
            PagingSource<Key, Value> pagingSource2 = this.pagingSource;
            if (pagingSource2 == null) {
                DataSource<Key, Value> dataSource2 = this.dataSource;
                pagingSource2 = dataSource2 == null ? null : new LegacyPagingSource<>(h0Var2, dataSource2);
            }
            PagingSource<Key, Value> pagingSource3 = pagingSource2;
            if (pagingSource3 instanceof LegacyPagingSource) {
                ((LegacyPagingSource) pagingSource3).setPageSize(this.config.pageSize);
            }
            if (pagingSource3 != null) {
                Companion companion = PagedList.Companion;
                PagingSource.LoadResult.Page<Key, Value> page = this.initialPage;
                C15478k0 k0Var = this.coroutineScope;
                C15415h0 h0Var3 = this.notifyDispatcher;
                if (h0Var3 == null) {
                    h0Var3 = C15186a1.m93731c().mo74507o();
                }
                return companion.create(pagingSource3, page, k0Var, h0Var3, h0Var2, this.boundaryCallback, this.config, this.initialKey);
            }
            throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource".toString());
        }

        public final Builder<Key, Value> setBoundaryCallback(BoundaryCallback<Value> boundaryCallback2) {
            this.boundaryCallback = boundaryCallback2;
            return this;
        }

        public final Builder<Key, Value> setCoroutineScope(C15478k0 k0Var) {
            C13706o.m87929f(k0Var, "coroutineScope");
            this.coroutineScope = k0Var;
            return this;
        }

        public final Builder<Key, Value> setFetchDispatcher(C15415h0 h0Var) {
            C13706o.m87929f(h0Var, "fetchDispatcher");
            this.fetchDispatcher = h0Var;
            return this;
        }

        public final Builder<Key, Value> setFetchExecutor(Executor executor) {
            C13706o.m87929f(executor, "fetchExecutor");
            this.fetchDispatcher = C15499o1.m94574a(executor);
            return this;
        }

        public final Builder<Key, Value> setInitialKey(Key key) {
            this.initialKey = key;
            return this;
        }

        public final Builder<Key, Value> setNotifyDispatcher(C15415h0 h0Var) {
            C13706o.m87929f(h0Var, "notifyDispatcher");
            this.notifyDispatcher = h0Var;
            return this;
        }

        public final Builder<Key, Value> setNotifyExecutor(Executor executor) {
            C13706o.m87929f(executor, "notifyExecutor");
            this.notifyDispatcher = C15499o1.m94574a(executor);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(DataSource<Key, Value> dataSource2, int i) {
            this(dataSource2, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, (Object) null));
            C13706o.m87929f(dataSource2, "dataSource");
        }

        public Builder(PagingSource<Key, Value> pagingSource2, PagingSource.LoadResult.Page<Key, Value> page, Config config2) {
            C13706o.m87929f(pagingSource2, "pagingSource");
            C13706o.m87929f(page, "initialPage");
            C13706o.m87929f(config2, "config");
            this.coroutineScope = C15503p1.f64723a;
            this.pagingSource = pagingSource2;
            this.dataSource = null;
            this.initialPage = page;
            this.config = config2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(PagingSource<Key, Value> pagingSource2, PagingSource.LoadResult.Page<Key, Value> page, int i) {
            this(pagingSource2, page, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, (Object) null));
            C13706o.m87929f(pagingSource2, "pagingSource");
            C13706o.m87929f(page, "initialPage");
        }
    }
}
