package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper$initFacelock$2", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Lja/u;", "onServiceDisconnected", "Landroid/os/IBinder;", "service", "onServiceConnected", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FaceLockHelper.kt */
public final class FaceLockHelper$initFacelock$2 implements ServiceConnection {
    final /* synthetic */ FaceLockHelper this$0;

    FaceLockHelper$initFacelock$2(FaceLockHelper faceLockHelper) {
        this.this$0 = faceLockHelper;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        FaceLock access$getMFaceLock$p;
        C13706o.m87929f(componentName, "name");
        C13706o.m87929f(iBinder, NotificationCompat.CATEGORY_SERVICE);
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String tag = FaceLockHelper.Companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".ServiceConnection.onServiceConnected");
        this.this$0.mBoundToFaceLockService = true;
        try {
            IFaceLockCallback access$getMCallback$p = this.this$0.mCallback;
            if (!(access$getMCallback$p == null || (access$getMFaceLock$p = this.this$0.mFaceLock) == null)) {
                access$getMFaceLock$p.registerCallback(access$getMCallback$p);
            }
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String tag2 = FaceLockHelper.Companion.getTAG();
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                biometricLoggerImpl2.mo68219e(e, tag2 + "Caught invocation exception registering callback: " + targetException);
            } else {
                BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                String tag3 = FaceLockHelper.Companion.getTAG();
                biometricLoggerImpl3.mo68219e(e, tag3 + "Caught exception registering callback: " + e);
            }
            this.this$0.mBoundToFaceLockService = false;
        }
        this.this$0.faceLockInterface.onConnected();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        FaceLock access$getMFaceLock$p;
        C13706o.m87929f(componentName, "name");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String tag = FaceLockHelper.Companion.getTAG();
        biometricLoggerImpl.mo68217d(tag + ".ServiceConnection.onServiceDisconnected");
        try {
            IFaceLockCallback access$getMCallback$p = this.this$0.mCallback;
            if (!(access$getMCallback$p == null || (access$getMFaceLock$p = this.this$0.mFaceLock) == null)) {
                access$getMFaceLock$p.unregisterCallback(access$getMCallback$p);
            }
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String tag2 = FaceLockHelper.Companion.getTAG();
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                biometricLoggerImpl2.mo68219e(e, tag2 + "Caught invocation exception registering callback: " + targetException);
            } else {
                BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                String tag3 = FaceLockHelper.Companion.getTAG();
                biometricLoggerImpl3.mo68219e(e, tag3 + "Caught exception registering callback: " + e);
            }
        }
        this.this$0.mFaceLockServiceRunning = false;
        this.this$0.mBoundToFaceLockService = false;
        this.this$0.faceLockInterface.onDisconnected();
    }
}
