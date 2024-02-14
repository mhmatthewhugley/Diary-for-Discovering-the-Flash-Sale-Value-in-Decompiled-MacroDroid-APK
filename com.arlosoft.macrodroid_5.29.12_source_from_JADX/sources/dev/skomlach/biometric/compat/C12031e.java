package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import kotlin.jvm.internal.C13678a0;

/* renamed from: dev.skomlach.biometric.compat.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12031e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13678a0 f58238a;

    /* renamed from: c */
    public final /* synthetic */ BiometricPromptCompat.AuthenticationCallback f58239c;

    /* renamed from: d */
    public final /* synthetic */ BiometricPromptCompat f58240d;

    public /* synthetic */ C12031e(C13678a0 a0Var, BiometricPromptCompat.AuthenticationCallback authenticationCallback, BiometricPromptCompat biometricPromptCompat) {
        this.f58238a = a0Var;
        this.f58239c = authenticationCallback;
        this.f58240d = biometricPromptCompat;
    }

    public final void run() {
        BiometricPromptCompat.m101290authenticate$lambda1$lambda0(this.f58238a, this.f58239c, this.f58240d);
    }
}
