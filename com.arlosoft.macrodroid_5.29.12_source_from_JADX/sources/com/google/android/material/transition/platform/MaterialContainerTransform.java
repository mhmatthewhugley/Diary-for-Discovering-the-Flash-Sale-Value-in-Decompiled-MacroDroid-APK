package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.platform.TransitionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class MaterialContainerTransform extends Transition {

    /* renamed from: Q */
    private static final String f50965Q = MaterialContainerTransform.class.getSimpleName();

    /* renamed from: R */
    private static final String[] f50966R = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: S */
    private static final ProgressThresholdsGroup f50967S = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));

    /* renamed from: T */
    private static final ProgressThresholdsGroup f50968T = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));

    /* renamed from: U */
    private static final ProgressThresholdsGroup f50969U = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    /* renamed from: V */
    private static final ProgressThresholdsGroup f50970V = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    @ColorInt

    /* renamed from: A */
    private int f50971A = 0;
    @ColorInt

    /* renamed from: B */
    private int f50972B = 1375731712;

    /* renamed from: C */
    private int f50973C = 0;

    /* renamed from: D */
    private int f50974D = 0;

    /* renamed from: E */
    private int f50975E = 0;
    @Nullable

    /* renamed from: F */
    private View f50976F;
    @Nullable

    /* renamed from: G */
    private View f50977G;
    @Nullable

    /* renamed from: H */
    private ShapeAppearanceModel f50978H;
    @Nullable

    /* renamed from: I */
    private ShapeAppearanceModel f50979I;
    @Nullable

    /* renamed from: J */
    private ProgressThresholds f50980J;
    @Nullable

    /* renamed from: K */
    private ProgressThresholds f50981K;
    @Nullable

    /* renamed from: L */
    private ProgressThresholds f50982L;
    @Nullable

    /* renamed from: M */
    private ProgressThresholds f50983M;

    /* renamed from: N */
    private boolean f50984N;

    /* renamed from: O */
    private float f50985O;

    /* renamed from: P */
    private float f50986P;

    /* renamed from: a */
    private boolean f50987a = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f50988c = false;

    /* renamed from: d */
    private boolean f50989d = false;

    /* renamed from: f */
    private boolean f50990f = false;
    @IdRes

    /* renamed from: g */
    private int f50991g = 16908290;
    @IdRes

    /* renamed from: o */
    private int f50992o = -1;
    @IdRes

    /* renamed from: p */
    private int f50993p = -1;
    @ColorInt

    /* renamed from: s */
    private int f50994s = 0;
    @ColorInt

    /* renamed from: z */
    private int f50995z = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {
        /* access modifiers changed from: private */
        @FloatRange(from = 0.0d, mo592to = 1.0d)

        /* renamed from: a */
        public final float f51003a;
        /* access modifiers changed from: private */
        @FloatRange(from = 0.0d, mo592to = 1.0d)

        /* renamed from: b */
        public final float f51004b;

        public ProgressThresholds(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2) {
            this.f51003a = f;
            this.f51004b = f2;
        }

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: c */
        public float mo59508c() {
            return this.f51004b;
        }

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: d */
        public float mo59509d() {
            return this.f51003a;
        }
    }

    private static class ProgressThresholdsGroup {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: a */
        public final ProgressThresholds f51005a;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: b */
        public final ProgressThresholds f51006b;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: c */
        public final ProgressThresholds f51007c;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final ProgressThresholds f51008d;

        private ProgressThresholdsGroup(@NonNull ProgressThresholds progressThresholds, @NonNull ProgressThresholds progressThresholds2, @NonNull ProgressThresholds progressThresholds3, @NonNull ProgressThresholds progressThresholds4) {
            this.f51005a = progressThresholds;
            this.f51006b = progressThresholds2;
            this.f51007c = progressThresholds3;
            this.f51008d = progressThresholds4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    private static final class TransitionDrawable extends Drawable {

        /* renamed from: A */
        private final ProgressThresholdsGroup f51009A;

        /* renamed from: B */
        private final FadeModeEvaluator f51010B;

        /* renamed from: C */
        private final FitModeEvaluator f51011C;

        /* renamed from: D */
        private final boolean f51012D;

        /* renamed from: E */
        private final Paint f51013E;

        /* renamed from: F */
        private final Path f51014F;

        /* renamed from: G */
        private FadeModeResult f51015G;

        /* renamed from: H */
        private FitModeResult f51016H;

        /* renamed from: I */
        private RectF f51017I;

        /* renamed from: J */
        private float f51018J;

        /* renamed from: K */
        private float f51019K;

        /* renamed from: L */
        private float f51020L;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final View f51021a;

        /* renamed from: b */
        private final RectF f51022b;

        /* renamed from: c */
        private final ShapeAppearanceModel f51023c;

        /* renamed from: d */
        private final float f51024d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final View f51025e;

        /* renamed from: f */
        private final RectF f51026f;

        /* renamed from: g */
        private final ShapeAppearanceModel f51027g;

        /* renamed from: h */
        private final float f51028h;

        /* renamed from: i */
        private final Paint f51029i;

        /* renamed from: j */
        private final Paint f51030j;

        /* renamed from: k */
        private final Paint f51031k;

        /* renamed from: l */
        private final Paint f51032l;

        /* renamed from: m */
        private final Paint f51033m;

        /* renamed from: n */
        private final MaskEvaluator f51034n;

        /* renamed from: o */
        private final PathMeasure f51035o;

        /* renamed from: p */
        private final float f51036p;

        /* renamed from: q */
        private final float[] f51037q;

        /* renamed from: r */
        private final boolean f51038r;

        /* renamed from: s */
        private final float f51039s;

        /* renamed from: t */
        private final float f51040t;

        /* renamed from: u */
        private final boolean f51041u;

        /* renamed from: v */
        private final MaterialShapeDrawable f51042v;

        /* renamed from: w */
        private final RectF f51043w;

        /* renamed from: x */
        private final RectF f51044x;

        /* renamed from: y */
        private final RectF f51045y;

        /* renamed from: z */
        private final RectF f51046z;

        /* renamed from: d */
        private static float m70309d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        private static float m70310e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: f */
        private void m70311f(Canvas canvas, RectF rectF, Path path, @ColorInt int i) {
            PointF m = m70318m(rectF);
            if (this.f51020L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f51013E.setColor(i);
            canvas.drawPath(path, this.f51013E);
        }

        /* renamed from: g */
        private void m70312g(Canvas canvas, RectF rectF, @ColorInt int i) {
            this.f51013E.setColor(i);
            canvas.drawRect(rectF, this.f51013E);
        }

        /* renamed from: h */
        private void m70313h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f51034n.mo59497d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m70315j(canvas);
            } else {
                m70314i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        private void m70314i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f51042v;
            RectF rectF = this.f51017I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f51042v.mo58655Z(this.f51018J);
            this.f51042v.mo58670j0((int) this.f51019K);
            this.f51042v.setShapeAppearanceModel(this.f51034n.mo59496c());
            this.f51042v.draw(canvas);
        }

        /* renamed from: j */
        private void m70315j(Canvas canvas) {
            ShapeAppearanceModel c = this.f51034n.mo59496c();
            if (c.mo58706u(this.f51017I)) {
                float a = c.mo58703r().mo58627a(this.f51017I);
                canvas.drawRoundRect(this.f51017I, a, a, this.f51032l);
                return;
            }
            canvas.drawPath(this.f51034n.mo59497d(), this.f51032l);
        }

        /* renamed from: k */
        private void m70316k(Canvas canvas) {
            m70319n(canvas, this.f51031k);
            Rect bounds = getBounds();
            RectF rectF = this.f51045y;
            TransitionUtils.m70386u(canvas, bounds, rectF.left, rectF.top, this.f51016H.f50955b, this.f51015G.f50934b, new TransitionUtils.CanvasOperation() {
                /* renamed from: a */
                public void mo59514a(Canvas canvas) {
                    TransitionDrawable.this.f51025e.draw(canvas);
                }
            });
        }

        /* renamed from: l */
        private void m70317l(Canvas canvas) {
            m70319n(canvas, this.f51030j);
            Rect bounds = getBounds();
            RectF rectF = this.f51043w;
            TransitionUtils.m70386u(canvas, bounds, rectF.left, rectF.top, this.f51016H.f50954a, this.f51015G.f50933a, new TransitionUtils.CanvasOperation() {
                /* renamed from: a */
                public void mo59514a(Canvas canvas) {
                    TransitionDrawable.this.f51021a.draw(canvas);
                }
            });
        }

        /* renamed from: m */
        private static PointF m70318m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: n */
        private void m70319n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m70320o(float f) {
            if (this.f51020L != f) {
                m70321p(f);
            }
        }

        /* renamed from: p */
        private void m70321p(float f) {
            float f2;
            float f3;
            this.f51020L = f;
            this.f51033m.setAlpha((int) (this.f51038r ? TransitionUtils.m70376k(0.0f, 255.0f, f) : TransitionUtils.m70376k(255.0f, 0.0f, f)));
            this.f51035o.getPosTan(this.f51036p * f, this.f51037q, (float[]) null);
            float[] fArr = this.f51037q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f3 = 0.99f;
                    f2 = (f - 1.0f) / 0.00999999f;
                } else {
                    f3 = 0.01f;
                    f2 = (f / 0.01f) * -1.0f;
                }
                this.f51035o.getPosTan(this.f51036p * f3, fArr, (float[]) null);
                float[] fArr2 = this.f51037q;
                f4 += (f4 - fArr2[0]) * f2;
                f5 += (f5 - fArr2[1]) * f2;
            }
            float f6 = f4;
            float f7 = f5;
            FitModeResult a = this.f51011C.mo59489a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51006b.f51003a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51006b.f51004b))).floatValue(), this.f51022b.width(), this.f51022b.height(), this.f51026f.width(), this.f51026f.height());
            this.f51016H = a;
            RectF rectF = this.f51043w;
            float f8 = a.f50956c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, a.f50957d + f7);
            RectF rectF2 = this.f51045y;
            FitModeResult fitModeResult = this.f51016H;
            float f9 = fitModeResult.f50958e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), fitModeResult.f50959f + f7);
            this.f51044x.set(this.f51043w);
            this.f51046z.set(this.f51045y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51007c.f51003a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51007c.f51004b))).floatValue();
            boolean b = this.f51011C.mo59490b(this.f51016H);
            RectF rectF3 = b ? this.f51044x : this.f51046z;
            float l = TransitionUtils.m70377l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b) {
                l = 1.0f - l;
            }
            this.f51011C.mo59491c(rectF3, l, this.f51016H);
            this.f51017I = new RectF(Math.min(this.f51044x.left, this.f51046z.left), Math.min(this.f51044x.top, this.f51046z.top), Math.max(this.f51044x.right, this.f51046z.right), Math.max(this.f51044x.bottom, this.f51046z.bottom));
            this.f51034n.mo59495b(f, this.f51023c, this.f51027g, this.f51043w, this.f51044x, this.f51046z, this.f51009A.f51008d);
            this.f51018J = TransitionUtils.m70376k(this.f51024d, this.f51028h, f);
            float d = m70309d(this.f51017I, this.f51039s);
            float e = m70310e(this.f51017I, this.f51040t);
            float f10 = this.f51018J;
            float f11 = (float) ((int) (e * f10));
            this.f51019K = f11;
            this.f51032l.setShadowLayer(f10, (float) ((int) (d * f10)), f11, 754974720);
            this.f51015G = this.f51010B.mo59481a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51005a.f51003a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51009A.f51005a.f51004b))).floatValue(), 0.35f);
            if (this.f51030j.getColor() != 0) {
                this.f51030j.setAlpha(this.f51015G.f50933a);
            }
            if (this.f51031k.getColor() != 0) {
                this.f51031k.setAlpha(this.f51015G.f50934b);
            }
            invalidateSelf();
        }

        public void draw(@NonNull Canvas canvas) {
            if (this.f51033m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f51033m);
            }
            int save = this.f51012D ? canvas.save() : -1;
            if (this.f51041u && this.f51018J > 0.0f) {
                m70313h(canvas);
            }
            this.f51034n.mo59494a(canvas);
            m70319n(canvas, this.f51029i);
            if (this.f51015G.f50935c) {
                m70317l(canvas);
                m70316k(canvas);
            } else {
                m70316k(canvas);
                m70317l(canvas);
            }
            if (this.f51012D) {
                canvas.restoreToCount(save);
                m70311f(canvas, this.f51043w, this.f51014F, -65281);
                m70312g(canvas, this.f51044x, InputDeviceCompat.SOURCE_ANY);
                m70312g(canvas, this.f51043w, -16711936);
                m70312g(canvas, this.f51046z, -16711681);
                m70312g(canvas, this.f51045y, -16776961);
            }
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f51029i = paint;
            Paint paint2 = new Paint();
            this.f51030j = paint2;
            Paint paint3 = new Paint();
            this.f51031k = paint3;
            this.f51032l = new Paint();
            Paint paint4 = new Paint();
            this.f51033m = paint4;
            this.f51034n = new MaskEvaluator();
            float[] fArr = new float[2];
            this.f51037q = fArr;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f51042v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f51013E = paint5;
            this.f51014F = new Path();
            this.f51021a = view;
            this.f51022b = rectF3;
            this.f51023c = shapeAppearanceModel;
            this.f51024d = f;
            this.f51025e = view2;
            this.f51026f = rectF2;
            this.f51027g = shapeAppearanceModel2;
            this.f51028h = f2;
            this.f51038r = z;
            this.f51041u = z2;
            this.f51010B = fadeModeEvaluator;
            this.f51011C = fitModeEvaluator;
            this.f51009A = progressThresholdsGroup;
            this.f51012D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f51039s = (float) displayMetrics.widthPixels;
            this.f51040t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.mo58656a0(ColorStateList.valueOf(0));
            materialShapeDrawable.mo58668i0(2);
            materialShapeDrawable.mo58661f0(false);
            materialShapeDrawable.mo58662g0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f51043w = rectF4;
            this.f51044x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f51045y = rectF5;
            this.f51046z = new RectF(rectF5);
            PointF m = m70318m(rectF);
            PointF m2 = m70318m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.f51035o = pathMeasure;
            this.f51036p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.m70368c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m70321p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        boolean z = false;
        this.f50984N = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f50985O = -1.0f;
        this.f50986P = -1.0f;
    }

    /* renamed from: b */
    private ProgressThresholdsGroup m70287b(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return m70293h(z, f50969U, f50970V);
        }
        return m70293h(z, f50967S, f50968T);
    }

    /* renamed from: c */
    private static RectF m70288c(View view, @Nullable View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = TransitionUtils.m70372g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: d */
    private static ShapeAppearanceModel m70289d(@NonNull View view, @NonNull RectF rectF, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.m70367b(m70292g(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: e */
    private static void m70290e(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            transitionValues.view = TransitionUtils.m70371f(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i2 = C10462R.C10465id.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                transitionValues.view.setTag(i2, (Object) null);
                transitionValues.view = (View) transitionValues.view.getTag(i2);
            }
        }
        View view3 = transitionValues.view;
        if (ViewCompat.isLaidOut(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            RectF h = view3.getParent() == null ? TransitionUtils.m70373h(view3) : TransitionUtils.m70372g(view3);
            transitionValues.values.put("materialContainerTransition:bounds", h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m70289d(view3, h, shapeAppearanceModel));
        }
    }

    /* renamed from: f */
    private static float m70291f(float f, View view) {
        return f != -1.0f ? f : ViewCompat.getElevation(view);
    }

    /* renamed from: g */
    private static ShapeAppearanceModel m70292g(@NonNull View view, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i = C10462R.C10465id.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i);
        }
        Context context = view.getContext();
        int k = m70294k(context);
        if (k != -1) {
            return ShapeAppearanceModel.m69261b(context, k, 0).mo58721m();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.m69260a().mo58721m();
    }

    /* renamed from: h */
    private ProgressThresholdsGroup m70293h(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.m70369d(this.f50980J, progressThresholdsGroup.f51005a), (ProgressThresholds) TransitionUtils.m70369d(this.f50981K, progressThresholdsGroup.f51006b), (ProgressThresholds) TransitionUtils.m70369d(this.f50982L, progressThresholdsGroup.f51007c), (ProgressThresholds) TransitionUtils.m70369d(this.f50983M, progressThresholdsGroup.f51008d));
    }

    @StyleRes
    /* renamed from: k */
    private static int m70294k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C10462R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: l */
    private boolean m70295l(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i = this.f50973C;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f50973C);
        } else if (TransitionUtils.m70366a(rectF2) > TransitionUtils.m70366a(rectF)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private void m70296n(Context context, boolean z) {
        TransitionUtils.m70382q(this, context, C10462R.attr.motionEasingStandard, AnimationUtils.f48522b);
        TransitionUtils.m70381p(this, context, z ? C10462R.attr.motionDurationLong1 : C10462R.attr.motionDurationMedium2);
        if (!this.f50989d) {
            TransitionUtils.m70383r(this, context, C10462R.attr.motionPath);
        }
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m70290e(transitionValues, this.f50977G, this.f50993p, this.f50979I);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m70290e(transitionValues, this.f50976F, this.f50992o, this.f50978H);
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        final View view;
        View view2;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (!(transitionValues3 == null || transitionValues4 == null)) {
            RectF rectF = (RectF) transitionValues3.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues3.values.get("materialContainerTransition:shapeAppearance");
            if (rectF == null || shapeAppearanceModel == null) {
                Log.w(f50965Q, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                RectF rectF2 = (RectF) transitionValues4.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues4.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(f50965Q, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view3 = transitionValues3.view;
                final View view4 = transitionValues4.view;
                View view5 = view4.getParent() != null ? view4 : view3;
                if (this.f50991g == view5.getId()) {
                    view = (View) view5.getParent();
                    view2 = view5;
                } else {
                    view = TransitionUtils.m70370e(view5, this.f50991g);
                    view2 = null;
                }
                RectF g = TransitionUtils.m70372g(view);
                float f = -g.left;
                float f2 = -g.top;
                RectF c = m70288c(view, view2, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean l = m70295l(rectF, rectF2);
                if (!this.f50990f) {
                    m70296n(view5.getContext(), l);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view3, rectF, shapeAppearanceModel, m70291f(this.f50985O, view3), view4, rectF2, shapeAppearanceModel2, m70291f(this.f50986P, view4), this.f50994s, this.f50995z, this.f50971A, this.f50972B, l, this.f50984N, FadeModeEvaluators.m70256a(this.f50974D, l), FitModeEvaluators.m70273a(this.f50975E, l, rectF, rectF2), m70287b(l), this.f50987a);
                transitionDrawable.setBounds(Math.round(c.left), Math.round(c.top), Math.round(c.right), Math.round(c.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        transitionDrawable.m70320o(valueAnimator.getAnimatedFraction());
                    }
                });
                final TransitionDrawable transitionDrawable2 = transitionDrawable;
                addListener(new TransitionListenerAdapter() {
                    public void onTransitionEnd(@NonNull Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (!MaterialContainerTransform.this.f50988c) {
                            view3.setAlpha(1.0f);
                            view4.setAlpha(1.0f);
                            ViewUtils.m68840g(view).remove(transitionDrawable2);
                        }
                    }

                    public void onTransitionStart(@NonNull Transition transition) {
                        ViewUtils.m68840g(view).add(transitionDrawable2);
                        view3.setAlpha(0.0f);
                        view4.setAlpha(0.0f);
                    }
                });
                return ofFloat;
            }
        }
        return null;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return f50966R;
    }

    /* renamed from: o */
    public void mo59503o(boolean z) {
        this.f50988c = z;
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f50989d = true;
    }
}
