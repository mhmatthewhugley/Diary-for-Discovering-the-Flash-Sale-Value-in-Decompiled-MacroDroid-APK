package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.content.Context;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.view.View;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper;", "", "Landroid/view/View;", "targetView", "Lja/u;", "startFaceAuth", "", "faceUnlockAvailable", "destroy", "initFacelock", "stopFaceLock", "view", "startFaceLockWithUi", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockInterface;", "faceLockInterface", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockInterface;", "Landroid/view/View;", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock;", "mFaceLock", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock;", "mFaceLockServiceRunning", "Z", "mBoundToFaceLockService", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "mCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "Landroid/content/ServiceConnection;", "mServiceConnection", "Landroid/content/ServiceConnection;", "hasHardware", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "time", "J", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockInterface;)V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FaceLockHelper.kt */
public final class FaceLockHelper {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FACELOCK_API_NOT_FOUND = 2;
    public static final int FACELOCK_CANCELED = 5;
    public static final int FACELOCK_CANNT_START = 3;
    public static final int FACELOCK_FAILED_ATTEMPT = 7;
    public static final int FACELOCK_NOT_SETUP = 4;
    public static final int FACELOCK_NO_FACE_FOUND = 6;
    public static final int FACELOCK_TIMEOUT = 8;
    public static final int FACELOCK_UNABLE_TO_BIND = 1;
    /* access modifiers changed from: private */
    public static final String TAG = FaceLockHelper.class.getSimpleName();
    /* access modifiers changed from: private */
    public final Context context = C12104a.f58372a.mo68283g();
    /* access modifiers changed from: private */
    public final FaceLockInterface faceLockInterface;
    private final boolean hasHardware;
    /* access modifiers changed from: private */
    public boolean mBoundToFaceLockService;
    /* access modifiers changed from: private */
    public IFaceLockCallback mCallback;
    /* access modifiers changed from: private */
    public FaceLock mFaceLock;
    /* access modifiers changed from: private */
    public boolean mFaceLockServiceRunning;
    private ServiceConnection mServiceConnection;
    private View targetView;
    /* access modifiers changed from: private */
    public long time = System.currentTimeMillis();

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper$Companion;", "", "()V", "FACELOCK_API_NOT_FOUND", "", "FACELOCK_CANCELED", "FACELOCK_CANNT_START", "FACELOCK_FAILED_ATTEMPT", "FACELOCK_NOT_SETUP", "FACELOCK_NO_FACE_FOUND", "FACELOCK_TIMEOUT", "FACELOCK_UNABLE_TO_BIND", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "getMessage", "code", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FaceLockHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final String getMessage(int i) {
            switch (i) {
                case 1:
                    return "Unable to bind to FaceId";
                case 2:
                    String tag = getTAG();
                    return tag + ". not found";
                case 3:
                    return "Can not start FaceId";
                case 4:
                    String tag2 = getTAG();
                    return tag2 + ". not set up";
                case 5:
                    String tag3 = getTAG();
                    return tag3 + ". canceled";
                case 6:
                    return "No face found";
                case 7:
                    return "Failed attempt";
                case 8:
                    return "Timeout";
                default:
                    return "Unknown error (" + i + ")";
            }
        }

        /* access modifiers changed from: protected */
        public final String getTAG() {
            return FaceLockHelper.TAG;
        }
    }

    public FaceLockHelper(FaceLockInterface faceLockInterface2) {
        FaceLock faceLock;
        C13706o.m87929f(faceLockInterface2, "faceLockInterface");
        this.faceLockInterface = faceLockInterface2;
        try {
            faceLock = new FaceLock();
        } catch (Throwable unused) {
            faceLock = null;
        }
        this.mFaceLock = faceLock;
        this.hasHardware = faceLock != null;
    }

    private final void startFaceAuth(View view) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + ".startFaceLock");
        if (!this.mFaceLockServiceRunning) {
            try {
                biometricLoggerImpl.mo68217d(str + ".Starting FaceId");
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                biometricLoggerImpl.mo68217d(str + " rect: " + rect);
                FaceLock faceLock = this.mFaceLock;
                if (faceLock != null) {
                    faceLock.startUi(view.getWindowToken(), rect.left, rect.top, rect.width(), rect.height());
                }
                this.time = System.currentTimeMillis();
                this.mFaceLockServiceRunning = true;
            } catch (Exception e) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String str2 = TAG;
                String message = e.getMessage();
                biometricLoggerImpl2.mo68219e(e, str2 + "Caught exception starting FaceId: " + message);
                this.faceLockInterface.onError(3, Companion.getMessage(3));
            }
        } else {
            biometricLoggerImpl.mo68220e(str + ".startFaceLock() attempted while running");
        }
    }

    public final void destroy() {
        this.targetView = null;
        this.mCallback = null;
        this.mServiceConnection = null;
    }

    public final boolean faceUnlockAvailable() {
        return this.hasHardware;
    }

    public final void initFacelock() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + ".initFacelock");
        try {
            this.mCallback = new FaceLockHelper$initFacelock$1(this);
            FaceLockHelper$initFacelock$2 faceLockHelper$initFacelock$2 = new FaceLockHelper$initFacelock$2(this);
            this.mServiceConnection = faceLockHelper$initFacelock$2;
            if (!this.mBoundToFaceLockService) {
                FaceLock faceLock = this.mFaceLock;
                if (faceLock != null && !faceLock.bind(faceLockHelper$initFacelock$2)) {
                    this.faceLockInterface.onError(1, Companion.getMessage(1));
                } else {
                    biometricLoggerImpl.mo68217d(str + ".Binded, waiting for connection");
                    return;
                }
            } else {
                biometricLoggerImpl.mo68217d(str + ".Already mBoundToFaceLockService");
            }
        } catch (Exception e) {
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String str2 = TAG;
            biometricLoggerImpl2.mo68219e(e, str2 + "Caught exception creating FaceId: " + e);
            this.faceLockInterface.onError(2, Companion.getMessage(2));
        }
        BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
        String str3 = TAG;
        biometricLoggerImpl3.mo68217d(str3 + ".init failed");
    }

    public final void startFaceLockWithUi(View view) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + ".startFaceLockWithUi");
        this.targetView = view;
        if (view != null) {
            startFaceAuth(view);
        }
    }

    public final void stopFaceLock() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + ".stopFaceLock");
        if (this.mFaceLockServiceRunning) {
            try {
                biometricLoggerImpl.mo68217d(str + ".Stopping FaceId");
                FaceLock faceLock = this.mFaceLock;
                if (faceLock != null) {
                    faceLock.stopUi();
                }
            } catch (Exception e) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String str2 = TAG;
                biometricLoggerImpl2.mo68219e(e, str2 + "Caught exception stopping FaceId: " + e);
            }
            this.mFaceLockServiceRunning = false;
        }
        if (this.mBoundToFaceLockService) {
            FaceLock faceLock2 = this.mFaceLock;
            if (faceLock2 != null) {
                faceLock2.unbind();
            }
            BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
            String str3 = TAG;
            biometricLoggerImpl3.mo68217d(str3 + ".FaceId.unbind()");
            this.mBoundToFaceLockService = false;
        }
    }
}
