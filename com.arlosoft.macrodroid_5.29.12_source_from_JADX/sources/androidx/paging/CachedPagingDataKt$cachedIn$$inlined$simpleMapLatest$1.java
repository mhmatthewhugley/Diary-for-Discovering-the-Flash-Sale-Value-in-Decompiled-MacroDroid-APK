package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¨\u0006\u0005"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "it", "Lja/u;", "androidx/paging/FlowExtKt$simpleMapLatest$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", mo71894f = "CachedPagingData.kt", mo71895l = {222}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends C13665l implements C16270q<C15288g<? super MulticastedPagingData<T>>, PagingData<T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C15478k0 $scope$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(C13635d dVar, C15478k0 k0Var) {
        super(3, dVar);
        this.$scope$inlined = k0Var;
    }

    public final Object invoke(C15288g<? super MulticastedPagingData<T>> gVar, PagingData<T> pagingData, C13635d<? super C13339u> dVar) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(dVar, this.$scope$inlined);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = gVar;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = pagingData;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            MulticastedPagingData multicastedPagingData = new MulticastedPagingData(this.$scope$inlined, (PagingData) this.L$1, (ActiveFlowTracker) null, 4, (C13695i) null);
            this.label = 1;
            if (((C15288g) this.L$0).emit(multicastedPagingData, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
