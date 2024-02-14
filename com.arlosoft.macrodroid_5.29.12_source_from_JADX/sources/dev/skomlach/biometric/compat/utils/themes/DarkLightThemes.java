package dev.skomlach.biometric.compat.utils.themes;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.SettingsHelper;
import dev.skomlach.biometric.compat.utils.device.DeviceInfoManager;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12120d;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/themes/DarkLightThemes;", "", "()V", "getNightMode", "", "context", "Landroid/content/Context;", "shouldInscreenCaseAffected", "", "getNightModeCompatWithInscreen", "isNightMode", "isNightModeCompatWithInscreen", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: DarkLightThemes.kt */
public final class DarkLightThemes {
    public static final DarkLightThemes INSTANCE = new DarkLightThemes();

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: DarkLightThemes.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DarkThemeCheckResult.values().length];
            iArr[DarkThemeCheckResult.DARK.ordinal()] = 1;
            iArr[DarkThemeCheckResult.LIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DarkLightThemes() {
    }

    public static /* synthetic */ int getNightMode$default(DarkLightThemes darkLightThemes, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return darkLightThemes.getNightMode(context, z);
    }

    public static /* synthetic */ boolean isNightMode$default(DarkLightThemes darkLightThemes, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return darkLightThemes.isNightMode(context, z);
    }

    public final int getNightMode(Context context, boolean z) {
        C13706o.m87929f(context, "context");
        if (z && DeviceInfoManager.INSTANCE.hasUnderDisplayFingerprint(BiometricPromptCompat.Companion.getDeviceInfo())) {
            return 2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[DarkLightThemeDetectionKt.getIsOsDarkTheme(context).ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            Configuration h = C12104a.f58372a.mo68284h();
            if (h != null && ((h.uiMode & 48) == 32 || (C12120d.f58384a.mo68315b() && h.isNightModeActive()))) {
                return 2;
            }
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            int i2 = SettingsHelper.INSTANCE.getInt(context, "ui_night_mode", 1);
            LocalTime localTime = null;
            if (i2 == 1) {
                int nightMode = uiModeManager != null ? uiModeManager.getNightMode() : 1;
                if (nightMode != 1) {
                    if (nightMode == 2) {
                        return 2;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        LocalTime customNightModeStart = uiModeManager != null ? uiModeManager.getCustomNightModeStart() : null;
                        if (uiModeManager != null) {
                            localTime = uiModeManager.getCustomNightModeEnd();
                        }
                        LocalTime now = LocalTime.now();
                        if (now.equals(customNightModeStart) || now.equals(localTime) || (now.isAfter(customNightModeStart) && now.isBefore(localTime))) {
                            return 2;
                        }
                    }
                }
            } else if (i2 == 2) {
                return 2;
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    LocalTime customNightModeStart2 = uiModeManager != null ? uiModeManager.getCustomNightModeStart() : null;
                    if (uiModeManager != null) {
                        localTime = uiModeManager.getCustomNightModeEnd();
                    }
                    LocalTime now2 = LocalTime.now();
                    if (!now2.isAfter(customNightModeStart2) || !now2.isBefore(localTime)) {
                        return 1;
                    }
                    return 2;
                }
            }
        }
        return 1;
    }

    public final int getNightModeCompatWithInscreen(Context context) {
        C13706o.m87929f(context, "context");
        return getNightMode(context, true);
    }

    public final boolean isNightMode(Context context, boolean z) {
        C13706o.m87929f(context, "context");
        return 2 == getNightMode(context, z);
    }

    public final boolean isNightModeCompatWithInscreen(Context context) {
        C13706o.m87929f(context, "context");
        return isNightMode(context, true);
    }
}
