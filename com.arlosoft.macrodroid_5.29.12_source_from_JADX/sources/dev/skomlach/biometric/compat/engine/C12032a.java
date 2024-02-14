package dev.skomlach.biometric.compat.engine;

/* renamed from: dev.skomlach.biometric.compat.engine.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12032a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricMethod f58242a;

    /* renamed from: c */
    public final /* synthetic */ BiometricInitListener f58243c;

    public /* synthetic */ C12032a(BiometricMethod biometricMethod, BiometricInitListener biometricInitListener) {
        this.f58242a = biometricMethod;
        this.f58243c = biometricInitListener;
    }

    public final void run() {
        BiometricAuthentication.m101301init$lambda0(this.f58242a, this.f58243c);
    }
}
