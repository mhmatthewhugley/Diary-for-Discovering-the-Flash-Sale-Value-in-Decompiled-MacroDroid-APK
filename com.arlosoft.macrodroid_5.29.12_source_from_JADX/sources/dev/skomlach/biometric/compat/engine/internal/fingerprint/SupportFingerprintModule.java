package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SupportFingerprintModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;", "managerCompat", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallbackCompat", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SupportFingerprintModule.kt */
public final class SupportFingerprintModule extends AbstractBiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
    public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
    public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
    public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
    public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
    public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
    public static final int FINGERPRINT_ERROR_CANCELED = 5;
    public static final int FINGERPRINT_ERROR_HW_NOT_PRESENT = 12;
    public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
    public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
    public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = 11;
    public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
    public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
    public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FINGERPRINT_ERROR_USER_CANCELED = 10;
    public static final int FINGERPRINT_ERROR_VENDOR = 8;
    private FingerprintManagerCompat managerCompat;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SupportFingerprintModule$AuthCallbackCompat;", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SupportFingerprintModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SupportFingerprintModule.kt */
    public final class AuthCallbackCompat extends FingerprintManagerCompat.AuthenticationCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public AuthCallbackCompat(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = SupportFingerprintModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            C13706o.m87929f(charSequence, "errString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SupportFingerprintModule.this.getName();
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
                    SupportFingerprintModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                } else if (i == 9) {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(SupportFingerprintModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 11) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                } else if (i != 12) {
                    Core.INSTANCE.cancelAuthentication(SupportFingerprintModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(SupportFingerprintModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                }
                if (SupportFingerprintModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    SupportFingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            SupportFingerprintModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, SupportFingerprintModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, SupportFingerprintModule.this.tag());
                }
                SupportFingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SupportFingerprintModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, SupportFingerprintModule.this.tag());
                    }
                    SupportFingerprintModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    SupportFingerprintModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, SupportFingerprintModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C13706o.m87929f(charSequence, "helpString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SupportFingerprintModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
            C13706o.m87929f(authenticationResult, "result");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SupportFingerprintModule.this.getName();
            FingerprintManagerCompat.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = SupportFingerprintModule.this.tag();
                    FingerprintManagerCompat.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                    Mac mac = null;
                    Signature signature = cryptoObject2 != null ? cryptoObject2.getSignature() : null;
                    FingerprintManagerCompat.CryptoObject cryptoObject3 = authenticationResult.getCryptoObject();
                    Cipher cipher = cryptoObject3 != null ? cryptoObject3.getCipher() : null;
                    FingerprintManagerCompat.CryptoObject cryptoObject4 = authenticationResult.getCryptoObject();
                    if (cryptoObject4 != null) {
                        mac = cryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SupportFingerprintModule$Companion;", "", "()V", "FINGERPRINT_ACQUIRED_GOOD", "", "FINGERPRINT_ACQUIRED_IMAGER_DIRTY", "FINGERPRINT_ACQUIRED_INSUFFICIENT", "FINGERPRINT_ACQUIRED_PARTIAL", "FINGERPRINT_ACQUIRED_TOO_FAST", "FINGERPRINT_ACQUIRED_TOO_SLOW", "FINGERPRINT_ERROR_CANCELED", "FINGERPRINT_ERROR_HW_NOT_PRESENT", "FINGERPRINT_ERROR_HW_UNAVAILABLE", "FINGERPRINT_ERROR_LOCKOUT", "FINGERPRINT_ERROR_LOCKOUT_PERMANENT", "FINGERPRINT_ERROR_NO_FINGERPRINTS", "FINGERPRINT_ERROR_NO_SPACE", "FINGERPRINT_ERROR_TIMEOUT", "FINGERPRINT_ERROR_UNABLE_TO_PROCESS", "FINGERPRINT_ERROR_USER_CANCELED", "FINGERPRINT_ERROR_VENDOR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SupportFingerprintModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public SupportFingerprintModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FINGERPRINT_SUPPORT);
        FingerprintManagerCompat fingerprintManagerCompat;
        try {
            fingerprintManagerCompat = FingerprintManagerCompat.from(getContext());
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            fingerprintManagerCompat = null;
        }
        this.managerCompat = fingerprintManagerCompat;
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
        FingerprintManagerCompat fingerprintManagerCompat = this.managerCompat;
        if (fingerprintManagerCompat != null) {
            try {
                AuthCallbackCompat authCallbackCompat = new AuthCallbackCompat(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                FingerprintManagerCompat.CryptoObject cryptoObject = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new FingerprintManagerCompat.CryptoObject(biometricCryptoObject.getCipher());
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new FingerprintManagerCompat.CryptoObject(biometricCryptoObject.getMac());
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new FingerprintManagerCompat.CryptoObject(biometricCryptoObject.getSignature());
                        }
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject);
                    fingerprintManagerCompat.authenticate(cryptoObject, 0, cancellationSignal, authCallbackCompat, C12114c.f58379a.mo68304e());
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

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[Catch:{ all -> 0x0082, all -> 0x0094 }, LOOP:0: B:7:0x0018->B:24:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[Catch:{ all -> 0x0082, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[Catch:{ all -> 0x0082, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b A[Catch:{ all -> 0x0082, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[SYNTHETIC, Splitter:B:34:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0089 A[Catch:{ all -> 0x0082, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[Catch:{ all -> 0x0082, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x005c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<java.lang.Object> getManagers() {
        /*
            r14 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            androidx.core.hardware.fingerprint.FingerprintManagerCompat r2 = r14.managerCompat     // Catch:{ all -> 0x0094 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0060
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0094 }
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0060
            int r5 = r2.length     // Catch:{ all -> 0x0094 }
            r6 = 0
        L_0x0018:
            if (r6 >= r5) goto L_0x0060
            r7 = r2[r6]     // Catch:{ all -> 0x0094 }
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ all -> 0x0094 }
            int r8 = r8.length     // Catch:{ all -> 0x0094 }
            if (r8 != r4) goto L_0x0059
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ all -> 0x0094 }
            r8 = r8[r3]     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            boolean r8 = kotlin.jvm.internal.C13706o.m87924a(r8, r9)     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0059
            java.lang.Class r8 = r7.getReturnType()     // Catch:{ all -> 0x0094 }
            java.lang.reflect.Method[] r8 = r8.getMethods()     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = "it.returnType.methods"
            kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ all -> 0x0094 }
            int r9 = r8.length     // Catch:{ all -> 0x0094 }
            r10 = 0
        L_0x0040:
            if (r10 >= r9) goto L_0x0054
            r11 = r8[r10]     // Catch:{ all -> 0x0094 }
            java.lang.String r12 = r11.getName()     // Catch:{ all -> 0x0094 }
            java.lang.String r13 = "isHardwareDetected"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0094 }
            if (r12 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            int r10 = r10 + 1
            goto L_0x0040
        L_0x0054:
            r11 = r1
        L_0x0055:
            if (r11 == 0) goto L_0x0059
            r8 = 1
            goto L_0x005a
        L_0x0059:
            r8 = 0
        L_0x005a:
            if (r8 == 0) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0060:
            r7 = r1
        L_0x0061:
            if (r7 == 0) goto L_0x0068
            boolean r2 = r7.isAccessible()     // Catch:{ all -> 0x0094 }
            goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            if (r2 != 0) goto L_0x0071
            if (r7 != 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r7.setAccessible(r4)     // Catch:{ all -> 0x0094 }
        L_0x0071:
            if (r7 == 0) goto L_0x0089
            androidx.core.hardware.fingerprint.FingerprintManagerCompat r5 = r14.managerCompat     // Catch:{ all -> 0x0082 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0082 }
            android.content.Context r6 = r14.getContext()     // Catch:{ all -> 0x0082 }
            r4[r3] = r6     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r7.invoke(r5, r4)     // Catch:{ all -> 0x0082 }
            goto L_0x008a
        L_0x0082:
            r4 = move-exception
            if (r2 != 0) goto L_0x0088
            r7.setAccessible(r3)     // Catch:{ all -> 0x0094 }
        L_0x0088:
            throw r4     // Catch:{ all -> 0x0094 }
        L_0x0089:
            r4 = r1
        L_0x008a:
            if (r2 != 0) goto L_0x0092
            if (r7 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r7.setAccessible(r3)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            r1 = r4
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            r0.add(r1)
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.fingerprint.SupportFingerprintModule.getManagers():java.util.Set");
    }

    public boolean hasEnrolled() {
        try {
            FingerprintManagerCompat fingerprintManagerCompat = this.managerCompat;
            if (fingerprintManagerCompat != null && fingerprintManagerCompat.isHardwareDetected()) {
                FingerprintManagerCompat fingerprintManagerCompat2 = this.managerCompat;
                if (fingerprintManagerCompat2 != null && fingerprintManagerCompat2.hasEnrolledFingerprints()) {
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
            FingerprintManagerCompat fingerprintManagerCompat = this.managerCompat;
            return fingerprintManagerCompat != null && fingerprintManagerCompat.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.managerCompat != null;
    }
}
