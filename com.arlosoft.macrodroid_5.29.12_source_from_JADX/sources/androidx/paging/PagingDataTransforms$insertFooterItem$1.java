package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H@"}, mo71668d2 = {"", "T", "<anonymous parameter 0>", "after", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagingDataTransforms$insertFooterItem$1", mo71894f = "PagingDataTransforms.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: PagingDataTransforms.kt */
final class PagingDataTransforms$insertFooterItem$1 extends C13665l implements C16270q<T, T, C13635d<? super T>, Object> {
    final /* synthetic */ T $item;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$insertFooterItem$1(T t, C13635d<? super PagingDataTransforms$insertFooterItem$1> dVar) {
        super(3, dVar);
        this.$item = t;
    }

    public final Object invoke(T t, T t2, C13635d<? super T> dVar) {
        PagingDataTransforms$insertFooterItem$1 pagingDataTransforms$insertFooterItem$1 = new PagingDataTransforms$insertFooterItem$1(this.$item, dVar);
        pagingDataTransforms$insertFooterItem$1.L$0 = t2;
        return pagingDataTransforms$insertFooterItem$1.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            if (this.L$0 == null) {
                return this.$item;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
