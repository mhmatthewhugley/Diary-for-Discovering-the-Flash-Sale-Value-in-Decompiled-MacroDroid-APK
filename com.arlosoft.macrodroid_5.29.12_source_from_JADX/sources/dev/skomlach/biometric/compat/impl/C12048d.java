package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12048d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptApi28Impl f58267a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58268c;

    public /* synthetic */ C12048d(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult) {
        this.f58267a = biometricPromptApi28Impl;
        this.f58268c = authResult;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101310checkAuthResultForSecondary$lambda33$lambda32(this.f58267a, this.f58268c);
    }
}
