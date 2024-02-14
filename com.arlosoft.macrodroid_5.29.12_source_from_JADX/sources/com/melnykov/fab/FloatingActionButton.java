package com.melnykov.fab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import p238d7.C11963a;
import p314l7.C15587a;
import p314l7.C15589b;

public class FloatingActionButton extends ImageButton {

    /* renamed from: A */
    private boolean f57522A;

    /* renamed from: B */
    private final Interpolator f57523B = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    private boolean f57524a;

    /* renamed from: c */
    private int f57525c;

    /* renamed from: d */
    private int f57526d;

    /* renamed from: f */
    private int f57527f;

    /* renamed from: g */
    private int f57528g;

    /* renamed from: o */
    private boolean f57529o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f57530p;

    /* renamed from: s */
    private int f57531s;

    /* renamed from: z */
    private int f57532z;

    /* renamed from: com.melnykov.fab.FloatingActionButton$a */
    class C11702a extends ViewOutlineProvider {
        C11702a() {
        }

        public void getOutline(View view, Outline outline) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            int b = floatingActionButton.m81853i(floatingActionButton.f57530p == 0 ? R$dimen.fab_size_normal : R$dimen.fab_size_mini);
            outline.setOval(0, 0, b, b);
        }
    }

    /* renamed from: com.melnykov.fab.FloatingActionButton$b */
    class C11703b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ boolean f57534a;

        /* renamed from: c */
        final /* synthetic */ boolean f57535c;

        C11703b(boolean z, boolean z2) {
            this.f57534a = z;
            this.f57535c = z2;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = FloatingActionButton.this.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            FloatingActionButton.this.m81862v(this.f57534a, this.f57535c, true);
            return true;
        }
    }

    /* renamed from: com.melnykov.fab.FloatingActionButton$c */
    private class C11704c extends C11706a {

        /* renamed from: b */
        private C11963a f57537b;

        /* renamed from: c */
        private RecyclerView.OnScrollListener f57538c;

        private C11704c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m81871f(C11963a aVar) {
            this.f57537b = aVar;
        }

        /* renamed from: a */
        public void mo65792a() {
            FloatingActionButton.this.mo65788t();
            C11963a aVar = this.f57537b;
            if (aVar != null) {
                aVar.mo67372a();
            }
        }

        /* renamed from: b */
        public void mo65793b() {
            FloatingActionButton.this.mo65777n();
            C11963a aVar = this.f57537b;
            if (aVar != null) {
                aVar.mo67373b();
            }
        }

        /* renamed from: e */
        public void mo65794e(RecyclerView.OnScrollListener onScrollListener) {
            this.f57538c = onScrollListener;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerView.OnScrollListener onScrollListener = this.f57538c;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(recyclerView, i);
            }
            super.onScrollStateChanged(recyclerView, i);
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView.OnScrollListener onScrollListener = this.f57538c;
            if (onScrollListener != null) {
                onScrollListener.onScrolled(recyclerView, i, i2);
            }
            super.onScrolled(recyclerView, i, i2);
        }

        /* synthetic */ C11704c(FloatingActionButton floatingActionButton, C11702a aVar) {
            this();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81858p(context, attributeSet);
    }

    /* renamed from: f */
    private Drawable m81850f(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        if (!this.f57529o || m81857m()) {
            return shapeDrawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{getResources().getDrawable(this.f57530p == 0 ? R$drawable.fab_shadow : R$drawable.fab_shadow_mini), shapeDrawable});
        int i2 = this.f57531s;
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    /* renamed from: g */
    private static int m81851g(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.9f;
        return Color.HSVToColor(fArr);
    }

    private int getMarginBottom() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    /* renamed from: h */
    private int m81852h(int i) {
        return getResources().getColor(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m81853i(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    /* renamed from: j */
    private TypedArray m81854j(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: k */
    private boolean m81855k() {
        return true;
    }

    /* renamed from: l */
    private boolean m81856l() {
        return true;
    }

    /* renamed from: m */
    private boolean m81857m() {
        return true;
    }

    /* renamed from: p */
    private void m81858p(Context context, AttributeSet attributeSet) {
        this.f57524a = true;
        int h = m81852h(R$color.material_blue_500);
        this.f57525c = h;
        this.f57526d = m81851g(h);
        this.f57527f = m81860r(this.f57525c);
        this.f57528g = m81852h(17170432);
        this.f57530p = 0;
        this.f57529o = true;
        this.f57532z = getResources().getDimensionPixelOffset(R$dimen.fab_scroll_threshold);
        this.f57531s = m81853i(R$dimen.fab_shadow_size);
        if (attributeSet != null) {
            m81859q(context, attributeSet);
        }
        m81863w();
    }

    /* renamed from: q */
    private void m81859q(Context context, AttributeSet attributeSet) {
        TypedArray j = m81854j(context, attributeSet, R$styleable.FloatingActionButton);
        if (j != null) {
            try {
                int color = j.getColor(R$styleable.FloatingActionButton_fab_colorNormal, m81852h(R$color.material_blue_500));
                this.f57525c = color;
                this.f57526d = j.getColor(R$styleable.FloatingActionButton_fab_colorPressed, m81851g(color));
                this.f57527f = j.getColor(R$styleable.FloatingActionButton_fab_colorRipple, m81860r(this.f57525c));
                this.f57528g = j.getColor(R$styleable.FloatingActionButton_fab_colorDisabled, this.f57528g);
                this.f57529o = j.getBoolean(R$styleable.FloatingActionButton_fab_shadow, true);
                this.f57530p = j.getInt(R$styleable.FloatingActionButton_fab_type, 0);
            } finally {
                j.recycle();
            }
        }
    }

    /* renamed from: r */
    private static int m81860r(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 1.1f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: s */
    private void m81861s() {
        if (!this.f57522A && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            int i2 = this.f57531s;
            marginLayoutParams.setMargins(i - i2, marginLayoutParams.topMargin - i2, marginLayoutParams.rightMargin - i2, marginLayoutParams.bottomMargin - i2);
            requestLayout();
            this.f57522A = true;
        }
    }

    private void setBackgroundCompat(Drawable drawable) {
        if (m81857m()) {
            float f = 0.0f;
            if (this.f57529o) {
                f = getElevation() > 0.0f ? getElevation() : (float) m81853i(R$dimen.fab_elevation_lollipop);
            }
            setElevation(f);
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f57527f}), drawable, (Drawable) null);
            setOutlineProvider(new C11702a());
            setClipToOutline(true);
            setBackground(rippleDrawable);
        } else if (m81856l()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m81862v(boolean z, boolean z2, boolean z3) {
        int i;
        if (this.f57524a != z || z3) {
            this.f57524a = z;
            int height = getHeight();
            if (height == 0 && !z3) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new C11703b(z, z2));
                    return;
                }
            }
            if (z) {
                i = 0;
            } else {
                i = getMarginBottom() + height;
            }
            if (z2) {
                C15589b.m94771a(this).mo74937c(this.f57523B).mo74936b(200).mo74938d((float) i);
            } else {
                C15587a.m94769a(this, (float) i);
            }
            if (!m81855k()) {
                setClickable(z);
            }
        }
    }

    /* renamed from: w */
    private void m81863w() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m81850f(this.f57526d));
        stateListDrawable.addState(new int[]{-16842910}, m81850f(this.f57528g));
        stateListDrawable.addState(new int[0], m81850f(this.f57525c));
        setBackgroundCompat(stateListDrawable);
    }

    /* renamed from: d */
    public void mo65771d(@NonNull RecyclerView recyclerView) {
        mo65772e(recyclerView, (C11963a) null, (RecyclerView.OnScrollListener) null);
    }

    /* renamed from: e */
    public void mo65772e(@NonNull RecyclerView recyclerView, C11963a aVar, RecyclerView.OnScrollListener onScrollListener) {
        C11704c cVar = new C11704c(this, (C11702a) null);
        cVar.m81871f(aVar);
        cVar.mo65794e(onScrollListener);
        cVar.mo65798c(this.f57532z);
        recyclerView.setOnScrollListener(cVar);
    }

    public int getColorNormal() {
        return this.f57525c;
    }

    public int getColorPressed() {
        return this.f57526d;
    }

    public int getColorRipple() {
        return this.f57527f;
    }

    public int getType() {
        return this.f57530p;
    }

    /* renamed from: n */
    public void mo65777n() {
        mo65778o(true);
    }

    /* renamed from: o */
    public void mo65778o(boolean z) {
        m81862v(false, z, false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = m81853i(this.f57530p == 0 ? R$dimen.fab_size_normal : R$dimen.fab_size_mini);
        if (this.f57529o && !m81857m()) {
            i3 += this.f57531s * 2;
            m81861s();
        }
        setMeasuredDimension(i3, i3);
    }

    public void setColorNormal(int i) {
        if (i != this.f57525c) {
            this.f57525c = i;
            m81863w();
        }
    }

    public void setColorNormalResId(int i) {
        setColorNormal(m81852h(i));
    }

    public void setColorPressed(int i) {
        if (i != this.f57526d) {
            this.f57526d = i;
            m81863w();
        }
    }

    public void setColorPressedResId(int i) {
        setColorPressed(m81852h(i));
    }

    public void setColorRipple(int i) {
        if (i != this.f57527f) {
            this.f57527f = i;
            m81863w();
        }
    }

    public void setColorRippleResId(int i) {
        setColorRipple(m81852h(i));
    }

    public void setShadow(boolean z) {
        if (z != this.f57529o) {
            this.f57529o = z;
            m81863w();
        }
    }

    public void setType(int i) {
        if (i != this.f57530p) {
            this.f57530p = i;
            m81863w();
        }
    }

    /* renamed from: t */
    public void mo65788t() {
        mo65789u(true);
    }

    /* renamed from: u */
    public void mo65789u(boolean z) {
        m81862v(true, z, false);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81858p(context, attributeSet);
    }
}
