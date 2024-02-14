package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;
import p433xa.C16875d;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SafeWindowLayoutComponentProvider.kt */
final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends C13708q implements C16254a<Boolean> {
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        super(0);
        this.this$0 = safeWindowLayoutComponentProvider;
    }

    public final Boolean invoke() {
        Class access$getFoldingFeatureClass = this.this$0.getFoldingFeatureClass();
        boolean z = false;
        Method method = access$getFoldingFeatureClass.getMethod("getBounds", new Class[0]);
        Method method2 = access$getFoldingFeatureClass.getMethod("getType", new Class[0]);
        Method method3 = access$getFoldingFeatureClass.getMethod("getState", new Class[0]);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.this$0;
        C13706o.m87928e(method, "getBoundsMethod");
        if (safeWindowLayoutComponentProvider.doesReturn(method, (C16875d<?>) C13687e0.m87868b(Rect.class)) && this.this$0.isPublic(method)) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = this.this$0;
            C13706o.m87928e(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (safeWindowLayoutComponentProvider2.doesReturn(method2, (C16875d<?>) C13687e0.m87868b(cls)) && this.this$0.isPublic(method2)) {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider3 = this.this$0;
                C13706o.m87928e(method3, "getStateMethod");
                if (safeWindowLayoutComponentProvider3.doesReturn(method3, (C16875d<?>) C13687e0.m87868b(cls)) && this.this$0.isPublic(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
