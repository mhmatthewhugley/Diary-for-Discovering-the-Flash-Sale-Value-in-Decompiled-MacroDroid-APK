package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzfp implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzfp f48308a = new zzfp();

    private /* synthetic */ zzfp() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return Integer.valueOf(((MessageApi.SendMessageResult) result).mo56212f());
    }
}
