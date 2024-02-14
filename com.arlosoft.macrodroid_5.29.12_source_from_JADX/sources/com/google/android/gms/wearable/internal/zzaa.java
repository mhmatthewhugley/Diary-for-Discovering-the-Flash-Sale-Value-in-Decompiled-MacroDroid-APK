package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzaa implements CapabilityApi.AddLocalCapabilityResult, CapabilityApi.RemoveLocalCapabilityResult {

    /* renamed from: a */
    private final Status f48117a;

    public zzaa(Status status) {
        this.f48117a = status;
    }

    public final Status getStatus() {
        return this.f48117a;
    }
}
