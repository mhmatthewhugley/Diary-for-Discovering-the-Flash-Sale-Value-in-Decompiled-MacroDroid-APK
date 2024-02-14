package dev.skomlach.biometric.compat.engine;

import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/BiometricAuthentication$init$initListener$1", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "method", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "module", "Lja/u;", "initFinished", "onBiometricReady", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricAuthentication.kt */
public final class BiometricAuthentication$init$initListener$1 implements BiometricInitListener {
    final /* synthetic */ AtomicInteger $counter;
    final /* synthetic */ BiometricInitListener $globalInitListener;

    BiometricAuthentication$init$initListener$1(AtomicInteger atomicInteger, BiometricInitListener biometricInitListener) {
        this.$counter = atomicInteger;
        this.$globalInitListener = biometricInitListener;
    }

    public void initFinished(BiometricMethod biometricMethod, BiometricModule biometricModule) {
        C13706o.m87929f(biometricMethod, "method");
        boolean z = biometricModule != null && biometricModule.isManagerAccessible() && biometricModule.isHardwarePresent();
        int decrementAndGet = this.$counter.decrementAndGet();
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        Object[] objArr = new Object[1];
        boolean z2 = biometricModule != null && biometricModule.isManagerAccessible();
        boolean z3 = biometricModule != null && biometricModule.isHardwarePresent();
        objArr[0] = "BiometricAuthenticationBiometricInitListener.initListener: '" + biometricMethod + "' hasManager: " + z2 + " hasHardware: " + z3 + " remains: " + decrementAndGet;
        biometricLoggerImpl.mo68217d(objArr);
        if (z) {
            Map access$getModuleHashMap$p = BiometricAuthentication.moduleHashMap;
            C13706o.m87928e(access$getModuleHashMap$p, "moduleHashMap");
            access$getModuleHashMap$p.put(biometricMethod, biometricModule);
        }
        BiometricInitListener biometricInitListener = this.$globalInitListener;
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(biometricMethod, biometricModule);
        }
        if (decrementAndGet == 0) {
            BiometricInitListener biometricInitListener2 = this.$globalInitListener;
            if (biometricInitListener2 != null) {
                biometricInitListener2.onBiometricReady();
            }
            biometricLoggerImpl.mo68217d("BiometricAuthenticationBiometricAuthentication ready");
        }
    }

    public void onBiometricReady() {
    }
}
