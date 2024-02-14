package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.C0144Px;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: A */
    private final Paint f50624A;

    /* renamed from: B */
    private final RectF f50625B;
    @C0144Px

    /* renamed from: C */
    private final int f50626C;

    /* renamed from: D */
    private float f50627D;

    /* renamed from: E */
    private boolean f50628E;

    /* renamed from: F */
    private OnActionUpListener f50629F;

    /* renamed from: G */
    private double f50630G;

    /* renamed from: H */
    private int f50631H;

    /* renamed from: a */
    private ValueAnimator f50632a;

    /* renamed from: c */
    private boolean f50633c;

    /* renamed from: d */
    private float f50634d;

    /* renamed from: f */
    private float f50635f;

    /* renamed from: g */
    private boolean f50636g;

    /* renamed from: o */
    private int f50637o;

    /* renamed from: p */
    private final List<OnRotateListener> f50638p;

    /* renamed from: s */
    private final int f50639s;

    /* renamed from: z */
    private final float f50640z;

    public interface OnActionUpListener {
        /* renamed from: b */
        void mo59369b(@FloatRange(from = 0.0d, mo592to = 360.0d) float f, boolean z);
    }

    public interface OnRotateListener {
        /* renamed from: e */
        void mo59351e(@FloatRange(from = 0.0d, mo592to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialClockStyle);
    }

    /* renamed from: c */
    private void m69977c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f50624A.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f50631H) * ((float) Math.cos(this.f50630G))) + f, (((float) this.f50631H) * ((float) Math.sin(this.f50630G))) + f2, (float) this.f50639s, this.f50624A);
        double sin = Math.sin(this.f50630G);
        double cos = Math.cos(this.f50630G);
        double d = (double) ((float) (this.f50631H - this.f50639s));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f50624A.setStrokeWidth((float) this.f50626C);
        canvas.drawLine(f, f2, f3, f4, this.f50624A);
        canvas.drawCircle(f, f2, this.f50640z, this.f50624A);
    }

    /* renamed from: e */
    private int m69978e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m69979h(float f) {
        float f2 = mo59357f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m69980i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = (float) m69978e(f, f2);
        boolean z4 = false;
        boolean z5 = mo59357f() != e;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f50633c) {
            z4 = true;
        }
        mo59362m(e, z4);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m69981n(@FloatRange(from = 0.0d, mo592to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f50627D = f2;
        this.f50630G = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f50631H) * ((float) Math.cos(this.f50630G)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f50631H) * ((float) Math.sin(this.f50630G)));
        RectF rectF = this.f50625B;
        int i = this.f50639s;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (OnRotateListener e : this.f50638p) {
            e.mo59351e(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo59355b(OnRotateListener onRotateListener) {
        this.f50638p.add(onRotateListener);
    }

    /* renamed from: d */
    public RectF mo59356d() {
        return this.f50625B;
    }

    @FloatRange(from = 0.0d, mo592to = 360.0d)
    /* renamed from: f */
    public float mo59357f() {
        return this.f50627D;
    }

    /* renamed from: g */
    public int mo59358g() {
        return this.f50639s;
    }

    /* renamed from: j */
    public void mo59359j(boolean z) {
        this.f50633c = z;
    }

    /* renamed from: k */
    public void mo59360k(@Dimension int i) {
        this.f50631H = i;
        invalidate();
    }

    /* renamed from: l */
    public void mo59361l(@FloatRange(from = 0.0d, mo592to = 360.0d) float f) {
        mo59362m(f, false);
    }

    /* renamed from: m */
    public void mo59362m(@FloatRange(from = 0.0d, mo592to = 360.0d) float f, boolean z) {
        ValueAnimator valueAnimator = this.f50632a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m69981n(f, false);
            return;
        }
        Pair<Float, Float> h = m69979h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f50632a = ofFloat;
        ofFloat.setDuration(200);
        this.f50632a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.this.m69981n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
            }
        });
        this.f50632a.addListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.f50632a.start();
    }

    /* renamed from: o */
    public void mo59363o(OnActionUpListener onActionUpListener) {
        this.f50629F = onActionUpListener;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m69977c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo59361l(mo59357f());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f50634d);
                int i2 = (int) (y - this.f50635f);
                this.f50636g = (i * i) + (i2 * i2) > this.f50637o;
                boolean z4 = this.f50628E;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.f50634d = x;
            this.f50635f = y;
            this.f50636g = true;
            this.f50628E = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean i3 = m69980i(x, y, z2, z, z3) | this.f50628E;
        this.f50628E = i3;
        if (i3 && z3 && (onActionUpListener = this.f50629F) != null) {
            onActionUpListener.mo59369b((float) m69978e(x, y), this.f50636g);
        }
        return true;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50638p = new ArrayList();
        Paint paint = new Paint();
        this.f50624A = paint;
        this.f50625B = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.ClockHandView, i, C10462R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f50631H = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f50639s = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f50626C = resources.getDimensionPixelSize(C10462R.dimen.material_clock_hand_stroke_width);
        this.f50640z = (float) resources.getDimensionPixelSize(C10462R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C10462R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo59361l(0.0f);
        this.f50637o = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }
}
