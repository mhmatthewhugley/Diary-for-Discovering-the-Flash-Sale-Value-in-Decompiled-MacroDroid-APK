package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15415h0;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/SuspendingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "create", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "invoke", "Lkotlinx/coroutines/h0;", "dispatcher", "Lkotlinx/coroutines/h0;", "delegate", "<init>", "(Lkotlinx/coroutines/h0;Lqa/a;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SuspendingPagingSourceFactory.kt */
public final class SuspendingPagingSourceFactory<Key, Value> implements C16254a<PagingSource<Key, Value>> {
    /* access modifiers changed from: private */
    public final C16254a<PagingSource<Key, Value>> delegate;
    private final C15415h0 dispatcher;

    public SuspendingPagingSourceFactory(C15415h0 h0Var, C16254a<? extends PagingSource<Key, Value>> aVar) {
        C13706o.m87929f(h0Var, "dispatcher");
        C13706o.m87929f(aVar, "delegate");
        this.dispatcher = h0Var;
        this.delegate = aVar;
    }

    public final Object create(C13635d<? super PagingSource<Key, Value>> dVar) {
        return C15414h.m94298g(this.dispatcher, new SuspendingPagingSourceFactory$create$2(this, (C13635d<? super SuspendingPagingSourceFactory$create$2>) null), dVar);
    }

    public PagingSource<Key, Value> invoke() {
        return this.delegate.invoke();
    }
}
