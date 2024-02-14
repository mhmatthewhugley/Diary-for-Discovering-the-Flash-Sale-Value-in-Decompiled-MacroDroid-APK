package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo71668d2 = {"", "Key", "Value", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagingSource;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.SuspendingPagingSourceFactory$create$2", mo71894f = "SuspendingPagingSourceFactory.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: SuspendingPagingSourceFactory.kt */
final class SuspendingPagingSourceFactory$create$2 extends C13665l implements C16269p<C15478k0, C13635d<? super PagingSource<Key, Value>>, Object> {
    int label;
    final /* synthetic */ SuspendingPagingSourceFactory<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPagingSourceFactory$create$2(SuspendingPagingSourceFactory<Key, Value> suspendingPagingSourceFactory, C13635d<? super SuspendingPagingSourceFactory$create$2> dVar) {
        super(2, dVar);
        this.this$0 = suspendingPagingSourceFactory;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new SuspendingPagingSourceFactory$create$2(this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super PagingSource<Key, Value>> dVar) {
        return ((SuspendingPagingSourceFactory$create$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            return this.this$0.delegate.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
