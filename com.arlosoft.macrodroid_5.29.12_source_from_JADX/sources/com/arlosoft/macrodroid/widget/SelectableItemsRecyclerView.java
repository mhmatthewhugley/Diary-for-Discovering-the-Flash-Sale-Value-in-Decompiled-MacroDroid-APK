package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

public class SelectableItemsRecyclerView extends RecyclerView {

    /* renamed from: a */
    private boolean f15384a = false;

    public SelectableItemsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setExpanded(true);
    }

    /* renamed from: c */
    private boolean m25111c() {
        return this.f15384a;
    }

    public void onMeasure(int i, int i2) {
        if (m25111c()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
        getLayoutParams().height = -2;
    }

    public void setExpanded(boolean z) {
        this.f15384a = z;
    }
}
