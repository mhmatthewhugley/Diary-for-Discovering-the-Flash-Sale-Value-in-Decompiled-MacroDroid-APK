package dev.skomlach.biometric.compat.engine.internal.face.vivo;

import androidx.core.p007os.CancellationSignal;
import com.vivo.framework.facedetect.FaceDetectManager;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.security.Signature;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/vivo/VivoFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Lcom/vivo/framework/facedetect/FaceDetectManager;", "manager", "Lcom/vivo/framework/facedetect/FaceDetectManager;", "isUserAuthCanByUsedWithCrypto", "()Z", "isManagerAccessible", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: VivoFaceUnlockModule.kt */
public final class VivoFaceUnlockModule extends AbstractBiometricModule {
    private FaceDetectManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/vivo/VivoFaceUnlockModule$AuthCallback;", "Lcom/vivo/framework/facedetect/FaceDetectManager$FaceAuthenticationCallback;", "", "errorCode", "retry_times", "Lja/u;", "onFaceAuthenticationResult", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/vivo/VivoFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: VivoFaceUnlockModule.kt */
    public final class AuthCallback extends FaceDetectManager.FaceAuthenticationCallback {
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
            this.skipTimeout = VivoFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onFaceAuthenticationResult(int i, int i2) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = VivoFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onFaceAuthenticationResult: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + i2);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                if (i == 0) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        int tag = VivoFaceUnlockModule.this.tag();
                        BiometricCryptoObject biometricCryptoObject2 = this.biometricCryptoObject;
                        Mac mac = null;
                        Signature signature = biometricCryptoObject2 != null ? biometricCryptoObject2.getSignature() : null;
                        BiometricCryptoObject biometricCryptoObject3 = this.biometricCryptoObject;
                        Cipher cipher = biometricCryptoObject3 != null ? biometricCryptoObject3.getCipher() : null;
                        BiometricCryptoObject biometricCryptoObject4 = this.biometricCryptoObject;
                        if (biometricCryptoObject4 != null) {
                            mac = biometricCryptoObject4.getMac();
                        }
                        authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                        return;
                    }
                    return;
                }
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.UNKNOWN;
                if (i == -3) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == -2) {
                    authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                } else if (i == -1) {
                    authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                }
                if (VivoFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    VivoFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener2 = this.listener;
                    if (authenticationListener2 != null) {
                        authenticationListener2.onFailure(authenticationFailureReason, VivoFaceUnlockModule.this.tag());
                    }
                    VivoFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                    VivoFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, VivoFaceUnlockModule.this.tag());
                }
            }
        }
    }

    public VivoFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_VIVO);
        FaceDetectManager faceDetectManager;
        try {
            faceDetectManager = FaceDetectManager.getInstance();
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            faceDetectManager = null;
            FaceDetectManager faceDetectManager2 = null;
        }
        this.manager = faceDetectManager;
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        biometricLoggerImpl.mo68217d(name + ".authenticate - " + biometricMethod + "; Crypto=" + biometricCryptoObject);
        FaceDetectManager faceDetectManager = this.manager;
        if (faceDetectManager != null) {
            try {
                FaceDetectManager.FaceAuthenticationCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    faceDetectManager.startFaceUnlock(authCallback);
                    return;
                }
                throw new IllegalArgumentException("CancellationSignal cann't be null");
            } catch (Throwable th) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String name2 = getName();
                biometricLoggerImpl2.mo68219e(th, name2 + ": authenticate failed unexpectedly");
            }
        }
        if (authenticationListener != null) {
            authenticationListener.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
        }
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        FaceDetectManager faceDetectManager = this.manager;
        if (faceDetectManager != null) {
            hashSet.add(faceDetectManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            FaceDetectManager faceDetectManager = this.manager;
            if (faceDetectManager != null && faceDetectManager.isFaceUnlockEnable()) {
                FaceDetectManager faceDetectManager2 = this.manager;
                if (faceDetectManager2 != null && faceDetectManager2.hasFaceID()) {
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
            FaceDetectManager faceDetectManager = this.manager;
            return faceDetectManager != null && faceDetectManager.isFaceUnlockEnable();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return false;
    }
}
