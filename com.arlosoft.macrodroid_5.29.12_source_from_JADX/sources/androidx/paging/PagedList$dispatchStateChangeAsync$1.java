package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", mo71894f = "PagedList.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: PagedList.kt */
final class PagedList$dispatchStateChangeAsync$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ LoadState $state;
    final /* synthetic */ LoadType $type;
    int label;
    final /* synthetic */ PagedList<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagedList$dispatchStateChangeAsync$1(PagedList<T> pagedList, LoadType loadType, LoadState loadState, C13635d<? super PagedList$dispatchStateChangeAsync$1> dVar) {
        super(2, dVar);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = loadState;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((PagedList$dispatchStateChangeAsync$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            boolean unused2 = C13624y.m87795D(this.this$0.loadStateListeners, C09231.INSTANCE);
            List<WeakReference> access$getLoadStateListeners$p = this.this$0.loadStateListeners;
            LoadType loadType = this.$type;
            LoadState loadState = this.$state;
            for (WeakReference weakReference : access$getLoadStateListeners$p) {
                C16269p pVar = (C16269p) weakReference.get();
                if (pVar != null) {
                    pVar.invoke(loadType, loadState);
                }
            }
            return C13339u.f61331a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
