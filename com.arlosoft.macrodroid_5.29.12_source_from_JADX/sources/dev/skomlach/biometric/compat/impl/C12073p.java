package dev.skomlach.biometric.compat.impl;

import java.util.List;

/* renamed from: dev.skomlach.biometric.compat.impl.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12073p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58313a;

    /* renamed from: c */
    public final /* synthetic */ List f58314c;

    public /* synthetic */ C12073p(PermissionsFragment permissionsFragment, List list) {
        this.f58313a = permissionsFragment;
        this.f58314c = list;
    }

    public final void run() {
        PermissionsFragment.m101318onAttach$lambda0(this.f58313a, this.f58314c);
    }
}
