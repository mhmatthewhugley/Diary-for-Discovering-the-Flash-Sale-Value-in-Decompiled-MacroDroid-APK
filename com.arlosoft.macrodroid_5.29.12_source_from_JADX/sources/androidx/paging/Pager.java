package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015B7\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0016R)\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, mo71668d2 = {"Landroidx/paging/Pager;", "", "Key", "Value", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PagingData;", "flow", "Lkotlinx/coroutines/flow/f;", "getFlow", "()Lkotlinx/coroutines/flow/f;", "getFlow$annotations", "()V", "Landroidx/paging/PagingConfig;", "config", "initialKey", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "<init>", "(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lqa/a;)V", "(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lqa/a;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Pager.kt */
public final class Pager<Key, Value> {
    private final C15285f<PagingData<Value>> flow;

    @ExperimentalPagingApi
    public Pager(PagingConfig pagingConfig, Key key, RemoteMediator<Key, Value> remoteMediator, C16254a<? extends PagingSource<Key, Value>> aVar) {
        C16265l lVar;
        C13706o.m87929f(pagingConfig, "config");
        C13706o.m87929f(aVar, "pagingSourceFactory");
        if (aVar instanceof SuspendingPagingSourceFactory) {
            lVar = new Pager$flow$1(aVar);
        } else {
            lVar = new Pager$flow$2(aVar, (C13635d<? super Pager$flow$2>) null);
        }
        this.flow = new PageFetcher(lVar, key, pagingConfig, remoteMediator).getFlow();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig pagingConfig, C16254a<? extends PagingSource<Key, Value>> aVar) {
        this(pagingConfig, (Object) null, aVar, 2, (C13695i) null);
        C13706o.m87929f(pagingConfig, "config");
        C13706o.m87929f(aVar, "pagingSourceFactory");
    }

    public static /* synthetic */ void getFlow$annotations() {
    }

    public final C15285f<PagingData<Value>> getFlow() {
        return this.flow;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, RemoteMediator remoteMediator, C16254a aVar, int i, C13695i iVar) {
        this(pagingConfig, (i & 2) != 0 ? null : obj, remoteMediator, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pager(PagingConfig pagingConfig, Object obj, C16254a aVar, int i, C13695i iVar) {
        this(pagingConfig, (i & 2) != 0 ? null : obj, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Pager(PagingConfig pagingConfig, Key key, C16254a<? extends PagingSource<Key, Value>> aVar) {
        this(pagingConfig, key, (RemoteMediator) null, aVar);
        C13706o.m87929f(pagingConfig, "config");
        C13706o.m87929f(aVar, "pagingSourceFactory");
    }
}
