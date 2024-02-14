package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12062e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptApi28Impl f58285a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58286c;

    /* renamed from: d */
    public final /* synthetic */ AuthResult f58287d;

    public /* synthetic */ C12062e(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult, AuthResult authResult2) {
        this.f58285a = biometricPromptApi28Impl;
        this.f58286c = authResult;
        this.f58287d = authResult2;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101309checkAuthResultForSecondary$lambda33(this.f58285a, this.f58286c, this.f58287d);
    }
}
