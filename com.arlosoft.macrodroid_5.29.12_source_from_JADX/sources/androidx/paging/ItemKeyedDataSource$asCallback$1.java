package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/ItemKeyedDataSource$asCallback$1", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "", "data", "Lja/u;", "onResult", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ItemKeyedDataSource.kt */
public final class ItemKeyedDataSource$asCallback$1 extends ItemKeyedDataSource.LoadCallback<Value> {
    final /* synthetic */ C15492n<DataSource.BaseResult<Value>> $this_asCallback;
    final /* synthetic */ ItemKeyedDataSource<Key, Value> this$0;

    ItemKeyedDataSource$asCallback$1(C15492n<? super DataSource.BaseResult<Value>> nVar, ItemKeyedDataSource<Key, Value> itemKeyedDataSource) {
        this.$this_asCallback = nVar;
        this.this$0 = itemKeyedDataSource;
    }

    public void onResult(List<? extends Value> list) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C15492n<DataSource.BaseResult<Value>> nVar = this.$this_asCallback;
        DataSource.BaseResult baseResult = new DataSource.BaseResult(list, this.this$0.getPrevKey$paging_common(list), this.this$0.getNextKey$paging_common(list), 0, 0, 24, (C13695i) null);
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(baseResult));
    }
}
