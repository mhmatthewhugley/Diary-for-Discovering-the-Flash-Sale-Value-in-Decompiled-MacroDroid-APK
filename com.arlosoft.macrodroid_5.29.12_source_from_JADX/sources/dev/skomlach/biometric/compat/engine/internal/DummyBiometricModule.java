package dev.skomlach.biometric.compat.engine.internal;

import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p486z8.C17519a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/DummyBiometricModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DummyBiometricModule.kt */
public final class DummyBiometricModule extends AbstractBiometricModule {
    public DummyBiometricModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.DUMMY_BIOMETRIC);
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: authenticate$lambda-0  reason: not valid java name */
    public static final void m101302authenticate$lambda0(AuthenticationListener authenticationListener, DummyBiometricModule dummyBiometricModule) {
        C13706o.m87929f(dummyBiometricModule, "this$0");
        if (authenticationListener != null) {
            authenticationListener.onFailure(AuthenticationFailureReason.AUTHENTICATION_FAILED, dummyBiometricModule.getBiometricMethod().getId());
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        biometricLoggerImpl.mo68217d(name + ".authenticate - " + biometricMethod + "; Crypto=" + biometricCryptoObject);
        C12114c.f58379a.mo68306h(new C17519a(authenticationListener, this), 2500);
    }

    public Set<Object> getManagers() {
        return C13627z0.m87806d();
    }

    public boolean hasEnrolled() {
        return true;
    }

    public boolean isHardwarePresent() {
        return true;
    }

    public boolean isManagerAccessible() {
        return false;
    }
}
