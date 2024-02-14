package androidx.paging;

import androidx.annotation.IntRange;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010?\u001a\u00020=¢\u0006\u0004\b@\u0010AJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u001b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001aJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\b\u0010\u001f\u001a\u00020\nH\u0016J\u001a\u0010#\u001a\u00020\b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0 J\u001a\u0010$\u001a\u00020\b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0 J\u0014\u0010&\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0%J\u0014\u0010'\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0%J\u0012\u0010+\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(J\u0012\u0010-\u001a\u00020*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030(J\u001e\u0010.\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030(R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020!048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\b048\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, mo71668d2 = {"Landroidx/paging/PagingDataAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", "strategy", "Lja/u;", "setStateRestorationPolicy", "", "position", "", "getItemId", "", "hasStableIds", "setHasStableIds", "Landroidx/paging/PagingData;", "pagingData", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "retry", "refresh", "getItem", "(I)Ljava/lang/Object;", "index", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "getItemCount", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "listener", "addLoadStateListener", "removeLoadStateListener", "Lkotlin/Function0;", "addOnPagesUpdatedListener", "removeOnPagesUpdatedListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "userSetRestorationPolicy", "Z", "Landroidx/paging/AsyncPagingDataDiffer;", "differ", "Landroidx/paging/AsyncPagingDataDiffer;", "Lkotlinx/coroutines/flow/f;", "loadStateFlow", "Lkotlinx/coroutines/flow/f;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/f;", "onPagesUpdatedFlow", "getOnPagesUpdatedFlow", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Lkotlinx/coroutines/h0;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagingDataAdapter.kt */
public abstract class PagingDataAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagingDataDiffer<T> differ;
    private final C15285f<CombinedLoadStates> loadStateFlow;
    private final C15285f<C13339u> onPagesUpdatedFlow;
    private boolean userSetRestorationPolicy;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> itemCallback) {
        this(itemCallback, (C15415h0) null, (C15415h0) null, 6, (C13695i) null);
        C13706o.m87929f(itemCallback, "diffCallback");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(DiffUtil.ItemCallback<T> itemCallback, C15415h0 h0Var) {
        this(itemCallback, h0Var, (C15415h0) null, 4, (C13695i) null);
        C13706o.m87929f(itemCallback, "diffCallback");
        C13706o.m87929f(h0Var, "mainDispatcher");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, C15415h0 h0Var, C15415h0 h0Var2, int i, C13695i iVar) {
        this(itemCallback, (i & 2) != 0 ? C15186a1.m93731c() : h0Var, (i & 4) != 0 ? C15186a1.m93729a() : h0Var2);
    }

    /* access modifiers changed from: private */
    public static final <T, VH extends RecyclerView.ViewHolder> void _init_$considerAllowingStateRestoration(PagingDataAdapter<T, VH> pagingDataAdapter) {
        if (pagingDataAdapter.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !pagingDataAdapter.userSetRestorationPolicy) {
            pagingDataAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
    }

    public final void addLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.differ.addLoadStateListener(lVar);
    }

    public final void addOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.differ.addOnPagesUpdatedListener(aVar);
    }

    /* access modifiers changed from: protected */
    public final T getItem(@IntRange(from = 0) int i) {
        return this.differ.getItem(i);
    }

    public int getItemCount() {
        return this.differ.getItemCount();
    }

    public final long getItemId(int i) {
        return super.getItemId(i);
    }

    public final C15285f<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final C15285f<C13339u> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final T peek(@IntRange(from = 0) int i) {
        return this.differ.peek(i);
    }

    public final void refresh() {
        this.differ.refresh();
    }

    public final void removeLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.differ.removeLoadStateListener(lVar);
    }

    public final void removeOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.differ.removeOnPagesUpdatedListener(aVar);
    }

    public final void retry() {
        this.differ.retry();
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    public void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        C13706o.m87929f(stateRestorationPolicy, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.differ.snapshot();
    }

    public final Object submitData(PagingData<T> pagingData, C13635d<? super C13339u> dVar) {
        Object submitData = this.differ.submitData(pagingData, dVar);
        return submitData == C13652d.m87832c() ? submitData : C13339u.f61331a;
    }

    public final ConcatAdapter withLoadStateFooter(LoadStateAdapter<?> loadStateAdapter) {
        C13706o.m87929f(loadStateAdapter, "footer");
        addLoadStateListener(new PagingDataAdapter$withLoadStateFooter$1(loadStateAdapter));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, loadStateAdapter});
    }

    public final ConcatAdapter withLoadStateHeader(LoadStateAdapter<?> loadStateAdapter) {
        C13706o.m87929f(loadStateAdapter, "header");
        addLoadStateListener(new PagingDataAdapter$withLoadStateHeader$1(loadStateAdapter));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{loadStateAdapter, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(LoadStateAdapter<?> loadStateAdapter, LoadStateAdapter<?> loadStateAdapter2) {
        C13706o.m87929f(loadStateAdapter, "header");
        C13706o.m87929f(loadStateAdapter2, "footer");
        addLoadStateListener(new PagingDataAdapter$withLoadStateHeaderAndFooter$1(loadStateAdapter, loadStateAdapter2));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{loadStateAdapter, this, loadStateAdapter2});
    }

    public final void submitData(Lifecycle lifecycle, PagingData<T> pagingData) {
        C13706o.m87929f(lifecycle, "lifecycle");
        C13706o.m87929f(pagingData, "pagingData");
        this.differ.submitData(lifecycle, pagingData);
    }

    public PagingDataAdapter(DiffUtil.ItemCallback<T> itemCallback, C15415h0 h0Var, C15415h0 h0Var2) {
        C13706o.m87929f(itemCallback, "diffCallback");
        C13706o.m87929f(h0Var, "mainDispatcher");
        C13706o.m87929f(h0Var2, "workerDispatcher");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new AsyncPagingDataDiffer<>(itemCallback, new AdapterListUpdateCallback(this), h0Var, h0Var2);
        this.differ = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) {
            final /* synthetic */ PagingDataAdapter<T, VH> this$0;

            {
                this.this$0 = r1;
            }

            public void onItemRangeInserted(int i, int i2) {
                PagingDataAdapter._init_$considerAllowingStateRestoration(this.this$0);
                this.this$0.unregisterAdapterDataObserver(this);
                super.onItemRangeInserted(i, i2);
            }
        });
        addLoadStateListener(new C16265l<CombinedLoadStates, C13339u>(this) {
            private boolean ignoreNextEvent = true;
            final /* synthetic */ PagingDataAdapter<T, VH> this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CombinedLoadStates) obj);
                return C13339u.f61331a;
            }

            public void invoke(CombinedLoadStates combinedLoadStates) {
                C13706o.m87929f(combinedLoadStates, "loadStates");
                if (this.ignoreNextEvent) {
                    this.ignoreNextEvent = false;
                } else if (combinedLoadStates.getSource().getRefresh() instanceof LoadState.NotLoading) {
                    PagingDataAdapter._init_$considerAllowingStateRestoration(this.this$0);
                    this.this$0.removeLoadStateListener(this);
                }
            }
        });
        this.loadStateFlow = asyncPagingDataDiffer.getLoadStateFlow();
        this.onPagesUpdatedFlow = asyncPagingDataDiffer.getOnPagesUpdatedFlow();
    }
}
