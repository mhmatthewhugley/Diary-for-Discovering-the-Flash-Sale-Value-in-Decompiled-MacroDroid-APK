package org.apmem.tools.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

class LayoutConfiguration {
    private boolean debugDraw = false;
    private int gravity = 51;
    private int layoutDirection = 0;
    private int orientation = 0;
    private float weightDefault = 0.0f;

    public LayoutConfiguration(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16056R.styleable.FlowLayout);
        try {
            setOrientation(obtainStyledAttributes.getInteger(C16056R.styleable.FlowLayout_android_orientation, 0));
            setDebugDraw(obtainStyledAttributes.getBoolean(C16056R.styleable.FlowLayout_debugDraw, false));
            setWeightDefault(obtainStyledAttributes.getFloat(C16056R.styleable.FlowLayout_weightDefault, 0.0f));
            setGravity(obtainStyledAttributes.getInteger(C16056R.styleable.FlowLayout_android_gravity, 0));
            setLayoutDirection(obtainStyledAttributes.getInteger(C16056R.styleable.FlowLayout_layoutDirection, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getGravity() {
        return this.gravity;
    }

    public int getLayoutDirection() {
        return this.layoutDirection;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getWeightDefault() {
        return this.weightDefault;
    }

    public boolean isDebugDraw() {
        return this.debugDraw;
    }

    public void setDebugDraw(boolean z) {
        this.debugDraw = z;
    }

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setLayoutDirection(int i) {
        if (i == 1) {
            this.layoutDirection = i;
        } else {
            this.layoutDirection = 0;
        }
    }

    public void setOrientation(int i) {
        if (i == 1) {
            this.orientation = i;
        } else {
            this.orientation = 0;
        }
    }

    public void setWeightDefault(float f) {
        this.weightDefault = Math.max(0.0f, f);
    }
}
