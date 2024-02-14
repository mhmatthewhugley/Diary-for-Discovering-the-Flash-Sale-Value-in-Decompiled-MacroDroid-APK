package org.apmem.tools.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int VERTICAL = 1;
    private final LayoutConfiguration config;
    List<LineDefinition> lines = new ArrayList();

    public FlowLayout(Context context) {
        super(context);
        this.config = new LayoutConfiguration(context, (AttributeSet) null);
    }

    private void applyGravityToLine(LineDefinition lineDefinition) {
        int i;
        List<View> views = lineDefinition.getViews();
        int size = views.size();
        if (size > 0) {
            float f = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                f += getWeight((LayoutParams) views.get(i2).getLayoutParams());
            }
            LayoutParams layoutParams = (LayoutParams) views.get(size - 1).getLayoutParams();
            int lineLength = lineDefinition.getLineLength() - ((layoutParams.getLength() + layoutParams.getSpacingLength()) + layoutParams.getInlineStartLength());
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                LayoutParams layoutParams2 = (LayoutParams) views.get(i4).getLayoutParams();
                float weight = getWeight(layoutParams2);
                int gravity = getGravity(layoutParams2);
                if (f == 0.0f) {
                    i = lineLength / size;
                } else {
                    i = Math.round((((float) lineLength) * weight) / f);
                }
                int length = layoutParams2.getLength() + layoutParams2.getSpacingLength();
                int thickness = layoutParams2.getThickness() + layoutParams2.getSpacingThickness();
                Rect rect = new Rect();
                rect.top = 0;
                rect.left = i3;
                rect.right = length + i + i3;
                rect.bottom = lineDefinition.getLineThickness();
                Rect rect2 = new Rect();
                Gravity.apply(gravity, length, thickness, rect, rect2);
                i3 += i;
                layoutParams2.setInlineStartLength(rect2.left + layoutParams2.getInlineStartLength());
                layoutParams2.setInlineStartThickness(rect2.top);
                layoutParams2.setLength(rect2.width() - layoutParams2.getSpacingLength());
                layoutParams2.setThickness(rect2.height() - layoutParams2.getSpacingThickness());
            }
        }
    }

    private void applyGravityToLines(List<LineDefinition> list, int i, int i2) {
        int size = list.size();
        if (size > 0) {
            LineDefinition lineDefinition = list.get(size - 1);
            int lineThickness = i2 - (lineDefinition.getLineThickness() + lineDefinition.getLineStartThickness());
            if (lineThickness < 0) {
                lineThickness = 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                LineDefinition lineDefinition2 = list.get(i4);
                int gravity = getGravity((LayoutParams) null);
                int round = Math.round((float) ((lineThickness * 1) / size));
                int lineLength = lineDefinition2.getLineLength();
                int lineThickness2 = lineDefinition2.getLineThickness();
                Rect rect = new Rect();
                rect.top = i3;
                rect.left = 0;
                rect.right = i;
                rect.bottom = lineThickness2 + round + i3;
                Rect rect2 = new Rect();
                Gravity.apply(gravity, lineLength, lineThickness2, rect, rect2);
                i3 += round;
                lineDefinition2.setLineStartLength(lineDefinition2.getLineStartLength() + rect2.left);
                lineDefinition2.setLineStartThickness(lineDefinition2.getLineStartThickness() + rect2.top);
                lineDefinition2.setLength(rect2.width());
                lineDefinition2.setThickness(rect2.height());
            }
        }
    }

    private void applyPositionsToViews(LineDefinition lineDefinition) {
        List<View> views = lineDefinition.getViews();
        int size = views.size();
        for (int i = 0; i < size; i++) {
            View view = views.get(i);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.config.getOrientation() == 0) {
                layoutParams.setPosition(getPaddingLeft() + lineDefinition.getLineStartLength() + layoutParams.getInlineStartLength(), getPaddingTop() + lineDefinition.getLineStartThickness() + layoutParams.getInlineStartThickness());
                view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.getLength(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(layoutParams.getThickness(), BasicMeasure.EXACTLY));
            } else {
                layoutParams.setPosition(getPaddingLeft() + lineDefinition.getLineStartThickness() + layoutParams.getInlineStartThickness(), getPaddingTop() + lineDefinition.getLineStartLength() + layoutParams.getInlineStartLength());
                view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.getThickness(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(layoutParams.getLength(), BasicMeasure.EXACTLY));
            }
        }
    }

    private void calculateLinesAndChildPosition(List<LineDefinition> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            LineDefinition lineDefinition = list.get(i2);
            lineDefinition.setLineStartThickness(i);
            i += lineDefinition.getLineThickness();
            List<View> views = lineDefinition.getViews();
            int size2 = views.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                LayoutParams layoutParams = (LayoutParams) views.get(i4).getLayoutParams();
                layoutParams.setInlineStartLength(i3);
                i3 += layoutParams.getLength() + layoutParams.getSpacingLength();
            }
        }
    }

    private Paint createPaint(int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(2.0f);
        return paint;
    }

    private boolean debugDraw() {
        try {
            Method declaredMethod = ViewGroup.class.getDeclaredMethod("debugDraw", (Class[]) null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(this, new Object[]{null})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private void drawDebugInfo(Canvas canvas, View view) {
        if (isDebugDraw()) {
            Paint createPaint = createPaint(InputDeviceCompat.SOURCE_ANY);
            Paint createPaint2 = createPaint(SupportMenu.CATEGORY_MASK);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.rightMargin > 0) {
                float right = (float) view.getRight();
                float top = ((float) view.getTop()) + (((float) view.getHeight()) / 2.0f);
                float f = top;
                Paint paint = createPaint;
                canvas.drawLine(right, top, right + ((float) layoutParams.rightMargin), f, paint);
                int i = layoutParams.rightMargin;
                float f2 = right + ((float) i);
                canvas.drawLine((((float) i) + right) - 4.0f, top - 4.0f, f2, f, paint);
                int i2 = layoutParams.rightMargin;
                float f3 = right + ((float) i2);
                canvas.drawLine((((float) i2) + right) - 4.0f, top + 4.0f, f3, f, paint);
            }
            if (layoutParams.leftMargin > 0) {
                float left = (float) view.getLeft();
                float top2 = ((float) view.getTop()) + (((float) view.getHeight()) / 2.0f);
                float f4 = top2;
                Paint paint2 = createPaint;
                canvas.drawLine(left, top2, left - ((float) layoutParams.leftMargin), f4, paint2);
                int i3 = layoutParams.leftMargin;
                float f5 = left - ((float) i3);
                canvas.drawLine((left - ((float) i3)) + 4.0f, top2 - 4.0f, f5, f4, paint2);
                int i4 = layoutParams.leftMargin;
                float f6 = left - ((float) i4);
                canvas.drawLine((left - ((float) i4)) + 4.0f, top2 + 4.0f, f6, f4, paint2);
            }
            if (layoutParams.bottomMargin > 0) {
                float left2 = ((float) view.getLeft()) + (((float) view.getWidth()) / 2.0f);
                float bottom = (float) view.getBottom();
                float f7 = left2;
                Paint paint3 = createPaint;
                canvas.drawLine(left2, bottom, f7, bottom + ((float) layoutParams.bottomMargin), paint3);
                int i5 = layoutParams.bottomMargin;
                float f8 = bottom + ((float) i5);
                canvas.drawLine(left2 - 4.0f, (((float) i5) + bottom) - 4.0f, f7, f8, paint3);
                int i6 = layoutParams.bottomMargin;
                float f9 = bottom + ((float) i6);
                canvas.drawLine(left2 + 4.0f, (((float) i6) + bottom) - 4.0f, f7, f9, paint3);
            }
            if (layoutParams.topMargin > 0) {
                float left3 = ((float) view.getLeft()) + (((float) view.getWidth()) / 2.0f);
                float top3 = (float) view.getTop();
                float f10 = left3;
                Paint paint4 = createPaint;
                canvas.drawLine(left3, top3, f10, top3 - ((float) layoutParams.topMargin), paint4);
                int i7 = layoutParams.topMargin;
                float f11 = top3 - ((float) i7);
                canvas.drawLine(left3 - 4.0f, (top3 - ((float) i7)) + 4.0f, f10, f11, paint4);
                int i8 = layoutParams.topMargin;
                float f12 = top3 - ((float) i8);
                canvas.drawLine(left3 + 4.0f, (top3 - ((float) i8)) + 4.0f, f10, f12, paint4);
            }
            if (!layoutParams.isNewLine()) {
                return;
            }
            if (this.config.getOrientation() == 0) {
                float left4 = (float) view.getLeft();
                float top4 = ((float) view.getTop()) + (((float) view.getHeight()) / 2.0f);
                canvas.drawLine(left4, top4 - 6.0f, left4, top4 + 6.0f, createPaint2);
                return;
            }
            float left5 = ((float) view.getLeft()) + (((float) view.getWidth()) / 2.0f);
            float top5 = (float) view.getTop();
            canvas.drawLine(left5 - 6.0f, top5, left5 + 6.0f, top5, createPaint2);
        }
    }

    private int findSize(int i, int i2, int i3) {
        return i != Integer.MIN_VALUE ? i != 1073741824 ? i3 : i2 : Math.min(i3, i2);
    }

    private int getGravity(LayoutParams layoutParams) {
        int gravity = this.config.getGravity();
        int gravityFromRelative = getGravityFromRelative((layoutParams == null || !layoutParams.gravitySpecified()) ? gravity : layoutParams.getGravity());
        int gravityFromRelative2 = getGravityFromRelative(gravity);
        if ((gravityFromRelative & 7) == 0) {
            gravityFromRelative |= gravityFromRelative2 & 7;
        }
        if ((gravityFromRelative & 112) == 0) {
            gravityFromRelative |= gravityFromRelative2 & 112;
        }
        if ((gravityFromRelative & 7) == 0) {
            gravityFromRelative |= 3;
        }
        return (gravityFromRelative & 112) == 0 ? gravityFromRelative | 48 : gravityFromRelative;
    }

    private int getGravityFromRelative(int i) {
        int i2 = 0;
        if (this.config.getOrientation() == 1 && (i & 8388608) == 0) {
            i = (((i & 112) >> 4) << 0) | (((i & 7) >> 0) << 4) | 0;
        }
        if (this.config.getLayoutDirection() != 1 || (i & 8388608) == 0) {
            return i;
        }
        int i3 = ((i & 3) == 3 ? 5 : 0) | 0;
        if ((i & 5) == 5) {
            i2 = 3;
        }
        return i3 | i2;
    }

    private float getWeight(LayoutParams layoutParams) {
        return layoutParams.weightSpecified() ? layoutParams.getWeight() : this.config.getWeightDefault();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        drawDebugInfo(canvas, view);
        return drawChild;
    }

    public int getLayoutDirection() {
        LayoutConfiguration layoutConfiguration = this.config;
        if (layoutConfiguration == null) {
            return 0;
        }
        return layoutConfiguration.getLayoutDirection();
    }

    public int getOrientation() {
        return this.config.getOrientation();
    }

    public float getWeightDefault() {
        return this.config.getWeightDefault();
    }

    public boolean isDebugDraw() {
        return this.config.isDebugDraw() || debugDraw();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            childAt.layout(layoutParams.f66011x + layoutParams.leftMargin, layoutParams.f66012y + layoutParams.topMargin, layoutParams.f66011x + layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.f66012y + layoutParams.topMargin + childAt.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.config.getOrientation() == 0 ? size : size2;
        if (this.config.getOrientation() == 0) {
            size = size2;
        }
        if (this.config.getOrientation() != 0) {
            mode = mode2;
        }
        this.config.getOrientation();
        this.lines.clear();
        LineDefinition lineDefinition = new LineDefinition(i5);
        this.lines.add(lineDefinition);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
                int unused = layoutParams.orientation = this.config.getOrientation();
                if (this.config.getOrientation() == 0) {
                    layoutParams.setLength(childAt.getMeasuredWidth());
                    layoutParams.setThickness(childAt.getMeasuredHeight());
                } else {
                    layoutParams.setLength(childAt.getMeasuredHeight());
                    layoutParams.setThickness(childAt.getMeasuredWidth());
                }
                if (layoutParams.isNewLine() || (mode != 0 && !lineDefinition.canFit(childAt))) {
                    lineDefinition = new LineDefinition(i5);
                    if (this.config.getOrientation() == 1 && this.config.getLayoutDirection() == 1) {
                        this.lines.add(0, lineDefinition);
                    } else {
                        this.lines.add(lineDefinition);
                    }
                }
                if (this.config.getOrientation() == 0 && this.config.getLayoutDirection() == 1) {
                    lineDefinition.addView(0, childAt);
                } else {
                    lineDefinition.addView(childAt);
                }
            }
        }
        calculateLinesAndChildPosition(this.lines);
        int size3 = this.lines.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size3; i8++) {
            i7 = Math.max(i7, this.lines.get(i8).getLineLength());
        }
        int lineStartThickness = lineDefinition.getLineStartThickness() + lineDefinition.getLineThickness();
        applyGravityToLines(this.lines, findSize(mode, i5, i7), findSize(mode2, size, lineStartThickness));
        for (int i9 = 0; i9 < size3; i9++) {
            LineDefinition lineDefinition2 = this.lines.get(i9);
            applyGravityToLine(lineDefinition2);
            applyPositionsToViews(lineDefinition2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.config.getOrientation() == 0) {
            i4 = paddingLeft + i7;
            i3 = paddingBottom + lineStartThickness;
        } else {
            i4 = paddingLeft + lineStartThickness;
            i3 = paddingBottom + i7;
        }
        setMeasuredDimension(ViewGroup.resolveSize(i4, i), ViewGroup.resolveSize(i3, i2));
    }

    public void setDebugDraw(boolean z) {
        this.config.setDebugDraw(z);
        invalidate();
    }

    public void setGravity(int i) {
        this.config.setGravity(i);
        requestLayout();
    }

    public void setLayoutDirection(int i) {
        this.config.setLayoutDirection(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.config.setOrientation(i);
        requestLayout();
    }

    public void setWeightDefault(float f) {
        this.config.setWeightDefault(f);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.config = new LayoutConfiguration(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private int gravity = 0;
        private int inlineStartLength;
        private int inlineStartThickness;
        private int length;
        @ViewDebug.ExportedProperty(mapping = {@ViewDebug.IntToString(from = 0, to = "NONE"), @ViewDebug.IntToString(from = 48, to = "TOP"), @ViewDebug.IntToString(from = 80, to = "BOTTOM"), @ViewDebug.IntToString(from = 3, to = "LEFT"), @ViewDebug.IntToString(from = 5, to = "RIGHT"), @ViewDebug.IntToString(from = 16, to = "CENTER_VERTICAL"), @ViewDebug.IntToString(from = 112, to = "FILL_VERTICAL"), @ViewDebug.IntToString(from = 1, to = "CENTER_HORIZONTAL"), @ViewDebug.IntToString(from = 7, to = "FILL_HORIZONTAL"), @ViewDebug.IntToString(from = 17, to = "CENTER"), @ViewDebug.IntToString(from = 119, to = "FILL")})
        private boolean newLine = false;
        /* access modifiers changed from: private */
        public int orientation;
        private int thickness;
        private float weight = -1.0f;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public int f66011x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public int f66012y;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            readStyleParameters(context, attributeSet);
        }

        private void readStyleParameters(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16056R.styleable.FlowLayout_LayoutParams);
            try {
                this.newLine = obtainStyledAttributes.getBoolean(C16056R.styleable.FlowLayout_LayoutParams_layout_newLine, false);
                this.gravity = obtainStyledAttributes.getInt(C16056R.styleable.FlowLayout_LayoutParams_android_layout_gravity, 0);
                this.weight = obtainStyledAttributes.getFloat(C16056R.styleable.FlowLayout_LayoutParams_layout_weight, -1.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public int getGravity() {
            return this.gravity;
        }

        /* access modifiers changed from: package-private */
        public int getInlineStartLength() {
            return this.inlineStartLength;
        }

        /* access modifiers changed from: package-private */
        public int getInlineStartThickness() {
            return this.inlineStartThickness;
        }

        /* access modifiers changed from: package-private */
        public int getLength() {
            return this.length;
        }

        /* access modifiers changed from: package-private */
        public int getSpacingLength() {
            int i;
            int i2;
            if (this.orientation == 0) {
                i = this.leftMargin;
                i2 = this.rightMargin;
            } else {
                i = this.topMargin;
                i2 = this.bottomMargin;
            }
            return i + i2;
        }

        /* access modifiers changed from: package-private */
        public int getSpacingThickness() {
            int i;
            int i2;
            if (this.orientation == 0) {
                i = this.topMargin;
                i2 = this.bottomMargin;
            } else {
                i = this.leftMargin;
                i2 = this.rightMargin;
            }
            return i + i2;
        }

        /* access modifiers changed from: package-private */
        public int getThickness() {
            return this.thickness;
        }

        public float getWeight() {
            return this.weight;
        }

        public int getX() {
            return this.f66011x;
        }

        public int getY() {
            return this.f66012y;
        }

        public boolean gravitySpecified() {
            return this.gravity != 0;
        }

        public boolean isNewLine() {
            return this.newLine;
        }

        public void setGravity(int i) {
            this.gravity = i;
        }

        /* access modifiers changed from: package-private */
        public void setInlineStartLength(int i) {
            this.inlineStartLength = i;
        }

        /* access modifiers changed from: package-private */
        public void setInlineStartThickness(int i) {
            this.inlineStartThickness = i;
        }

        /* access modifiers changed from: package-private */
        public void setLength(int i) {
            this.length = i;
        }

        public void setNewLine(boolean z) {
            this.newLine = z;
        }

        /* access modifiers changed from: package-private */
        public void setPosition(int i, int i2) {
            this.f66011x = i;
            this.f66012y = i2;
        }

        /* access modifiers changed from: package-private */
        public void setThickness(int i) {
            this.thickness = i;
        }

        public void setWeight(float f) {
            this.weight = f;
        }

        public boolean weightSpecified() {
            return this.weight >= 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public int getGravity() {
        return this.config.getGravity();
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.config = new LayoutConfiguration(context, attributeSet);
    }
}
