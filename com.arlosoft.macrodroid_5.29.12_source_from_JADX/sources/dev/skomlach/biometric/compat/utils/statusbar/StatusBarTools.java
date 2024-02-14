package dev.skomlach.biometric.compat.utils.statusbar;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J,\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004R\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/statusbar/StatusBarTools;", "", "Landroid/view/Window;", "window", "", "c", "dividerColor", "Lja/u;", "setNavBarColor", "setStatusBarColor", "colorNavBar", "colorStatusBar", "setNavBarAndStatusBarColors", "", "TURNOFF_TINT", "Z", "translucentNavBar", "translucentStatusBar", "", "alpha", "F", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: StatusBarTools.kt */
public final class StatusBarTools {
    public static final StatusBarTools INSTANCE = new StatusBarTools();
    private static final boolean TURNOFF_TINT = false;
    private static final float alpha = 0.65f;
    private static final boolean translucentNavBar = false;
    private static final boolean translucentStatusBar = false;

    private StatusBarTools() {
    }

    /* access modifiers changed from: private */
    /* renamed from: setNavBarAndStatusBarColors$lambda-0  reason: not valid java name */
    public static final void m101368setNavBarAndStatusBarColors$lambda0(Window window, int i, int i2, int i3) {
        C13706o.m87929f(window, "$window");
        StatusBarTools statusBarTools = INSTANCE;
        statusBarTools.setStatusBarColor(window, i);
        statusBarTools.setNavBarColor(window, i2, i3);
    }

    private final void setNavBarColor(Window window, @ColorInt int i, @ColorInt int i2) {
        try {
            ColorUtil colorUtil = ColorUtil.INSTANCE;
            boolean isDark = colorUtil.isDark(i);
            boolean z = true;
            if (!StatusBarIconsDarkMode.INSTANCE.setDarkIconMode(window, !isDark, BarType.NAVBAR) && !isDark) {
                i = colorUtil.blend(i, ViewCompat.MEASURED_STATE_MASK, 0.6499999761581421d);
            }
            int i3 = Build.VERSION.SDK_INT;
            window.setNavigationBarColor(i);
            if (i3 >= 28) {
                window.setNavigationBarDividerColor(i2);
            }
            if (i3 >= 29) {
                if (colorUtil.colorDistance(i, 0) > 0.1d) {
                    z = false;
                }
                window.setNavigationBarContrastEnforced(z);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private final void setStatusBarColor(Window window, @ColorInt int i) {
        try {
            ColorUtil colorUtil = ColorUtil.INSTANCE;
            boolean isDark = colorUtil.isDark(i);
            boolean z = true;
            if (!StatusBarIconsDarkMode.INSTANCE.setDarkIconMode(window, !isDark, BarType.STATUSBAR) && !isDark) {
                i = colorUtil.blend(i, ViewCompat.MEASURED_STATE_MASK, 0.6499999761581421d);
            }
            int i2 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(i);
            if (i2 >= 29) {
                if (colorUtil.colorDistance(i, 0) > 0.1d) {
                    z = false;
                }
                window.setStatusBarContrastEnforced(z);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final void setNavBarAndStatusBarColors(Window window, @ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        C13706o.m87929f(window, "window");
        C12103a aVar = new C12103a(window, i3, i, i2);
        View decorView = window.getDecorView();
        C13706o.m87928e(decorView, "window.decorView");
        if (HelperTool.INSTANCE.isVisible(decorView, 100)) {
            decorView.post(aVar);
        } else {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new StatusBarTools$setNavBarAndStatusBarColors$1(decorView, aVar));
        }
    }
}
