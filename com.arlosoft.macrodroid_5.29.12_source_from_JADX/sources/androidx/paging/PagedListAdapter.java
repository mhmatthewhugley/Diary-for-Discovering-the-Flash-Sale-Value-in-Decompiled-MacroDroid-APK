package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b-\u0010.B\u0017\b\u0014\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b-\u00101J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\"\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017J(\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\"\u0010\u0018\u001a\u00020\b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\"\u0010\u0019\u001a\u00020\b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\u0012\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aJ\u0012\u0010\u001f\u001a\u00020\u001c2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001aJ\u001e\u0010 \u001a\u00020\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001aR&\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!8\u0000X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068VX\u0004¢\u0006\f\u0012\u0004\b*\u0010'\u001a\u0004\b(\u0010)¨\u00062"}, mo71668d2 = {"Landroidx/paging/PagedListAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/paging/PagedList;", "pagedList", "Lja/u;", "submitList", "Ljava/lang/Runnable;", "commitCallback", "", "position", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "currentList", "onCurrentListChanged", "previousList", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "listener", "addLoadStateListener", "removeLoadStateListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "Landroidx/paging/AsyncPagedListDiffer;", "differ", "Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release", "()Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release$annotations", "()V", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagedListAdapter.kt */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagedListDiffer<T> differ;
    private final C16269p<PagedList<T>, PagedList<T>, C13339u> listener;

    protected PagedListAdapter(DiffUtil.ItemCallback<T> itemCallback) {
        C13706o.m87929f(itemCallback, "diffCallback");
        PagedListAdapter$listener$1 pagedListAdapter$listener$1 = new PagedListAdapter$listener$1(this);
        this.listener = pagedListAdapter$listener$1;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>((RecyclerView.Adapter<?>) this, itemCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener((C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u>) pagedListAdapter$listener$1);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }

    public void addLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        this.differ.addLoadStateListener(pVar);
    }

    public PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    public final AsyncPagedListDiffer<T> getDiffer$paging_runtime_release() {
        return this.differ;
    }

    /* access modifiers changed from: protected */
    public T getItem(int i) {
        return this.differ.getItem(i);
    }

    public int getItemCount() {
        return this.differ.getItemCount();
    }

    public void onCurrentListChanged(PagedList<T> pagedList) {
    }

    public void onCurrentListChanged(PagedList<T> pagedList, PagedList<T> pagedList2) {
    }

    public void removeLoadStateListener(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "listener");
        this.differ.removeLoadStateListener(pVar);
    }

    public void submitList(PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    public final ConcatAdapter withLoadStateFooter(LoadStateAdapter<?> loadStateAdapter) {
        C13706o.m87929f(loadStateAdapter, "footer");
        addLoadStateListener(new PagedListAdapter$withLoadStateFooter$1(loadStateAdapter));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, loadStateAdapter});
    }

    public final ConcatAdapter withLoadStateHeader(LoadStateAdapter<?> loadStateAdapter) {
        C13706o.m87929f(loadStateAdapter, "header");
        addLoadStateListener(new PagedListAdapter$withLoadStateHeader$1(loadStateAdapter));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{loadStateAdapter, this});
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(LoadStateAdapter<?> loadStateAdapter, LoadStateAdapter<?> loadStateAdapter2) {
        C13706o.m87929f(loadStateAdapter, "header");
        C13706o.m87929f(loadStateAdapter2, "footer");
        addLoadStateListener(new PagedListAdapter$withLoadStateHeaderAndFooter$1(loadStateAdapter, loadStateAdapter2));
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{loadStateAdapter, this, loadStateAdapter2});
    }

    public void submitList(PagedList<T> pagedList, Runnable runnable) {
        this.differ.submitList(pagedList, runnable);
    }

    protected PagedListAdapter(AsyncDifferConfig<T> asyncDifferConfig) {
        C13706o.m87929f(asyncDifferConfig, "config");
        PagedListAdapter$listener$1 pagedListAdapter$listener$1 = new PagedListAdapter$listener$1(this);
        this.listener = pagedListAdapter$listener$1;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>((ListUpdateCallback) new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener((C16269p<? super PagedList<T>, ? super PagedList<T>, C13339u>) pagedListAdapter$listener$1);
    }
}
