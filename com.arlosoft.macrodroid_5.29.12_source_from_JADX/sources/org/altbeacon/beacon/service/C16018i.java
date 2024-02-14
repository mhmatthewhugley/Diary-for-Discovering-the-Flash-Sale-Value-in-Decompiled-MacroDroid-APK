package org.altbeacon.beacon.service;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;

/* renamed from: org.altbeacon.beacon.service.i */
/* compiled from: RangingData */
public class C16018i {

    /* renamed from: a */
    private final Collection<Beacon> f65933a;

    /* renamed from: b */
    private final Region f65934b;

    public C16018i(Collection<Beacon> collection, Region region) {
        synchronized (collection) {
            this.f65933a = collection;
        }
        this.f65934b = region;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.C16018i m96579a(android.os.Bundle r4) {
        /*
            java.lang.Class<org.altbeacon.beacon.Region> r0 = org.altbeacon.beacon.Region.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r0 = "beacons"
            java.lang.Object r1 = r4.get(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.io.Serializable r0 = r4.getSerializable(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            java.lang.String r1 = "region"
            java.lang.Object r3 = r4.get(r1)
            if (r3 == 0) goto L_0x0029
            java.io.Serializable r4 = r4.getSerializable(r1)
            r2 = r4
            org.altbeacon.beacon.Region r2 = (org.altbeacon.beacon.Region) r2
        L_0x0029:
            org.altbeacon.beacon.service.i r4 = new org.altbeacon.beacon.service.i
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16018i.m96579a(android.os.Bundle):org.altbeacon.beacon.service.i");
    }

    /* renamed from: b */
    public Collection<Beacon> mo76469b() {
        return this.f65933a;
    }

    /* renamed from: c */
    public Region mo76470c() {
        return this.f65934b;
    }

    /* renamed from: d */
    public Bundle mo76471d() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", this.f65934b);
        ArrayList arrayList = new ArrayList();
        for (Beacon add : this.f65933a) {
            arrayList.add(add);
        }
        bundle.putSerializable("beacons", arrayList);
        return bundle;
    }
}
