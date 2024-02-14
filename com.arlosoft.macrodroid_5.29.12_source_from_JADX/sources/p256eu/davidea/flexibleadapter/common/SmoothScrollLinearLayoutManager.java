package p256eu.davidea.flexibleadapter.common;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p296j9.C13312c;
import p296j9.C13313d;

/* renamed from: eu.davidea.flexibleadapter.common.SmoothScrollLinearLayoutManager */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager implements C13312c {

    /* renamed from: a */
    private RecyclerView.SmoothScroller f58642a;

    public SmoothScrollLinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public int getSpanCount() {
        return 1;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        this.f58642a.setTargetPosition(i);
        startSmoothScroll(this.f58642a);
    }

    public SmoothScrollLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.f58642a = new C13313d(context, this);
    }
}
