package dev.skomlach.biometric.compat.utils.activityView;

import android.view.View;
import com.android.p023dx.rop.code.RegisterSpec;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$attachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lja/u;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowForegroundBlurring.kt */
public final class WindowForegroundBlurring$attachStateChangeListener$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ WindowForegroundBlurring this$0;

    WindowForegroundBlurring$attachStateChangeListener$1(WindowForegroundBlurring windowForegroundBlurring) {
        this.this$0 = windowForegroundBlurring;
    }

    public void onViewAttachedToWindow(View view) {
        C13706o.m87929f(view, RegisterSpec.PREFIX);
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring$attachStateChangeListener$1.class.getName();
        biometricLoggerImpl.mo68217d(name + ".onViewAttachedToWindow");
    }

    public void onViewDetachedFromWindow(View view) {
        C13706o.m87929f(view, RegisterSpec.PREFIX);
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring$attachStateChangeListener$1.class.getName();
        biometricLoggerImpl.mo68217d(name + ".onViewDetachedFromWindow");
        this.this$0.resetListeners();
        this.this$0.forceToCloseCallback.onCloseBiometric();
    }
}
