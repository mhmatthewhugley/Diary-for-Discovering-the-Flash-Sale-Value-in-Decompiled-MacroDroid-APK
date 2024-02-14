package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", mo71894f = "PagingDataDiffer.kt", mo71895l = {151, 193}, mo71896m = "invokeSuspend")
/* compiled from: PagingDataDiffer.kt */
final class PagingDataDiffer$collectFrom$2$1$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ PageEvent<T> $event;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PagingDataDiffer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataDiffer$collectFrom$2$1$1(PageEvent<T> pageEvent, PagingDataDiffer<T> pagingDataDiffer, C13635d<? super PagingDataDiffer$collectFrom$2$1$1> dVar) {
        super(2, dVar);
        this.$event = pageEvent;
        this.this$0 = pagingDataDiffer;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PagingDataDiffer$collectFrom$2$1$1(this.$event, this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((PagingDataDiffer$collectFrom$2$1$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f7 A[LOOP:1: B:78:0x01f1->B:80:0x01f7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p297ja.C13332o.m85685b(r12)
            goto L_0x00df
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            java.lang.Object r0 = r11.L$1
            kotlin.jvm.internal.a0 r0 = (kotlin.jvm.internal.C13678a0) r0
            java.lang.Object r1 = r11.L$0
            androidx.paging.PagePresenter r1 = (androidx.paging.PagePresenter) r1
            p297ja.C13332o.m85685b(r12)
            goto L_0x0072
        L_0x0028:
            p297ja.C13332o.m85685b(r12)
            androidx.paging.PageEvent<T> r12 = r11.$event
            boolean r1 = r12 instanceof androidx.paging.PageEvent.Insert
            if (r1 == 0) goto L_0x00ce
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            androidx.paging.LoadType r12 = r12.getLoadType()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            if (r12 != r1) goto L_0x00ce
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            r12.lastAccessedIndexUnfulfilled = r4
            androidx.paging.PagePresenter r1 = new androidx.paging.PagePresenter
            androidx.paging.PageEvent<T> r12 = r11.$event
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            r1.<init>(r12)
            kotlin.jvm.internal.a0 r12 = new kotlin.jvm.internal.a0
            r12.<init>()
            androidx.paging.PagingDataDiffer<T> r5 = r11.this$0
            androidx.paging.PagePresenter r6 = r5.presenter
            androidx.paging.PagingDataDiffer<T> r2 = r11.this$0
            int r8 = r2.lastAccessedIndex
            androidx.paging.PagingDataDiffer$collectFrom$2$1$1$transformedLastAccessedIndex$1 r9 = new androidx.paging.PagingDataDiffer$collectFrom$2$1$1$transformedLastAccessedIndex$1
            androidx.paging.PagingDataDiffer<T> r2 = r11.this$0
            r9.<init>(r2, r1, r12)
            r11.L$0 = r1
            r11.L$1 = r12
            r11.label = r3
            r7 = r1
            r10 = r11
            java.lang.Object r2 = r5.presentNewList(r6, r7, r8, r9, r10)
            if (r2 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r0 = r12
            r12 = r2
        L_0x0072:
            java.lang.Integer r12 = (java.lang.Integer) r12
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x00c2
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.PageEvent<T> r2 = r11.$event
            androidx.paging.PageEvent$Insert r2 = (androidx.paging.PageEvent.Insert) r2
            androidx.paging.LoadStates r2 = r2.getSourceLoadStates()
            androidx.paging.PageEvent<T> r3 = r11.$event
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent.Insert) r3
            androidx.paging.LoadStates r3 = r3.getMediatorLoadStates()
            r0.dispatchLoadStates$paging_common(r2, r3)
            if (r12 != 0) goto L_0x00a2
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            androidx.paging.UiReceiver r12 = r12.receiver
            if (r12 != 0) goto L_0x0099
            goto L_0x01dd
        L_0x0099:
            androidx.paging.ViewportHint$Initial r0 = r1.initializeHint()
            r12.accessHint(r0)
            goto L_0x01dd
        L_0x00a2:
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            int r2 = r12.intValue()
            r0.lastAccessedIndex = r2
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.UiReceiver r0 = r0.receiver
            if (r0 != 0) goto L_0x00b5
            goto L_0x01dd
        L_0x00b5:
            int r12 = r12.intValue()
            androidx.paging.ViewportHint$Access r12 = r1.accessHintForPresenterIndex(r12)
            r0.accessHint(r12)
            goto L_0x01dd
        L_0x00c2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106"
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00ce:
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            boolean r12 = r12.postEvents()
            if (r12 == 0) goto L_0x00df
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.C15263e3.m94032a(r11)
            if (r12 != r0) goto L_0x00df
            return r0
        L_0x00df:
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            androidx.paging.PagePresenter r12 = r12.presenter
            androidx.paging.PageEvent<T> r0 = r11.$event
            androidx.paging.PagingDataDiffer<T> r1 = r11.this$0
            androidx.paging.PagingDataDiffer$processPageEventCallback$1 r1 = r1.processPageEventCallback
            r12.processEvent(r0, r1)
            androidx.paging.PageEvent<T> r12 = r11.$event
            boolean r12 = r12 instanceof androidx.paging.PageEvent.Drop
            if (r12 == 0) goto L_0x00fb
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            r12.lastAccessedIndexUnfulfilled = r4
        L_0x00fb:
            androidx.paging.PageEvent<T> r12 = r11.$event
            boolean r12 = r12 instanceof androidx.paging.PageEvent.Insert
            if (r12 == 0) goto L_0x01dd
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            androidx.paging.MutableCombinedLoadStateCollection r12 = r12.combinedLoadStatesCollection
            androidx.paging.LoadStates r12 = r12.getSource()
            androidx.paging.LoadState r12 = r12.getPrepend()
            boolean r12 = r12.getEndOfPaginationReached()
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.MutableCombinedLoadStateCollection r0 = r0.combinedLoadStatesCollection
            androidx.paging.LoadStates r0 = r0.getSource()
            androidx.paging.LoadState r0 = r0.getAppend()
            boolean r0 = r0.getEndOfPaginationReached()
            androidx.paging.PageEvent<T> r1 = r11.$event
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent.Insert) r1
            androidx.paging.LoadType r1 = r1.getLoadType()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r1 != r2) goto L_0x0133
            if (r12 != 0) goto L_0x0142
        L_0x0133:
            androidx.paging.PageEvent<T> r12 = r11.$event
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            androidx.paging.LoadType r12 = r12.getLoadType()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r12 != r1) goto L_0x0144
            if (r0 != 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r12 = 0
            goto L_0x0145
        L_0x0144:
            r12 = 1
        L_0x0145:
            androidx.paging.PageEvent<T> r0 = r11.$event
            androidx.paging.PageEvent$Insert r0 = (androidx.paging.PageEvent.Insert) r0
            java.util.List r0 = r0.getPages()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0159
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0159
        L_0x0157:
            r0 = 1
            goto L_0x0174
        L_0x0159:
            java.util.Iterator r0 = r0.iterator()
        L_0x015d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0157
            java.lang.Object r1 = r0.next()
            androidx.paging.TransformablePage r1 = (androidx.paging.TransformablePage) r1
            java.util.List r1 = r1.getData()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x015d
            r0 = 0
        L_0x0174:
            if (r12 != 0) goto L_0x017c
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            r12.lastAccessedIndexUnfulfilled = r4
            goto L_0x01dd
        L_0x017c:
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            boolean r12 = r12.lastAccessedIndexUnfulfilled
            if (r12 != 0) goto L_0x0186
            if (r0 == 0) goto L_0x01dd
        L_0x0186:
            if (r0 != 0) goto L_0x01b9
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            int r12 = r12.lastAccessedIndex
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.PagePresenter r0 = r0.presenter
            int r0 = r0.getPlaceholdersBefore()
            if (r12 < r0) goto L_0x01b9
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            int r12 = r12.lastAccessedIndex
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.PagePresenter r0 = r0.presenter
            int r0 = r0.getPlaceholdersBefore()
            androidx.paging.PagingDataDiffer<T> r1 = r11.this$0
            androidx.paging.PagePresenter r1 = r1.presenter
            int r1 = r1.getStorageCount()
            int r0 = r0 + r1
            if (r12 <= r0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            if (r3 == 0) goto L_0x01d8
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            androidx.paging.UiReceiver r12 = r12.receiver
            if (r12 != 0) goto L_0x01c4
            goto L_0x01dd
        L_0x01c4:
            androidx.paging.PagingDataDiffer<T> r0 = r11.this$0
            androidx.paging.PagePresenter r0 = r0.presenter
            androidx.paging.PagingDataDiffer<T> r1 = r11.this$0
            int r1 = r1.lastAccessedIndex
            androidx.paging.ViewportHint$Access r0 = r0.accessHintForPresenterIndex(r1)
            r12.accessHint(r0)
            goto L_0x01dd
        L_0x01d8:
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            r12.lastAccessedIndexUnfulfilled = r4
        L_0x01dd:
            androidx.paging.PageEvent<T> r12 = r11.$event
            boolean r0 = r12 instanceof androidx.paging.PageEvent.Insert
            if (r0 != 0) goto L_0x01e7
            boolean r12 = r12 instanceof androidx.paging.PageEvent.Drop
            if (r12 == 0) goto L_0x0201
        L_0x01e7:
            androidx.paging.PagingDataDiffer<T> r12 = r11.this$0
            java.util.concurrent.CopyOnWriteArrayList r12 = r12.onPagesUpdatedListeners
            java.util.Iterator r12 = r12.iterator()
        L_0x01f1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r12.next()
            qa.a r0 = (p370qa.C16254a) r0
            r0.invoke()
            goto L_0x01f1
        L_0x0201:
            ja.u r12 = p297ja.C13339u.f61331a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataDiffer$collectFrom$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
