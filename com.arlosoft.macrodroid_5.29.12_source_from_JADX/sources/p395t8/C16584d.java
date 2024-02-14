package p395t8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: t8.d */
/* compiled from: FastBitmapDrawable */
public class C16584d extends Drawable {

    /* renamed from: a */
    private final Paint f67394a = new Paint(2);

    /* renamed from: b */
    private Bitmap f67395b;

    /* renamed from: c */
    private int f67396c = 255;

    /* renamed from: d */
    private int f67397d;

    /* renamed from: e */
    private int f67398e;

    public C16584d(Bitmap bitmap) {
        mo79419b(bitmap);
    }

    /* renamed from: a */
    public Bitmap mo79418a() {
        return this.f67395b;
    }

    /* renamed from: b */
    public void mo79419b(Bitmap bitmap) {
        this.f67395b = bitmap;
        if (bitmap != null) {
            this.f67397d = bitmap.getWidth();
            this.f67398e = this.f67395b.getHeight();
            return;
        }
        this.f67398e = 0;
        this.f67397d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f67395b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f67395b, (Rect) null, getBounds(), this.f67394a);
        }
    }

    public int getAlpha() {
        return this.f67396c;
    }

    public int getIntrinsicHeight() {
        return this.f67398e;
    }

    public int getIntrinsicWidth() {
        return this.f67397d;
    }

    public int getMinimumHeight() {
        return this.f67398e;
    }

    public int getMinimumWidth() {
        return this.f67397d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f67396c = i;
        this.f67394a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f67394a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.f67394a.setFilterBitmap(z);
    }
}
