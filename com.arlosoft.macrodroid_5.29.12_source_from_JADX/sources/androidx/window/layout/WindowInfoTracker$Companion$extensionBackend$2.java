package androidx.window.layout;

import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowInfoTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo71668d2 = {"<anonymous>", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "invoke"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: WindowInfoTracker.kt */
final class WindowInfoTracker$Companion$extensionBackend$2 extends C13708q implements C16254a<ExtensionWindowLayoutInfoBackend> {
    public static final WindowInfoTracker$Companion$extensionBackend$2 INSTANCE = new WindowInfoTracker$Companion$extensionBackend$2();

    WindowInfoTracker$Companion$extensionBackend$2() {
        super(0);
    }

    public final ExtensionWindowLayoutInfoBackend invoke() {
        WindowLayoutComponent windowLayoutComponent;
        try {
            ClassLoader classLoader = WindowInfoTracker.class.getClassLoader();
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = classLoader != null ? new SafeWindowLayoutComponentProvider(classLoader, new ConsumerAdapter(classLoader)) : null;
            if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                return null;
            }
            C13706o.m87928e(classLoader, "loader");
            return new ExtensionWindowLayoutInfoBackend(windowLayoutComponent, new ConsumerAdapter(classLoader));
        } catch (Throwable unused) {
            if (!WindowInfoTracker.Companion.DEBUG) {
                return null;
            }
            String unused2 = WindowInfoTracker.Companion.TAG;
            return null;
        }
    }
}
