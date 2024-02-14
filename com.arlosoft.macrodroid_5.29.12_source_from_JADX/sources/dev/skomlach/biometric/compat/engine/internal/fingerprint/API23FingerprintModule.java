package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.utils.BiometricErrorLockoutPermanentFix;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.security.Signature;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/API23FingerprintModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Landroid/hardware/fingerprint/FingerprintManager;", "manager", "Landroid/hardware/fingerprint/FingerprintManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: API23FingerprintModule.kt */
public final class API23FingerprintModule extends AbstractBiometricModule {
    private FingerprintManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0017J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0017J\b\u0010\u000e\u001a\u00020\u0006H\u0017R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/API23FingerprintModule$AuthCallback;", "Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/fingerprint/API23FingerprintModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: API23FingerprintModule.kt */
    public final class AuthCallback extends FingerprintManager.AuthenticationCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public AuthCallback(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = API23FingerprintModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            C13706o.m87929f(charSequence, "errString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = API23FingerprintModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == 1) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 2) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 3) {
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                } else if (i == 4) {
                    authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                } else if (i == 7) {
                    API23FingerprintModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                } else if (i == 9) {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(API23FingerprintModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 11) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                } else if (i != 12) {
                    Core.INSTANCE.cancelAuthentication(API23FingerprintModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(API23FingerprintModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                }
                if (API23FingerprintModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    API23FingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            API23FingerprintModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, API23FingerprintModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, API23FingerprintModule.this.tag());
                }
                API23FingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = API23FingerprintModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, API23FingerprintModule.this.tag());
                    }
                    API23FingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    API23FingerprintModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, API23FingerprintModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C13706o.m87929f(charSequence, "helpString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = API23FingerprintModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            C13706o.m87929f(authenticationResult, "result");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = API23FingerprintModule.this.getName();
            FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = API23FingerprintModule.this.tag();
                    FingerprintManager.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                    Mac mac = null;
                    Signature signature = cryptoObject2 != null ? cryptoObject2.getSignature() : null;
                    FingerprintManager.CryptoObject cryptoObject3 = authenticationResult.getCryptoObject();
                    Cipher cipher = cryptoObject3 != null ? cryptoObject3.getCipher() : null;
                    FingerprintManager.CryptoObject cryptoObject4 = authenticationResult.getCryptoObject();
                    if (cryptoObject4 != null) {
                        mac = cryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    public API23FingerprintModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FINGERPRINT_API23);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.manager = (FingerprintManager) getContext().getSystemService(FingerprintManager.class);
            } catch (Throwable th) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
                }
            }
        }
        if (this.manager == null) {
            try {
                this.manager = (FingerprintManager) getContext().getSystemService("fingerprint");
            } catch (Throwable th2) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th2, getName());
                }
            }
        }
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject);
        FingerprintManager fingerprintManager = this.manager;
        if (fingerprintManager != null) {
            try {
                AuthCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                FingerprintManager.CryptoObject cryptoObject = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(biometricCryptoObject.getCipher());
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(biometricCryptoObject.getMac());
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(biometricCryptoObject.getSignature());
                        }
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject);
                    fingerprintManager.authenticate(cryptoObject, cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e());
                    return;
                }
                throw new IllegalArgumentException("CancellationSignal cann't be null");
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName() + ": authenticate failed unexpectedly");
            }
        }
        if (authenticationListener2 != null) {
            authenticationListener2.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
        }
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        FingerprintManager fingerprintManager = this.manager;
        if (fingerprintManager != null) {
            hashSet.add(fingerprintManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            FingerprintManager fingerprintManager = this.manager;
            if (fingerprintManager != null && fingerprintManager.isHardwareDetected()) {
                FingerprintManager fingerprintManager2 = this.manager;
                if (fingerprintManager2 != null && fingerprintManager2.hasEnrolledFingerprints()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isHardwarePresent() {
        try {
            FingerprintManager fingerprintManager = this.manager;
            return fingerprintManager != null && fingerprintManager.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
