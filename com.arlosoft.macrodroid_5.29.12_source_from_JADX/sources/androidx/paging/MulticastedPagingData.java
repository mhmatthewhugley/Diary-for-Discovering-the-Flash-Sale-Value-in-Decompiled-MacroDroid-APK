package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo71668d2 = {"Landroidx/paging/MulticastedPagingData;", "", "T", "Landroidx/paging/PagingData;", "asPagingData", "Lja/u;", "close", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k0;", "scope", "Lkotlinx/coroutines/k0;", "getScope", "()Lkotlinx/coroutines/k0;", "parent", "Landroidx/paging/PagingData;", "getParent", "()Landroidx/paging/PagingData;", "Landroidx/paging/ActiveFlowTracker;", "tracker", "Landroidx/paging/ActiveFlowTracker;", "getTracker", "()Landroidx/paging/ActiveFlowTracker;", "Landroidx/paging/CachedPageEventFlow;", "accumulated", "Landroidx/paging/CachedPageEventFlow;", "<init>", "(Lkotlinx/coroutines/k0;Landroidx/paging/PagingData;Landroidx/paging/ActiveFlowTracker;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CachedPagingData.kt */
final class MulticastedPagingData<T> {
    private final CachedPageEventFlow<T> accumulated;
    private final PagingData<T> parent;
    private final C15478k0 scope;
    private final ActiveFlowTracker tracker;

    public MulticastedPagingData(C15478k0 k0Var, PagingData<T> pagingData, ActiveFlowTracker activeFlowTracker) {
        C13706o.m87929f(k0Var, "scope");
        C13706o.m87929f(pagingData, "parent");
        this.scope = k0Var;
        this.parent = pagingData;
        this.tracker = activeFlowTracker;
        this.accumulated = new CachedPageEventFlow<>(C15290h.m94137w(C15290h.m94139y(pagingData.getFlow$paging_common(), new MulticastedPagingData$accumulated$1(this, (C13635d<? super MulticastedPagingData$accumulated$1>) null)), new MulticastedPagingData$accumulated$2(this, (C13635d<? super MulticastedPagingData$accumulated$2>) null)), k0Var);
    }

    public final PagingData<T> asPagingData() {
        return new PagingData<>(this.accumulated.getDownstreamFlow(), this.parent.getReceiver$paging_common());
    }

    public final Object close(C13635d<? super C13339u> dVar) {
        this.accumulated.close();
        return C13339u.f61331a;
    }

    public final PagingData<T> getParent() {
        return this.parent;
    }

    public final C15478k0 getScope() {
        return this.scope;
    }

    public final ActiveFlowTracker getTracker() {
        return this.tracker;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MulticastedPagingData(C15478k0 k0Var, PagingData pagingData, ActiveFlowTracker activeFlowTracker, int i, C13695i iVar) {
        this(k0Var, pagingData, (i & 4) != 0 ? null : activeFlowTracker);
    }
}
