package com.arlosoft.macrodroid.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.e1 */
/* compiled from: ScreenShotHelper.kt */
public final class C6377e1 {

    /* renamed from: a */
    public static final C6377e1 f14969a = new C6377e1();

    private C6377e1() {
    }

    /* renamed from: a */
    public static final Bitmap m24623a(NestedScrollView nestedScrollView, String str, int i) {
        C13706o.m87929f(nestedScrollView, "scrollView");
        C13706o.m87929f(str, "name");
        float f = ((float) i) / 100.0f;
        int width = (int) (((float) nestedScrollView.getChildAt(0).getWidth()) * f);
        int height = ((int) (((float) nestedScrollView.getChildAt(0).getHeight()) * f)) + 50;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(nestedScrollView.getContext(), 2131100665));
        paint.setStyle(Paint.Style.STROKE);
        float f2 = (float) 1;
        canvas.drawRect(0.0f, 0.0f, ((float) width) - f2, ((float) height) - f2, paint);
        canvas.scale(f, f);
        canvas.save();
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(46.0f);
        canvas.drawText(TextUtils.ellipsize(str, textPaint, ((float) (width * 2)) - 40.0f, TextUtils.TruncateAt.END).toString(), 20.0f, 76.0f, textPaint);
        canvas.translate(0.0f, 100.0f);
        nestedScrollView.layout(0, 0, nestedScrollView.getLayoutParams().width, nestedScrollView.getLayoutParams().height);
        nestedScrollView.draw(canvas);
        canvas.restore();
        C13706o.m87928e(createBitmap, "bitmap");
        return createBitmap;
    }
}
