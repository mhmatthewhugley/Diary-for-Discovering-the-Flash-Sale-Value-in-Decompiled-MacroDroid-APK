package dev.skomlach.biometric.compat.utils.hardware;

import dev.skomlach.biometric.compat.BiometricAuthRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/AbstractHardware;", "Ldev/skomlach/biometric/compat/utils/hardware/HardwareInfo;", "biometricAuthRequest", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;)V", "getBiometricAuthRequest", "()Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "isBiometricEnrolled", "", "()Z", "isHardwareAvailable", "isLockedOut", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: AbstractHardware.kt */
public abstract class AbstractHardware implements HardwareInfo {
    private final BiometricAuthRequest biometricAuthRequest;

    public AbstractHardware(BiometricAuthRequest biometricAuthRequest2) {
        C13706o.m87929f(biometricAuthRequest2, "biometricAuthRequest");
        this.biometricAuthRequest = biometricAuthRequest2;
    }

    public final BiometricAuthRequest getBiometricAuthRequest() {
        return this.biometricAuthRequest;
    }

    public abstract boolean isBiometricEnrolled();

    public abstract boolean isHardwareAvailable();

    public abstract boolean isLockedOut();
}
