package p329me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.NonNull;

/* renamed from: me.zhanghai.android.materialprogressbar.HorizontalProgressBackgroundDrawable */
class HorizontalProgressBackgroundDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    public HorizontalProgressBackgroundDrawable(@NonNull Context context) {
        super(context);
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    public void setShowBackground(boolean z) {
        if (this.mShow != z) {
            this.mShow = z;
            invalidateSelf();
        }
    }
}
