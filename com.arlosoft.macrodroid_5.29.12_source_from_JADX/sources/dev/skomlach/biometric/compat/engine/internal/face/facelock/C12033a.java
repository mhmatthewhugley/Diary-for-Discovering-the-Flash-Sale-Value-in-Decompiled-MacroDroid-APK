package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import dev.skomlach.biometric.compat.engine.internal.face.facelock.FaceLock;

/* renamed from: dev.skomlach.biometric.compat.engine.internal.face.facelock.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12033a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FaceLock.CallBackBinder f58244a;

    /* renamed from: c */
    public final /* synthetic */ int f58245c;

    public /* synthetic */ C12033a(FaceLock.CallBackBinder callBackBinder, int i) {
        this.f58244a = callBackBinder;
        this.f58245c = i;
    }

    public final void run() {
        FaceLock.CallBackBinder.m101303onTransact$lambda0(this.f58244a, this.f58245c);
    }
}
