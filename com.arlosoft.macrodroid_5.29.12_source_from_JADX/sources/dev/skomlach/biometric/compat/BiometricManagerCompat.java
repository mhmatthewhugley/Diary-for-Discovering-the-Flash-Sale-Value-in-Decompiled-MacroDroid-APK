package dev.skomlach.biometric.compat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.utils.BiometricErrorLockoutPermanentFix;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.SensorPrivacyCheck;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12120d;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;
import p269g9.C12317a;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricManagerCompat;", "", "()V", "preferences", "Landroid/content/SharedPreferences;", "hasEnrolled", "", "api", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "isBiometricEnrollChanged", "isBiometricReady", "isBiometricReadyForEnroll", "isBiometricSensorPermanentlyLocked", "isCameraInUse", "biometricAuthRequest", "isCameraNotAvailable", "isHardwareDetected", "isLockOut", "openSettings", "activity", "Landroid/app/Activity;", "forced", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricManagerCompat.kt */
public final class BiometricManagerCompat {
    public static final BiometricManagerCompat INSTANCE = new BiometricManagerCompat();
    private static final SharedPreferences preferences = C12317a.f58995a.mo68640a("BiometricCompat_ManagerCompat");

    private BiometricManagerCompat() {
    }

    public static final boolean hasEnrolled(BiometricAuthRequest biometricAuthRequest) {
        C13706o.m87929f(biometricAuthRequest, "api");
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        boolean z = false;
        if (!companion.getAPI_ENABLED()) {
            return false;
        }
        if (!companion.isInit()) {
            BiometricLoggerImpl.INSTANCE.mo68220e("Please call BiometricPromptCompat.init(null);  first");
            SharedPreferences sharedPreferences = preferences;
            BiometricApi api = biometricAuthRequest.getApi();
            BiometricType type = biometricAuthRequest.getType();
            return sharedPreferences.getBoolean("hasEnrolled-" + api + HelpFormatter.DEFAULT_OPT_PREFIX + type, false);
        }
        if (biometricAuthRequest.getApi() != BiometricApi.AUTO) {
            z = HardwareAccessImpl.Companion.getInstance(biometricAuthRequest).isBiometricEnrolled();
        } else {
            HardwareAccessImpl.Companion companion2 = HardwareAccessImpl.Companion;
            if (companion2.getInstance(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isBiometricEnrolled() || companion2.getInstance(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isBiometricEnrolled()) {
                z = true;
            }
        }
        SharedPreferences.Editor edit = preferences.edit();
        BiometricApi api2 = biometricAuthRequest.getApi();
        BiometricType type2 = biometricAuthRequest.getType();
        edit.putBoolean("hasEnrolled-" + api2 + HelpFormatter.DEFAULT_OPT_PREFIX + type2, z).apply();
        return z;
    }

    public static /* synthetic */ boolean hasEnrolled$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return hasEnrolled(biometricAuthRequest);
    }

    public static final boolean isBiometricEnrollChanged(BiometricAuthRequest biometricAuthRequest) {
        C13706o.m87929f(biometricAuthRequest, "api");
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        boolean z = false;
        if (!companion.getAPI_ENABLED()) {
            return false;
        }
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68220e("NOTE!!! Be careful using 'isBiometricEnrollChanged' - due to technical limitations, it can return incorrect result in many cases");
        if (!companion.isInit()) {
            biometricLoggerImpl.mo68220e("Please call BiometricPromptCompat.init(null);  first");
            SharedPreferences sharedPreferences = preferences;
            BiometricApi api = biometricAuthRequest.getApi();
            BiometricType type = biometricAuthRequest.getType();
            return sharedPreferences.getBoolean("isBiometricEnrollChanged-" + api + HelpFormatter.DEFAULT_OPT_PREFIX + type, false);
        }
        if (biometricAuthRequest.getApi() != BiometricApi.AUTO) {
            z = HardwareAccessImpl.Companion.getInstance(biometricAuthRequest).isBiometricEnrollChanged();
        } else {
            HardwareAccessImpl.Companion companion2 = HardwareAccessImpl.Companion;
            if (companion2.getInstance(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isBiometricEnrollChanged() || companion2.getInstance(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isBiometricEnrollChanged()) {
                z = true;
            }
        }
        SharedPreferences.Editor edit = preferences.edit();
        BiometricApi api2 = biometricAuthRequest.getApi();
        BiometricType type2 = biometricAuthRequest.getType();
        edit.putBoolean("isBiometricEnrollChanged-" + api2 + HelpFormatter.DEFAULT_OPT_PREFIX + type2, z).apply();
        return z;
    }

    public static /* synthetic */ boolean isBiometricEnrollChanged$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isBiometricEnrollChanged(biometricAuthRequest);
    }

    public static final boolean isBiometricReady(BiometricAuthRequest biometricAuthRequest) {
        C13706o.m87929f(biometricAuthRequest, "api");
        return isHardwareDetected(biometricAuthRequest) && hasEnrolled(biometricAuthRequest) && !isLockOut(biometricAuthRequest) && !isBiometricSensorPermanentlyLocked(biometricAuthRequest);
    }

    public static /* synthetic */ boolean isBiometricReady$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isBiometricReady(biometricAuthRequest);
    }

    public static final boolean isBiometricReadyForEnroll(BiometricAuthRequest biometricAuthRequest) {
        C13706o.m87929f(biometricAuthRequest, "api");
        return isHardwareDetected(biometricAuthRequest) && !isLockOut(biometricAuthRequest) && !isBiometricSensorPermanentlyLocked(biometricAuthRequest);
    }

    public static /* synthetic */ boolean isBiometricReadyForEnroll$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isBiometricReadyForEnroll(biometricAuthRequest);
    }

