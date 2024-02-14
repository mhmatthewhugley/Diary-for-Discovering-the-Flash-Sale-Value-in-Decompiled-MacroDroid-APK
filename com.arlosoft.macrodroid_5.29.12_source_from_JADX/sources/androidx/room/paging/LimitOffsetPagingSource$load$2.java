package androidx.room.paging;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "Value", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagingSource$LoadResult;", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.paging.LimitOffsetPagingSource$load$2", mo71894f = "LimitOffsetPagingSource.kt", mo71895l = {77, 80}, mo71896m = "invokeSuspend")
/* compiled from: LimitOffsetPagingSource.kt */
final class LimitOffsetPagingSource$load$2 extends C13665l implements C16269p<C15478k0, C13635d<? super PagingSource.LoadResult<Integer, Value>>, Object> {
    final /* synthetic */ PagingSource.LoadParams<Integer> $params;
    int label;
    final /* synthetic */ LimitOffsetPagingSource<Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LimitOffsetPagingSource$load$2(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, C13635d<? super LimitOffsetPagingSource$load$2> dVar) {
        super(2, dVar);
        this.this$0 = limitOffsetPagingSource;
        this.$params = loadParams;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new LimitOffsetPagingSource$load$2(this.this$0, this.$params, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        return ((LimitOffsetPagingSource$load$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p297ja.C13332o.m85685b(r5)
            goto L_0x004f
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            p297ja.C13332o.m85685b(r5)
            goto L_0x003f
        L_0x001e:
            p297ja.C13332o.m85685b(r5)
            androidx.room.paging.LimitOffsetPagingSource<Value> r5 = r4.this$0
            r5.registerObserverIfNecessary()
            androidx.room.paging.LimitOffsetPagingSource<Value> r5 = r4.this$0
            java.util.concurrent.atomic.AtomicInteger r5 = r5.getItemCount$room_paging_release()
            int r5 = r5.get()
            if (r5 >= 0) goto L_0x0042
            androidx.room.paging.LimitOffsetPagingSource<Value> r5 = r4.this$0
            androidx.paging.PagingSource$LoadParams<java.lang.Integer> r1 = r4.$params
            r4.label = r3
            java.lang.Object r5 = r5.initialLoad(r1, r4)
            if (r5 != r0) goto L_0x003f
            return r0
        L_0x003f:
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            goto L_0x006f
        L_0x0042:
            androidx.room.paging.LimitOffsetPagingSource<Value> r1 = r4.this$0
            androidx.paging.PagingSource$LoadParams<java.lang.Integer> r3 = r4.$params
            r4.label = r2
            java.lang.Object r5 = r1.loadFromDb(r3, r5, r4)
            if (r5 != r0) goto L_0x004f
            return r0
        L_0x004f:
            androidx.paging.PagingSource$LoadResult r5 = (androidx.paging.PagingSource.LoadResult) r5
            androidx.room.paging.LimitOffsetPagingSource<Value> r0 = r4.this$0
            androidx.room.RoomDatabase r0 = r0.f666db
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            r0.refreshVersionsSync()
            androidx.room.paging.LimitOffsetPagingSource<Value> r0 = r4.this$0
            boolean r0 = r0.getInvalid()
            if (r0 == 0) goto L_0x006f
            androidx.paging.PagingSource$LoadResult$Invalid r5 = androidx.room.paging.LimitOffsetPagingSourceKt.INVALID
            java.lang.String r0 = "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.LimitOffsetPagingSource>"
            kotlin.jvm.internal.C13706o.m87927d(r5, r0)
        L_0x006f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.LimitOffsetPagingSource$load$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
