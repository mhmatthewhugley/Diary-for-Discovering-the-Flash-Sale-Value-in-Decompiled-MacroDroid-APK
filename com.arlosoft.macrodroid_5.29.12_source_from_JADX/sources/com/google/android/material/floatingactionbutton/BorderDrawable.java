package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class BorderDrawable extends Drawable {

    /* renamed from: a */
    private final ShapeAppearancePathProvider f49326a = ShapeAppearancePathProvider.m69330k();
    @NonNull

    /* renamed from: b */
    private final Paint f49327b;

    /* renamed from: c */
    private final Path f49328c = new Path();

    /* renamed from: d */
    private final Rect f49329d = new Rect();

    /* renamed from: e */
    private final RectF f49330e = new RectF();

    /* renamed from: f */
    private final RectF f49331f = new RectF();

    /* renamed from: g */
    private final BorderState f49332g = new BorderState();
    @Dimension

    /* renamed from: h */
    float f49333h;
    @ColorInt

    /* renamed from: i */
    private int f49334i;
    @ColorInt

    /* renamed from: j */
    private int f49335j;
    @ColorInt

    /* renamed from: k */
    private int f49336k;
    @ColorInt

    /* renamed from: l */
    private int f49337l;
    @ColorInt

    /* renamed from: m */
    private int f49338m;

    /* renamed from: n */
    private boolean f49339n = true;

    /* renamed from: o */
    private ShapeAppearanceModel f49340o;
    @Nullable

    /* renamed from: p */
    private ColorStateList f49341p;

    private class BorderState extends Drawable.ConstantState {
        private BorderState() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f49340o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f49327b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    /* renamed from: a */
    private Shader m68409a() {
        Rect rect = this.f49329d;
        copyBounds(rect);
        float height = this.f49333h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{ColorUtils.compositeColors(this.f49334i, this.f49338m), ColorUtils.compositeColors(this.f49335j, this.f49338m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f49335j, 0), this.f49338m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f49337l, 0), this.f49338m), ColorUtils.compositeColors(this.f49337l, this.f49338m), ColorUtils.compositeColors(this.f49336k, this.f49338m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: b */
    public RectF mo57785b() {
        this.f49331f.set(getBounds());
        return this.f49331f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo57786c(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f49338m = colorStateList.getColorForState(getState(), this.f49338m);
        }
        this.f49341p = colorStateList;
        this.f49339n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo57787d(@Dimension float f) {
        if (this.f49333h != f) {
            this.f49333h = f;
            this.f49327b.setStrokeWidth(f * 1.3333f);
            this.f49339n = true;
            invalidateSelf();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f49339n) {
            this.f49327b.setShader(m68409a());
            this.f49339n = false;
        }
        float strokeWidth = this.f49327b.getStrokeWidth() / 2.0f;
        copyBounds(this.f49329d);
        this.f49330e.set(this.f49329d);
        float min = Math.min(this.f49340o.mo58703r().mo58627a(mo57785b()), this.f49330e.width() / 2.0f);
        if (this.f49340o.mo58706u(mo57785b())) {
            this.f49330e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f49330e, min, min, this.f49327b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo57789e(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this.f49334i = i;
        this.f49335j = i2;
        this.f49336k = i3;
        this.f49337l = i4;
    }

    /* renamed from: f */
    public void mo57790f(ShapeAppearanceModel shapeAppearanceModel) {
        this.f49340o = shapeAppearanceModel;
        invalidateSelf();
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f49332g;
    }

    public int getOpacity() {
        return this.f49333h > 0.0f ? -3 : -2;
    }

    public void getOutline(@NonNull Outline outline) {
        if (this.f49340o.mo58706u(mo57785b())) {
            outline.setRoundRect(getBounds(), this.f49340o.mo58703r().mo58627a(mo57785b()));
            return;
        }
        copyBounds(this.f49329d);
        this.f49330e.set(this.f49329d);
        this.f49326a.mo58734d(this.f49340o, 1.0f, this.f49330e, this.f49328c);
        if (this.f49328c.isConvex()) {
            outline.setConvexPath(this.f49328c);
        }
    }

    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f49340o.mo58706u(mo57785b())) {
            return true;
        }
        int round = Math.round(this.f49333h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f49341p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f49339n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f49341p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f49338m)) == this.f49338m)) {
            this.f49339n = true;
            this.f49338m = colorForState;
        }
        if (this.f49339n) {
            invalidateSelf();
        }
        return this.f49339n;
    }

    public void setAlpha(@IntRange(from = 0, mo610to = 255) int i) {
        this.f49327b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f49327b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
