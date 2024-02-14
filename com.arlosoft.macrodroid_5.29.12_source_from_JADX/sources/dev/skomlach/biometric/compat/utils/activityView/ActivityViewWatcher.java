package dev.skomlach.biometric.compat.utils.activityView;

import android.view.View;
import android.view.ViewGroup;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher;", "", "Lja/u;", "setupListeners", "resetListeners", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "compatBuilder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "forceToCloseCallback", "Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "", "Landroid/view/View;", "views", "Ljava/util/List;", "activeView", "Landroid/view/View;", "Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring;", "windowForegroundBlurring", "Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring;", "Ldev/skomlach/biometric/compat/utils/activityView/WindowBackgroundBlurring;", "backgroundBlurs", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;)V", "ForceToCloseCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ActivityViewWatcher.kt */
public final class ActivityViewWatcher {
    private final View activeView;
    /* access modifiers changed from: private */
    public final List<WindowBackgroundBlurring> backgroundBlurs = new ArrayList();
    private final BiometricPromptCompat.Builder compatBuilder;
    /* access modifiers changed from: private */
    public final ForceToCloseCallback forceToCloseCallback;
    private final List<View> views;
    private final WindowForegroundBlurring windowForegroundBlurring;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "", "Lja/u;", "onCloseBiometric", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ActivityViewWatcher.kt */
    public interface ForceToCloseCallback {
        void onCloseBiometric();
    }

    public ActivityViewWatcher(BiometricPromptCompat.Builder builder, ForceToCloseCallback forceToCloseCallback2) {
        C13706o.m87929f(builder, "compatBuilder");
        C13706o.m87929f(forceToCloseCallback2, "forceToCloseCallback");
        this.compatBuilder = builder;
        this.forceToCloseCallback = forceToCloseCallback2;
        ActiveWindow activeWindow = ActiveWindow.INSTANCE;
        List<View> I0 = C13566b0.m87405I0(activeWindow.getActiveWindows(builder.getContext()));
        this.views = I0;
        View activeWindow2 = activeWindow.getActiveWindow(I0);
        this.activeView = activeWindow2;
        View findViewById = activeWindow2.findViewById(16908290);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        this.windowForegroundBlurring = new WindowForegroundBlurring(builder, (ViewGroup) findViewById, new ActivityViewWatcher$windowForegroundBlurring$1(this));
        I0.remove(activeWindow2);
        for (View findViewById2 : I0) {
            List<WindowBackgroundBlurring> list = this.backgroundBlurs;
            View findViewById3 = findViewById2.findViewById(16908290);
            C13706o.m87927d(findViewById3, "null cannot be cast to non-null type android.view.ViewGroup");
            list.add(new WindowBackgroundBlurring((ViewGroup) findViewById3));
        }
    }

    public final void resetListeners() {
        for (WindowBackgroundBlurring resetListeners : this.backgroundBlurs) {
            resetListeners.resetListeners();
        }
        this.windowForegroundBlurring.resetListeners();
    }

    public final void setupListeners() {
        for (WindowBackgroundBlurring windowBackgroundBlurring : this.backgroundBlurs) {
            windowBackgroundBlurring.setupListeners();
        }
        this.windowForegroundBlurring.setupListeners();
    }
}
