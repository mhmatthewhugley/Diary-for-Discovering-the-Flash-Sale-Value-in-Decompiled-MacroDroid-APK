package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15499o1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H@"}, mo71668d2 = {"", "R", "T", "before", "after", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.PagingDataTransforms$insertSeparators$1", mo71894f = "PagingDataTransforms.kt", mo71895l = {261}, mo71896m = "invokeSuspend")
/* compiled from: PagingDataTransforms.kt */
final class PagingDataTransforms$insertSeparators$1 extends C13665l implements C16270q<T, T, C13635d<? super R>, Object> {
    final /* synthetic */ Executor $executor;
    final /* synthetic */ C16269p<T, T, R> $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "R", "T", "Lkotlinx/coroutines/k0;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.PagingDataTransforms$insertSeparators$1$1", mo71894f = "PagingDataTransforms.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms$insertSeparators$1$1 */
    /* compiled from: PagingDataTransforms.kt */
    static final class C09451 extends C13665l implements C16269p<C15478k0, C13635d<? super R>, Object> {
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C09451(pVar, obj2, obj3, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super R> dVar) {
            return ((C09451) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                return pVar.invoke(obj2, obj3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$insertSeparators$1(Executor executor, C16269p<? super T, ? super T, ? extends R> pVar, C13635d<? super PagingDataTransforms$insertSeparators$1> dVar) {
        super(3, dVar);
        this.$executor = executor;
        this.$generator = pVar;
    }

    public final Object invoke(T t, T t2, C13635d<? super R> dVar) {
        PagingDataTransforms$insertSeparators$1 pagingDataTransforms$insertSeparators$1 = new PagingDataTransforms$insertSeparators$1(this.$executor, this.$generator, dVar);
        pagingDataTransforms$insertSeparators$1.L$0 = t;
        pagingDataTransforms$insertSeparators$1.L$1 = t2;
        return pagingDataTransforms$insertSeparators$1.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final Object obj2 = this.L$0;
            final Object obj3 = this.L$1;
            C15415h0 a = C15499o1.m94574a(this.$executor);
            final C16269p<T, T, R> pVar = this.$generator;
            C09451 r4 = new C09451((C13635d<? super C09451>) null);
            this.L$0 = null;
            this.label = 1;
            obj = C15414h.m94298g(a, r4, this);
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
