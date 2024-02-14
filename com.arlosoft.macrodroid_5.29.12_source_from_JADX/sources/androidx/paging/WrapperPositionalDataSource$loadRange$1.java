package androidx.paging;

import androidx.paging.PositionalDataSource;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/WrapperPositionalDataSource$loadRange$1", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "", "data", "Lja/u;", "onResult", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperPositionalDataSource.kt */
public final class WrapperPositionalDataSource$loadRange$1 extends PositionalDataSource.LoadRangeCallback<A> {
    final /* synthetic */ PositionalDataSource.LoadRangeCallback<B> $callback;
    final /* synthetic */ WrapperPositionalDataSource<A, B> this$0;

    WrapperPositionalDataSource$loadRange$1(PositionalDataSource.LoadRangeCallback<B> loadRangeCallback, WrapperPositionalDataSource<A, B> wrapperPositionalDataSource) {
        this.$callback = loadRangeCallback;
        this.this$0 = wrapperPositionalDataSource;
    }

    public void onResult(List<? extends A> list) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.$callback.onResult(DataSource.Companion.convert$paging_common(this.this$0.getListFunction(), list));
    }
}
