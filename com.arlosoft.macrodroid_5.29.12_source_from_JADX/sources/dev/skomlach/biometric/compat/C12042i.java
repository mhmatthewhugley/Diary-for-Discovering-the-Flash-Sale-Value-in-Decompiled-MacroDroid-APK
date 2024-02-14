package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.utils.activityView.ActivityViewWatcher;

/* renamed from: dev.skomlach.biometric.compat.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12042i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat f58256a;

    /* renamed from: c */
    public final /* synthetic */ ActivityViewWatcher f58257c;

    public /* synthetic */ C12042i(BiometricPromptCompat biometricPromptCompat, ActivityViewWatcher activityViewWatcher) {
        this.f58256a = biometricPromptCompat;
        this.f58257c = activityViewWatcher;
    }

    public final void run() {
        BiometricPromptCompat$startAuth$1$callback$1.m101300onUIClosed$lambda2(this.f58256a, this.f58257c);
    }
}
