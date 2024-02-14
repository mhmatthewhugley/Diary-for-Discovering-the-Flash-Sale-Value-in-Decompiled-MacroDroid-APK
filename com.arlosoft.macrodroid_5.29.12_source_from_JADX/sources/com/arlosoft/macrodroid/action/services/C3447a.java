package com.arlosoft.macrodroid.action.services;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.arlosoft.macrodroid.action.services.a */
/* compiled from: HUDView */
public class C3447a extends ViewGroup {

    /* renamed from: a */
    private final Paint f9184a;

    /* renamed from: c */
    private final String f9185c;

    /* renamed from: d */
    private final int f9186d;

    /* renamed from: f */
    private final DisplayMetrics f9187f;

    /* renamed from: g */
    private final Bitmap f9188g;

    public C3447a(Context context, String str, int i) {
        super(context);
        this.f9185c = str;
        this.f9186d = i;
        Paint paint = new Paint();
        this.f9184a = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(28.0f);
        paint.setARGB(255, 255, 0, 0);
        this.f9188g = BitmapFactory.decodeResource(getResources(), i);
        this.f9187f = context.getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = View.MeasureSpec.getSize(this.f9187f.widthPixels);
        Bitmap bitmap = this.f9188g;
        canvas.drawBitmap(bitmap, (float) ((size - bitmap.getWidth()) - 10), 10.0f, this.f9184a);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
