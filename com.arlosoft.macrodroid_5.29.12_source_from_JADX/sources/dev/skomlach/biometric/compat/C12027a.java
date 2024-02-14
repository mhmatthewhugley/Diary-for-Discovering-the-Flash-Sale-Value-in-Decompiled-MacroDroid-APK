package dev.skomlach.biometric.compat;

/* renamed from: dev.skomlach.biometric.compat.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12027a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat f58230a;

    public /* synthetic */ C12027a(BiometricPromptCompat biometricPromptCompat) {
        this.f58230a = biometricPromptCompat;
    }

    public final void run() {
        BiometricPromptCompat.m101291cancelAuthentication$lambda4(this.f58230a);
    }
}
