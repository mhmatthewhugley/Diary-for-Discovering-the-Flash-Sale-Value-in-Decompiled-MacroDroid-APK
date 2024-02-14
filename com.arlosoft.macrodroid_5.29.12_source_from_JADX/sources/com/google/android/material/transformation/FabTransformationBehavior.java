package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f50752c = new Rect();

    /* renamed from: d */
    private final RectF f50753d = new RectF();

    /* renamed from: e */
    private final RectF f50754e = new RectF();

    /* renamed from: f */
    private final int[] f50755f = new int[2];

    /* renamed from: g */
    private float f50756g;

    /* renamed from: h */
    private float f50757h;

    protected static class FabTransformationSpec {
        @Nullable

        /* renamed from: a */
        public MotionSpec f50769a;

        /* renamed from: b */
        public Positioning f50770b;

        protected FabTransformationSpec() {
        }
    }

    public FabTransformationBehavior() {
    }

    @Nullable
    /* renamed from: B */
    private ViewGroup m70102B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    private ViewGroup m70103g(@NonNull View view) {
        View findViewById = view.findViewById(C10462R.C10465id.mtrl_child_content_container);
        if (findViewById != null) {
            return m70102B(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m70102B(((ViewGroup) view).getChildAt(0));
        }
        return m70102B(view);
    }

    /* renamed from: h */
    private void m70104h(@NonNull View view, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, @NonNull MotionTiming motionTiming2, float f, float f2, float f3, float f4, @NonNull RectF rectF) {
        float o = m70111o(fabTransformationSpec, motionTiming, f, f3);
        float o2 = m70111o(fabTransformationSpec, motionTiming2, f2, f4);
        Rect rect = this.f50752c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f50753d;
        rectF2.set(rect);
        RectF rectF3 = this.f50754e;
        m70112p(view, rectF3);
        rectF3.offset(o, o2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: i */
    private void m70105i(@NonNull View view, @NonNull RectF rectF) {
        m70112p(view, rectF);
        rectF.offset(this.f50756g, this.f50757h);
    }

    @NonNull
    /* renamed from: j */
    private Pair<MotionTiming, MotionTiming> m70106j(float f, float f2, boolean z, @NonNull FabTransformationSpec fabTransformationSpec) {
        MotionTiming motionTiming;
        MotionTiming motionTiming2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            motionTiming2 = fabTransformationSpec.f50769a.mo56590h("translationXLinear");
            motionTiming = fabTransformationSpec.f50769a.mo56590h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            motionTiming2 = fabTransformationSpec.f50769a.mo56590h("translationXCurveDownwards");
            motionTiming = fabTransformationSpec.f50769a.mo56590h("translationYCurveDownwards");
        } else {
            motionTiming2 = fabTransformationSpec.f50769a.mo56590h("translationXCurveUpwards");
            motionTiming = fabTransformationSpec.f50769a.mo56590h("translationYCurveUpwards");
        }
        return new Pair<>(motionTiming2, motionTiming);
    }

    /* renamed from: k */
    private float m70107k(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.f50753d;
        RectF rectF2 = this.f50754e;
        m70105i(view, rectF);
        m70112p(view2, rectF2);
        rectF2.offset(-m70109m(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: l */
    private float m70108l(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.f50753d;
        RectF rectF2 = this.f50754e;
        m70105i(view, rectF);
        m70112p(view2, rectF2);
        rectF2.offset(0.0f, -m70110n(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: m */
    private float m70109m(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f50753d;
        RectF rectF2 = this.f50754e;
        m70105i(view, rectF);
        m70112p(view2, rectF2);
        int i = positioning.f48541a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + positioning.f48542b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + positioning.f48542b;
    }

    /* renamed from: n */
    private float m70110n(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f50753d;
        RectF rectF2 = this.f50754e;
        m70105i(view, rectF);
        m70112p(view2, rectF2);
        int i = positioning.f48541a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + positioning.f48543c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + positioning.f48543c;
    }

    /* renamed from: o */
    private float m70111o(@NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, float f, float f2) {
        long c = motionTiming.mo56599c();
        long d = motionTiming.mo56600d();
        MotionTiming h = fabTransformationSpec.f50769a.mo56590h("expansion");
        return AnimationUtils.m67220a(f, f2, motionTiming.mo56601e().getInterpolation(((float) (((h.mo56599c() + h.mo56600d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: p */
    private void m70112p(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f50755f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: q */
    private void m70113q(View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup g;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof CircularRevealWidget) || CircularRevealHelper.f49071j != 0) && (g = m70103g(view2)) != null) {
                if (z) {
                    if (!z2) {
                        ChildrenAlphaProperty.f48527a.set(g, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(g, ChildrenAlphaProperty.f48527a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(g, ChildrenAlphaProperty.f48527a, new float[]{0.0f});
                }
                fabTransformationSpec.f50769a.mo56590h("contentFade").mo56598a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: r */
    private void m70114r(@NonNull View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            int z3 = m70122z(view);
            int i = 16777215 & z3;
            if (z) {
                if (!z2) {
                    circularRevealWidget.setCircularRevealScrimColor(z3);
                }
                objectAnimator = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.f49086a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.f49086a, new int[]{z3});
            }
            objectAnimator.setEvaluator(ArgbEvaluatorCompat.m67224b());
            fabTransformationSpec.f50769a.mo56590h(TypedValues.Custom.S_COLOR).mo56598a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: s */
    private void m70115s(@NonNull View view, @NonNull View view2, boolean z, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list) {
        float m = m70109m(view, view2, fabTransformationSpec.f50770b);
        float n = m70110n(view, view2, fabTransformationSpec.f50770b);
        Pair<MotionTiming, MotionTiming> j = m70106j(m, n, z, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) j.first;
        MotionTiming motionTiming2 = (MotionTiming) j.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m = this.f50756g;
        }
        fArr[0] = m;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            n = this.f50757h;
        }
        fArr2[0] = n;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        motionTiming.mo56598a(ofFloat);
        motionTiming2.mo56598a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: t */
    private void m70116t(View view, @NonNull View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-elevation});
        }
        fabTransformationSpec.f50769a.mo56590h("elevation").mo56598a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: u */
    private void m70117u(@NonNull View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, float f, float f2, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        FabTransformationSpec fabTransformationSpec2 = fabTransformationSpec;
        if (view4 instanceof CircularRevealWidget) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view4;
            float k = m70107k(view3, view4, fabTransformationSpec2.f50770b);
            float l = m70108l(view3, view4, fabTransformationSpec2.f50770b);
            ((FloatingActionButton) view3).mo57879i(this.f50752c);
            float width = ((float) this.f50752c.width()) / 2.0f;
            MotionTiming h = fabTransformationSpec2.f50769a.mo56590h("expansion");
            if (z) {
                if (!z2) {
                    circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(k, l, width));
                }
                if (z2) {
                    width = circularRevealWidget.getRevealInfo().f49089c;
                }
                animator = CircularRevealCompat.m68039a(circularRevealWidget, k, l, MathUtils.m68853b(k, l, 0.0f, 0.0f, f, f2));
                animator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                        revealInfo.f49089c = Float.MAX_VALUE;
                        circularRevealWidget.setRevealInfo(revealInfo);
                    }
                });
                m70120x(view2, h.mo56599c(), (int) k, (int) l, width, list);
            } else {
                float f3 = circularRevealWidget.getRevealInfo().f49089c;
                Animator a = CircularRevealCompat.m68039a(circularRevealWidget, k, l, width);
                int i = (int) k;
                int i2 = (int) l;
                View view5 = view2;
                m70120x(view5, h.mo56599c(), i, i2, f3, list);
                long c = h.mo56599c();
                long d = h.mo56600d();
                long i3 = fabTransformationSpec2.f50769a.mo56592i();
                m70119w(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo56598a(animator);
            list.add(animator);
            list2.add(CircularRevealCompat.m68040b(circularRevealWidget));
        }
    }

    /* renamed from: v */
    private void m70118v(View view, final View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f48528b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f48528b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                fabTransformationSpec.f50769a.mo56590h("iconFade").mo56598a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        circularRevealWidget.setCircularRevealOverlayDrawable((Drawable) null);
                    }

                    public void onAnimationStart(Animator animator) {
                        circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                    }
                });
            }
        }
    }

    /* renamed from: w */
    private void m70119w(View view, long j, long j2, long j3, int i, int i2, float f, @NonNull List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: x */
    private void m70120x(View view, long j, int i, int i2, float f, @NonNull List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: y */
    private void m70121y(@NonNull View view, @NonNull View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        FabTransformationSpec fabTransformationSpec2 = fabTransformationSpec;
        List<Animator> list3 = list;
        float m = m70109m(view3, view4, fabTransformationSpec2.f50770b);
        float n = m70110n(view3, view4, fabTransformationSpec2.f50770b);
        Pair<MotionTiming, MotionTiming> j = m70106j(m, n, z3, fabTransformationSpec2);
        MotionTiming motionTiming = (MotionTiming) j.first;
        MotionTiming motionTiming2 = (MotionTiming) j.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-m);
                view4.setTranslationY(-n);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m70104h(view2, fabTransformationSpec, motionTiming, motionTiming2, -m, -n, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-m});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-n});
        }
        motionTiming.mo56598a(objectAnimator2);
        motionTiming2.mo56598a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: z */
    private int m70122z(@NonNull View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract FabTransformationSpec mo59440A(Context context, boolean z);

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public AnimatorSet mo59438f(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        final boolean z3 = z;
        FabTransformationSpec A = mo59440A(view2.getContext(), z3);
        if (z3) {
            this.f50756g = view.getTranslationX();
            this.f50757h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m70116t(view, view2, z, z2, A, arrayList, arrayList2);
        RectF rectF = this.f50753d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m70121y(view3, view4, z4, z2, A, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m70115s(view3, view4, z4, A, arrayList);
        boolean z5 = z2;
        FabTransformationSpec fabTransformationSpec = A;
        m70118v(view3, view4, z4, z5, fabTransformationSpec, arrayList3, arrayList4);
        m70117u(view3, view4, z4, z5, fabTransformationSpec, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m70114r(view3, view4, z4, z5, fabTransformationSpec, arrayList5, arrayList6);
        m70113q(view3, view4, z4, z5, fabTransformationSpec, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        final View view5 = view;
        final View view6 = view2;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                if (!z3) {
                    view6.setVisibility(4);
                    view5.setAlpha(1.0f);
                    view5.setVisibility(0);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (z3) {
                    view6.setVisibility(0);
                    view5.setAlpha(0.0f);
                    view5.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
