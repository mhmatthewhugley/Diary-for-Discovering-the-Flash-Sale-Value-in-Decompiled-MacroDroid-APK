package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.os.IBinder;

/* renamed from: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12037a implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ MiuiFaceManagerImpl f58250a;

    public /* synthetic */ C12037a(MiuiFaceManagerImpl miuiFaceManagerImpl) {
        this.f58250a = miuiFaceManagerImpl;
    }

    public final void binderDied() {
        MiuiFaceManagerImpl.m101305mBinderDied$lambda2(this.f58250a);
    }
}
