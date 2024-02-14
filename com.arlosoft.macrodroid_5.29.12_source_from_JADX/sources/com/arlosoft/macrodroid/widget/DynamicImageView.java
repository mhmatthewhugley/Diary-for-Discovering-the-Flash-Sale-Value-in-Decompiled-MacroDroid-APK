package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class DynamicImageView extends AppCompatImageView {
    public DynamicImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) Math.ceil((double) ((((float) size) * ((float) drawable.getIntrinsicHeight())) / ((float) drawable.getIntrinsicWidth()))));
            return;
        }
        super.onMeasure(i, i2);
    }
}
