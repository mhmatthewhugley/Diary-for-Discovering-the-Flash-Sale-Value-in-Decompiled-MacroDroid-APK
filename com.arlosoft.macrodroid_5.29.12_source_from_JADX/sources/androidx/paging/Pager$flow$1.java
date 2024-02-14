package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13704m;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: Pager.kt */
/* synthetic */ class Pager$flow$1 extends C13704m implements C16265l {
    Pager$flow$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(C13635d<? super PagingSource<Key, Value>> dVar) {
        return ((SuspendingPagingSourceFactory) this.receiver).create(dVar);
    }
}
