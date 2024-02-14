package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzaj implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzaj f48128a = new zzaj();

    private /* synthetic */ zzaj() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return ((CapabilityApi.GetAllCapabilitiesResult) result).mo56175V1();
    }
}
