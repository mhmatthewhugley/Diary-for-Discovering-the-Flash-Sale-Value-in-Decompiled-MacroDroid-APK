package dev.skomlach.biometric.compat.engine.internal.face.huawei.impl;

import android.view.Surface;
import com.huawei.facerecognition.FaceRecognizeManager;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceRecognizeManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManagerV1Impl;", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManagerV1;", "", "reqID", "flag", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "callback", "Lja/u;", "authenticate", "cancel", "", "hasEnrolledTemplates", "", "getEnrolledTemplates", "getVersion", "()I", "version", "isHardwareDetected", "()Z", "<init>", "()V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HuaweiFaceManagerV1Impl.kt */
public final class HuaweiFaceManagerV1Impl extends HuaweiFaceManagerV1 {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final int FACE_AUTH_VERSION_V1 = 1;
    private static final int HUAWEI_OP_FAIL = -1;
    private static final int HUAWEI_OP_SUCCESS = 0;
    private static final String TAG = "HuaweiFaceManagerV1Impl";

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManagerV1Impl$Companion;", "", "()V", "FACE_AUTH_VERSION_V1", "", "HUAWEI_OP_FAIL", "HUAWEI_OP_SUCCESS", "TAG", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: HuaweiFaceManagerV1Impl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public HuaweiFaceManagerV1Impl() {
        HuaweiFaceRecognizeManager.Companion.createInstance();
    }

    public void authenticate(int i, int i2, HuaweiFaceManager.AuthenticatorCallback authenticatorCallback) {
        HuaweiFaceRecognizeManager.Companion companion = HuaweiFaceRecognizeManager.Companion;
        HuaweiFaceRecognizeManager instance = companion.getInstance();
        if (instance == null) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "HuaweiFaceRecognizeManager is null");
        } else if (authenticatorCallback == null) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "callback empty");
        } else {
            instance.setAuthCallback(authenticatorCallback);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d(TAG, "reqID is " + i + "flag is " + i2);
            int init = instance.init();
            if (init != 0) {
                biometricLoggerImpl.mo68220e(TAG, "init failed returning " + init);
                authenticatorCallback.onAuthenticationError(HuaweiFaceRecognizeManager.HUAWEI_FACE_AUTH_ERROR_HW_UNAVAILABLE);
                return;
            }
            biometricLoggerImpl.mo68217d(TAG, "authenicating... ");
            FaceRecognizeManager fRManager = companion.getFRManager();
            if (fRManager != null) {
                fRManager.authenticate(i, i2, (Surface) null);
            }
        }
    }

    public int cancel(int i) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(TAG, "canceling...");
        HuaweiFaceRecognizeManager.Companion companion = HuaweiFaceRecognizeManager.Companion;
        if (companion.getInstance() == null) {
            biometricLoggerImpl.mo68220e(TAG, "HuaweiFaceRecognizeManager is null");
            return -1;
        }
        FaceRecognizeManager fRManager = companion.getFRManager();
        if (fRManager != null) {
            fRManager.cancelAuthenticate(i);
        }
        FaceRecognizeManager fRManager2 = companion.getFRManager();
        if (fRManager2 != null) {
            fRManager2.release();
        }
        companion.createInstance();
        return 0;
    }

    public int[] getEnrolledTemplates() {
        try {
            FaceRecognizeManager fRManager = HuaweiFaceRecognizeManager.Companion.getFRManager();
            if (fRManager != null) {
                return fRManager.getEnrolledFaceIDs();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getVersion() {
        return 1;
    }

    public boolean hasEnrolledTemplates() {
        int[] enrolledFaceIDs;
        try {
            FaceRecognizeManager fRManager = HuaweiFaceRecognizeManager.Companion.getFRManager();
            if (fRManager == null || (enrolledFaceIDs = fRManager.getEnrolledFaceIDs()) == null) {
                return false;
            }
            return (enrolledFaceIDs.length == 0) ^ true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isHardwareDetected() {
        try {
            FaceRecognizeManager fRManager = HuaweiFaceRecognizeManager.Companion.getFRManager();
            return (fRManager != null ? fRManager.getHardwareSupportType() : 0) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
