package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.os.PowerManager;
import android.os.RemoteException;
import dev.skomlach.biometric.compat.engine.internal.face.facelock.FaceLockHelper;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R(\u0010\f\u001a\b\u0018\u00010\nR\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper$initFacelock$1", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "Lja/u;", "unlock", "cancel", "reportFailedAttempt", "exposeFallback", "", "millis", "pokeWakelock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "screenLock", "Landroid/os/PowerManager$WakeLock;", "getScreenLock", "()Landroid/os/PowerManager$WakeLock;", "setScreenLock", "(Landroid/os/PowerManager$WakeLock;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FaceLockHelper.kt */
public final class FaceLockHelper$initFacelock$1 implements IFaceLockCallback {
    private PowerManager.WakeLock screenLock;
    final /* synthetic */ FaceLockHelper this$0;

    FaceLockHelper$initFacelock$1(FaceLockHelper faceLockHelper) {
        this.this$0 = faceLockHelper;
    }

    public void cancel() throws RemoteException {
        PowerManager.WakeLock wakeLock;
        long currentTimeMillis = System.currentTimeMillis() - this.this$0.time;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        boolean z = true;
        FaceLockHelper.Companion companion = FaceLockHelper.Companion;
        String tag = companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.cancel t=" + currentTimeMillis + " ms");
        if (this.this$0.mBoundToFaceLockService) {
            if (currentTimeMillis >= 4500) {
                String tag2 = companion.getTAG();
                biometricLoggerImpl.mo68217d(tag2 + ".timeout");
                this.this$0.faceLockInterface.onError(8, companion.getMessage(8));
            } else {
                String tag3 = companion.getTAG();
                biometricLoggerImpl.mo68217d(tag3 + ".canceled");
                this.this$0.faceLockInterface.onError(5, companion.getMessage(5));
            }
            PowerManager.WakeLock wakeLock2 = this.screenLock;
            if (wakeLock2 == null || !wakeLock2.isHeld()) {
                z = false;
            }
            if (z && (wakeLock = this.screenLock) != null) {
                wakeLock.release();
            }
            this.this$0.stopFaceLock();
        }
    }

    public void exposeFallback() throws RemoteException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String tag = FaceLockHelper.Companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.exposeFallback");
    }

    public final PowerManager.WakeLock getScreenLock() {
        return this.screenLock;
    }

    public void pokeWakelock(int i) {
        PowerManager.WakeLock wakeLock;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String tag = FaceLockHelper.Companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.pokeWakelock1");
        try {
            PowerManager powerManager = (PowerManager) this.this$0.context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager != null ? powerManager.newWakeLock(268435462, FaceLockHelper$initFacelock$1.class.getName()) : null;
            this.screenLock = newWakeLock;
            if ((newWakeLock != null && newWakeLock.isHeld()) && (wakeLock = this.screenLock) != null) {
                wakeLock.release();
            }
            PowerManager.WakeLock wakeLock2 = this.screenLock;
            if (wakeLock2 != null) {
                wakeLock2.acquire((long) i);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, FaceLockHelper.Companion.getTAG());
        }
    }

    public void reportFailedAttempt() throws RemoteException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        FaceLockHelper.Companion companion = FaceLockHelper.Companion;
        String tag = companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.reportFailedAttempt");
        this.this$0.time = System.currentTimeMillis();
        this.this$0.faceLockInterface.onError(7, companion.getMessage(7));
    }

    public final void setScreenLock(PowerManager.WakeLock wakeLock) {
        this.screenLock = wakeLock;
    }

    public void unlock() throws RemoteException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        FaceLockHelper.Companion companion = FaceLockHelper.Companion;
        String tag = companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.unlock");
        this.this$0.stopFaceLock();
        String tag2 = companion.getTAG();
        biometricLoggerImpl.mo68217d(tag2 + ".IFaceIdCallback.exec onAuthorized");
        this.this$0.faceLockInterface.onAuthorized();
    }

    public void pokeWakelock() throws RemoteException {
        PowerManager.WakeLock wakeLock;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String tag = FaceLockHelper.Companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".IFaceIdCallback.pokeWakelock2");
        try {
            PowerManager powerManager = (PowerManager) this.this$0.context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager != null ? powerManager.newWakeLock(268435462, FaceLockHelper$initFacelock$1.class.getName()) : null;
            this.screenLock = newWakeLock;
            if ((newWakeLock != null && newWakeLock.isHeld()) && (wakeLock = this.screenLock) != null) {
                wakeLock.release();
            }
            PowerManager.WakeLock wakeLock2 = this.screenLock;
            if (wakeLock2 != null) {
                wakeLock2.acquire(25000);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, FaceLockHelper.Companion.getTAG());
        }
    }
}
