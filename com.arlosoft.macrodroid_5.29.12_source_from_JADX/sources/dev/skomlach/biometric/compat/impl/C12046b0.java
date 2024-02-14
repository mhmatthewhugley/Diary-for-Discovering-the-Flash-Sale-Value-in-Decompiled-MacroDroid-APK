package dev.skomlach.biometric.compat.impl;

import dev.skomlach.biometric.compat.impl.SensorBlockedFallbackFragment;

/* renamed from: dev.skomlach.biometric.compat.impl.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12046b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f58263a;

    /* renamed from: c */
    public final /* synthetic */ String f58264c;

    public /* synthetic */ C12046b0(String str, String str2) {
        this.f58263a = str;
        this.f58264c = str2;
    }

    public final void run() {
        SensorBlockedFallbackFragment.Companion.m101334showFragment$lambda2(this.f58263a, this.f58264c);
    }
}
