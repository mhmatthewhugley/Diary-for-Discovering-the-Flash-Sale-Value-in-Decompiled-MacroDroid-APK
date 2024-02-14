package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class IconTextView extends AppCompatTextView {
    public IconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25110a();
    }

    /* renamed from: a */
    private void m25110a() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/fontawesome.ttf"));
    }

    private void setBackgroundPressedColor(int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        setBackgroundDrawable(stateListDrawable);
    }

    public void setTextColorAndBackground(int i) {
        setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{-1, i}));
        setBackgroundPressedColor(i);
    }

    public IconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25110a();
    }
}
