package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

class FloatingActionButtonImpl {

    /* renamed from: D */
    static final TimeInterpolator f49404D = AnimationUtils.f48523c;

    /* renamed from: E */
    static final int[] f49405E = {16842919, 16842910};

    /* renamed from: F */
    static final int[] f49406F = {16843623, 16842908, 16842910};

    /* renamed from: G */
    static final int[] f49407G = {16842908, 16842910};

    /* renamed from: H */
    static final int[] f49408H = {16843623, 16842910};

    /* renamed from: I */
    static final int[] f49409I = {16842910};

    /* renamed from: J */
    static final int[] f49410J = new int[0];

    /* renamed from: A */
    private final RectF f49411A = new RectF();

    /* renamed from: B */
    private final Matrix f49412B = new Matrix();
    @Nullable

    /* renamed from: C */
    private ViewTreeObserver.OnPreDrawListener f49413C;
    @Nullable

    /* renamed from: a */
    ShapeAppearanceModel f49414a;
    @Nullable

    /* renamed from: b */
    MaterialShapeDrawable f49415b;
    @Nullable

    /* renamed from: c */
    Drawable f49416c;
    @Nullable

    /* renamed from: d */
    BorderDrawable f49417d;
    @Nullable

    /* renamed from: e */
    Drawable f49418e;

    /* renamed from: f */
    boolean f49419f;

    /* renamed from: g */
    boolean f49420g = true;

    /* renamed from: h */
    float f49421h;

    /* renamed from: i */
    float f49422i;

    /* renamed from: j */
    float f49423j;

    /* renamed from: k */
    int f49424k;
    @NonNull

    /* renamed from: l */
    private final StateListAnimator f49425l;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: m */
    public Animator f49426m;
    @Nullable

    /* renamed from: n */
    private MotionSpec f49427n;
    @Nullable

    /* renamed from: o */
    private MotionSpec f49428o;

    /* renamed from: p */
    private float f49429p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f49430q = 1.0f;

    /* renamed from: r */
    private int f49431r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f49432s = 0;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f49433t;

    /* renamed from: u */
    private ArrayList<Animator.AnimatorListener> f49434u;

    /* renamed from: v */
    private ArrayList<InternalTransformationCallback> f49435v;

    /* renamed from: w */
    final FloatingActionButton f49436w;

    /* renamed from: x */
    final ShadowViewDelegate f49437x;

    /* renamed from: y */
    private final Rect f49438y = new Rect();

    /* renamed from: z */
    private final RectF f49439z = new RectF();

    private class DisabledElevationAnimation extends ShadowAnimatorImpl {
        DisabledElevationAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo57999a() {
            return 0.0f;
        }
    }

