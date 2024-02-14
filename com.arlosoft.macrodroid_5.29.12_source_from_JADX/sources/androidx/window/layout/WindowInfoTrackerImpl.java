package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/f;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "Companion", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowInfoTrackerImpl.kt */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo71668d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl$Companion;", "", "()V", "BUFFER_CAPACITY", "", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: WindowInfoTrackerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        C13706o.m87929f(windowMetricsCalculator2, "windowMetricsCalculator");
        C13706o.m87929f(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public C15285f<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C13706o.m87929f(activity, "activity");
        return C15290h.m94119e(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (C13635d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
