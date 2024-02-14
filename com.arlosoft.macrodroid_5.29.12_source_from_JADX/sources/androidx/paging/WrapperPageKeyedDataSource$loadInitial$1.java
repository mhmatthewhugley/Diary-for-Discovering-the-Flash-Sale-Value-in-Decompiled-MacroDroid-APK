package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, mo71668d2 = {"androidx/paging/WrapperPageKeyedDataSource$loadInitial$1", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lja/u;", "onResult", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperPageKeyedDataSource.kt */
public final class WrapperPageKeyedDataSource$loadInitial$1 extends PageKeyedDataSource.LoadInitialCallback<K, A> {
    final /* synthetic */ PageKeyedDataSource.LoadInitialCallback<K, B> $callback;
    final /* synthetic */ WrapperPageKeyedDataSource<K, A, B> this$0;

    WrapperPageKeyedDataSource$loadInitial$1(WrapperPageKeyedDataSource<K, A, B> wrapperPageKeyedDataSource, PageKeyedDataSource.LoadInitialCallback<K, B> loadInitialCallback) {
        this.this$0 = wrapperPageKeyedDataSource;
        this.$callback = loadInitialCallback;
    }

    public void onResult(List<? extends A> list, int i, int i2, K k, K k2) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.$callback.onResult(DataSource.Companion.convert$paging_common(this.this$0.listFunction, list), i, i2, k, k2);
    }

    public void onResult(List<? extends A> list, K k, K k2) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.$callback.onResult(DataSource.Companion.convert$paging_common(this.this$0.listFunction, list), k, k2);
    }
}
