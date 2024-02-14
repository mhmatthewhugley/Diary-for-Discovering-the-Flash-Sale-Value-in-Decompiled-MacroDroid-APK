package org.altbeacon.beacon.service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import org.altbeacon.beacon.Beacon;

/* renamed from: org.altbeacon.beacon.service.c */
/* compiled from: ExtraDataBeaconTracker */
public class C16012c implements Serializable {
    @NonNull
    private final HashMap<String, HashMap<Integer, Beacon>> mBeaconsByKey;
    private final boolean matchBeaconsByServiceUUID;

    public C16012c() {
        this(true);
    }

    /* renamed from: a */
    private String m96533a(@NonNull Beacon beacon) {
        if (!this.matchBeaconsByServiceUUID) {
            return beacon.mo37946b();
        }
        return beacon.mo37946b() + beacon.mo37957m();
    }

    @Nullable
    /* renamed from: c */
    private Beacon m96534c(@NonNull Beacon beacon) {
        if (beacon.mo37958n()) {
            m96535d(beacon);
            return null;
        }
        String a = m96533a(beacon);
        HashMap hashMap = this.mBeaconsByKey.get(a);
        if (hashMap == null) {
            hashMap = new HashMap();
        } else {
            beacon.mo37960r(((Beacon) hashMap.values().iterator().next()).mo37950f());
        }
        hashMap.put(Integer.valueOf(beacon.hashCode()), beacon);
        this.mBeaconsByKey.put(a, hashMap);
        return beacon;
    }

    /* renamed from: d */
    private void m96535d(@NonNull Beacon beacon) {
        HashMap hashMap = this.mBeaconsByKey.get(m96533a(beacon));
        if (hashMap != null) {
            for (Beacon beacon2 : hashMap.values()) {
                beacon2.mo37965x(beacon.mo37956l());
                beacon2.mo37960r(beacon.mo37947c());
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public synchronized Beacon mo76435b(@NonNull Beacon beacon) {
        if (beacon.mo37959p() || beacon.mo37957m() != -1) {
            beacon = m96534c(beacon);
        }
        return beacon;
    }

    public C16012c(boolean z) {
        this.mBeaconsByKey = new HashMap<>();
        this.matchBeaconsByServiceUUID = z;
    }
}
