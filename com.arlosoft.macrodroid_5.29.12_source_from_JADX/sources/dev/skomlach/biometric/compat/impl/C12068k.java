package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12068k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptGenericImpl f58304a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58305c;

    /* renamed from: d */
    public final /* synthetic */ AuthResult f58306d;

    public /* synthetic */ C12068k(BiometricPromptGenericImpl biometricPromptGenericImpl, AuthResult authResult, AuthResult authResult2) {
        this.f58304a = biometricPromptGenericImpl;
        this.f58305c = authResult;
        this.f58306d = authResult2;
    }

    public final void run() {
        BiometricPromptGenericImpl.m101316checkAuthResult$lambda6(this.f58304a, this.f58305c, this.f58306d);
    }
}
