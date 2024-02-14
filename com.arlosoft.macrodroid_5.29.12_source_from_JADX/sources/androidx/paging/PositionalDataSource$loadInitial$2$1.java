package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J&\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001e\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, mo71668d2 = {"androidx/paging/PositionalDataSource$loadInitial$2$1", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "Landroidx/paging/DataSource$BaseResult;", "result", "Lja/u;", "resume", "", "data", "", "position", "totalCount", "onResult", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PositionalDataSource.kt */
public final class PositionalDataSource$loadInitial$2$1 extends PositionalDataSource.LoadInitialCallback<T> {
    final /* synthetic */ C15492n<DataSource.BaseResult<T>> $cont;
    final /* synthetic */ PositionalDataSource.LoadInitialParams $params;
    final /* synthetic */ PositionalDataSource<T> this$0;

    PositionalDataSource$loadInitial$2$1(PositionalDataSource<T> positionalDataSource, C15492n<? super DataSource.BaseResult<T>> nVar, PositionalDataSource.LoadInitialParams loadInitialParams) {
        this.this$0 = positionalDataSource;
        this.$cont = nVar;
        this.$params = loadInitialParams;
    }

    private final void resume(PositionalDataSource.LoadInitialParams loadInitialParams, DataSource.BaseResult<T> baseResult) {
        if (loadInitialParams.placeholdersEnabled) {
            baseResult.validateForInitialTiling$paging_common(loadInitialParams.pageSize);
        }
        C15492n<DataSource.BaseResult<T>> nVar = this.$cont;
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(baseResult));
    }

    public void onResult(List<? extends T> list, int i, int i2) {
        Integer num;
        Integer num2;
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        if (this.this$0.isInvalid()) {
            C15492n<DataSource.BaseResult<T>> nVar = this.$cont;
            DataSource.BaseResult empty$paging_common = DataSource.BaseResult.Companion.empty$paging_common();
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(empty$paging_common));
            return;
        }
        int size = list.size() + i;
        PositionalDataSource.LoadInitialParams loadInitialParams = this.$params;
        if (i == 0) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        if (size == i2) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(size);
        }
        resume(loadInitialParams, new DataSource.BaseResult(list, num, num2, i, (i2 - list.size()) - i));
    }

    public void onResult(List<? extends T> list, int i) {
        Integer num;
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        if (this.this$0.isInvalid()) {
            C15492n<DataSource.BaseResult<T>> nVar = this.$cont;
            DataSource.BaseResult empty$paging_common = DataSource.BaseResult.Companion.empty$paging_common();
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(empty$paging_common));
            return;
        }
        PositionalDataSource.LoadInitialParams loadInitialParams = this.$params;
        if (i == 0) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        resume(loadInitialParams, new DataSource.BaseResult(list, num, Integer.valueOf(list.size() + i), i, Integer.MIN_VALUE));
    }
}
