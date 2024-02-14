package dev.skomlach.biometric.compat.engine;

import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "method", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "module", "Lja/u;", "initFinished", "onBiometricReady", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricInitListener.kt */
public interface BiometricInitListener {
    void initFinished(BiometricMethod biometricMethod, BiometricModule biometricModule);

    void onBiometricReady();
}
