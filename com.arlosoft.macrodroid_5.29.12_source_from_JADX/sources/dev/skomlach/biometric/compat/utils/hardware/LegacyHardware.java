package dev.skomlach.biometric.compat.utils.hardware;

import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/LegacyHardware;", "Ldev/skomlach/biometric/compat/utils/hardware/AbstractHardware;", "Lja/u;", "updateBiometricEnrollChanged", "", "getAvailableBiometricsCount", "()I", "availableBiometricsCount", "", "isHardwareAvailable", "()Z", "isBiometricEnrolled", "isLockedOut", "isBiometricEnrollChanged", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "authRequest", "<init>", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: LegacyHardware.kt */
public final class LegacyHardware extends AbstractHardware {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyHardware(BiometricAuthRequest biometricAuthRequest) {
        super(biometricAuthRequest);
        C13706o.m87929f(biometricAuthRequest, "authRequest");
    }

    public final int getAvailableBiometricsCount() {
        int i = 0;
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            for (BiometricType availableBiometricModule : BiometricAuthentication.INSTANCE.getAvailableBiometrics()) {
                BiometricModule availableBiometricModule2 = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(availableBiometricModule);
                if (availableBiometricModule2 != null && availableBiometricModule2.isHardwarePresent() && availableBiometricModule2.hasEnrolled()) {
                    i++;
                }
            }
            return i;
        } else if (BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType()) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean isBiometricEnrollChanged() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return BiometricAuthentication.INSTANCE.isEnrollChanged();
        }
        BiometricModule availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType());
        return availableBiometricModule != null && availableBiometricModule.isBiometricEnrollChanged();
    }

    public boolean isBiometricEnrolled() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return BiometricAuthentication.INSTANCE.hasEnrolled();
        }
        BiometricModule availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType());
        return availableBiometricModule != null && availableBiometricModule.hasEnrolled();
    }

    public boolean isHardwareAvailable() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return BiometricAuthentication.INSTANCE.isHardwareDetected();
        }
        BiometricModule availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType());
        return availableBiometricModule != null && availableBiometricModule.isHardwarePresent();
    }

    public boolean isLockedOut() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return BiometricAuthentication.INSTANCE.isLockOut();
        }
        BiometricModule availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType());
        return availableBiometricModule != null && availableBiometricModule.isLockOut();
    }

    public void updateBiometricEnrollChanged() {
        BiometricModule availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(getBiometricAuthRequest().getType());
        AbstractBiometricModule abstractBiometricModule = availableBiometricModule instanceof AbstractBiometricModule ? (AbstractBiometricModule) availableBiometricModule : null;
        if (abstractBiometricModule != null) {
            abstractBiometricModule.updateBiometricEnrollChanged();
        }
    }
}
