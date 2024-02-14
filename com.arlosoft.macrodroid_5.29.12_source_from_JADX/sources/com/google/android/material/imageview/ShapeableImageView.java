package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;

public class ShapeableImageView extends AppCompatImageView implements Shapeable {

    /* renamed from: J */
    private static final int f49468J = C10462R.style.Widget_MaterialComponents_ShapeableImageView;
    @Dimension

    /* renamed from: A */
    private float f49469A;

    /* renamed from: B */
    private Path f49470B;
    @Dimension

    /* renamed from: C */
    private int f49471C;
    @Dimension

    /* renamed from: D */
    private int f49472D;
    @Dimension

    /* renamed from: E */
    private int f49473E;
    @Dimension

    /* renamed from: F */
    private int f49474F;
    @Dimension

    /* renamed from: G */
    private int f49475G;
    @Dimension

    /* renamed from: H */
    private int f49476H;

    /* renamed from: I */
    private boolean f49477I;

    /* renamed from: a */
    private final ShapeAppearancePathProvider f49478a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final RectF f49479c;

    /* renamed from: d */
    private final RectF f49480d;

    /* renamed from: f */
    private final Paint f49481f;

    /* renamed from: g */
    private final Paint f49482g;

    /* renamed from: o */
    private final Path f49483o;
    @Nullable

    /* renamed from: p */
    private ColorStateList f49484p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: s */
    public MaterialShapeDrawable f49485s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ShapeAppearanceModel f49486z;

    class OutlineProvider extends ViewOutlineProvider {

        /* renamed from: a */
        private final Rect f49487a = new Rect();

        OutlineProvider() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f49486z != null) {
                if (ShapeableImageView.this.f49485s == null) {
                    MaterialShapeDrawable unused = ShapeableImageView.this.f49485s = new MaterialShapeDrawable(ShapeableImageView.this.f49486z);
                }
                ShapeableImageView.this.f49479c.round(this.f49487a);
                ShapeableImageView.this.f49485s.setBounds(this.f49487a);
                ShapeableImageView.this.f49485s.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m68617e(Canvas canvas) {
        if (this.f49484p != null) {
            this.f49481f.setStrokeWidth(this.f49469A);
            int colorForState = this.f49484p.getColorForState(getDrawableState(), this.f49484p.getDefaultColor());
            if (this.f49469A > 0.0f && colorForState != 0) {
                this.f49481f.setColor(colorForState);
                canvas.drawPath(this.f49483o, this.f49481f);
            }
        }
    }

    /* renamed from: f */
    private boolean m68618f() {
        return (this.f49475G == Integer.MIN_VALUE && this.f49476H == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: g */
    private boolean m68619g() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: h */
    private void m68620h(int i, int i2) {
        this.f49479c.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f49478a.mo58734d(this.f49486z, 1.0f, this.f49479c, this.f49483o);
        this.f49470B.rewind();
        this.f49470B.addPath(this.f49483o);
        this.f49480d.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f49470B.addRect(this.f49480d, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f49474F;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.f49476H;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m68619g() ? this.f49471C : this.f49473E;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (m68618f()) {
            if (m68619g() && (i2 = this.f49476H) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m68619g() && (i = this.f49475G) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f49471C;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (m68618f()) {
            if (m68619g() && (i2 = this.f49475G) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m68619g() && (i = this.f49476H) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f49473E;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.f49475G;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m68619g() ? this.f49473E : this.f49471C;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f49472D;
    }

    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49486z;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f49484p;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f49469A;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f49470B, this.f49482g);
        m68617e(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f49477I && isLayoutDirectionResolved()) {
            this.f49477I = true;
            if (isPaddingRelative() || m68618f()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m68620h(i, i2);
    }

    public void setPadding(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f49486z = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f49485s;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        m68620h(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f49484p = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.f49469A != f) {
            this.f49469A = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f49468J
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.ShapeAppearancePathProvider r7 = com.google.android.material.shape.ShapeAppearancePathProvider.m69330k()
            r6.f49478a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f49483o = r7
            r7 = 0
            r6.f49477I = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f49482g = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f49479c = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f49480d = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f49470B = r2
            int[] r2 = com.google.android.material.C10462R.styleable.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.m69121a(r1, r2, r4)
            r6.f49484p = r4
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f49469A = r4
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f49471C = r7
            r6.f49472D = r7
            r6.f49473E = r7
            r6.f49474F = r7
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f49471C = r4
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f49472D = r4
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f49473E = r4
            int r4 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f49474F = r7
            int r7 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f49475G = r7
            int r7 = com.google.android.material.C10462R.styleable.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f49476H = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f49481f = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = com.google.android.material.shape.ShapeAppearanceModel.m69264e(r1, r8, r9, r0)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.mo58721m()
            r6.f49486z = r7
            com.google.android.material.imageview.ShapeableImageView$OutlineProvider r7 = new com.google.android.material.imageview.ShapeableImageView$OutlineProvider
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
