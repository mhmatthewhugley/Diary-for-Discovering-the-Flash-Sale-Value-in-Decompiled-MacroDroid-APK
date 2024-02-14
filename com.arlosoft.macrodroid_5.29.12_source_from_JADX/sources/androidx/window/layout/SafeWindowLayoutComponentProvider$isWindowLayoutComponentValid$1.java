package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SafeWindowLayoutComponentProvider.kt */
final class SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 extends C13708q implements C16254a<Boolean> {
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        super(0);
        this.this$0 = safeWindowLayoutComponentProvider;
    }

    public final Boolean invoke() {
        Class<?> consumerClassOrNull$window_release = this.this$0.consumerAdapter.consumerClassOrNull$window_release();
        if (consumerClassOrNull$window_release == null) {
            return Boolean.FALSE;
        }
        Class access$getWindowLayoutComponentClass = this.this$0.getWindowLayoutComponentClass();
        boolean z = false;
        Method method = access$getWindowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, consumerClassOrNull$window_release});
        Method method2 = access$getWindowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", new Class[]{consumerClassOrNull$window_release});
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.this$0;
        C13706o.m87928e(method, "addListenerMethod");
        if (safeWindowLayoutComponentProvider.isPublic(method)) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = this.this$0;
            C13706o.m87928e(method2, "removeListenerMethod");
            if (safeWindowLayoutComponentProvider2.isPublic(method2)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
