package com.varunest.sparkbutton.helpers;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;
import p359p8.C16104a;

public class CircleView extends View {

    /* renamed from: B */
    public static final Property<CircleView, Float> f57917B;

    /* renamed from: C */
    public static final Property<CircleView, Float> f57918C;

    /* renamed from: A */
    private int f57919A;

    /* renamed from: a */
    private int f57920a = -43230;

    /* renamed from: c */
    private int f57921c = -16121;

    /* renamed from: d */
    private ArgbEvaluator f57922d = new ArgbEvaluator();

    /* renamed from: f */
    private Paint f57923f = new Paint();

    /* renamed from: g */
    private Paint f57924g = new Paint();

    /* renamed from: o */
    private Bitmap f57925o;

    /* renamed from: p */
    private Canvas f57926p;

    /* renamed from: s */
    private float f57927s = 0.0f;

    /* renamed from: z */
    private float f57928z = 0.0f;

    /* renamed from: com.varunest.sparkbutton.helpers.CircleView$a */
    static class C11902a extends Property<CircleView, Float> {
        C11902a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(CircleView circleView) {
            return Float.valueOf(circleView.getInnerCircleRadiusProgress());
        }

        /* renamed from: b */
        public void set(CircleView circleView, Float f) {
            circleView.setInnerCircleRadiusProgress(f.floatValue());
        }
    }

    /* renamed from: com.varunest.sparkbutton.helpers.CircleView$b */
    static class C11903b extends Property<CircleView, Float> {
        C11903b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(CircleView circleView) {
            return Float.valueOf(circleView.getOuterCircleRadiusProgress());
        }

        /* renamed from: b */
        public void set(CircleView circleView, Float f) {
            circleView.setOuterCircleRadiusProgress(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f57917B = new C11902a(cls, "innerCircleRadiusProgress");
        f57918C = new C11903b(cls, "outerCircleRadiusProgress");
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82144a();
    }

    /* renamed from: a */
    private void m82144a() {
        this.f57923f.setStyle(Paint.Style.FILL);
        this.f57924g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: c */
    private void m82145c() {
        this.f57923f.setColor(((Integer) this.f57922d.evaluate((float) C16104a.m96730d((double) ((float) C16104a.m96727a((double) this.f57927s, 0.5d, 1.0d)), 0.5d, 1.0d, 0.0d, 1.0d), Integer.valueOf(this.f57920a), Integer.valueOf(this.f57921c))).intValue());
    }

    /* renamed from: b */
    public void mo67166b(int i, int i2) {
        this.f57920a = i;
        this.f57921c = i2;
    }

    public float getInnerCircleRadiusProgress() {
        return this.f57928z;
    }

    public float getOuterCircleRadiusProgress() {
        return this.f57927s;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f57926p.drawColor(ViewCompat.MEASURED_SIZE_MASK, PorterDuff.Mode.CLEAR);
        this.f57926p.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f57927s * ((float) this.f57919A), this.f57923f);
        this.f57926p.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f57928z * ((float) this.f57919A), this.f57924g);
        canvas.drawBitmap(this.f57925o, 0.0f, 0.0f, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f57919A = i / 2;
        this.f57925o = Bitmap.createBitmap(getWidth(), getWidth(), Bitmap.Config.ARGB_8888);
        this.f57926p = new Canvas(this.f57925o);
    }

    public void setInnerCircleRadiusProgress(float f) {
        this.f57928z = f;
        postInvalidate();
    }

    public void setOuterCircleRadiusProgress(float f) {
        this.f57927s = f;
        m82145c();
        postInvalidate();
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82144a();
    }
}
