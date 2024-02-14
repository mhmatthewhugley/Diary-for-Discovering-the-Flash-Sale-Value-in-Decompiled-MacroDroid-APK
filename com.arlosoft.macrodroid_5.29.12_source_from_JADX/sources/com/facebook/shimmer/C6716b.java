package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.shimmer.b */
/* compiled from: ShimmerDrawable */
public final class C6716b extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f15734a = new C6717a();

    /* renamed from: b */
    private final Paint f15735b;

    /* renamed from: c */
    private final Rect f15736c;

    /* renamed from: d */
    private final Matrix f15737d;
    @Nullable

    /* renamed from: e */
    private ValueAnimator f15738e;
    @Nullable

    /* renamed from: f */
    private C6712a f15739f;

    /* renamed from: com.facebook.shimmer.b$a */
    /* compiled from: ShimmerDrawable */
    class C6717a implements ValueAnimator.AnimatorUpdateListener {
        C6717a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6716b.this.invalidateSelf();
        }
    }

    public C6716b() {
        Paint paint = new Paint();
        this.f15735b = paint;
        this.f15736c = new Rect();
        this.f15737d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: c */
    private float m25457c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25458f() {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Rect r1 = r19.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.facebook.shimmer.a r3 = r0.f15739f
            if (r3 != 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            int r2 = r3.mo33133d(r2)
            com.facebook.shimmer.a r3 = r0.f15739f
            int r1 = r3.mo33130a(r1)
            com.facebook.shimmer.a r3 = r0.f15739f
            int r4 = r3.f15718g
            r5 = 1
            if (r4 == r5) goto L_0x004c
            int r3 = r3.f15715d
            r4 = 0
            if (r3 == r5) goto L_0x0032
            r6 = 3
            if (r3 != r6) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0035
            r2 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r4 = 0
            r5 = 0
            float r6 = (float) r2
            float r7 = (float) r1
            com.facebook.shimmer.a r1 = r0.f15739f
            int[] r8 = r1.f15713b
            float[] r9 = r1.f15712a
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0073
        L_0x004c:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r3 / r4
            float r3 = (float) r1
            float r14 = r3 / r4
            int r1 = java.lang.Math.max(r2, r1)
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 / r3
            float r15 = (float) r1
            com.facebook.shimmer.a r1 = r0.f15739f
            int[] r2 = r1.f15713b
            float[] r1 = r1.f15712a
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r12 = r11
            r16 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0073:
            android.graphics.Paint r1 = r0.f15735b
            r1.setShader(r11)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.C6716b.m25458f():void");
    }

    /* renamed from: g */
    private void m25459g() {
        boolean z;
        if (this.f15739f != null) {
            ValueAnimator valueAnimator = this.f15738e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.f15738e.cancel();
                this.f15738e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C6712a aVar = this.f15739f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (aVar.f15732u / aVar.f15731t)) + 1.0f});
            this.f15738e = ofFloat;
            ofFloat.setRepeatMode(this.f15739f.f15730s);
            this.f15738e.setRepeatCount(this.f15739f.f15729r);
            ValueAnimator valueAnimator2 = this.f15738e;
            C6712a aVar2 = this.f15739f;
            valueAnimator2.setDuration(aVar2.f15731t + aVar2.f15732u);
            this.f15738e.addUpdateListener(this.f15734a);
            if (z) {
                this.f15738e.start();
            }
        }
    }

    /* renamed from: a */
    public boolean mo33159a() {
        ValueAnimator valueAnimator = this.f15738e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33160b() {
        C6712a aVar;
        ValueAnimator valueAnimator = this.f15738e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f15739f) != null && aVar.f15727p && getCallback() != null) {
            this.f15738e.start();
        }
    }

    /* renamed from: d */
    public void mo33161d(@Nullable C6712a aVar) {
        this.f15739f = aVar;
        if (aVar != null) {
            this.f15735b.setXfermode(new PorterDuffXfermode(this.f15739f.f15728q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m25458f();
        m25459g();
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        float f;
        float c;
        if (this.f15739f != null && this.f15735b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f15739f.f15725n));
            float height = ((float) this.f15736c.height()) + (((float) this.f15736c.width()) * tan);
            float width = ((float) this.f15736c.width()) + (tan * ((float) this.f15736c.height()));
            ValueAnimator valueAnimator = this.f15738e;
            float f2 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f15739f.f15715d;
            if (i != 1) {
                if (i == 2) {
                    c = m25457c(width, -width, animatedFraction);
                } else if (i != 3) {
                    c = m25457c(-width, width, animatedFraction);
                } else {
                    f = m25457c(height, -height, animatedFraction);
                }
                f2 = c;
                f = 0.0f;
            } else {
                f = m25457c(-height, height, animatedFraction);
            }
            this.f15737d.reset();
            this.f15737d.setRotate(this.f15739f.f15725n, ((float) this.f15736c.width()) / 2.0f, ((float) this.f15736c.height()) / 2.0f);
            this.f15737d.postTranslate(f2, f);
            this.f15735b.getShader().setLocalMatrix(this.f15737d);
            canvas.drawRect(this.f15736c, this.f15735b);
        }
    }

    /* renamed from: e */
    public void mo33163e() {
        if (this.f15738e != null && mo33159a()) {
            this.f15738e.cancel();
        }
    }

    public int getOpacity() {
        C6712a aVar = this.f15739f;
        return (aVar == null || (!aVar.f15726o && !aVar.f15728q)) ? -1 : -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15736c.set(0, 0, rect.width(), rect.height());
        m25458f();
        mo33160b();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
