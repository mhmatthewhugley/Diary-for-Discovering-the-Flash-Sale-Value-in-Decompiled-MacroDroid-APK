package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/AccessorState;", "it", "Landroidx/paging/PagingState;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1 extends C13708q implements C16265l<AccessorState<Key, Value>, PagingState<Key, Value>> {
    public static final RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1 INSTANCE = new RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1();

    RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1() {
        super(1);
    }

    public final PagingState<Key, Value> invoke(AccessorState<Key, Value> accessorState) {
        C13706o.m87929f(accessorState, "it");
        return accessorState.getPendingRefresh();
    }
}
