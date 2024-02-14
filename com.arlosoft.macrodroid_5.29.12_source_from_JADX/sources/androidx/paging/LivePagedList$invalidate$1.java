package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.LivePagedList$invalidate$1", mo71894f = "LivePagedList.kt", mo71895l = {82, 90}, mo71896m = "invokeSuspend")
/* compiled from: LivePagedList.kt */
final class LivePagedList$invalidate$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LivePagedList<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LivePagedList$invalidate$1(LivePagedList<Key, Value> livePagedList, C13635d<? super LivePagedList$invalidate$1> dVar) {
        super(2, dVar);
        this.this$0 = livePagedList;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new LivePagedList$invalidate$1(this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((LivePagedList$invalidate$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r0 = r9.L$1
            java.lang.Object r1 = r9.L$0
            androidx.paging.PagingSource r1 = (androidx.paging.PagingSource) r1
            p297ja.C13332o.m85685b(r10)
            r8 = r0
            goto L_0x00a4
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            java.lang.Object r1 = r9.L$0
            androidx.paging.PagingSource r1 = (androidx.paging.PagingSource) r1
            p297ja.C13332o.m85685b(r10)
            goto L_0x0081
        L_0x002a:
            p297ja.C13332o.m85685b(r10)
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            androidx.paging.PagedList r10 = r10.currentData
            androidx.paging.PagingSource r10 = r10.getPagingSource()
            androidx.paging.LivePagedList<Key, Value> r1 = r9.this$0
            qa.a r1 = r1.callback
            r10.unregisterInvalidatedCallback(r1)
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            qa.a r10 = r10.pagingSourceFactory
            java.lang.Object r10 = r10.invoke()
            androidx.paging.PagingSource r10 = (androidx.paging.PagingSource) r10
            androidx.paging.LivePagedList<Key, Value> r1 = r9.this$0
            qa.a r1 = r1.callback
            r10.registerInvalidatedCallback(r1)
            boolean r1 = r10 instanceof androidx.paging.LegacyPagingSource
            if (r1 == 0) goto L_0x0067
            r1 = r10
            androidx.paging.LegacyPagingSource r1 = (androidx.paging.LegacyPagingSource) r1
            androidx.paging.LivePagedList<Key, Value> r4 = r9.this$0
            androidx.paging.PagedList$Config r4 = r4.config
            int r4 = r4.pageSize
            r1.setPageSize(r4)
        L_0x0067:
            androidx.paging.LivePagedList<Key, Value> r1 = r9.this$0
            kotlinx.coroutines.h0 r1 = r1.notifyDispatcher
            androidx.paging.LivePagedList$invalidate$1$1 r4 = new androidx.paging.LivePagedList$invalidate$1$1
            androidx.paging.LivePagedList<Key, Value> r5 = r9.this$0
            r6 = 0
            r4.<init>(r5, r6)
            r9.L$0 = r10
            r9.label = r3
            java.lang.Object r1 = kotlinx.coroutines.C15414h.m94298g(r1, r4, r9)
            if (r1 != r0) goto L_0x0080
            return r0
        L_0x0080:
            r1 = r10
        L_0x0081:
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            androidx.paging.PagedList r10 = r10.currentData
            java.lang.Object r10 = r10.getLastKey()
            androidx.paging.LivePagedList<Key, Value> r3 = r9.this$0
            androidx.paging.PagedList$Config r3 = r3.config
            androidx.paging.PagingSource$LoadParams r3 = androidx.paging.PagingSourceKt.toRefreshLoadParams(r3, r10)
            r9.L$0 = r1
            r9.L$1 = r10
            r9.label = r2
            java.lang.Object r2 = r1.load(r3, r9)
            if (r2 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            r8 = r10
            r10 = r2
        L_0x00a4:
            androidx.paging.PagingSource$LoadResult r10 = (androidx.paging.PagingSource.LoadResult) r10
            boolean r0 = r10 instanceof androidx.paging.PagingSource.LoadResult.Invalid
            if (r0 == 0) goto L_0x00bf
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            androidx.paging.PagedList r10 = r10.currentData
            androidx.paging.LoadType r0 = androidx.paging.LoadType.REFRESH
            androidx.paging.LoadState$NotLoading r2 = new androidx.paging.LoadState$NotLoading
            r3 = 0
            r2.<init>(r3)
            r10.setInitialLoadState(r0, r2)
            r1.invalidate()
            goto L_0x0118
        L_0x00bf:
            boolean r0 = r10 instanceof androidx.paging.PagingSource.LoadResult.Error
            if (r0 == 0) goto L_0x00da
            androidx.paging.LivePagedList<Key, Value> r0 = r9.this$0
            androidx.paging.PagedList r0 = r0.currentData
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            androidx.paging.LoadState$Error r2 = new androidx.paging.LoadState$Error
            androidx.paging.PagingSource$LoadResult$Error r10 = (androidx.paging.PagingSource.LoadResult.Error) r10
            java.lang.Throwable r10 = r10.getThrowable()
            r2.<init>(r10)
            r0.setInitialLoadState(r1, r2)
            goto L_0x0118
        L_0x00da:
            boolean r0 = r10 instanceof androidx.paging.PagingSource.LoadResult.Page
            if (r0 == 0) goto L_0x0118
            androidx.paging.PagedList$Companion r0 = androidx.paging.PagedList.Companion
            r2 = r10
            androidx.paging.PagingSource$LoadResult$Page r2 = (androidx.paging.PagingSource.LoadResult.Page) r2
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            kotlinx.coroutines.k0 r3 = r10.coroutineScope
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            kotlinx.coroutines.h0 r4 = r10.notifyDispatcher
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            kotlinx.coroutines.h0 r5 = r10.fetchDispatcher
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            androidx.paging.PagedList$BoundaryCallback r6 = r10.boundaryCallback
            androidx.paging.LivePagedList<Key, Value> r10 = r9.this$0
            androidx.paging.PagedList$Config r7 = r10.config
            androidx.paging.PagedList r10 = r0.create(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.paging.LivePagedList<Key, Value> r0 = r9.this$0
            androidx.paging.PagedList r1 = r0.currentData
            r0.onItemUpdate(r1, r10)
            androidx.paging.LivePagedList<Key, Value> r0 = r9.this$0
            r0.currentData = r10
            androidx.paging.LivePagedList<Key, Value> r0 = r9.this$0
            r0.postValue(r10)
        L_0x0118:
            ja.u r10 = p297ja.C13339u.f61331a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LivePagedList$invalidate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
