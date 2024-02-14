package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002ABBW\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020$\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b?\u0010@J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J$\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R(\u00104\u001a\u0002038\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010=\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006C"}, mo71668d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", "V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/PagingSource$LoadParams;", "params", "Lja/u;", "scheduleLoad", "Landroidx/paging/PagingSource$LoadResult$Page;", "value", "onLoadSuccess", "", "throwable", "onLoadError", "onLoadInvalid", "schedulePrepend", "scheduleAppend", "trySchedulePrepend", "tryScheduleAppend", "retry", "detach", "Lkotlinx/coroutines/k0;", "pagedListScope", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Landroidx/paging/PagingSource;", "source", "Landroidx/paging/PagingSource;", "getSource", "()Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "keyProvider", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "detached", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getLoadStateManager$annotations", "()V", "", "isDetached", "()Z", "<init>", "(Lkotlinx/coroutines/k0;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "KeyProvider", "PageConsumer", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LegacyPageFetcher.kt */
public final class LegacyPageFetcher<K, V> {
    private final PagedList.Config config;
    private final AtomicBoolean detached = new AtomicBoolean(false);
    private final C15415h0 fetchDispatcher;
    private final KeyProvider<K> keyProvider;
    private PagedList.LoadStateManager loadStateManager = new LegacyPageFetcher$loadStateManager$1(this);
    /* access modifiers changed from: private */
    public final C15415h0 notifyDispatcher;
    private final PageConsumer<V> pageConsumer;
    private final C15478k0 pagedListScope;
    private final PagingSource<K, V> source;

    @Metadata(mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "K", "", "nextKey", "getNextKey", "()Ljava/lang/Object;", "prevKey", "getPrevKey", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LegacyPageFetcher.kt */
    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, mo71668d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "", "V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "", "onPageResult", "Landroidx/paging/LoadState;", "state", "Lja/u;", "onStateChanged", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: LegacyPageFetcher.kt */
    public interface PageConsumer<V> {
        boolean onPageResult(LoadType loadType, PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(LoadType loadType, LoadState loadState);
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LegacyPageFetcher.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LegacyPageFetcher(C15478k0 k0Var, PagedList.Config config2, PagingSource<K, V> pagingSource, C15415h0 h0Var, C15415h0 h0Var2, PageConsumer<V> pageConsumer2, KeyProvider<K> keyProvider2) {
        C13706o.m87929f(k0Var, "pagedListScope");
        C13706o.m87929f(config2, "config");
        C13706o.m87929f(pagingSource, "source");
        C13706o.m87929f(h0Var, "notifyDispatcher");
        C13706o.m87929f(h0Var2, "fetchDispatcher");
        C13706o.m87929f(pageConsumer2, "pageConsumer");
        C13706o.m87929f(keyProvider2, "keyProvider");
        this.pagedListScope = k0Var;
        this.config = config2;
        this.source = pagingSource;
        this.notifyDispatcher = h0Var;
        this.fetchDispatcher = h0Var2;
        this.pageConsumer = pageConsumer2;
        this.keyProvider = keyProvider2;
    }

    public static /* synthetic */ void getLoadStateManager$annotations() {
    }

    /* access modifiers changed from: private */
    public final void onLoadError(LoadType loadType, Throwable th) {
        if (!isDetached()) {
            this.loadStateManager.setState(loadType, new LoadState.Error(th));
        }
    }

    /* access modifiers changed from: private */
    public final void onLoadInvalid() {
        this.source.invalidate();
        detach();
    }

    /* access modifiers changed from: private */
    public final void onLoadSuccess(LoadType loadType, PagingSource.LoadResult.Page<K, V> page) {
        if (!isDetached()) {
            if (this.pageConsumer.onPageResult(loadType, page)) {
                int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
                if (i == 1) {
                    schedulePrepend();
                } else if (i == 2) {
                    scheduleAppend();
                } else {
                    throw new IllegalStateException("Can only fetch more during append/prepend");
                }
            } else {
                this.loadStateManager.setState(loadType, page.getData().isEmpty() ? LoadState.NotLoading.Companion.getComplete$paging_common() : LoadState.NotLoading.Companion.getIncomplete$paging_common());
            }
        }
    }

    private final void scheduleAppend() {
        K nextKey = this.keyProvider.getNextKey();
        if (nextKey == null) {
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager2 = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager2.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config2 = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config2.pageSize, config2.enablePlaceholders));
    }

    private final void scheduleLoad(LoadType loadType, PagingSource.LoadParams<K> loadParams) {
        C15561w1 unused = C15473j.m94492d(this.pagedListScope, this.fetchDispatcher, (C15486m0) null, new LegacyPageFetcher$scheduleLoad$1(this, loadParams, loadType, (C13635d<? super LegacyPageFetcher$scheduleLoad$1>) null), 2, (Object) null);
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager2 = this.loadStateManager;
        LoadType loadType = LoadType.PREPEND;
        loadStateManager2.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config2 = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Prepend(prevKey, config2.pageSize, config2.enablePlaceholders));
    }

    public final void detach() {
        this.detached.set(true);
    }

    public final PagedList.Config getConfig() {
        return this.config;
    }

    public final PagedList.LoadStateManager getLoadStateManager() {
        return this.loadStateManager;
    }

    public final PageConsumer<V> getPageConsumer() {
        return this.pageConsumer;
    }

    public final PagingSource<K, V> getSource() {
        return this.source;
    }

    public final boolean isDetached() {
        return this.detached.get();
    }

    public final void retry() {
        if (this.loadStateManager.getStartState() instanceof LoadState.Error) {
            schedulePrepend();
        }
        if (this.loadStateManager.getEndState() instanceof LoadState.Error) {
            scheduleAppend();
        }
    }

    public final void setLoadStateManager(PagedList.LoadStateManager loadStateManager2) {
        C13706o.m87929f(loadStateManager2, "<set-?>");
        this.loadStateManager = loadStateManager2;
    }

    public final void tryScheduleAppend() {
        LoadState endState = this.loadStateManager.getEndState();
        if ((endState instanceof LoadState.NotLoading) && !endState.getEndOfPaginationReached()) {
            scheduleAppend();
        }
    }

    public final void trySchedulePrepend() {
        LoadState startState = this.loadStateManager.getStartState();
        if ((startState instanceof LoadState.NotLoading) && !startState.getEndOfPaginationReached()) {
            schedulePrepend();
        }
    }
}
