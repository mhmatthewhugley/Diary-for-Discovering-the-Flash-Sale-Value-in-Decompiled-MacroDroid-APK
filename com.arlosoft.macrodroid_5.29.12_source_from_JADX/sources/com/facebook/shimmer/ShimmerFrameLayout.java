package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.shimmer.C6712a;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final Paint f15709a = new Paint();

    /* renamed from: c */
    private final C6716b f15710c = new C6716b();

    /* renamed from: d */
    private boolean f15711d = true;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25420b(context, attributeSet);
    }

    /* renamed from: b */
    private void m25420b(Context context, @Nullable AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f15710c.setCallback(this);
        if (attributeSet == null) {
            mo33123c(new C6712a.C6713a().mo33136a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShimmerFrameLayout, 0, 0);
        try {
            int i = R$styleable.ShimmerFrameLayout_shimmer_colored;
            mo33123c(((!obtainStyledAttributes.hasValue(i) || !obtainStyledAttributes.getBoolean(i, false)) ? new C6712a.C6713a() : new C6712a.C6715c()).mo33137c(obtainStyledAttributes).mo33136a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo33122a() {
        if (this.f15711d) {
            mo33124d();
            this.f15711d = false;
            invalidate();
        }
    }

    /* renamed from: c */
    public ShimmerFrameLayout mo33123c(@Nullable C6712a aVar) {
        this.f15710c.mo33161d(aVar);
        if (aVar == null || !aVar.f15726o) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f15709a);
        }
        return this;
    }

    /* renamed from: d */
    public void mo33124d() {
        this.f15710c.mo33163e();
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15711d) {
            this.f15710c.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15710c.mo33160b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo33124d();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f15710c.setBounds(0, 0, getWidth(), getHeight());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15710c;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25420b(context, attributeSet);
    }
}
