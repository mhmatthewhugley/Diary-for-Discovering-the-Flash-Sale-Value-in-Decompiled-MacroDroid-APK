package p329me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* renamed from: me.zhanghai.android.materialprogressbar.SingleHorizontalProgressDrawable */
class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private boolean mShowBackground;

    public SingleHorizontalProgressDrawable(@NonNull Context context) {
        super(context);
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    /* access modifiers changed from: protected */
    public void onDrawRect(@NonNull Canvas canvas, @NonNull Paint paint) {
        int level = getLevel();
        if (level != 0) {
            int save = canvas.save();
            canvas.scale(((float) level) / 10000.0f, 1.0f, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, 0.0f);
            super.onDrawRect(canvas, paint);
            if (this.mShowBackground) {
                super.onDrawRect(canvas, paint);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(@IntRange(from = 0, mo610to = 10000) int i) {
        invalidateSelf();
        return true;
    }

    public void setShowBackground(boolean z) {
        if (this.mShowBackground != z) {
            this.mShowBackground = z;
            invalidateSelf();
        }
    }
}
