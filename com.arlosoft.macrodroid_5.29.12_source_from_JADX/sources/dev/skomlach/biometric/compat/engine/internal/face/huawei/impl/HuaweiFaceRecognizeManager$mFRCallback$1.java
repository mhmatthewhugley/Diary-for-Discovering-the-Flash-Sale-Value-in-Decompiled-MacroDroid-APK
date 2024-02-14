package dev.skomlach.biometric.compat.engine.internal.face.huawei.impl;

import com.huawei.facerecognition.FaceRecognizeManager;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager$mFRCallback$1", "Lcom/huawei/facerecognition/FaceRecognizeManager$FaceRecognizeCallback;", "", "reqId", "type", "code", "errorCode", "Lja/u;", "onCallbackEvent", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HuaweiFaceRecognizeManager.kt */
public final class HuaweiFaceRecognizeManager$mFRCallback$1 implements FaceRecognizeManager.FaceRecognizeCallback {
    final /* synthetic */ HuaweiFaceRecognizeManager this$0;

    HuaweiFaceRecognizeManager$mFRCallback$1(HuaweiFaceRecognizeManager huaweiFaceRecognizeManager) {
        this.this$0 = huaweiFaceRecognizeManager;
    }

    public void onCallbackEvent(int i, int i2, int i3, int i4) {
        HuaweiFaceManager.AuthenticatorCallback access$getMAuthenticatorCallback$p;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(HuaweiFaceRecognizeManager.TAG, " onCallbackEvent gotten reqId " + i + " type " + i2 + " code " + i3 + " errCode " + i4);
        if (this.this$0.mAuthenticatorCallback == null) {
            biometricLoggerImpl.mo68220e(HuaweiFaceRecognizeManager.TAG, "mAuthenticatorCallback empty in onCallbackEvent ");
        } else if (i2 != 2) {
            biometricLoggerImpl.mo68220e(HuaweiFaceRecognizeManager.TAG, " gotten not huawei's auth callback reqid " + i + " type " + i2 + " code " + i3 + " errCode " + i4);
        } else if (i3 == 3) {
            int converHwAcquireInfoToHuawei = HuaweiFaceRecognizeManager.Companion.converHwAcquireInfoToHuawei(i4);
            biometricLoggerImpl.mo68217d(HuaweiFaceRecognizeManager.TAG, " result " + converHwAcquireInfoToHuawei);
            if (converHwAcquireInfoToHuawei != 103 && (access$getMAuthenticatorCallback$p = this.this$0.mAuthenticatorCallback) != null) {
                access$getMAuthenticatorCallback$p.onAuthenticationStatus(converHwAcquireInfoToHuawei);
            }
        } else if (i3 == 1) {
            int converHwErrorCodeToHuawei = HuaweiFaceRecognizeManager.Companion.converHwErrorCodeToHuawei(i4);
            biometricLoggerImpl.mo68217d(HuaweiFaceRecognizeManager.TAG, " result " + converHwErrorCodeToHuawei);
            if (converHwErrorCodeToHuawei == 100) {
                biometricLoggerImpl.mo68217d(HuaweiFaceRecognizeManager.TAG, "huawei face auth success");
                HuaweiFaceManager.AuthenticatorCallback access$getMAuthenticatorCallback$p2 = this.this$0.mAuthenticatorCallback;
                if (access$getMAuthenticatorCallback$p2 != null) {
                    access$getMAuthenticatorCallback$p2.onAuthenticationSucceeded();
                }
                this.this$0.mAuthenticatorCallback = null;
            } else if (converHwErrorCodeToHuawei != 103) {
                HuaweiFaceManager.AuthenticatorCallback access$getMAuthenticatorCallback$p3 = this.this$0.mAuthenticatorCallback;
                if (access$getMAuthenticatorCallback$p3 != null) {
                    access$getMAuthenticatorCallback$p3.onAuthenticationError(converHwErrorCodeToHuawei);
                }
                this.this$0.mAuthenticatorCallback = null;
            } else {
                HuaweiFaceManager.AuthenticatorCallback access$getMAuthenticatorCallback$p4 = this.this$0.mAuthenticatorCallback;
                if (access$getMAuthenticatorCallback$p4 != null) {
                    access$getMAuthenticatorCallback$p4.onAuthenticationFailed();
                }
                biometricLoggerImpl.mo68220e(HuaweiFaceRecognizeManager.TAG, " fail reason " + converHwErrorCodeToHuawei);
            }
        }
    }
}
