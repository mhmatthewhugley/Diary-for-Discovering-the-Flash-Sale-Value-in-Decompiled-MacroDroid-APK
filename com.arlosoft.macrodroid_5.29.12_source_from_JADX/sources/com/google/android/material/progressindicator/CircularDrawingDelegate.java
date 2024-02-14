package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    private int f49819c = 1;

    /* renamed from: d */
    private float f49820d;

    /* renamed from: e */
    private float f49821e;

    /* renamed from: f */
    private float f49822f;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: h */
    private void m68968h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f49822f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    private int m68969i() {
        S s = this.f49865a;
        return ((CircularProgressIndicatorSpec) s).f49839g + (((CircularProgressIndicatorSpec) s).f49840h * 2);
    }

    /* renamed from: a */
    public void mo58502a(@NonNull Canvas canvas, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        S s = this.f49865a;
        float f2 = (((float) ((CircularProgressIndicatorSpec) s).f49839g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f49840h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f49865a;
        this.f49819c = ((CircularProgressIndicatorSpec) s2).f49841i == 0 ? 1 : -1;
        this.f49820d = ((float) ((CircularProgressIndicatorSpec) s2).f49813a) * f;
        this.f49821e = ((float) ((CircularProgressIndicatorSpec) s2).f49814b) * f;
        this.f49822f = ((float) (((CircularProgressIndicatorSpec) s2).f49839g - ((CircularProgressIndicatorSpec) s2).f49813a)) / 2.0f;
        if ((this.f49866b.mo58540j() && ((CircularProgressIndicatorSpec) this.f49865a).f49817e == 2) || (this.f49866b.mo58538i() && ((CircularProgressIndicatorSpec) this.f49865a).f49818f == 1)) {
            this.f49822f += ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f49865a).f49813a)) / 2.0f;
        } else if ((this.f49866b.mo58540j() && ((CircularProgressIndicatorSpec) this.f49865a).f49817e == 1) || (this.f49866b.mo58538i() && ((CircularProgressIndicatorSpec) this.f49865a).f49818f == 2)) {
            this.f49822f -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f49865a).f49813a)) / 2.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo58503b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @ColorInt int i) {
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f49820d);
            int i2 = this.f49819c;
            float f3 = f * 360.0f * ((float) i2);
            float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * ((float) i2);
            float f5 = this.f49822f;
            canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
            if (this.f49821e > 0.0f && Math.abs(f4) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                m68968h(canvas2, paint3, this.f49820d, this.f49821e, f3);
                m68968h(canvas2, paint3, this.f49820d, this.f49821e, f3 + f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58504c(@NonNull Canvas canvas, @NonNull Paint paint) {
        int a = MaterialColors.m68101a(((CircularProgressIndicatorSpec) this.f49865a).f49816d, this.f49866b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f49820d);
        float f = this.f49822f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo58505d() {
        return m68969i();
    }

    /* renamed from: e */
    public int mo58506e() {
        return m68969i();
    }
}
