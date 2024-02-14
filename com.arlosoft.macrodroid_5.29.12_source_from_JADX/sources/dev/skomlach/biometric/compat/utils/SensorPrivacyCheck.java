package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0003J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0007\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/SensorPrivacyCheck;", "", "()V", "CHECK_TIMEOUT", "", "appContext", "Landroid/content/Context;", "isCameraInUse", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCameraInUseTime", "Ljava/util/concurrent/atomic/AtomicLong;", "isUiRequested", "lastCheckedTime", "lastKnownState", "checkIsPrivacyToggled", "", "sensor", "", "getCameraCallback", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "isDone", "isCameraBlocked", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SensorPrivacyCheck.kt */
public final class SensorPrivacyCheck {
    public static final long CHECK_TIMEOUT = 5000;
    public static final SensorPrivacyCheck INSTANCE = new SensorPrivacyCheck();
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();
    /* access modifiers changed from: private */
    public static AtomicBoolean isCameraInUse = new AtomicBoolean(false);
    private static AtomicLong isCameraInUseTime = new AtomicLong(0);
    private static AtomicBoolean isUiRequested = new AtomicBoolean(false);
    private static AtomicLong lastCheckedTime = new AtomicLong(0);
    private static AtomicBoolean lastKnownState = new AtomicBoolean(false);

