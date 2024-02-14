package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.constraint.n0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4292n0 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceConstraint f10916a;

    public /* synthetic */ C4292n0(GeofenceConstraint geofenceConstraint) {
        this.f10916a = geofenceConstraint;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        GeofenceConstraint.m16509v3(this.f10916a, dialogInterface);
    }
}
