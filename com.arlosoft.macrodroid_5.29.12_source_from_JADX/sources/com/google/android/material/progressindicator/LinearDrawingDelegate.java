package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    private float f49872c = 300.0f;

    /* renamed from: d */
    private float f49873d;

    /* renamed from: e */
    private float f49874e;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: a */
    public void mo58502a(@NonNull Canvas canvas, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f49872c = (float) clipBounds.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f49865a).f49813a;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f49865a).f49813a)) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f49865a).f49899i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f49866b.mo58540j() && ((LinearProgressIndicatorSpec) this.f49865a).f49817e == 1) || (this.f49866b.mo58538i() && ((LinearProgressIndicatorSpec) this.f49865a).f49818f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f49866b.mo58540j() || this.f49866b.mo58538i()) {
            canvas.translate(0.0f, (((float) ((LinearProgressIndicatorSpec) this.f49865a).f49813a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f49872c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f49865a;
        this.f49873d = ((float) ((LinearProgressIndicatorSpec) s).f49813a) * f;
        this.f49874e = ((float) ((LinearProgressIndicatorSpec) s).f49814b) * f;
    }

    /* renamed from: b */
    public void mo58503b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @ColorInt int i) {
        if (f != f2) {
            float f3 = this.f49872c;
            float f4 = this.f49874e;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f5 = this.f49873d;
            RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
            float f6 = this.f49874e;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58504c(@NonNull Canvas canvas, @NonNull Paint paint) {
        int a = MaterialColors.m68101a(((LinearProgressIndicatorSpec) this.f49865a).f49816d, this.f49866b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.f49872c;
        float f2 = this.f49873d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f49874e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* renamed from: d */
    public int mo58505d() {
        return ((LinearProgressIndicatorSpec) this.f49865a).f49813a;
    }

    /* renamed from: e */
    public int mo58506e() {
        return -1;
    }
}
