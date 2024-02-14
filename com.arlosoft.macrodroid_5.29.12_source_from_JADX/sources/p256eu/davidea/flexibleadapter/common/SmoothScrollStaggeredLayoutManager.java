package p256eu.davidea.flexibleadapter.common;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import p296j9.C13312c;

/* renamed from: eu.davidea.flexibleadapter.common.SmoothScrollStaggeredLayoutManager */
public class SmoothScrollStaggeredLayoutManager extends StaggeredGridLayoutManager implements C13312c {

    /* renamed from: a */
    private RecyclerView.SmoothScroller f58643a;

    public int findFirstCompletelyVisibleItemPosition() {
        int i = super.findFirstCompletelyVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = super.findFirstCompletelyVisibleItemPositions((int[]) null)[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public int findLastCompletelyVisibleItemPosition() {
        int i = super.findLastCompletelyVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = super.findLastCompletelyVisibleItemPositions((int[]) null)[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public int findLastVisibleItemPosition() {
        int i = super.findLastVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = super.findLastVisibleItemPositions((int[]) null)[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        this.f58643a.setTargetPosition(i);
        startSmoothScroll(this.f58643a);
    }
}
