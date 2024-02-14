package dev.skomlach.biometric.compat.impl;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: dev.skomlach.biometric.compat.impl.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12072o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58311a;

    /* renamed from: c */
    public final /* synthetic */ ListenableFuture f58312c;

    public /* synthetic */ C12072o(PermissionsFragment permissionsFragment, ListenableFuture listenableFuture) {
        this.f58311a = permissionsFragment;
        this.f58312c = listenableFuture;
    }

    public final void run() {
        PermissionsFragment.m101326showMandatoryPermissionsNeedDialog$lambda18$lambda17$lambda16(this.f58311a, this.f58312c);
    }
}
