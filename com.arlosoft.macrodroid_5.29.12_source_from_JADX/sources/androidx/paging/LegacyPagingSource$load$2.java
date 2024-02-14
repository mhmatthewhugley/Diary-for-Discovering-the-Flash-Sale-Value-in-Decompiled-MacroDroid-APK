package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagingSource$LoadResult$Page;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.LegacyPagingSource$load$2", mo71894f = "LegacyPagingSource.kt", mo71895l = {111}, mo71896m = "invokeSuspend")
/* compiled from: LegacyPagingSource.kt */
final class LegacyPagingSource$load$2 extends C13665l implements C16269p<C15478k0, C13635d<? super PagingSource.LoadResult.Page<Key, Value>>, Object> {
    final /* synthetic */ DataSource.Params<Key> $dataSourceParams;
    final /* synthetic */ PagingSource.LoadParams<Key> $params;
    int label;
    final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyPagingSource$load$2(LegacyPagingSource<Key, Value> legacyPagingSource, DataSource.Params<Key> params, PagingSource.LoadParams<Key> loadParams, C13635d<? super LegacyPagingSource$load$2> dVar) {
        super(2, dVar);
        this.this$0 = legacyPagingSource;
        this.$dataSourceParams = params;
        this.$params = loadParams;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new LegacyPagingSource$load$2(this.this$0, this.$dataSourceParams, this.$params, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super PagingSource.LoadResult.Page<Key, Value>> dVar) {
        return ((LegacyPagingSource$load$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            DataSource<Key, Value> dataSource$paging_common = this.this$0.getDataSource$paging_common();
            DataSource.Params<Key> params = this.$dataSourceParams;
            this.label = 1;
            obj = dataSource$paging_common.load$paging_common(params, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PagingSource.LoadParams<Key> loadParams = this.$params;
        DataSource.BaseResult baseResult = (DataSource.BaseResult) obj;
        List<Value> list = baseResult.data;
        return new PagingSource.LoadResult.Page(list, (!list.isEmpty() || !(loadParams instanceof PagingSource.LoadParams.Prepend)) ? baseResult.getPrevKey() : null, (!baseResult.data.isEmpty() || !(loadParams instanceof PagingSource.LoadParams.Append)) ? baseResult.getNextKey() : null, baseResult.getItemsBefore(), baseResult.getItemsAfter());
    }
}
