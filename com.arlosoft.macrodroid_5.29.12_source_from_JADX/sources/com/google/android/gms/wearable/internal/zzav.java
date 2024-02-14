package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzav implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzav f48146a = new zzav();

    private /* synthetic */ zzav() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return zzbd.m66912I(((ChannelApi.OpenChannelResult) result).getChannel());
    }
}
