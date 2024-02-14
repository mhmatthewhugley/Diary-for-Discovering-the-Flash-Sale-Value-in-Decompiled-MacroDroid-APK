package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$Companion$startBiometricInit$1", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "method", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "module", "Lja/u;", "initFinished", "onBiometricReady", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$Companion$startBiometricInit$1 implements BiometricInitListener {
    BiometricPromptCompat$Companion$startBiometricInit$1() {
    }

    public void initFinished(BiometricMethod biometricMethod, BiometricModule biometricModule) {
        C13706o.m87929f(biometricMethod, "method");
    }

    public void onBiometricReady() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.init() - finished");
        BiometricPromptCompat.isBiometricInit.set(true);
        BiometricPromptCompat.initInProgress.set(false);
        BiometricAuthRequest biometricAuthRequest = new BiometricAuthRequest((BiometricApi) null, (BiometricType) null, (BiometricConfirmation) null, 7, (C13695i) null);
        if (BiometricManagerCompat.isHardwareDetected(biometricAuthRequest)) {
            BiometricPromptCompat.availableAuthRequests.add(biometricAuthRequest);
        }
        for (BiometricApi biometricApi : BiometricApi.values()) {
            for (BiometricType biometricType : BiometricType.values()) {
                if (biometricType != BiometricType.BIOMETRIC_ANY) {
                    BiometricAuthRequest biometricAuthRequest2 = new BiometricAuthRequest(biometricApi, biometricType, (BiometricConfirmation) null, 4, (C13695i) null);
                    if (BiometricManagerCompat.isHardwareDetected(biometricAuthRequest2)) {
                        BiometricPromptCompat.availableAuthRequests.add(biometricAuthRequest2);
                        BiometricManagerCompat.hasEnrolled(biometricAuthRequest2);
                        BiometricManagerCompat.isLockOut(biometricAuthRequest2);
                        BiometricManagerCompat.isBiometricEnrollChanged(biometricAuthRequest2);
                    }
                }
            }
        }
        for (Runnable runnable : BiometricPromptCompat.pendingTasks) {
            if (runnable != null) {
                C12114c.f58379a.mo68305g(runnable);
            }
        }
        BiometricPromptCompat.pendingTasks.clear();
    }
}
