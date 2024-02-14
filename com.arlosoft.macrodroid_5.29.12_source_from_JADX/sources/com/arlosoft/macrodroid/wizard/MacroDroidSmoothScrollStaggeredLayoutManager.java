package com.arlosoft.macrodroid.wizard;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager2;
import p296j9.C13312c;
import p296j9.C13313d;

public class MacroDroidSmoothScrollStaggeredLayoutManager extends StaggeredGridLayoutManager2 implements C13312c {

    /* renamed from: a */
    private RecyclerView.SmoothScroller f15429a;

    public MacroDroidSmoothScrollStaggeredLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        return super.findFirstCompletelyVisibleItemPositions((int[]) null)[0];
    }

    public int findLastCompletelyVisibleItemPosition() {
        return super.findLastCompletelyVisibleItemPositions((int[]) null)[0];
    }

    public int findLastVisibleItemPosition() {
        return super.findLastVisibleItemPositions((int[]) null)[0];
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        this.f15429a.setTargetPosition(i);
        startSmoothScroll(this.f15429a);
    }

    public MacroDroidSmoothScrollStaggeredLayoutManager(Context context, int i, int i2) {
        super(i, i2);
        this.f15429a = new C13313d(context, this);
    }
}