    private class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToHoveredFocusedTranslationZAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo57999a() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.f49421h + floatingActionButtonImpl.f49422i;
        }
    }

    private class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToPressedTranslationZAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo57999a() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.f49421h + floatingActionButtonImpl.f49423j;
        }
    }

    interface InternalTransformationCallback {
        /* renamed from: a */
        void mo57937a();

        /* renamed from: b */
        void mo57938b();
    }

    interface InternalVisibilityChangedListener {
        /* renamed from: a */
        void mo57929a();

        /* renamed from: b */
        void mo57930b();
    }

    private class ResetElevationAnimation extends ShadowAnimatorImpl {
        ResetElevationAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo57999a() {
            return FloatingActionButtonImpl.this.f49421h;
        }
    }

    private abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f49464a;

        /* renamed from: b */
        private float f49465b;

        /* renamed from: c */
        private float f49466c;

        private ShadowAnimatorImpl() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo57999a();

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.mo57975g0((float) ((int) this.f49466c));
            this.f49464a = false;
        }

        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f49464a) {
                MaterialShapeDrawable materialShapeDrawable = FloatingActionButtonImpl.this.f49415b;
                this.f49465b = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.mo58683w();
                this.f49466c = mo57999a();
                this.f49464a = true;
            }
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            float f = this.f49465b;
            floatingActionButtonImpl.mo57975g0((float) ((int) (f + ((this.f49466c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f49436w = floatingActionButton;
        this.f49437x = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f49425l = stateListAnimator;
        stateListAnimator.mo58205a(f49405E, m68527k(new ElevateToPressedTranslationZAnimation()));
        stateListAnimator.mo58205a(f49406F, m68527k(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.mo58205a(f49407G, m68527k(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.mo58205a(f49408H, m68527k(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.mo58205a(f49409I, m68527k(new ResetElevationAnimation()));
        stateListAnimator.mo58205a(f49410J, m68527k(new DisabledElevationAnimation()));
        this.f49429p = floatingActionButton.getRotation();
    }

    /* renamed from: a0 */
    private boolean m68519a0() {
        return ViewCompat.isLaidOut(this.f49436w) && !this.f49436w.isInEditMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m68523h(float f, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f49436w.getDrawable();
        if (drawable != null && this.f49431r != 0) {
            RectF rectF = this.f49439z;
            RectF rectF2 = this.f49411A;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f49431r;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f49431r;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h0 */
    private void m68524h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new TypeEvaluator<Float>() {

                /* renamed from: a */
                FloatEvaluator f49457a = new FloatEvaluator();

                /* renamed from: a */
                public Float evaluate(float f, Float f2, Float f3) {
                    float floatValue = this.f49457a.evaluate(f, f2, f3).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
    }

    @NonNull
    /* renamed from: i */
    private AnimatorSet m68525i(@NonNull MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f49436w, View.ALPHA, new float[]{f});
        motionSpec.mo56590h("opacity").mo56598a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f49436w, View.SCALE_X, new float[]{f2});
        motionSpec.mo56590h("scale").mo56598a(ofFloat2);
        m68524h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f49436w, View.SCALE_Y, new float[]{f2});
        motionSpec.mo56590h("scale").mo56598a(ofFloat3);
        m68524h0(ofFloat3);
        arrayList.add(ofFloat3);
        m68523h(f3, this.f49412B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f49436w, new ImageMatrixProperty(), new MatrixEvaluator() {
            /* renamed from: a */
            public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                float unused = FloatingActionButtonImpl.this.f49430q = f;
                return super.evaluate(f, matrix, matrix2);
            }
        }, new Matrix[]{new Matrix(this.f49412B)});
        motionSpec.mo56590h("iconScale").mo56598a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    private AnimatorSet m68526j(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final float alpha = this.f49436w.getAlpha();
        final float scaleX = this.f49436w.getScaleX();
        final float scaleY = this.f49436w.getScaleY();
        final float f4 = this.f49430q;
        final Matrix matrix = new Matrix(this.f49412B);
        final float f5 = f;
        final float f6 = f2;
        final float f7 = f3;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButtonImpl.this.f49436w.setAlpha(AnimationUtils.m67221b(alpha, f5, 0.0f, 0.2f, floatValue));
                FloatingActionButtonImpl.this.f49436w.setScaleX(AnimationUtils.m67220a(scaleX, f6, floatValue));
                FloatingActionButtonImpl.this.f49436w.setScaleY(AnimationUtils.m67220a(scaleY, f6, floatValue));
                float unused = FloatingActionButtonImpl.this.f49430q = AnimationUtils.m67220a(f4, f7, floatValue);
                FloatingActionButtonImpl.this.m68523h(AnimationUtils.m67220a(f4, f7, floatValue), matrix);
                FloatingActionButtonImpl.this.f49436w.setImageMatrix(matrix);
            }
        });
        arrayList.add(ofFloat);
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        animatorSet.setDuration((long) MotionUtils.m68860d(this.f49436w.getContext(), C10462R.attr.motionDurationLong1, this.f49436w.getContext().getResources().getInteger(C10462R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.m68861e(this.f49436w.getContext(), C10462R.attr.motionEasingStandard, AnimationUtils.f48522b));
        return animatorSet;
    }

    @NonNull
    /* renamed from: k */
    private ValueAnimator m68527k(@NonNull ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f49404D);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    @NonNull
    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m68528r() {
        if (this.f49413C == null) {
            this.f49413C = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    FloatingActionButtonImpl.this.mo57948H();
                    return true;
                }
            };
        }
        return this.f49413C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo57941A() {
        this.f49425l.mo58206c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo57942B() {
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.m69255f(this.f49436w, materialShapeDrawable);
        }
        if (mo57951K()) {
            this.f49436w.getViewTreeObserver().addOnPreDrawListener(m68528r());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo57943C() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo57944D() {
        ViewTreeObserver viewTreeObserver = this.f49436w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f49413C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f49413C = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo57945E(int[] iArr) {
        this.f49425l.mo58207d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo57946F(float f, float f2, float f3) {
        mo57973f0();
        mo57975g0(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo57947G(@NonNull Rect rect) {
        Preconditions.checkNotNull(this.f49418e, "Didn't initialize content background");
        if (mo57966Z()) {
            this.f49437x.setBackgroundDrawable(new InsetDrawable(this.f49418e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f49437x.setBackgroundDrawable(this.f49418e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo57948H() {
        float rotation = this.f49436w.getRotation();
        if (this.f49429p != rotation) {
            this.f49429p = rotation;
            mo57969d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo57949I() {
        ArrayList<InternalTransformationCallback> arrayList = this.f49435v;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo57938b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo57950J() {
        ArrayList<InternalTransformationCallback> arrayList = this.f49435v;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo57937a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo57951K() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo57952L(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.f49417d;
        if (borderDrawable != null) {
            borderDrawable.mo57786c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo57953M(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo57954N(float f) {
        if (this.f49421h != f) {
            this.f49421h = f;
            mo57946F(f, this.f49422i, this.f49423j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo57955O(boolean z) {
        this.f49419f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo57956P(@Nullable MotionSpec motionSpec) {
        this.f49428o = motionSpec;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo57957Q(float f) {
        if (this.f49422i != f) {
            this.f49422i = f;
            mo57946F(this.f49421h, f, this.f49423j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo57958R(float f) {
        this.f49430q = f;
        Matrix matrix = this.f49412B;
        m68523h(f, matrix);
        this.f49436w.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo57959S(int i) {
        if (this.f49431r != i) {
            this.f49431r = i;
            mo57971e0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo57960T(int i) {
        this.f49424k = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo57961U(float f) {
        if (this.f49423j != f) {
            this.f49423j = f;
            mo57946F(this.f49421h, this.f49422i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo57962V(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f49416c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.m69155d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo57963W(boolean z) {
        this.f49420g = z;
        mo57973f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo57964X(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f49414a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Drawable drawable = this.f49416c;
        if (drawable instanceof Shapeable) {
            ((Shapeable) drawable).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.f49417d;
        if (borderDrawable != null) {
            borderDrawable.mo57790f(shapeAppearanceModel);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void mo57965Y(@Nullable MotionSpec motionSpec) {
        this.f49427n = motionSpec;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo57966Z() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo57967b0() {
        return !this.f49419f || this.f49436w.getSizeDimension() >= this.f49424k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo57968c0(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        AnimatorSet animatorSet;
        if (!mo57989z()) {
            Animator animator = this.f49426m;
            if (animator != null) {
                animator.cancel();
            }
            boolean z2 = this.f49427n == null;
            if (m68519a0()) {
                if (this.f49436w.getVisibility() != 0) {
                    float f = 0.0f;
                    this.f49436w.setAlpha(0.0f);
                    this.f49436w.setScaleY(z2 ? 0.4f : 0.0f);
                    this.f49436w.setScaleX(z2 ? 0.4f : 0.0f);
                    if (z2) {
                        f = 0.4f;
                    }
                    mo57958R(f);
                }
                MotionSpec motionSpec = this.f49427n;
                if (motionSpec != null) {
                    animatorSet = m68525i(motionSpec, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = m68526j(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        int unused = FloatingActionButtonImpl.this.f49432s = 0;
                        Animator unused2 = FloatingActionButtonImpl.this.f49426m = null;
                        InternalVisibilityChangedListener internalVisibilityChangedListener = internalVisibilityChangedListener;
                        if (internalVisibilityChangedListener != null) {
                            internalVisibilityChangedListener.mo57929a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        FloatingActionButtonImpl.this.f49436w.mo58242a(0, z);
                        int unused = FloatingActionButtonImpl.this.f49432s = 2;
                        Animator unused2 = FloatingActionButtonImpl.this.f49426m = animator;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f49433t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            this.f49436w.mo58242a(0, z);
            this.f49436w.setAlpha(1.0f);
            this.f49436w.setScaleY(1.0f);
            this.f49436w.setScaleX(1.0f);
            mo57958R(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.mo57929a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo57969d0() {
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo58667h0((int) this.f49429p);
        }
    }

    /* renamed from: e */
    public void mo57970e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f49434u == null) {
            this.f49434u = new ArrayList<>();
        }
        this.f49434u.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo57971e0() {
        mo57958R(this.f49430q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo57972f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f49433t == null) {
            this.f49433t = new ArrayList<>();
        }
        this.f49433t.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void mo57973f0() {
        Rect rect = this.f49438y;
        mo57982s(rect);
        mo57947G(rect);
        this.f49437x.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo57974g(@NonNull InternalTransformationCallback internalTransformationCallback) {
        if (this.f49435v == null) {
            this.f49435v = new ArrayList<>();
        }
        this.f49435v.add(internalTransformationCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo57975g0(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f49415b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo58655Z(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public MaterialShapeDrawable mo57976l() {
        return new MaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.f49414a));
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public final Drawable mo57977m() {
        return this.f49418e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo57978n() {
        return this.f49421h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo57979o() {
        return this.f49419f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: p */
    public final MotionSpec mo57980p() {
        return this.f49428o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo57981q() {
        return this.f49422i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo57982s(@NonNull Rect rect) {
        int sizeDimension = this.f49419f ? (this.f49424k - this.f49436w.getSizeDimension()) / 2 : 0;
        float n = this.f49420g ? mo57978n() + this.f49423j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo57983t() {
        return this.f49423j;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: u */
    public final ShapeAppearanceModel mo57984u() {
        return this.f49414a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: v */
    public final MotionSpec mo57985v() {
        return this.f49427n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo57986w(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        AnimatorSet animatorSet;
        if (!mo57988y()) {
            Animator animator = this.f49426m;
            if (animator != null) {
                animator.cancel();
            }
            if (m68519a0()) {
                MotionSpec motionSpec = this.f49428o;
                if (motionSpec != null) {
                    animatorSet = m68525i(motionSpec, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = m68526j(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a */
                    private boolean f49440a;

                    public void onAnimationCancel(Animator animator) {
                        this.f49440a = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        int unused = FloatingActionButtonImpl.this.f49432s = 0;
                        Animator unused2 = FloatingActionButtonImpl.this.f49426m = null;
                        if (!this.f49440a) {
                            FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.f49436w;
                            boolean z = z;
                            floatingActionButton.mo58242a(z ? 8 : 4, z);
                            InternalVisibilityChangedListener internalVisibilityChangedListener = internalVisibilityChangedListener;
                            if (internalVisibilityChangedListener != null) {
                                internalVisibilityChangedListener.mo57930b();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        FloatingActionButtonImpl.this.f49436w.mo58242a(0, z);
                        int unused = FloatingActionButtonImpl.this.f49432s = 1;
                        Animator unused2 = FloatingActionButtonImpl.this.f49426m = animator;
                        this.f49440a = false;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f49434u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            this.f49436w.mo58242a(z ? 8 : 4, z);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.mo57930b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo57987x(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        MaterialShapeDrawable l = mo57976l();
        this.f49415b = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f49415b.setTintMode(mode);
        }
        this.f49415b.mo58662g0(-12303292);
        this.f49415b.mo58649P(this.f49436w.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f49415b.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.m69155d(colorStateList2));
        this.f49416c = rippleDrawableCompat;
        this.f49418e = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f49415b), rippleDrawableCompat});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo57988y() {
        if (this.f49436w.getVisibility() == 0) {
            if (this.f49432s == 1) {
                return true;
            }
            return false;
        } else if (this.f49432s != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo57989z() {
        if (this.f49436w.getVisibility() != 0) {
            if (this.f49432s == 2) {
                return true;
            }
            return false;
        } else if (this.f49432s != 1) {
            return true;
        } else {
            return false;
        }
    }
}
