package com.arlosoft.macrodroid.upgrade;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.arlosoft.macrodroid.upgrade.a */
/* compiled from: DividerItemDecorator */
public class C6299a extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f14845a;

    public C6299a(Drawable drawable) {
        this.f14845a = drawable;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i <= childCount - 2; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f14845a.setBounds(paddingLeft, bottom, width, this.f14845a.getIntrinsicHeight() + bottom);
            this.f14845a.draw(canvas);
        }
    }
}
