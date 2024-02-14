package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;

/* renamed from: dev.skomlach.biometric.compat.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12029c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat f58232a;

    /* renamed from: c */
    public final /* synthetic */ BiometricPromptCompat.AuthenticationCallback f58233c;

    public /* synthetic */ C12029c(BiometricPromptCompat biometricPromptCompat, BiometricPromptCompat.AuthenticationCallback authenticationCallback) {
        this.f58232a = biometricPromptCompat;
        this.f58233c = authenticationCallback;
    }

    public final void run() {
        BiometricPromptCompat.m101293startAuth$lambda2(this.f58232a, this.f58233c);
    }
}
