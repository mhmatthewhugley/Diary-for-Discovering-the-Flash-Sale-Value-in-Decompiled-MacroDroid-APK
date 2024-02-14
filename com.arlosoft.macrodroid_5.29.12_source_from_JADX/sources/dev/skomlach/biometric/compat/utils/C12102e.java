package dev.skomlach.biometric.compat.utils;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dev.skomlach.biometric.compat.utils.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12102e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraManager f58357a;

    /* renamed from: c */
    public final /* synthetic */ SensorPrivacyCheck$getCameraCallback$1 f58358c;

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f58359d;

    public /* synthetic */ C12102e(CameraManager cameraManager, SensorPrivacyCheck$getCameraCallback$1 sensorPrivacyCheck$getCameraCallback$1, AtomicBoolean atomicBoolean) {
        this.f58357a = cameraManager;
        this.f58358c = sensorPrivacyCheck$getCameraCallback$1;
        this.f58359d = atomicBoolean;
    }

    public final void run() {
        SensorPrivacyCheck$getCameraCallback$1.m101351unregisterListener$lambda1(this.f58357a, this.f58358c, this.f58359d);
    }
}
