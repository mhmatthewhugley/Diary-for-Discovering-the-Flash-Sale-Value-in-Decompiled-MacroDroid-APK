package dev.skomlach.biometric.compat.utils.activityView;

import android.graphics.Bitmap;
import dev.skomlach.biometric.compat.utils.activityView.BlurUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$updateBackground$1$1", "Ldev/skomlach/biometric/compat/utils/activityView/BlurUtil$OnPublishListener;", "Landroid/graphics/Bitmap;", "originalBitmap", "blurredBitmap", "Lja/u;", "onBlurredScreenshot", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowForegroundBlurring.kt */
public final class WindowForegroundBlurring$updateBackground$1$1 implements BlurUtil.OnPublishListener {
    final /* synthetic */ WindowForegroundBlurring this$0;

    WindowForegroundBlurring$updateBackground$1$1(WindowForegroundBlurring windowForegroundBlurring) {
        this.this$0 = windowForegroundBlurring;
    }

    public void onBlurredScreenshot(Bitmap bitmap, Bitmap bitmap2) {
        C13706o.m87929f(bitmap, "originalBitmap");
        if (this.this$0.isAttached) {
            this.this$0.setDrawable(bitmap2);
            this.this$0.updateDefaultColor(bitmap);
        }
    }
}
