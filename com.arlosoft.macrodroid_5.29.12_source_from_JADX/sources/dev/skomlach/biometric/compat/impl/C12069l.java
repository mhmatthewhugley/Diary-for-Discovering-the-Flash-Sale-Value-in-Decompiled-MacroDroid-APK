package dev.skomlach.biometric.compat.impl;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12069l implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58307a;

    public /* synthetic */ C12069l(PermissionsFragment permissionsFragment) {
        this.f58307a = permissionsFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        PermissionsFragment.m101323showMandatoryPermissionsNeedDialog$lambda18$lambda15(this.f58307a, dialogInterface);
    }
}
