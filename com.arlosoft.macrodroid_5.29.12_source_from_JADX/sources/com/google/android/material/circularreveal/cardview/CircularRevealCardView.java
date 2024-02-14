package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealCardView extends MaterialCardView implements CircularRevealWidget {
    @NonNull

    /* renamed from: A */
    private final CircularRevealHelper f49090A = new CircularRevealHelper(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo57486a() {
        this.f49090A.mo57501a();
    }

    /* renamed from: b */
    public void mo57487b() {
        this.f49090A.mo57502b();
    }

    /* renamed from: c */
    public void mo57488c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo57489d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f49090A;
        if (circularRevealHelper != null) {
            circularRevealHelper.mo57503c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f49090A.mo57504e();
    }

    public int getCircularRevealScrimColor() {
        return this.f49090A.mo57505f();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.f49090A.mo57506h();
    }

    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f49090A;
        if (circularRevealHelper != null) {
            return circularRevealHelper.mo57507j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f49090A.mo57508k(drawable);
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f49090A.mo57509l(i);
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        this.f49090A.mo57510m(revealInfo);
    }
}
