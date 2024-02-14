package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagedStorage;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16269p;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 _*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001_Bi\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010Y\u001a\u00020W\u0012\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000109\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\b\u0010>\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b]\u0010^J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u000bH\u0016J\"\u0010!\u001a\u00020\u000b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0017J\b\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020%H\u0017J \u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0017J \u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0017J\u0018\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0016R#\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001098\u0000X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00018\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0016\u0010G\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010DR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J8\u0002X\u0004¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010NR\u001c\u0010R\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\f\u0012\u0004\bQ\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006`"}, mo71668d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", "V", "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/LoadType;", "type", "", "page", "Lja/u;", "triggerBoundaryCallback", "", "post", "tryDispatchBoundaryCallbacks", "begin", "end", "dispatchBoundaryCallbacks", "Landroidx/paging/PagingSource$LoadResult$Page;", "onPageResult", "Landroidx/paging/LoadState;", "state", "onStateChanged", "deferEmpty", "deferBegin", "deferEnd", "deferBoundaryCallbacks$paging_common", "(ZZZ)V", "deferBoundaryCallbacks", "retry", "Lkotlin/Function2;", "callback", "dispatchCurrentLoadState", "loadType", "loadState", "setInitialLoadState", "", "index", "loadAroundInternal", "detach", "count", "onInitialized", "leadingNulls", "changed", "added", "onPagePrepended", "endPosition", "onPageAppended", "startOfDrops", "onPagesRemoved", "onPagesSwappedToPlaceholder", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "getBoundaryCallback$paging_common", "()Landroidx/paging/PagedList$BoundaryCallback;", "initialLastKey", "Ljava/lang/Object;", "prependItemsRequested", "I", "appendItemsRequested", "boundaryCallbackBeginDeferred", "Z", "boundaryCallbackEndDeferred", "lowestIndexAccessed", "highestIndexAccessed", "replacePagesWithNulls", "shouldTrim", "Landroidx/paging/LegacyPageFetcher;", "pager", "Landroidx/paging/LegacyPageFetcher;", "getPager$annotations", "()V", "getLastKey", "()Ljava/lang/Object;", "getLastKey$annotations", "lastKey", "isDetached", "()Z", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$Config;", "config", "initialPage", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/k0;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ContiguousPagedList.kt */
public class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback, LegacyPageFetcher.PageConsumer<V> {
    public static final Companion Companion = new Companion((C13695i) null);
    private int appendItemsRequested;
    private final PagedList.BoundaryCallback<V> boundaryCallback;
    /* access modifiers changed from: private */
    public boolean boundaryCallbackBeginDeferred;
    /* access modifiers changed from: private */
    public boolean boundaryCallbackEndDeferred;
    private int highestIndexAccessed = Integer.MIN_VALUE;
    private final K initialLastKey;
    private int lowestIndexAccessed = Integer.MAX_VALUE;
    private final LegacyPageFetcher<K, V> pager;
    private final PagingSource<K, V> pagingSource;
    private int prependItemsRequested;
    private boolean replacePagesWithNulls;
    private final boolean shouldTrim;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bJ%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "()V", "getAppendItemsRequested", "", "prefetchDistance", "index", "itemsBeforeTrailingNulls", "getAppendItemsRequested$paging_common", "getPrependItemsRequested", "leadingNulls", "getPrependItemsRequested$paging_common", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: ContiguousPagedList.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final int getAppendItemsRequested$paging_common(int i, int i2, int i3) {
            return ((i2 + i) + 1) - i3;
        }

