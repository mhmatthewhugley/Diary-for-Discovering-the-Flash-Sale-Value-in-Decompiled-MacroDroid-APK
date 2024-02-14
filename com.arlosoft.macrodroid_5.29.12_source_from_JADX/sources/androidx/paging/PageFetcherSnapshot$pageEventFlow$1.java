package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", mo71894f = "PageFetcherSnapshot.kt", mo71895l = {608, 163, 619}, mo71896m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
final class PageFetcherSnapshot$pageEventFlow$1 extends C13665l implements C16269p<SimpleProducerScope<PageEvent<Value>>, C13635d<? super C13339u>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, C13635d<? super PageFetcherSnapshot$pageEventFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = pageFetcherSnapshot;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, dVar);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, C13635d<? super C13339u> dVar) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(simpleProducerScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0101 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004a
            if (r1 == r4) goto L_0x0035
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r14.L$2
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C15536b) r0
            java.lang.Object r1 = r14.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState.Holder) r1
            java.lang.Object r2 = r14.L$0
            androidx.paging.SimpleProducerScope r2 = (androidx.paging.SimpleProducerScope) r2
            p297ja.C13332o.m85685b(r15)
            goto L_0x0104
        L_0x0023:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002b:
            java.lang.Object r1 = r14.L$0
            androidx.paging.SimpleProducerScope r1 = (androidx.paging.SimpleProducerScope) r1
            p297ja.C13332o.m85685b(r15)
            r15 = r1
            goto L_0x00e9
        L_0x0035:
            java.lang.Object r1 = r14.L$3
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.C15536b) r1
            java.lang.Object r4 = r14.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            java.lang.Object r6 = r14.L$1
            androidx.paging.RemoteMediatorConnection r6 = (androidx.paging.RemoteMediatorConnection) r6
            java.lang.Object r7 = r14.L$0
            androidx.paging.SimpleProducerScope r7 = (androidx.paging.SimpleProducerScope) r7
            p297ja.C13332o.m85685b(r15)
            goto L_0x00bd
        L_0x004a:
            p297ja.C13332o.m85685b(r15)
            java.lang.Object r15 = r14.L$0
            androidx.paging.SimpleProducerScope r15 = (androidx.paging.SimpleProducerScope) r15
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.pageEventChCollected
            r12 = 0
            boolean r1 = r1.compareAndSet(r12, r4)
            if (r1 == 0) goto L_0x0126
            r7 = 0
            r8 = 0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            r9.<init>(r1, r15, r5)
            r10 = 3
            r11 = 0
            r6 = r15
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r6, r7, r8, r9, r10, r11)
            r1 = 6
            kotlinx.coroutines.channels.f r1 = kotlinx.coroutines.channels.C15225i.m93852d(r12, r5, r5, r1, r5)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3
            androidx.paging.PageFetcherSnapshot<Key, Value> r6 = r14.this$0
            r9.<init>(r6, r1, r5)
            r6 = r15
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r6, r7, r8, r9, r10, r11)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4
            androidx.paging.PageFetcherSnapshot<Key, Value> r6 = r14.this$0
            r9.<init>(r1, r6, r5)
            r6 = r15
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r6, r7, r8, r9, r10, r11)
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            boolean r1 = r1.triggerRemoteRefresh
            if (r1 == 0) goto L_0x00d6
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            androidx.paging.RemoteMediatorConnection r6 = r1.getRemoteMediatorConnection()
            if (r6 != 0) goto L_0x0099
            goto L_0x00d6
        L_0x0099:
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            androidx.paging.PagingState r7 = r1.previousPagingState
            if (r7 != 0) goto L_0x00d1
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r1.stateHolder
            kotlinx.coroutines.sync.b r7 = r1.lock
            r14.L$0 = r15
            r14.L$1 = r6
            r14.L$2 = r1
            r14.L$3 = r7
            r14.label = r4
            java.lang.Object r4 = r7.mo74906a(r5, r14)
            if (r4 != r0) goto L_0x00ba
            return r0
        L_0x00ba:
            r4 = r1
            r1 = r7
            r7 = r15
        L_0x00bd:
            androidx.paging.PageFetcherSnapshotState r15 = r4.state     // Catch:{ all -> 0x00cc }
            androidx.paging.PagingState r15 = r15.currentPagingState$paging_common(r5)     // Catch:{ all -> 0x00cc }
            r1.mo74907b(r5)
            r13 = r7
            r7 = r15
            r15 = r13
            goto L_0x00d1
        L_0x00cc:
            r15 = move-exception
            r1.mo74907b(r5)
            throw r15
        L_0x00d1:
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            r6.requestLoad(r1, r7)
        L_0x00d6:
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            r14.L$0 = r15
            r14.L$1 = r5
            r14.L$2 = r5
            r14.L$3 = r5
            r14.label = r3
            java.lang.Object r1 = r1.doInitialLoad(r14)
            if (r1 != r0) goto L_0x00e9
            return r0
        L_0x00e9:
            androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r14.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r1.stateHolder
            kotlinx.coroutines.sync.b r3 = r1.lock
            r14.L$0 = r15
            r14.L$1 = r1
            r14.L$2 = r3
            r14.label = r2
            java.lang.Object r2 = r3.mo74906a(r5, r14)
            if (r2 != r0) goto L_0x0102
            return r0
        L_0x0102:
            r2 = r15
            r0 = r3
        L_0x0104:
            androidx.paging.PageFetcherSnapshotState r15 = r1.state     // Catch:{ all -> 0x0121 }
            androidx.paging.MutableLoadStateCollection r15 = r15.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x0121 }
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0121 }
            androidx.paging.LoadState r15 = r15.get(r1)     // Catch:{ all -> 0x0121 }
            r0.mo74907b(r5)
            boolean r15 = r15 instanceof androidx.paging.LoadState.Error
            if (r15 != 0) goto L_0x011e
            androidx.paging.PageFetcherSnapshot<Key, Value> r15 = r14.this$0
            r15.startConsumingHints(r2)
        L_0x011e:
            ja.u r15 = p297ja.C13339u.f61331a
            return r15
        L_0x0121:
            r15 = move-exception
            r0.mo74907b(r5)
            throw r15
        L_0x0126:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
