package dev.skomlach.biometric.compat.impl;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dev.skomlach.biometric.compat.impl.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12064g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f58292a;

    /* renamed from: c */
    public final /* synthetic */ BiometricPromptApi28Impl f58293c;

    /* renamed from: d */
    public final /* synthetic */ Set f58294d;

    public /* synthetic */ C12064g(AtomicBoolean atomicBoolean, BiometricPromptApi28Impl biometricPromptApi28Impl, Set set) {
        this.f58292a = atomicBoolean;
        this.f58293c = biometricPromptApi28Impl;
        this.f58294d = set;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101314startAuth$lambda10$lambda9$lambda8(this.f58292a, this.f58293c, this.f58294d);
    }
}
