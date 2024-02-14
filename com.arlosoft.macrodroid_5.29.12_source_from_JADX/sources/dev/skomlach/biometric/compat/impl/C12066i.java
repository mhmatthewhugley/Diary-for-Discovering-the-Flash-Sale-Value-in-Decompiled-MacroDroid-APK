package dev.skomlach.biometric.compat.impl;

/* renamed from: dev.skomlach.biometric.compat.impl.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12066i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f58300a;

    /* renamed from: c */
    public final /* synthetic */ BiometricPromptApi28Impl f58301c;

    public /* synthetic */ C12066i(int i, BiometricPromptApi28Impl biometricPromptApi28Impl) {
        this.f58300a = i;
        this.f58301c = biometricPromptApi28Impl;
    }

    public final void run() {
        BiometricPromptApi28Impl$authCallback$1.m101315onAuthenticationError$lambda0(this.f58300a, this.f58301c);
    }
}
