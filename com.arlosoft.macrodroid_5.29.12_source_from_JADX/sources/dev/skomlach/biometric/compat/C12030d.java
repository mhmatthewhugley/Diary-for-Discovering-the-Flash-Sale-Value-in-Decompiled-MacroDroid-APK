package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import kotlin.jvm.internal.C13678a0;

/* renamed from: dev.skomlach.biometric.compat.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12030d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat f58234a;

    /* renamed from: c */
    public final /* synthetic */ C13678a0 f58235c;

    /* renamed from: d */
    public final /* synthetic */ long f58236d;

    /* renamed from: f */
    public final /* synthetic */ BiometricPromptCompat.AuthenticationCallback f58237f;

    public /* synthetic */ C12030d(BiometricPromptCompat biometricPromptCompat, C13678a0 a0Var, long j, BiometricPromptCompat.AuthenticationCallback authenticationCallback) {
        this.f58234a = biometricPromptCompat;
        this.f58235c = a0Var;
        this.f58236d = j;
        this.f58237f = authenticationCallback;
    }

    public final void run() {
        BiometricPromptCompat.m101289authenticate$lambda1(this.f58234a, this.f58235c, this.f58236d, this.f58237f);
    }
}
