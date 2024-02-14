package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;

public class ShapeAppearanceModel {

    /* renamed from: m */
    public static final CornerSize f50037m = new RelativeCornerSize(0.5f);

    /* renamed from: a */
    CornerTreatment f50038a;

    /* renamed from: b */
    CornerTreatment f50039b;

    /* renamed from: c */
    CornerTreatment f50040c;

    /* renamed from: d */
    CornerTreatment f50041d;

    /* renamed from: e */
    CornerSize f50042e;

    /* renamed from: f */
    CornerSize f50043f;

    /* renamed from: g */
    CornerSize f50044g;

    /* renamed from: h */
    CornerSize f50045h;

    /* renamed from: i */
    EdgeTreatment f50046i;

    /* renamed from: j */
    EdgeTreatment f50047j;

    /* renamed from: k */
    EdgeTreatment f50048k;

    /* renamed from: l */
    EdgeTreatment f50049l;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @NonNull
        /* renamed from: a */
        CornerSize mo58689a(@NonNull CornerSize cornerSize);
    }

    @NonNull
    /* renamed from: a */
    public static Builder m69260a() {
        return new Builder();
    }

    @NonNull
    /* renamed from: b */
    public static Builder m69261b(Context context, @StyleRes int i, @StyleRes int i2) {
        return m69262c(context, i, i2, 0);
    }

    @NonNull
    /* renamed from: c */
    private static Builder m69262c(Context context, @StyleRes int i, @StyleRes int i2, int i3) {
        return m69263d(context, i, i2, new AbsoluteCornerSize((float) i3));
    }

    @NonNull
    /* renamed from: d */
    private static Builder m69263d(Context context, @StyleRes int i, @StyleRes int i2, @NonNull CornerSize cornerSize) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10462R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C10462R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C10462R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C10462R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C10462R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C10462R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            CornerSize m = m69267m(obtainStyledAttributes, C10462R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize m2 = m69267m(obtainStyledAttributes, C10462R.styleable.ShapeAppearance_cornerSizeTopLeft, m);
            CornerSize m3 = m69267m(obtainStyledAttributes, C10462R.styleable.ShapeAppearance_cornerSizeTopRight, m);
            CornerSize m4 = m69267m(obtainStyledAttributes, C10462R.styleable.ShapeAppearance_cornerSizeBottomRight, m);
            return new Builder().mo58713C(i4, m2).mo58717G(i5, m3).mo58731x(i6, m4).mo58727t(i7, m69267m(obtainStyledAttributes, C10462R.styleable.ShapeAppearance_cornerSizeBottomLeft, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    /* renamed from: e */
    public static Builder m69264e(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return m69265f(context, attributeSet, i, i2, 0);
    }

    @NonNull
    /* renamed from: f */
    public static Builder m69265f(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, int i3) {
        return m69266g(context, attributeSet, i, i2, new AbsoluteCornerSize((float) i3));
    }

    @NonNull
    /* renamed from: g */
    public static Builder m69266g(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m69263d(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    /* renamed from: m */
    private static CornerSize m69267m(TypedArray typedArray, int i, @NonNull CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cornerSize;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AbsoluteCornerSize((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @NonNull
    /* renamed from: h */
    public EdgeTreatment mo58694h() {
        return this.f50048k;
    }

    @NonNull
    /* renamed from: i */
    public CornerTreatment mo58695i() {
        return this.f50041d;
    }

    @NonNull
    /* renamed from: j */
    public CornerSize mo58696j() {
        return this.f50045h;
    }

    @NonNull
    /* renamed from: k */
    public CornerTreatment mo58697k() {
        return this.f50040c;
    }

    @NonNull
    /* renamed from: l */
    public CornerSize mo58698l() {
        return this.f50044g;
    }

    @NonNull
    /* renamed from: n */
    public EdgeTreatment mo58699n() {
        return this.f50049l;
    }

    @NonNull
    /* renamed from: o */
    public EdgeTreatment mo58700o() {
        return this.f50047j;
    }

    @NonNull
    /* renamed from: p */
    public EdgeTreatment mo58701p() {
        return this.f50046i;
    }

    @NonNull
    /* renamed from: q */
    public CornerTreatment mo58702q() {
        return this.f50038a;
    }

    @NonNull
    /* renamed from: r */
    public CornerSize mo58703r() {
        return this.f50042e;
    }

    @NonNull
    /* renamed from: s */
    public CornerTreatment mo58704s() {
        return this.f50039b;
    }

    @NonNull
    /* renamed from: t */
    public CornerSize mo58705t() {
        return this.f50043f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public boolean mo58706u(@NonNull RectF rectF) {
        Class<EdgeTreatment> cls = EdgeTreatment.class;
        boolean z = this.f50049l.getClass().equals(cls) && this.f50047j.getClass().equals(cls) && this.f50046i.getClass().equals(cls) && this.f50048k.getClass().equals(cls);
        float a = this.f50042e.mo58627a(rectF);
        boolean z2 = this.f50043f.mo58627a(rectF) == a && this.f50045h.mo58627a(rectF) == a && this.f50044g.mo58627a(rectF) == a;
        boolean z3 = (this.f50039b instanceof RoundedCornerTreatment) && (this.f50038a instanceof RoundedCornerTreatment) && (this.f50040c instanceof RoundedCornerTreatment) && (this.f50041d instanceof RoundedCornerTreatment);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: v */
    public Builder mo58707v() {
        return new Builder(this);
    }

    @NonNull
    /* renamed from: w */
    public ShapeAppearanceModel mo58708w(float f) {
        return mo58707v().mo58722o(f).mo58721m();
    }

    @NonNull
    /* renamed from: x */
    public ShapeAppearanceModel mo58709x(@NonNull CornerSize cornerSize) {
        return mo58707v().mo58723p(cornerSize).mo58721m();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public ShapeAppearanceModel mo58710y(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return mo58707v().mo58716F(cornerSizeUnaryOperator.mo58689a(mo58703r())).mo58720J(cornerSizeUnaryOperator.mo58689a(mo58705t())).mo58730w(cornerSizeUnaryOperator.mo58689a(mo58696j())).mo58711A(cornerSizeUnaryOperator.mo58689a(mo58698l())).mo58721m();
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
        this.f50038a = builder.f50050a;
        this.f50039b = builder.f50051b;
        this.f50040c = builder.f50052c;
        this.f50041d = builder.f50053d;
        this.f50042e = builder.f50054e;
        this.f50043f = builder.f50055f;
        this.f50044g = builder.f50056g;
        this.f50045h = builder.f50057h;
        this.f50046i = builder.f50058i;
        this.f50047j = builder.f50059j;
        this.f50048k = builder.f50060k;
        this.f50049l = builder.f50061l;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: a */
        public CornerTreatment f50050a = MaterialShapeUtils.m69251b();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: b */
        public CornerTreatment f50051b = MaterialShapeUtils.m69251b();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: c */
        public CornerTreatment f50052c = MaterialShapeUtils.m69251b();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public CornerTreatment f50053d = MaterialShapeUtils.m69251b();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public CornerSize f50054e = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public CornerSize f50055f = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public CornerSize f50056g = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public CornerSize f50057h = new AbsoluteCornerSize(0.0f);
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public EdgeTreatment f50058i = MaterialShapeUtils.m69252c();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public EdgeTreatment f50059j = MaterialShapeUtils.m69252c();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public EdgeTreatment f50060k = MaterialShapeUtils.m69252c();
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public EdgeTreatment f50061l = MaterialShapeUtils.m69252c();

        public Builder() {
        }

        /* renamed from: n */
        private static float m69297n(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f50036a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f49975a;
            }
            return -1.0f;
        }

        @NonNull
        /* renamed from: A */
        public Builder mo58711A(@NonNull CornerSize cornerSize) {
            this.f50056g = cornerSize;
            return this;
        }

        @NonNull
        /* renamed from: B */
        public Builder mo58712B(@NonNull EdgeTreatment edgeTreatment) {
            this.f50058i = edgeTreatment;
            return this;
        }

        @NonNull
        /* renamed from: C */
        public Builder mo58713C(int i, @NonNull CornerSize cornerSize) {
            return mo58714D(MaterialShapeUtils.m69250a(i)).mo58716F(cornerSize);
        }

        @NonNull
        /* renamed from: D */
        public Builder mo58714D(@NonNull CornerTreatment cornerTreatment) {
            this.f50050a = cornerTreatment;
            float n = m69297n(cornerTreatment);
            if (n != -1.0f) {
                mo58715E(n);
            }
            return this;
        }

        @NonNull
        /* renamed from: E */
        public Builder mo58715E(@Dimension float f) {
            this.f50054e = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        /* renamed from: F */
        public Builder mo58716F(@NonNull CornerSize cornerSize) {
            this.f50054e = cornerSize;
            return this;
        }

        @NonNull
        /* renamed from: G */
        public Builder mo58717G(int i, @NonNull CornerSize cornerSize) {
            return mo58718H(MaterialShapeUtils.m69250a(i)).mo58720J(cornerSize);
        }

        @NonNull
        /* renamed from: H */
        public Builder mo58718H(@NonNull CornerTreatment cornerTreatment) {
            this.f50051b = cornerTreatment;
            float n = m69297n(cornerTreatment);
            if (n != -1.0f) {
                mo58719I(n);
            }
            return this;
        }

        @NonNull
        /* renamed from: I */
        public Builder mo58719I(@Dimension float f) {
            this.f50055f = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        /* renamed from: J */
        public Builder mo58720J(@NonNull CornerSize cornerSize) {
            this.f50055f = cornerSize;
            return this;
        }

        @NonNull
        /* renamed from: m */
        public ShapeAppearanceModel mo58721m() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        /* renamed from: o */
        public Builder mo58722o(@Dimension float f) {
            return mo58715E(f).mo58719I(f).mo58733z(f).mo58729v(f);
        }

        @NonNull
        /* renamed from: p */
        public Builder mo58723p(@NonNull CornerSize cornerSize) {
            return mo58716F(cornerSize).mo58720J(cornerSize).mo58711A(cornerSize).mo58730w(cornerSize);
        }

        @NonNull
        /* renamed from: q */
        public Builder mo58724q(int i, @Dimension float f) {
            return mo58725r(MaterialShapeUtils.m69250a(i)).mo58722o(f);
        }

        @NonNull
        /* renamed from: r */
        public Builder mo58725r(@NonNull CornerTreatment cornerTreatment) {
            return mo58714D(cornerTreatment).mo58718H(cornerTreatment).mo58732y(cornerTreatment).mo58728u(cornerTreatment);
        }

        @NonNull
        /* renamed from: s */
        public Builder mo58726s(@NonNull EdgeTreatment edgeTreatment) {
            this.f50060k = edgeTreatment;
            return this;
        }

        @NonNull
        /* renamed from: t */
        public Builder mo58727t(int i, @NonNull CornerSize cornerSize) {
            return mo58728u(MaterialShapeUtils.m69250a(i)).mo58730w(cornerSize);
        }

        @NonNull
        /* renamed from: u */
        public Builder mo58728u(@NonNull CornerTreatment cornerTreatment) {
            this.f50053d = cornerTreatment;
            float n = m69297n(cornerTreatment);
            if (n != -1.0f) {
                mo58729v(n);
            }
            return this;
        }

        @NonNull
        /* renamed from: v */
        public Builder mo58729v(@Dimension float f) {
            this.f50057h = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        /* renamed from: w */
        public Builder mo58730w(@NonNull CornerSize cornerSize) {
            this.f50057h = cornerSize;
            return this;
        }

        @NonNull
        /* renamed from: x */
        public Builder mo58731x(int i, @NonNull CornerSize cornerSize) {
            return mo58732y(MaterialShapeUtils.m69250a(i)).mo58711A(cornerSize);
        }

        @NonNull
        /* renamed from: y */
        public Builder mo58732y(@NonNull CornerTreatment cornerTreatment) {
            this.f50052c = cornerTreatment;
            float n = m69297n(cornerTreatment);
            if (n != -1.0f) {
                mo58733z(n);
            }
            return this;
        }

        @NonNull
        /* renamed from: z */
        public Builder mo58733z(@Dimension float f) {
            this.f50056g = new AbsoluteCornerSize(f);
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f50050a = shapeAppearanceModel.f50038a;
            this.f50051b = shapeAppearanceModel.f50039b;
            this.f50052c = shapeAppearanceModel.f50040c;
            this.f50053d = shapeAppearanceModel.f50041d;
            this.f50054e = shapeAppearanceModel.f50042e;
            this.f50055f = shapeAppearanceModel.f50043f;
            this.f50056g = shapeAppearanceModel.f50044g;
            this.f50057h = shapeAppearanceModel.f50045h;
            this.f50058i = shapeAppearanceModel.f50046i;
            this.f50059j = shapeAppearanceModel.f50047j;
            this.f50060k = shapeAppearanceModel.f50048k;
            this.f50061l = shapeAppearanceModel.f50049l;
        }
    }

    public ShapeAppearanceModel() {
        this.f50038a = MaterialShapeUtils.m69251b();
        this.f50039b = MaterialShapeUtils.m69251b();
        this.f50040c = MaterialShapeUtils.m69251b();
        this.f50041d = MaterialShapeUtils.m69251b();
        this.f50042e = new AbsoluteCornerSize(0.0f);
        this.f50043f = new AbsoluteCornerSize(0.0f);
        this.f50044g = new AbsoluteCornerSize(0.0f);
        this.f50045h = new AbsoluteCornerSize(0.0f);
        this.f50046i = MaterialShapeUtils.m69252c();
        this.f50047j = MaterialShapeUtils.m69252c();
        this.f50048k = MaterialShapeUtils.m69252c();
        this.f50049l = MaterialShapeUtils.m69252c();
    }
}
