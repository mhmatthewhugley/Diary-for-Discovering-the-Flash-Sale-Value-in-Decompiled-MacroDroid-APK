package p329me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p329me.zhanghai.android.materialprogressbar.internal.AnimationScaleListDrawableCompat;

/* renamed from: me.zhanghai.android.materialprogressbar.AnimationScaleIndeterminateCircularProgressDrawable */
public class AnimationScaleIndeterminateCircularProgressDrawable extends AnimationScaleListDrawableCompat implements MaterialProgressDrawable, IntrinsicPaddingDrawable, TintableDrawable {
    public AnimationScaleIndeterminateCircularProgressDrawable(@NonNull Context context) {
        super(new Drawable[]{new StaticIndeterminateCircularProgressDrawable(context), new IndeterminateCircularProgressDrawable(context)});
    }

    @NonNull
    private IntrinsicPaddingDrawable getIntrinsicPaddingDrawable() {
        return (IntrinsicPaddingDrawable) getCurrent();
    }

    public boolean getUseIntrinsicPadding() {
        return getIntrinsicPaddingDrawable().getUseIntrinsicPadding();
    }

    public void setUseIntrinsicPadding(boolean z) {
        getIntrinsicPaddingDrawable().setUseIntrinsicPadding(z);
    }
}
