package androidx.paging;

import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.flow.C15299i0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo71668d2 = {"Landroidx/paging/RemoteMediatorAccessor;", "", "Key", "Value", "Landroidx/paging/RemoteMediatorConnection;", "Landroidx/paging/RemoteMediator$InitializeAction;", "initialize", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i0;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/i0;", "state", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
public interface RemoteMediatorAccessor<Key, Value> extends RemoteMediatorConnection<Key, Value> {
    C15299i0<LoadStates> getState();

    Object initialize(C13635d<? super RemoteMediator.InitializeAction> dVar);
}
