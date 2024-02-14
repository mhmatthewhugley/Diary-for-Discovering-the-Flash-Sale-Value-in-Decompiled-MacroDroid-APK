package com.jaredrummler.android.colorpicker;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.jaredrummler.android.colorpicker.a */
/* compiled from: AlphaPatternDrawable */
class C11674a extends Drawable {

    /* renamed from: a */
    private int f57427a = 10;

    /* renamed from: b */
    private Paint f57428b = new Paint();

    /* renamed from: c */
    private Paint f57429c = new Paint();

    /* renamed from: d */
    private Paint f57430d = new Paint();

    /* renamed from: e */
    private int f57431e;

    /* renamed from: f */
    private int f57432f;

    /* renamed from: g */
    private Bitmap f57433g;

    C11674a(int i) {
        this.f57427a = i;
        this.f57429c.setColor(-1);
        this.f57430d.setColor(-3421237);
    }

    /* renamed from: a */
    private void m81786a() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.f57433g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f57433g);
            Rect rect = new Rect();
            boolean z = true;
            for (int i = 0; i <= this.f57432f; i++) {
                boolean z2 = z;
                for (int i2 = 0; i2 <= this.f57431e; i2++) {
                    int i3 = this.f57427a;
                    int i4 = i * i3;
                    rect.top = i4;
                    int i5 = i2 * i3;
                    rect.left = i5;
                    rect.bottom = i4 + i3;
                    rect.right = i5 + i3;
                    canvas.drawRect(rect, z2 ? this.f57429c : this.f57430d);
                    z2 = !z2;
                }
                z = !z;
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f57433g;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f57433g, (Rect) null, getBounds(), this.f57428b);
        }
    }

    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.f57431e = (int) Math.ceil((double) (rect.width() / this.f57427a));
        this.f57432f = (int) Math.ceil((double) (height / this.f57427a));
        m81786a();
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
