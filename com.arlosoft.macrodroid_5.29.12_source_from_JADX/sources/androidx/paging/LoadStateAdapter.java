package androidx.paging;

import android.view.ViewGroup;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\b\u0010\u0013J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\r\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo71668d2 = {"Landroidx/paging/LoadStateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "Lja/u;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "getItemCount", "Landroidx/paging/LoadState;", "loadState", "(Landroid/view/ViewGroup;Landroidx/paging/LoadState;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/paging/LoadState;)V", "getStateViewType", "", "displayLoadStateAsItem", "Landroidx/paging/LoadState;", "getLoadState", "()Landroidx/paging/LoadState;", "setLoadState", "(Landroidx/paging/LoadState;)V", "<init>", "()V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LoadStateAdapter.kt */
public abstract class LoadStateAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private LoadState loadState = new LoadState.NotLoading(false);

    public boolean displayLoadStateAsItem(LoadState loadState2) {
        C13706o.m87929f(loadState2, "loadState");
        return (loadState2 instanceof LoadState.Loading) || (loadState2 instanceof LoadState.Error);
    }

    public final int getItemCount() {
        return displayLoadStateAsItem(this.loadState) ? 1 : 0;
    }

    public final int getItemViewType(int i) {
        return getStateViewType(this.loadState);
    }

    public final LoadState getLoadState() {
        return this.loadState;
    }

    public int getStateViewType(LoadState loadState2) {
        C13706o.m87929f(loadState2, "loadState");
        return 0;
    }

    public final void onBindViewHolder(VH vh, int i) {
        C13706o.m87929f(vh, "holder");
        onBindViewHolder(vh, this.loadState);
    }

    public abstract void onBindViewHolder(VH vh, LoadState loadState2);

    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        return onCreateViewHolder(viewGroup, this.loadState);
    }

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, LoadState loadState2);

    public final void setLoadState(LoadState loadState2) {
        C13706o.m87929f(loadState2, "loadState");
        if (!C13706o.m87924a(this.loadState, loadState2)) {
            boolean displayLoadStateAsItem = displayLoadStateAsItem(this.loadState);
            boolean displayLoadStateAsItem2 = displayLoadStateAsItem(loadState2);
            if (displayLoadStateAsItem && !displayLoadStateAsItem2) {
                notifyItemRemoved(0);
            } else if (displayLoadStateAsItem2 && !displayLoadStateAsItem) {
                notifyItemInserted(0);
            } else if (displayLoadStateAsItem && displayLoadStateAsItem2) {
                notifyItemChanged(0);
            }
            this.loadState = loadState2;
        }
    }
}