    private SensorPrivacyCheck() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = p261f9.C12250b.f58845a;
        r5 = android.os.Process.myUid();
        r6 = appContext.getPackageName();
        kotlin.jvm.internal.C13706o.m87928e(r6, "appContext.packageName");
        r1 = r1.mo68572a(r3, r5, r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean checkIsPrivacyToggled(int r9) {
        /*
            r8 = this;
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicLong r3 = lastCheckedTime     // Catch:{ all -> 0x00bd }
            long r3 = r3.get()     // Catch:{ all -> 0x00bd }
            long r1 = r1 - r3
            r3 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0019
            java.util.concurrent.atomic.AtomicBoolean r9 = lastKnownState     // Catch:{ all -> 0x00bd }
            boolean r9 = r9.get()     // Catch:{ all -> 0x00bd }
            return r9
        L_0x0019:
            java.util.concurrent.atomic.AtomicBoolean r1 = isUiRequested     // Catch:{ all -> 0x00bd }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00bd }
            r2 = 1
            if (r1 == 0) goto L_0x003f
            dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment$Companion r1 = dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment.Companion     // Catch:{ all -> 0x00bd }
            boolean r1 = r1.isUnblockDialogShown()     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x003f
            java.util.concurrent.atomic.AtomicBoolean r9 = lastKnownState     // Catch:{ all -> 0x00bd }
            r9.set(r2)     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicLong r9 = lastCheckedTime     // Catch:{ all -> 0x00bd }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r9.set(r1)     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicBoolean r9 = lastKnownState     // Catch:{ all -> 0x00bd }
            boolean r9 = r9.get()     // Catch:{ all -> 0x00bd }
            return r9
        L_0x003f:
            java.util.concurrent.atomic.AtomicBoolean r1 = isUiRequested     // Catch:{ all -> 0x00bd }
            r1.set(r0)     // Catch:{ all -> 0x00bd }
            android.content.Context r1 = appContext     // Catch:{ all -> 0x00bd }
            java.lang.Class<android.hardware.SensorPrivacyManager> r3 = android.hardware.SensorPrivacyManager.class
            java.lang.Object r3 = r1.getSystemService(r3)     // Catch:{ all -> 0x00bd }
            android.hardware.SensorPrivacyManager r3 = (android.hardware.SensorPrivacyManager) r3     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0058
            boolean r3 = r3.supportsSensorToggle(r9)     // Catch:{ all -> 0x00bd }
            if (r3 != r2) goto L_0x0058
            r3 = 1
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            if (r3 == 0) goto L_0x00c3
            f9.a r3 = p261f9.C12249a.f58793a     // Catch:{ all -> 0x00b6 }
            r4 = 2
            if (r9 != r4) goto L_0x0063
            java.lang.String r5 = "android.permission.CAMERA"
            goto L_0x0065
        L_0x0063:
            java.lang.String r5 = "android.permission.RECORD_AUDIO"
        L_0x0065:
            java.lang.String r3 = r3.mo68571a(r5)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x006c
            return r0
        L_0x006c:
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = r1.getPackageName()     // Catch:{ all -> 0x0079 }
            int r1 = androidx.core.app.AppOpsManagerCompat.noteOpNoThrow(r1, r3, r5, r6)     // Catch:{ all -> 0x0079 }
            goto L_0x008e
        L_0x0079:
            f9.b r1 = p261f9.C12250b.f58845a     // Catch:{ all -> 0x00b6 }
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x00b6 }
            android.content.Context r6 = appContext     // Catch:{ all -> 0x00b6 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = "appContext.packageName"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x00b6 }
            int r1 = r1.mo68572a(r3, r5, r6)     // Catch:{ all -> 0x00b6 }
        L_0x008e:
            if (r1 == 0) goto L_0x0092
            r1 = 1
            goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            java.util.concurrent.atomic.AtomicBoolean r3 = lastKnownState     // Catch:{ all -> 0x00b6 }
            r3.set(r1)     // Catch:{ all -> 0x00b6 }
            java.util.concurrent.atomic.AtomicLong r3 = lastCheckedTime     // Catch:{ all -> 0x00b6 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b6 }
            r3.set(r5)     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x00b5
            java.util.concurrent.atomic.AtomicBoolean r3 = isUiRequested     // Catch:{ all -> 0x00b6 }
            r3.set(r2)     // Catch:{ all -> 0x00b6 }
            if (r9 != r4) goto L_0x00b0
            dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment$Companion r9 = dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment.Companion     // Catch:{ all -> 0x00b6 }
            r9.askForCameraUnblock()     // Catch:{ all -> 0x00b6 }
            goto L_0x00b5
        L_0x00b0:
            dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment$Companion r9 = dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment.Companion     // Catch:{ all -> 0x00b6 }
            r9.askForMicUnblock()     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            return r1
        L_0x00b6:
            r9 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00bd }
            r1.mo68218e((java.lang.Throwable) r9)     // Catch:{ all -> 0x00bd }
            goto L_0x00c3
        L_0x00bd:
            r9 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1.mo68218e((java.lang.Throwable) r9)
        L_0x00c3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.SensorPrivacyCheck.checkIsPrivacyToggled(int):boolean");
    }

    private final CameraManager.AvailabilityCallback getCameraCallback(CameraManager cameraManager, AtomicBoolean atomicBoolean) {
        return new SensorPrivacyCheck$getCameraCallback$1(cameraManager, atomicBoolean);
    }

    /* access modifiers changed from: private */
    /* renamed from: isCameraInUse$lambda-0  reason: not valid java name */
    public static final void m101349isCameraInUse$lambda0(AtomicBoolean atomicBoolean) {
        C13706o.m87929f(atomicBoolean, "$isDone");
        try {
            Object systemService = appContext.getSystemService("camera");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            cameraManager.registerAvailabilityCallback(C12114c.f58379a.mo68302c(), INSTANCE.getCameraCallback(cameraManager, atomicBoolean));
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final boolean isCameraBlocked() {
        return C12120d.f58384a.mo68316c() && checkIsPrivacyToggled(2);
    }

    public final boolean isCameraInUse() {
        if (System.currentTimeMillis() - isCameraInUseTime.get() <= 5000) {
            return isCameraInUse.get();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long integer = (long) appContext.getResources().getInteger(17694722);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C12114c.f58379a.mo68308k(new C12100c(atomicBoolean));
        while (!atomicBoolean.get() && System.currentTimeMillis() - currentTimeMillis <= integer) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException unused) {
            }
        }
        isCameraInUseTime.set(System.currentTimeMillis());
        return isCameraInUse.get();
    }
}
