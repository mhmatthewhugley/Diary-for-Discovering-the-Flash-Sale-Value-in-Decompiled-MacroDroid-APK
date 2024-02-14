package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12067j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptGenericImpl f58302a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58303c;

    public /* synthetic */ C12067j(BiometricPromptGenericImpl biometricPromptGenericImpl, AuthResult authResult) {
        this.f58302a = biometricPromptGenericImpl;
        this.f58303c = authResult;
    }

    public final void run() {
        BiometricPromptGenericImpl.m101317checkAuthResult$lambda6$lambda5(this.f58302a, this.f58303c);
    }
}
