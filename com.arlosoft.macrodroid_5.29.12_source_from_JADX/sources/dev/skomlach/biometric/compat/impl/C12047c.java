package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12047c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptApi28Impl f58265a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58266c;

    public /* synthetic */ C12047c(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult) {
        this.f58265a = biometricPromptApi28Impl;
        this.f58266c = authResult;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101308checkAuthResultForPrimary$lambda26$lambda25(this.f58265a, this.f58266c);
    }
}
