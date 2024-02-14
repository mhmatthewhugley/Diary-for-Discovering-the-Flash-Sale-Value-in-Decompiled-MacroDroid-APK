package dev.skomlach.biometric.compat.utils;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dev.skomlach.biometric.compat.utils.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12101d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraManager f58354a;

    /* renamed from: c */
    public final /* synthetic */ SensorPrivacyCheck$getCameraCallback$1 f58355c;

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f58356d;

    public /* synthetic */ C12101d(CameraManager cameraManager, SensorPrivacyCheck$getCameraCallback$1 sensorPrivacyCheck$getCameraCallback$1, AtomicBoolean atomicBoolean) {
        this.f58354a = cameraManager;
        this.f58355c = sensorPrivacyCheck$getCameraCallback$1;
        this.f58356d = atomicBoolean;
    }

    public final void run() {
        SensorPrivacyCheck$getCameraCallback$1.m101350_init_$lambda0(this.f58354a, this.f58355c, this.f58356d);
    }
}
