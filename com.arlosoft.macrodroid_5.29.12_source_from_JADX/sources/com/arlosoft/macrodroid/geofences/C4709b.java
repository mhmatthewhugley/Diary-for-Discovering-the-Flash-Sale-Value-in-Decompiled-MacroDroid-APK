package com.arlosoft.macrodroid.geofences;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.geofences.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4709b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceListActivity f11839a;

    /* renamed from: c */
    public final /* synthetic */ GeofenceInfo f11840c;

    public /* synthetic */ C4709b(GeofenceListActivity geofenceListActivity, GeofenceInfo geofenceInfo) {
        this.f11839a = geofenceListActivity;
        this.f11840c = geofenceInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11839a.m18241Y1(this.f11840c, dialogInterface, i);
    }
}
