package net.cachapa.expandablelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import p328mc.C15728a;

public class ExpandableLayout extends FrameLayout {

    /* renamed from: a */
    private int f65162a = 300;

    /* renamed from: c */
    private float f65163c;

    /* renamed from: d */
    private float f65164d;

    /* renamed from: f */
    private int f65165f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f65166g;

    /* renamed from: o */
    private Interpolator f65167o = new C15728a();

    /* renamed from: p */
    private ValueAnimator f65168p;

    /* renamed from: s */
    private C15793c f65169s;

    /* renamed from: net.cachapa.expandablelayout.ExpandableLayout$a */
    class C15791a implements ValueAnimator.AnimatorUpdateListener {
        C15791a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpandableLayout.this.setExpansion(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: net.cachapa.expandablelayout.ExpandableLayout$b */
    private class C15792b implements Animator.AnimatorListener {

        /* renamed from: a */
        private int f65171a;

        /* renamed from: b */
        private boolean f65172b;

        public C15792b(int i) {
            this.f65171a = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f65172b = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f65172b) {
                int unused = ExpandableLayout.this.f65166g = this.f65171a == 0 ? 0 : 3;
                ExpandableLayout.this.setExpansion((float) this.f65171a);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            int unused = ExpandableLayout.this.f65166g = this.f65171a == 0 ? 1 : 2;
        }
    }

    /* renamed from: net.cachapa.expandablelayout.ExpandableLayout$c */
    public interface C15793c {
        /* renamed from: a */
        void mo27179a(float f, int i);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableLayout);
            this.f65162a = obtainStyledAttributes.getInt(R$styleable.ExpandableLayout_el_duration, 300);
            int i = 0;
            this.f65164d = obtainStyledAttributes.getBoolean(R$styleable.ExpandableLayout_el_expanded, false) ? 1.0f : 0.0f;
            this.f65165f = obtainStyledAttributes.getInt(R$styleable.ExpandableLayout_android_orientation, 1);
            this.f65163c = obtainStyledAttributes.getFloat(R$styleable.ExpandableLayout_el_parallax, 1.0f);
            obtainStyledAttributes.recycle();
            this.f65166g = this.f65164d != 0.0f ? 3 : i;
            setParallax(this.f65163c);
        }
    }

    /* renamed from: b */
    private void m95326b(int i) {
        ValueAnimator valueAnimator = this.f65168p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f65168p = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f65164d, (float) i});
        this.f65168p = ofFloat;
        ofFloat.setInterpolator(this.f65167o);
        this.f65168p.setDuration((long) this.f65162a);
        this.f65168p.addUpdateListener(new C15791a());
        this.f65168p.addListener(new C15792b(i));
        this.f65168p.start();
    }

    /* renamed from: c */
    public void mo75513c() {
        mo75514d(true);
    }

    /* renamed from: d */
    public void mo75514d(boolean z) {
        mo75523h(false, z);
    }

    /* renamed from: e */
    public void mo75515e() {
        mo75516f(true);
    }

    /* renamed from: f */
    public void mo75516f(boolean z) {
        mo75523h(true, z);
    }

    /* renamed from: g */
    public boolean mo75517g() {
        int i = this.f65166g;
        return i == 2 || i == 3;
    }

    public int getDuration() {
        return this.f65162a;
    }

    public float getExpansion() {
        return this.f65164d;
    }

    public int getOrientation() {
        return this.f65165f;
    }

    public float getParallax() {
        return this.f65163c;
    }

    public int getState() {
        return this.f65166g;
    }

    /* renamed from: h */
    public void mo75523h(boolean z, boolean z2) {
        if (z != mo75517g()) {
            if (z2) {
                m95326b(z);
            } else {
                setExpansion(z ? 1.0f : 0.0f);
            }
        }
    }

    /* renamed from: i */
    public void mo75524i() {
        mo75525j(true);
    }

    /* renamed from: j */
    public void mo75525j(boolean z) {
        if (mo75517g()) {
            mo75514d(z);
        } else {
            mo75516f(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f65168p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f65165f == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.f65164d == 0.0f && i3 == 0) ? 8 : 0);
        int round = i3 - Math.round(((float) i3) * this.f65164d);
        float f = this.f65163c;
        if (f > 0.0f) {
            float f2 = ((float) round) * f;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (this.f65165f == 0) {
                    int i5 = -1;
                    if (getLayoutDirection() == 1) {
                        i5 = 1;
                    }
                    childAt.setTranslationX(((float) i5) * f2);
                } else {
                    childAt.setTranslationY(-f2);
                }
            }
        }
        if (this.f65165f == 0) {
            setMeasuredDimension(measuredWidth - round, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - round);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f = bundle.getFloat("expansion");
        this.f65164d = f;
        this.f65166g = f == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f = mo75517g() ? 1.0f : 0.0f;
        this.f65164d = f;
        bundle.putFloat("expansion", f);
        bundle.putParcelable("super_state", onSaveInstanceState);
        return bundle;
    }

    public void setDuration(int i) {
        this.f65162a = i;
    }

    public void setExpanded(boolean z) {
        mo75523h(z, true);
    }

    public void setExpansion(float f) {
        float f2 = this.f65164d;
        if (f2 != f) {
            float f3 = f - f2;
            int i = 0;
            if (f == 0.0f) {
                this.f65166g = 0;
            } else if (f == 1.0f) {
                this.f65166g = 3;
            } else if (f3 < 0.0f) {
                this.f65166g = 1;
            } else if (f3 > 0.0f) {
                this.f65166g = 2;
            }
            if (this.f65166g == 0) {
                i = 8;
            }
            setVisibility(i);
            this.f65164d = f;
            requestLayout();
            C15793c cVar = this.f65169s;
            if (cVar != null) {
                cVar.mo27179a(f, this.f65166g);
            }
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f65167o = interpolator;
    }

    public void setOnExpansionUpdateListener(C15793c cVar) {
        this.f65169s = cVar;
    }

    public void setOrientation(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)");
        }
        this.f65165f = i;
    }

    public void setParallax(float f) {
        this.f65163c = Math.min(1.0f, Math.max(0.0f, f));
    }
}
