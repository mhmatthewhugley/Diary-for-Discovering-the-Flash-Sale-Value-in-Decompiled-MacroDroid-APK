package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001d\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, mo71668d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "()V", "translate", "Landroidx/window/layout/FoldingFeature;", "activity", "Landroid/app/Activity;", "oemFeature", "Landroidx/window/extensions/layout/FoldingFeature;", "translate$window_release", "Landroidx/window/layout/WindowLayoutInfo;", "info", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "validBounds", "", "bounds", "Landroidx/window/core/Bounds;", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(Activity activity, Bounds bounds) {
        Rect bounds2 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() < bounds2.width() && bounds.getHeight() < bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) {
            return false;
        }
        return true;
    }

    public final FoldingFeature translate$window_release(Activity activity, FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(foldingFeature, "oemFeature");
        int type2 = foldingFeature.getType();
        if (type2 == 1) {
            type = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else if (type2 != 2) {
            return null;
        } else {
            type = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = foldingFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else if (state2 != 2) {
            return null;
        } else {
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = foldingFeature.getBounds();
        C13706o.m87928e(bounds, "oemFeature.bounds");
        if (!validBounds(activity, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        C13706o.m87928e(bounds2, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds2), type, state);
    }

    public final WindowLayoutInfo translate$window_release(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        FoldingFeature foldingFeature;
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(windowLayoutInfo, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C13706o.m87928e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature2 : displayFeatures) {
            if (foldingFeature2 instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                C13706o.m87928e(foldingFeature2, "feature");
                foldingFeature = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, foldingFeature2);
            } else {
                foldingFeature = null;
            }
            if (foldingFeature != null) {
                arrayList.add(foldingFeature);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
