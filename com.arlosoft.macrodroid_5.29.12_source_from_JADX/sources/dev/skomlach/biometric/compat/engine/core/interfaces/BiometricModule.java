package dev.skomlach.biometric.compat.engine.core.interfaces;

import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J0\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000f\u001a\u00020\u000eH&R\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "", "tag", "isManagerAccessible", "()Z", "isHardwarePresent", "isLockOut", "isBiometricEnrollChanged", "isUserAuthCanByUsedWithCrypto", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricModule.kt */
public interface BiometricModule {
    void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate);

    boolean hasEnrolled();

    boolean isBiometricEnrollChanged();

    boolean isHardwarePresent();

    boolean isLockOut();

    boolean isManagerAccessible();

    boolean isUserAuthCanByUsedWithCrypto();

    int tag();
}
