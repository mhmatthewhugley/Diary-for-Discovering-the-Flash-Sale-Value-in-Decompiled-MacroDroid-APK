package p222c8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;

/* renamed from: c8.a */
/* compiled from: ColorCircleDrawable */
public class C11159a extends Drawable {

    /* renamed from: a */
    private final Paint f54062a;

    /* renamed from: b */
    private int f54063b = 0;

    /* renamed from: c */
    private int f54064c = 0;

    /* renamed from: d */
    private final Paint f54065d;

    public C11159a(@ColorInt int i) {
        Paint paint = new Paint(1);
        this.f54062a = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(1);
        this.f54065d = paint2;
        paint2.setColor(C11160b.m74921b(i) ? -1 : ViewCompat.MEASURED_STATE_MASK);
        paint2.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo62348a(@ColorInt int i) {
        this.f54062a.setColor(i);
        this.f54065d.setColor(C11160b.m74921b(i) ? -1 : ViewCompat.MEASURED_STATE_MASK);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo62349b(int i) {
        this.f54065d.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo62350c(@ColorInt int i) {
        this.f54065d.setColor(i);
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo62351d(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f54064c = i;
        this.f54065d.setStrokeWidth((float) i);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.f54064c != 0) {
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (this.f54063b - this.f54064c), this.f54062a);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (this.f54063b - this.f54064c), this.f54065d);
            return;
        }
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) this.f54063b, this.f54062a);
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f54063b = Math.min(rect.width(), rect.height()) / 2;
    }

    public void setAlpha(int i) {
        this.f54062a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54062a.setColorFilter(colorFilter);
    }
}
