package dev.skomlach.biometric.compat.utils;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dev.skomlach.biometric.compat.utils.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12100c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f58353a;

    public /* synthetic */ C12100c(AtomicBoolean atomicBoolean) {
        this.f58353a = atomicBoolean;
    }

    public final void run() {
        SensorPrivacyCheck.m101349isCameraInUse$lambda0(this.f58353a);
    }
}
