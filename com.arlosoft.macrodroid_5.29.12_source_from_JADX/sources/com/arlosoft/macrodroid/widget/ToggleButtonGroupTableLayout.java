package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ToggleButtonGroupTableLayout extends TableLayout implements View.OnClickListener {

    /* renamed from: a */
    private RadioButton f15399a;

    public ToggleButtonGroupTableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setChildrenOnClickListener(TableRow tableRow) {
        int childCount = tableRow.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = tableRow.getChildAt(i);
            if (childAt instanceof RadioButton) {
                childAt.setOnClickListener(this);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        setChildrenOnClickListener((TableRow) view);
    }

    public void onClick(View view) {
        RadioButton radioButton = (RadioButton) view;
        RadioButton radioButton2 = this.f15399a;
        if (radioButton2 != null) {
            radioButton2.setChecked(false);
        }
        radioButton.setChecked(true);
        this.f15399a = radioButton;
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        setChildrenOnClickListener((TableRow) view);
    }
}
