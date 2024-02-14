package com.varunest.sparkbutton.helpers;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import p359p8.C16104a;

public class DotsView extends View {

    /* renamed from: H */
    public static final Property<DotsView, Float> f57929H = new C11904a(Float.class, "dotsProgress");

    /* renamed from: A */
    private float f57930A;

    /* renamed from: B */
    private float f57931B = 0.0f;

    /* renamed from: C */
    private float f57932C = 0.0f;

    /* renamed from: D */
    private float f57933D = 0.0f;

    /* renamed from: E */
    private float f57934E = 0.0f;

    /* renamed from: F */
    private float f57935F = 0.0f;

    /* renamed from: G */
    private ArgbEvaluator f57936G = new ArgbEvaluator();

    /* renamed from: a */
    private int f57937a = -16121;

    /* renamed from: c */
    private int f57938c = -26624;

    /* renamed from: d */
    private int f57939d = -43230;

    /* renamed from: f */
    private int f57940f = -769226;

    /* renamed from: g */
    private final Paint[] f57941g = new Paint[4];

    /* renamed from: o */
    private int f57942o;

    /* renamed from: p */
    private int f57943p;

    /* renamed from: s */
    private float f57944s;

    /* renamed from: z */
    private float f57945z;

    /* renamed from: com.varunest.sparkbutton.helpers.DotsView$a */
    static class C11904a extends Property<DotsView, Float> {
        C11904a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(DotsView dotsView) {
            return Float.valueOf(dotsView.getCurrentProgress());
        }

        /* renamed from: b */
        public void set(DotsView dotsView, Float f) {
            dotsView.setCurrentProgress(f.floatValue());
        }
    }

