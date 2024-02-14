package dev.skomlach.biometric.compat.impl;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: dev.skomlach.biometric.compat.impl.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12071n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58309a;

    /* renamed from: c */
    public final /* synthetic */ ListenableFuture f58310c;

    public /* synthetic */ C12071n(PermissionsFragment permissionsFragment, ListenableFuture listenableFuture) {
        this.f58309a = permissionsFragment;
        this.f58310c = listenableFuture;
    }

    public final void run() {
        PermissionsFragment.m101322showMandatoryPermissionsNeedDialog$lambda13(this.f58309a, this.f58310c);
    }
}
