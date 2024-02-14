package com.arlosoft.macrodroid.geofences;

import android.content.Context;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.geofences.j */
/* compiled from: GeofenceManager_Factory */
public final class C4718j implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f11856a;

    public C4718j(C12478a<Context> aVar) {
        this.f11856a = aVar;
    }

    /* renamed from: a */
    public static C4718j m18282a(C12478a<Context> aVar) {
        return new C4718j(aVar);
    }

    /* renamed from: c */
    public static C4716i m18283c(C12478a<Context> aVar) {
        return new C4716i(aVar.get());
    }

    /* renamed from: b */
    public C4716i get() {
        return m18283c(this.f11856a);
    }
}
