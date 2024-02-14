package org.altbeacon.beacon.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.altbeacon.beacon.Beacon;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.g */
/* compiled from: RangeState */
public class C16016g implements Serializable {

    /* renamed from: a */
    private static boolean f65930a = false;
    private C16010a mCallback;
    private Map<Beacon, C16017h> mRangedBeacons = new HashMap();

    public C16016g(C16010a aVar) {
        this.mCallback = aVar;
    }

    /* renamed from: d */
    public static boolean m96564d() {
        return f65930a;
    }

    /* renamed from: e */
    public static void m96565e(boolean z) {
        f65930a = z;
    }

    /* renamed from: a */
    public void mo76457a(Beacon beacon) {
        C16017h hVar = this.mRangedBeacons.get(beacon);
        if (hVar != null) {
            if (C7354d.m30380e()) {
                C7354d.m30376a("RangeState", "adding %s to existing range for: %s", beacon, hVar);
            }
            hVar.mo76468j(beacon);
            return;
        }
        if (C7354d.m30380e()) {
            C7354d.m30376a("RangeState", "adding %s to new rangedBeacon", beacon);
        }
        this.mRangedBeacons.put(beacon, new C16017h(beacon));
    }

    /* renamed from: b */
    public synchronized Collection<Beacon> mo76458b() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        arrayList = new ArrayList();
        synchronized (this.mRangedBeacons) {
            for (Beacon next : this.mRangedBeacons.keySet()) {
                C16017h hVar = this.mRangedBeacons.get(next);
                if (hVar != null) {
                    if (hVar.mo76465g()) {
                        hVar.mo76461b();
                        if (!hVar.mo76466h()) {
                            arrayList.add(hVar.mo76462c());
                        }
                    }
                    if (!hVar.mo76466h()) {
                        if (!f65930a || hVar.mo76464f()) {
                            hVar.mo76467i(false);
                        }
                        hashMap.put(next, hVar);
                    } else {
                        C7354d.m30376a("RangeState", "Dumping beacon from RangeState because it has no recent measurements.", new Object[0]);
                    }
                }
            }
            this.mRangedBeacons = hashMap;
        }
        return arrayList;
    }

    /* renamed from: c */
    public C16010a mo76459c() {
        return this.mCallback;
    }
}
