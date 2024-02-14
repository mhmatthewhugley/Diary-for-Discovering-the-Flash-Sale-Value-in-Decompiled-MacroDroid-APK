package org.altbeacon.beacon.service;

import android.os.Bundle;
import org.altbeacon.beacon.Region;

/* renamed from: org.altbeacon.beacon.service.e */
/* compiled from: MonitoringData */
public class C16014e {

    /* renamed from: a */
    private final boolean f65922a;

    /* renamed from: b */
    private final Region f65923b;

    public C16014e(boolean z, Region region) {
        this.f65922a = z;
        this.f65923b = region;
    }

    /* renamed from: a */
    public static C16014e m96537a(Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        return new C16014e(Boolean.valueOf(bundle.getBoolean("inside")).booleanValue(), bundle.get("region") != null ? (Region) bundle.getSerializable("region") : null);
    }

    /* renamed from: b */
    public Region mo76436b() {
        return this.f65923b;
    }

    /* renamed from: c */
    public boolean mo76437c() {
        return this.f65922a;
    }

    /* renamed from: d */
    public Bundle mo76438d() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", this.f65923b);
        bundle.putBoolean("inside", this.f65922a);
        return bundle;
    }
}
