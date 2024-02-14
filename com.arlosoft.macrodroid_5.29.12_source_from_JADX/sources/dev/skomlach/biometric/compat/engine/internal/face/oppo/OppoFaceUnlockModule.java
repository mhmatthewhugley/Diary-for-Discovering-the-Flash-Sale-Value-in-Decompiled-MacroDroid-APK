package dev.skomlach.biometric.compat.engine.internal.face.oppo;

import android.hardware.biometrics.CryptoObject;
import android.hardware.face.OppoMirrorFaceManager;
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

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/oppo/OppoFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Landroid/hardware/face/OppoMirrorFaceManager;", "manager", "Landroid/hardware/face/OppoMirrorFaceManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: OppoFaceUnlockModule.kt */
public final class OppoFaceUnlockModule extends AbstractBiometricModule {
    public static final int BIOMETRIC_ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FACE_ACQUIRED_CAMERA_PREVIEW = 1001;
    public static final int FACE_ACQUIRED_DEPTH_TOO_NEARLY = 303;
    public static final int FACE_ACQUIRED_DOE_CHECK = 307;
    public static final int FACE_ACQUIRED_DOE_PRECHECK = 306;
    public static final int FACE_ACQUIRED_FACEDOE_IMAGE_READY = 308;
    public static final int FACE_ACQUIRED_FACE_OBSCURED = 19;
    public static final int FACE_ACQUIRED_GOOD = 0;
    public static final int FACE_ACQUIRED_HACKER = 104;
    public static final int FACE_ACQUIRED_INSUFFICIENT = 1;
    public static final int FACE_ACQUIRED_IR_HACKER = 305;
    public static final int FACE_ACQUIRED_IR_PATTERN = 304;
    public static final int FACE_ACQUIRED_MOUTH_OCCLUSION = 113;
    public static final int FACE_ACQUIRED_MULTI_FACE = 116;
    public static final int FACE_ACQUIRED_NOSE_OCCLUSION = 115;
    public static final int FACE_ACQUIRED_NOT_DETECTED = 11;
    public static final int FACE_ACQUIRED_NOT_FRONTAL_FACE = 114;
    public static final int FACE_ACQUIRED_NO_FACE = 101;
    public static final int FACE_ACQUIRED_NO_FOCUS = 112;
    public static final int FACE_ACQUIRED_PAN_TOO_EXTREME = 16;
    public static final int FACE_ACQUIRED_POOR_GAZE = 10;
    public static final int FACE_ACQUIRED_RECALIBRATE = 13;
    public static final int FACE_ACQUIRED_ROLL_TOO_EXTREME = 18;
    public static final int FACE_ACQUIRED_SENSOR_DIRTY = 21;
    public static final int FACE_ACQUIRED_START = 20;
    public static final int FACE_ACQUIRED_SWITCH_DEPTH = 302;
    public static final int FACE_ACQUIRED_SWITCH_IR = 301;
    public static final int FACE_ACQUIRED_TILT_TOO_EXTREME = 17;
    public static final int FACE_ACQUIRED_TOO_BRIGHT = 2;
    public static final int FACE_ACQUIRED_TOO_CLOSE = 4;
    public static final int FACE_ACQUIRED_TOO_DARK = 3;
    public static final int FACE_ACQUIRED_TOO_DIFFERENT = 14;
    public static final int FACE_ACQUIRED_TOO_FAR = 5;
    public static final int FACE_ACQUIRED_TOO_HIGH = 6;
    public static final int FACE_ACQUIRED_TOO_LEFT = 9;
    public static final int FACE_ACQUIRED_TOO_LOW = 7;
    public static final int FACE_ACQUIRED_TOO_MUCH_MOTION = 12;
    public static final int FACE_ACQUIRED_TOO_RIGHT = 8;
    public static final int FACE_ACQUIRED_TOO_SIMILAR = 15;
    public static final int FACE_ACQUIRED_VENDOR = 22;
    public static final int FACE_ACQUIRED_VENDOR_BASE = 1000;
    public static final int FACE_AUTHENTICATE_AUTO = 0;
    public static final int FACE_AUTHENTICATE_BY_FINGERPRINT = 3;
    public static final int FACE_AUTHENTICATE_BY_USER = 1;
    public static final int FACE_AUTHENTICATE_BY_USER_WITH_ANIM = 2;
    public static final int FACE_AUTHENTICATE_PAY = 4;
    public static final int FACE_ERROR_CAMERA_UNAVAILABLE = 0;
    public static final int FACE_ERROR_CANCELED = 5;
    public static final int FACE_ERROR_HW_NOT_PRESENT = 12;
    public static final int FACE_ERROR_HW_UNAVAILABLE = 1;
    public static final int FACE_ERROR_LOCKOUT = 7;
    public static final int FACE_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int FACE_ERROR_NEGATIVE_BUTTON = 13;
    public static final int FACE_ERROR_NOT_ENROLLED = 11;
    public static final int FACE_ERROR_NO_SPACE = 4;
    public static final int FACE_ERROR_TIMEOUT = 3;
    public static final int FACE_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FACE_ERROR_UNABLE_TO_REMOVE = 6;
    public static final int FACE_ERROR_USER_CANCELED = 10;
    public static final int FACE_ERROR_VENDOR = 8;
    public static final int FACE_ERROR_VENDOR_BASE = 1000;
    public static final String FACE_KEYGUARD_CANCELED_BY_SCREEN_OFF = "cancelRecognitionByScreenOff";
    public static final int FACE_WITH_EYES_CLOSED = 111;
    public static final int FEATURE_REQUIRE_ATTENTION = 1;
    public static final int FEATURE_REQUIRE_REQUIRE_DIVERSITY = 2;
    private OppoMirrorFaceManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/oppo/OppoFaceUnlockModule$AuthCallback;", "Landroid/hardware/face/OppoMirrorFaceManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Landroid/hardware/face/OppoMirrorFaceManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/oppo/OppoFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: OppoFaceUnlockModule.kt */
    public final class AuthCallback extends OppoMirrorFaceManager.AuthenticationCallback {
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
            this.skipTimeout = OppoFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = OppoFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                        } else if (i != 4) {
                            if (i == 7) {
                                OppoFaceUnlockModule.this.lockout();
                                authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                            } else if (i == 9) {
                                BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(OppoFaceUnlockModule.this.getBiometricMethod().getBiometricType());
                                authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                            } else if (i == 11) {
                                authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                            } else if (i != 12) {
                                Core.INSTANCE.cancelAuthentication(OppoFaceUnlockModule.this);
                                AuthenticationListener authenticationListener = this.listener;
                                if (authenticationListener != null) {
                                    authenticationListener.onCanceled(OppoFaceUnlockModule.this.tag());
                                    return;
                                }
                                return;
                            } else {
                                authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                            }
                        }
                    }
                    authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                } else {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                }
                if (OppoFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    OppoFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener2 = this.listener;
                    if (authenticationListener2 != null) {
                        authenticationListener2.onFailure(authenticationFailureReason, OppoFaceUnlockModule.this.tag());
                    }
                    OppoFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                    OppoFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, OppoFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = OppoFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, OppoFaceUnlockModule.this.tag());
                    }
                    OppoFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    OppoFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, OppoFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = OppoFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(OppoMirrorFaceManager.AuthenticationResult authenticationResult) {
            CryptoObject cryptoObject;
            CryptoObject cryptoObject2;
            CryptoObject cryptoObject3;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            Object[] objArr = new Object[1];
            String name = OppoFaceUnlockModule.this.getName();
            Mac mac = null;
            CryptoObject cryptoObject4 = authenticationResult != null ? authenticationResult.getCryptoObject() : null;
            objArr[0] = name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject4;
            biometricLoggerImpl.mo68217d(objArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = OppoFaceUnlockModule.this.tag();
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

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BXT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006F"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/oppo/OppoFaceUnlockModule$Companion;", "", "()V", "BIOMETRIC_ERROR_NO_DEVICE_CREDENTIAL", "", "FACE_ACQUIRED_CAMERA_PREVIEW", "FACE_ACQUIRED_DEPTH_TOO_NEARLY", "FACE_ACQUIRED_DOE_CHECK", "FACE_ACQUIRED_DOE_PRECHECK", "FACE_ACQUIRED_FACEDOE_IMAGE_READY", "FACE_ACQUIRED_FACE_OBSCURED", "FACE_ACQUIRED_GOOD", "FACE_ACQUIRED_HACKER", "FACE_ACQUIRED_INSUFFICIENT", "FACE_ACQUIRED_IR_HACKER", "FACE_ACQUIRED_IR_PATTERN", "FACE_ACQUIRED_MOUTH_OCCLUSION", "FACE_ACQUIRED_MULTI_FACE", "FACE_ACQUIRED_NOSE_OCCLUSION", "FACE_ACQUIRED_NOT_DETECTED", "FACE_ACQUIRED_NOT_FRONTAL_FACE", "FACE_ACQUIRED_NO_FACE", "FACE_ACQUIRED_NO_FOCUS", "FACE_ACQUIRED_PAN_TOO_EXTREME", "FACE_ACQUIRED_POOR_GAZE", "FACE_ACQUIRED_RECALIBRATE", "FACE_ACQUIRED_ROLL_TOO_EXTREME", "FACE_ACQUIRED_SENSOR_DIRTY", "FACE_ACQUIRED_START", "FACE_ACQUIRED_SWITCH_DEPTH", "FACE_ACQUIRED_SWITCH_IR", "FACE_ACQUIRED_TILT_TOO_EXTREME", "FACE_ACQUIRED_TOO_BRIGHT", "FACE_ACQUIRED_TOO_CLOSE", "FACE_ACQUIRED_TOO_DARK", "FACE_ACQUIRED_TOO_DIFFERENT", "FACE_ACQUIRED_TOO_FAR", "FACE_ACQUIRED_TOO_HIGH", "FACE_ACQUIRED_TOO_LEFT", "FACE_ACQUIRED_TOO_LOW", "FACE_ACQUIRED_TOO_MUCH_MOTION", "FACE_ACQUIRED_TOO_RIGHT", "FACE_ACQUIRED_TOO_SIMILAR", "FACE_ACQUIRED_VENDOR", "FACE_ACQUIRED_VENDOR_BASE", "FACE_AUTHENTICATE_AUTO", "FACE_AUTHENTICATE_BY_FINGERPRINT", "FACE_AUTHENTICATE_BY_USER", "FACE_AUTHENTICATE_BY_USER_WITH_ANIM", "FACE_AUTHENTICATE_PAY", "FACE_ERROR_CAMERA_UNAVAILABLE", "FACE_ERROR_CANCELED", "FACE_ERROR_HW_NOT_PRESENT", "FACE_ERROR_HW_UNAVAILABLE", "FACE_ERROR_LOCKOUT", "FACE_ERROR_LOCKOUT_PERMANENT", "FACE_ERROR_NEGATIVE_BUTTON", "FACE_ERROR_NOT_ENROLLED", "FACE_ERROR_NO_SPACE", "FACE_ERROR_TIMEOUT", "FACE_ERROR_UNABLE_TO_PROCESS", "FACE_ERROR_UNABLE_TO_REMOVE", "FACE_ERROR_USER_CANCELED", "FACE_ERROR_VENDOR", "FACE_ERROR_VENDOR_BASE", "FACE_KEYGUARD_CANCELED_BY_SCREEN_OFF", "", "FACE_WITH_EYES_CLOSED", "FEATURE_REQUIRE_ATTENTION", "FEATURE_REQUIRE_REQUIRE_DIVERSITY", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: OppoFaceUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public OppoFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_OPPO);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.manager = (OppoMirrorFaceManager) getContext().getSystemService(OppoMirrorFaceManager.class);
            } catch (Throwable th) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
                }
            }
        }
        if (this.manager == null) {
            try {
                this.manager = (OppoMirrorFaceManager) getContext().getSystemService("face");
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
        OppoMirrorFaceManager oppoMirrorFaceManager = this.manager;
        if (oppoMirrorFaceManager != null) {
            try {
                OppoMirrorFaceManager.AuthenticationCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
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
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject);
                    oppoMirrorFaceManager.authenticate(cryptoObject, cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e());
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
        OppoMirrorFaceManager oppoMirrorFaceManager = this.manager;
        if (oppoMirrorFaceManager != null) {
            hashSet.add(oppoMirrorFaceManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        Class<?> cls;
        Method[] methods;
        Method method;
        Object invoke;
        try {
            OppoMirrorFaceManager oppoMirrorFaceManager = this.manager;
            if (!(oppoMirrorFaceManager == null || (cls = oppoMirrorFaceManager.getClass()) == null || (methods = cls.getMethods()) == null)) {
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
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
        }
        BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) new RuntimeException("Unable to find 'hasEnrolled' method"));
        return false;
    }

    public boolean isHardwarePresent() {
        try {
            OppoMirrorFaceManager oppoMirrorFaceManager = this.manager;
            return oppoMirrorFaceManager != null && oppoMirrorFaceManager.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
