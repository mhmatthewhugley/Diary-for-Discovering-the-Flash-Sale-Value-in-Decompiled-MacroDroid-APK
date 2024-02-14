package dev.skomlach.biometric.compat.utils;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/SensorPrivacyCheck$getCameraCallback$1", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "Lja/u;", "unregisterListener", "", "cameraId", "onCameraAvailable", "onCameraUnavailable", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SensorPrivacyCheck.kt */
public final class SensorPrivacyCheck$getCameraCallback$1 extends CameraManager.AvailabilityCallback {
    final /* synthetic */ CameraManager $cameraManager;
    final /* synthetic */ AtomicBoolean $isDone;

    SensorPrivacyCheck$getCameraCallback$1(CameraManager cameraManager, AtomicBoolean atomicBoolean) {
        this.$cameraManager = cameraManager;
        this.$isDone = atomicBoolean;
        C12114c.f58379a.mo68309l(new C12101d(cameraManager, this, atomicBoolean), (long) SensorPrivacyCheck.appContext.getResources().getInteger(17694722));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m101350_init_$lambda0(CameraManager cameraManager, SensorPrivacyCheck$getCameraCallback$1 sensorPrivacyCheck$getCameraCallback$1, AtomicBoolean atomicBoolean) {
        C13706o.m87929f(sensorPrivacyCheck$getCameraCallback$1, "this$0");
        C13706o.m87929f(atomicBoolean, "$isDone");
        if (cameraManager != null) {
            try {
                cameraManager.unregisterAvailabilityCallback(sensorPrivacyCheck$getCameraCallback$1);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
        atomicBoolean.set(true);
    }

    private final void unregisterListener() {
        C12114c.f58379a.mo68308k(new C12102e(this.$cameraManager, this, this.$isDone));
    }

    /* access modifiers changed from: private */
    /* renamed from: unregisterListener$lambda-1  reason: not valid java name */
    public static final void m101351unregisterListener$lambda1(CameraManager cameraManager, SensorPrivacyCheck$getCameraCallback$1 sensorPrivacyCheck$getCameraCallback$1, AtomicBoolean atomicBoolean) {
        C13706o.m87929f(sensorPrivacyCheck$getCameraCallback$1, "this$0");
        C13706o.m87929f(atomicBoolean, "$isDone");
        if (cameraManager != null) {
            try {
                cameraManager.unregisterAvailabilityCallback(sensorPrivacyCheck$getCameraCallback$1);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
        atomicBoolean.set(true);
    }

    public void onCameraAvailable(String str) {
        CameraCharacteristics cameraCharacteristics;
        C13706o.m87929f(str, "cameraId");
        if (SensorPrivacyCheck.INSTANCE.isCameraBlocked()) {
            try {
                SensorPrivacyCheck.isCameraInUse.set(false);
            } finally {
                unregisterListener();
            }
        } else {
            try {
                super.onCameraAvailable(str);
                CameraManager cameraManager = this.$cameraManager;
                if (cameraManager != null && (cameraCharacteristics = cameraManager.getCameraCharacteristics(str)) != null) {
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null) {
                        if (num.intValue() == 0) {
                            SensorPrivacyCheck.isCameraInUse.set(false);
                            unregisterListener();
                        }
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }

    public void onCameraUnavailable(String str) {
        CameraCharacteristics cameraCharacteristics;
        C13706o.m87929f(str, "cameraId");
        if (SensorPrivacyCheck.INSTANCE.isCameraBlocked()) {
            try {
                SensorPrivacyCheck.isCameraInUse.set(false);
            } finally {
                unregisterListener();
            }
        } else {
            try {
                super.onCameraUnavailable(str);
                CameraManager cameraManager = this.$cameraManager;
                if (cameraManager != null && (cameraCharacteristics = cameraManager.getCameraCharacteristics(str)) != null) {
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null) {
                        if (num.intValue() == 0) {
                            SensorPrivacyCheck.isCameraInUse.set(true);
                            unregisterListener();
                        }
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }
}
