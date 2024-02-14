package androidx.window;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, mo71668d2 = {"Landroidx/window/WindowHelper;", "", "()V", "getCurrentWindowMetrics", "Landroid/graphics/Rect;", "mActivity", "Landroid/app/Activity;", "getMaximumWindowMetrics", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: WindowHelper.kt */
public final class WindowHelper {
    public static final WindowHelper INSTANCE = new WindowHelper();

    private WindowHelper() {
    }

    public final Rect getCurrentWindowMetrics(Activity activity) {
        C13706o.m87929f(activity, "mActivity");
        return WindowMetricsCalculator.Companion.getOrCreate().computeCurrentWindowMetrics(activity).getBounds();
    }

    public final Rect getMaximumWindowMetrics(Activity activity) {
        C13706o.m87929f(activity, "mActivity");
        return WindowMetricsCalculator.Companion.getOrCreate().computeMaximumWindowMetrics(activity).getBounds();
    }
}
