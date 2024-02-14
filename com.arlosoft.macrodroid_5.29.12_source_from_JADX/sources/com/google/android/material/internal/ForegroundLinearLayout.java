package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.C10462R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {
    @Nullable

    /* renamed from: a */
    private Drawable f49569a;

    /* renamed from: c */
    private final Rect f49570c;

    /* renamed from: d */
    private final Rect f49571d;

    /* renamed from: f */
    private int f49572f;

    /* renamed from: g */
    protected boolean f49573g;

    /* renamed from: o */
    boolean f49574o;

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f49569a;
        if (drawable != null) {
            if (this.f49574o) {
                this.f49574o = false;
                Rect rect = this.f49570c;
                Rect rect2 = this.f49571d;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f49573g) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f49572f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @RequiresApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f49569a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f49569a;
        if (drawable != null && drawable.isStateful()) {
            this.f49569a.setState(getDrawableState());
        }
    }

    @Nullable
    public Drawable getForeground() {
        return this.f49569a;
    }

    public int getForegroundGravity() {
        return this.f49572f;
    }

    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f49569a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f49574o = z | this.f49574o;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f49574o = true;
    }

    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f49569a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f49569a);
            }
            this.f49569a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f49572f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f49572f != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f49572f = i;
            if (i == 119 && this.f49569a != null) {
                this.f49569a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f49569a;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49570c = new Rect();
        this.f49571d = new Rect();
        this.f49572f = 119;
        this.f49573g = true;
        this.f49574o = false;
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.f49572f = h.getInt(C10462R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f49572f);
        Drawable drawable = h.getDrawable(C10462R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f49573g = h.getBoolean(C10462R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        h.recycle();
    }
}
