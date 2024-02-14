package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPageEventFlow$job$1", mo71894f = "CachedPageEventFlow.kt", mo71895l = {257}, mo71896m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
final class CachedPageEventFlow$job$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C15285f<PageEvent<T>> $src;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$job$1(C15285f<? extends PageEvent<T>> fVar, CachedPageEventFlow<T> cachedPageEventFlow, C13635d<? super CachedPageEventFlow$job$1> dVar) {
        super(2, dVar);
        this.$src = fVar;
        this.this$0 = cachedPageEventFlow;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((CachedPageEventFlow$job$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15285f<C13592k0<PageEvent<T>>> E = C15290h.m94114E(this.$src);
            CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 cachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 = new CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1(this.this$0);
            this.label = 1;
            if (E.collect(cachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1, this) == c) {
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
