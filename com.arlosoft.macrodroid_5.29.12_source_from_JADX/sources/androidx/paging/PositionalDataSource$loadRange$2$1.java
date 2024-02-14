package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/PositionalDataSource$loadRange$2$1", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "", "data", "Lja/u;", "onResult", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PositionalDataSource.kt */
public final class PositionalDataSource$loadRange$2$1 extends PositionalDataSource.LoadRangeCallback<T> {
    final /* synthetic */ C15492n<DataSource.BaseResult<T>> $cont;
    final /* synthetic */ PositionalDataSource.LoadRangeParams $params;
    final /* synthetic */ PositionalDataSource<T> this$0;

    PositionalDataSource$loadRange$2$1(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource<T> positionalDataSource, C15492n<? super DataSource.BaseResult<T>> nVar) {
        this.$params = loadRangeParams;
        this.this$0 = positionalDataSource;
        this.$cont = nVar;
    }

    public void onResult(List<? extends T> list) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        int i = this.$params.startPosition;
        Integer valueOf = i == 0 ? null : Integer.valueOf(i);
        if (this.this$0.isInvalid()) {
            C15492n<DataSource.BaseResult<T>> nVar = this.$cont;
            DataSource.BaseResult empty$paging_common = DataSource.BaseResult.Companion.empty$paging_common();
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(empty$paging_common));
            return;
        }
        C15492n<DataSource.BaseResult<T>> nVar2 = this.$cont;
        DataSource.BaseResult baseResult = new DataSource.BaseResult(list, valueOf, Integer.valueOf(this.$params.startPosition + list.size()), 0, 0, 24, (C13695i) null);
        C13329n.C13330a aVar2 = C13329n.f61327a;
        nVar2.resumeWith(C13329n.m85676a(baseResult));
    }
}
