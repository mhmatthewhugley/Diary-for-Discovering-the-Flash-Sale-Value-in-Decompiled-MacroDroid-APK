package dev.skomlach.biometric.compat.engine.internal.face.huawei.impl;

import android.content.Context;
import com.huawei.facerecognition.FaceRecognizeManager;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager;", "", "", "init", "Lja/u;", "release", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "authCallback", "setAuthCallback", "mAuthenticatorCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "Lcom/huawei/facerecognition/FaceRecognizeManager$FaceRecognizeCallback;", "mFRCallback", "Lcom/huawei/facerecognition/FaceRecognizeManager$FaceRecognizeCallback;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "()V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HuaweiFaceRecognizeManager.kt */
public final class HuaweiFaceRecognizeManager {
    public static final int CODE_CALLBACK_ACQUIRE = 3;
    public static final int CODE_CALLBACK_BUSY = 4;
    public static final int CODE_CALLBACK_CANCEL = 2;
    public static final int CODE_CALLBACK_OUT_OF_MEM = 5;
    public static final int CODE_CALLBACK_RESULT = 1;
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int DEFAULT_FLAG = 1;
    public static final int HUAWEI_FACE_AUTHENTICATOR_FAIL = 103;
    public static final int HUAWEI_FACE_AUTHENTICATOR_SUCCESS = 100;
    public static final int HUAWEI_FACE_AUTH_ERROR_CANCEL = 102;
    public static final int HUAWEI_FACE_AUTH_ERROR_HW_UNAVAILABLE = -101;
    public static final int HUAWEI_FACE_AUTH_ERROR_LOCKED = 129;
    public static final int HUAWEI_FACE_AUTH_ERROR_TIMEOUT = 113;
    public static final int HUAWEI_FACE_AUTH_ERROR_VENDOR = -100;
    public static final int HUAWEI_FACE_AUTH_STATUS_BRIGHT = 406;
    public static final int HUAWEI_FACE_AUTH_STATUS_DARK = 405;
    public static final int HUAWEI_FACE_AUTH_STATUS_EYE_CLOSED = 403;
    public static final int HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_BOTTOM = 412;
    public static final int HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_LEFT = 409;
    public static final int HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_RIGHT = 410;
    public static final int HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_TOP = 411;
    public static final int HUAWEI_FACE_AUTH_STATUS_FAR_FACE = 404;
    public static final int HUAWEI_FACE_AUTH_STATUS_INSUFFICIENT = 402;
    public static final int HUAWEI_FACE_AUTH_STATUS_MOUTH_OCCLUSION = 408;
    public static final int HUAWEI_FACE_AUTH_STATUS_PARTIAL = 401;
    public static final int HUAWEI_FACE_AUTH_STATUS_QUALITY = 407;
    public static final String TAG = "HuaweiFaceRecognize";
    public static final int TYPE_CALLBACK_AUTH = 2;
    /* access modifiers changed from: private */
    public static FaceRecognizeManager fRManager;
    /* access modifiers changed from: private */
    public static HuaweiFaceRecognizeManager instance;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock = new ReentrantLock();
    private final Context context;
    /* access modifiers changed from: private */
    public HuaweiFaceManager.AuthenticatorCallback mAuthenticatorCallback;
    private final FaceRecognizeManager.FaceRecognizeCallback mFRCallback;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R(\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010'\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0014\u0010)\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0014\u0010*\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b*\u0010\u0015R\u0014\u0010+\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b+\u0010\u0015R\u0014\u0010,\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b,\u0010\u0015R\u0014\u0010-\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b-\u0010\u0015R\u0014\u0010/\u001a\u00020.8\u0006XT¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b1\u0010\u0015R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager$Companion;", "", "", "hwAcquireInfo", "converHwAcquireInfoToHuawei", "hwErrorCode", "converHwErrorCodeToHuawei", "Lja/u;", "createInstance", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager;", "<set-?>", "instance", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager;", "getInstance", "()Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceRecognizeManager;", "Lcom/huawei/facerecognition/FaceRecognizeManager;", "fRManager", "Lcom/huawei/facerecognition/FaceRecognizeManager;", "getFRManager", "()Lcom/huawei/facerecognition/FaceRecognizeManager;", "CODE_CALLBACK_ACQUIRE", "I", "CODE_CALLBACK_BUSY", "CODE_CALLBACK_CANCEL", "CODE_CALLBACK_OUT_OF_MEM", "CODE_CALLBACK_RESULT", "DEFAULT_FLAG", "HUAWEI_FACE_AUTHENTICATOR_FAIL", "HUAWEI_FACE_AUTHENTICATOR_SUCCESS", "HUAWEI_FACE_AUTH_ERROR_CANCEL", "HUAWEI_FACE_AUTH_ERROR_HW_UNAVAILABLE", "HUAWEI_FACE_AUTH_ERROR_LOCKED", "HUAWEI_FACE_AUTH_ERROR_TIMEOUT", "HUAWEI_FACE_AUTH_ERROR_VENDOR", "HUAWEI_FACE_AUTH_STATUS_BRIGHT", "HUAWEI_FACE_AUTH_STATUS_DARK", "HUAWEI_FACE_AUTH_STATUS_EYE_CLOSED", "HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_BOTTOM", "HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_LEFT", "HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_RIGHT", "HUAWEI_FACE_AUTH_STATUS_FACE_OFFET_TOP", "HUAWEI_FACE_AUTH_STATUS_FAR_FACE", "HUAWEI_FACE_AUTH_STATUS_INSUFFICIENT", "HUAWEI_FACE_AUTH_STATUS_MOUTH_OCCLUSION", "HUAWEI_FACE_AUTH_STATUS_PARTIAL", "HUAWEI_FACE_AUTH_STATUS_QUALITY", "", "TAG", "Ljava/lang/String;", "TYPE_CALLBACK_AUTH", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HuaweiFaceRecognizeManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final int converHwAcquireInfoToHuawei(int i) {
            BiometricLoggerImpl.INSTANCE.mo68220e(HuaweiFaceRecognizeManager.TAG, " converHwhwAcquireInfoToHuawei hwAcquireInfo is " + i);
            if (i == 0) {
                return 100;
            }
            if (i == 22) {
                return 403;
            }
            switch (i) {
                case 4:
                    return 407;
                case 5:
                case 6:
                    return 402;
                case 7:
                    return 404;
                case 8:
                    return 409;
                case 9:
                    return 411;
                case 10:
                    return 410;
                case 11:
                    return 412;
                default:
                    switch (i) {
                        case 29:
                            return 401;
                        case 30:
                            return 405;
                        case 31:
                            return 406;
                        default:
                            return 103;
                    }
            }
        }

