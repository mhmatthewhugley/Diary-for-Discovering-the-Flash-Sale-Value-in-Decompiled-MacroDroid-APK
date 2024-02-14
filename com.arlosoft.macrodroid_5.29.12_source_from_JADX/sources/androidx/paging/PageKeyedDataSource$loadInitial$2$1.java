package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, mo71668d2 = {"androidx/paging/PageKeyedDataSource$loadInitial$2$1", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lja/u;", "onResult", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageKeyedDataSource.kt */
public final class PageKeyedDataSource$loadInitial$2$1 extends PageKeyedDataSource.LoadInitialCallback<Key, Value> {
    final /* synthetic */ C15492n<DataSource.BaseResult<Value>> $cont;

    PageKeyedDataSource$loadInitial$2$1(C15492n<? super DataSource.BaseResult<Value>> nVar) {
        this.$cont = nVar;
    }

    public void onResult(List<? extends Value> list, int i, int i2, Key key, Key key2) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C15492n<DataSource.BaseResult<Value>> nVar = this.$cont;
        DataSource.BaseResult baseResult = new DataSource.BaseResult(list, key, key2, i, (i2 - list.size()) - i);
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(baseResult));
    }

    public void onResult(List<? extends Value> list, Key key, Key key2) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C15492n<DataSource.BaseResult<Value>> nVar = this.$cont;
        DataSource.BaseResult baseResult = new DataSource.BaseResult(list, key, key2, 0, 0, 24, (C13695i) null);
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(baseResult));
    }
}
