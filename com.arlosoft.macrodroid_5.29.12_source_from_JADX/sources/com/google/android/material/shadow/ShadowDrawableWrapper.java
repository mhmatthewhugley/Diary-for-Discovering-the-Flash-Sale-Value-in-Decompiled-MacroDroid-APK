package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

@Deprecated
public class ShadowDrawableWrapper extends DrawableWrapper {

    /* renamed from: F */
    static final double f49945F = Math.cos(Math.toRadians(45.0d));

    /* renamed from: A */
    private final int f49946A;

    /* renamed from: B */
    private final int f49947B;

    /* renamed from: C */
    private final int f49948C;

    /* renamed from: D */
    private boolean f49949D;

    /* renamed from: E */
    private float f49950E;
    @NonNull

    /* renamed from: a */
    final Paint f49951a;
    @NonNull

    /* renamed from: c */
    final Paint f49952c;
    @NonNull

    /* renamed from: d */
    final RectF f49953d;

    /* renamed from: f */
    float f49954f;

    /* renamed from: g */
    Path f49955g;

    /* renamed from: o */
    float f49956o;

    /* renamed from: p */
    float f49957p;

    /* renamed from: s */
    float f49958s;

    /* renamed from: z */
    private boolean f49959z;

    /* renamed from: a */
    private void m69157a(@NonNull Rect rect) {
        float f = this.f49956o;
        float f2 = 1.5f * f;
        this.f49953d.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f49953d;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m69158b();
    }

    /* renamed from: b */
    private void m69158b() {
        float f = this.f49954f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f49957p;
        rectF2.inset(-f2, -f2);
        Path path = this.f49955g;
        if (path == null) {
            this.f49955g = new Path();
        } else {
            path.reset();
        }
        this.f49955g.setFillType(Path.FillType.EVEN_ODD);
        this.f49955g.moveTo(-this.f49954f, 0.0f);
        this.f49955g.rLineTo(-this.f49957p, 0.0f);
        this.f49955g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f49955g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f49955g.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f49954f / f3;
            Paint paint = this.f49951a;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f49946A, this.f49947B, this.f49948C}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        this.f49952c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f49946A, this.f49947B, this.f49948C}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f49952c.setAntiAlias(false);
    }

    /* renamed from: c */
    public static float m69159c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f49945F) * ((double) f2))) : f;
    }

    /* renamed from: d */
    public static float m69160d(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f49945F) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: e */
    private void m69161e(@NonNull Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f49950E, this.f49953d.centerX(), this.f49953d.centerY());
        float f5 = this.f49954f;
        float f6 = (-f5) - this.f49957p;
        float f7 = f5 * 2.0f;
        boolean z = this.f49953d.width() - f7 > 0.0f;
        boolean z2 = this.f49953d.height() - f7 > 0.0f;
        float f8 = this.f49958s;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f49953d;
        canvas2.translate(rectF.left + f5, rectF.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f49955g, this.f49951a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f49953d.width() - f7, -this.f49954f, this.f49952c);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        RectF rectF2 = this.f49953d;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f49955g, this.f49951a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f49953d.width() - f7, (-this.f49954f) + this.f49957p, this.f49952c);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f49953d;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f49955g, this.f49951a);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f49953d.height() - f7, -this.f49954f, this.f49952c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f49953d;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f49955g, this.f49951a);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f49953d.height() - f7, -this.f49954f, this.f49952c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f49959z) {
            m69157a(getBounds());
            this.f49959z = false;
        }
        m69161e(canvas);
        super.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil((double) m69160d(this.f49956o, this.f49954f, this.f49949D));
        int ceil2 = (int) Math.ceil((double) m69159c(this.f49956o, this.f49954f, this.f49949D));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f49959z = true;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f49951a.setAlpha(i);
        this.f49952c.setAlpha(i);
    }
}
