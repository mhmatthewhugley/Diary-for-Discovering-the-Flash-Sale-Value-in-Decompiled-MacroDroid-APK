package dev.skomlach.biometric.compat.impl;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dev.skomlach.biometric.compat.impl.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12065h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f58295a;

    /* renamed from: c */
    public final /* synthetic */ Set f58296c;

    /* renamed from: d */
    public final /* synthetic */ long f58297d;

    /* renamed from: f */
    public final /* synthetic */ BiometricPromptApi28Impl f58298f;

    /* renamed from: g */
    public final /* synthetic */ long f58299g;

    public /* synthetic */ C12065h(AtomicBoolean atomicBoolean, Set set, long j, BiometricPromptApi28Impl biometricPromptApi28Impl, long j2) {
        this.f58295a = atomicBoolean;
        this.f58296c = set;
        this.f58297d = j;
        this.f58298f = biometricPromptApi28Impl;
        this.f58299g = j2;
    }

    public final void run() {
        BiometricPromptApi28Impl.m101312startAuth$lambda10(this.f58295a, this.f58296c, this.f58297d, this.f58298f, this.f58299g);
    }
}
