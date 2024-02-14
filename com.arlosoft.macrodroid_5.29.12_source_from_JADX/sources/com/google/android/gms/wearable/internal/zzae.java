package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzae implements CapabilityApi.GetCapabilityResult {

    /* renamed from: a */
    private final CapabilityInfo f48124a;

    /* renamed from: c */
    private final Status f48125c;

    public zzae(Status status, CapabilityInfo capabilityInfo) {
        this.f48125c = status;
        this.f48124a = capabilityInfo;
    }

    /* renamed from: B0 */
    public final CapabilityInfo mo56176B0() {
        return this.f48124a;
    }

    public final Status getStatus() {
        return this.f48125c;
    }
}
