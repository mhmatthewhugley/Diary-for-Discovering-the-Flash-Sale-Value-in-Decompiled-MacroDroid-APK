package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.arlosoft.macrodroid.common.e1 */
/* compiled from: SimpleDividerItemDecoration */
public class C4007e1 extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f10381a;

    public C4007e1(Context context, @DrawableRes int i) {
        this.f10381a = context.getResources().getDrawable(i);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f10381a.setBounds(paddingLeft, bottom, width, this.f10381a.getIntrinsicHeight() + bottom);
            this.f10381a.draw(canvas);
        }
    }
}
