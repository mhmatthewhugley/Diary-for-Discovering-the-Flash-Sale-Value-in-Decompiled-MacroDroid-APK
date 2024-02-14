package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/PagingSource;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.Pager$flow$2", mo71894f = "Pager.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: Pager.kt */
final class Pager$flow$2 extends C13665l implements C16265l<C13635d<? super PagingSource<Key, Value>>, Object> {
    final /* synthetic */ C16254a<PagingSource<Key, Value>> $pagingSourceFactory;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Pager$flow$2(C16254a<? extends PagingSource<Key, Value>> aVar, C13635d<? super Pager$flow$2> dVar) {
        super(1, dVar);
        this.$pagingSourceFactory = aVar;
    }

    public final C13635d<C13339u> create(C13635d<?> dVar) {
        return new Pager$flow$2(this.$pagingSourceFactory, dVar);
    }

    public final Object invoke(C13635d<? super PagingSource<Key, Value>> dVar) {
        return ((Pager$flow$2) create(dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            return this.$pagingSourceFactory.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
