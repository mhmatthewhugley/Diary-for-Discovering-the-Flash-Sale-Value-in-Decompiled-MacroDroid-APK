package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import androidx.core.p007os.CancellationSignal;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001d"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SoterFingerprintUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat;", "manager", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat;", "isManagerAccessible", "()Z", "isHardwarePresent", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SoterFingerprintUnlockModule.kt */
public final class SoterFingerprintUnlockModule extends AbstractBiometricModule {
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
    private final BiometricInitListener listener;
    private BiometricManagerCompat manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SoterFingerprintUnlockModule$AuthCallback;", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SoterFingerprintUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SoterFingerprintUnlockModule.kt */
    public final class AuthCallback extends BiometricManagerCompat.AuthenticationCallback {
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
            this.skipTimeout = SoterFingerprintUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            C13706o.m87929f(charSequence, "errString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFingerprintUnlockModule.this.getName();
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
                    SoterFingerprintUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                } else if (i == 9) {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(SoterFingerprintUnlockModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 11) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                } else if (i != 12) {
                    Core.INSTANCE.cancelAuthentication(SoterFingerprintUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(SoterFingerprintUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                }
                if (SoterFingerprintUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    SoterFingerprintUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            SoterFingerprintUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, SoterFingerprintUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, SoterFingerprintUnlockModule.this.tag());
                }
                SoterFingerprintUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFingerprintUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, SoterFingerprintUnlockModule.this.tag());
                    }
                    SoterFingerprintUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    SoterFingerprintUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, SoterFingerprintUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C13706o.m87929f(charSequence, "helpString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFingerprintUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(BiometricManagerCompat.AuthenticationResult authenticationResult) {
            C13706o.m87929f(authenticationResult, "result");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFingerprintUnlockModule.this.getName();
            BiometricManagerCompat.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = SoterFingerprintUnlockModule.this.tag();
                    BiometricManagerCompat.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                    Mac mac = null;
                    Signature signature = cryptoObject2 != null ? cryptoObject2.getSignature() : null;
                    BiometricManagerCompat.CryptoObject cryptoObject3 = authenticationResult.getCryptoObject();
                    Cipher cipher = cryptoObject3 != null ? cryptoObject3.getCipher() : null;
                    BiometricManagerCompat.CryptoObject cryptoObject4 = authenticationResult.getCryptoObject();
                    if (cryptoObject4 != null) {
                        mac = cryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SoterFingerprintUnlockModule$Companion;", "", "()V", "FINGERPRINT_ACQUIRED_GOOD", "", "FINGERPRINT_ACQUIRED_IMAGER_DIRTY", "FINGERPRINT_ACQUIRED_INSUFFICIENT", "FINGERPRINT_ACQUIRED_PARTIAL", "FINGERPRINT_ACQUIRED_TOO_FAST", "FINGERPRINT_ACQUIRED_TOO_SLOW", "FINGERPRINT_ERROR_CANCELED", "FINGERPRINT_ERROR_HW_NOT_PRESENT", "FINGERPRINT_ERROR_HW_UNAVAILABLE", "FINGERPRINT_ERROR_LOCKOUT", "FINGERPRINT_ERROR_LOCKOUT_PERMANENT", "FINGERPRINT_ERROR_NO_FINGERPRINTS", "FINGERPRINT_ERROR_NO_SPACE", "FINGERPRINT_ERROR_TIMEOUT", "FINGERPRINT_ERROR_UNABLE_TO_PROCESS", "FINGERPRINT_ERROR_USER_CANCELED", "FINGERPRINT_ERROR_VENDOR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SoterFingerprintUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public SoterFingerprintUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FINGERPRINT_SOTERAPI);
        BiometricManagerCompat biometricManagerCompat;
        this.listener = biometricInitListener;
        try {
            biometricManagerCompat = BiometricManagerCompat.from(getContext(), 1);
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            biometricManagerCompat = null;
        }
        this.manager = biometricManagerCompat;
        BiometricInitListener biometricInitListener2 = this.listener;
        if (biometricInitListener2 != null) {
            biometricInitListener2.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject);
        BiometricManagerCompat biometricManagerCompat = this.manager;
        if (biometricManagerCompat != null) {
            try {
                AuthCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                BiometricManagerCompat.CryptoObject cryptoObject = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getCipher());
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getMac());
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getSignature());
                        }
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject);
                    biometricManagerCompat.authenticate(cryptoObject, 0, cancellationSignal2, authCallback, C12114c.f58379a.mo68304e());
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
        return C13627z0.m87806d();
    }

    public boolean hasEnrolled() {
        try {
            BiometricManagerCompat biometricManagerCompat = this.manager;
            if (biometricManagerCompat != null && biometricManagerCompat.isHardwareDetected()) {
                BiometricManagerCompat biometricManagerCompat2 = this.manager;
                if (biometricManagerCompat2 != null && biometricManagerCompat2.hasEnrolledBiometric()) {
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
            BiometricManagerCompat biometricManagerCompat = this.manager;
            return biometricManagerCompat != null && biometricManagerCompat.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
