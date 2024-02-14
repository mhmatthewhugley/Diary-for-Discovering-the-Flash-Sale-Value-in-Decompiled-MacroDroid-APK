package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.NodeApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzgh implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzgh f48335a = new zzgh();

    private /* synthetic */ zzgh() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return ((NodeApi.GetLocalNodeResult) result).mo56225D0();
    }
}
