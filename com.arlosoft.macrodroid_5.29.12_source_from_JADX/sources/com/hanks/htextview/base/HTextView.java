package com.hanks.htextview.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p266g6.C12306a;

public abstract class HTextView extends TextView {
    public HTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract void setAnimationListener(C12306a aVar);

    public abstract void setProgress(float f);

    public HTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
