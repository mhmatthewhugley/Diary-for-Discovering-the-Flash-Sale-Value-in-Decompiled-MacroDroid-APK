package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"androidx/paging/WrapperPageKeyedDataSource$loadAfter$1", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "", "data", "adjacentPageKey", "Lja/u;", "onResult", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperPageKeyedDataSource.kt */
public final class WrapperPageKeyedDataSource$loadAfter$1 extends PageKeyedDataSource.LoadCallback<K, A> {
    final /* synthetic */ PageKeyedDataSource.LoadCallback<K, B> $callback;
    final /* synthetic */ WrapperPageKeyedDataSource<K, A, B> this$0;

    WrapperPageKeyedDataSource$loadAfter$1(PageKeyedDataSource.LoadCallback<K, B> loadCallback, WrapperPageKeyedDataSource<K, A, B> wrapperPageKeyedDataSource) {
        this.$callback = loadCallback;
        this.this$0 = wrapperPageKeyedDataSource;
    }

    public void onResult(List<? extends A> list, K k) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.$callback.onResult(DataSource.Companion.convert$paging_common(this.this$0.listFunction, list), k);
    }
}
