package dev.skomlach.biometric.compat.engine.internal.face.android;

import android.hardware.biometrics.CryptoObject;
import android.hardware.face.FaceManager;
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
import kotlin.jvm.internal.C13695i;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0013\b\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J0\u0010\u0011\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001d"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/android/AndroidFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Lja/u;", "verifyManager", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Landroid/hardware/face/FaceManager;", "manager", "Landroid/hardware/face/FaceManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "FaceManagerAuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: AndroidFaceUnlockModule.kt */
public final class AndroidFaceUnlockModule extends AbstractBiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FACE_ACQUIRED_DARK_GLASSES_DETECTED = 25;
    public static final int FACE_ACQUIRED_FACE_OBSCURED = 19;
    public static final int FACE_ACQUIRED_FIRST_FRAME_RECEIVED = 24;
    public static final int FACE_ACQUIRED_GOOD = 0;
    public static final int FACE_ACQUIRED_INSUFFICIENT = 1;
    public static final int FACE_ACQUIRED_MOUTH_COVERING_DETECTED = 26;
    public static final int FACE_ACQUIRED_NOT_DETECTED = 11;
    public static final int FACE_ACQUIRED_PAN_TOO_EXTREME = 16;
    public static final int FACE_ACQUIRED_POOR_GAZE = 10;
    public static final int FACE_ACQUIRED_RECALIBRATE = 13;
    public static final int FACE_ACQUIRED_ROLL_TOO_EXTREME = 18;
    public static final int FACE_ACQUIRED_SENSOR_DIRTY = 21;
    public static final int FACE_ACQUIRED_START = 20;
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
    public static final int FACE_ACQUIRED_UNKNOWN = 23;
    public static final int FACE_ACQUIRED_VENDOR = 22;
    public static final int FACE_ACQUIRED_VENDOR_BASE = 1000;
    public static final int FACE_ERROR_CANCELED = 5;
    public static final int FACE_ERROR_HW_NOT_PRESENT = 12;
    public static final int FACE_ERROR_HW_UNAVAILABLE = 1;
    public static final int FACE_ERROR_LOCKOUT = 7;
    public static final int FACE_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int FACE_ERROR_NEGATIVE_BUTTON = 13;
    public static final int FACE_ERROR_NOT_ENROLLED = 11;
    /* access modifiers changed from: private */
    public static int FACE_ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int FACE_ERROR_NO_SPACE = 4;
    /* access modifiers changed from: private */
    public static int FACE_ERROR_RE_ENROLL = 16;
    /* access modifiers changed from: private */
    public static int FACE_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int FACE_ERROR_TIMEOUT = 3;
    public static final int FACE_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FACE_ERROR_UNABLE_TO_REMOVE = 6;
    public static final int FACE_ERROR_UNKNOWN = 17;
    public static final int FACE_ERROR_USER_CANCELED = 10;
    public static final int FACE_ERROR_VENDOR = 8;
    public static final int FACE_ERROR_VENDOR_BASE = 1000;
    private FaceManager manager;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b6\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001a\u00100\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006:"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/android/AndroidFaceUnlockModule$Companion;", "", "()V", "FACE_ACQUIRED_DARK_GLASSES_DETECTED", "", "FACE_ACQUIRED_FACE_OBSCURED", "FACE_ACQUIRED_FIRST_FRAME_RECEIVED", "FACE_ACQUIRED_GOOD", "FACE_ACQUIRED_INSUFFICIENT", "FACE_ACQUIRED_MOUTH_COVERING_DETECTED", "FACE_ACQUIRED_NOT_DETECTED", "FACE_ACQUIRED_PAN_TOO_EXTREME", "FACE_ACQUIRED_POOR_GAZE", "FACE_ACQUIRED_RECALIBRATE", "FACE_ACQUIRED_ROLL_TOO_EXTREME", "FACE_ACQUIRED_SENSOR_DIRTY", "FACE_ACQUIRED_START", "FACE_ACQUIRED_TILT_TOO_EXTREME", "FACE_ACQUIRED_TOO_BRIGHT", "FACE_ACQUIRED_TOO_CLOSE", "FACE_ACQUIRED_TOO_DARK", "FACE_ACQUIRED_TOO_DIFFERENT", "FACE_ACQUIRED_TOO_FAR", "FACE_ACQUIRED_TOO_HIGH", "FACE_ACQUIRED_TOO_LEFT", "FACE_ACQUIRED_TOO_LOW", "FACE_ACQUIRED_TOO_MUCH_MOTION", "FACE_ACQUIRED_TOO_RIGHT", "FACE_ACQUIRED_TOO_SIMILAR", "FACE_ACQUIRED_UNKNOWN", "FACE_ACQUIRED_VENDOR", "FACE_ACQUIRED_VENDOR_BASE", "FACE_ERROR_CANCELED", "FACE_ERROR_HW_NOT_PRESENT", "FACE_ERROR_HW_UNAVAILABLE", "FACE_ERROR_LOCKOUT", "FACE_ERROR_LOCKOUT_PERMANENT", "FACE_ERROR_NEGATIVE_BUTTON", "FACE_ERROR_NOT_ENROLLED", "FACE_ERROR_NO_DEVICE_CREDENTIAL", "getFACE_ERROR_NO_DEVICE_CREDENTIAL", "()I", "setFACE_ERROR_NO_DEVICE_CREDENTIAL", "(I)V", "FACE_ERROR_NO_SPACE", "FACE_ERROR_RE_ENROLL", "getFACE_ERROR_RE_ENROLL", "setFACE_ERROR_RE_ENROLL", "FACE_ERROR_SECURITY_UPDATE_REQUIRED", "getFACE_ERROR_SECURITY_UPDATE_REQUIRED", "setFACE_ERROR_SECURITY_UPDATE_REQUIRED", "FACE_ERROR_TIMEOUT", "FACE_ERROR_UNABLE_TO_PROCESS", "FACE_ERROR_UNABLE_TO_REMOVE", "FACE_ERROR_UNKNOWN", "FACE_ERROR_USER_CANCELED", "FACE_ERROR_VENDOR", "FACE_ERROR_VENDOR_BASE", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: AndroidFaceUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final int getFACE_ERROR_NO_DEVICE_CREDENTIAL() {
            return AndroidFaceUnlockModule.FACE_ERROR_NO_DEVICE_CREDENTIAL;
        }

        public final int getFACE_ERROR_RE_ENROLL() {
            return AndroidFaceUnlockModule.FACE_ERROR_RE_ENROLL;
        }

        public final int getFACE_ERROR_SECURITY_UPDATE_REQUIRED() {
            return AndroidFaceUnlockModule.FACE_ERROR_SECURITY_UPDATE_REQUIRED;
        }

        public final void setFACE_ERROR_NO_DEVICE_CREDENTIAL(int i) {
            AndroidFaceUnlockModule.FACE_ERROR_NO_DEVICE_CREDENTIAL = i;
        }

        public final void setFACE_ERROR_RE_ENROLL(int i) {
            AndroidFaceUnlockModule.FACE_ERROR_RE_ENROLL = i;
        }

        public final void setFACE_ERROR_SECURITY_UPDATE_REQUIRED(int i) {
            AndroidFaceUnlockModule.FACE_ERROR_SECURITY_UPDATE_REQUIRED = i;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/android/AndroidFaceUnlockModule$FaceManagerAuthCallback;", "Landroid/hardware/face/FaceManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Landroid/hardware/face/FaceManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/android/AndroidFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: AndroidFaceUnlockModule.kt */
    public final class FaceManagerAuthCallback extends FaceManager.AuthenticationCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public FaceManagerAuthCallback(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = AndroidFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            boolean z;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == 11) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                } else if (i == 12) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                } else if (i == 1) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 9) {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(AndroidFaceUnlockModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else {
                    if (i == 2 || i == AndroidFaceUnlockModule.Companion.getFACE_ERROR_SECURITY_UPDATE_REQUIRED()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                    } else if (i == 4) {
                        authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                    } else if (i == 3) {
                        authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                    } else if (i == 7) {
                        AndroidFaceUnlockModule.this.lockout();
                        authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                    } else {
                        Core.INSTANCE.cancelAuthentication(AndroidFaceUnlockModule.this);
                        AuthenticationListener authenticationListener = this.listener;
                        if (authenticationListener != null) {
                            authenticationListener.onCanceled(AndroidFaceUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                if (AndroidFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    AndroidFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            AndroidFaceUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, AndroidFaceUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, AndroidFaceUnlockModule.this.tag());
                }
                AndroidFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, AndroidFaceUnlockModule.this.tag());
                    }
                    AndroidFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    AndroidFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, AndroidFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = AndroidFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(FaceManager.AuthenticationResult authenticationResult) {
            CryptoObject cryptoObject;
            CryptoObject cryptoObject2;
            CryptoObject cryptoObject3;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            Object[] objArr = new Object[1];
            String name = AndroidFaceUnlockModule.this.getName();
            Mac mac = null;
            CryptoObject cryptoObject4 = authenticationResult != null ? authenticationResult.getCryptoObject() : null;
            objArr[0] = name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject4;
            biometricLoggerImpl.mo68217d(objArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = AndroidFaceUnlockModule.this.tag();
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

    public AndroidFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_ANDROIDAPI);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.manager = (FaceManager) getContext().getSystemService(FaceManager.class);
            } catch (Throwable th) {
                if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
                }
            }
        }
        if (this.manager == null) {
            try {
                this.manager = (FaceManager) getContext().getSystemService("face");
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
            android.hardware.face.FaceManager r1 = r13.manager
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
            java.lang.Class<android.hardware.face.FaceManager$AuthenticationCallback> r12 = android.hardware.face.FaceManager.AuthenticationCallback.class
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
            android.hardware.face.FaceManager r1 = r13.manager     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.hardware.biometrics.CryptoObject> r12 = android.hardware.biometrics.CryptoObject.class
            r11[r9] = r12     // Catch:{ all -> 0x0060 }
            r11[r7] = r0     // Catch:{ all -> 0x0060 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0060 }
            r11[r6] = r12     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.hardware.face.FaceManager$AuthenticationCallback> r12 = android.hardware.face.FaceManager.AuthenticationCallback.class
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
            android.hardware.face.FaceManager r1 = r13.manager     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0085
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0085
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0089 }
            java.lang.Class<android.hardware.biometrics.CryptoObject> r11 = android.hardware.biometrics.CryptoObject.class
            r3[r9] = r11     // Catch:{ all -> 0x0089 }
            r3[r7] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0089 }
            r3[r6] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class<android.hardware.face.FaceManager$AuthenticationCallback> r6 = android.hardware.face.FaceManager.AuthenticationCallback.class
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
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.android.AndroidFaceUnlockModule.verifyManager():void");
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject2);
        FaceManager faceManager = this.manager;
        if (faceManager != null) {
            try {
                FaceManager.AuthenticationCallback faceManagerAuthCallback = new FaceManagerAuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
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
                        faceManager.authenticate(cryptoObject2, cancellationSignal2, faceManagerAuthCallback, C12114c.f58379a.mo68304e(), 0, true);
                        return;
                    } catch (Throwable unused) {
                        faceManager.authenticate(cryptoObject2, cancellationSignal2, 0, faceManagerAuthCallback, C12114c.f58379a.mo68304e(), 0);
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
        FaceManager faceManager = this.manager;
        if (faceManager != null) {
            hashSet.add(faceManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            FaceManager faceManager = this.manager;
            if (faceManager != null && faceManager.isHardwareDetected()) {
                FaceManager faceManager2 = this.manager;
                if (faceManager2 != null && faceManager2.hasEnrolledTemplates()) {
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
            FaceManager faceManager = this.manager;
            return faceManager != null && faceManager.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
