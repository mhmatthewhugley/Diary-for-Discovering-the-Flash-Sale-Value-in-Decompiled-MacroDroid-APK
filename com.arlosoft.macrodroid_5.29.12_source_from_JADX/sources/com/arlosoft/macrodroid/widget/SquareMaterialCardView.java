package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

public class SquareMaterialCardView extends MaterialCardView {
    public SquareMaterialCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }
}
