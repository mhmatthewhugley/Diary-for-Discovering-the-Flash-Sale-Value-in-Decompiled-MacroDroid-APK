package dev.skomlach.biometric.compat.impl;

import kotlin.jvm.internal.C13684d0;

/* renamed from: dev.skomlach.biometric.compat.impl.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12063f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptApi28Impl f58288a;

    /* renamed from: c */
    public final /* synthetic */ AuthResult f58289c;

    /* renamed from: d */
    public final /* synthetic */ AuthResult f58290d;

    /* renamed from: f */
    public final /* synthetic */ C13684d0 f58291f;

    public /* synthetic */ C12063f(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult, AuthResult authResult2, C13684d0 d0Var) {
        this.f58288a = biometricPromptApi28Impl;
        this.f58289c = authResult;
        this.f58290d = authResult2;
        this.f58291f = d0Var;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101307checkAuthResultForPrimary$lambda26(this.f58288a, this.f58289c, this.f58290d, this.f58291f);
    }
}
