package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.Channel;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzaw implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public static final /* synthetic */ zzaw f48147a = new zzaw();

    private /* synthetic */ zzaw() {
    }

    /* renamed from: a */
    public final Object mo20769a(Result result) {
        return ((Channel.GetInputStreamResult) result).getInputStream();
    }
}
