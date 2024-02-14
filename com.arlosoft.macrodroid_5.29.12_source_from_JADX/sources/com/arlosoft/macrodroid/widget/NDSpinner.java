package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;

public class NDSpinner extends AppCompatSpinner {

    /* renamed from: a */
    public boolean f15383a = false;

    public NDSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean performClick() {
        this.f15383a = true;
        return super.performClick();
    }

    public void setDropDownMenuShown(boolean z) {
        this.f15383a = z;
    }

    public void setSelection(int i, boolean z) {
        boolean z2 = i == getSelectedItemPosition();
        super.setSelection(i, z);
        if (z2 && getOnItemSelectedListener() != null) {
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
    }

    public NDSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSelection(int i) {
        boolean z = i == getSelectedItemPosition();
        super.setSelection(i);
        if (z && getOnItemSelectedListener() != null) {
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
    }
}
