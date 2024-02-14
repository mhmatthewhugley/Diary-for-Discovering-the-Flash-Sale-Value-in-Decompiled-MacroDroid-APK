package dev.skomlach.biometric.compat.impl;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12075r implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58316a;

    public /* synthetic */ C12075r(PermissionsFragment permissionsFragment) {
        this.f58316a = permissionsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PermissionsFragment.m101325showMandatoryPermissionsNeedDialog$lambda18$lambda17(this.f58316a, dialogInterface, i);
    }
}
