package com.afollestad.materialdialogs.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import p040o.C2039a;

public class CircleView extends FrameLayout {

    /* renamed from: a */
    private final int f771a;

    /* renamed from: c */
    private final int f772c;

    /* renamed from: d */
    private final Paint f773d;

    /* renamed from: f */
    private final Paint f774f;

    /* renamed from: g */
    private final Paint f775g;

    /* renamed from: o */
    private boolean f776o;

    public CircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private Drawable m653a(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(m657e(m656d(i)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable);
        return stateListDrawable;
    }

    @ColorInt
    /* renamed from: b */
    public static int m654b(@ColorInt int i, @FloatRange(from = 0.0d, mo592to = 2.0d) float f) {
        if (f == 1.0f) {
            return i;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    @ColorInt
    /* renamed from: c */
    public static int m655c(@ColorInt int i) {
        return m654b(i, 0.9f);
    }

    @ColorInt
    /* renamed from: d */
    public static int m656d(@ColorInt int i) {
        return m654b(i, 1.1f);
    }

    @ColorInt
    /* renamed from: e */
    private static int m657e(int i) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.7f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: f */
    private void m658f(@ColorInt int i) {
        this.f775g.setColor(i);
        this.f773d.setColor(m655c(i));
        setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{m656d(i)}), m653a(i), (Drawable) null));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        if (this.f776o) {
            int i = measuredWidth - this.f772c;
            int i2 = i - this.f771a;
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f773d);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i, this.f774f);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i2, this.f775g);
            return;
        }
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f775g);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    @Deprecated
    public void setActivated(boolean z) {
        throw new IllegalStateException("Cannot use setActivated() on CircleView.");
    }

    @Deprecated
    public void setBackground(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackground() on CircleView.");
    }

    public void setBackgroundColor(@ColorInt int i) {
        m658f(i);
        requestLayout();
        invalidate();
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackgroundDrawable() on CircleView.");
    }

    public void setBackgroundResource(@ColorRes int i) {
        setBackgroundColor(C2039a.m8433c(getContext(), i));
    }

    public void setSelected(boolean z) {
        this.f776o = z;
        requestLayout();
        invalidate();
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        this.f771a = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        this.f772c = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        Paint paint = new Paint();
        this.f774f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Paint paint2 = new Paint();
        this.f775g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f773d = paint3;
        paint3.setAntiAlias(true);
        m658f(-12303292);
        setWillNotDraw(false);
    }
}
