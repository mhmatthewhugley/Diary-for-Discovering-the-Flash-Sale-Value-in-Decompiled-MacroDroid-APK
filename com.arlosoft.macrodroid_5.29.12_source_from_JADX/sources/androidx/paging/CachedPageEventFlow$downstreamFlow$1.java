package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13680b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/g;", "Landroidx/paging/PageEvent;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", mo71894f = "CachedPageEventFlow.kt", mo71895l = {257}, mo71896m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
final class CachedPageEventFlow$downstreamFlow$1 extends C13665l implements C16269p<C15288g<? super PageEvent<T>>, C13635d<? super C13339u>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H@"}, mo71668d2 = {"", "T", "Lkotlin/collections/k0;", "Landroidx/paging/PageEvent;", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", mo71894f = "CachedPageEventFlow.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1 */
    /* compiled from: CachedPageEventFlow.kt */
    static final class C08781 extends C13665l implements C16269p<C13592k0<? extends PageEvent<T>>, C13635d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C08781 r0 = new C08781(dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C13592k0<? extends PageEvent<T>> k0Var, C13635d<? super Boolean> dVar) {
            return ((C08781) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                return C13654b.m87833a(((C13592k0) this.L$0) != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, C13635d<? super CachedPageEventFlow$downstreamFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = cachedPageEventFlow;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, dVar);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    public final Object invoke(C15288g<? super PageEvent<T>> gVar, C13635d<? super C13339u> dVar) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C13680b0 b0Var = new C13680b0();
            b0Var.element = Integer.MIN_VALUE;
            C15285f C = C15290h.m94112C(this.this$0.sharedForDownstream, new C08781((C13635d<? super C08781>) null));
            C0875x265e02f4 cachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1 = new C0875x265e02f4(b0Var, (C15288g) this.L$0);
            this.label = 1;
            if (C.collect(cachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1, this) == c) {
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
