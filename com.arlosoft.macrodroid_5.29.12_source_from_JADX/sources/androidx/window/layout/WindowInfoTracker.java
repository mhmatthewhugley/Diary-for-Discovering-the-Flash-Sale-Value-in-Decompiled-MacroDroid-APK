package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13321g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, mo71668d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/f;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Companion", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowInfoTracker.kt */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002XD¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u001a\u001a\u0004\u0018\u00010\u00138@X\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo71668d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "Lja/u;", "overrideDecorator", "reset", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "Landroidx/window/layout/WindowBackend;", "extensionBackend$delegate", "Lja/g;", "getExtensionBackend$window_release", "()Landroidx/window/layout/WindowBackend;", "getExtensionBackend$window_release$annotations", "()V", "extensionBackend", "<init>", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: WindowInfoTracker.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        /* access modifiers changed from: private */
        public static final boolean DEBUG = false;
        /* access modifiers changed from: private */
        public static final String TAG = C13687e0.m87868b(WindowInfoTracker.class).mo71944j();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;
        private static final C13321g<ExtensionWindowLayoutInfoBackend> extensionBackend$delegate = C13323i.m85669b(WindowInfoTracker$Companion$extensionBackend$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void getExtensionBackend$window_release$annotations() {
        }

        public final WindowBackend getExtensionBackend$window_release() {
            return extensionBackend$delegate.getValue();
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            C13706o.m87929f(context, "context");
            WindowBackend extensionBackend$window_release = getExtensionBackend$window_release();
            if (extensionBackend$window_release == null) {
                extensionBackend$window_release = SidecarWindowBackend.Companion.getInstance(context);
            }
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, extensionBackend$window_release));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
            C13706o.m87929f(windowInfoTrackerDecorator, "overridingDecorator");
            decorator = windowInfoTrackerDecorator;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }
    }

    C15285f<WindowLayoutInfo> windowLayoutInfo(Activity activity);
}
