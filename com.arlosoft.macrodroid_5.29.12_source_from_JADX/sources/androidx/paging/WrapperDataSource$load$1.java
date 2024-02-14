package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.WrapperDataSource", mo71894f = "WrapperDataSource.kt", mo71895l = {68}, mo71896m = "load$suspendImpl")
/* compiled from: WrapperDataSource.kt */
final class WrapperDataSource$load$1 extends C13656d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WrapperDataSource<Key, ValueFrom, ValueTo> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WrapperDataSource$load$1(WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, C13635d<? super WrapperDataSource$load$1> dVar) {
        super(dVar);
        this.this$0 = wrapperDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WrapperDataSource.load$suspendImpl(this.this$0, (DataSource.Params) null, this);
    }
}
