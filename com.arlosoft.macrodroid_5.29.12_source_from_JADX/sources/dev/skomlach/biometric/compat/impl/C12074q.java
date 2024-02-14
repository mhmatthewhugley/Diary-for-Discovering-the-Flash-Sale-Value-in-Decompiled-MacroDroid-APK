package dev.skomlach.biometric.compat.impl;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12074q implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58315a;

    public /* synthetic */ C12074q(PermissionsFragment permissionsFragment) {
        this.f58315a = permissionsFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        PermissionsFragment.m101327showPermissionDeniedDialog$lambda12$lambda10(this.f58315a, dialogInterface);
    }
}
