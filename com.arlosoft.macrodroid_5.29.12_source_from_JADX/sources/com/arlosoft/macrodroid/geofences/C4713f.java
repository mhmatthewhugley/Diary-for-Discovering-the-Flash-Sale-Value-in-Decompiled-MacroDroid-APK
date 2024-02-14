package com.arlosoft.macrodroid.geofences;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.arlosoft.macrodroid.geofences.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4713f implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceInfo f11846a;

    /* renamed from: b */
    public final /* synthetic */ String f11847b;

    public /* synthetic */ C4713f(GeofenceInfo geofenceInfo, String str) {
        this.f11846a = geofenceInfo;
        this.f11847b = str;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        C4716i.m18275q(this.f11846a, this.f11847b, exc);
    }
}
