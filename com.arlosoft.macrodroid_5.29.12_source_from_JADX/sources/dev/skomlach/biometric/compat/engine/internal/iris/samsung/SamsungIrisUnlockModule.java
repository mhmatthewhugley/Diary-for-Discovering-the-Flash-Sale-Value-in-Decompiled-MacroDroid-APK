package dev.skomlach.biometric.compat.engine.internal.iris.samsung;

import android.view.View;
import androidx.core.p007os.CancellationSignal;
import com.samsung.android.camera.iris.SemIrisManager;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
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

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/samsung/SamsungIrisUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Lcom/samsung/android/camera/iris/SemIrisManager;", "manager", "Lcom/samsung/android/camera/iris/SemIrisManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SamsungIrisUnlockModule.kt */
public final class SamsungIrisUnlockModule extends AbstractBiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int IRIS_ACQUIRED_CAPTURE_COMPLETED = 10003;
    public static final int IRIS_ACQUIRED_CAPTURE_FAILED = 10006;
    public static final int IRIS_ACQUIRED_CAPTURE_IRIS_LEAVE = 10004;
    public static final int IRIS_ACQUIRED_CAPTURE_IRIS_LEAVE_TIMEOUT = 10007;
    public static final int IRIS_ACQUIRED_CAPTURE_READY = 10001;
    public static final int IRIS_ACQUIRED_CAPTURE_STARTED = 10002;
    public static final int IRIS_ACQUIRED_CAPTURE_SUCCESS = 10005;
    public static final int IRIS_ACQUIRED_CHANGE_YOUR_POSITION = 12;
    public static final int IRIS_ACQUIRED_DUPLICATED_SCANNED_IMAGE = 1002;
    public static final int IRIS_ACQUIRED_EYE_NOT_PRESENT = 10;
    public static final int IRIS_ACQUIRED_FACTORY_TEST_SNSR_TEST_SCRIPT_END = 10009;
    public static final int IRIS_ACQUIRED_FACTORY_TEST_SNSR_TEST_SCRIPT_START = 10008;
    public static final int IRIS_ACQUIRED_GOOD = 0;
    public static final int IRIS_ACQUIRED_INSUFFICIENT = 2;
    public static final int IRIS_ACQUIRED_MOVE_CLOSER = 3;
    public static final int IRIS_ACQUIRED_MOVE_DOWN = 8;
    public static final int IRIS_ACQUIRED_MOVE_FARTHER = 4;
    public static final int IRIS_ACQUIRED_MOVE_LEFT = 5;
    public static final int IRIS_ACQUIRED_MOVE_RIGHT = 6;
    public static final int IRIS_ACQUIRED_MOVE_SOMEWHERE_DARKER = 11;
    public static final int IRIS_ACQUIRED_MOVE_UP = 7;
    public static final int IRIS_ACQUIRED_OPEN_EYES_WIDER = 9;
    public static final int IRIS_ACQUIRED_PARTIAL = 1;
    public static final int IRIS_ACQUIRED_VENDOR_BASE = 1000;
    public static final int IRIS_ACQUIRED_VENDOR_EVENT_BASE = 10000;
    public static final int IRIS_AUTH_TYPE_NONE = 0;
    public static final int IRIS_AUTH_TYPE_PREVIEW_CALLBACK = 1;
    public static final int IRIS_AUTH_TYPE_UI_NO_PREVIEW = 3;
    public static final int IRIS_AUTH_TYPE_UI_WITH_PREVIEW = 2;
    public static final int IRIS_DISABLE_PREVIEW_CALLBACK = 7;
    public static final int IRIS_ENABLE_PREVIEW_CALLBACK = 6;
    public static final int IRIS_ERROR_AUTH_VIEW_SIZE = 10;
    public static final int IRIS_ERROR_AUTH_WINDOW_TOKEN = 11;
    public static final int IRIS_ERROR_CANCELED = 4;
    public static final int IRIS_ERROR_DEVICE_NEED_RECAL = 1001;
    public static final int IRIS_ERROR_EVICTED = 13;
    public static final int IRIS_ERROR_EVICTED_DUE_TO_VIDEO_CALL = 14;
    public static final int IRIS_ERROR_EYE_SAFETY_TIMEOUT = 9;
    public static final int IRIS_ERROR_HW_UNAVAILABLE = 0;
    public static final int IRIS_ERROR_IDENTIFY_FAILURE_BROKEN_DATABASE = 1004;
    public static final int IRIS_ERROR_IDENTIFY_FAILURE_SENSOR_CHANGED = 1005;
    public static final int IRIS_ERROR_IDENTIFY_FAILURE_SERVICE_FAILURE = 1003;
    public static final int IRIS_ERROR_IDENTIFY_FAILURE_SYSTEM_FAILURE = 1002;
    public static final int IRIS_ERROR_LOCKOUT = 6;
    public static final int IRIS_ERROR_NEED_TO_RETRY = 5000;
    public static final int IRIS_ERROR_NO_EYE_DETECTED = 15;
    public static final int IRIS_ERROR_NO_SPACE = 3;
    public static final int IRIS_ERROR_OPEN_IR_CAMERA_FAIL = 8;
    public static final int IRIS_ERROR_PROXIMITY_TIMEOUT = 12;
    public static final int IRIS_ERROR_START_IR_CAMERA_PREVIEW_FAIL = 7;
    public static final int IRIS_ERROR_TIMEOUT = 2;
    public static final int IRIS_ERROR_UNABLE_TO_PROCESS = 1;
    public static final int IRIS_ERROR_UNABLE_TO_REMOVE = 5;
    public static final int IRIS_ERROR_VENDOR_BASE = 1000;
    public static final int IRIS_INVISIBLE_PREVIEW = 4;
    public static final int IRIS_ONE_EYE = 40000;
    public static final int IRIS_REQUEST_DVFS_FREQUENCY = 1004;
    public static final int IRIS_REQUEST_ENROLL_SESSION = 1002;
    public static final int IRIS_REQUEST_ENUMERATE = 11;
    public static final int IRIS_REQUEST_FACTORY_TEST_ALWAYS_LED_ON = 2001;
    public static final int IRIS_REQUEST_FACTORY_TEST_CAMERA_VERSION = 2004;
    public static final int IRIS_REQUEST_FACTORY_TEST_CAPTURE = 2002;
    public static final int IRIS_REQUEST_FACTORY_TEST_FULL_PREVIEW = 2000;
    public static final int IRIS_REQUEST_FACTORY_TEST_PREVIEW_MODE = 2003;
    public static final int IRIS_REQUEST_GET_IR_IDS = 1003;
    public static final int IRIS_REQUEST_GET_SENSOR_INFO = 5;
    public static final int IRIS_REQUEST_GET_SENSOR_STATUS = 6;
    public static final int IRIS_REQUEST_GET_UNIQUE_ID = 7;
    public static final int IRIS_REQUEST_GET_USERIDS = 12;
    public static final int IRIS_REQUEST_GET_VERSION = 4;
    public static final int IRIS_REQUEST_IR_PREVIEW_ENABLE = 2005;
    public static final int IRIS_REQUEST_LOCKOUT = 1001;
    public static final int IRIS_REQUEST_PAUSE = 0;
    public static final int IRIS_REQUEST_PROCESS_FIDO = 9;
    public static final int IRIS_REQUEST_REMOVE_IRIS = 1000;
    public static final int IRIS_REQUEST_RESUME = 1;
    public static final int IRIS_REQUEST_SENSOR_TEST_NORMALSCAN = 3;
    public static final int IRIS_REQUEST_SESSION_OPEN = 2;
    public static final int IRIS_REQUEST_SET_ACTIVE_GROUP = 8;
    public static final int IRIS_REQUEST_TZ_STATUS = 13;
    public static final int IRIS_REQUEST_UPDATE_SID = 10;
    public static final int IRIS_TWO_EYES = 40001;
    public static final int IRIS_VISIBLE_PREVIEW = 5;
    private SemIrisManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/samsung/SamsungIrisUnlockModule$AuthCallback;", "Lcom/samsung/android/camera/iris/SemIrisManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Lcom/samsung/android/camera/iris/SemIrisManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/iris/samsung/SamsungIrisUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SamsungIrisUnlockModule.kt */
    public final class AuthCallback extends SemIrisManager.AuthenticationCallback {
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
            this.skipTimeout = SamsungIrisUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SamsungIrisUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == 0) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 1) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 2) {
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                } else if (i == 3) {
                    authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                } else if (i != 6) {
                    Core.INSTANCE.cancelAuthentication(SamsungIrisUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(SamsungIrisUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    SamsungIrisUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                if (SamsungIrisUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    SamsungIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            SamsungIrisUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, SamsungIrisUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, SamsungIrisUnlockModule.this.tag());
                }
                SamsungIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SamsungIrisUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, SamsungIrisUnlockModule.this.tag());
                    }
                    SamsungIrisUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    SamsungIrisUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, SamsungIrisUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SamsungIrisUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(SemIrisManager.AuthenticationResult authenticationResult) {
            SemIrisManager.CryptoObject cryptoObject;
            SemIrisManager.CryptoObject cryptoObject2;
            SemIrisManager.CryptoObject cryptoObject3;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            Object[] objArr = new Object[1];
            String name = SamsungIrisUnlockModule.this.getName();
            Mac mac = null;
            SemIrisManager.CryptoObject cryptoObject4 = authenticationResult != null ? authenticationResult.getCryptoObject() : null;
            objArr[0] = name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject4;
            biometricLoggerImpl.mo68217d(objArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = SamsungIrisUnlockModule.this.tag();
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

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bS\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006W"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/iris/samsung/SamsungIrisUnlockModule$Companion;", "", "()V", "IRIS_ACQUIRED_CAPTURE_COMPLETED", "", "IRIS_ACQUIRED_CAPTURE_FAILED", "IRIS_ACQUIRED_CAPTURE_IRIS_LEAVE", "IRIS_ACQUIRED_CAPTURE_IRIS_LEAVE_TIMEOUT", "IRIS_ACQUIRED_CAPTURE_READY", "IRIS_ACQUIRED_CAPTURE_STARTED", "IRIS_ACQUIRED_CAPTURE_SUCCESS", "IRIS_ACQUIRED_CHANGE_YOUR_POSITION", "IRIS_ACQUIRED_DUPLICATED_SCANNED_IMAGE", "IRIS_ACQUIRED_EYE_NOT_PRESENT", "IRIS_ACQUIRED_FACTORY_TEST_SNSR_TEST_SCRIPT_END", "IRIS_ACQUIRED_FACTORY_TEST_SNSR_TEST_SCRIPT_START", "IRIS_ACQUIRED_GOOD", "IRIS_ACQUIRED_INSUFFICIENT", "IRIS_ACQUIRED_MOVE_CLOSER", "IRIS_ACQUIRED_MOVE_DOWN", "IRIS_ACQUIRED_MOVE_FARTHER", "IRIS_ACQUIRED_MOVE_LEFT", "IRIS_ACQUIRED_MOVE_RIGHT", "IRIS_ACQUIRED_MOVE_SOMEWHERE_DARKER", "IRIS_ACQUIRED_MOVE_UP", "IRIS_ACQUIRED_OPEN_EYES_WIDER", "IRIS_ACQUIRED_PARTIAL", "IRIS_ACQUIRED_VENDOR_BASE", "IRIS_ACQUIRED_VENDOR_EVENT_BASE", "IRIS_AUTH_TYPE_NONE", "IRIS_AUTH_TYPE_PREVIEW_CALLBACK", "IRIS_AUTH_TYPE_UI_NO_PREVIEW", "IRIS_AUTH_TYPE_UI_WITH_PREVIEW", "IRIS_DISABLE_PREVIEW_CALLBACK", "IRIS_ENABLE_PREVIEW_CALLBACK", "IRIS_ERROR_AUTH_VIEW_SIZE", "IRIS_ERROR_AUTH_WINDOW_TOKEN", "IRIS_ERROR_CANCELED", "IRIS_ERROR_DEVICE_NEED_RECAL", "IRIS_ERROR_EVICTED", "IRIS_ERROR_EVICTED_DUE_TO_VIDEO_CALL", "IRIS_ERROR_EYE_SAFETY_TIMEOUT", "IRIS_ERROR_HW_UNAVAILABLE", "IRIS_ERROR_IDENTIFY_FAILURE_BROKEN_DATABASE", "IRIS_ERROR_IDENTIFY_FAILURE_SENSOR_CHANGED", "IRIS_ERROR_IDENTIFY_FAILURE_SERVICE_FAILURE", "IRIS_ERROR_IDENTIFY_FAILURE_SYSTEM_FAILURE", "IRIS_ERROR_LOCKOUT", "IRIS_ERROR_NEED_TO_RETRY", "IRIS_ERROR_NO_EYE_DETECTED", "IRIS_ERROR_NO_SPACE", "IRIS_ERROR_OPEN_IR_CAMERA_FAIL", "IRIS_ERROR_PROXIMITY_TIMEOUT", "IRIS_ERROR_START_IR_CAMERA_PREVIEW_FAIL", "IRIS_ERROR_TIMEOUT", "IRIS_ERROR_UNABLE_TO_PROCESS", "IRIS_ERROR_UNABLE_TO_REMOVE", "IRIS_ERROR_VENDOR_BASE", "IRIS_INVISIBLE_PREVIEW", "IRIS_ONE_EYE", "IRIS_REQUEST_DVFS_FREQUENCY", "IRIS_REQUEST_ENROLL_SESSION", "IRIS_REQUEST_ENUMERATE", "IRIS_REQUEST_FACTORY_TEST_ALWAYS_LED_ON", "IRIS_REQUEST_FACTORY_TEST_CAMERA_VERSION", "IRIS_REQUEST_FACTORY_TEST_CAPTURE", "IRIS_REQUEST_FACTORY_TEST_FULL_PREVIEW", "IRIS_REQUEST_FACTORY_TEST_PREVIEW_MODE", "IRIS_REQUEST_GET_IR_IDS", "IRIS_REQUEST_GET_SENSOR_INFO", "IRIS_REQUEST_GET_SENSOR_STATUS", "IRIS_REQUEST_GET_UNIQUE_ID", "IRIS_REQUEST_GET_USERIDS", "IRIS_REQUEST_GET_VERSION", "IRIS_REQUEST_IR_PREVIEW_ENABLE", "IRIS_REQUEST_LOCKOUT", "IRIS_REQUEST_PAUSE", "IRIS_REQUEST_PROCESS_FIDO", "IRIS_REQUEST_REMOVE_IRIS", "IRIS_REQUEST_RESUME", "IRIS_REQUEST_SENSOR_TEST_NORMALSCAN", "IRIS_REQUEST_SESSION_OPEN", "IRIS_REQUEST_SET_ACTIVE_GROUP", "IRIS_REQUEST_TZ_STATUS", "IRIS_REQUEST_UPDATE_SID", "IRIS_TWO_EYES", "IRIS_VISIBLE_PREVIEW", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SamsungIrisUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public SamsungIrisUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.IRIS_SAMSUNG);
        SemIrisManager semIrisManager;
        try {
            semIrisManager = SemIrisManager.getSemIrisManager(getContext());
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            semIrisManager = null;
            SemIrisManager semIrisManager2 = null;
        }
        this.manager = semIrisManager;
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        SemIrisManager.CryptoObject cryptoObject;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject);
        SemIrisManager semIrisManager = this.manager;
        if (semIrisManager != null) {
            try {
                SemIrisManager.AuthenticationCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                SemIrisManager.CryptoObject cryptoObject2 = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new SemIrisManager.CryptoObject(biometricCryptoObject.getCipher(), (byte[]) null);
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new SemIrisManager.CryptoObject(biometricCryptoObject.getMac(), (byte[]) null);
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new SemIrisManager.CryptoObject(biometricCryptoObject.getSignature(), (byte[]) null);
                        }
                        cryptoObject2 = cryptoObject;
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject2);
                    semIrisManager.authenticate(cryptoObject2, cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e(), (View) null);
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
        SemIrisManager semIrisManager = this.manager;
        if (semIrisManager != null) {
            hashSet.add(semIrisManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            SemIrisManager semIrisManager = this.manager;
            if (semIrisManager != null && semIrisManager.isHardwareDetected()) {
                SemIrisManager semIrisManager2 = this.manager;
                if (semIrisManager2 != null && semIrisManager2.hasEnrolledIrises()) {
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
            SemIrisManager semIrisManager = this.manager;
            return semIrisManager != null && semIrisManager.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}
