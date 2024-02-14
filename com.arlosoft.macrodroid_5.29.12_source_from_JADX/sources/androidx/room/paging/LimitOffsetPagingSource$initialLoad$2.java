package androidx.room.paging;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H@"}, mo71668d2 = {"", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", mo71894f = "LimitOffsetPagingSource.kt", mo71895l = {104}, mo71896m = "invokeSuspend")
/* compiled from: LimitOffsetPagingSource.kt */
final class LimitOffsetPagingSource$initialLoad$2 extends C13665l implements C16265l<C13635d<? super PagingSource.LoadResult<Integer, Value>>, Object> {
    final /* synthetic */ PagingSource.LoadParams<Integer> $params;
    int label;
    final /* synthetic */ LimitOffsetPagingSource<Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LimitOffsetPagingSource$initialLoad$2(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, C13635d<? super LimitOffsetPagingSource$initialLoad$2> dVar) {
        super(1, dVar);
        this.this$0 = limitOffsetPagingSource;
        this.$params = loadParams;
    }

    public final C13635d<C13339u> create(C13635d<?> dVar) {
        return new LimitOffsetPagingSource$initialLoad$2(this.this$0, this.$params, dVar);
    }

    public final Object invoke(C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        return ((LimitOffsetPagingSource$initialLoad$2) create(dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            int access$queryItemCount = this.this$0.queryItemCount();
            this.this$0.getItemCount$room_paging_release().set(access$queryItemCount);
            LimitOffsetPagingSource<Value> limitOffsetPagingSource = this.this$0;
            PagingSource.LoadParams<Integer> loadParams = this.$params;
            this.label = 1;
            obj = limitOffsetPagingSource.loadFromDb(loadParams, access$queryItemCount, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
