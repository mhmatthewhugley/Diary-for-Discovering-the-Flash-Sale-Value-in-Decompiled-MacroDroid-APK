package p274h6;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.hanks.htextview.base.HTextView;
import java.util.ArrayList;
import java.util.List;
import p266g6.C12307b;
import p266g6.C12308c;
import p266g6.C12309d;
import p266g6.C12310e;

/* renamed from: h6.a */
/* compiled from: ScaleText */
public class C12375a extends C12310e {

    /* renamed from: n */
    float f59062n = 20.0f;

    /* renamed from: o */
    float f59063o = 400.0f;

    /* renamed from: p */
    private List<C12307b> f59064p = new ArrayList();

    /* renamed from: q */
    private long f59065q;

    /* renamed from: r */
    private ValueAnimator f59066r;

    /* renamed from: h6.a$a */
    /* compiled from: ScaleText */
    class C12376a extends C12309d {
        C12376a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (C12375a.this.f58991m != null) {
                C12375a.this.f58991m.mo68621a(C12375a.this.f58985g);
            }
        }
    }

    /* renamed from: h6.a$b */
    /* compiled from: ScaleText */
    class C12377b implements ValueAnimator.AnimatorUpdateListener {
        C12377b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = C12375a.this.f58988j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C12375a.this.f58985g.invalidate();
        }
    }

    /* renamed from: h6.a$c */
    /* compiled from: ScaleText */
    class C12378c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CharSequence f59069a;

        C12378c(CharSequence charSequence) {
            this.f59069a = charSequence;
        }

        public void run() {
            if (C12375a.this.f58985g != null && C12375a.this.f58985g.getLayout() != null) {
                C12375a aVar = C12375a.this;
                float unused = aVar.f58990l = aVar.f58985g.getLayout().getLineLeft(0);
                C12375a.super.mo68627c(this.f59069a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68625a(CharSequence charSequence) {
        this.f59064p.clear();
        this.f59064p.addAll(C12308c.m83010a(this.f58982d, this.f58981c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo68626b(CharSequence charSequence) {
        int length = this.f58981c.length();
        if (length <= 0) {
            length = 1;
        }
        float f = this.f59063o;
        this.f59065q = (long) (f + ((f / this.f59062n) * ((float) (length - 1))));
        this.f59066r.cancel();
        this.f59066r.setFloatValues(new float[]{0.0f, 1.0f});
        this.f59066r.setDuration(this.f59065q);
        this.f59066r.start();
    }

    /* renamed from: c */
    public void mo68627c(CharSequence charSequence) {
        HTextView hTextView = this.f58985g;
        if (hTextView != null && hTextView.getLayout() != null) {
            this.f58985g.post(new C12378c(charSequence));
        }
    }

    /* renamed from: d */
    public void mo68628d(Canvas canvas) {
        float f;
        String str;
        int i;
        float lineLeft = this.f58985g.getLayout().getLineLeft(0);
        float baseline = (float) this.f58985g.getBaseline();
        float f2 = this.f58990l;
        int max = Math.max(this.f58981c.length(), this.f58982d.length());
        float f3 = lineLeft;
        float f4 = f2;
        int i2 = 0;
        while (i2 < max) {
            if (i2 < this.f58982d.length()) {
                int c = C12308c.m83012c(i2, this.f59064p);
                if (c != -1) {
                    this.f58984f.setTextSize(this.f58989k);
                    this.f58984f.setAlpha(255);
                    float f5 = this.f58988j * 2.0f;
                    str = "";
                    float b = C12308c.m83011b(i2, c, f5 > 1.0f ? 1.0f : f5, lineLeft, this.f58990l, this.f58986h, this.f58987i);
                    f = lineLeft;
                    i = 255;
                    canvas.drawText(this.f58982d.charAt(i2) + str, 0, 1, b, baseline, this.f58984f);
                } else {
                    f = lineLeft;
                    str = "";
                    i = 255;
                    this.f58984f.setAlpha((int) ((1.0f - this.f58988j) * 255.0f));
                    this.f58984f.setTextSize(this.f58989k * (1.0f - this.f58988j));
                    TextPaint textPaint = this.f58984f;
                    float measureText = textPaint.measureText(this.f58982d.charAt(i2) + str);
                    canvas.drawText(this.f58982d.charAt(i2) + str, 0, 1, f4 + ((this.f58987i.get(i2).floatValue() - measureText) / 2.0f), baseline, this.f58984f);
                }
                f4 += this.f58987i.get(i2).floatValue();
            } else {
                f = lineLeft;
                str = "";
                i = 255;
            }
            if (i2 < this.f58981c.length()) {
                if (!C12308c.m83013d(i2, this.f59064p)) {
                    float f6 = this.f59063o;
                    float f7 = this.f58988j;
                    long j = this.f59065q;
                    float f8 = (float) i2;
                    float f9 = this.f59062n;
                    int i3 = (int) (((((float) j) * f7) - ((f6 * f8) / f9)) * (255.0f / f6));
                    if (i3 <= i) {
                        i = i3;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    float f10 = this.f58989k;
                    float f11 = ((1.0f * f10) / f6) * ((f7 * ((float) j)) - ((f6 * f8) / f9));
                    if (f11 <= f10) {
                        f10 = f11;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    this.f58983e.setAlpha(i);
                    this.f58983e.setTextSize(f10);
                    TextPaint textPaint2 = this.f58983e;
                    float measureText2 = textPaint2.measureText(this.f58981c.charAt(i2) + str);
                    canvas.drawText(this.f58981c.charAt(i2) + str, 0, 1, f3 + ((this.f58986h.get(i2).floatValue() - measureText2) / 2.0f), baseline, this.f58983e);
                }
                f3 += this.f58986h.get(i2).floatValue();
            }
            i2++;
            lineLeft = f;
        }
    }

    /* renamed from: e */
    public void mo68629e(HTextView hTextView, AttributeSet attributeSet, int i) {
        super.mo68629e(hTextView, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f59066r = valueAnimator;
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f59066r.addListener(new C12376a());
        this.f59066r.addUpdateListener(new C12377b());
        int length = this.f58981c.length();
        if (length <= 0) {
            length = 1;
        }
        float f = this.f59063o;
        this.f59065q = (long) (f + ((f / this.f59062n) * ((float) (length - 1))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68630f() {
    }
}
