package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SafeWindowLayoutComponentProvider.kt */
final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends C13708q implements C16254a<Boolean> {
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        super(0);
        this.this$0 = safeWindowLayoutComponentProvider;
    }

    public final Boolean invoke() {
        boolean z = false;
        Method method = this.this$0.getWindowExtensionsClass().getMethod("getWindowLayoutComponent", new Class[0]);
        Class access$getWindowLayoutComponentClass = this.this$0.getWindowLayoutComponentClass();
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.this$0;
        C13706o.m87928e(method, "getWindowLayoutComponentMethod");
        if (safeWindowLayoutComponentProvider.isPublic(method) && this.this$0.doesReturn(method, (Class<?>) access$getWindowLayoutComponentClass)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
