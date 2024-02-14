package androidx.window.layout;

import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u0002*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u0002*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, mo71668d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "", "canUseWindowLayoutComponent", "isWindowLayoutProviderValid", "isWindowExtensionsValid", "isFoldingFeatureValid", "isWindowLayoutComponentValid", "Lkotlin/Function0;", "block", "validate", "Ljava/lang/reflect/Method;", "Lxa/d;", "clazz", "doesReturn", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "loader", "Ljava/lang/ClassLoader;", "Landroidx/window/core/ConsumerAdapter;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "isPublic", "(Ljava/lang/reflect/Method;)Z", "getWindowExtensionsProviderClass", "()Ljava/lang/Class;", "windowExtensionsProviderClass", "getWindowExtensionsClass", "windowExtensionsClass", "getFoldingFeatureClass", "foldingFeatureClass", "getWindowLayoutComponentClass", "windowLayoutComponentClass", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "<init>", "(Ljava/lang/ClassLoader;Landroidx/window/core/ConsumerAdapter;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class SafeWindowLayoutComponentProvider {
    /* access modifiers changed from: private */
    public final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;

    public SafeWindowLayoutComponentProvider(ClassLoader classLoader, ConsumerAdapter consumerAdapter2) {
        C13706o.m87929f(classLoader, "loader");
        C13706o.m87929f(consumerAdapter2, "consumerAdapter");
        this.loader = classLoader;
        this.consumerAdapter = consumerAdapter2;
    }

    private final boolean canUseWindowLayoutComponent() {
        return isWindowLayoutProviderValid() && isWindowExtensionsValid() && isWindowLayoutComponentValid() && isFoldingFeatureValid();
    }

    /* access modifiers changed from: private */
    public final boolean doesReturn(Method method, C16875d<?> dVar) {
        return doesReturn(method, C16147a.m96968b(dVar));
    }

    /* access modifiers changed from: private */
    public final Class<?> getFoldingFeatureClass() {
        Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.layout.FoldingFeature");
        C13706o.m87928e(loadClass, "loader.loadClass(\"androi…s.layout.FoldingFeature\")");
        return loadClass;
    }

    /* access modifiers changed from: private */
    public final Class<?> getWindowExtensionsClass() {
        Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensions");
        C13706o.m87928e(loadClass, "loader.loadClass(\"androi…nsions.WindowExtensions\")");
        return loadClass;
    }

    /* access modifiers changed from: private */
    public final Class<?> getWindowExtensionsProviderClass() {
        Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        C13706o.m87928e(loadClass, "loader.loadClass(\"androi…indowExtensionsProvider\")");
        return loadClass;
    }

    /* access modifiers changed from: private */
    public final Class<?> getWindowLayoutComponentClass() {
        Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C13706o.m87928e(loadClass, "loader.loadClass(\"androi…t.WindowLayoutComponent\")");
        return loadClass;
    }

    private final boolean isFoldingFeatureValid() {
        return validate(new SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(this));
    }

    /* access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean isWindowExtensionsValid() {
        return validate(new SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(this));
    }

    private final boolean isWindowLayoutComponentValid() {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(this));
    }

    private final boolean isWindowLayoutProviderValid() {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(this));
    }

    private final boolean validate(C16254a<Boolean> aVar) {
        try {
            return aVar.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        if (canUseWindowLayoutComponent()) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                WindowLayoutComponent windowLayoutComponent = null;
                return null;
            }
        } else {
            WindowLayoutComponent windowLayoutComponent2 = null;
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }
}
