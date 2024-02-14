package com.google.android.material.transition;

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
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.TransitionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MaterialContainerTransform extends Transition {

    /* renamed from: Q */
    private static final String f50813Q = MaterialContainerTransform.class.getSimpleName();

    /* renamed from: R */
    private static final String[] f50814R = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: S */
    private static final ProgressThresholdsGroup f50815S = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));

    /* renamed from: T */
    private static final ProgressThresholdsGroup f50816T = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));

    /* renamed from: U */
    private static final ProgressThresholdsGroup f50817U = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    /* renamed from: V */
    private static final ProgressThresholdsGroup f50818V = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    @ColorInt

    /* renamed from: A */
    private int f50819A = 0;
    @ColorInt

    /* renamed from: B */
    private int f50820B = 1375731712;

    /* renamed from: C */
    private int f50821C = 0;

    /* renamed from: D */
    private int f50822D = 0;

    /* renamed from: E */
    private int f50823E = 0;
    @Nullable

    /* renamed from: F */
    private View f50824F;
    @Nullable

    /* renamed from: G */
    private View f50825G;
    @Nullable

    /* renamed from: H */
    private ShapeAppearanceModel f50826H;
    @Nullable

    /* renamed from: I */
    private ShapeAppearanceModel f50827I;
    @Nullable

    /* renamed from: J */
    private ProgressThresholds f50828J;
    @Nullable

    /* renamed from: K */
    private ProgressThresholds f50829K;
    @Nullable

    /* renamed from: L */
    private ProgressThresholds f50830L;
    @Nullable

    /* renamed from: M */
    private ProgressThresholds f50831M;

    /* renamed from: N */
    private boolean f50832N;

    /* renamed from: O */
    private float f50833O;

    /* renamed from: P */
    private float f50834P;

    /* renamed from: a */
    private boolean f50835a = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f50836c = false;

    /* renamed from: d */
    private boolean f50837d = false;

    /* renamed from: f */
    private boolean f50838f = false;
    @IdRes

    /* renamed from: g */
    private int f50839g = 16908290;
    @IdRes

    /* renamed from: o */
    private int f50840o = -1;
    @IdRes

    /* renamed from: p */
    private int f50841p = -1;
    @ColorInt

    /* renamed from: s */
    private int f50842s = 0;
    @ColorInt

    /* renamed from: z */
    private int f50843z = 0;

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
        public final float f50851a;
        /* access modifiers changed from: private */
        @FloatRange(from = 0.0d, mo592to = 1.0d)

        /* renamed from: b */
        public final float f50852b;

        public ProgressThresholds(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2) {
            this.f50851a = f;
            this.f50852b = f2;
        }

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: c */
        public float mo59465c() {
            return this.f50852b;
        }

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: d */
        public float mo59466d() {
            return this.f50851a;
        }
    }

    private static class ProgressThresholdsGroup {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: a */
        public final ProgressThresholds f50853a;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: b */
        public final ProgressThresholds f50854b;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: c */
        public final ProgressThresholds f50855c;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final ProgressThresholds f50856d;

        private ProgressThresholdsGroup(@NonNull ProgressThresholds progressThresholds, @NonNull ProgressThresholds progressThresholds2, @NonNull ProgressThresholds progressThresholds3, @NonNull ProgressThresholds progressThresholds4) {
            this.f50853a = progressThresholds;
            this.f50854b = progressThresholds2;
            this.f50855c = progressThresholds3;
            this.f50856d = progressThresholds4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    private static final class TransitionDrawable extends Drawable {

        /* renamed from: A */
        private final ProgressThresholdsGroup f50857A;

        /* renamed from: B */
        private final FadeModeEvaluator f50858B;

        /* renamed from: C */
        private final FitModeEvaluator f50859C;

        /* renamed from: D */
        private final boolean f50860D;

        /* renamed from: E */
        private final Paint f50861E;

        /* renamed from: F */
        private final Path f50862F;

        /* renamed from: G */
        private FadeModeResult f50863G;

        /* renamed from: H */
        private FitModeResult f50864H;

        /* renamed from: I */
        private RectF f50865I;

        /* renamed from: J */
        private float f50866J;

        /* renamed from: K */
        private float f50867K;

        /* renamed from: L */
        private float f50868L;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final View f50869a;

        /* renamed from: b */
        private final RectF f50870b;

        /* renamed from: c */
        private final ShapeAppearanceModel f50871c;

        /* renamed from: d */
        private final float f50872d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final View f50873e;

        /* renamed from: f */
        private final RectF f50874f;

        /* renamed from: g */
        private final ShapeAppearanceModel f50875g;

        /* renamed from: h */
        private final float f50876h;

        /* renamed from: i */
        private final Paint f50877i;

        /* renamed from: j */
        private final Paint f50878j;

        /* renamed from: k */
        private final Paint f50879k;

        /* renamed from: l */
        private final Paint f50880l;

        /* renamed from: m */
        private final Paint f50881m;

        /* renamed from: n */
        private final MaskEvaluator f50882n;

        /* renamed from: o */
        private final PathMeasure f50883o;

        /* renamed from: p */
        private final float f50884p;

        /* renamed from: q */
        private final float[] f50885q;

        /* renamed from: r */
        private final boolean f50886r;

        /* renamed from: s */
        private final float f50887s;

        /* renamed from: t */
        private final float f50888t;

        /* renamed from: u */
        private final boolean f50889u;

        /* renamed from: v */
        private final MaterialShapeDrawable f50890v;

        /* renamed from: w */
        private final RectF f50891w;

        /* renamed from: x */
        private final RectF f50892x;

        /* renamed from: y */
        private final RectF f50893y;

        /* renamed from: z */
        private final RectF f50894z;

        /* renamed from: d */
        private static float m70183d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        private static float m70184e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: f */
        private void m70185f(Canvas canvas, RectF rectF, Path path, @ColorInt int i) {
            PointF m = m70192m(rectF);
            if (this.f50868L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f50861E.setColor(i);
            canvas.drawPath(path, this.f50861E);
        }

        /* renamed from: g */
        private void m70186g(Canvas canvas, RectF rectF, @ColorInt int i) {
            this.f50861E.setColor(i);
            canvas.drawRect(rectF, this.f50861E);
        }

        /* renamed from: h */
        private void m70187h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f50882n.mo59463d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m70189j(canvas);
            } else {
                m70188i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        private void m70188i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f50890v;
            RectF rectF = this.f50865I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f50890v.mo58655Z(this.f50866J);
            this.f50890v.mo58670j0((int) this.f50867K);
            this.f50890v.setShapeAppearanceModel(this.f50882n.mo59462c());
            this.f50890v.draw(canvas);
        }

        /* renamed from: j */
        private void m70189j(Canvas canvas) {
            ShapeAppearanceModel c = this.f50882n.mo59462c();
            if (c.mo58706u(this.f50865I)) {
                float a = c.mo58703r().mo58627a(this.f50865I);
                canvas.drawRoundRect(this.f50865I, a, a, this.f50880l);
                return;
            }
            canvas.drawPath(this.f50882n.mo59463d(), this.f50880l);
        }

        /* renamed from: k */
        private void m70190k(Canvas canvas) {
            m70193n(canvas, this.f50879k);
            Rect bounds = getBounds();
            RectF rectF = this.f50893y;
            TransitionUtils.m70247t(canvas, bounds, rectF.left, rectF.top, this.f50864H.f50803b, this.f50863G.f50782b, new TransitionUtils.CanvasOperation() {
                /* renamed from: a */
                public void mo59471a(Canvas canvas) {
                    TransitionDrawable.this.f50873e.draw(canvas);
                }
            });
        }

        /* renamed from: l */
        private void m70191l(Canvas canvas) {
            m70193n(canvas, this.f50878j);
            Rect bounds = getBounds();
            RectF rectF = this.f50891w;
            TransitionUtils.m70247t(canvas, bounds, rectF.left, rectF.top, this.f50864H.f50802a, this.f50863G.f50781a, new TransitionUtils.CanvasOperation() {
                /* renamed from: a */
                public void mo59471a(Canvas canvas) {
                    TransitionDrawable.this.f50869a.draw(canvas);
                }
            });
        }

        /* renamed from: m */
        private static PointF m70192m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: n */
        private void m70193n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m70194o(float f) {
            if (this.f50868L != f) {
                m70195p(f);
            }
        }

        /* renamed from: p */
        private void m70195p(float f) {
            float f2;
            float f3;
            this.f50868L = f;
            this.f50881m.setAlpha((int) (this.f50886r ? TransitionUtils.m70237j(0.0f, 255.0f, f) : TransitionUtils.m70237j(255.0f, 0.0f, f)));
            this.f50883o.getPosTan(this.f50884p * f, this.f50885q, (float[]) null);
            float[] fArr = this.f50885q;
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
                this.f50883o.getPosTan(this.f50884p * f3, fArr, (float[]) null);
                float[] fArr2 = this.f50885q;
                f4 += (f4 - fArr2[0]) * f2;
                f5 += (f5 - fArr2[1]) * f2;
            }
            float f6 = f4;
            float f7 = f5;
            FitModeResult a = this.f50859C.mo59457a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50854b.f50851a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50854b.f50852b))).floatValue(), this.f50870b.width(), this.f50870b.height(), this.f50874f.width(), this.f50874f.height());
            this.f50864H = a;
            RectF rectF = this.f50891w;
            float f8 = a.f50804c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, a.f50805d + f7);
            RectF rectF2 = this.f50893y;
            FitModeResult fitModeResult = this.f50864H;
            float f9 = fitModeResult.f50806e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), fitModeResult.f50807f + f7);
            this.f50892x.set(this.f50891w);
            this.f50894z.set(this.f50893y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50855c.f50851a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50855c.f50852b))).floatValue();
            boolean b = this.f50859C.mo59458b(this.f50864H);
            RectF rectF3 = b ? this.f50892x : this.f50894z;
            float k = TransitionUtils.m70238k(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b) {
                k = 1.0f - k;
            }
            this.f50859C.mo59459c(rectF3, k, this.f50864H);
            this.f50865I = new RectF(Math.min(this.f50892x.left, this.f50894z.left), Math.min(this.f50892x.top, this.f50894z.top), Math.max(this.f50892x.right, this.f50894z.right), Math.max(this.f50892x.bottom, this.f50894z.bottom));
            this.f50882n.mo59461b(f, this.f50871c, this.f50875g, this.f50891w, this.f50892x, this.f50894z, this.f50857A.f50856d);
            this.f50866J = TransitionUtils.m70237j(this.f50872d, this.f50876h, f);
            float d = m70183d(this.f50865I, this.f50887s);
            float e = m70184e(this.f50865I, this.f50888t);
            float f10 = this.f50866J;
            float f11 = (float) ((int) (e * f10));
            this.f50867K = f11;
            this.f50880l.setShadowLayer(f10, (float) ((int) (d * f10)), f11, 754974720);
            this.f50863G = this.f50858B.mo59449a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50853a.f50851a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f50857A.f50853a.f50852b))).floatValue(), 0.35f);
            if (this.f50878j.getColor() != 0) {
                this.f50878j.setAlpha(this.f50863G.f50781a);
            }
            if (this.f50879k.getColor() != 0) {
                this.f50879k.setAlpha(this.f50863G.f50782b);
            }
            invalidateSelf();
        }

        public void draw(@NonNull Canvas canvas) {
            if (this.f50881m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f50881m);
            }
            int save = this.f50860D ? canvas.save() : -1;
            if (this.f50889u && this.f50866J > 0.0f) {
                m70187h(canvas);
            }
            this.f50882n.mo59460a(canvas);
            m70193n(canvas, this.f50877i);
            if (this.f50863G.f50783c) {
                m70191l(canvas);
                m70190k(canvas);
            } else {
                m70190k(canvas);
                m70191l(canvas);
            }
            if (this.f50860D) {
                canvas.restoreToCount(save);
                m70185f(canvas, this.f50891w, this.f50862F, -65281);
                m70186g(canvas, this.f50892x, InputDeviceCompat.SOURCE_ANY);
                m70186g(canvas, this.f50891w, -16711936);
                m70186g(canvas, this.f50894z, -16711681);
                m70186g(canvas, this.f50893y, -16776961);
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
            this.f50877i = paint;
            Paint paint2 = new Paint();
            this.f50878j = paint2;
            Paint paint3 = new Paint();
            this.f50879k = paint3;
            this.f50880l = new Paint();
            Paint paint4 = new Paint();
            this.f50881m = paint4;
            this.f50882n = new MaskEvaluator();
            float[] fArr = new float[2];
            this.f50885q = fArr;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f50890v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f50861E = paint5;
            this.f50862F = new Path();
            this.f50869a = view;
            this.f50870b = rectF3;
            this.f50871c = shapeAppearanceModel;
            this.f50872d = f;
            this.f50873e = view2;
            this.f50874f = rectF2;
            this.f50875g = shapeAppearanceModel2;
            this.f50876h = f2;
            this.f50886r = z;
            this.f50889u = z2;
            this.f50858B = fadeModeEvaluator;
            this.f50859C = fitModeEvaluator;
            this.f50857A = progressThresholdsGroup;
            this.f50860D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f50887s = (float) displayMetrics.widthPixels;
            this.f50888t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.mo58656a0(ColorStateList.valueOf(0));
            materialShapeDrawable.mo58668i0(2);
            materialShapeDrawable.mo58661f0(false);
            materialShapeDrawable.mo58662g0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f50891w = rectF4;
            this.f50892x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f50893y = rectF5;
            this.f50894z = new RectF(rectF5);
            PointF m = m70192m(rectF);
            PointF m2 = m70192m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.f50883o = pathMeasure;
            this.f50884p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.m70230c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m70195p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        boolean z = false;
        this.f50832N = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f50833O = -1.0f;
        this.f50834P = -1.0f;
    }

    /* renamed from: b */
    private ProgressThresholdsGroup m70162b(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return m70168h(z, f50817U, f50818V);
        }
        return m70168h(z, f50815S, f50816T);
    }

    /* renamed from: c */
    private static RectF m70163c(View view, @Nullable View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = TransitionUtils.m70234g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: d */
    private static ShapeAppearanceModel m70164d(@NonNull View view, @NonNull RectF rectF, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.m70229b(m70167g(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: e */
    private static void m70165e(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            transitionValues.view = TransitionUtils.m70233f(transitionValues.view, i);
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
            RectF h = view3.getParent() == null ? TransitionUtils.m70235h(view3) : TransitionUtils.m70234g(view3);
            transitionValues.values.put("materialContainerTransition:bounds", h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m70164d(view3, h, shapeAppearanceModel));
        }
    }

    /* renamed from: f */
    private static float m70166f(float f, View view) {
        return f != -1.0f ? f : ViewCompat.getElevation(view);
    }

    /* renamed from: g */
    private static ShapeAppearanceModel m70167g(@NonNull View view, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i = C10462R.C10465id.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i);
        }
        Context context = view.getContext();
        int k = m70169k(context);
        if (k != -1) {
            return ShapeAppearanceModel.m69261b(context, k, 0).mo58721m();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.m69260a().mo58721m();
    }

    /* renamed from: h */
    private ProgressThresholdsGroup m70168h(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.m70231d(this.f50828J, progressThresholdsGroup.f50853a), (ProgressThresholds) TransitionUtils.m70231d(this.f50829K, progressThresholdsGroup.f50854b), (ProgressThresholds) TransitionUtils.m70231d(this.f50830L, progressThresholdsGroup.f50855c), (ProgressThresholds) TransitionUtils.m70231d(this.f50831M, progressThresholdsGroup.f50856d));
    }

    @StyleRes
    /* renamed from: k */
    private static int m70169k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C10462R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: l */
    private boolean m70170l(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i = this.f50821C;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f50821C);
        } else if (TransitionUtils.m70228a(rectF2) > TransitionUtils.m70228a(rectF)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private void m70171n(Context context, boolean z) {
        TransitionUtils.m70243p(this, context, C10462R.attr.motionEasingStandard, AnimationUtils.f48522b);
        TransitionUtils.m70242o(this, context, z ? C10462R.attr.motionDurationLong1 : C10462R.attr.motionDurationMedium2);
        if (!this.f50837d) {
            TransitionUtils.m70244q(this, context, C10462R.attr.motionPath);
        }
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m70165e(transitionValues, this.f50825G, this.f50841p, this.f50827I);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m70165e(transitionValues, this.f50824F, this.f50840o, this.f50826H);
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
                Log.w(f50813Q, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                RectF rectF2 = (RectF) transitionValues4.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues4.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(f50813Q, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view3 = transitionValues3.view;
                final View view4 = transitionValues4.view;
                View view5 = view4.getParent() != null ? view4 : view3;
                if (this.f50839g == view5.getId()) {
                    view = (View) view5.getParent();
                    view2 = view5;
                } else {
                    view = TransitionUtils.m70232e(view5, this.f50839g);
                    view2 = null;
                }
                RectF g = TransitionUtils.m70234g(view);
                float f = -g.left;
                float f2 = -g.top;
                RectF c = m70163c(view, view2, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean l = m70170l(rectF, rectF2);
                if (!this.f50838f) {
                    m70171n(view5.getContext(), l);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view3, rectF, shapeAppearanceModel, m70166f(this.f50833O, view3), view4, rectF2, shapeAppearanceModel2, m70166f(this.f50834P, view4), this.f50842s, this.f50843z, this.f50819A, this.f50820B, l, this.f50832N, FadeModeEvaluators.m70131a(this.f50822D, l), FitModeEvaluators.m70148a(this.f50823E, l, rectF, rectF2), m70162b(l), this.f50835a);
                transitionDrawable.setBounds(Math.round(c.left), Math.round(c.top), Math.round(c.right), Math.round(c.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        transitionDrawable.m70194o(valueAnimator.getAnimatedFraction());
                    }
                });
                final TransitionDrawable transitionDrawable2 = transitionDrawable;
                addListener(new TransitionListenerAdapter() {
                    public void onTransitionEnd(@NonNull Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (!MaterialContainerTransform.this.f50836c) {
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
        return f50814R;
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f50837d = true;
    }
}
