package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Landroidx/paging/OffsettingListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "", "position", "count", "Lja/u;", "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", "payload", "onChanged", "offset", "I", "callback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "<init>", "(ILandroidx/recyclerview/widget/ListUpdateCallback;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: NullPaddedListDiffHelper.kt */
final class OffsettingListUpdateCallback implements ListUpdateCallback {
    private final ListUpdateCallback callback;
    private final int offset;

    public OffsettingListUpdateCallback(int i, ListUpdateCallback listUpdateCallback) {
        C13706o.m87929f(listUpdateCallback, "callback");
        this.offset = i;
        this.callback = listUpdateCallback;
    }

    public void onChanged(int i, int i2, Object obj) {
        this.callback.onChanged(i + this.offset, i2, obj);
    }

    public void onInserted(int i, int i2) {
        this.callback.onInserted(i + this.offset, i2);
    }

    public void onMoved(int i, int i2) {
        ListUpdateCallback listUpdateCallback = this.callback;
        int i3 = this.offset;
        listUpdateCallback.onMoved(i + i3, i2 + i3);
    }

    public void onRemoved(int i, int i2) {
        this.callback.onRemoved(i + this.offset, i2);
    }
}
