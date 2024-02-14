package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.device.DeviceInfo;
import dev.skomlach.biometric.compat.utils.device.DeviceInfoManager;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$Companion$init$2$1", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfoManager$OnDeviceInfoListener;", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "info", "Lja/u;", "onReady", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$Companion$init$2$1 implements DeviceInfoManager.OnDeviceInfoListener {
    BiometricPromptCompat$Companion$init$2$1() {
    }

    public void onReady(DeviceInfo deviceInfo) {
        BiometricPromptCompat.isDeviceInfoCheckInProgress.set(false);
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        BiometricPromptCompat.deviceInfo = deviceInfo;
    }
}
