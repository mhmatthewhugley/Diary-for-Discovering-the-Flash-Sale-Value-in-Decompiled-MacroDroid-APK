package com.arlosoft.macrodroid.geofences;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.geofences.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4710c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceListActivity f11841a;

    /* renamed from: c */
    public final /* synthetic */ GeofenceInfo f11842c;

    public /* synthetic */ C4710c(GeofenceListActivity geofenceListActivity, GeofenceInfo geofenceInfo) {
        this.f11841a = geofenceListActivity;
        this.f11842c = geofenceInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11841a.m18240X1(this.f11842c, dialogInterface, i);
    }
}
