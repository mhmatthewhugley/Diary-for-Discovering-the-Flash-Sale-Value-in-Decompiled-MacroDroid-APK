package dev.skomlach.biometric.compat.engine.internal.face.huawei;

import dev.skomlach.biometric.compat.engine.BiometricInitListener;

/* renamed from: dev.skomlach.biometric.compat.engine.internal.face.huawei.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12034a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ HuaweiFaceUnlockModule f58246a;

    /* renamed from: c */
    public final /* synthetic */ BiometricInitListener f58247c;

    public /* synthetic */ C12034a(HuaweiFaceUnlockModule huaweiFaceUnlockModule, BiometricInitListener biometricInitListener) {
        this.f58246a = huaweiFaceUnlockModule;
        this.f58247c = biometricInitListener;
    }

    public final void run() {
        HuaweiFaceUnlockModule.m101304_init_$lambda0(this.f58246a, this.f58247c);
    }
}
