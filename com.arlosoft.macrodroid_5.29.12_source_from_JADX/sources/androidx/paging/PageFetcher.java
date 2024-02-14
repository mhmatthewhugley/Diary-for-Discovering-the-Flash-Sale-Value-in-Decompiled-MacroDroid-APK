package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002)*B^\u0012(\u0010$\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u0012\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u00020\u0004H\u0002JB\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\tH\u0002J5\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0004R\u0016\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo71668d2 = {"Landroidx/paging/PageFetcher;", "", "Key", "Value", "Lja/u;", "invalidate", "Landroidx/paging/PageFetcherSnapshot;", "Lkotlinx/coroutines/w1;", "job", "Landroidx/paging/RemoteMediatorAccessor;", "accessor", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PageEvent;", "injectRemoteEvents", "Landroidx/paging/PagingSource;", "previousPagingSource", "generateNewPagingSource", "(Landroidx/paging/PagingSource;Lkotlin/coroutines/d;)Ljava/lang/Object;", "refresh", "initialKey", "Ljava/lang/Object;", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/PagingConfig;", "Landroidx/paging/ConflatedEventBus;", "", "refreshEvents", "Landroidx/paging/ConflatedEventBus;", "retryEvents", "Landroidx/paging/PagingData;", "flow", "Lkotlinx/coroutines/flow/f;", "getFlow", "()Lkotlinx/coroutines/flow/f;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "pagingSourceFactory", "Landroidx/paging/RemoteMediator;", "remoteMediator", "<init>", "(Lqa/l;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V", "GenerationInfo", "PagerUiReceiver", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageFetcher.kt */
public final class PageFetcher<Key, Value> {
    /* access modifiers changed from: private */
    public final PagingConfig config;
    private final C15285f<PagingData<Value>> flow;
    /* access modifiers changed from: private */
    public final Key initialKey;
    private final C16265l<C13635d<? super PagingSource<Key, Value>>, Object> pagingSourceFactory;
    /* access modifiers changed from: private */
    public final ConflatedEventBus<Boolean> refreshEvents;
    /* access modifiers changed from: private */
    public final ConflatedEventBus<C13339u> retryEvents;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo71668d2 = {"Landroidx/paging/PageFetcher$GenerationInfo;", "", "Key", "Value", "Landroidx/paging/PageFetcherSnapshot;", "snapshot", "Landroidx/paging/PageFetcherSnapshot;", "getSnapshot", "()Landroidx/paging/PageFetcherSnapshot;", "Landroidx/paging/PagingState;", "state", "Landroidx/paging/PagingState;", "getState", "()Landroidx/paging/PagingState;", "Lkotlinx/coroutines/w1;", "job", "Lkotlinx/coroutines/w1;", "getJob", "()Lkotlinx/coroutines/w1;", "<init>", "(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PagingState;Lkotlinx/coroutines/w1;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageFetcher.kt */
    private static final class GenerationInfo<Key, Value> {
        private final C15561w1 job;
        private final PageFetcherSnapshot<Key, Value> snapshot;
        private final PagingState<Key, Value> state;

        public GenerationInfo(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, PagingState<Key, Value> pagingState, C15561w1 w1Var) {
            C13706o.m87929f(pageFetcherSnapshot, "snapshot");
            C13706o.m87929f(w1Var, "job");
            this.snapshot = pageFetcherSnapshot;
            this.state = pagingState;
            this.job = w1Var;
        }

        public final C15561w1 getJob() {
            return this.job;
        }

        public final PageFetcherSnapshot<Key, Value> getSnapshot() {
            return this.snapshot;
        }

        public final PagingState<Key, Value> getState() {
            return this.state;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B+\u0012\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo71668d2 = {"Landroidx/paging/PageFetcher$PagerUiReceiver;", "", "Key", "Value", "Landroidx/paging/UiReceiver;", "Landroidx/paging/ViewportHint;", "viewportHint", "Lja/u;", "accessHint", "retry", "refresh", "Landroidx/paging/PageFetcherSnapshot;", "pageFetcherSnapshot", "Landroidx/paging/PageFetcherSnapshot;", "getPageFetcherSnapshot$paging_common", "()Landroidx/paging/PageFetcherSnapshot;", "Landroidx/paging/ConflatedEventBus;", "retryEventBus", "Landroidx/paging/ConflatedEventBus;", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/ConflatedEventBus;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageFetcher.kt */
    public final class PagerUiReceiver<Key, Value> implements UiReceiver {
        private final PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        private final ConflatedEventBus<C13339u> retryEventBus;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        public PagerUiReceiver(@VisibleForTesting(otherwise = 2) PageFetcher pageFetcher, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot2, ConflatedEventBus<C13339u> conflatedEventBus) {
            C13706o.m87929f(pageFetcher, "this$0");
            C13706o.m87929f(pageFetcherSnapshot2, "pageFetcherSnapshot");
            C13706o.m87929f(conflatedEventBus, "retryEventBus");
            this.this$0 = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot2;
            this.retryEventBus = conflatedEventBus;
        }

        public void accessHint(ViewportHint viewportHint) {
            C13706o.m87929f(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.accessHint(viewportHint);
        }

        public final PageFetcherSnapshot<Key, Value> getPageFetcherSnapshot$paging_common() {
            return this.pageFetcherSnapshot;
        }

        public void refresh() {
            this.this$0.refresh();
        }

        public void retry() {
            this.retryEventBus.send(C13339u.f61331a);
        }
    }

    public PageFetcher(C16265l<? super C13635d<? super PagingSource<Key, Value>>, ? extends Object> lVar, Key key, PagingConfig pagingConfig, RemoteMediator<Key, Value> remoteMediator) {
        C13706o.m87929f(lVar, "pagingSourceFactory");
        C13706o.m87929f(pagingConfig, "config");
        this.pagingSourceFactory = lVar;
        this.initialKey = key;
        this.config = pagingConfig;
        this.refreshEvents = new ConflatedEventBus<>((Object) null, 1, (C13695i) null);
        this.retryEvents = new ConflatedEventBus<>((Object) null, 1, (C13695i) null);
        this.flow = SimpleChannelFlowKt.simpleChannelFlow(new PageFetcher$flow$1(remoteMediator, this, (C13635d<? super PageFetcher$flow$1>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object generateNewPagingSource(androidx.paging.PagingSource<Key, Value> r5, kotlin.coroutines.C13635d<? super androidx.paging.PagingSource<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcher$generateNewPagingSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher$generateNewPagingSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcher r0 = (androidx.paging.PageFetcher) r0
            p297ja.C13332o.m85685b(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            p297ja.C13332o.m85685b(r6)
            qa.l<kotlin.coroutines.d<? super androidx.paging.PagingSource<Key, Value>>, java.lang.Object> r6 = r4.pagingSourceFactory
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            boolean r1 = r6 instanceof androidx.paging.LegacyPagingSource
            if (r1 == 0) goto L_0x005c
            r1 = r6
            androidx.paging.LegacyPagingSource r1 = (androidx.paging.LegacyPagingSource) r1
            androidx.paging.PagingConfig r2 = r0.config
            int r2 = r2.pageSize
            r1.setPageSize(r2)
        L_0x005c:
            if (r6 == r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x007c
            androidx.paging.PageFetcher$generateNewPagingSource$3 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            r1.<init>(r0)
            r6.registerInvalidatedCallback(r1)
            if (r5 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            androidx.paging.PageFetcher$generateNewPagingSource$4 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            r1.<init>(r0)
            r5.unregisterInvalidatedCallback(r1)
        L_0x0075:
            if (r5 != 0) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            r5.invalidate()
        L_0x007b:
            return r6
        L_0x007c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.generateNewPagingSource(androidx.paging.PagingSource, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C15285f<PageEvent<Value>> injectRemoteEvents(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C15561w1 w1Var, RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor) {
        if (remoteMediatorAccessor == null) {
            return pageFetcherSnapshot.getPageEventFlow();
        }
        return CancelableChannelFlowKt.cancelableChannelFlow(w1Var, new PageFetcher$injectRemoteEvents$1(remoteMediatorAccessor, pageFetcherSnapshot, new MutableLoadStateCollection(), (C13635d<? super PageFetcher$injectRemoteEvents$1>) null));
    }

    /* access modifiers changed from: private */
    public final void invalidate() {
        this.refreshEvents.send(Boolean.FALSE);
    }

    public final C15285f<PagingData<Value>> getFlow() {
        return this.flow;
    }

    public final void refresh() {
        this.refreshEvents.send(Boolean.TRUE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageFetcher(C16265l lVar, Object obj, PagingConfig pagingConfig, RemoteMediator remoteMediator, int i, C13695i iVar) {
        this(lVar, obj, pagingConfig, (i & 8) != 0 ? null : remoteMediator);
    }
}
