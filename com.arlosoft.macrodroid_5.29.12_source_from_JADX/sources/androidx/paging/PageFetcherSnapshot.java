package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15221f;
import kotlinx.coroutines.channels.C15225i;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0001\u0012\b\u0010+\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u00105\u001a\u000204\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010<\u0012\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010)\u0012\u000e\b\u0002\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0V¢\u0006\u0004\bX\u0010YJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002J%\u0010\u000f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010 \u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J9\u0010$\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\bH\u0002J\u000e\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010(\u001a\u00020\bJ\u001f\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)H@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0016R\u001c\u0010+\u001a\u0004\u0018\u00018\u00008\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/8\u0000X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R%\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010)8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010J0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR#\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010J0\r8\u0006¢\u0006\f\n\u0004\bS\u00108\u001a\u0004\bT\u0010U\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, mo71668d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/ViewportHint;", "viewportHint", "Lja/u;", "retryLoadError", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k0;", "startConsumingHints", "Lkotlinx/coroutines/flow/f;", "", "collectAsGenerationalViewportHints", "(Lkotlinx/coroutines/flow/f;Landroidx/paging/LoadType;Lkotlin/coroutines/d;)Ljava/lang/Object;", "key", "Landroidx/paging/PagingSource$LoadParams;", "loadParams", "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "doInitialLoad", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/GenerationalViewportHint;", "generationalHint", "doLoad", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PageFetcherSnapshotState;", "setLoading", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/LoadState$Error;", "error", "setError", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/d;)Ljava/lang/Object;", "generationId", "presentedItemsBeyondAnchor", "nextLoadKeyOrNull", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "onInvalidLoad", "accessHint", "close", "Landroidx/paging/PagingState;", "currentPagingState", "initialKey", "Ljava/lang/Object;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource;", "getPagingSource$paging_common", "()Landroidx/paging/PagingSource;", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/PagingConfig;", "retryFlow", "Lkotlinx/coroutines/flow/f;", "", "triggerRemoteRefresh", "Z", "Landroidx/paging/RemoteMediatorConnection;", "remoteMediatorConnection", "Landroidx/paging/RemoteMediatorConnection;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "previousPagingState", "Landroidx/paging/PagingState;", "Landroidx/paging/HintHandler;", "hintHandler", "Landroidx/paging/HintHandler;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/channels/f;", "Landroidx/paging/PageEvent;", "pageEventCh", "Lkotlinx/coroutines/channels/f;", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "stateHolder", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "Lkotlinx/coroutines/z;", "pageEventChannelFlowJob", "Lkotlinx/coroutines/z;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/f;", "Lkotlin/Function0;", "invalidate", "<init>", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/f;ZLandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lqa/a;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot<Key, Value> {
    /* access modifiers changed from: private */
    public final PagingConfig config;
    /* access modifiers changed from: private */
    public final HintHandler hintHandler;
    private final Key initialKey;
    /* access modifiers changed from: private */
    public final C16254a<C13339u> invalidate;
    /* access modifiers changed from: private */
    public final C15221f<PageEvent<Value>> pageEventCh;
    /* access modifiers changed from: private */
    public final AtomicBoolean pageEventChCollected;
    private final C15573z pageEventChannelFlowJob;
    private final C15285f<PageEvent<Value>> pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    /* access modifiers changed from: private */
    public final PagingState<Key, Value> previousPagingState;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    /* access modifiers changed from: private */
    public final C15285f<C13339u> retryFlow;
    /* access modifiers changed from: private */
    public final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;
    /* access modifiers changed from: private */
    public final boolean triggerRemoteRefresh;

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageFetcherSnapshot.kt */
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

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource2, PagingConfig pagingConfig, C15285f<C13339u> fVar, boolean z, RemoteMediatorConnection<Key, Value> remoteMediatorConnection2, PagingState<Key, Value> pagingState, C16254a<C13339u> aVar) {
        C13706o.m87929f(pagingSource2, "pagingSource");
        C13706o.m87929f(pagingConfig, "config");
        C13706o.m87929f(fVar, "retryFlow");
        C13706o.m87929f(aVar, "invalidate");
        this.initialKey = key;
        this.pagingSource = pagingSource2;
        this.config = pagingConfig;
        this.retryFlow = fVar;
        this.triggerRemoteRefresh = z;
        this.remoteMediatorConnection = remoteMediatorConnection2;
        this.previousPagingState = pagingState;
        this.invalidate = aVar;
        if (pagingConfig.jumpThreshold == Integer.MIN_VALUE || pagingSource2.getJumpingSupported()) {
            this.hintHandler = new HintHandler();
            this.pageEventChCollected = new AtomicBoolean(false);
            this.pageEventCh = C15225i.m93852d(-2, (C15220e) null, (C16265l) null, 6, (Object) null);
            this.stateHolder = new PageFetcherSnapshotState.Holder<>(pagingConfig);
            C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
            this.pageEventChannelFlowJob = b;
            this.pageEventFlow = C15290h.m94139y(CancelableChannelFlowKt.cancelableChannelFlow(b, new PageFetcherSnapshot$pageEventFlow$1(this, (C13635d<? super PageFetcherSnapshot$pageEventFlow$1>) null)), new PageFetcherSnapshot$pageEventFlow$2(this, (C13635d<? super PageFetcherSnapshot$pageEventFlow$2>) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    /* access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(C15285f<Integer> fVar, LoadType loadType, C13635d<? super C13339u> dVar) {
        Object collect = C15290h.m94123i(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(fVar, new C0907xe29ec4fd((C13635d) null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, (C13635d<? super PageFetcherSnapshot$collectAsGenerationalViewportHints$3>) null))).collect(new C0906x2618a1af(this, loadType), dVar);
        if (collect == C13652d.m87832c()) {
            return collect;
        }
        return C13339u.f61331a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r4);
        r4 = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) r5).getThrowable());
        r5 = androidx.paging.LoadType.REFRESH;
        r0.L$0 = r13;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027a, code lost:
        if (r6.setError(r2, r5, r4, r0) != r1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x027c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027d, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0280, code lost:
        r0.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0283, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0285, code lost:
        r11 = r0;
        r0 = r13;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0288, code lost:
        r0.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028e, code lost:
        if ((r5 instanceof androidx.paging.PagingSource.LoadResult.Invalid) == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0290, code lost:
        r6.onInvalidLoad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0295, code lost:
        return p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r4);
        r4 = androidx.paging.LoadType.REFRESH;
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r5.setLoading(r13, r4, r0) != r1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        r2.mo74907b((java.lang.Object) null);
        r13 = r4.loadParams(androidx.paging.LoadType.REFRESH, r4.getInitialKey$paging_common());
        r2 = r4.getPagingSource$paging_common();
        r0.L$0 = r4;
        r0.L$1 = null;
        r0.label = 3;
        r13 = r2.load(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        if (r13 != r1) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        r5 = (androidx.paging.PagingSource.LoadResult) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0123, code lost:
        if ((r5 instanceof androidx.paging.PagingSource.LoadResult.Page) == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        r4 = r6.stateHolder;
        r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r4);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r2;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        if (r2.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r4);
        r7 = androidx.paging.LoadType.REFRESH;
        r4 = r13.insert(0, r7, (androidx.paging.PagingSource.LoadResult.Page) r5);
        r8 = r13.getSourceLoadStates$paging_common();
        r9 = androidx.paging.LoadState.NotLoading.Companion;
        r8.set(r7, r9.getIncomplete$paging_common());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015f, code lost:
        if (((androidx.paging.PagingSource.LoadResult.Page) r5).getPrevKey() != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0161, code lost:
        r13.getSourceLoadStates$paging_common().set(androidx.paging.LoadType.PREPEND, r9.getComplete$paging_common());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0175, code lost:
        if (((androidx.paging.PagingSource.LoadResult.Page) r5).getNextKey() != null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0177, code lost:
        r13.getSourceLoadStates$paging_common().set(androidx.paging.LoadType.APPEND, r9.getComplete$paging_common());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0187, code lost:
        if (r4 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0189, code lost:
        r4 = r6.stateHolder;
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r4);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r13;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019e, code lost:
        if (r13.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a1, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r4);
        r4 = r6.pageEventCh;
        r13 = r13.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) r5, androidx.paging.LoadType.REFRESH);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r2;
        r0.L$3 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c0, code lost:
        if (r4.send(r13, r0) != r1) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c3, code lost:
        r4 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c5, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c7, code lost:
        r2.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01cf, code lost:
        r4 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d5, code lost:
        if (r5.getRemoteMediatorConnection() == null) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d7, code lost:
        r13 = (androidx.paging.PagingSource.LoadResult.Page) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01de, code lost:
        if (r13.getPrevKey() == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        if (r13.getNextKey() != null) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        r2 = r5.stateHolder;
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r2);
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r2;
        r0.L$3 = r13;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fb, code lost:
        if (r13.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fe, code lost:
        r1 = r13;
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r2).currentPagingState$paging_common(r0.hintHandler.getLastAccessHint());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020e, code lost:
        r1.mo74907b((java.lang.Object) null);
        r4 = (androidx.paging.PagingSource.LoadResult.Page) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0217, code lost:
        if (r4.getPrevKey() != null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        r0.getRemoteMediatorConnection().requestLoad(androidx.paging.LoadType.PREPEND, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0226, code lost:
        if (r4.getNextKey() != null) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0228, code lost:
        r0.getRemoteMediatorConnection().requestLoad(androidx.paging.LoadType.APPEND, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0232, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0233, code lost:
        r1.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0236, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0237, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0238, code lost:
        r2.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023b, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        if ((r5 instanceof androidx.paging.PagingSource.LoadResult.Error) == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0240, code lost:
        r4 = r6.stateHolder;
        r13 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r4);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r13;
        r0.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0256, code lost:
        if (r13.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0258, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInitialLoad(kotlin.coroutines.C13635d<? super p297ja.C13339u> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = (androidx.paging.PageFetcherSnapshot$doInitialLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = new androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a1;
                case 4: goto L_0x008c;
                case 5: goto L_0x0077;
                case 6: goto L_0x0063;
                case 7: goto L_0x004e;
                case 8: goto L_0x0038;
                case 9: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002c:
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x0035 }
            goto L_0x027e
        L_0x0035:
            r13 = move-exception
            goto L_0x0288
        L_0x0038:
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            java.lang.Object r5 = r0.L$1
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            p297ja.C13332o.m85685b(r13)
            r13 = r2
            goto L_0x0259
        L_0x004e:
            java.lang.Object r1 = r0.L$3
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.C15536b) r1
            java.lang.Object r2 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r4 = r0.L$1
            androidx.paging.PagingSource$LoadResult r4 = (androidx.paging.PagingSource.LoadResult) r4
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            p297ja.C13332o.m85685b(r13)
            goto L_0x0200
        L_0x0063:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$1
            androidx.paging.PagingSource$LoadResult r4 = (androidx.paging.PagingSource.LoadResult) r4
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x0074 }
            goto L_0x01c5
        L_0x0074:
            r13 = move-exception
            goto L_0x01cb
        L_0x0077:
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            java.lang.Object r5 = r0.L$1
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            p297ja.C13332o.m85685b(r13)
            goto L_0x01a2
        L_0x008c:
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            java.lang.Object r5 = r0.L$1
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            p297ja.C13332o.m85685b(r13)
            goto L_0x013d
        L_0x00a1:
            java.lang.Object r2 = r0.L$0
            androidx.paging.PageFetcherSnapshot r2 = (androidx.paging.PageFetcherSnapshot) r2
            p297ja.C13332o.m85685b(r13)
            r6 = r2
            goto L_0x011e
        L_0x00ab:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$0
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x00b7 }
            goto L_0x00fc
        L_0x00b7:
            r13 = move-exception
            goto L_0x0296
        L_0x00ba:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C15536b) r2
            java.lang.Object r4 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            p297ja.C13332o.m85685b(r13)
            goto L_0x00e5
        L_0x00ca:
            p297ja.C13332o.m85685b(r13)
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r4 = r12.stateHolder
            kotlinx.coroutines.sync.b r13 = r4.lock
            r0.L$0 = r12
            r0.L$1 = r4
            r0.L$2 = r13
            r2 = 1
            r0.label = r2
            java.lang.Object r2 = r13.mo74906a(r3, r0)
            if (r2 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r5 = r12
            r2 = r13
        L_0x00e5:
            androidx.paging.PageFetcherSnapshotState r13 = r4.state     // Catch:{ all -> 0x00b7 }
            androidx.paging.LoadType r4 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x00b7 }
            r0.L$0 = r5     // Catch:{ all -> 0x00b7 }
            r0.L$1 = r2     // Catch:{ all -> 0x00b7 }
            r0.L$2 = r3     // Catch:{ all -> 0x00b7 }
            r6 = 2
            r0.label = r6     // Catch:{ all -> 0x00b7 }
            java.lang.Object r13 = r5.setLoading(r13, r4, r0)     // Catch:{ all -> 0x00b7 }
            if (r13 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r4 = r5
        L_0x00fc:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00b7 }
            r2.mo74907b(r3)
            androidx.paging.LoadType r13 = androidx.paging.LoadType.REFRESH
            java.lang.Object r2 = r4.getInitialKey$paging_common()
            androidx.paging.PagingSource$LoadParams r13 = r4.loadParams(r13, r2)
            androidx.paging.PagingSource r2 = r4.getPagingSource$paging_common()
            r0.L$0 = r4
            r0.L$1 = r3
            r5 = 3
            r0.label = r5
            java.lang.Object r13 = r2.load(r13, r0)
            if (r13 != r1) goto L_0x011d
            return r1
        L_0x011d:
            r6 = r4
        L_0x011e:
            r5 = r13
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            boolean r13 = r5 instanceof androidx.paging.PagingSource.LoadResult.Page
            if (r13 == 0) goto L_0x023c
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r4 = r6.stateHolder
            kotlinx.coroutines.sync.b r2 = r4.lock
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r13 = 4
            r0.label = r13
            java.lang.Object r13 = r2.mo74906a(r3, r0)
            if (r13 != r1) goto L_0x013d
            return r1
        L_0x013d:
            androidx.paging.PageFetcherSnapshotState r13 = r4.state     // Catch:{ all -> 0x0237 }
            r4 = 0
            androidx.paging.LoadType r7 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0237 }
            r8 = r5
            androidx.paging.PagingSource$LoadResult$Page r8 = (androidx.paging.PagingSource.LoadResult.Page) r8     // Catch:{ all -> 0x0237 }
            boolean r4 = r13.insert(r4, r7, r8)     // Catch:{ all -> 0x0237 }
            androidx.paging.MutableLoadStateCollection r8 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadState$NotLoading$Companion r9 = androidx.paging.LoadState.NotLoading.Companion     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadState$NotLoading r10 = r9.getIncomplete$paging_common()     // Catch:{ all -> 0x0237 }
            r8.set(r7, r10)     // Catch:{ all -> 0x0237 }
            r7 = r5
            androidx.paging.PagingSource$LoadResult$Page r7 = (androidx.paging.PagingSource.LoadResult.Page) r7     // Catch:{ all -> 0x0237 }
            java.lang.Object r7 = r7.getPrevKey()     // Catch:{ all -> 0x0237 }
            if (r7 != 0) goto L_0x016e
            androidx.paging.MutableLoadStateCollection r7 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadType r8 = androidx.paging.LoadType.PREPEND     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadState$NotLoading r10 = r9.getComplete$paging_common()     // Catch:{ all -> 0x0237 }
            r7.set(r8, r10)     // Catch:{ all -> 0x0237 }
        L_0x016e:
            r7 = r5
            androidx.paging.PagingSource$LoadResult$Page r7 = (androidx.paging.PagingSource.LoadResult.Page) r7     // Catch:{ all -> 0x0237 }
            java.lang.Object r7 = r7.getNextKey()     // Catch:{ all -> 0x0237 }
            if (r7 != 0) goto L_0x0184
            androidx.paging.MutableLoadStateCollection r13 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadType r7 = androidx.paging.LoadType.APPEND     // Catch:{ all -> 0x0237 }
            androidx.paging.LoadState$NotLoading r8 = r9.getComplete$paging_common()     // Catch:{ all -> 0x0237 }
            r13.set(r7, r8)     // Catch:{ all -> 0x0237 }
        L_0x0184:
            r2.mo74907b(r3)
            if (r4 == 0) goto L_0x01cf
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r4 = r6.stateHolder
            kotlinx.coroutines.sync.b r13 = r4.lock
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r13
            r2 = 5
            r0.label = r2
            java.lang.Object r2 = r13.mo74906a(r3, r0)
            if (r2 != r1) goto L_0x01a1
            return r1
        L_0x01a1:
            r2 = r13
        L_0x01a2:
            androidx.paging.PageFetcherSnapshotState r13 = r4.state     // Catch:{ all -> 0x0074 }
            kotlinx.coroutines.channels.f<androidx.paging.PageEvent<Value>> r4 = r6.pageEventCh     // Catch:{ all -> 0x0074 }
            r7 = r5
            androidx.paging.PagingSource$LoadResult$Page r7 = (androidx.paging.PagingSource.LoadResult.Page) r7     // Catch:{ all -> 0x0074 }
            androidx.paging.LoadType r8 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0074 }
            androidx.paging.PageEvent r13 = r13.toPageEvent$paging_common(r7, r8)     // Catch:{ all -> 0x0074 }
            r0.L$0 = r6     // Catch:{ all -> 0x0074 }
            r0.L$1 = r5     // Catch:{ all -> 0x0074 }
            r0.L$2 = r2     // Catch:{ all -> 0x0074 }
            r0.L$3 = r3     // Catch:{ all -> 0x0074 }
            r7 = 6
            r0.label = r7     // Catch:{ all -> 0x0074 }
            java.lang.Object r13 = r4.send(r13, r0)     // Catch:{ all -> 0x0074 }
            if (r13 != r1) goto L_0x01c3
            return r1
        L_0x01c3:
            r4 = r5
            r5 = r6
        L_0x01c5:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0074 }
            r2.mo74907b(r3)
            goto L_0x01d1
        L_0x01cb:
            r2.mo74907b(r3)
            throw r13
        L_0x01cf:
            r4 = r5
            r5 = r6
        L_0x01d1:
            androidx.paging.RemoteMediatorConnection r13 = r5.getRemoteMediatorConnection()
            if (r13 == 0) goto L_0x0293
            r13 = r4
            androidx.paging.PagingSource$LoadResult$Page r13 = (androidx.paging.PagingSource.LoadResult.Page) r13
            java.lang.Object r2 = r13.getPrevKey()
            if (r2 == 0) goto L_0x01e6
            java.lang.Object r13 = r13.getNextKey()
            if (r13 != 0) goto L_0x0293
        L_0x01e6:
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r2 = r5.stateHolder
            kotlinx.coroutines.sync.b r13 = r2.lock
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r2
            r0.L$3 = r13
            r6 = 7
            r0.label = r6
            java.lang.Object r0 = r13.mo74906a(r3, r0)
            if (r0 != r1) goto L_0x01fe
            return r1
        L_0x01fe:
            r1 = r13
            r0 = r5
        L_0x0200:
            androidx.paging.PageFetcherSnapshotState r13 = r2.state     // Catch:{ all -> 0x0232 }
            androidx.paging.HintHandler r2 = r0.hintHandler     // Catch:{ all -> 0x0232 }
            androidx.paging.ViewportHint$Access r2 = r2.getLastAccessHint()     // Catch:{ all -> 0x0232 }
            androidx.paging.PagingState r13 = r13.currentPagingState$paging_common(r2)     // Catch:{ all -> 0x0232 }
            r1.mo74907b(r3)
            androidx.paging.PagingSource$LoadResult$Page r4 = (androidx.paging.PagingSource.LoadResult.Page) r4
            java.lang.Object r1 = r4.getPrevKey()
            if (r1 != 0) goto L_0x0222
            androidx.paging.RemoteMediatorConnection r1 = r0.getRemoteMediatorConnection()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            r1.requestLoad(r2, r13)
        L_0x0222:
            java.lang.Object r1 = r4.getNextKey()
            if (r1 != 0) goto L_0x0293
            androidx.paging.RemoteMediatorConnection r0 = r0.getRemoteMediatorConnection()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            r0.requestLoad(r1, r13)
            goto L_0x0293
        L_0x0232:
            r13 = move-exception
            r1.mo74907b(r3)
            throw r13
        L_0x0237:
            r13 = move-exception
            r2.mo74907b(r3)
            throw r13
        L_0x023c:
            boolean r13 = r5 instanceof androidx.paging.PagingSource.LoadResult.Error
            if (r13 == 0) goto L_0x028c
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r4 = r6.stateHolder
            kotlinx.coroutines.sync.b r13 = r4.lock
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r13
            r2 = 8
            r0.label = r2
            java.lang.Object r2 = r13.mo74906a(r3, r0)
            if (r2 != r1) goto L_0x0259
            return r1
        L_0x0259:
            androidx.paging.PageFetcherSnapshotState r2 = r4.state     // Catch:{ all -> 0x0284 }
            androidx.paging.LoadState$Error r4 = new androidx.paging.LoadState$Error     // Catch:{ all -> 0x0284 }
            androidx.paging.PagingSource$LoadResult$Error r5 = (androidx.paging.PagingSource.LoadResult.Error) r5     // Catch:{ all -> 0x0284 }
            java.lang.Throwable r5 = r5.getThrowable()     // Catch:{ all -> 0x0284 }
            r4.<init>(r5)     // Catch:{ all -> 0x0284 }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0284 }
            r0.L$0 = r13     // Catch:{ all -> 0x0284 }
            r0.L$1 = r3     // Catch:{ all -> 0x0284 }
            r0.L$2 = r3     // Catch:{ all -> 0x0284 }
            r0.L$3 = r3     // Catch:{ all -> 0x0284 }
            r7 = 9
            r0.label = r7     // Catch:{ all -> 0x0284 }
            java.lang.Object r0 = r6.setError(r2, r5, r4, r0)     // Catch:{ all -> 0x0284 }
            if (r0 != r1) goto L_0x027d
            return r1
        L_0x027d:
            r0 = r13
        L_0x027e:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0035 }
            r0.mo74907b(r3)
            return r13
        L_0x0284:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x0288:
            r0.mo74907b(r3)
            throw r13
        L_0x028c:
            boolean r13 = r5 instanceof androidx.paging.PagingSource.LoadResult.Invalid
            if (r13 == 0) goto L_0x0293
            r6.onInvalidLoad()
        L_0x0293:
            ja.u r13 = p297ja.C13339u.f61331a
            return r13
        L_0x0296:
            r2.mo74907b(r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doInitialLoad(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: androidx.paging.PagingSource$LoadResult$Page} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: kotlinx.coroutines.sync.b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03a4, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a5, code lost:
        r5 = ((androidx.paging.PagingSource.LoadResult.Page) r2).getPrevKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03b5, code lost:
        if (r9.getPagingSource$paging_common().getKeyReuseSupported() != false) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03bd, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r5, r10.element) != false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c0, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03c2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c3, code lost:
        if (r5 != false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03c7, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03c9, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03cc, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03fd, code lost:
        throw new java.lang.IllegalStateException(kotlin.text.C15165m.m93589h("The same value, " + r10.element + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", (java.lang.String) null, 1, (java.lang.Object) null).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03fe, code lost:
        r5 = r9.stateHolder;
        r14 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r11;
        r3.L$4 = r10;
        r3.L$5 = r0;
        r3.L$6 = r8;
        r3.L$7 = r2;
        r3.L$8 = r5;
        r3.L$9 = r14;
        r3.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0420, code lost:
        if (r14.mo74906a((java.lang.Object) null, r3) != r4) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0422, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0423, code lost:
        r7 = r2;
        r16 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043c, code lost:
        if (androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5).insert(r12.getGenerationId(), r13, (androidx.paging.PagingSource.LoadResult.Page) r7) != false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0440, code lost:
        r5 = (androidx.paging.PagingSource.LoadResult.Page) r7;
        r11.element += r5.getData().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0452, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0458, code lost:
        if (r5.getPrevKey() == null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        if (r13 != androidx.paging.LoadType.APPEND) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0465, code lost:
        if (r5.getNextKey() != null) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0468, code lost:
        r9.element = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x046c, code lost:
        r2 = r7;
        r16 = r9;
        r9 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0474, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0475, code lost:
        r14.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0479, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x047d, code lost:
        if ((r2 instanceof androidx.paging.PagingSource.LoadResult.Error) == false) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x047f, code lost:
        r5 = r9.stateHolder;
        r0 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r2;
        r3.L$4 = r5;
        r3.L$5 = r0;
        r3.L$6 = null;
        r3.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x049b, code lost:
        if (r0.mo74906a((java.lang.Object) null, r3) != r4) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x049d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x049e, code lost:
        r6 = r2;
        r2 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r5 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5);
        r7 = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) r6).getThrowable());
        r0.L$0 = r3;
        r0.L$1 = r12;
        r0.L$2 = r4;
        r0.L$3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r0.L$4 = null;
        r0.L$5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04c6, code lost:
        if (r9.setError(r5, r3, r7, r0) != r2) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04c8, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04c9, code lost:
        r0 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04cb, code lost:
        r0.getFailedHintsByLoadType$paging_common().put(r3, r5.getHint());
        r0 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04d8, code lost:
        r4.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04de, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04df, code lost:
        r4.mo74907b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04e5, code lost:
        if ((r2 instanceof androidx.paging.PagingSource.LoadResult.Invalid) == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e7, code lost:
        r9.onInvalidLoad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04ec, code lost:
        return p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04f6, code lost:
        if (androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[r13.ordinal()] != 2) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04f8, code lost:
        r7 = androidx.paging.LoadType.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04fb, code lost:
        r7 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04fd, code lost:
        r15 = r9.stateHolder;
        r5 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r15);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r11;
        r3.L$4 = r10;
        r3.L$5 = r0;
        r3.L$6 = r8;
        r3.L$7 = r2;
        r3.L$8 = r7;
        r3.L$9 = r15;
        r3.L$10 = r5;
        r3.label = 8;
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0524, code lost:
        if (r5.mo74906a((java.lang.Object) null, r3) != r4) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0526, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0527, code lost:
        r14 = r12;
        r12 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r2;
        r2 = r5;
        r5 = r15;
        r15 = r13;
        r13 = r11;
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r0 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5);
        r5 = r0.dropEventOrNull(r7, r14.getHint());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x053e, code lost:
        if (r5 != null) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0540, code lost:
        r5 = r2;
        r7 = r8;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0544, code lost:
        r0.drop(r5);
        r7 = r10.pageEventCh;
        r3.L$0 = r10;
        r3.L$1 = r15;
        r3.L$2 = r14;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r9;
        r3.L$7 = r8;
        r3.L$8 = r2;
        r3.L$9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        r3.L$10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r3.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0568, code lost:
        if (r7.send(r5, r3) != r4) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x056a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x056b, code lost:
        r5 = r2;
        r7 = r8;
        r8 = r9;
        r9 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1 = p297ja.C13339u.f61331a;
        r10 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x057c, code lost:
        r1 = r10.nextLoadKeyOrNull(r0, r15, r14.getGenerationId(), r14.getHint().presentedItemsBeyondAnchor$paging_common(r15) + r13.element);
        r12.element = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0591, code lost:
        if (r1 != null) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x059d, code lost:
        if ((r0.getSourceLoadStates$paging_common().get(r15) instanceof androidx.paging.LoadState.Error) != false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x059f, code lost:
        r1 = r0.getSourceLoadStates$paging_common();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05a5, code lost:
        if (r11.element == false) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05a7, code lost:
        r2 = androidx.paging.LoadState.NotLoading.Companion.getComplete$paging_common();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05ae, code lost:
        r2 = androidx.paging.LoadState.NotLoading.Companion.getIncomplete$paging_common();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05b4, code lost:
        r1.set(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bd, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05b7, code lost:
        r0 = r0.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) r7, r15);
        r1 = r10.pageEventCh;
        r3.L$0 = r10;
        r3.L$1 = r15;
        r3.L$2 = r14;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r8;
        r3.L$7 = r7;
        r3.L$8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r3.L$9 = null;
        r3.L$10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r3.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05df, code lost:
        if (r1.send(r0, r3) != r4) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05e1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05e2, code lost:
        r0 = r7;
        r7 = r8;
        r8 = r11;
        r9 = r13;
        r11 = r15;
        r16 = r14;
        r14 = r10;
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05ec, code lost:
        r1 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05ee, code lost:
        r5.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05f4, code lost:
        if ((r7 instanceof androidx.paging.PagingSource.LoadParams.Prepend) == false) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05fd, code lost:
        if (((androidx.paging.PagingSource.LoadResult.Page) r0).getPrevKey() != null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ff, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0601, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0604, code lost:
        if ((r7 instanceof androidx.paging.PagingSource.LoadParams.Append) == false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x060c, code lost:
        if (((androidx.paging.PagingSource.LoadResult.Page) r0).getNextKey() != null) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x060e, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0610, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0615, code lost:
        if (r14.getRemoteMediatorConnection() == null) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0617, code lost:
        if (r5 != 0) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0619, code lost:
        if (r0 == 0) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x061b, code lost:
        r13 = r14.stateHolder;
        r1 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r13);
        r3.L$0 = r14;
        r3.L$1 = r11;
        r3.L$2 = r10;
        r3.L$3 = r9;
        r3.L$4 = r12;
        r3.L$5 = r8;
        r3.L$6 = r13;
        r3.L$7 = r1;
        r3.L$8 = null;
        r3.I$0 = r5;
        r3.I$1 = r0;
        r3.label = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0640, code lost:
        if (r1.mo74906a((java.lang.Object) null, r3) != r4) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0642, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0643, code lost:
        r16 = r14;
        r14 = r8;
        r8 = r12;
        r12 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r13).currentPagingState$paging_common(r12.hintHandler.getLastAccessHint());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x065b, code lost:
        if (r5 == 0) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x065d, code lost:
        r12.getRemoteMediatorConnection().requestLoad(androidx.paging.LoadType.PREPEND, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0666, code lost:
        if (r0 == 0) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0668, code lost:
        r12.getRemoteMediatorConnection().requestLoad(androidx.paging.LoadType.APPEND, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0671, code lost:
        r1 = r17;
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0676, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0677, code lost:
        r1.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x067b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x067c, code lost:
        r1 = r17;
        r0 = r8;
        r8 = r12;
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0683, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0684, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0686, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0687, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0689, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x068a, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x068d, code lost:
        r5.mo74907b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0690, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0693, code lost:
        return p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0694, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0695, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0698, code lost:
        r7.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x069b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06a1, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06a3, code lost:
        r2.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015b, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5);
        r9 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[r0.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x022f, code lost:
        if (r9 == 1) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0232, code lost:
        if (r9 == 2) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0235, code lost:
        if (r9 == 3) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0239, code lost:
        r9 = (r5.getInitialPageIndex$paging_common() + r8.getHint().getOriginalPageOffsetLast()) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0248, code lost:
        if (r9 >= 0) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x024a, code lost:
        r7.element += r10.config.pageSize * (-r9);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0257, code lost:
        r11 = kotlin.collections.C13614t.m87750l(r5.getPages$paging_common());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x025f, code lost:
        if (r9 > r11) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0261, code lost:
        r12 = r9 + 1;
        r7.element += ((androidx.paging.PagingSource.LoadResult.Page) r5.getPages$paging_common().get(r9)).getData().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x027a, code lost:
        if (r9 != r11) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x027d, code lost:
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x027f, code lost:
        r9 = (r5.getInitialPageIndex$paging_common() + r8.getHint().getOriginalPageOffsetFirst()) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0296, code lost:
        if (r9 <= kotlin.collections.C13614t.m87750l(r5.getPages$paging_common())) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0298, code lost:
        r7.element += r10.config.pageSize * (r9 - kotlin.collections.C13614t.m87750l(r5.getPages$paging_common()));
        r9 = kotlin.collections.C13614t.m87750l(r5.getPages$paging_common());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b4, code lost:
        if (r9 < 0) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b6, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b7, code lost:
        r12 = r11 + 1;
        r7.element += ((androidx.paging.PagingSource.LoadResult.Page) r5.getPages$paging_common().get(r11)).getData().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d0, code lost:
        if (r11 != r9) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d3, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d5, code lost:
        r5 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02d7, code lost:
        r2.mo74907b((java.lang.Object) null);
        r2 = new kotlin.jvm.internal.C13684d0();
        r5 = r10.stateHolder;
        r9 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5);
        r3.L$0 = r10;
        r3.L$1 = r0;
        r3.L$2 = r8;
        r3.L$3 = r7;
        r3.L$4 = r2;
        r3.L$5 = r5;
        r3.L$6 = r9;
        r3.L$7 = r2;
        r3.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02fe, code lost:
        if (r9.mo74906a((java.lang.Object) null, r3) != r4) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0300, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0301, code lost:
        r11 = r0;
        r0 = r2;
        r12 = r10;
        r10 = r8;
        r8 = r0;
        r16 = r7;
        r7 = r5;
        r5 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r7);
        r7 = r12.nextLoadKeyOrNull(r2, r11, r10.getGenerationId(), r10.getHint().presentedItemsBeyondAnchor$paging_common(r11) + r9.element);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0323, code lost:
        if (r7 != null) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0325, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0327, code lost:
        r3.L$0 = r12;
        r3.L$1 = r11;
        r3.L$2 = r10;
        r3.L$3 = r9;
        r3.L$4 = r8;
        r3.L$5 = r5;
        r3.L$6 = r7;
        r3.L$7 = r0;
        r3.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x033e, code lost:
        if (r12.setLoading(r2, r11, r3) != r4) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0340, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0341, code lost:
        r16 = r7;
        r7 = r5;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0346, code lost:
        r2 = r5;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0348, code lost:
        r5.mo74907b((java.lang.Object) null);
        r0.element = r2;
        r0 = new kotlin.jvm.internal.C13678a0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0353, code lost:
        r2 = r8.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0355, code lost:
        if (r2 == null) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0357, code lost:
        r2 = r12.loadParams(r11, r2);
        r5 = r12.getPagingSource$paging_common();
        r3.L$0 = r12;
        r3.L$1 = r11;
        r3.L$2 = r10;
        r3.L$3 = r9;
        r3.L$4 = r8;
        r3.L$5 = r0;
        r3.L$6 = r2;
        r3.L$7 = null;
        r3.L$8 = null;
        r3.label = 4;
        r5 = r5.load(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0379, code lost:
        if (r5 != r4) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x037b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x037c, code lost:
        r13 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0383, code lost:
        r2 = (androidx.paging.PagingSource.LoadResult) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0387, code lost:
        if ((r2 instanceof androidx.paging.PagingSource.LoadResult.Page) == false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0389, code lost:
        r5 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[r13.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0392, code lost:
        if (r5 == 2) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0395, code lost:
        if (r5 != 3) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0397, code lost:
        r5 = ((androidx.paging.PagingSource.LoadResult.Page) r2).getNextKey();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doLoad(androidx.paging.LoadType r18, androidx.paging.GenerationalViewportHint r19, kotlin.coroutines.C13635d<? super p297ja.C13339u> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.paging.PageFetcherSnapshot$doLoad$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = (androidx.paging.PageFetcherSnapshot$doLoad$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = new androidx.paging.PageFetcherSnapshot$doLoad$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r5 = r3.label
            java.lang.String r6 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r5) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01ae;
                case 3: goto L_0x0187;
                case 4: goto L_0x015f;
                case 5: goto L_0x012d;
                case 6: goto L_0x010b;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00c0;
                case 9: goto L_0x008f;
                case 10: goto L_0x0061;
                case 11: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            int r0 = r3.I$1
            int r5 = r3.I$0
            java.lang.Object r12 = r3.L$7
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r13 = r3.L$6
            androidx.paging.PageFetcherSnapshotState$Holder r13 = (androidx.paging.PageFetcherSnapshotState.Holder) r13
            java.lang.Object r14 = r3.L$5
            kotlin.jvm.internal.a0 r14 = (kotlin.jvm.internal.C13678a0) r14
            java.lang.Object r15 = r3.L$4
            kotlin.jvm.internal.d0 r15 = (kotlin.jvm.internal.C13684d0) r15
            java.lang.Object r9 = r3.L$3
            kotlin.jvm.internal.b0 r9 = (kotlin.jvm.internal.C13680b0) r9
            java.lang.Object r7 = r3.L$2
            androidx.paging.GenerationalViewportHint r7 = (androidx.paging.GenerationalViewportHint) r7
            java.lang.Object r8 = r3.L$1
            androidx.paging.LoadType r8 = (androidx.paging.LoadType) r8
            java.lang.Object r11 = r3.L$0
            androidx.paging.PageFetcherSnapshot r11 = (androidx.paging.PageFetcherSnapshot) r11
            p297ja.C13332o.m85685b(r2)
            r10 = r7
            r1 = r12
            r12 = r11
            r11 = r8
            r8 = r15
            goto L_0x0649
        L_0x0061:
            java.lang.Object r0 = r3.L$8
            r5 = r0
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r0 = r3.L$7
            androidx.paging.PagingSource$LoadResult r0 = (androidx.paging.PagingSource.LoadResult) r0
            java.lang.Object r7 = r3.L$6
            androidx.paging.PagingSource$LoadParams r7 = (androidx.paging.PagingSource.LoadParams) r7
            java.lang.Object r8 = r3.L$5
            kotlin.jvm.internal.a0 r8 = (kotlin.jvm.internal.C13678a0) r8
            java.lang.Object r9 = r3.L$4
            kotlin.jvm.internal.d0 r9 = (kotlin.jvm.internal.C13684d0) r9
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.b0 r11 = (kotlin.jvm.internal.C13680b0) r11
            java.lang.Object r12 = r3.L$2
            androidx.paging.GenerationalViewportHint r12 = (androidx.paging.GenerationalViewportHint) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            p297ja.C13332o.m85685b(r2)     // Catch:{ all -> 0x00bc }
            r10 = r12
            r12 = r9
            r9 = r11
            r11 = r13
            goto L_0x05ec
        L_0x008f:
            java.lang.Object r0 = r3.L$9
            androidx.paging.PageFetcherSnapshotState r0 = (androidx.paging.PageFetcherSnapshotState) r0
            java.lang.Object r5 = r3.L$8
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r7 = r3.L$7
            androidx.paging.PagingSource$LoadResult r7 = (androidx.paging.PagingSource.LoadResult) r7
            java.lang.Object r8 = r3.L$6
            androidx.paging.PagingSource$LoadParams r8 = (androidx.paging.PagingSource.LoadParams) r8
            java.lang.Object r9 = r3.L$5
            kotlin.jvm.internal.a0 r9 = (kotlin.jvm.internal.C13678a0) r9
            java.lang.Object r11 = r3.L$4
            kotlin.jvm.internal.d0 r11 = (kotlin.jvm.internal.C13684d0) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.b0 r12 = (kotlin.jvm.internal.C13680b0) r12
            java.lang.Object r13 = r3.L$2
            androidx.paging.GenerationalViewportHint r13 = (androidx.paging.GenerationalViewportHint) r13
            java.lang.Object r14 = r3.L$1
            androidx.paging.LoadType r14 = (androidx.paging.LoadType) r14
            java.lang.Object r15 = r3.L$0
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            p297ja.C13332o.m85685b(r2)     // Catch:{ all -> 0x00bc }
            goto L_0x0574
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            r1 = 0
            goto L_0x068d
        L_0x00c0:
            java.lang.Object r0 = r3.L$10
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            java.lang.Object r5 = r3.L$9
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            java.lang.Object r7 = r3.L$8
            androidx.paging.LoadType r7 = (androidx.paging.LoadType) r7
            java.lang.Object r8 = r3.L$7
            androidx.paging.PagingSource$LoadResult r8 = (androidx.paging.PagingSource.LoadResult) r8
            java.lang.Object r9 = r3.L$6
            androidx.paging.PagingSource$LoadParams r9 = (androidx.paging.PagingSource.LoadParams) r9
            java.lang.Object r11 = r3.L$5
            kotlin.jvm.internal.a0 r11 = (kotlin.jvm.internal.C13678a0) r11
            java.lang.Object r12 = r3.L$4
            kotlin.jvm.internal.d0 r12 = (kotlin.jvm.internal.C13684d0) r12
            java.lang.Object r13 = r3.L$3
            kotlin.jvm.internal.b0 r13 = (kotlin.jvm.internal.C13680b0) r13
            java.lang.Object r14 = r3.L$2
            androidx.paging.GenerationalViewportHint r14 = (androidx.paging.GenerationalViewportHint) r14
            java.lang.Object r15 = r3.L$1
            androidx.paging.LoadType r15 = (androidx.paging.LoadType) r15
            java.lang.Object r10 = r3.L$0
            androidx.paging.PageFetcherSnapshot r10 = (androidx.paging.PageFetcherSnapshot) r10
            p297ja.C13332o.m85685b(r2)
            r2 = r0
            goto L_0x0532
        L_0x00f2:
            java.lang.Object r0 = r3.L$3
            androidx.paging.PageFetcherSnapshotState r0 = (androidx.paging.PageFetcherSnapshotState) r0
            java.lang.Object r4 = r3.L$2
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.C15536b) r4
            java.lang.Object r5 = r3.L$1
            androidx.paging.GenerationalViewportHint r5 = (androidx.paging.GenerationalViewportHint) r5
            java.lang.Object r3 = r3.L$0
            androidx.paging.LoadType r3 = (androidx.paging.LoadType) r3
            p297ja.C13332o.m85685b(r2)     // Catch:{ all -> 0x0107 }
            goto L_0x04cb
        L_0x0107:
            r0 = move-exception
            r2 = 0
            goto L_0x04df
        L_0x010b:
            java.lang.Object r0 = r3.L$5
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            java.lang.Object r5 = r3.L$4
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            java.lang.Object r6 = r3.L$3
            androidx.paging.PagingSource$LoadResult r6 = (androidx.paging.PagingSource.LoadResult) r6
            java.lang.Object r7 = r3.L$2
            androidx.paging.GenerationalViewportHint r7 = (androidx.paging.GenerationalViewportHint) r7
            java.lang.Object r8 = r3.L$1
            androidx.paging.LoadType r8 = (androidx.paging.LoadType) r8
            java.lang.Object r9 = r3.L$0
            androidx.paging.PageFetcherSnapshot r9 = (androidx.paging.PageFetcherSnapshot) r9
            p297ja.C13332o.m85685b(r2)
            r2 = r4
            r12 = r7
            r4 = r0
            r0 = r3
            r3 = r8
            goto L_0x04a3
        L_0x012d:
            java.lang.Object r0 = r3.L$9
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            java.lang.Object r5 = r3.L$8
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            java.lang.Object r7 = r3.L$7
            androidx.paging.PagingSource$LoadResult r7 = (androidx.paging.PagingSource.LoadResult) r7
            java.lang.Object r8 = r3.L$6
            androidx.paging.PagingSource$LoadParams r8 = (androidx.paging.PagingSource.LoadParams) r8
            java.lang.Object r9 = r3.L$5
            kotlin.jvm.internal.a0 r9 = (kotlin.jvm.internal.C13678a0) r9
            java.lang.Object r10 = r3.L$4
            kotlin.jvm.internal.d0 r10 = (kotlin.jvm.internal.C13684d0) r10
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.b0 r11 = (kotlin.jvm.internal.C13680b0) r11
            java.lang.Object r12 = r3.L$2
            androidx.paging.GenerationalViewportHint r12 = (androidx.paging.GenerationalViewportHint) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            p297ja.C13332o.m85685b(r2)
            r16 = r14
            r14 = r0
        L_0x015b:
            r0 = r16
            goto L_0x0429
        L_0x015f:
            java.lang.Object r0 = r3.L$6
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            java.lang.Object r5 = r3.L$5
            kotlin.jvm.internal.a0 r5 = (kotlin.jvm.internal.C13678a0) r5
            java.lang.Object r7 = r3.L$4
            kotlin.jvm.internal.d0 r7 = (kotlin.jvm.internal.C13684d0) r7
            java.lang.Object r8 = r3.L$3
            kotlin.jvm.internal.b0 r8 = (kotlin.jvm.internal.C13680b0) r8
            java.lang.Object r9 = r3.L$2
            androidx.paging.GenerationalViewportHint r9 = (androidx.paging.GenerationalViewportHint) r9
            java.lang.Object r10 = r3.L$1
            androidx.paging.LoadType r10 = (androidx.paging.LoadType) r10
            java.lang.Object r11 = r3.L$0
            androidx.paging.PageFetcherSnapshot r11 = (androidx.paging.PageFetcherSnapshot) r11
            p297ja.C13332o.m85685b(r2)
            r12 = r9
            r13 = r10
            r9 = r11
            r10 = r7
            r11 = r8
            r8 = r0
            r0 = r5
            goto L_0x0383
        L_0x0187:
            java.lang.Object r0 = r3.L$7
            kotlin.jvm.internal.d0 r0 = (kotlin.jvm.internal.C13684d0) r0
            java.lang.Object r5 = r3.L$6
            java.lang.Object r7 = r3.L$5
            kotlinx.coroutines.sync.b r7 = (kotlinx.coroutines.sync.C15536b) r7
            java.lang.Object r8 = r3.L$4
            kotlin.jvm.internal.d0 r8 = (kotlin.jvm.internal.C13684d0) r8
            java.lang.Object r9 = r3.L$3
            kotlin.jvm.internal.b0 r9 = (kotlin.jvm.internal.C13680b0) r9
            java.lang.Object r10 = r3.L$2
            androidx.paging.GenerationalViewportHint r10 = (androidx.paging.GenerationalViewportHint) r10
            java.lang.Object r11 = r3.L$1
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r12 = r3.L$0
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            p297ja.C13332o.m85685b(r2)     // Catch:{ all -> 0x01aa }
            goto L_0x0346
        L_0x01aa:
            r0 = move-exception
        L_0x01ab:
            r1 = 0
            goto L_0x0698
        L_0x01ae:
            java.lang.Object r0 = r3.L$7
            kotlin.jvm.internal.d0 r0 = (kotlin.jvm.internal.C13684d0) r0
            java.lang.Object r5 = r3.L$6
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r7 = r3.L$5
            androidx.paging.PageFetcherSnapshotState$Holder r7 = (androidx.paging.PageFetcherSnapshotState.Holder) r7
            java.lang.Object r8 = r3.L$4
            kotlin.jvm.internal.d0 r8 = (kotlin.jvm.internal.C13684d0) r8
            java.lang.Object r9 = r3.L$3
            kotlin.jvm.internal.b0 r9 = (kotlin.jvm.internal.C13680b0) r9
            java.lang.Object r10 = r3.L$2
            androidx.paging.GenerationalViewportHint r10 = (androidx.paging.GenerationalViewportHint) r10
            java.lang.Object r11 = r3.L$1
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r12 = r3.L$0
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            p297ja.C13332o.m85685b(r2)
            goto L_0x030c
        L_0x01d3:
            java.lang.Object r0 = r3.L$5
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            java.lang.Object r5 = r3.L$4
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            java.lang.Object r7 = r3.L$3
            kotlin.jvm.internal.b0 r7 = (kotlin.jvm.internal.C13680b0) r7
            java.lang.Object r8 = r3.L$2
            androidx.paging.GenerationalViewportHint r8 = (androidx.paging.GenerationalViewportHint) r8
            java.lang.Object r9 = r3.L$1
            androidx.paging.LoadType r9 = (androidx.paging.LoadType) r9
            java.lang.Object r10 = r3.L$0
            androidx.paging.PageFetcherSnapshot r10 = (androidx.paging.PageFetcherSnapshot) r10
            p297ja.C13332o.m85685b(r2)
            r2 = r0
            r0 = r9
            goto L_0x0222
        L_0x01f1:
            p297ja.C13332o.m85685b(r2)
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            if (r0 == r2) goto L_0x01fa
            r2 = 1
            goto L_0x01fb
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r2 == 0) goto L_0x06a8
            kotlin.jvm.internal.b0 r7 = new kotlin.jvm.internal.b0
            r7.<init>()
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r5 = r1.stateHolder
            kotlinx.coroutines.sync.b r2 = r5.lock
            r3.L$0 = r1
            r3.L$1 = r0
            r8 = r19
            r3.L$2 = r8
            r3.L$3 = r7
            r3.L$4 = r5
            r3.L$5 = r2
            r9 = 1
            r3.label = r9
            r9 = 0
            java.lang.Object r10 = r2.mo74906a(r9, r3)
            if (r10 != r4) goto L_0x0221
            return r4
        L_0x0221:
            r10 = r1
        L_0x0222:
            androidx.paging.PageFetcherSnapshotState r5 = r5.state     // Catch:{ all -> 0x06a2 }
            int[] r9 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0     // Catch:{ all -> 0x06a2 }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x06a2 }
            r9 = r9[r11]     // Catch:{ all -> 0x06a2 }
            r11 = 1
            if (r9 == r11) goto L_0x069c
            r11 = 2
            if (r9 == r11) goto L_0x027f
            r11 = 3
            if (r9 == r11) goto L_0x0239
            goto L_0x02d5
        L_0x0239:
            int r9 = r5.getInitialPageIndex$paging_common()     // Catch:{ all -> 0x06a2 }
            androidx.paging.ViewportHint r11 = r8.getHint()     // Catch:{ all -> 0x06a2 }
            int r11 = r11.getOriginalPageOffsetLast()     // Catch:{ all -> 0x06a2 }
            int r9 = r9 + r11
            r11 = 1
            int r9 = r9 + r11
            if (r9 >= 0) goto L_0x0257
            int r11 = r7.element     // Catch:{ all -> 0x06a2 }
            androidx.paging.PagingConfig r12 = r10.config     // Catch:{ all -> 0x06a2 }
            int r12 = r12.pageSize     // Catch:{ all -> 0x06a2 }
            int r9 = -r9
            int r12 = r12 * r9
            int r11 = r11 + r12
            r7.element = r11     // Catch:{ all -> 0x06a2 }
            r9 = 0
        L_0x0257:
            java.util.List r11 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            int r11 = kotlin.collections.C13614t.m87750l(r11)     // Catch:{ all -> 0x06a2 }
            if (r9 > r11) goto L_0x02d5
        L_0x0261:
            int r12 = r9 + 1
            int r13 = r7.element     // Catch:{ all -> 0x06a2 }
            java.util.List r14 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            java.lang.Object r14 = r14.get(r9)     // Catch:{ all -> 0x06a2 }
            androidx.paging.PagingSource$LoadResult$Page r14 = (androidx.paging.PagingSource.LoadResult.Page) r14     // Catch:{ all -> 0x06a2 }
            java.util.List r14 = r14.getData()     // Catch:{ all -> 0x06a2 }
            int r14 = r14.size()     // Catch:{ all -> 0x06a2 }
            int r13 = r13 + r14
            r7.element = r13     // Catch:{ all -> 0x06a2 }
            if (r9 != r11) goto L_0x027d
            goto L_0x02d5
        L_0x027d:
            r9 = r12
            goto L_0x0261
        L_0x027f:
            int r9 = r5.getInitialPageIndex$paging_common()     // Catch:{ all -> 0x06a2 }
            androidx.paging.ViewportHint r11 = r8.getHint()     // Catch:{ all -> 0x06a2 }
            int r11 = r11.getOriginalPageOffsetFirst()     // Catch:{ all -> 0x06a2 }
            int r9 = r9 + r11
            r11 = 1
            int r9 = r9 - r11
            java.util.List r11 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            int r11 = kotlin.collections.C13614t.m87750l(r11)     // Catch:{ all -> 0x06a2 }
            if (r9 <= r11) goto L_0x02b4
            int r11 = r7.element     // Catch:{ all -> 0x06a2 }
            androidx.paging.PagingConfig r12 = r10.config     // Catch:{ all -> 0x06a2 }
            int r12 = r12.pageSize     // Catch:{ all -> 0x06a2 }
            java.util.List r13 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            int r13 = kotlin.collections.C13614t.m87750l(r13)     // Catch:{ all -> 0x06a2 }
            int r9 = r9 - r13
            int r12 = r12 * r9
            int r11 = r11 + r12
            r7.element = r11     // Catch:{ all -> 0x06a2 }
            java.util.List r9 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            int r9 = kotlin.collections.C13614t.m87750l(r9)     // Catch:{ all -> 0x06a2 }
        L_0x02b4:
            if (r9 < 0) goto L_0x02d5
            r11 = 0
        L_0x02b7:
            int r12 = r11 + 1
            int r13 = r7.element     // Catch:{ all -> 0x06a2 }
            java.util.List r14 = r5.getPages$paging_common()     // Catch:{ all -> 0x06a2 }
            java.lang.Object r14 = r14.get(r11)     // Catch:{ all -> 0x06a2 }
            androidx.paging.PagingSource$LoadResult$Page r14 = (androidx.paging.PagingSource.LoadResult.Page) r14     // Catch:{ all -> 0x06a2 }
            java.util.List r14 = r14.getData()     // Catch:{ all -> 0x06a2 }
            int r14 = r14.size()     // Catch:{ all -> 0x06a2 }
            int r13 = r13 + r14
            r7.element = r13     // Catch:{ all -> 0x06a2 }
            if (r11 != r9) goto L_0x02d3
            goto L_0x02d5
        L_0x02d3:
            r11 = r12
            goto L_0x02b7
        L_0x02d5:
            ja.u r5 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x06a2 }
            r5 = 0
            r2.mo74907b(r5)
            kotlin.jvm.internal.d0 r2 = new kotlin.jvm.internal.d0
            r2.<init>()
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r5 = r10.stateHolder
            kotlinx.coroutines.sync.b r9 = r5.lock
            r3.L$0 = r10
            r3.L$1 = r0
            r3.L$2 = r8
            r3.L$3 = r7
            r3.L$4 = r2
            r3.L$5 = r5
            r3.L$6 = r9
            r3.L$7 = r2
            r11 = 2
            r3.label = r11
            r11 = 0
            java.lang.Object r12 = r9.mo74906a(r11, r3)
            if (r12 != r4) goto L_0x0301
            return r4
        L_0x0301:
            r11 = r0
            r0 = r2
            r12 = r10
            r10 = r8
            r8 = r0
            r16 = r7
            r7 = r5
            r5 = r9
            r9 = r16
        L_0x030c:
            androidx.paging.PageFetcherSnapshotState r2 = r7.state     // Catch:{ all -> 0x0694 }
            int r7 = r10.getGenerationId()     // Catch:{ all -> 0x0694 }
            androidx.paging.ViewportHint r13 = r10.getHint()     // Catch:{ all -> 0x0694 }
            int r13 = r13.presentedItemsBeyondAnchor$paging_common(r11)     // Catch:{ all -> 0x0694 }
            int r14 = r9.element     // Catch:{ all -> 0x0694 }
            int r13 = r13 + r14
            java.lang.Object r7 = r12.nextLoadKeyOrNull(r2, r11, r7, r13)     // Catch:{ all -> 0x0694 }
            if (r7 != 0) goto L_0x0327
            r2 = 0
            goto L_0x0348
        L_0x0327:
            r3.L$0 = r12     // Catch:{ all -> 0x0694 }
            r3.L$1 = r11     // Catch:{ all -> 0x0694 }
            r3.L$2 = r10     // Catch:{ all -> 0x0694 }
            r3.L$3 = r9     // Catch:{ all -> 0x0694 }
            r3.L$4 = r8     // Catch:{ all -> 0x0694 }
            r3.L$5 = r5     // Catch:{ all -> 0x0694 }
            r3.L$6 = r7     // Catch:{ all -> 0x0694 }
            r3.L$7 = r0     // Catch:{ all -> 0x0694 }
            r13 = 3
            r3.label = r13     // Catch:{ all -> 0x0694 }
            java.lang.Object r2 = r12.setLoading(r2, r11, r3)     // Catch:{ all -> 0x0694 }
            if (r2 != r4) goto L_0x0341
            return r4
        L_0x0341:
            r16 = r7
            r7 = r5
            r5 = r16
        L_0x0346:
            r2 = r5
            r5 = r7
        L_0x0348:
            r7 = 0
            r5.mo74907b(r7)
            r0.element = r2
            kotlin.jvm.internal.a0 r0 = new kotlin.jvm.internal.a0
            r0.<init>()
        L_0x0353:
            T r2 = r8.element
            if (r2 == 0) goto L_0x0691
            androidx.paging.PagingSource$LoadParams r2 = r12.loadParams(r11, r2)
            androidx.paging.PagingSource r5 = r12.getPagingSource$paging_common()
            r3.L$0 = r12
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r9
            r3.L$4 = r8
            r3.L$5 = r0
            r3.L$6 = r2
            r7 = 0
            r3.L$7 = r7
            r3.L$8 = r7
            r7 = 4
            r3.label = r7
            java.lang.Object r5 = r5.load(r2, r3)
            if (r5 != r4) goto L_0x037c
            return r4
        L_0x037c:
            r13 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r5
        L_0x0383:
            androidx.paging.PagingSource$LoadResult r2 = (androidx.paging.PagingSource.LoadResult) r2
            boolean r5 = r2 instanceof androidx.paging.PagingSource.LoadResult.Page
            if (r5 == 0) goto L_0x047a
            int[] r5 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0
            int r7 = r13.ordinal()
            r5 = r5[r7]
            r7 = 2
            if (r5 == r7) goto L_0x03a5
            r7 = 3
            if (r5 != r7) goto L_0x039f
            r5 = r2
            androidx.paging.PagingSource$LoadResult$Page r5 = (androidx.paging.PagingSource.LoadResult.Page) r5
            java.lang.Object r5 = r5.getNextKey()
            goto L_0x03ad
        L_0x039f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L_0x03a5:
            r7 = 3
            r5 = r2
            androidx.paging.PagingSource$LoadResult$Page r5 = (androidx.paging.PagingSource.LoadResult.Page) r5
            java.lang.Object r5 = r5.getPrevKey()
        L_0x03ad:
            androidx.paging.PagingSource r14 = r9.getPagingSource$paging_common()
            boolean r14 = r14.getKeyReuseSupported()
            if (r14 != 0) goto L_0x03c2
            T r14 = r10.element
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r5, r14)
            if (r5 != 0) goto L_0x03c0
            goto L_0x03c2
        L_0x03c0:
            r5 = 0
            goto L_0x03c3
        L_0x03c2:
            r5 = 1
        L_0x03c3:
            if (r5 != 0) goto L_0x03fe
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            if (r13 != r0) goto L_0x03cc
            java.lang.String r0 = "prevKey"
            goto L_0x03ce
        L_0x03cc:
            java.lang.String r0 = "nextKey"
        L_0x03ce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The same value, "
            r2.append(r3)
            T r3 = r10.element
            r2.append(r3)
            java.lang.String r3 = ", was passed as the "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1
            r3 = 0
            java.lang.String r0 = kotlin.text.C15167o.m93616h(r0, r3, r2, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x03fe:
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r5 = r9.stateHolder
            kotlinx.coroutines.sync.b r14 = r5.lock
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r0
            r3.L$6 = r8
            r3.L$7 = r2
            r3.L$8 = r5
            r3.L$9 = r14
            r15 = 5
            r3.label = r15
            r15 = 0
            java.lang.Object r7 = r14.mo74906a(r15, r3)
            if (r7 != r4) goto L_0x0423
            return r4
        L_0x0423:
            r7 = r2
            r16 = r9
            r9 = r0
            goto L_0x015b
        L_0x0429:
            androidx.paging.PageFetcherSnapshotState r2 = r5.state     // Catch:{ all -> 0x0474 }
            int r5 = r12.getGenerationId()     // Catch:{ all -> 0x0474 }
            r15 = r7
            androidx.paging.PagingSource$LoadResult$Page r15 = (androidx.paging.PagingSource.LoadResult.Page) r15     // Catch:{ all -> 0x0474 }
            boolean r2 = r2.insert(r5, r13, r15)     // Catch:{ all -> 0x0474 }
            r5 = 0
            r14.mo74907b(r5)
            if (r2 != 0) goto L_0x0440
            goto L_0x0691
        L_0x0440:
            int r2 = r11.element
            r5 = r7
            androidx.paging.PagingSource$LoadResult$Page r5 = (androidx.paging.PagingSource.LoadResult.Page) r5
            java.util.List r14 = r5.getData()
            int r14 = r14.size()
            int r2 = r2 + r14
            r11.element = r2
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r13 != r2) goto L_0x045d
            java.lang.Object r2 = r5.getPrevKey()
            if (r2 == 0) goto L_0x045b
            goto L_0x045d
        L_0x045b:
            r5 = 1
            goto L_0x0468
        L_0x045d:
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            if (r13 != r2) goto L_0x046b
            java.lang.Object r2 = r5.getNextKey()
            if (r2 != 0) goto L_0x046b
            goto L_0x045b
        L_0x0468:
            r9.element = r5
            goto L_0x046c
        L_0x046b:
            r5 = 1
        L_0x046c:
            r2 = r7
            r16 = r9
            r9 = r0
            r0 = r16
            goto L_0x04ed
        L_0x0474:
            r0 = move-exception
            r2 = 0
            r14.mo74907b(r2)
            throw r0
        L_0x047a:
            r5 = 1
            boolean r7 = r2 instanceof androidx.paging.PagingSource.LoadResult.Error
            if (r7 == 0) goto L_0x04e3
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r5 = r9.stateHolder
            kotlinx.coroutines.sync.b r0 = r5.lock
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r2
            r3.L$4 = r5
            r3.L$5 = r0
            r6 = 0
            r3.L$6 = r6
            r7 = 6
            r3.label = r7
            java.lang.Object r7 = r0.mo74906a(r6, r3)
            if (r7 != r4) goto L_0x049e
            return r4
        L_0x049e:
            r6 = r2
            r2 = r4
            r4 = r0
            r0 = r3
            r3 = r13
        L_0x04a3:
            androidx.paging.PageFetcherSnapshotState r5 = r5.state     // Catch:{ all -> 0x0107 }
            androidx.paging.LoadState$Error r7 = new androidx.paging.LoadState$Error     // Catch:{ all -> 0x0107 }
            androidx.paging.PagingSource$LoadResult$Error r6 = (androidx.paging.PagingSource.LoadResult.Error) r6     // Catch:{ all -> 0x0107 }
            java.lang.Throwable r6 = r6.getThrowable()     // Catch:{ all -> 0x0107 }
            r7.<init>(r6)     // Catch:{ all -> 0x0107 }
            r0.L$0 = r3     // Catch:{ all -> 0x0107 }
            r0.L$1 = r12     // Catch:{ all -> 0x0107 }
            r0.L$2 = r4     // Catch:{ all -> 0x0107 }
            r0.L$3 = r5     // Catch:{ all -> 0x0107 }
            r6 = 0
            r0.L$4 = r6     // Catch:{ all -> 0x04dd }
            r0.L$5 = r6     // Catch:{ all -> 0x04dd }
            r6 = 7
            r0.label = r6     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r9.setError(r5, r3, r7, r0)     // Catch:{ all -> 0x0107 }
            if (r0 != r2) goto L_0x04c9
            return r2
        L_0x04c9:
            r0 = r5
            r5 = r12
        L_0x04cb:
            java.util.Map r0 = r0.getFailedHintsByLoadType$paging_common()     // Catch:{ all -> 0x0107 }
            androidx.paging.ViewportHint r2 = r5.getHint()     // Catch:{ all -> 0x0107 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0107 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0107 }
            r2 = 0
            r4.mo74907b(r2)
            return r0
        L_0x04dd:
            r0 = move-exception
            r2 = r6
        L_0x04df:
            r4.mo74907b(r2)
            throw r0
        L_0x04e3:
            boolean r7 = r2 instanceof androidx.paging.PagingSource.LoadResult.Invalid
            if (r7 == 0) goto L_0x04ed
            r9.onInvalidLoad()
            ja.u r0 = p297ja.C13339u.f61331a
            return r0
        L_0x04ed:
            int[] r7 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0
            int r14 = r13.ordinal()
            r7 = r7[r14]
            r14 = 2
            if (r7 != r14) goto L_0x04fb
            androidx.paging.LoadType r7 = androidx.paging.LoadType.APPEND
            goto L_0x04fd
        L_0x04fb:
            androidx.paging.LoadType r7 = androidx.paging.LoadType.PREPEND
        L_0x04fd:
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r15 = r9.stateHolder
            kotlinx.coroutines.sync.b r5 = r15.lock
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r0
            r3.L$6 = r8
            r3.L$7 = r2
            r3.L$8 = r7
            r3.L$9 = r15
            r3.L$10 = r5
            r14 = 8
            r3.label = r14
            r18 = r0
            r14 = 0
            java.lang.Object r0 = r5.mo74906a(r14, r3)
            if (r0 != r4) goto L_0x0527
            return r4
        L_0x0527:
            r14 = r12
            r12 = r10
            r10 = r9
            r9 = r8
            r8 = r2
            r2 = r5
            r5 = r15
            r15 = r13
            r13 = r11
            r11 = r18
        L_0x0532:
            androidx.paging.PageFetcherSnapshotState r0 = r5.state     // Catch:{ all -> 0x0689 }
            androidx.paging.ViewportHint r5 = r14.getHint()     // Catch:{ all -> 0x0689 }
            androidx.paging.PageEvent$Drop r5 = r0.dropEventOrNull(r7, r5)     // Catch:{ all -> 0x0689 }
            if (r5 != 0) goto L_0x0544
            r5 = r2
            r7 = r8
            r8 = r9
            goto L_0x057c
        L_0x0544:
            r0.drop(r5)     // Catch:{ all -> 0x0689 }
            kotlinx.coroutines.channels.f<androidx.paging.PageEvent<Value>> r7 = r10.pageEventCh     // Catch:{ all -> 0x0689 }
            r3.L$0 = r10     // Catch:{ all -> 0x0689 }
            r3.L$1 = r15     // Catch:{ all -> 0x0689 }
            r3.L$2 = r14     // Catch:{ all -> 0x0689 }
            r3.L$3 = r13     // Catch:{ all -> 0x0689 }
            r3.L$4 = r12     // Catch:{ all -> 0x0689 }
            r3.L$5 = r11     // Catch:{ all -> 0x0689 }
            r3.L$6 = r9     // Catch:{ all -> 0x0689 }
            r3.L$7 = r8     // Catch:{ all -> 0x0689 }
            r3.L$8 = r2     // Catch:{ all -> 0x0689 }
            r3.L$9 = r0     // Catch:{ all -> 0x0689 }
            r1 = 0
            r3.L$10 = r1     // Catch:{ all -> 0x0686 }
            r1 = 9
            r3.label = r1     // Catch:{ all -> 0x0689 }
            java.lang.Object r1 = r7.send(r5, r3)     // Catch:{ all -> 0x0689 }
            if (r1 != r4) goto L_0x056b
            return r4
        L_0x056b:
            r5 = r2
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r10
        L_0x0574:
            ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00bc }
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r9
        L_0x057c:
            int r1 = r14.getGenerationId()     // Catch:{ all -> 0x00bc }
            androidx.paging.ViewportHint r2 = r14.getHint()     // Catch:{ all -> 0x00bc }
            int r2 = r2.presentedItemsBeyondAnchor$paging_common(r15)     // Catch:{ all -> 0x00bc }
            int r9 = r13.element     // Catch:{ all -> 0x00bc }
            int r2 = r2 + r9
            java.lang.Object r1 = r10.nextLoadKeyOrNull(r0, r15, r1, r2)     // Catch:{ all -> 0x00bc }
            r12.element = r1     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x05b7
            androidx.paging.MutableLoadStateCollection r1 = r0.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x00bc }
            androidx.paging.LoadState r1 = r1.get(r15)     // Catch:{ all -> 0x00bc }
            boolean r1 = r1 instanceof androidx.paging.LoadState.Error     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x05b7
            androidx.paging.MutableLoadStateCollection r1 = r0.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x00bc }
            boolean r2 = r11.element     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x05ae
            androidx.paging.LoadState$NotLoading$Companion r2 = androidx.paging.LoadState.NotLoading.Companion     // Catch:{ all -> 0x00bc }
            androidx.paging.LoadState$NotLoading r2 = r2.getComplete$paging_common()     // Catch:{ all -> 0x00bc }
            goto L_0x05b4
        L_0x05ae:
            androidx.paging.LoadState$NotLoading$Companion r2 = androidx.paging.LoadState.NotLoading.Companion     // Catch:{ all -> 0x00bc }
            androidx.paging.LoadState$NotLoading r2 = r2.getIncomplete$paging_common()     // Catch:{ all -> 0x00bc }
        L_0x05b4:
            r1.set(r15, r2)     // Catch:{ all -> 0x00bc }
        L_0x05b7:
            r1 = r7
            androidx.paging.PagingSource$LoadResult$Page r1 = (androidx.paging.PagingSource.LoadResult.Page) r1     // Catch:{ all -> 0x00bc }
            androidx.paging.PageEvent r0 = r0.toPageEvent$paging_common(r1, r15)     // Catch:{ all -> 0x00bc }
            kotlinx.coroutines.channels.f<androidx.paging.PageEvent<Value>> r1 = r10.pageEventCh     // Catch:{ all -> 0x00bc }
            r3.L$0 = r10     // Catch:{ all -> 0x00bc }
            r3.L$1 = r15     // Catch:{ all -> 0x00bc }
            r3.L$2 = r14     // Catch:{ all -> 0x00bc }
            r3.L$3 = r13     // Catch:{ all -> 0x00bc }
            r3.L$4 = r12     // Catch:{ all -> 0x00bc }
            r3.L$5 = r11     // Catch:{ all -> 0x00bc }
            r3.L$6 = r8     // Catch:{ all -> 0x00bc }
            r3.L$7 = r7     // Catch:{ all -> 0x00bc }
            r3.L$8 = r5     // Catch:{ all -> 0x00bc }
            r2 = 0
            r3.L$9 = r2     // Catch:{ all -> 0x0683 }
            r3.L$10 = r2     // Catch:{ all -> 0x0683 }
            r2 = 10
            r3.label = r2     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r1.send(r0, r3)     // Catch:{ all -> 0x00bc }
            if (r0 != r4) goto L_0x05e2
            return r4
        L_0x05e2:
            r0 = r7
            r7 = r8
            r8 = r11
            r9 = r13
            r11 = r15
            r16 = r14
            r14 = r10
            r10 = r16
        L_0x05ec:
            ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00bc }
            r1 = 0
            r5.mo74907b(r1)
            boolean r1 = r7 instanceof androidx.paging.PagingSource.LoadParams.Prepend
            if (r1 == 0) goto L_0x0601
            r1 = r0
            androidx.paging.PagingSource$LoadResult$Page r1 = (androidx.paging.PagingSource.LoadResult.Page) r1
            java.lang.Object r1 = r1.getPrevKey()
            if (r1 != 0) goto L_0x0601
            r5 = 1
            goto L_0x0602
        L_0x0601:
            r5 = 0
        L_0x0602:
            boolean r1 = r7 instanceof androidx.paging.PagingSource.LoadParams.Append
            if (r1 == 0) goto L_0x0610
            androidx.paging.PagingSource$LoadResult$Page r0 = (androidx.paging.PagingSource.LoadResult.Page) r0
            java.lang.Object r0 = r0.getNextKey()
            if (r0 != 0) goto L_0x0610
            r0 = 1
            goto L_0x0611
        L_0x0610:
            r0 = 0
        L_0x0611:
            androidx.paging.RemoteMediatorConnection r1 = r14.getRemoteMediatorConnection()
            if (r1 == 0) goto L_0x067c
            if (r5 != 0) goto L_0x061b
            if (r0 == 0) goto L_0x067c
        L_0x061b:
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r13 = r14.stateHolder
            kotlinx.coroutines.sync.b r1 = r13.lock
            r3.L$0 = r14
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r9
            r3.L$4 = r12
            r3.L$5 = r8
            r3.L$6 = r13
            r3.L$7 = r1
            r2 = 0
            r3.L$8 = r2
            r3.I$0 = r5
            r3.I$1 = r0
            r7 = 11
            r3.label = r7
            java.lang.Object r7 = r1.mo74906a(r2, r3)
            if (r7 != r4) goto L_0x0643
            return r4
        L_0x0643:
            r16 = r14
            r14 = r8
            r8 = r12
            r12 = r16
        L_0x0649:
            androidx.paging.PageFetcherSnapshotState r2 = r13.state     // Catch:{ all -> 0x0676 }
            androidx.paging.HintHandler r7 = r12.hintHandler     // Catch:{ all -> 0x0676 }
            androidx.paging.ViewportHint$Access r7 = r7.getLastAccessHint()     // Catch:{ all -> 0x0676 }
            androidx.paging.PagingState r2 = r2.currentPagingState$paging_common(r7)     // Catch:{ all -> 0x0676 }
            r7 = 0
            r1.mo74907b(r7)
            if (r5 == 0) goto L_0x0666
            androidx.paging.RemoteMediatorConnection r1 = r12.getRemoteMediatorConnection()
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            r1.requestLoad(r5, r2)
        L_0x0666:
            if (r0 == 0) goto L_0x0671
            androidx.paging.RemoteMediatorConnection r0 = r12.getRemoteMediatorConnection()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            r0.requestLoad(r1, r2)
        L_0x0671:
            r1 = r17
            r0 = r14
            goto L_0x0353
        L_0x0676:
            r0 = move-exception
            r2 = 0
            r1.mo74907b(r2)
            throw r0
        L_0x067c:
            r1 = r17
            r0 = r8
            r8 = r12
            r12 = r14
            goto L_0x0353
        L_0x0683:
            r0 = move-exception
            r1 = r2
            goto L_0x068d
        L_0x0686:
            r0 = move-exception
            r5 = r2
            goto L_0x068d
        L_0x0689:
            r0 = move-exception
            r5 = r2
            goto L_0x00bd
        L_0x068d:
            r5.mo74907b(r1)
            throw r0
        L_0x0691:
            ja.u r0 = p297ja.C13339u.f61331a
            return r0
        L_0x0694:
            r0 = move-exception
            r7 = r5
            goto L_0x01ab
        L_0x0698:
            r7.mo74907b(r1)
            throw r0
        L_0x069c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x06a2 }
            r0.<init>(r6)     // Catch:{ all -> 0x06a2 }
            throw r0     // Catch:{ all -> 0x06a2 }
        L_0x06a2:
            r0 = move-exception
            r1 = 0
            r2.mo74907b(r1)
            throw r0
        L_0x06a8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doLoad(androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, kotlin.coroutines.d):java.lang.Object");
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.Companion.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.generationId$paging_common(loadType) || (pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType) instanceof LoadState.Error) || i2 >= this.config.prefetchDistance) {
            return null;
        }
        if (loadType == LoadType.PREPEND) {
            return ((PagingSource.LoadResult.Page) C13566b0.m87422W(pageFetcherSnapshotState.getPages$paging_common())).getPrevKey();
        }
        return ((PagingSource.LoadResult.Page) C13566b0.m87434i0(pageFetcherSnapshotState.getPages$paging_common())).getNextKey();
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }

    /* access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, C13635d<? super C13339u> dVar) {
        boolean z = true;
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object doInitialLoad = doInitialLoad(dVar);
            return doInitialLoad == C13652d.m87832c() ? doInitialLoad : C13339u.f61331a;
        }
        if (viewportHint == null) {
            z = false;
        }
        if (z) {
            this.hintHandler.forceSetHint(loadType, viewportHint);
            return C13339u.f61331a;
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
    }

    /* access modifiers changed from: private */
    public final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, C13635d<? super C13339u> dVar) {
        if (C13706o.m87924a(pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType), error)) {
            return C13339u.f61331a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common().set(loadType, error);
        Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common().snapshot(), (LoadStates) null), dVar);
        return send == C13652d.m87832c() ? send : C13339u.f61331a;
    }

    /* access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, C13635d<? super C13339u> dVar) {
        LoadState loadState = pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType);
        LoadState.Loading loading = LoadState.Loading.INSTANCE;
        if (C13706o.m87924a(loadState, loading)) {
            return C13339u.f61331a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common().set(loadType, loading);
        Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common().snapshot(), (LoadStates) null), dVar);
        return send == C13652d.m87832c() ? send : C13339u.f61331a;
    }

    /* access modifiers changed from: private */
    public final void startConsumingHints(C15478k0 k0Var) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            for (LoadType pageFetcherSnapshot$startConsumingHints$1$1 : C13614t.m87751m(LoadType.APPEND, LoadType.PREPEND)) {
                C15561w1 unused = C15473j.m94492d(k0Var, (C13640g) null, (C15486m0) null, new PageFetcherSnapshot$startConsumingHints$1$1(this, pageFetcherSnapshot$startConsumingHints$1$1, (C13635d<? super PageFetcherSnapshot$startConsumingHints$1$1>) null), 3, (Object) null);
            }
        }
        C15561w1 unused2 = C15473j.m94492d(k0Var, (C13640g) null, (C15486m0) null, new PageFetcherSnapshot$startConsumingHints$2(this, (C13635d<? super PageFetcherSnapshot$startConsumingHints$2>) null), 3, (Object) null);
        C15561w1 unused3 = C15473j.m94492d(k0Var, (C13640g) null, (C15486m0) null, new PageFetcherSnapshot$startConsumingHints$3(this, (C13635d<? super PageFetcherSnapshot$startConsumingHints$3>) null), 3, (Object) null);
    }

    public final void accessHint(ViewportHint viewportHint) {
        C13706o.m87929f(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public final void close() {
        C15561w1.C15562a.m94723a(this.pageEventChannelFlowJob, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object currentPagingState(kotlin.coroutines.C13635d<? super androidx.paging.PagingState<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.C15536b) r1
            java.lang.Object r2 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            p297ja.C13332o.m85685b(r6)
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003e:
            p297ja.C13332o.m85685b(r6)
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r2 = r5.stateHolder
            kotlinx.coroutines.sync.b r6 = r2.lock
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r0 = r6.mo74906a(r3, r0)
            if (r0 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
            r1 = r6
        L_0x0058:
            androidx.paging.PageFetcherSnapshotState r6 = r2.state     // Catch:{ all -> 0x006a }
            androidx.paging.HintHandler r0 = r0.hintHandler     // Catch:{ all -> 0x006a }
            androidx.paging.ViewportHint$Access r0 = r0.getLastAccessHint()     // Catch:{ all -> 0x006a }
            androidx.paging.PagingState r6 = r6.currentPagingState$paging_common(r0)     // Catch:{ all -> 0x006a }
            r1.mo74907b(r3)
            return r6
        L_0x006a:
            r6 = move-exception
            r1.mo74907b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.currentPagingState(kotlin.coroutines.d):java.lang.Object");
    }

    public final Key getInitialKey$paging_common() {
        return this.initialKey;
    }

    public final C15285f<PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PageFetcherSnapshot(java.lang.Object r12, androidx.paging.PagingSource r13, androidx.paging.PagingConfig r14, kotlinx.coroutines.flow.C15285f r15, boolean r16, androidx.paging.RemoteMediatorConnection r17, androidx.paging.PagingState r18, p370qa.C16254a r19, int r20, kotlin.jvm.internal.C13695i r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r7 = 0
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r2
            goto L_0x0014
        L_0x0012:
            r8 = r17
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r18
        L_0x001c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0024
            androidx.paging.PageFetcherSnapshot$1 r0 = androidx.paging.PageFetcherSnapshot.C09051.INSTANCE
            r10 = r0
            goto L_0x0026
        L_0x0024:
            r10 = r19
        L_0x0026:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.<init>(java.lang.Object, androidx.paging.PagingSource, androidx.paging.PagingConfig, kotlinx.coroutines.flow.f, boolean, androidx.paging.RemoteMediatorConnection, androidx.paging.PagingState, qa.a, int, kotlin.jvm.internal.i):void");
    }
}
