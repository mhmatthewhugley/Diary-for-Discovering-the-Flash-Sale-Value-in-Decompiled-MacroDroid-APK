package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;
import p433xa.C16879h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002deB#\b\u0017\u0012\n\u0010]\u001a\u0006\u0012\u0002\b\u00030\\\u0012\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^¢\u0006\u0004\b`\u0010aB\u001f\b\u0017\u0012\u0006\u0010b\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b`\u0010cJ2\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\"\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016JM\u0010\u0019\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J0\u0010\u001c\u001a\u00020\b2(\u0010\u001e\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u001dJ\u0016\u0010\u001f\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J0\u0010\u001f\u001a\u00020\b2(\u0010\u001e\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u001dJ\"\u0010\"\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u001dH\u0016J\"\u0010#\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u001dH\u0016R\"\u0010%\u001a\u00020$8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0000X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u00103\u001a\u0002028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R,\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a098\u0000X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00101\u001a\u0004\b<\u0010=R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u000e\u0010?\u0012\u0004\b@\u00101R$\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\f\n\u0004\bA\u0010?\u0012\u0004\bB\u00101R(\u0010C\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u00101\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u00101R2\u0010O\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u001d0N8\u0000X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0002X\u0004¢\u0006\f\n\u0004\bT\u0010U\u0012\u0004\bV\u00101R\u0014\u0010X\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010FR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038VX\u0004¢\u0006\f\u0012\u0004\b[\u00101\u001a\u0004\bY\u0010Z¨\u0006f"}, mo71668d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", "T", "Landroidx/paging/PagedList;", "previousList", "currentList", "Ljava/lang/Runnable;", "commitCallback", "Lja/u;", "onCurrentListChanged", "", "index", "getItem", "(I)Ljava/lang/Object;", "pagedList", "submitList", "newList", "diffSnapshot", "Landroidx/paging/NullPaddedDiffResult;", "diffResult", "Landroidx/paging/RecordingCallback;", "recordingCallback", "lastAccessIndex", "latchPagedList$paging_runtime_release", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/NullPaddedDiffResult;Landroidx/paging/RecordingCallback;ILjava/lang/Runnable;)V", "latchPagedList", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "listener", "addPagedListListener", "Lkotlin/Function2;", "callback", "removePagedListListener", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "addLoadStateListener", "removeLoadStateListener", "Landroidx/recyclerview/widget/ListUpdateCallback;", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getUpdateCallback$paging_runtime_release", "()Landroidx/recyclerview/widget/ListUpdateCallback;", "setUpdateCallback$paging_runtime_release", "(Landroidx/recyclerview/widget/ListUpdateCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release", "()Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release$annotations", "()V", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "Landroidx/paging/PagedList;", "getPagedList$annotations", "snapshot", "getSnapshot$annotations", "maxScheduledGeneration", "I", "getMaxScheduledGeneration$paging_runtime_release", "()I", "setMaxScheduledGeneration$paging_runtime_release", "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager$annotations", "", "loadStateListeners", "Ljava/util/List;", "getLoadStateListeners$paging_runtime_release", "()Ljava/util/List;", "Landroidx/paging/PagedList$Callback;", "pagedListCallback", "Landroidx/paging/PagedList$Callback;", "getPagedListCallback$annotations", "getItemCount", "itemCount", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "listUpdateCallback", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "OnCurrentListChangedWrapper", "PagedListListener", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: AsyncPagedListDiffer.kt */
public class AsyncPagedListDiffer<T> {
    private final AsyncDifferConfig<T> config;
    private final CopyOnWriteArrayList<PagedListListener<T>> listeners = new CopyOnWriteArrayList<>();
    private final C16879h<C13339u> loadStateListener;
    private final List<C16269p<LoadType, LoadState, C13339u>> loadStateListeners;
    private final PagedList.LoadStateManager loadStateManager;
    private Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    private PagedList<T> pagedList;
    private final PagedList.Callback pagedListCallback;
    private PagedList<T> snapshot;
    public ListUpdateCallback updateCallback;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\n\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016R9\u0010\n\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo71668d2 = {"Landroidx/paging/AsyncPagedListDiffer$OnCurrentListChangedWrapper;", "", "T", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "Landroidx/paging/PagedList;", "previousList", "currentList", "Lja/u;", "onCurrentListChanged", "Lkotlin/Function2;", "callback", "Lqa/p;", "getCallback", "()Lqa/p;", "<init>", "(Lqa/p;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: AsyncPagedListDiffer.kt */
    private static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {
        private final C16269p<PagedList<T>, PagedList<T>, C13339u> callback;

        public OnCurrentListChangedWrapper(C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u> pVar) {
            C13706o.m87929f(pVar, "callback");
            this.callback = pVar;
        }

        public final C16269p<PagedList<T>, PagedList<T>, C13339u> getCallback() {
            return this.callback;
        }

        public void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2) {
            this.callback.invoke(pagedList, pagedList2);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H&¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "", "T", "Landroidx/paging/PagedList;", "previousList", "currentList", "Lja/u;", "onCurrentListChanged", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: AsyncPagedListDiffer.kt */
    public interface PagedListListener<T> {
        void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2);
    }

    public AsyncPagedListDiffer(RecyclerView.Adapter<?> adapter, DiffUtil.ItemCallback<T> itemCallback) {
        C13706o.m87929f(adapter, "adapter");
        C13706o.m87929f(itemCallback, "diffCallback");
        Executor mainThreadExecutor2 = ArchTaskExecutor.getMainThreadExecutor();
        C13706o.m87928e(mainThreadExecutor2, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor2;
        AsyncPagedListDiffer$loadStateManager$1 asyncPagedListDiffer$loadStateManager$1 = new AsyncPagedListDiffer$loadStateManager$1(this);
        this.loadStateManager = asyncPagedListDiffer$loadStateManager$1;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(asyncPagedListDiffer$loadStateManager$1);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new AsyncPagedListDiffer$pagedListCallback$1(this);
        setUpdateCallback$paging_runtime_release(new AdapterListUpdateCallback(adapter));
        AsyncDifferConfig<T> build = new AsyncDifferConfig.Builder(itemCallback).build();
        C13706o.m87928e(build, "Builder(diffCallback).build()");
        this.config = build;
    }

    public static /* synthetic */ void getConfig$paging_runtime_release$annotations() {
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListeners$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getLoadStateManager$annotations() {
    }

    public static /* synthetic */ void getMaxScheduledGeneration$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getPagedList$annotations() {
    }

    private static /* synthetic */ void getPagedListCallback$annotations() {
    }

    private static /* synthetic */ void getSnapshot$annotations() {
    }

    private final void onCurrentListChanged(PagedList<T> pagedList2, PagedList<T> pagedList3, Runnable runnable) {
        for (PagedListListener onCurrentListChanged : this.listeners) {
            onCurrentListChanged.onCurrentListChanged(pagedList2, pagedList3);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList2 != null) {
            pagedList2.addWeakLoadStateListener(pVar);
        } else {
            this.loadStateManager.dispatchCurrentLoadState(pVar);
        }
        this.loadStateListeners.add(pVar);
    }

    public void addPagedListListener(PagedListListener<T> pagedListListener) {
        C13706o.m87929f(pagedListListener, "listener");
        this.listeners.add(pagedListListener);
    }

    public final AsyncDifferConfig<T> getConfig$paging_runtime_release() {
        return this.config;
    }

    public PagedList<T> getCurrentList() {
        PagedList<T> pagedList2 = this.snapshot;
        return pagedList2 == null ? this.pagedList : pagedList2;
    }

    public T getItem(int i) {
        PagedList<T> pagedList2 = this.snapshot;
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList2 != null) {
            return pagedList2.get(i);
        }
        if (pagedList3 != null) {
            pagedList3.loadAround(i);
            return pagedList3.get(i);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    public int getItemCount() {
        PagedList currentList = getCurrentList();
        if (currentList == null) {
            return 0;
        }
        return currentList.size();
    }

    public final CopyOnWriteArrayList<PagedListListener<T>> getListeners$paging_runtime_release() {
        return this.listeners;
    }

    public final List<C16269p<LoadType, LoadState, C13339u>> getLoadStateListeners$paging_runtime_release() {
        return this.loadStateListeners;
    }

    public final Executor getMainThreadExecutor$paging_runtime_release() {
        return this.mainThreadExecutor;
    }

    public final int getMaxScheduledGeneration$paging_runtime_release() {
        return this.maxScheduledGeneration;
    }

    public final ListUpdateCallback getUpdateCallback$paging_runtime_release() {
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        C13706o.m87945v("updateCallback");
        return null;
    }

    public final void latchPagedList$paging_runtime_release(PagedList<T> pagedList2, PagedList<T> pagedList3, NullPaddedDiffResult nullPaddedDiffResult, RecordingCallback recordingCallback, int i, Runnable runnable) {
        C13706o.m87929f(pagedList2, "newList");
        C13706o.m87929f(pagedList3, "diffSnapshot");
        C13706o.m87929f(nullPaddedDiffResult, "diffResult");
        C13706o.m87929f(recordingCallback, "recordingCallback");
        PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = pagedList2;
        pagedList2.addWeakLoadStateListener((C16269p) this.loadStateListener);
        this.snapshot = null;
        NullPaddedListDiffHelperKt.dispatchDiff(pagedList4.getNullPaddedList(), getUpdateCallback$paging_runtime_release(), pagedList3.getNullPaddedList(), nullPaddedDiffResult);
        recordingCallback.dispatchRecordingTo(this.pagedListCallback);
        pagedList2.addWeakCallback(this.pagedListCallback);
        if (!pagedList2.isEmpty()) {
            pagedList2.loadAround(C16792h.m99544f(NullPaddedListDiffHelperKt.transformAnchorIndex(pagedList4.getNullPaddedList(), nullPaddedDiffResult, pagedList3.getNullPaddedList(), i), 0, pagedList2.size() - 1));
        }
        onCurrentListChanged(pagedList4, this.pagedList, runnable);
    }

    public void removeLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        this.loadStateListeners.remove(pVar);
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList2 != null) {
            pagedList2.removeWeakLoadStateListener(pVar);
        }
    }

    public void removePagedListListener(PagedListListener<T> pagedListListener) {
        C13706o.m87929f(pagedListListener, "listener");
        this.listeners.remove(pagedListListener);
    }

    public final void setMainThreadExecutor$paging_runtime_release(Executor executor) {
        C13706o.m87929f(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }

    public final void setMaxScheduledGeneration$paging_runtime_release(int i) {
        this.maxScheduledGeneration = i;
    }

    public final void setUpdateCallback$paging_runtime_release(ListUpdateCallback listUpdateCallback) {
        C13706o.m87929f(listUpdateCallback, "<set-?>");
        this.updateCallback = listUpdateCallback;
    }

    public void submitList(PagedList<T> pagedList2) {
        submitList(pagedList2, (Runnable) null);
    }

    public final void addPagedListListener(C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u> pVar) {
        C13706o.m87929f(pVar, "callback");
        this.listeners.add(new OnCurrentListChangedWrapper(pVar));
    }

    public final void removePagedListListener(C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u> pVar) {
        C13706o.m87929f(pVar, "callback");
        boolean unused = C13624y.m87795D(this.listeners, new AsyncPagedListDiffer$removePagedListListener$1(pVar));
    }

    public void submitList(PagedList<T> pagedList2, Runnable runnable) {
        int i = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i;
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList2 == pagedList3) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (pagedList3 == null || !(pagedList2 instanceof InitialPagedList)) {
            PagedList currentList = getCurrentList();
            if (pagedList2 == null) {
                int itemCount = getItemCount();
                if (pagedList3 != null) {
                    pagedList3.removeWeakCallback(this.pagedListCallback);
                    pagedList3.removeWeakLoadStateListener((C16269p) this.loadStateListener);
                    this.pagedList = null;
                } else if (this.snapshot != null) {
                    this.snapshot = null;
                }
                getUpdateCallback$paging_runtime_release().onRemoved(0, itemCount);
                onCurrentListChanged(currentList, (PagedList) null, runnable);
            } else if (getCurrentList() == null) {
                this.pagedList = pagedList2;
                pagedList2.addWeakLoadStateListener((C16269p) this.loadStateListener);
                pagedList2.addWeakCallback(this.pagedListCallback);
                getUpdateCallback$paging_runtime_release().onInserted(0, pagedList2.size());
                onCurrentListChanged((PagedList) null, pagedList2, runnable);
            } else {
                PagedList<T> pagedList4 = this.pagedList;
                if (pagedList4 != null) {
                    pagedList4.removeWeakCallback(this.pagedListCallback);
                    pagedList4.removeWeakLoadStateListener((C16269p) this.loadStateListener);
                    this.snapshot = (PagedList) pagedList4.snapshot();
                    this.pagedList = null;
                }
                PagedList<T> pagedList5 = this.snapshot;
                if (pagedList5 == null || this.pagedList != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                RecordingCallback recordingCallback = new RecordingCallback();
                pagedList2.addWeakCallback(recordingCallback);
                this.config.getBackgroundThreadExecutor().execute(new AsyncPagedListDiffer$submitList$2(pagedList5, (PagedList) pagedList2.snapshot(), this, i, pagedList2, recordingCallback, runnable));
            }
        } else {
            pagedList3.removeWeakCallback(this.pagedListCallback);
            pagedList3.removeWeakLoadStateListener((C16269p) this.loadStateListener);
            this.loadStateManager.setState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
            this.loadStateManager.setState(LoadType.PREPEND, new LoadState.NotLoading(false));
            this.loadStateManager.setState(LoadType.APPEND, new LoadState.NotLoading(false));
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AsyncPagedListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> asyncDifferConfig) {
        C13706o.m87929f(listUpdateCallback, "listUpdateCallback");
        C13706o.m87929f(asyncDifferConfig, "config");
        Executor mainThreadExecutor2 = ArchTaskExecutor.getMainThreadExecutor();
        C13706o.m87928e(mainThreadExecutor2, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor2;
        AsyncPagedListDiffer$loadStateManager$1 asyncPagedListDiffer$loadStateManager$1 = new AsyncPagedListDiffer$loadStateManager$1(this);
        this.loadStateManager = asyncPagedListDiffer$loadStateManager$1;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(asyncPagedListDiffer$loadStateManager$1);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new AsyncPagedListDiffer$pagedListCallback$1(this);
        setUpdateCallback$paging_runtime_release(listUpdateCallback);
        this.config = asyncDifferConfig;
    }
}
