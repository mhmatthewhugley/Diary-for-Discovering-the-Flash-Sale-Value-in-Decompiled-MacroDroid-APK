package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15415h0;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/PagingSource;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: DataSource.kt */
final class DataSource$Factory$asPagingSourceFactory$1 extends C13708q implements C16254a<PagingSource<Key, Value>> {
    final /* synthetic */ C15415h0 $fetchDispatcher;
    final /* synthetic */ DataSource.Factory<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataSource$Factory$asPagingSourceFactory$1(C15415h0 h0Var, DataSource.Factory<Key, Value> factory) {
        super(0);
        this.$fetchDispatcher = h0Var;
        this.this$0 = factory;
    }

    public final PagingSource<Key, Value> invoke() {
        return new LegacyPagingSource(this.$fetchDispatcher, this.this$0.create());
    }
}
