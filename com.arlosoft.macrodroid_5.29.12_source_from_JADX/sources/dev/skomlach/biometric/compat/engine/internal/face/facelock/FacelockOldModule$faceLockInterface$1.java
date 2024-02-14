package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.view.View;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.internal.face.facelock.FacelockOldModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule$faceLockInterface$1", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockInterface;", "", "code", "", "msg", "Lja/u;", "onError", "onAuthorized", "onConnected", "onDisconnected", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FacelockOldModule.kt */
public final class FacelockOldModule$faceLockInterface$1 implements FaceLockInterface {
    final /* synthetic */ FacelockOldModule this$0;

    FacelockOldModule$faceLockInterface$1(FacelockOldModule facelockOldModule) {
        this.this$0 = facelockOldModule;
    }

    public void onAuthorized() {
        FacelockOldModule.ProxyListener access$getFacelockProxyListener$p;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = this.this$0.getName();
        biometricLoggerImpl.mo68217d(name + ".FaceIdInterface.onAuthorized");
        if (this.this$0.facelockProxyListener != null && (access$getFacelockProxyListener$p = this.this$0.facelockProxyListener) != null) {
            access$getFacelockProxyListener$p.onAuthenticationSucceeded((Object) null);
        }
    }

    public void onConnected() {
        FacelockOldModule.ProxyListener access$getFacelockProxyListener$p;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = this.this$0.getName();
        biometricLoggerImpl.mo68217d(name + ".FaceIdInterface.onConnected");
        if (!(this.this$0.facelockProxyListener == null || (access$getFacelockProxyListener$p = this.this$0.facelockProxyListener) == null)) {
            access$getFacelockProxyListener$p.onAuthenticationAcquired(0);
        }
        if (this.this$0.listener != null) {
            this.this$0.setManagerAccessible(true);
            BiometricInitListener access$getListener$p = this.this$0.listener;
            if (access$getListener$p != null) {
                access$getListener$p.initFinished(this.this$0.getBiometricMethod(), this.this$0);
            }
            this.this$0.listener = null;
            FaceLockHelper access$getFaceLockHelper$p = this.this$0.faceLockHelper;
            if (access$getFaceLockHelper$p != null) {
                access$getFaceLockHelper$p.stopFaceLock();
                return;
            }
            return;
        }
        String name2 = this.this$0.getName();
        Object obj = this.this$0.viewWeakReference.get();
        biometricLoggerImpl.mo68217d(name2 + ".authorize: " + obj);
        FaceLockHelper access$getFaceLockHelper$p2 = this.this$0.faceLockHelper;
        if (access$getFaceLockHelper$p2 != null) {
            access$getFaceLockHelper$p2.startFaceLockWithUi((View) this.this$0.viewWeakReference.get());
        }
    }

    public void onDisconnected() {
        FacelockOldModule.ProxyListener access$getFacelockProxyListener$p;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = this.this$0.getName();
        biometricLoggerImpl.mo68217d(name + ".FaceIdInterface.onDisconnected");
        if (!(this.this$0.facelockProxyListener == null || (access$getFacelockProxyListener$p = this.this$0.facelockProxyListener) == null)) {
            access$getFacelockProxyListener$p.onAuthenticationError(5, FaceLockHelper.Companion.getMessage(5));
        }
        if (this.this$0.listener != null) {
            BiometricInitListener access$getListener$p = this.this$0.listener;
            if (access$getListener$p != null) {
                access$getListener$p.initFinished(this.this$0.getBiometricMethod(), this.this$0);
            }
            this.this$0.listener = null;
            FaceLockHelper access$getFaceLockHelper$p = this.this$0.faceLockHelper;
            if (access$getFaceLockHelper$p != null) {
                access$getFaceLockHelper$p.stopFaceLock();
            }
        }
    }

    public void onError(int i, String str) {
        FacelockOldModule.ProxyListener access$getFacelockProxyListener$p;
        C13706o.m87929f(str, NotificationCompat.CATEGORY_MESSAGE);
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = this.this$0.getName();
        biometricLoggerImpl.mo68217d(name + ":FaceIdInterface.onError " + i + " " + str);
        if (this.this$0.facelockProxyListener != null && (access$getFacelockProxyListener$p = this.this$0.facelockProxyListener) != null) {
            access$getFacelockProxyListener$p.onAuthenticationError(i, str);
        }
    }
}
