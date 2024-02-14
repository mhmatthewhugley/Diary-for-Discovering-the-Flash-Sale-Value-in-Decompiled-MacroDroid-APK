package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ShadowRenderer {

    /* renamed from: i */
    private static final int[] f49960i = new int[3];

    /* renamed from: j */
    private static final float[] f49961j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f49962k = new int[4];

    /* renamed from: l */
    private static final float[] f49963l = {0.0f, 0.0f, 0.5f, 1.0f};
    @NonNull

    /* renamed from: a */
    private final Paint f49964a;
    @NonNull

    /* renamed from: b */
    private final Paint f49965b;
    @NonNull

    /* renamed from: c */
    private final Paint f49966c;

    /* renamed from: d */
    private int f49967d;

    /* renamed from: e */
    private int f49968e;

    /* renamed from: f */
    private int f49969f;

    /* renamed from: g */
    private final Path f49970g;

    /* renamed from: h */
    private Paint f49971h;

    public ShadowRenderer() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    public void mo58623a(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f49970g;
        if (z) {
            int[] iArr = f49962k;
            iArr[0] = 0;
            iArr[1] = this.f49969f;
            iArr[2] = this.f49968e;
            iArr[3] = this.f49967d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f49962k;
            iArr2[0] = 0;
            iArr2[1] = this.f49967d;
            iArr2[2] = this.f49968e;
            iArr2[3] = this.f49969f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f49963l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f49965b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f49962k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f49971h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f49965b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo58624b(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f49960i;
        iArr[0] = this.f49969f;
        iArr[1] = this.f49968e;
        iArr[2] = this.f49967d;
        Paint paint = this.f49966c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f49961j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f49966c);
        canvas.restore();
    }

    @NonNull
    /* renamed from: c */
    public Paint mo58625c() {
        return this.f49964a;
    }

    /* renamed from: d */
    public void mo58626d(int i) {
        this.f49967d = ColorUtils.setAlphaComponent(i, 68);
        this.f49968e = ColorUtils.setAlphaComponent(i, 20);
        this.f49969f = ColorUtils.setAlphaComponent(i, 0);
        this.f49964a.setColor(this.f49967d);
    }

    public ShadowRenderer(int i) {
        this.f49970g = new Path();
        this.f49971h = new Paint();
        this.f49964a = new Paint();
        mo58626d(i);
        this.f49971h.setColor(0);
        Paint paint = new Paint(4);
        this.f49965b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f49966c = new Paint(paint);
    }
}
