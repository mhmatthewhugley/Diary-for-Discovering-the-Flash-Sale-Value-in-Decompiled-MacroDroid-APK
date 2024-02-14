package com.arlosoft.macrodroid.geofences;

import android.view.View;

/* renamed from: com.arlosoft.macrodroid.geofences.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4721m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZonesAdapter f11859a;

    /* renamed from: c */
    public final /* synthetic */ GeofenceInfo f11860c;

    public /* synthetic */ C4721m(ZonesAdapter zonesAdapter, GeofenceInfo geofenceInfo) {
        this.f11859a = zonesAdapter;
        this.f11860c = geofenceInfo;
    }

    public final void onClick(View view) {
        this.f11859a.m18252D(this.f11860c, view);
    }
}
