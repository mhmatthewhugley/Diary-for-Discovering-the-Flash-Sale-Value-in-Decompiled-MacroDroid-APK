package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzam implements CapabilityClient.OnCapabilityChangedListener {

    /* renamed from: a */
    final CapabilityClient.OnCapabilityChangedListener f48133a;

    /* renamed from: c */
    final String f48134c;

    /* renamed from: a */
    public final void mo56174a(CapabilityInfo capabilityInfo) {
        this.f48133a.mo56174a(capabilityInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzam.class != obj.getClass()) {
            return false;
        }
        zzam zzam = (zzam) obj;
        if (!this.f48133a.equals(zzam.f48133a)) {
            return false;
        }
        return this.f48134c.equals(zzam.f48134c);
    }

    public final int hashCode() {
        return (this.f48133a.hashCode() * 31) + this.f48134c.hashCode();
    }
}