        public final int getPrependItemsRequested$paging_common(int i, int i2, int i3) {
            return i - (i2 - i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource<K, V> pagingSource2, C15478k0 k0Var, C15415h0 h0Var, C15415h0 h0Var2, PagedList.BoundaryCallback<V> boundaryCallback2, PagedList.Config config, PagingSource.LoadResult.Page<K, V> page, K k) {
        super(pagingSource2, k0Var, h0Var, new PagedStorage(), config);
        PagingSource<K, V> pagingSource3 = pagingSource2;
        PagedList.Config config2 = config;
        C13706o.m87929f(pagingSource3, "pagingSource");
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(h0Var, "notifyDispatcher");
        C13706o.m87929f(h0Var2, "backgroundDispatcher");
        C13706o.m87929f(config2, "config");
        C13706o.m87929f(page, "initialPage");
        this.pagingSource = pagingSource3;
        this.boundaryCallback = boundaryCallback2;
        this.initialLastKey = k;
        this.shouldTrim = config2.maxSize != Integer.MAX_VALUE;
        LegacyPageFetcher<K, V> legacyPageFetcher = r0;
        LegacyPageFetcher<K, V> legacyPageFetcher2 = new LegacyPageFetcher<>(k0Var, config, pagingSource2, h0Var, h0Var2, this, getStorage$paging_common());
        this.pager = legacyPageFetcher;
        if (config2.enablePlaceholders) {
            getStorage$paging_common().init(page.getItemsBefore() != Integer.MIN_VALUE ? page.getItemsBefore() : 0, page, page.getItemsAfter() != Integer.MIN_VALUE ? page.getItemsAfter() : 0, 0, this, (page.getItemsBefore() == Integer.MIN_VALUE || page.getItemsAfter() == Integer.MIN_VALUE) ? false : true);
        } else {
            getStorage$paging_common().init(0, page, 0, page.getItemsBefore() != Integer.MIN_VALUE ? page.getItemsBefore() : 0, this, false);
        }
        triggerBoundaryCallback(LoadType.REFRESH, page.getData());
    }

    /* access modifiers changed from: private */
    public final void dispatchBoundaryCallbacks(boolean z, boolean z2) {
        if (z) {
            PagedList.BoundaryCallback<V> boundaryCallback2 = this.boundaryCallback;
            C13706o.m87926c(boundaryCallback2);
            boundaryCallback2.onItemAtFrontLoaded(getStorage$paging_common().getFirstLoadedItem$paging_common());
        }
        if (z2) {
            PagedList.BoundaryCallback<V> boundaryCallback3 = this.boundaryCallback;
            C13706o.m87926c(boundaryCallback3);
            boundaryCallback3.onItemAtEndLoaded(getStorage$paging_common().getLastLoadedItem$paging_common());
        }
    }

    public static /* synthetic */ void getLastKey$annotations() {
    }

    private static /* synthetic */ void getPager$annotations() {
    }

    private final void triggerBoundaryCallback(LoadType loadType, List<? extends V> list) {
        if (this.boundaryCallback != null) {
            boolean z = true;
            boolean z2 = getStorage$paging_common().size() == 0;
            boolean z3 = !z2 && loadType == LoadType.PREPEND && list.isEmpty();
            if (z2 || loadType != LoadType.APPEND || !list.isEmpty()) {
                z = false;
            }
            deferBoundaryCallbacks$paging_common(z2, z3, z);
        }
    }

    /* access modifiers changed from: private */
    public final void tryDispatchBoundaryCallbacks(boolean z) {
        boolean z2 = true;
        boolean z3 = this.boundaryCallbackBeginDeferred && this.lowestIndexAccessed <= getConfig().prefetchDistance;
        if (!this.boundaryCallbackEndDeferred || this.highestIndexAccessed < (size() - 1) - getConfig().prefetchDistance) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.boundaryCallbackBeginDeferred = false;
            }
            if (z2) {
                this.boundaryCallbackEndDeferred = false;
            }
            if (z) {
                C15561w1 unused = C15473j.m94492d(getCoroutineScope$paging_common(), getNotifyDispatcher$paging_common(), (C15486m0) null, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z3, z2, (C13635d<? super ContiguousPagedList$tryDispatchBoundaryCallbacks$1>) null), 2, (Object) null);
            } else {
                dispatchBoundaryCallbacks(z3, z2);
            }
        }
    }

    @AnyThread
    public final void deferBoundaryCallbacks$paging_common(boolean z, boolean z2, boolean z3) {
        if (this.boundaryCallback != null) {
            if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
                this.lowestIndexAccessed = getStorage$paging_common().size();
            }
            if (this.highestIndexAccessed == Integer.MIN_VALUE) {
                this.highestIndexAccessed = 0;
            }
            if (z || z2 || z3) {
                C15561w1 unused = C15473j.m94492d(getCoroutineScope$paging_common(), getNotifyDispatcher$paging_common(), (C15486m0) null, new ContiguousPagedList$deferBoundaryCallbacks$1(z, this, z2, z3, (C13635d<? super ContiguousPagedList$deferBoundaryCallbacks$1>) null), 2, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    public void detach() {
        this.pager.detach();
    }

    public void dispatchCurrentLoadState(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "callback");
        this.pager.getLoadStateManager().dispatchCurrentLoadState(pVar);
    }

    public final PagedList.BoundaryCallback<V> getBoundaryCallback$paging_common() {
        return this.boundaryCallback;
    }

    public K getLastKey() {
        K k;
        PagingState refreshKeyInfo = getStorage$paging_common().getRefreshKeyInfo(getConfig());
        if (refreshKeyInfo == null) {
            k = null;
        } else {
            k = getPagingSource().getRefreshKey(refreshKeyInfo);
        }
        return k == null ? this.initialLastKey : k;
    }

    public final PagingSource<K, V> getPagingSource() {
        return this.pagingSource;
    }

    public boolean isDetached() {
        return this.pager.isDetached();
    }

    @MainThread
    public void loadAroundInternal(int i) {
        Companion companion = Companion;
        int prependItemsRequested$paging_common = companion.getPrependItemsRequested$paging_common(getConfig().prefetchDistance, i, getStorage$paging_common().getPlaceholdersBefore());
        int appendItemsRequested$paging_common = companion.getAppendItemsRequested$paging_common(getConfig().prefetchDistance, i, getStorage$paging_common().getPlaceholdersBefore() + getStorage$paging_common().getStorageCount());
        int max = Math.max(prependItemsRequested$paging_common, this.prependItemsRequested);
        this.prependItemsRequested = max;
        if (max > 0) {
            this.pager.trySchedulePrepend();
        }
        int max2 = Math.max(appendItemsRequested$paging_common, this.appendItemsRequested);
        this.appendItemsRequested = max2;
        if (max2 > 0) {
            this.pager.tryScheduleAppend();
        }
        this.lowestIndexAccessed = Math.min(this.lowestIndexAccessed, i);
        this.highestIndexAccessed = Math.max(this.highestIndexAccessed, i);
        tryDispatchBoundaryCallbacks(true);
    }

    @MainThread
    public void onInitialized(int i) {
        boolean z = false;
        notifyInserted$paging_common(0, i);
        if (getStorage$paging_common().getPlaceholdersBefore() > 0 || getStorage$paging_common().getPlaceholdersAfter() > 0) {
            z = true;
        }
        this.replacePagesWithNulls = z;
    }

    @MainThread
    public void onPageAppended(int i, int i2, int i3) {
        notifyChanged(i, i2);
        notifyInserted$paging_common(i + i2, i3);
    }

    @MainThread
    public void onPagePrepended(int i, int i2, int i3) {
        notifyChanged(i, i2);
        notifyInserted$paging_common(0, i3);
        this.lowestIndexAccessed += i3;
        this.highestIndexAccessed += i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPageResult(androidx.paging.LoadType r9, androidx.paging.PagingSource.LoadResult.Page<?, V> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "page"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.util.List r0 = r10.getData()
            int r1 = r8.lastLoad()
            androidx.paging.PagedStorage r2 = r8.getStorage$paging_common()
            int r2 = r2.getMiddleOfLoadedRange()
            r3 = 0
            r4 = 1
            if (r1 <= r2) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            boolean r2 = r8.shouldTrim
            if (r2 == 0) goto L_0x0040
            androidx.paging.PagedStorage r2 = r8.getStorage$paging_common()
            androidx.paging.PagedList$Config r5 = r8.getConfig()
            int r5 = r5.maxSize
            int r6 = r8.getRequiredRemainder$paging_common()
            int r7 = r0.size()
            boolean r2 = r2.shouldPreTrimNewPage(r5, r6, r7)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            androidx.paging.LoadType r5 = androidx.paging.LoadType.APPEND
            if (r9 != r5) goto L_0x0067
            if (r2 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004c
            r8.appendItemsRequested = r3
            goto L_0x008c
        L_0x004c:
            androidx.paging.PagedStorage r2 = r8.getStorage$paging_common()
            r2.appendPage$paging_common(r10, r8)
            int r10 = r8.appendItemsRequested
            int r2 = r0.size()
            int r10 = r10 - r2
            r8.appendItemsRequested = r10
            if (r10 <= 0) goto L_0x008c
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x008c
        L_0x0065:
            r3 = 1
            goto L_0x008c
        L_0x0067:
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            if (r9 != r6) goto L_0x00ff
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            r8.prependItemsRequested = r3
            goto L_0x008c
        L_0x0072:
            androidx.paging.PagedStorage r2 = r8.getStorage$paging_common()
            r2.prependPage$paging_common(r10, r8)
            int r10 = r8.prependItemsRequested
            int r2 = r0.size()
            int r10 = r10 - r2
            r8.prependItemsRequested = r10
            if (r10 <= 0) goto L_0x008c
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x008c
            goto L_0x0065
        L_0x008c:
            boolean r10 = r8.shouldTrim
            if (r10 == 0) goto L_0x00fb
            if (r1 == 0) goto L_0x00c8
            androidx.paging.LegacyPageFetcher<K, V> r10 = r8.pager
            androidx.paging.PagedList$LoadStateManager r10 = r10.getLoadStateManager()
            androidx.paging.LoadState r10 = r10.getStartState()
            boolean r10 = r10 instanceof androidx.paging.LoadState.Loading
            if (r10 != 0) goto L_0x00fb
            androidx.paging.PagedStorage r10 = r8.getStorage$paging_common()
            boolean r1 = r8.replacePagesWithNulls
            androidx.paging.PagedList$Config r2 = r8.getConfig()
            int r2 = r2.maxSize
            int r4 = r8.getRequiredRemainder$paging_common()
            boolean r10 = r10.trimFromFront$paging_common(r1, r2, r4, r8)
            if (r10 == 0) goto L_0x00fb
            androidx.paging.LegacyPageFetcher<K, V> r10 = r8.pager
            androidx.paging.PagedList$LoadStateManager r10 = r10.getLoadStateManager()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.PREPEND
            androidx.paging.LoadState$NotLoading$Companion r2 = androidx.paging.LoadState.NotLoading.Companion
            androidx.paging.LoadState$NotLoading r2 = r2.getIncomplete$paging_common()
            r10.setState(r1, r2)
            goto L_0x00fb
        L_0x00c8:
            androidx.paging.LegacyPageFetcher<K, V> r10 = r8.pager
            androidx.paging.PagedList$LoadStateManager r10 = r10.getLoadStateManager()
            androidx.paging.LoadState r10 = r10.getEndState()
            boolean r10 = r10 instanceof androidx.paging.LoadState.Loading
            if (r10 != 0) goto L_0x00fb
            androidx.paging.PagedStorage r10 = r8.getStorage$paging_common()
            boolean r1 = r8.replacePagesWithNulls
            androidx.paging.PagedList$Config r2 = r8.getConfig()
            int r2 = r2.maxSize
            int r4 = r8.getRequiredRemainder$paging_common()
            boolean r10 = r10.trimFromEnd$paging_common(r1, r2, r4, r8)
            if (r10 == 0) goto L_0x00fb
            androidx.paging.LegacyPageFetcher<K, V> r10 = r8.pager
            androidx.paging.PagedList$LoadStateManager r10 = r10.getLoadStateManager()
            androidx.paging.LoadState$NotLoading$Companion r1 = androidx.paging.LoadState.NotLoading.Companion
            androidx.paging.LoadState$NotLoading r1 = r1.getIncomplete$paging_common()
            r10.setState(r5, r1)
        L_0x00fb:
            r8.triggerBoundaryCallback(r9, r0)
            return r3
        L_0x00ff:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unexpected result type "
            java.lang.String r9 = kotlin.jvm.internal.C13706o.m87936m(r0, r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ContiguousPagedList.onPageResult(androidx.paging.LoadType, androidx.paging.PagingSource$LoadResult$Page):boolean");
    }

    public void onPagesRemoved(int i, int i2) {
        notifyRemoved(i, i2);
    }

    public void onPagesSwappedToPlaceholder(int i, int i2) {
        notifyChanged(i, i2);
    }

    public void onStateChanged(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "type");
        C13706o.m87929f(loadState, "state");
        dispatchStateChangeAsync$paging_common(loadType, loadState);
    }

    public void retry() {
        Runnable refreshRetryCallback$paging_common;
        super.retry();
        this.pager.retry();
        if ((this.pager.getLoadStateManager().getRefreshState() instanceof LoadState.Error) && (refreshRetryCallback$paging_common = getRefreshRetryCallback$paging_common()) != null) {
            refreshRetryCallback$paging_common.run();
        }
    }

    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(loadState, "loadState");
        this.pager.getLoadStateManager().setState(loadType, loadState);
    }
}
