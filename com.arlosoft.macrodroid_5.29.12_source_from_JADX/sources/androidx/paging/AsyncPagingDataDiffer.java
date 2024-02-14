package androidx.paging;

import androidx.annotation.IntRange;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u00014\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020!¢\u0006\u0004\bD\u0010EJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u0014\u0010\u0016\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u001a\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R \u0010&\u001a\u00020%8\u0000X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R(\u0010-\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010+\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00180:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050:8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0011\u0010C\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bA\u0010B\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, mo71668d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", "T", "Landroidx/paging/PagingData;", "pagingData", "Lja/u;", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "retry", "refresh", "", "index", "getItem", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "Lkotlin/Function0;", "listener", "addOnPagesUpdatedListener", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "removeLoadStateListener", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "Lkotlinx/coroutines/h0;", "mainDispatcher", "Lkotlinx/coroutines/h0;", "workerDispatcher", "Landroidx/paging/DifferCallback;", "differCallback", "Landroidx/paging/DifferCallback;", "getDifferCallback$paging_runtime_release", "()Landroidx/paging/DifferCallback;", "getDifferCallback$paging_runtime_release$annotations", "()V", "", "inGetItem", "Z", "getInGetItem$paging_runtime_release", "()Z", "setInGetItem$paging_runtime_release", "(Z)V", "getInGetItem$paging_runtime_release$annotations", "androidx/paging/AsyncPagingDataDiffer$differBase$1", "differBase", "Landroidx/paging/AsyncPagingDataDiffer$differBase$1;", "Ljava/util/concurrent/atomic/AtomicInteger;", "submitDataId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/flow/f;", "loadStateFlow", "Lkotlinx/coroutines/flow/f;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/f;", "onPagesUpdatedFlow", "getOnPagesUpdatedFlow", "getItemCount", "()I", "itemCount", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer<T> {
    /* access modifiers changed from: private */
    public final DiffUtil.ItemCallback<T> diffCallback;
    /* access modifiers changed from: private */
    public final AsyncPagingDataDiffer$differBase$1 differBase;
    private final DifferCallback differCallback;
    private boolean inGetItem;
    private final C15285f<CombinedLoadStates> loadStateFlow;
    private final C15415h0 mainDispatcher;
    private final C15285f<C13339u> onPagesUpdatedFlow;
    /* access modifiers changed from: private */
    public final AtomicInteger submitDataId;
    /* access modifiers changed from: private */
    public final ListUpdateCallback updateCallback;
    /* access modifiers changed from: private */
    public final C15415h0 workerDispatcher;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> itemCallback, ListUpdateCallback listUpdateCallback) {
        this(itemCallback, listUpdateCallback, (C15415h0) null, (C15415h0) null, 12, (C13695i) null);
        C13706o.m87929f(itemCallback, "diffCallback");
        C13706o.m87929f(listUpdateCallback, "updateCallback");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> itemCallback, ListUpdateCallback listUpdateCallback, C15415h0 h0Var) {
        this(itemCallback, listUpdateCallback, h0Var, (C15415h0) null, 8, (C13695i) null);
        C13706o.m87929f(itemCallback, "diffCallback");
        C13706o.m87929f(listUpdateCallback, "updateCallback");
        C13706o.m87929f(h0Var, "mainDispatcher");
    }

    public AsyncPagingDataDiffer(DiffUtil.ItemCallback<T> itemCallback, ListUpdateCallback listUpdateCallback, C15415h0 h0Var, C15415h0 h0Var2) {
        C13706o.m87929f(itemCallback, "diffCallback");
        C13706o.m87929f(listUpdateCallback, "updateCallback");
        C13706o.m87929f(h0Var, "mainDispatcher");
        C13706o.m87929f(h0Var2, "workerDispatcher");
        this.diffCallback = itemCallback;
        this.updateCallback = listUpdateCallback;
        this.mainDispatcher = h0Var;
        this.workerDispatcher = h0Var2;
        AsyncPagingDataDiffer$differCallback$1 asyncPagingDataDiffer$differCallback$1 = new AsyncPagingDataDiffer$differCallback$1(this);
        this.differCallback = asyncPagingDataDiffer$differCallback$1;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, asyncPagingDataDiffer$differCallback$1, h0Var);
        this.differBase = asyncPagingDataDiffer$differBase$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = asyncPagingDataDiffer$differBase$1.getLoadStateFlow();
        this.onPagesUpdatedFlow = asyncPagingDataDiffer$differBase$1.getOnPagesUpdatedFlow();
    }

    public static /* synthetic */ void getDifferCallback$paging_runtime_release$annotations() {
    }

    public static /* synthetic */ void getInGetItem$paging_runtime_release$annotations() {
    }

    public final void addLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.differBase.addLoadStateListener(lVar);
    }

    public final void addOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.differBase.addOnPagesUpdatedListener(aVar);
    }

    public final DifferCallback getDifferCallback$paging_runtime_release() {
        return this.differCallback;
    }

    public final boolean getInGetItem$paging_runtime_release() {
        return this.inGetItem;
    }

    /* JADX INFO: finally extract failed */
    public final T getItem(@IntRange(from = 0) int i) {
        try {
            this.inGetItem = true;
            T t = this.differBase.get(i);
            this.inGetItem = false;
            return t;
        } catch (Throwable th) {
            this.inGetItem = false;
            throw th;
        }
    }

    public final int getItemCount() {
        return this.differBase.getSize();
    }

    public final C15285f<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final C15285f<C13339u> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final T peek(@IntRange(from = 0) int i) {
        return this.differBase.peek(i);
    }

    public final void refresh() {
        this.differBase.refresh();
    }

    public final void removeLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.differBase.removeLoadStateListener(lVar);
    }

    public final void removeOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.differBase.removeOnPagesUpdatedListener(aVar);
    }

    public final void retry() {
        this.differBase.retry();
    }

    public final void setInGetItem$paging_runtime_release(boolean z) {
        this.inGetItem = z;
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.differBase.snapshot();
    }

    public final Object submitData(PagingData<T> pagingData, C13635d<? super C13339u> dVar) {
        this.submitDataId.incrementAndGet();
        Object collectFrom = this.differBase.collectFrom(pagingData, dVar);
        return collectFrom == C13652d.m87832c() ? collectFrom : C13339u.f61331a;
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        C13706o.m87929f(lifecycle, "lifecycle");
        C13706o.m87929f(pagingData, "pagingData");
        C15561w1 unused = C15473j.m94492d(LifecycleKt.getCoroutineScope(lifecycle), (C13640g) null, (C15486m0) null, new AsyncPagingDataDiffer$submitData$2(this, this.submitDataId.incrementAndGet(), pagingData, (C13635d<? super AsyncPagingDataDiffer$submitData$2>) null), 3, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, C15415h0 h0Var, C15415h0 h0Var2, int i, C13695i iVar) {
        this(itemCallback, listUpdateCallback, (i & 4) != 0 ? C15186a1.m93731c() : h0Var, (i & 8) != 0 ? C15186a1.m93729a() : h0Var2);
    }
}
