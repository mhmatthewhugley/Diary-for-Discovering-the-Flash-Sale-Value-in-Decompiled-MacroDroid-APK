package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzcx implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzcx f48228a = new zzcx();

    private /* synthetic */ zzcx() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return new zzda((DataApi.GetFdForAssetResult) result);
    }
}