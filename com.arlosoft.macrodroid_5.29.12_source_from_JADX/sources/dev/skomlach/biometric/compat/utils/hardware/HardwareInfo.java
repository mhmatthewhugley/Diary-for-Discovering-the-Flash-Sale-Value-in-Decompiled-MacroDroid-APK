package dev.skomlach.biometric.compat.utils.hardware;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0005\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/HardwareInfo;", "", "Lja/u;", "updateBiometricEnrollChanged", "", "isHardwareAvailable", "()Z", "isBiometricEnrolled", "isLockedOut", "isBiometricEnrollChanged", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HardwareInfo.kt */
public interface HardwareInfo {
    boolean isBiometricEnrollChanged();

    boolean isBiometricEnrolled();

    boolean isHardwareAvailable();

    boolean isLockedOut();

    void updateBiometricEnrollChanged();
}
