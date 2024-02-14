package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

public class LockableScrollView extends NestedScrollView {

    /* renamed from: a */
    private boolean f15382a = true;

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f15382a) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = this.f15382a;
        return z ? super.onTouchEvent(motionEvent) : z;
    }

    public void setScrollingEnabled(boolean z) {
        this.f15382a = z;
    }
}