    public DotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82153c();
    }

    /* renamed from: a */
    private void m82151a(Canvas canvas) {
        int i = 0;
        while (i < 10) {
            double d = (((double) ((i * 36) - 10)) * 3.141592653589793d) / 180.0d;
            int cos = (int) (((double) this.f57942o) + (((double) this.f57935F) * Math.cos(d)));
            float f = this.f57934E;
            Paint[] paintArr = this.f57941g;
            i++;
            canvas.drawCircle((float) cos, (float) ((int) (((double) this.f57943p) + (((double) this.f57935F) * Math.sin(d)))), f, paintArr[i % paintArr.length]);
        }
    }

    /* renamed from: b */
    private void m82152b(Canvas canvas) {
        for (int i = 0; i < 10; i++) {
            double d = (((double) (i * 36)) * 3.141592653589793d) / 180.0d;
            float f = this.f57933D;
            Paint[] paintArr = this.f57941g;
            canvas.drawCircle((float) ((int) (((double) this.f57942o) + (((double) this.f57932C) * Math.cos(d)))), (float) ((int) (((double) this.f57943p) + (((double) this.f57932C) * Math.sin(d)))), f, paintArr[i % paintArr.length]);
        }
    }

    /* renamed from: c */
    private void m82153c() {
        this.f57930A = (float) C16104a.m96729c(getContext(), 4);
        int i = 0;
        while (true) {
            Paint[] paintArr = this.f57941g;
            if (i < paintArr.length) {
                paintArr[i] = new Paint();
                this.f57941g[i].setStyle(Paint.Style.FILL);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m82154e() {
        int d = (int) C16104a.m96730d((double) ((float) C16104a.m96727a((double) this.f57931B, 0.6000000238418579d, 1.0d)), 0.6000000238418579d, 1.0d, 255.0d, 0.0d);
        this.f57941g[0].setAlpha(d);
        this.f57941g[1].setAlpha(d);
        this.f57941g[2].setAlpha(d);
        this.f57941g[3].setAlpha(d);
    }

    /* renamed from: f */
    private void m82155f() {
        float f = this.f57931B;
        if (f < 0.5f) {
            float d = (float) C16104a.m96730d((double) f, 0.0d, 0.5d, 0.0d, 1.0d);
            this.f57941g[0].setColor(((Integer) this.f57936G.evaluate(d, Integer.valueOf(this.f57937a), Integer.valueOf(this.f57938c))).intValue());
            this.f57941g[1].setColor(((Integer) this.f57936G.evaluate(d, Integer.valueOf(this.f57938c), Integer.valueOf(this.f57939d))).intValue());
            this.f57941g[2].setColor(((Integer) this.f57936G.evaluate(d, Integer.valueOf(this.f57939d), Integer.valueOf(this.f57940f))).intValue());
            this.f57941g[3].setColor(((Integer) this.f57936G.evaluate(d, Integer.valueOf(this.f57940f), Integer.valueOf(this.f57937a))).intValue());
            return;
        }
        float d2 = (float) C16104a.m96730d((double) f, 0.5d, 1.0d, 0.0d, 1.0d);
        this.f57941g[0].setColor(((Integer) this.f57936G.evaluate(d2, Integer.valueOf(this.f57938c), Integer.valueOf(this.f57939d))).intValue());
        this.f57941g[1].setColor(((Integer) this.f57936G.evaluate(d2, Integer.valueOf(this.f57939d), Integer.valueOf(this.f57940f))).intValue());
        this.f57941g[2].setColor(((Integer) this.f57936G.evaluate(d2, Integer.valueOf(this.f57940f), Integer.valueOf(this.f57937a))).intValue());
        this.f57941g[3].setColor(((Integer) this.f57936G.evaluate(d2, Integer.valueOf(this.f57937a), Integer.valueOf(this.f57938c))).intValue());
    }

    /* renamed from: g */
    private void m82156g() {
        float f = this.f57931B;
        if (f < 0.3f) {
            this.f57935F = (float) C16104a.m96730d((double) f, 0.0d, 0.30000001192092896d, 0.0d, (double) this.f57945z);
        } else {
            this.f57935F = this.f57945z;
        }
        float f2 = this.f57931B;
        if (((double) f2) < 0.2d) {
            this.f57934E = this.f57930A;
        } else if (((double) f2) < 0.5d) {
            double d = (double) f2;
            float f3 = this.f57930A;
            this.f57934E = (float) C16104a.m96730d(d, 0.20000000298023224d, 0.5d, (double) f3, ((double) f3) * 0.3d);
        } else {
            this.f57934E = (float) C16104a.m96730d((double) f2, 0.5d, 1.0d, (double) (this.f57930A * 0.3f), 0.0d);
        }
    }

    /* renamed from: h */
    private void m82157h() {
        float f = this.f57931B;
        if (f < 0.3f) {
            this.f57932C = (float) C16104a.m96730d((double) f, 0.0d, 0.30000001192092896d, 0.0d, (double) (this.f57944s * 0.8f));
        } else {
            double d = (double) f;
            float f2 = this.f57944s;
            this.f57932C = (float) C16104a.m96730d(d, 0.30000001192092896d, 1.0d, (double) (0.8f * f2), (double) f2);
        }
        float f3 = this.f57931B;
        if (((double) f3) < 0.7d) {
            this.f57933D = this.f57930A;
        } else {
            this.f57933D = (float) C16104a.m96730d((double) f3, 0.699999988079071d, 1.0d, (double) this.f57930A, 0.0d);
        }
    }

    /* renamed from: d */
    public void mo67181d(int i, int i2) {
        this.f57937a = i;
        this.f57938c = C16104a.m96728b(i, 1.1f);
        this.f57940f = i2;
        this.f57939d = C16104a.m96728b(i2, 1.1f);
    }

    public float getCurrentProgress() {
        return this.f57931B;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m82152b(canvas);
        m82151a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.f57942o = i5;
        this.f57943p = i2 / 2;
        float f = ((float) i5) - (this.f57930A * 2.0f);
        this.f57944s = f;
        this.f57945z = f * 0.8f;
    }

    public void setCurrentProgress(float f) {
        this.f57931B = f;
        m82156g();
        m82157h();
        m82155f();
        m82154e();
        postInvalidate();
    }

    public void setMaxDotSize(int i) {
        this.f57930A = (float) i;
    }

    public DotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82153c();
    }
}
