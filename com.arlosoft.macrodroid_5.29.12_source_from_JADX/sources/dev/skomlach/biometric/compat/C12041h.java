package dev.skomlach.biometric.compat;

/* renamed from: dev.skomlach.biometric.compat.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12041h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat$fragmentLifecycleCallbacks$1 f58254a;

    /* renamed from: c */
    public final /* synthetic */ BiometricPromptCompat f58255c;

    public /* synthetic */ C12041h(BiometricPromptCompat$fragmentLifecycleCallbacks$1 biometricPromptCompat$fragmentLifecycleCallbacks$1, BiometricPromptCompat biometricPromptCompat) {
        this.f58254a = biometricPromptCompat$fragmentLifecycleCallbacks$1;
        this.f58255c = biometricPromptCompat;
    }

    public final void run() {
        BiometricPromptCompat$fragmentLifecycleCallbacks$1.m101299dismissTask$lambda0(this.f58254a, this.f58255c);
    }
}
