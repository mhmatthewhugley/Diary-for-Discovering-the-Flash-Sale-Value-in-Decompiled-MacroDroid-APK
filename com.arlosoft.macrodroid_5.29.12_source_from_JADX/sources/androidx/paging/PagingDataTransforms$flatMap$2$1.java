package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "T", "R", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PageEvent;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagingDataTransforms$flatMap$2$1", mo71894f = "PagingDataTransforms.kt", mo71895l = {83}, mo71896m = "invokeSuspend")
/* compiled from: PagingDataTransforms.kt */
final class PagingDataTransforms$flatMap$2$1 extends C13665l implements C16269p<C15478k0, C13635d<? super PageEvent<R>>, Object> {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ C16265l<T, Iterable<R>> $transform;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H@"}, mo71668d2 = {"", "T", "R", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.PagingDataTransforms$flatMap$2$1$1", mo71894f = "PagingDataTransforms.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms$flatMap$2$1$1 */
    /* compiled from: PagingDataTransforms.kt */
    static final class C09441 extends C13665l implements C16269p<T, C13635d<? super Iterable<? extends R>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C09441 r0 = new C09441(lVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(T t, C13635d<? super Iterable<? extends R>> dVar) {
            return ((C09441) create(t, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                return lVar.invoke(this.L$0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$flatMap$2$1(PageEvent<T> pageEvent, C16265l<? super T, ? extends Iterable<? extends R>> lVar, C13635d<? super PagingDataTransforms$flatMap$2$1> dVar) {
        super(2, dVar);
        this.$event = pageEvent;
        this.$transform = lVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new PagingDataTransforms$flatMap$2$1(this.$event, this.$transform, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super PageEvent<R>> dVar) {
        return ((PagingDataTransforms$flatMap$2$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            PageEvent<T> pageEvent = this.$event;
            final C16265l<T, Iterable<R>> lVar = this.$transform;
            C09441 r1 = new C09441((C13635d<? super C09441>) null);
            this.label = 1;
            obj = pageEvent.flatMap(r1, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
