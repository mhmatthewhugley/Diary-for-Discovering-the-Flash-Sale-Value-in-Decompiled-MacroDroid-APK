package dev.skomlach.biometric.compat.engine.internal.iris.android;

import android.hardware.biometrics.CryptoObject;
import android.hardware.iris.IrisManager;
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
import java.lang.reflect.Method;
import java.security.Signature;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0013\b\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J0\u0010\u0011\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001d"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/android/AndroidIrisUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Lja/u;", "verifyManager", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Landroid/hardware/iris/IrisManager;", "manager", "Landroid/hardware/iris/IrisManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: AndroidIrisUnlockModule.kt */
public final class AndroidIrisUnlockModule extends AbstractBiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int IRIS_ACQUIRED_DETECTED_ONE_EYE = 8;
    public static final int IRIS_ACQUIRED_DETECTED_TOO_MANY_EYES = 10;
    public static final int IRIS_ACQUIRED_DETECTED_TWO_EYE = 9;
    public static final int IRIS_ACQUIRED_EYES_CLOSED = 6;
    public static final int IRIS_ACQUIRED_EYES_PARTIALLY_OBSCURED = 7;
    public static final int IRIS_ACQUIRED_GOOD = 0;
    public static final int IRIS_ACQUIRED_INSUFFICIENT = 1;
    public static final int IRIS_ACQUIRED_TOO_BRIGHT = 2;
    public static final int IRIS_ACQUIRED_TOO_CLOSE = 4;
    public static final int IRIS_ACQUIRED_TOO_DARK = 3;
    public static final int IRIS_ACQUIRED_TOO_FAR = 5;
    public static final int IRIS_ACQUIRED_VENDOR = 11;
    public static final int IRIS_ACQUIRED_VENDOR_BASE = 1000;
    public static final int IRIS_ERROR_CANCELED = 5;
    public static final int IRIS_ERROR_HW_UNAVAILABLE = 1;
    public static final int IRIS_ERROR_LOCKOUT = 7;
    public static final int IRIS_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int IRIS_ERROR_NO_SPACE = 4;
    public static final int IRIS_ERROR_TIMEOUT = 3;
    public static final int IRIS_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int IRIS_ERROR_UNABLE_TO_REMOVE = 6;
    public static final int IRIS_ERROR_USER_CANCELED = 10;
    public static final int IRIS_ERROR_VENDOR = 8;
    public static final int IRIS_ERROR_VENDOR_BASE = 1000;
    private IrisManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/android/AndroidIrisUnlockModule$AuthCallback;", "Landroid/hardware/iris/IrisManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Landroid/hardware/iris/IrisManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/iris/android/AndroidIrisUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: AndroidIrisUnlockModule.kt */
    public final class AuthCallback extends IrisManager.AuthenticationCallback {
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
            this.skipTimeout = AndroidIrisUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidIrisUnlockModule.this.getName();
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
                    AndroidIrisUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                } else if (i != 9) {
                    Core.INSTANCE.cancelAuthentication(AndroidIrisUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(AndroidIrisUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(AndroidIrisUnlockModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                }
                if (AndroidIrisUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    AndroidIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            AndroidIrisUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, AndroidIrisUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, AndroidIrisUnlockModule.this.tag());
                }
                AndroidIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidIrisUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, AndroidIrisUnlockModule.this.tag());
                    }
                    AndroidIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    AndroidIrisUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, AndroidIrisUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidIrisUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(IrisManager.AuthenticationResult authenticationResult) {
            CryptoObject cryptoObject;
            CryptoObject cryptoObject2;
            CryptoObject cryptoObject3;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            Object[] objArr = new Object[1];
            String name = AndroidIrisUnlockModule.this.getName();
            Mac mac = null;
            CryptoObject cryptoObject4 = authenticationResult != null ? authenticationResult.getCryptoObject() : null;
            objArr[0] = name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject4;
            biometricLoggerImpl.mo68217d(objArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = AndroidIrisUnlockModule.this.tag();
                    Signature signature = (authenticationResult == null || (cryptoObject3 = authenticationResult.getCryptoObject()) == null) ? null : cryptoObject3.getSignature();
                    Cipher cipher = (authenticationResult == null || (cryptoObject2 = authenticationResult.getCryptoObject()) == null) ? null : cryptoObject2.getCipher();
                    if (!(authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null)) {
                        mac = cryptoObject.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/android/AndroidIrisUnlockModule$Companion;", "", "()V", "IRIS_ACQUIRED_DETECTED_ONE_EYE", "", "IRIS_ACQUIRED_DETECTED_TOO_MANY_EYES", "IRIS_ACQUIRED_DETECTED_TWO_EYE", "IRIS_ACQUIRED_EYES_CLOSED", "IRIS_ACQUIRED_EYES_PARTIALLY_OBSCURED", "IRIS_ACQUIRED_GOOD", "IRIS_ACQUIRED_INSUFFICIENT", "IRIS_ACQUIRED_TOO_BRIGHT", "IRIS_ACQUIRED_TOO_CLOSE", "IRIS_ACQUIRED_TOO_DARK", "IRIS_ACQUIRED_TOO_FAR", "IRIS_ACQUIRED_VENDOR", "IRIS_ACQUIRED_VENDOR_BASE", "IRIS_ERROR_CANCELED", "IRIS_ERROR_HW_UNAVAILABLE", "IRIS_ERROR_LOCKOUT", "IRIS_ERROR_LOCKOUT_PERMANENT", "IRIS_ERROR_NO_SPACE", "IRIS_ERROR_TIMEOUT", "IRIS_ERROR_UNABLE_TO_PROCESS", "IRIS_ERROR_UNABLE_TO_REMOVE", "IRIS_ERROR_USER_CANCELED", "IRIS_ERROR_VENDOR", "IRIS_ERROR_VENDOR_BASE", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: AndroidIrisUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public AndroidIrisUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.IRIS_ANDROIDAPI);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.manager = (IrisManager) getContext().getSystemService(IrisManager.class);
            } catch (Throwable th) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
                }
            }
        }
        if (this.manager == null) {
            try {
                this.manager = (IrisManager) getContext().getSystemService("iris");
            } catch (Throwable th2) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th2, getName());
                }
            }
        }
        verifyManager();
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(3:4|5|(10:7|(1:10)|11|12|(1:17)(1:16)|(1:19)|20|21|(1:26)(1:25)|(1:28)))|8|(0)|11|12|(0)(0)|(0)|(4:20|21|(0)(0)|(0))) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void verifyManager() {
        /*
            r13 = this;
            java.lang.Class<androidx.core.os.CancellationSignal> r0 = androidx.core.p007os.CancellationSignal.class
            android.hardware.iris.IrisManager r1 = r13.manager
            r2 = 0
            if (r1 == 0) goto L_0x0089
            r3 = 6
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 5
            r9 = 0
            java.lang.String r10 = "authenticate"
            if (r1 == 0) goto L_0x0035
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0035
            java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch:{ all -> 0x0039 }
            java.lang.Class<android.hardware.biometrics.CryptoObject> r12 = android.hardware.biometrics.CryptoObject.class
            r11[r9] = r12     // Catch:{ all -> 0x0039 }
            r11[r7] = r0     // Catch:{ all -> 0x0039 }
            java.lang.Class<android.hardware.iris.IrisManager$AuthenticationCallback> r12 = android.hardware.iris.IrisManager.AuthenticationCallback.class
            r11[r6] = r12     // Catch:{ all -> 0x0039 }
            java.lang.Class<android.os.Handler> r12 = android.os.Handler.class
            r11[r5] = r12     // Catch:{ all -> 0x0039 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0039 }
            r11[r4] = r12     // Catch:{ all -> 0x0039 }
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0039 }
            r11[r8] = r12     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Method r1 = r1.getMethod(r10, r11)     // Catch:{ all -> 0x0039 }
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            if (r1 == 0) goto L_0x0039
            return
        L_0x0039:
            android.hardware.iris.IrisManager r1 = r13.manager     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.hardware.biometrics.CryptoObject> r12 = android.hardware.biometrics.CryptoObject.class
            r11[r9] = r12     // Catch:{ all -> 0x0060 }
            r11[r7] = r0     // Catch:{ all -> 0x0060 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0060 }
            r11[r6] = r12     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.hardware.iris.IrisManager$AuthenticationCallback> r12 = android.hardware.iris.IrisManager.AuthenticationCallback.class
            r11[r5] = r12     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.os.Handler> r12 = android.os.Handler.class
            r11[r4] = r12     // Catch:{ all -> 0x0060 }
            java.lang.reflect.Method r1 = r1.getMethod(r10, r11)     // Catch:{ all -> 0x0060 }
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            if (r1 == 0) goto L_0x0060
            return
        L_0x0060:
            android.hardware.iris.IrisManager r1 = r13.manager     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0085
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0085
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0089 }
            java.lang.Class<android.hardware.biometrics.CryptoObject> r11 = android.hardware.biometrics.CryptoObject.class
            r3[r9] = r11     // Catch:{ all -> 0x0089 }
            r3[r7] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0089 }
            r3[r6] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class<android.hardware.iris.IrisManager$AuthenticationCallback> r6 = android.hardware.iris.IrisManager.AuthenticationCallback.class
            r3[r5] = r6     // Catch:{ all -> 0x0089 }
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r3[r4] = r5     // Catch:{ all -> 0x0089 }
            r3[r8] = r0     // Catch:{ all -> 0x0089 }
            java.lang.reflect.Method r0 = r1.getMethod(r10, r3)     // Catch:{ all -> 0x0089 }
            goto L_0x0086
        L_0x0085:
            r0 = r2
        L_0x0086:
            if (r0 == 0) goto L_0x0089
            return
        L_0x0089:
            r13.manager = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.iris.android.AndroidIrisUnlockModule.verifyManager():void");
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject2);
        IrisManager irisManager = this.manager;
        if (irisManager != null) {
            try {
                IrisManager.AuthenticationCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                CryptoObject cryptoObject = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new CryptoObject(biometricCryptoObject.getCipher());
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new CryptoObject(biometricCryptoObject.getMac());
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new CryptoObject(biometricCryptoObject.getSignature());
                        }
                    }
                    CryptoObject cryptoObject2 = cryptoObject;
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject2);
                    try {
                        irisManager.authenticate(cryptoObject2, cancellationSignal2, authCallback, C12114c.f58379a.mo68304e(), 0, true);
                        return;
                    } catch (Throwable unused) {
                        irisManager.authenticate(cryptoObject2, cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e(), 0);
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("CancellationSignal cann't be null");
                }
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
        IrisManager irisManager = this.manager;
        if (irisManager != null) {
            hashSet.add(irisManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        Class<?> cls;
        Method[] methods;
        Method method;
        Object invoke;
        try {
            IrisManager irisManager = this.manager;
            if (!(irisManager == null || (cls = irisManager.getClass()) == null || (methods = cls.getMethods()) == null)) {
                int length = methods.length;
                int i = 0;
                while (true) {
                    method = null;
                    if (i >= length) {
                        break;
                    }
                    Method method2 = methods[i];
                    String name = method2.getName();
                    C13706o.m87928e(name, "method.name");
                    if (C15176v.m93634I(name, "hasEnrolled", false, 2, (Object) null)) {
                        method = method2;
                        break;
                    }
                    i++;
                }
                if (!(method == null || (invoke = method.invoke(this.manager, new Object[0])) == null)) {
                    if (invoke instanceof Boolean) {
                        return ((Boolean) invoke).booleanValue();
                    }
                    throw new RuntimeException("Unexpected type - " + invoke);
                }
            }
        } catch (Throwable unused) {
        }
        BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) new RuntimeException("Unable to find 'hasEnrolled' method"));
        return false;
    }

    public boolean isHardwarePresent() {
        try {
            IrisManager irisManager = this.manager;
            return irisManager != null && irisManager.isHardwareDetected();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
