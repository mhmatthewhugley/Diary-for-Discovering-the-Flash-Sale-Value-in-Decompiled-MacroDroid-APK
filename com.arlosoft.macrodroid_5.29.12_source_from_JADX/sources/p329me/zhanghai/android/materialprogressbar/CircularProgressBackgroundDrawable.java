package p329me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* renamed from: me.zhanghai.android.materialprogressbar.CircularProgressBackgroundDrawable */
class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    CircularProgressBackgroundDrawable() {
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    /* access modifiers changed from: protected */
    public void onDrawRing(@NonNull Canvas canvas, @NonNull Paint paint) {
        drawRing(canvas, paint, 0.0f, 360.0f);
    }

    public void setShowBackground(boolean z) {
        if (this.mShow != z) {
            this.mShow = z;
            invalidateSelf();
        }
    }
}