        public final int converHwErrorCodeToHuawei(int i) {
            BiometricLoggerImpl.INSTANCE.mo68220e(HuaweiFaceRecognizeManager.TAG, " converHwErrorCodeToHuawei hwErrorCode is " + i);
            switch (i) {
                case 0:
                    return 100;
                case 1:
                case 5:
                case 6:
                case 9:
                    return -100;
                case 2:
                    return 102;
                case 4:
                    return 113;
                case 8:
                    return 129;
                default:
                    return 103;
            }
        }

        public final void createInstance() {
            try {
                ReentrantLock access$getLock$cp = HuaweiFaceRecognizeManager.lock;
                C13329n.C13330a aVar = C13329n.f61327a;
                access$getLock$cp.lock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th) {
                ReentrantLock access$getLock$cp2 = HuaweiFaceRecognizeManager.lock;
                try {
                    C13329n.C13330a aVar2 = C13329n.f61327a;
                    access$getLock$cp2.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th2) {
                    C13329n.C13330a aVar3 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th2));
                }
                throw th;
            }
            if (getInstance() == null) {
                HuaweiFaceRecognizeManager.instance = new HuaweiFaceRecognizeManager();
            }
            ReentrantLock access$getLock$cp3 = HuaweiFaceRecognizeManager.lock;
            try {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                access$getLock$cp3.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th3) {
                C13329n.C13330a aVar5 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th3));
            }
        }

        public final FaceRecognizeManager getFRManager() {
            return HuaweiFaceRecognizeManager.fRManager;
        }

        public final HuaweiFaceRecognizeManager getInstance() {
            return HuaweiFaceRecognizeManager.instance;
        }
    }

    public HuaweiFaceRecognizeManager() {
        FaceRecognizeManager.FaceRecognizeCallback huaweiFaceRecognizeManager$mFRCallback$1 = new HuaweiFaceRecognizeManager$mFRCallback$1(this);
        this.mFRCallback = huaweiFaceRecognizeManager$mFRCallback$1;
        Context g = C12104a.f58372a.mo68283g();
        this.context = g;
        if (fRManager == null) {
            fRManager = new FaceRecognizeManager(g, huaweiFaceRecognizeManager$mFRCallback$1);
        }
    }

    public final int init() {
        FaceRecognizeManager faceRecognizeManager = fRManager;
        if (faceRecognizeManager == null || faceRecognizeManager == null) {
            return -1;
        }
        return faceRecognizeManager.init();
    }

    public final void release() {
        FaceRecognizeManager faceRecognizeManager = fRManager;
        if (!(faceRecognizeManager == null || faceRecognizeManager == null)) {
            faceRecognizeManager.release();
        }
        fRManager = null;
        instance = null;
    }

    public final void setAuthCallback(HuaweiFaceManager.AuthenticatorCallback authenticatorCallback) {
        this.mAuthenticatorCallback = authenticatorCallback;
    }
}
