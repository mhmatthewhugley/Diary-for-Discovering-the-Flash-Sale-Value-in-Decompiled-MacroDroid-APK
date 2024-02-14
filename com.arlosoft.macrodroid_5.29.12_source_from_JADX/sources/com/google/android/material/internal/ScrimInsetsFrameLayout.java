package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C10462R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {
    @Nullable

    /* renamed from: a */
    Drawable f49625a;

    /* renamed from: c */
    Rect f49626c;

    /* renamed from: d */
    private Rect f49627d;

    /* renamed from: f */
    private boolean f49628f;

    /* renamed from: g */
    private boolean f49629g;

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58198a(WindowInsetsCompat windowInsetsCompat) {
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f49626c != null && this.f49625a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f49628f) {
                this.f49627d.set(0, 0, width, this.f49626c.top);
                this.f49625a.setBounds(this.f49627d);
                this.f49625a.draw(canvas);
            }
            if (this.f49629g) {
                this.f49627d.set(0, height - this.f49626c.bottom, width, height);
                this.f49625a.setBounds(this.f49627d);
                this.f49625a.draw(canvas);
            }
            Rect rect = this.f49627d;
            Rect rect2 = this.f49626c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f49625a.setBounds(this.f49627d);
            this.f49625a.draw(canvas);
            Rect rect3 = this.f49627d;
            Rect rect4 = this.f49626c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f49625a.setBounds(this.f49627d);
            this.f49625a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f49625a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f49625a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f49629g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f49628f = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f49625a = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49627d = new Rect();
        this.f49628f = true;
        this.f49629g = true;
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.ScrimInsetsFrameLayout, i, C10462R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f49625a = h.getDrawable(C10462R.styleable.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.f49626c == null) {
                    scrimInsetsFrameLayout.f49626c = new Rect();
                }
                ScrimInsetsFrameLayout.this.f49626c.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                ScrimInsetsFrameLayout.this.mo58198a(windowInsetsCompat);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || ScrimInsetsFrameLayout.this.f49625a == null);
                ViewCompat.postInvalidateOnAnimation(ScrimInsetsFrameLayout.this);
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }
}
