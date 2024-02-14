package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzab implements CapabilityApi.CapabilityListener {

    /* renamed from: a */
    final CapabilityApi.CapabilityListener f48118a;

    /* renamed from: c */
    final String f48119c;

    /* renamed from: a */
    public final void mo56174a(CapabilityInfo capabilityInfo) {
        this.f48118a.mo56174a(capabilityInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzab.class != obj.getClass()) {
            return false;
        }
        zzab zzab = (zzab) obj;
        if (!this.f48118a.equals(zzab.f48118a)) {
            return false;
        }
        return this.f48119c.equals(zzab.f48119c);
    }

    public final int hashCode() {
        return (this.f48118a.hashCode() * 31) + this.f48119c.hashCode();
    }
}