    public static final boolean isBiometricSensorPermanentlyLocked(BiometricAuthRequest biometricAuthRequest) {
        boolean z;
        C13706o.m87929f(biometricAuthRequest, "api");
        if (!BiometricPromptCompat.Companion.getAPI_ENABLED()) {
            return false;
        }
        if (biometricAuthRequest.getApi() != BiometricApi.AUTO) {
            z = BiometricErrorLockoutPermanentFix.INSTANCE.isBiometricSensorPermanentlyLocked(biometricAuthRequest.getType());
        } else {
            int i = 0;
            int i2 = 0;
            for (BiometricType biometricType : BiometricType.values()) {
                BiometricAuthRequest biometricAuthRequest2 = new BiometricAuthRequest(BiometricApi.AUTO, biometricType, (BiometricConfirmation) null, 4, (C13695i) null);
                if (isHardwareDetected(biometricAuthRequest2) && hasEnrolled(biometricAuthRequest2)) {
                    i++;
                    if (BiometricErrorLockoutPermanentFix.INSTANCE.isBiometricSensorPermanentlyLocked(biometricType)) {
                        i2++;
                    }
                }
            }
            z = i > 0 && i == i2;
        }
        boolean isCameraNotAvailable = INSTANCE.isCameraNotAvailable(biometricAuthRequest);
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptManager. isBiometricSensorPermanentlyLocked - result=" + z + "; isCameraBlocked=" + isCameraNotAvailable);
        if (z || isCameraNotAvailable) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isBiometricSensorPermanentlyLocked$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isBiometricSensorPermanentlyLocked(biometricAuthRequest);
    }

