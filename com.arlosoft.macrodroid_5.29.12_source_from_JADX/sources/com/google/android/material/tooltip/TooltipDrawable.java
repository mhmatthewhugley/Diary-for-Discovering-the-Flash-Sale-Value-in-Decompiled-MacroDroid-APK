package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    @StyleRes

    /* renamed from: h0 */
    private static final int f50725h0 = C10462R.style.Widget_MaterialComponents_Tooltip;
    @AttrRes

    /* renamed from: i0 */
    private static final int f50726i0 = C10462R.attr.tooltipStyle;
    @Nullable

    /* renamed from: Q */
    private CharSequence f50727Q;
    @NonNull

    /* renamed from: R */
    private final Context f50728R;
    @Nullable

    /* renamed from: S */
    private final Paint.FontMetrics f50729S = new Paint.FontMetrics();
    @NonNull

    /* renamed from: T */
    private final TextDrawableHelper f50730T;
    @NonNull

    /* renamed from: U */
    private final View.OnLayoutChangeListener f50731U;
    @NonNull

    /* renamed from: V */
    private final Rect f50732V;

    /* renamed from: W */
    private int f50733W;

    /* renamed from: X */
    private int f50734X;

    /* renamed from: Y */
    private int f50735Y;

    /* renamed from: Z */
    private int f50736Z;

    /* renamed from: a0 */
    private int f50737a0;

    /* renamed from: b0 */
    private int f50738b0;

    /* renamed from: c0 */
    private float f50739c0;

    /* renamed from: d0 */
    private float f50740d0;

    /* renamed from: e0 */
    private final float f50741e0;

    /* renamed from: f0 */
    private float f50742f0;

    /* renamed from: g0 */
    private float f50743g0;

    private TooltipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f50730T = textDrawableHelper;
        this.f50731U = new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                TooltipDrawable.this.m70080F0(view);
            }
        };
        this.f50732V = new Rect();
        this.f50739c0 = 1.0f;
        this.f50740d0 = 1.0f;
        this.f50741e0 = 0.5f;
        this.f50742f0 = 0.5f;
        this.f50743g0 = 1.0f;
        this.f50728R = context;
        textDrawableHelper.mo58218e().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.mo58218e().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: A0 */
    private void m70079A0(@Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray h = ThemeEnforcement.m68822h(this.f50728R, attributeSet, C10462R.styleable.Tooltip, i, i2, new int[0]);
        this.f50737a0 = this.f50728R.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().mo58707v().mo58726s(m70086w0()).mo58721m());
        mo59429D0(h.getText(C10462R.styleable.Tooltip_android_text));
        TextAppearance f = MaterialResources.m69126f(this.f50728R, h, C10462R.styleable.Tooltip_android_textAppearance);
        if (f != null) {
            int i3 = C10462R.styleable.Tooltip_android_textColor;
            if (h.hasValue(i3)) {
                f.mo58605k(MaterialResources.m69121a(this.f50728R, h, i3));
            }
        }
        mo59430E0(f);
        mo58656a0(ColorStateList.valueOf(h.getColor(C10462R.styleable.Tooltip_backgroundTint, MaterialColors.m68107g(ColorUtils.setAlphaComponent(MaterialColors.m68103c(this.f50728R, 16842801, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.m68103c(this.f50728R, C10462R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        mo58674m0(ColorStateList.valueOf(MaterialColors.m68103c(this.f50728R, C10462R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.f50733W = h.getDimensionPixelSize(C10462R.styleable.Tooltip_android_padding, 0);
        this.f50734X = h.getDimensionPixelSize(C10462R.styleable.Tooltip_android_minWidth, 0);
        this.f50735Y = h.getDimensionPixelSize(C10462R.styleable.Tooltip_android_minHeight, 0);
        this.f50736Z = h.getDimensionPixelSize(C10462R.styleable.Tooltip_android_layout_margin, 0);
        h.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m70080F0(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f50738b0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f50732V);
    }

    /* renamed from: s0 */
    private float m70082s0() {
        int i;
        if (((this.f50732V.right - getBounds().right) - this.f50738b0) - this.f50736Z < 0) {
            i = ((this.f50732V.right - getBounds().right) - this.f50738b0) - this.f50736Z;
        } else if (((this.f50732V.left - getBounds().left) - this.f50738b0) + this.f50736Z <= 0) {
            return 0.0f;
        } else {
            i = ((this.f50732V.left - getBounds().left) - this.f50738b0) + this.f50736Z;
        }
        return (float) i;
    }

    /* renamed from: t0 */
    private float m70083t0() {
        this.f50730T.mo58218e().getFontMetrics(this.f50729S);
        Paint.FontMetrics fontMetrics = this.f50729S;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: u0 */
    private float m70084u0(@NonNull Rect rect) {
        return ((float) rect.centerY()) - m70083t0();
    }

    @NonNull
    /* renamed from: v0 */
    public static TooltipDrawable m70085v0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.m70079A0(attributeSet, i, i2);
        return tooltipDrawable;
    }

    /* renamed from: w0 */
    private EdgeTreatment m70086w0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f50737a0) * Math.sqrt(2.0d)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment((float) this.f50737a0), Math.min(Math.max(-m70082s0(), -width), width));
    }

    /* renamed from: y0 */
    private void m70087y0(@NonNull Canvas canvas) {
        if (this.f50727Q != null) {
            Rect bounds = getBounds();
            int u0 = (int) m70084u0(bounds);
            if (this.f50730T.mo58217d() != null) {
                this.f50730T.mo58218e().drawableState = getState();
                this.f50730T.mo58223j(this.f50728R);
                this.f50730T.mo58218e().setAlpha((int) (this.f50743g0 * 255.0f));
            }
            CharSequence charSequence = this.f50727Q;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) u0, this.f50730T.mo58218e());
        }
    }

    /* renamed from: z0 */
    private float m70088z0() {
        CharSequence charSequence = this.f50727Q;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f50730T.mo58219f(charSequence.toString());
    }

    /* renamed from: B0 */
    public void mo59427B0(@Nullable View view) {
        if (view != null) {
            m70080F0(view);
            view.addOnLayoutChangeListener(this.f50731U);
        }
    }

    /* renamed from: C0 */
    public void mo59428C0(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f50742f0 = 1.2f;
        this.f50739c0 = f;
        this.f50740d0 = f;
        this.f50743g0 = AnimationUtils.m67221b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: D0 */
    public void mo59429D0(@Nullable CharSequence charSequence) {
        if (!TextUtils.equals(this.f50727Q, charSequence)) {
            this.f50727Q = charSequence;
            this.f50730T.mo58222i(true);
            invalidateSelf();
        }
    }

    /* renamed from: E0 */
    public void mo59430E0(@Nullable TextAppearance textAppearance) {
        this.f50730T.mo58221h(textAppearance, this.f50728R);
    }

    /* renamed from: a */
    public void mo56809a() {
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.scale(this.f50739c0, this.f50740d0, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f50742f0));
        canvas.translate(m70082s0(), (float) (-((((double) this.f50737a0) * Math.sqrt(2.0d)) - ((double) this.f50737a0))));
        super.draw(canvas);
        m70087y0(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f50730T.mo58218e().getTextSize(), (float) this.f50735Y);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f50733W * 2)) + m70088z0(), (float) this.f50734X);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().mo58707v().mo58726s(m70086w0()).mo58721m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: x0 */
    public void mo59433x0(@Nullable View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f50731U);
        }
    }
}
