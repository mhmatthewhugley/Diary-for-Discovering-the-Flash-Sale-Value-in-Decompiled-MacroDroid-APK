package dev.skomlach.biometric.compat.impl;

import java.util.Set;

/* renamed from: dev.skomlach.biometric.compat.impl.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12045b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptApi28Impl f58260a;

    /* renamed from: c */
    public final /* synthetic */ long f58261c;

    /* renamed from: d */
    public final /* synthetic */ Set f58262d;

    public /* synthetic */ C12045b(BiometricPromptApi28Impl biometricPromptApi28Impl, long j, Set set) {
        this.f58260a = biometricPromptApi28Impl;
        this.f58261c = j;
        this.f58262d = set;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101313startAuth$lambda10$lambda9(this.f58260a, this.f58261c, this.f58262d);
    }
}
