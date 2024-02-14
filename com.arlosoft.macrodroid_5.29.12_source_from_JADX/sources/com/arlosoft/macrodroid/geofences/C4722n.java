package com.arlosoft.macrodroid.geofences;

import android.view.View;

/* renamed from: com.arlosoft.macrodroid.geofences.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4722n implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZonesAdapter f11861a;

    /* renamed from: c */
    public final /* synthetic */ GeofenceInfo f11862c;

    public /* synthetic */ C4722n(ZonesAdapter zonesAdapter, GeofenceInfo geofenceInfo) {
        this.f11861a = zonesAdapter;
        this.f11862c = geofenceInfo;
    }

    public final boolean onLongClick(View view) {
        return this.f11861a.m18253E(this.f11862c, view);
    }
}
