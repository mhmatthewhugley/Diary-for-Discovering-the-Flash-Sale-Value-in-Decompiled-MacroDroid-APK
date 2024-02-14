package p256eu.davidea.flexibleadapter.common;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p296j9.C13312c;

/* renamed from: eu.davidea.flexibleadapter.common.SmoothScrollGridLayoutManager */
public class SmoothScrollGridLayoutManager extends GridLayoutManager implements C13312c {

    /* renamed from: a */
    private RecyclerView.SmoothScroller f58641a;

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        this.f58641a.setTargetPosition(i);
        startSmoothScroll(this.f58641a);
    }
}
