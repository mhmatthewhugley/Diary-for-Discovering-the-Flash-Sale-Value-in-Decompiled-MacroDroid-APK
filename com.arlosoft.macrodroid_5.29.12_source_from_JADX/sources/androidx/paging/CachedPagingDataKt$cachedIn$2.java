package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo71668d2 = {"", "T", "Landroidx/paging/MulticastedPagingData;", "prev", "next", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPagingDataKt$cachedIn$2", mo71894f = "CachedPagingData.kt", mo71895l = {99}, mo71896m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
final class CachedPagingDataKt$cachedIn$2 extends C13665l implements C16270q<MulticastedPagingData<T>, MulticastedPagingData<T>, C13635d<? super MulticastedPagingData<T>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    CachedPagingDataKt$cachedIn$2(C13635d<? super CachedPagingDataKt$cachedIn$2> dVar) {
        super(3, dVar);
    }

    public final Object invoke(MulticastedPagingData<T> multicastedPagingData, MulticastedPagingData<T> multicastedPagingData2, C13635d<? super MulticastedPagingData<T>> dVar) {
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(dVar);
        cachedPagingDataKt$cachedIn$2.L$0 = multicastedPagingData;
        cachedPagingDataKt$cachedIn$2.L$1 = multicastedPagingData2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$1;
            this.L$0 = multicastedPagingData;
            this.label = 1;
            return ((MulticastedPagingData) this.L$0).close(this) == c ? c : multicastedPagingData;
        } else if (i == 1) {
            MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
            C13332o.m85685b(obj);
            return multicastedPagingData2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
