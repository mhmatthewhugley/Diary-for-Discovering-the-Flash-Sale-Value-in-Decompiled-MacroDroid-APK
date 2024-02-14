package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialButtonHelper {
    @ChecksSdkIntAtLeast(api = 21)

    /* renamed from: t */
    private static final boolean f48891t = true;

    /* renamed from: u */
    private static final boolean f48892u;

    /* renamed from: a */
    private final MaterialButton f48893a;
    @NonNull

    /* renamed from: b */
    private ShapeAppearanceModel f48894b;

    /* renamed from: c */
    private int f48895c;

    /* renamed from: d */
    private int f48896d;

    /* renamed from: e */
    private int f48897e;

    /* renamed from: f */
    private int f48898f;

    /* renamed from: g */
    private int f48899g;

    /* renamed from: h */
    private int f48900h;
    @Nullable

    /* renamed from: i */
    private PorterDuff.Mode f48901i;
    @Nullable

    /* renamed from: j */
    private ColorStateList f48902j;
    @Nullable

    /* renamed from: k */
    private ColorStateList f48903k;
    @Nullable

    /* renamed from: l */
    private ColorStateList f48904l;
    @Nullable

    /* renamed from: m */
    private Drawable f48905m;

    /* renamed from: n */
    private boolean f48906n = false;

    /* renamed from: o */
    private boolean f48907o = false;

    /* renamed from: p */
    private boolean f48908p = false;

    /* renamed from: q */
    private boolean f48909q;

    /* renamed from: r */
    private LayerDrawable f48910r;

    /* renamed from: s */
    private int f48911s;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i > 22) {
            z = false;
        }
        f48892u = z;
    }

    MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f48893a = materialButton;
        this.f48894b = shapeAppearanceModel;
    }

    /* renamed from: E */
    private void m67719E(@Dimension int i, @Dimension int i2) {
        int paddingStart = ViewCompat.getPaddingStart(this.f48893a);
        int paddingTop = this.f48893a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f48893a);
        int paddingBottom = this.f48893a.getPaddingBottom();
        int i3 = this.f48897e;
        int i4 = this.f48898f;
        this.f48898f = i2;
        this.f48897e = i;
        if (!this.f48907o) {
            m67720F();
        }
        ViewCompat.setPaddingRelative(this.f48893a, paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m67720F() {
        this.f48893a.setInternalBackground(m67724a());
        MaterialShapeDrawable f = mo57055f();
        if (f != null) {
            f.mo58655Z((float) this.f48911s);
        }
    }

    /* renamed from: G */
    private void m67721G(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!f48892u || this.f48907o) {
            if (mo57055f() != null) {
                mo57055f().setShapeAppearanceModel(shapeAppearanceModel);
            }
            if (m67726n() != null) {
                m67726n().setShapeAppearanceModel(shapeAppearanceModel);
            }
            if (mo57054e() != null) {
                mo57054e().setShapeAppearanceModel(shapeAppearanceModel);
                return;
            }
            return;
        }
        int paddingStart = ViewCompat.getPaddingStart(this.f48893a);
        int paddingTop = this.f48893a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f48893a);
        int paddingBottom = this.f48893a.getPaddingBottom();
        m67720F();
        ViewCompat.setPaddingRelative(this.f48893a, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: I */
    private void m67722I() {
        MaterialShapeDrawable f = mo57055f();
        MaterialShapeDrawable n = m67726n();
        if (f != null) {
            f.mo58673l0((float) this.f48900h, this.f48903k);
            if (n != null) {
                n.mo58671k0((float) this.f48900h, this.f48906n ? MaterialColors.m68104d(this.f48893a, C10462R.attr.colorSurface) : 0);
            }
        }
    }

    @NonNull
    /* renamed from: J */
    private InsetDrawable m67723J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f48895c, this.f48897e, this.f48896d, this.f48898f);
    }

    /* renamed from: a */
    private Drawable m67724a() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f48894b);
        materialShapeDrawable.mo58649P(this.f48893a.getContext());
        DrawableCompat.setTintList(materialShapeDrawable, this.f48902j);
        PorterDuff.Mode mode = this.f48901i;
        if (mode != null) {
            DrawableCompat.setTintMode(materialShapeDrawable, mode);
        }
        materialShapeDrawable.mo58673l0((float) this.f48900h, this.f48903k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f48894b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.mo58671k0((float) this.f48900h, this.f48906n ? MaterialColors.m68104d(this.f48893a, C10462R.attr.colorSurface) : 0);
        if (f48891t) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f48894b);
            this.f48905m = materialShapeDrawable3;
            DrawableCompat.setTint(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m69155d(this.f48904l), m67723J(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f48905m);
            this.f48910r = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f48894b);
        this.f48905m = rippleDrawableCompat;
        DrawableCompat.setTintList(rippleDrawableCompat, RippleUtils.m69155d(this.f48904l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f48905m});
        this.f48910r = layerDrawable;
        return m67723J(layerDrawable);
    }

    @Nullable
    /* renamed from: g */
    private MaterialShapeDrawable m67725g(boolean z) {
        LayerDrawable layerDrawable = this.f48910r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f48891t) {
            return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f48910r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (MaterialShapeDrawable) this.f48910r.getDrawable(z ^ true ? 1 : 0);
    }

    @Nullable
    /* renamed from: n */
    private MaterialShapeDrawable m67726n() {
        return m67725g(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo57046A(@Nullable ColorStateList colorStateList) {
        if (this.f48903k != colorStateList) {
            this.f48903k = colorStateList;
            m67722I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo57047B(int i) {
        if (this.f48900h != i) {
            this.f48900h = i;
            m67722I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo57048C(@Nullable ColorStateList colorStateList) {
        if (this.f48902j != colorStateList) {
            this.f48902j = colorStateList;
            if (mo57055f() != null) {
                DrawableCompat.setTintList(mo57055f(), this.f48902j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo57049D(@Nullable PorterDuff.Mode mode) {
        if (this.f48901i != mode) {
            this.f48901i = mode;
            if (mo57055f() != null && this.f48901i != null) {
                DrawableCompat.setTintMode(mo57055f(), this.f48901i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo57050H(int i, int i2) {
        Drawable drawable = this.f48905m;
        if (drawable != null) {
            drawable.setBounds(this.f48895c, this.f48897e, i2 - this.f48896d, i - this.f48898f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo57051b() {
        return this.f48899g;
    }

    /* renamed from: c */
    public int mo57052c() {
        return this.f48898f;
    }

    /* renamed from: d */
    public int mo57053d() {
        return this.f48897e;
    }

    @Nullable
    /* renamed from: e */
    public Shapeable mo57054e() {
        LayerDrawable layerDrawable = this.f48910r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f48910r.getNumberOfLayers() > 2) {
            return (Shapeable) this.f48910r.getDrawable(2);
        }
        return (Shapeable) this.f48910r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public MaterialShapeDrawable mo57055f() {
        return m67725g(false);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: h */
    public ColorStateList mo57056h() {
        return this.f48904l;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public ShapeAppearanceModel mo57057i() {
        return this.f48894b;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j */
    public ColorStateList mo57058j() {
        return this.f48903k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo57059k() {
        return this.f48900h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo57060l() {
        return this.f48902j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode mo57061m() {
        return this.f48901i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo57062o() {
        return this.f48907o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo57063p() {
        return this.f48909q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo57064q(@NonNull TypedArray typedArray) {
        this.f48895c = typedArray.getDimensionPixelOffset(C10462R.styleable.MaterialButton_android_insetLeft, 0);
        this.f48896d = typedArray.getDimensionPixelOffset(C10462R.styleable.MaterialButton_android_insetRight, 0);
        this.f48897e = typedArray.getDimensionPixelOffset(C10462R.styleable.MaterialButton_android_insetTop, 0);
        this.f48898f = typedArray.getDimensionPixelOffset(C10462R.styleable.MaterialButton_android_insetBottom, 0);
        int i = C10462R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f48899g = dimensionPixelSize;
            mo57072y(this.f48894b.mo58708w((float) dimensionPixelSize));
            this.f48908p = true;
        }
        this.f48900h = typedArray.getDimensionPixelSize(C10462R.styleable.MaterialButton_strokeWidth, 0);
        this.f48901i = ViewUtils.m68843j(typedArray.getInt(C10462R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f48902j = MaterialResources.m69121a(this.f48893a.getContext(), typedArray, C10462R.styleable.MaterialButton_backgroundTint);
        this.f48903k = MaterialResources.m69121a(this.f48893a.getContext(), typedArray, C10462R.styleable.MaterialButton_strokeColor);
        this.f48904l = MaterialResources.m69121a(this.f48893a.getContext(), typedArray, C10462R.styleable.MaterialButton_rippleColor);
        this.f48909q = typedArray.getBoolean(C10462R.styleable.MaterialButton_android_checkable, false);
        this.f48911s = typedArray.getDimensionPixelSize(C10462R.styleable.MaterialButton_elevation, 0);
        int paddingStart = ViewCompat.getPaddingStart(this.f48893a);
        int paddingTop = this.f48893a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f48893a);
        int paddingBottom = this.f48893a.getPaddingBottom();
        if (typedArray.hasValue(C10462R.styleable.MaterialButton_android_background)) {
            mo57066s();
        } else {
            m67720F();
        }
        ViewCompat.setPaddingRelative(this.f48893a, paddingStart + this.f48895c, paddingTop + this.f48897e, paddingEnd + this.f48896d, paddingBottom + this.f48898f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo57065r(int i) {
        if (mo57055f() != null) {
            mo57055f().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo57066s() {
        this.f48907o = true;
        this.f48893a.setSupportBackgroundTintList(this.f48902j);
        this.f48893a.setSupportBackgroundTintMode(this.f48901i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo57067t(boolean z) {
        this.f48909q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo57068u(int i) {
        if (!this.f48908p || this.f48899g != i) {
            this.f48899g = i;
            this.f48908p = true;
            mo57072y(this.f48894b.mo58708w((float) i));
        }
    }

    /* renamed from: v */
    public void mo57069v(@Dimension int i) {
        m67719E(this.f48897e, i);
    }

    /* renamed from: w */
    public void mo57070w(@Dimension int i) {
        m67719E(i, this.f48898f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo57071x(@Nullable ColorStateList colorStateList) {
        if (this.f48904l != colorStateList) {
            this.f48904l = colorStateList;
            boolean z = f48891t;
            if (z && (this.f48893a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f48893a.getBackground()).setColor(RippleUtils.m69155d(colorStateList));
            } else if (!z && (this.f48893a.getBackground() instanceof RippleDrawableCompat)) {
                ((RippleDrawableCompat) this.f48893a.getBackground()).setTintList(RippleUtils.m69155d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo57072y(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f48894b = shapeAppearanceModel;
        m67721G(shapeAppearanceModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo57073z(boolean z) {
        this.f48906n = z;
        m67722I();
    }
}
