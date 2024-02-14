package dev.skomlach.biometric.compat;

/* renamed from: dev.skomlach.biometric.compat.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12028b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat f58231a;

    public /* synthetic */ C12028b(BiometricPromptCompat biometricPromptCompat) {
        this.f58231a = biometricPromptCompat;
    }

    public final void run() {
        BiometricPromptCompat.m101292cancelAuthentication$lambda4$lambda3(this.f58231a);
    }
}