    private final boolean isCameraInUse(BiometricAuthRequest biometricAuthRequest) {
        if (biometricAuthRequest.getType() == BiometricType.BIOMETRIC_FACE) {
            return SensorPrivacyCheck.INSTANCE.isCameraInUse();
        }
        if (biometricAuthRequest.getType() != BiometricType.BIOMETRIC_ANY) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (BiometricType biometricType : BiometricType.values()) {
            BiometricApi api = biometricAuthRequest.getApi();
            BiometricApi biometricApi = BiometricApi.AUTO;
            if ((api == biometricApi || biometricAuthRequest.getApi() == BiometricApi.BIOMETRIC_API) && isHardwareDetected(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricType, (BiometricConfirmation) null, 4, (C13695i) null))) {
                hashSet.add(biometricType);
            }
            if ((biometricAuthRequest.getApi() == biometricApi || biometricAuthRequest.getApi() == BiometricApi.LEGACY_API) && isHardwareDetected(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricType, (BiometricConfirmation) null, 4, (C13695i) null))) {
                hashSet.add(biometricType);
            }
        }
        if (hashSet.size() != 1 || !hashSet.contains(BiometricType.BIOMETRIC_FACE) || !SensorPrivacyCheck.INSTANCE.isCameraInUse()) {
            return false;
        }
        return true;
    }

    static /* synthetic */ boolean isCameraInUse$default(BiometricManagerCompat biometricManagerCompat, BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return biometricManagerCompat.isCameraInUse(biometricAuthRequest);
    }

    private final boolean isCameraNotAvailable(BiometricAuthRequest biometricAuthRequest) {
        if (biometricAuthRequest.getType() == BiometricType.BIOMETRIC_FACE) {
            return SensorPrivacyCheck.INSTANCE.isCameraBlocked();
        }
        if (biometricAuthRequest.getType() == BiometricType.BIOMETRIC_ANY) {
            HashSet hashSet = new HashSet();
            for (BiometricType biometricType : BiometricType.values()) {
                BiometricApi api = biometricAuthRequest.getApi();
                BiometricApi biometricApi = BiometricApi.AUTO;
                if ((api == biometricApi || biometricAuthRequest.getApi() == BiometricApi.BIOMETRIC_API) && isHardwareDetected(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricType, (BiometricConfirmation) null, 4, (C13695i) null))) {
                    hashSet.add(biometricType);
                }
                if ((biometricAuthRequest.getApi() == biometricApi || biometricAuthRequest.getApi() == BiometricApi.LEGACY_API) && isHardwareDetected(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricType, (BiometricConfirmation) null, 4, (C13695i) null))) {
                    hashSet.add(biometricType);
                }
            }
            if (hashSet.size() != 1 || !hashSet.contains(BiometricType.BIOMETRIC_FACE) || !SensorPrivacyCheck.INSTANCE.isCameraBlocked()) {
                return false;
            }
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean isCameraNotAvailable$default(BiometricManagerCompat biometricManagerCompat, BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return biometricManagerCompat.isCameraNotAvailable(biometricAuthRequest);
    }

    public static final boolean isHardwareDetected(BiometricAuthRequest biometricAuthRequest) {
        C13706o.m87929f(biometricAuthRequest, "api");
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        boolean z = false;
        if (!companion.getAPI_ENABLED()) {
            return false;
        }
        if (!companion.isInit()) {
            BiometricLoggerImpl.INSTANCE.mo68220e("Please call BiometricPromptCompat.init(null);  first");
            SharedPreferences sharedPreferences = preferences;
            BiometricApi api = biometricAuthRequest.getApi();
            BiometricType type = biometricAuthRequest.getType();
            return sharedPreferences.getBoolean("isHardwareDetected-" + api + HelpFormatter.DEFAULT_OPT_PREFIX + type, false);
        }
        if (biometricAuthRequest.getApi() != BiometricApi.AUTO) {
            z = HardwareAccessImpl.Companion.getInstance(biometricAuthRequest).isHardwareAvailable();
        } else {
            HardwareAccessImpl.Companion companion2 = HardwareAccessImpl.Companion;
            if (companion2.getInstance(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isHardwareAvailable() || companion2.getInstance(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isHardwareAvailable()) {
                z = true;
            }
        }
        SharedPreferences.Editor edit = preferences.edit();
        BiometricApi api2 = biometricAuthRequest.getApi();
        BiometricType type2 = biometricAuthRequest.getType();
        edit.putBoolean("isHardwareDetected-" + api2 + HelpFormatter.DEFAULT_OPT_PREFIX + type2, z).apply();
        return z;
    }

    public static /* synthetic */ boolean isHardwareDetected$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isHardwareDetected(biometricAuthRequest);
    }

    public static final boolean isLockOut(BiometricAuthRequest biometricAuthRequest) {
        boolean z;
        C13706o.m87929f(biometricAuthRequest, "api");
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        if (!companion.getAPI_ENABLED()) {
            return false;
        }
        if (!companion.isInit()) {
            BiometricLoggerImpl.INSTANCE.mo68220e("Please call BiometricPromptCompat.init(null);  first");
            if (!INSTANCE.isCameraInUse(biometricAuthRequest)) {
                SharedPreferences sharedPreferences = preferences;
                BiometricApi api = biometricAuthRequest.getApi();
                BiometricType type = biometricAuthRequest.getType();
                if (sharedPreferences.getBoolean("isLockOut-" + api + HelpFormatter.DEFAULT_OPT_PREFIX + type, false)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (biometricAuthRequest.getApi() != BiometricApi.AUTO) {
            z = HardwareAccessImpl.Companion.getInstance(biometricAuthRequest).isLockedOut();
        } else {
            HardwareAccessImpl.Companion companion2 = HardwareAccessImpl.Companion;
            z = companion2.getInstance(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isLockedOut() && companion2.getInstance(new BiometricAuthRequest(BiometricApi.LEGACY_API, biometricAuthRequest.getType(), (BiometricConfirmation) null, 4, (C13695i) null)).isLockedOut();
        }
        SharedPreferences.Editor edit = preferences.edit();
        BiometricApi api2 = biometricAuthRequest.getApi();
        BiometricType type2 = biometricAuthRequest.getType();
        edit.putBoolean("isLockOut-" + api2 + HelpFormatter.DEFAULT_OPT_PREFIX + type2, z).apply();
        if (z || INSTANCE.isCameraInUse(biometricAuthRequest)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isLockOut$default(BiometricAuthRequest biometricAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        return isLockOut(biometricAuthRequest);
    }

    public static final boolean openSettings(Activity activity, BiometricAuthRequest biometricAuthRequest, boolean z) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(biometricAuthRequest, "api");
        BiometricPromptCompat.Companion companion = BiometricPromptCompat.Companion;
        if (!companion.getAPI_ENABLED() || !isHardwareDetected(biometricAuthRequest) || isLockOut(biometricAuthRequest) || isBiometricSensorPermanentlyLocked(biometricAuthRequest)) {
            return false;
        }
        BiometricType biometricType = BiometricType.BIOMETRIC_ANY;
        if (biometricType != biometricAuthRequest.getType() && companion.isInit() && BiometricAuthentication.INSTANCE.openSettings(activity, biometricAuthRequest.getType())) {
            return true;
        }
        if (biometricType != biometricAuthRequest.getType() && !z) {
            return false;
        }
        C12120d dVar = C12120d.f58384a;
        if (dVar.mo68318e(new Intent("android.settings.SECURITY_SETTINGS"), activity)) {
            return true;
        }
        return dVar.mo68318e(new Intent("android.settings.SETTINGS"), activity);
    }

    public static /* synthetic */ boolean openSettings$default(Activity activity, BiometricAuthRequest biometricAuthRequest, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null);
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return openSettings(activity, biometricAuthRequest, z);
    }
}
