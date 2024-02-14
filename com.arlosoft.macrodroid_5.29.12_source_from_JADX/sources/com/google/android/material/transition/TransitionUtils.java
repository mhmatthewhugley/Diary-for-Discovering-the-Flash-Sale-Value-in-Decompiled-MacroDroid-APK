package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

class TransitionUtils {

    /* renamed from: a */
    private static final RectF f50922a = new RectF();

    interface CanvasOperation {
        /* renamed from: a */
        void mo59471a(Canvas canvas);
    }

    interface CornerSizeBinaryOperator {
        @NonNull
        /* renamed from: a */
        CornerSize mo59480a(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    /* renamed from: a */
    static float m70228a(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: b */
    static ShapeAppearanceModel m70229b(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.mo58710y(new ShapeAppearanceModel.CornerSizeUnaryOperator() {
            @NonNull
            /* renamed from: a */
            public CornerSize mo58689a(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new RelativeCornerSize(cornerSize.mo58627a(rectF) / rectF.height());
            }
        });
    }

    /* renamed from: c */
    static Shader m70230c(@ColorInt int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @NonNull
    /* renamed from: d */
    static <T> T m70231d(@Nullable T t, @NonNull T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: e */
    static View m70232e(View view, @IdRes int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: f */
    static View m70233f(View view, @IdRes int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m70232e(view, i);
    }

    /* renamed from: g */
    static RectF m70234g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: h */
    static RectF m70235h(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    /* renamed from: i */
    private static boolean m70236i(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.mo58703r().mo58627a(rectF) == 0.0f && shapeAppearanceModel.mo58705t().mo58627a(rectF) == 0.0f && shapeAppearanceModel.mo58698l().mo58627a(rectF) == 0.0f && shapeAppearanceModel.mo58696j().mo58627a(rectF) == 0.0f) ? false : true;
    }

    /* renamed from: j */
    static float m70237j(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: k */
    static float m70238k(float f, float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3, @FloatRange(from = 0.0d, mo592to = 1.0d) float f4, @FloatRange(from = 0.0d, mo592to = 1.0d) float f5) {
        return m70239l(f, f2, f3, f4, f5, false);
    }

    /* renamed from: l */
    static float m70239l(float f, float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3, @FloatRange(from = 0.0d, mo592to = 1.0d) float f4, @FloatRange(from = 0.0d) float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m70237j(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m70237j(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: m */
    static int m70240m(int i, int i2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m70237j((float) i, (float) i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: n */
    static ShapeAppearanceModel m70241n(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        if (f3 > f2) {
            return shapeAppearanceModel2;
        }
        final RectF rectF3 = rectF;
        final RectF rectF4 = rectF2;
        final float f4 = f;
        final float f5 = f2;
        final float f6 = f3;
        return m70248u(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() {
            @NonNull
            /* renamed from: a */
            public CornerSize mo59480a(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.m70238k(cornerSize.mo58627a(rectF3), cornerSize2.mo58627a(rectF4), f4, f5, f6));
            }
        });
    }

    /* renamed from: o */
    static boolean m70242o(Transition transition, Context context, @AttrRes int i) {
        int d;
        if (i == 0 || transition.getDuration() != -1 || (d = MotionUtils.m68860d(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration((long) d);
        return true;
    }

    /* renamed from: p */
    static boolean m70243p(Transition transition, Context context, @AttrRes int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(MotionUtils.m68861e(context, i, timeInterpolator));
        return true;
    }

    /* renamed from: q */
    static boolean m70244q(Transition transition, Context context, @AttrRes int i) {
        PathMotion r;
        if (i == 0 || (r = m70245r(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(r);
        return true;
    }

    @Nullable
    /* renamed from: r */
    static PathMotion m70245r(Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: s */
    private static int m70246s(Canvas canvas, Rect rect, int i) {
        RectF rectF = f50922a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: t */
    static void m70247t(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasOperation canvasOperation) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                m70246s(canvas, rect, i);
            }
            canvasOperation.mo59471a(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: u */
    static ShapeAppearanceModel m70248u(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (m70236i(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).mo58707v().mo58716F(cornerSizeBinaryOperator.mo59480a(shapeAppearanceModel.mo58703r(), shapeAppearanceModel2.mo58703r())).mo58720J(cornerSizeBinaryOperator.mo59480a(shapeAppearanceModel.mo58705t(), shapeAppearanceModel2.mo58705t())).mo58730w(cornerSizeBinaryOperator.mo59480a(shapeAppearanceModel.mo58696j(), shapeAppearanceModel2.mo58696j())).mo58711A(cornerSizeBinaryOperator.mo59480a(shapeAppearanceModel.mo58698l(), shapeAppearanceModel2.mo58698l())).mo58721m();
    }
}
