package p296j9;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: j9.b */
/* compiled from: FlexibleLayoutManager */
public class C13311b implements C13312c {

    /* renamed from: a */
    protected RecyclerView f61310a;

    /* renamed from: b */
    protected RecyclerView.LayoutManager f61311b;

    public C13311b(RecyclerView recyclerView) {
        this(recyclerView.getLayoutManager());
        this.f61310a = recyclerView;
    }

    /* renamed from: a */
    private RecyclerView.LayoutManager m85659a() {
        RecyclerView recyclerView = this.f61310a;
        return recyclerView != null ? recyclerView.getLayoutManager() : this.f61311b;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        RecyclerView.LayoutManager a = m85659a();
        if (!(a instanceof StaggeredGridLayoutManager)) {
            return ((LinearLayoutManager) a).findFirstCompletelyVisibleItemPosition();
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) a;
        int i = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions((int[]) null)[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public int findLastCompletelyVisibleItemPosition() {
        RecyclerView.LayoutManager a = m85659a();
        if (!(a instanceof StaggeredGridLayoutManager)) {
            return ((LinearLayoutManager) a).findLastCompletelyVisibleItemPosition();
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) a;
        int i = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions((int[]) null)[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public int findLastVisibleItemPosition() {
        RecyclerView.LayoutManager a = m85659a();
        if (!(a instanceof StaggeredGridLayoutManager)) {
            return ((LinearLayoutManager) a).findLastVisibleItemPosition();
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) a;
        int i = staggeredGridLayoutManager.findLastVisibleItemPositions((int[]) null)[0];
        for (int i2 = 1; i2 < getSpanCount(); i2++) {
            int i3 = staggeredGridLayoutManager.findLastVisibleItemPositions((int[]) null)[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public int getOrientation() {
        RecyclerView.LayoutManager a = m85659a();
        if (a instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) a).getOrientation();
        }
        if (a instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) a).getOrientation();
        }
        return 1;
    }

    public int getSpanCount() {
        RecyclerView.LayoutManager a = m85659a();
        if (a instanceof GridLayoutManager) {
            return ((GridLayoutManager) a).getSpanCount();
        }
        if (a instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) a).getSpanCount();
        }
        return 1;
    }

    public C13311b(RecyclerView.LayoutManager layoutManager) {
        this.f61311b = layoutManager;
    }
}
