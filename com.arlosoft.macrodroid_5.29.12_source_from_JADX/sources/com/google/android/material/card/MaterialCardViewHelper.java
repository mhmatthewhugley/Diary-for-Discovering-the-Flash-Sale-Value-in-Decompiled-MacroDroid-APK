package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialCardViewHelper {

    /* renamed from: t */
    private static final double f48942t = Math.cos(Math.toRadians(45.0d));
    @NonNull

    /* renamed from: a */
    private final MaterialCardView f48943a;
    @NonNull

    /* renamed from: b */
    private final Rect f48944b = new Rect();
    @NonNull

    /* renamed from: c */
    private final MaterialShapeDrawable f48945c;
    @NonNull

    /* renamed from: d */
    private final MaterialShapeDrawable f48946d;
    @Dimension

    /* renamed from: e */
    private int f48947e;
    @Dimension

    /* renamed from: f */
    private int f48948f;
    @Dimension

    /* renamed from: g */
    private int f48949g;
    @Nullable

    /* renamed from: h */
    private Drawable f48950h;
    @Nullable

    /* renamed from: i */
    private Drawable f48951i;
    @Nullable

    /* renamed from: j */
    private ColorStateList f48952j;
    @Nullable

    /* renamed from: k */
    private ColorStateList f48953k;
    @Nullable

    /* renamed from: l */
    private ShapeAppearanceModel f48954l;
    @Nullable

    /* renamed from: m */
    private ColorStateList f48955m;
    @Nullable

    /* renamed from: n */
    private Drawable f48956n;
    @Nullable

    /* renamed from: o */
    private LayerDrawable f48957o;
    @Nullable

    /* renamed from: p */
    private MaterialShapeDrawable f48958p;
    @Nullable

    /* renamed from: q */
    private MaterialShapeDrawable f48959q;

    /* renamed from: r */
    private boolean f48960r = false;

    /* renamed from: s */
    private boolean f48961s;

    public MaterialCardViewHelper(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i, @StyleRes int i2) {
        this.f48943a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f48945c = materialShapeDrawable;
        materialShapeDrawable.mo58649P(materialCardView.getContext());
        materialShapeDrawable.mo58662g0(-12303292);
        ShapeAppearanceModel.Builder v = materialShapeDrawable.getShapeAppearanceModel().mo58707v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C10462R.styleable.CardView, i, C10462R.style.CardView);
        int i3 = C10462R.styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo58722o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f48946d = new MaterialShapeDrawable();
        mo57154R(v.mo58721m());
        obtainStyledAttributes.recycle();
    }

    @NonNull
    /* renamed from: A */
    private Drawable m67796A(Drawable drawable) {
        int i;
        int i2;
        if (this.f48943a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m67804d());
            i2 = (int) Math.ceil((double) m67802c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new InsetDrawable(drawable, i2, i, i2, i) {
            public int getMinimumHeight() {
                return -1;
            }

            public int getMinimumWidth() {
                return -1;
            }

            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    /* renamed from: V */
    private boolean m67797V() {
        return this.f48943a.getPreventCornerOverlap() && !m67805e();
    }

    /* renamed from: W */
    private boolean m67798W() {
        return this.f48943a.getPreventCornerOverlap() && m67805e() && this.f48943a.getUseCompatPadding();
    }

    /* renamed from: a */
    private float m67799a() {
        return Math.max(Math.max(m67801b(this.f48954l.mo58702q(), this.f48945c.mo58645I()), m67801b(this.f48954l.mo58704s(), this.f48945c.mo58646J())), Math.max(m67801b(this.f48954l.mo58697k(), this.f48945c.mo58681t()), m67801b(this.f48954l.mo58695i(), this.f48945c.mo58680s())));
    }

    /* renamed from: a0 */
    private void m67800a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f48943a.getForeground() instanceof InsetDrawable)) {
            this.f48943a.setForeground(m67796A(drawable));
        } else {
            ((InsetDrawable) this.f48943a.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: b */
    private float m67801b(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f48942t) * ((double) f));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m67802c() {
        return this.f48943a.getMaxCardElevation() + (m67798W() ? m67799a() : 0.0f);
    }

    /* renamed from: c0 */
    private void m67803c0() {
        Drawable drawable;
        if (!RippleUtils.f49933a || (drawable = this.f48956n) == null) {
            MaterialShapeDrawable materialShapeDrawable = this.f48958p;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.mo58656a0(this.f48952j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f48952j);
    }

    /* renamed from: d */
    private float m67804d() {
        return (this.f48943a.getMaxCardElevation() * 1.5f) + (m67798W() ? m67799a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m67805e() {
        return this.f48945c.mo58651S();
    }

    @NonNull
    /* renamed from: f */
    private Drawable m67806f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable h = m67808h();
        this.f48958p = h;
        h.mo58656a0(this.f48952j);
        stateListDrawable.addState(new int[]{16842919}, this.f48958p);
        return stateListDrawable;
    }

    @NonNull
    /* renamed from: g */
    private Drawable m67807g() {
        if (!RippleUtils.f49933a) {
            return m67806f();
        }
        this.f48959q = m67808h();
        return new RippleDrawable(this.f48952j, (Drawable) null, this.f48959q);
    }

    @NonNull
    /* renamed from: h */
    private MaterialShapeDrawable m67808h() {
        return new MaterialShapeDrawable(this.f48954l);
    }

    @NonNull
    /* renamed from: q */
    private Drawable m67809q() {
        if (this.f48956n == null) {
            this.f48956n = m67807g();
        }
        if (this.f48957o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f48956n, this.f48946d, this.f48951i});
            this.f48957o = layerDrawable;
            layerDrawable.setId(2, C10462R.C10465id.mtrl_card_checked_layer_id);
        }
        return this.f48957o;
    }

    /* renamed from: s */
    private float m67810s() {
        if (!this.f48943a.getPreventCornerOverlap() || !this.f48943a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f48942t) * ((double) this.f48943a.getCardViewRadius()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo57138B() {
        return this.f48960r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo57139C() {
        return this.f48961s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo57140D(@NonNull TypedArray typedArray) {
        ColorStateList a = MaterialResources.m69121a(this.f48943a.getContext(), typedArray, C10462R.styleable.MaterialCardView_strokeColor);
        this.f48955m = a;
        if (a == null) {
            this.f48955m = ColorStateList.valueOf(-1);
        }
        this.f48949g = typedArray.getDimensionPixelSize(C10462R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C10462R.styleable.MaterialCardView_android_checkable, false);
        this.f48961s = z;
        this.f48943a.setLongClickable(z);
        this.f48953k = MaterialResources.m69121a(this.f48943a.getContext(), typedArray, C10462R.styleable.MaterialCardView_checkedIconTint);
        mo57147K(MaterialResources.m69124d(this.f48943a.getContext(), typedArray, C10462R.styleable.MaterialCardView_checkedIcon));
        mo57149M(typedArray.getDimensionPixelSize(C10462R.styleable.MaterialCardView_checkedIconSize, 0));
        mo57148L(typedArray.getDimensionPixelSize(C10462R.styleable.MaterialCardView_checkedIconMargin, 0));
        ColorStateList a2 = MaterialResources.m69121a(this.f48943a.getContext(), typedArray, C10462R.styleable.MaterialCardView_rippleColor);
        this.f48952j = a2;
        if (a2 == null) {
            this.f48952j = ColorStateList.valueOf(MaterialColors.m68104d(this.f48943a, C10462R.attr.colorControlHighlight));
        }
        mo57144H(MaterialResources.m69121a(this.f48943a.getContext(), typedArray, C10462R.styleable.MaterialCardView_cardForegroundColor));
        m67803c0();
        mo57160Z();
        mo57162d0();
        this.f48943a.setBackgroundInternal(m67796A(this.f48945c));
        Drawable q = this.f48943a.isClickable() ? m67809q() : this.f48946d;
        this.f48950h = q;
        this.f48943a.setForeground(m67796A(q));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo57141E(int i, int i2) {
        int i3;
        int i4;
        if (this.f48957o != null) {
            int i5 = this.f48947e;
            int i6 = this.f48948f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if (this.f48943a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m67804d() * 2.0f));
                i7 -= (int) Math.ceil((double) (m67802c() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f48947e;
            if (ViewCompat.getLayoutDirection(this.f48943a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f48957o.setLayerInset(2, i4, this.f48947e, i3, i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo57142F(boolean z) {
        this.f48960r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo57143G(ColorStateList colorStateList) {
        this.f48945c.mo58656a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo57144H(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f48946d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.mo58656a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo57145I(boolean z) {
        this.f48961s = z;
    }

    /* renamed from: J */
    public void mo57146J(boolean z) {
        Drawable drawable = this.f48951i;
        if (drawable != null) {
            drawable.setAlpha(z ? 255 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo57147K(@Nullable Drawable drawable) {
        this.f48951i = drawable;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f48951i = mutate;
            DrawableCompat.setTintList(mutate, this.f48953k);
            mo57146J(this.f48943a.isChecked());
        }
        LayerDrawable layerDrawable = this.f48957o;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C10462R.C10465id.mtrl_card_checked_layer_id, this.f48951i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo57148L(@Dimension int i) {
        this.f48947e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo57149M(@Dimension int i) {
        this.f48948f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo57150N(@Nullable ColorStateList colorStateList) {
        this.f48953k = colorStateList;
        Drawable drawable = this.f48951i;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo57151O(float f) {
        mo57154R(this.f48954l.mo58708w(f));
        this.f48950h.invalidateSelf();
        if (m67798W() || m67797V()) {
            mo57159Y();
        }
        if (m67798W()) {
            mo57161b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo57152P(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f48945c.mo58657b0(f);
        MaterialShapeDrawable materialShapeDrawable = this.f48946d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo58657b0(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f48959q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.mo58657b0(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo57153Q(@Nullable ColorStateList colorStateList) {
        this.f48952j = colorStateList;
        m67803c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo57154R(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f48954l = shapeAppearanceModel;
        this.f48945c.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable materialShapeDrawable = this.f48945c;
        materialShapeDrawable.mo58661f0(!materialShapeDrawable.mo58651S());
        MaterialShapeDrawable materialShapeDrawable2 = this.f48946d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f48959q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f48958p;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo57155S(ColorStateList colorStateList) {
        if (this.f48955m != colorStateList) {
            this.f48955m = colorStateList;
            mo57162d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo57156T(@Dimension int i) {
        if (i != this.f48949g) {
            this.f48949g = i;
            mo57162d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo57157U(int i, int i2, int i3, int i4) {
        this.f48944b.set(i, i2, i3, i4);
        mo57159Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo57158X() {
        Drawable drawable = this.f48950h;
        Drawable q = this.f48943a.isClickable() ? m67809q() : this.f48946d;
        this.f48950h = q;
        if (drawable != q) {
            m67800a0(q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo57159Y() {
        int a = (int) ((m67797V() || m67798W() ? m67799a() : 0.0f) - m67810s());
        MaterialCardView materialCardView = this.f48943a;
        Rect rect = this.f48944b;
        materialCardView.mo57108i(rect.left + a, rect.top + a, rect.right + a, rect.bottom + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo57160Z() {
        this.f48945c.mo58655Z(this.f48943a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo57161b0() {
        if (!mo57138B()) {
            this.f48943a.setBackgroundInternal(m67796A(this.f48945c));
        }
        this.f48943a.setForeground(m67796A(this.f48950h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo57162d0() {
        this.f48946d.mo58673l0((float) this.f48949g, this.f48955m);
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 23)
    /* renamed from: i */
    public void mo57163i() {
        Drawable drawable = this.f48956n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f48956n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f48956n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: j */
    public MaterialShapeDrawable mo57164j() {
        return this.f48945c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList mo57165k() {
        return this.f48945c.mo58684x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo57166l() {
        return this.f48946d.mo58684x();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public Drawable mo57167m() {
        return this.f48951i;
    }

    /* access modifiers changed from: package-private */
    @Dimension
    /* renamed from: n */
    public int mo57168n() {
        return this.f48947e;
    }

    /* access modifiers changed from: package-private */
    @Dimension
    /* renamed from: o */
    public int mo57169o() {
        return this.f48948f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: p */
    public ColorStateList mo57170p() {
        return this.f48953k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public float mo57171r() {
        return this.f48945c.mo58645I();
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo592to = 1.0d)
    /* renamed from: t */
    public float mo57172t() {
        return this.f48945c.mo58685y();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: u */
    public ColorStateList mo57173u() {
        return this.f48952j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ShapeAppearanceModel mo57174v() {
        return this.f48954l;
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: w */
    public int mo57175w() {
        ColorStateList colorStateList = this.f48955m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: x */
    public ColorStateList mo57176x() {
        return this.f48955m;
    }

    /* access modifiers changed from: package-private */
    @Dimension
    /* renamed from: y */
    public int mo57177y() {
        return this.f48949g;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: z */
    public Rect mo57178z() {
        return this.f48944b;
    }
}
