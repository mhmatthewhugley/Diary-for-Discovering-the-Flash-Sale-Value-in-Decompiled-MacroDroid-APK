package dev.skomlach.biometric.compat.utils.statusbar;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/statusbar/StatusBarIconsDarkMode;", "", "()V", "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR", "", "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR", "setDarkIconMode", "", "window", "Landroid/view/Window;", "lightBars", "type", "Ldev/skomlach/biometric/compat/utils/statusbar/BarType;", "setFlymeIconDarkMode", "setMiuiIconDarkMode", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: StatusBarIconsDarkMode.kt */
public final class StatusBarIconsDarkMode {
    public static final StatusBarIconsDarkMode INSTANCE = new StatusBarIconsDarkMode();
    private static int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

    static {
        int i = 8192;
        SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
        int i2 = 16;
        SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
        try {
            i = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt((Object) null);
        } catch (Exception unused) {
        }
        SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = i;
        try {
            i2 = View.class.getField("SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR").getInt((Object) null);
        } catch (Exception unused2) {
        }
        SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = i2;
    }

    private StatusBarIconsDarkMode() {
    }

    private final boolean setFlymeIconDarkMode(Window window, boolean z, BarType barType) {
        try {
            Field[] declaredFields = WindowManager.LayoutParams.class.getDeclaredFields();
            C13706o.m87928e(declaredFields, "allFields");
            for (Field field : declaredFields) {
                String name = field.getName();
                C13706o.m87928e(name, "name");
                if (C15177w.m93663N(name, "_DARK_", false, 2, (Object) null)) {
                    if (barType == BarType.STATUSBAR) {
                        Locale locale = Locale.ROOT;
                        C13706o.m87928e(locale, "ROOT");
                        String lowerCase = name.toLowerCase(locale);
                        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (!C15177w.m93663N(lowerCase, NotificationCompat.CATEGORY_STATUS, false, 2, (Object) null)) {
                        }
                    }
                    if (barType == BarType.NAVBAR) {
                        Locale locale2 = Locale.ROOT;
                        C13706o.m87928e(locale2, "ROOT");
                        String lowerCase2 = name.toLowerCase(locale2);
                        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        if (!C15177w.m93663N(lowerCase2, "nav", false, 2, (Object) null)) {
                        }
                    }
                    field.setAccessible(true);
                    return HelperTool.INSTANCE.setFlameFlag(window, z, field.getInt((Object) null));
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private final boolean setMiuiIconDarkMode(Window window, boolean z, BarType barType) {
        try {
            Field[] fields = Class.forName("android.view.MiuiWindowManager$LayoutParams").getFields();
            C13706o.m87928e(fields, "allFields");
            for (Field field : fields) {
                String name = field.getName();
                C13706o.m87928e(name, "name");
                if (C15177w.m93663N(name, "_DARK_", false, 2, (Object) null)) {
                    if (barType == BarType.STATUSBAR) {
                        Locale locale = Locale.ROOT;
                        C13706o.m87928e(locale, "ROOT");
                        String lowerCase = name.toLowerCase(locale);
                        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (!C15177w.m93663N(lowerCase, NotificationCompat.CATEGORY_STATUS, false, 2, (Object) null)) {
                        }
                    }
                    if (barType == BarType.NAVBAR) {
                        Locale locale2 = Locale.ROOT;
                        C13706o.m87928e(locale2, "ROOT");
                        String lowerCase2 = name.toLowerCase(locale2);
                        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        if (!C15177w.m93663N(lowerCase2, "nav", false, 2, (Object) null)) {
                        }
                    }
                    return HelperTool.INSTANCE.setMIUIFlag(window, z, field.getInt((Object) null));
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final boolean setDarkIconMode(Window window, boolean z, BarType barType) {
        C13706o.m87929f(window, "window");
        C13706o.m87929f(barType, "type");
        int i = barType == BarType.STATUSBAR ? SYSTEM_UI_FLAG_LIGHT_STATUS_BAR : SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
        if ((Build.VERSION.SDK_INT < 23 || i == -1 || !HelperTool.INSTANCE.setUIVisibilityFlag(window, z, i)) && !setFlymeIconDarkMode(window, z, barType)) {
            return setMiuiIconDarkMode(window, z, barType);
        }
        return true;
    }
}
