package dev.skomlach.biometric.compat.impl;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: dev.skomlach.biometric.compat.impl.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12076s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PermissionsFragment f58317a;

    /* renamed from: c */
    public final /* synthetic */ List f58318c;

    /* renamed from: d */
    public final /* synthetic */ int f58319d;

    public /* synthetic */ C12076s(PermissionsFragment permissionsFragment, List list, int i) {
        this.f58317a = permissionsFragment;
        this.f58318c = list;
        this.f58319d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PermissionsFragment.m101329showPermissionDeniedDialog$lambda12$lambda11(this.f58317a, this.f58318c, this.f58319d, dialogInterface, i);
    }
}
