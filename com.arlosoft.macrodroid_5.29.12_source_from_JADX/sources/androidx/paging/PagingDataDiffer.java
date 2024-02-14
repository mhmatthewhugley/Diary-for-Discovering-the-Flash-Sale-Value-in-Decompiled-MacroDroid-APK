package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import kotlinx.coroutines.flow.C15401u;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0001@\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\bP\u0010QJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\bJG\u0010\u0011\u001a\u0004\u0018\u00010\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J!\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0014\u0010\"\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u0014\u0010#\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u001a\u0010&\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060$J\u001a\u0010'\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060$R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020%0C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060C8F¢\u0006\u0006\u001a\u0004\bN\u0010G\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, mo71668d2 = {"Landroidx/paging/PagingDataDiffer;", "", "T", "Landroidx/paging/LoadStates;", "source", "mediator", "Lja/u;", "dispatchLoadStates$paging_common", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "dispatchLoadStates", "Landroidx/paging/NullPaddedList;", "previousList", "newList", "", "lastAccessedIndex", "Lkotlin/Function0;", "onListPresentable", "presentNewList", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;ILqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "postEvents", "Landroidx/paging/PagingData;", "pagingData", "collectFrom", "(Landroidx/paging/PagingData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "index", "get", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "retry", "refresh", "listener", "addOnPagesUpdatedListener", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "removeLoadStateListener", "Landroidx/paging/DifferCallback;", "differCallback", "Landroidx/paging/DifferCallback;", "Lkotlinx/coroutines/h0;", "mainDispatcher", "Lkotlinx/coroutines/h0;", "Landroidx/paging/PagePresenter;", "presenter", "Landroidx/paging/PagePresenter;", "Landroidx/paging/UiReceiver;", "receiver", "Landroidx/paging/UiReceiver;", "Landroidx/paging/MutableCombinedLoadStateCollection;", "combinedLoadStatesCollection", "Landroidx/paging/MutableCombinedLoadStateCollection;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onPagesUpdatedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/paging/SingleRunner;", "collectFromRunner", "Landroidx/paging/SingleRunner;", "lastAccessedIndexUnfulfilled", "Z", "I", "androidx/paging/PagingDataDiffer$processPageEventCallback$1", "processPageEventCallback", "Landroidx/paging/PagingDataDiffer$processPageEventCallback$1;", "Lkotlinx/coroutines/flow/f;", "loadStateFlow", "Lkotlinx/coroutines/flow/f;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/u;", "_onPagesUpdatedFlow", "Lkotlinx/coroutines/flow/u;", "getSize", "()I", "size", "getOnPagesUpdatedFlow", "onPagesUpdatedFlow", "<init>", "(Landroidx/paging/DifferCallback;Lkotlinx/coroutines/h0;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* compiled from: PagingDataDiffer.kt */
public abstract class PagingDataDiffer<T> {
    /* access modifiers changed from: private */
    public final C15401u<C13339u> _onPagesUpdatedFlow;
    private final SingleRunner collectFromRunner;
    /* access modifiers changed from: private */
    public final MutableCombinedLoadStateCollection combinedLoadStatesCollection;
    /* access modifiers changed from: private */
    public final DifferCallback differCallback;
    /* access modifiers changed from: private */
    public volatile int lastAccessedIndex;
    /* access modifiers changed from: private */
    public volatile boolean lastAccessedIndexUnfulfilled;
    private final C15285f<CombinedLoadStates> loadStateFlow;
    /* access modifiers changed from: private */
    public final C15415h0 mainDispatcher;
    /* access modifiers changed from: private */
    public final CopyOnWriteArrayList<C16254a<C13339u>> onPagesUpdatedListeners;
    /* access modifiers changed from: private */
    public PagePresenter<T> presenter;
    /* access modifiers changed from: private */
    public final PagingDataDiffer$processPageEventCallback$1 processPageEventCallback;
    /* access modifiers changed from: private */
    public UiReceiver receiver;

    public PagingDataDiffer(DifferCallback differCallback2, C15415h0 h0Var) {
        C13706o.m87929f(differCallback2, "differCallback");
        C13706o.m87929f(h0Var, "mainDispatcher");
        this.differCallback = differCallback2;
        this.mainDispatcher = h0Var;
        this.presenter = PagePresenter.Companion.initial$paging_common();
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        this.combinedLoadStatesCollection = mutableCombinedLoadStateCollection;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, (C13695i) null);
        this.processPageEventCallback = new PagingDataDiffer$processPageEventCallback$1(this);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getFlow();
        this._onPagesUpdatedFlow = C15276b0.m94086a(0, 64, C15220e.DROP_OLDEST);
        addOnPagesUpdatedListener(new C16254a<C13339u>(this) {
            final /* synthetic */ PagingDataDiffer<T> this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0._onPagesUpdatedFlow.mo74652b(C13339u.f61331a);
            }
        });
    }

    public final void addLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.combinedLoadStatesCollection.addListener(lVar);
    }

    public final void addOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.onPagesUpdatedListeners.add(aVar);
    }

    public final Object collectFrom(PagingData<T> pagingData, C13635d<? super C13339u> dVar) {
        Object runInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new PagingDataDiffer$collectFrom$2(this, pagingData, (C13635d<? super PagingDataDiffer$collectFrom$2>) null), dVar, 1, (Object) null);
        return runInIsolation$default == C13652d.m87832c() ? runInIsolation$default : C13339u.f61331a;
    }

    public final void dispatchLoadStates$paging_common(LoadStates loadStates, LoadStates loadStates2) {
        C13706o.m87929f(loadStates, "source");
        if (!C13706o.m87924a(this.combinedLoadStatesCollection.getSource(), loadStates) || !C13706o.m87924a(this.combinedLoadStatesCollection.getMediator(), loadStates2)) {
            this.combinedLoadStatesCollection.set(loadStates, loadStates2);
        }
    }

    public final T get(@IntRange(from = 0) int i) {
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = i;
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.accessHint(this.presenter.accessHintForPresenterIndex(i));
        }
        return this.presenter.get(i);
    }

    public final C15285f<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final C15285f<C13339u> getOnPagesUpdatedFlow() {
        return C15290h.m94115a(this._onPagesUpdatedFlow);
    }

    public final int getSize() {
        return this.presenter.getSize();
    }

    public final T peek(@IntRange(from = 0) int i) {
        return this.presenter.get(i);
    }

    public boolean postEvents() {
        return false;
    }

    public abstract Object presentNewList(NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2, int i, C16254a<C13339u> aVar, C13635d<? super Integer> dVar);

    public final void refresh() {
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.refresh();
        }
    }

    public final void removeLoadStateListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.combinedLoadStatesCollection.removeListener(lVar);
    }

    public final void removeOnPagesUpdatedListener(C16254a<C13339u> aVar) {
        C13706o.m87929f(aVar, "listener");
        this.onPagesUpdatedListeners.remove(aVar);
    }

    public final void retry() {
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.retry();
        }
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.presenter.snapshot();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingDataDiffer(DifferCallback differCallback2, C15415h0 h0Var, int i, C13695i iVar) {
        this(differCallback2, (i & 2) != 0 ? C15186a1.m93731c() : h0Var);
    }
}
