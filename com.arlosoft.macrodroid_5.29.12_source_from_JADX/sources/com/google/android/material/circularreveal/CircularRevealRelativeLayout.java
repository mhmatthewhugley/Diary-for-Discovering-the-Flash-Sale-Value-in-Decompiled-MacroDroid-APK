package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealRelativeLayout extends RelativeLayout implements CircularRevealWidget {
    @NonNull

    /* renamed from: a */
    private final CircularRevealHelper f49082a = new CircularRevealHelper(this);

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo57486a() {
        this.f49082a.mo57501a();
    }

    /* renamed from: b */
    public void mo57487b() {
        this.f49082a.mo57502b();
    }

    /* renamed from: c */
    public void mo57488c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo57489d() {
        return super.isOpaque();
    }

    public void draw(@NonNull Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f49082a;
        if (circularRevealHelper != null) {
            circularRevealHelper.mo57503c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f49082a.mo57504e();
    }

    public int getCircularRevealScrimColor() {
        return this.f49082a.mo57505f();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.f49082a.mo57506h();
    }

    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f49082a;
        if (circularRevealHelper != null) {
            return circularRevealHelper.mo57507j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f49082a.mo57508k(drawable);
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f49082a.mo57509l(i);
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        this.f49082a.mo57510m(revealInfo);
    }
}
