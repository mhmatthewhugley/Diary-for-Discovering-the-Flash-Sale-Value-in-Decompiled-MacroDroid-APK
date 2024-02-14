package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzad implements CapabilityApi.GetAllCapabilitiesResult {

    /* renamed from: a */
    private final Status f48122a;

    /* renamed from: c */
    private final Map f48123c;

    public zzad(Status status, Map map) {
        this.f48122a = status;
        this.f48123c = map;
    }

    /* renamed from: V1 */
    public final Map<String, CapabilityInfo> mo56175V1() {
        return this.f48123c;
    }

    public final Status getStatus() {
        return this.f48122a;
    }
}
