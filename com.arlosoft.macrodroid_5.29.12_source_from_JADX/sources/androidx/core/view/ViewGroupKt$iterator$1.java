package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, mo71668d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "", "hasNext", "next", "Lja/u;", "remove", "", "index", "I", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ViewGroup.kt */
public final class ViewGroupKt$iterator$1 implements Iterator<View>, C16368a {
    final /* synthetic */ ViewGroup $this_iterator;
    private int index;

    ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    public boolean hasNext() {
        return this.index < this.$this_iterator.getChildCount();
    }

    public void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        viewGroup.removeViewAt(i);
    }

    public View next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
